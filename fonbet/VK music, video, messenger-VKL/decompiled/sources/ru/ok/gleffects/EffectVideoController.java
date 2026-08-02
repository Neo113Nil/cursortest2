package ru.ok.gleffects;

import java.io.File;

/* loaded from: classes9.dex */
public interface EffectVideoController {

    public interface OnFirstFrameListener {
        void onFirstFrame(int i);
    }

    public enum RenderMode {
        DEFAULT_VIDEO,
        DUET_VIDEO,
        UGC_BACKGROUND_VIDEO,
        CELEBRITY_CALL_VIDEO,
        EPICA_VIDEO
    }

    void addOnFirstFrameListener(OnFirstFrameListener onFirstFrameListener);

    void clear();

    void controlVideo(int i, int i2, int i3, int i4, File file, RenderMode renderMode);

    void interrupt();

    void onRender();

    void registerGalleryVideoPath(String str);

    void removeOnFirstFrameListener(OnFirstFrameListener onFirstFrameListener);

    void setDuetSpeed(float f, boolean z);

    void setPlayWhenReady(boolean z);
}
