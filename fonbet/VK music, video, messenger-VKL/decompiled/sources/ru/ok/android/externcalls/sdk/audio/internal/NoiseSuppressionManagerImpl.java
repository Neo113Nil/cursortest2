package ru.ok.android.externcalls.sdk.audio.internal;

import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import xsna.izs;

/* compiled from: NoiseSuppressionManagerImpl.kt */
/* loaded from: classes9.dex */
public final class NoiseSuppressionManagerImpl implements NoiseSuppressionManager {
    private final Call call;

    public NoiseSuppressionManagerImpl(Call call) {
        this.call = call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoiseSuppressorActiveState setNoiseSuppressorParams$lambda$0(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable, NoiseSuppressorActiveState.Builder builder) {
        return builder.setServersideBasic(z).setServersideAnn(z2).setClientsidePlatform(z3).setClientsideAnn(z4).setEnhancerKind(enhancerKind).setFilePath(str).setInputSampleRate(i).setOutputSampleRate(i2).setFallbackTimeLimitMillis(i3).setFallbackStutterCountMillis(i4).setFallbackTimeframeMillis(i5).setLogTimings(z5).setonNoiseSuppressorDisabledDueToStutter(runnable).build();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public NoiseSuppressorActiveState getNsActiveState() {
        return this.call.getNoiseSuppressorState();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public void setNoiseSuppressionParams(izs<? super NoiseSuppressorActiveState.Builder, NoiseSuppressorActiveState> izsVar) {
        this.call.setNoiseSuppressorParams(izsVar.invoke(new NoiseSuppressorActiveState.Builder()));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public void setNoiseSuppressorParams(final boolean z, final boolean z2, final boolean z3, final boolean z4, final PeerConnectionFactory.EnhancerKind enhancerKind, final String str, final int i, final int i2, final int i3, final int i4, final int i5, final boolean z5, final Runnable runnable) {
        setNoiseSuppressionParams(new izs() { // from class: xsna.j570
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                NoiseSuppressorActiveState noiseSuppressorParams$lambda$0;
                noiseSuppressorParams$lambda$0 = NoiseSuppressionManagerImpl.setNoiseSuppressorParams$lambda$0(z, z2, z3, z4, enhancerKind, str, i, i2, i3, i4, i5, z5, runnable, (NoiseSuppressorActiveState.Builder) obj);
                return noiseSuppressorParams$lambda$0;
            }
        });
    }
}
