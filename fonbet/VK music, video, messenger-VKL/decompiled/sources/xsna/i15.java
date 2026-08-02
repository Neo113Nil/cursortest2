package xsna;

import xsna.gdn;

/* compiled from: AudiobookScreenActionProcessor.kt */
/* loaded from: classes3.dex */
public final class i15 implements icb0 {
    public final izs<gdn, s3q0> a;
    public final izs<Float, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public i15(izs<? super gdn, s3q0> izsVar, izs<? super Float, s3q0> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    @Override // xsna.icb0
    public final void a(float f) {
        this.b.invoke(Float.valueOf(f));
    }

    @Override // xsna.icb0
    public final void h() {
        this.a.invoke(gdn.d.b.b);
    }
}
