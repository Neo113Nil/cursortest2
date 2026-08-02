package ru.ok.android.externcalls.sdk.audio;

import org.webrtc.PeerConnectionFactory;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import xsna.izs;
import xsna.ozl;

/* compiled from: NoiseSuppressionManager.kt */
/* loaded from: classes9.dex */
public interface NoiseSuppressionManager {
    NoiseSuppressorActiveState getNsActiveState();

    void setNoiseSuppressionParams(izs<? super NoiseSuppressorActiveState.Builder, NoiseSuppressorActiveState> izsVar);

    @ozl
    void setNoiseSuppressorParams(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable);
}
