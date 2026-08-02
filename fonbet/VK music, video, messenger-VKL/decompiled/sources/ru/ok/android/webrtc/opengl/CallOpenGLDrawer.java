package ru.ok.android.webrtc.opengl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* loaded from: classes9.dex */
public abstract class CallOpenGLDrawer {
    public EGLSurface a = EGL14.EGL_NO_SURFACE;

    public abstract CallRenderereStatistics getStatistics$webrtc_android_sdk_release();

    public final EGLSurface getSurface$webrtc_android_sdk_release() {
        return this.a;
    }

    public abstract void onInitialize$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext, Object obj);

    public abstract void onRelease$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext);

    public abstract void render$webrtc_android_sdk_release(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext);

    public final void setSurface$webrtc_android_sdk_release(EGLSurface eGLSurface) {
        this.a = eGLSurface;
    }

    public static /* synthetic */ void getSurface$webrtc_android_sdk_release$annotations() {
    }
}
