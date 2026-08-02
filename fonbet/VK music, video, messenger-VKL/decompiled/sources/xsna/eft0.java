package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class eft0 implements gzs {
    public final /* synthetic */ fft0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ eft0(fft0 fft0Var, float f) {
        this.b = fft0Var;
        this.c = f;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        fft0 fft0Var = this.b;
        fft0Var.R = null;
        float f = this.c;
        fft0Var.e(f);
        fft0Var.S = ((double) f) > 0.99d;
        fft0Var.x.onStopTrackingTouch(fft0Var.m);
        return s3q0.a;
    }
}
