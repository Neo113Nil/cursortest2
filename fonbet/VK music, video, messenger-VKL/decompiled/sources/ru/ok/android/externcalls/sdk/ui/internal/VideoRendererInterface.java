package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: VideoRendererInterface.kt */
/* loaded from: classes9.dex */
public interface VideoRendererInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: VideoRendererInterface.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final VideoRendererInterface createRenderer(String str) {
            return new VoipVideoRenderer(str);
        }
    }

    /* compiled from: VideoRendererInterface.kt */
    public interface FrameSizeListener {
        void onFrame(int i, int i2);
    }

    void addFrameSizeListener(FrameSizeListener frameSizeListener);

    void clearImage();

    void createEglSurface(Surface surface);

    void disableFpsReduction();

    void init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.GlDrawer glDrawer);

    void onFrame(VideoFrame videoFrame);

    void pauseVideo();

    void release();

    void releaseEglSurface(gzs<s3q0> gzsVar);

    void removeFrameSizeListener(FrameSizeListener frameSizeListener);

    void setFpsReduction(float f);

    void setLayoutAspectRatio(float f);

    void setMirror(boolean z);
}
