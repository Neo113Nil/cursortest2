package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;
import ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.opengl.CallVideoFrameDrawer;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: VoipVideoRenderer.kt */
/* loaded from: classes9.dex */
public final class VoipVideoRenderer implements VideoRendererInterface {
    private final CallVideoFrameDrawer callVideoDrawer;
    private final CopyOnWriteArrayList<VideoRendererInterface.FrameSizeListener> listeners = new CopyOnWriteArrayList<>();
    private final CallVideoFrameDrawer.FrameListener drawerListener = new CallVideoFrameDrawer.FrameListener() { // from class: xsna.o3x0
        @Override // ru.ok.android.webrtc.opengl.CallVideoFrameDrawer.FrameListener
        public final void onFrame(int i, int i2) {
            VoipVideoRenderer.drawerListener$lambda$0(VoipVideoRenderer.this, i, i2);
        }
    };

    public VoipVideoRenderer(String str) {
        this.callVideoDrawer = new CallVideoFrameDrawer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawerListener$lambda$0(VoipVideoRenderer voipVideoRenderer, int i, int i2) {
        Iterator<T> it = voipVideoRenderer.listeners.iterator();
        while (it.hasNext()) {
            ((VideoRendererInterface.FrameSizeListener) it.next()).onFrame(i, i2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void addFrameSizeListener(VideoRendererInterface.FrameSizeListener frameSizeListener) {
        this.listeners.add(frameSizeListener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void clearImage() {
        this.callVideoDrawer.clearImage();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void createEglSurface(Surface surface) {
        this.callVideoDrawer.createEglSurface(surface);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.GlDrawer glDrawer) {
        this.callVideoDrawer.init(callOpenGLRenderer, glDrawer);
        this.callVideoDrawer.addFrameListener(this.drawerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void onFrame(VideoFrame videoFrame) {
        this.callVideoDrawer.onFrame(videoFrame);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void pauseVideo() {
        setFpsReduction(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void release() {
        this.callVideoDrawer.removeFrameListener(this.drawerListener);
        this.callVideoDrawer.release();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void releaseEglSurface(gzs<s3q0> gzsVar) {
        this.callVideoDrawer.releaseEglSurface(gzsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void removeFrameSizeListener(VideoRendererInterface.FrameSizeListener frameSizeListener) {
        this.listeners.remove(frameSizeListener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setFpsReduction(float f) {
        this.callVideoDrawer.setFpsReduction(f);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setLayoutAspectRatio(float f) {
        this.callVideoDrawer.setLayoutAspectRatio(f);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setMirror(boolean z) {
        this.callVideoDrawer.setMirror(z);
    }
}
