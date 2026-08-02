package com.cloudwebrtc.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import defpackage.kbs;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes10.dex */
public class OrientationAwareScreenCapturer implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isPortrait;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private int oldHeight;
    private int oldWidth;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;
    private WindowManager windowManager;
    private long numCapturedFrames = 0;
    private boolean isDisposed = false;

    public OrientationAwareScreenCapturer(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            kbs.g("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private boolean isDeviceOrientationPortrait() {
        int rotation = this.windowManager.getDefaultDisplay().getRotation();
        return (rotation == 1 || rotation == 3) ? false : true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        try {
            checkNotDisposed();
            if (this.oldWidth == i) {
                if (this.oldHeight != i2) {
                }
            }
            this.oldWidth = i;
            this.oldHeight = i2;
            if (i2 > i) {
                ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (OrientationAwareScreenCapturer.this.virtualDisplay == null || OrientationAwareScreenCapturer.this.surfaceTextureHelper == null) {
                            return;
                        }
                        OrientationAwareScreenCapturer.this.virtualDisplay.setSurface(new Surface(OrientationAwareScreenCapturer.this.surfaceTextureHelper.getSurfaceTexture()));
                        OrientationAwareScreenCapturer.this.surfaceTextureHelper.setTextureSize(OrientationAwareScreenCapturer.this.oldWidth, OrientationAwareScreenCapturer.this.oldHeight);
                        OrientationAwareScreenCapturer.this.virtualDisplay.resize(OrientationAwareScreenCapturer.this.oldWidth, OrientationAwareScreenCapturer.this.oldHeight, 400);
                    }
                });
            }
            int i4 = this.oldWidth;
            int i5 = this.oldHeight;
            if (i4 > i5) {
                this.surfaceTextureHelper.setTextureSize(i4, i5);
                this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ThreadUtils.invokeAtFrontUninterruptibly(OrientationAwareScreenCapturer.this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (OrientationAwareScreenCapturer.this.virtualDisplay == null || OrientationAwareScreenCapturer.this.surfaceTextureHelper == null) {
                                    return;
                                }
                                OrientationAwareScreenCapturer.this.virtualDisplay.resize(OrientationAwareScreenCapturer.this.oldWidth, OrientationAwareScreenCapturer.this.oldHeight, 400);
                            }
                        });
                    }
                }, 700L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.windowManager = (WindowManager) context.getSystemService("window");
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        checkNotDisposed();
        this.isPortrait = isDeviceOrientationPortrait();
        int max = Math.max(this.height, this.width);
        int min = Math.min(this.height, this.width);
        if (this.isPortrait) {
            changeCaptureFormat(min, max, 15);
        } else {
            changeCaptureFormat(max, min, 15);
        }
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        try {
            boolean isDeviceOrientationPortrait = isDeviceOrientationPortrait();
            this.isPortrait = isDeviceOrientationPortrait;
            if (isDeviceOrientationPortrait) {
                this.width = i;
                this.height = i2;
            } else {
                this.height = i;
                this.width = i2;
            }
            MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
            this.mediaProjection = mediaProjection;
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            this.surfaceTextureHelper.startListening(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.cloudwebrtc.webrtc.OrientationAwareScreenCapturer.1
            @Override // java.lang.Runnable
            public void run() {
                OrientationAwareScreenCapturer.this.surfaceTextureHelper.stopListening();
                OrientationAwareScreenCapturer.this.capturerObserver.onCapturerStopped();
                if (OrientationAwareScreenCapturer.this.virtualDisplay != null) {
                    OrientationAwareScreenCapturer.this.virtualDisplay.release();
                    OrientationAwareScreenCapturer.this.virtualDisplay = null;
                }
                if (OrientationAwareScreenCapturer.this.mediaProjection != null) {
                    OrientationAwareScreenCapturer.this.mediaProjection.unregisterCallback(OrientationAwareScreenCapturer.this.mediaProjectionCallback);
                    OrientationAwareScreenCapturer.this.mediaProjection.stop();
                    OrientationAwareScreenCapturer.this.mediaProjection = null;
                }
            }
        });
    }
}
