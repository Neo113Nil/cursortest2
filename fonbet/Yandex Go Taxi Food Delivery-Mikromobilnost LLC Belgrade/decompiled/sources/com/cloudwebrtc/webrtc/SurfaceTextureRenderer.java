package com.cloudwebrtc.webrtc;

import android.view.Surface;
import defpackage.lnv0;
import defpackage.wuy0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* loaded from: classes10.dex */
public class SurfaceTextureRenderer extends EglRenderer {
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock;
    private TextureRegistry$SurfaceProducer producer;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private Surface surface;

    public SurfaceTextureRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
        this.surface = null;
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            try {
                if (this.isRenderingPaused) {
                    return;
                }
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    this.rotatedFrameHeight = rotatedHeight;
                    this.producer.setSize(this.rotatedFrameWidth, rotatedHeight);
                    this.frameRotation = videoFrame.getRotation();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = -1;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.surface == null) {
            this.producer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            Surface surface = this.producer.getSurface();
            this.surface = surface;
            createEglSurface(surface);
        }
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = f == 0.0f;
        }
        super.setFpsReduction(f);
    }

    public void surfaceCreated(TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        ThreadUtils.checkIsOnMainThread();
        this.producer = textureRegistry$SurfaceProducer;
        textureRegistry$SurfaceProducer.setCallback(new wuy0() { // from class: com.cloudwebrtc.webrtc.SurfaceTextureRenderer.1
            @Override // defpackage.wuy0
            public void onSurfaceAvailable() {
            }

            @Override // defpackage.wuy0
            public void onSurfaceCleanup() {
                onSurfaceDestroyed();
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.27")
            public /* bridge */ /* synthetic */ void onSurfaceCreated() {
            }

            @Override // defpackage.wuy0
            public void onSurfaceDestroyed() {
                SurfaceTextureRenderer.this.surfaceDestroyed();
            }
        });
    }

    public void surfaceDestroyed() {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new lnv0(15, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.surface = null;
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
