package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PayVerificationPresenter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class ds90 extends FunctionReferenceImpl implements izs<String, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(String str) {
        cs90 cs90Var = (cs90) this.receiver;
        cs90Var.e.vn();
        cs90Var.i(new dcv0(str)).subscribe(new tts(new dh8(cs90Var, 5), 20), new fv70(new wv2(cs90Var, 8), 3));
        return s3q0.a;
    }
}
