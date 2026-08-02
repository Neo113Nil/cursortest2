package ru.ok.android.externcalls.sdk.ui;

import org.webrtc.RendererCommon;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.ozl;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: RendererView.kt */
/* loaded from: classes11.dex */
public interface RendererView {
    static /* synthetic */ boolean init$default(RendererView rendererView, CallOpenGLRenderer callOpenGLRenderer, RendererCommon.RendererEvents rendererEvents, FrameDecorator frameDecorator, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 4) != 0) {
            frameDecorator = FrameDecorator.Companion.getEMPTY();
        }
        return rendererView.init(callOpenGLRenderer, rendererEvents, frameDecorator);
    }

    boolean getHasImage();

    boolean getUseAlternateLayout();

    @ozl
    boolean init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.RendererEvents rendererEvents, RendererCommon.GlDrawer glDrawer);

    boolean init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.RendererEvents rendererEvents, FrameDecorator frameDecorator);

    void release();

    void setFrameDecorator(FrameDecorator frameDecorator);

    void setFrameSizeListener(wzs<? super Integer, ? super Integer, s3q0> wzsVar);

    void setRenderEventsListener(RendererCommon.RendererEvents rendererEvents);

    void setScalingType(RendererCommon.ScalingType scalingType);

    void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2);

    void setUseAlternateLayout(boolean z);

    default void clearImage() {
    }

    default void setMirror(boolean z) {
    }
}
