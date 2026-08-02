package ru.ok.call_effects.internal.mirroring;

import ru.ok.call_effects.CallEffects;

/* compiled from: mirroring.kt */
/* loaded from: classes9.dex */
public final class MirroringKt {
    public static final boolean shouldMirrorEffect(CallEffects.Frame frame, CallEffects.MirroringParameters mirroringParameters) {
        if (frame.isFrontCamera() && mirroringParameters.getShouldMirrorFrontCameraEffect()) {
            return true;
        }
        return !frame.isFrontCamera() && mirroringParameters.getShouldMirrorBackCameraEffect();
    }

    public static final boolean shouldMirrorFrame(CallEffects.Frame frame, CallEffects.MirroringParameters mirroringParameters) {
        if (frame.isFrontCamera() && mirroringParameters.getShouldMirrorFrontCameraFrame()) {
            return true;
        }
        return !frame.isFrontCamera() && mirroringParameters.getShouldMirrorBackCameraFrame();
    }
}
