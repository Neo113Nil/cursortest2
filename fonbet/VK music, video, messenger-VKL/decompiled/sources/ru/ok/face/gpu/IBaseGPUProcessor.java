package ru.ok.face.gpu;

import ru.ok.gpu.GlThreadWithSharedContext;

/* loaded from: classes9.dex */
public interface IBaseGPUProcessor {
    default boolean isGPUInited() {
        return false;
    }

    void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext);
}
