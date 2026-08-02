package xsna;

import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ko70 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;

    public /* synthetic */ ko70(boolean z, boolean z2, boolean z3, int i, String str, int i2, int i3, int i4, int i5, int i6, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return ((NoiseSuppressorActiveState.Builder) obj).setNoiseSuppressorStuttering(false).setServersideAnn(this.b).setClientsidePlatform(this.c).setClientsideAnn(this.d).setEnhancerKind((NoiseSuppressorActiveState.EnhancerKind) NoiseSuppressorActiveState.EnhancerKind.getEntries().get(this.e)).setFilePath(this.f).setInputSampleRate(this.g).setOutputSampleRate(this.h).setFallbackTimeLimitMillis(this.i).setFallbackStutterCountMillis(this.j).setFallbackTimeframeMillis(this.k).setLogTimings(this.l).setonNoiseSuppressorDisabledDueToStutter((gzs<s3q0>) null).build();
    }
}
