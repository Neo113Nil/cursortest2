package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipVirtualBackgroundControllerImpl.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class d5x0 extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        h5x0 h5x0Var = (h5x0) this.receiver;
        tnw0 tnw0Var = h5x0Var.d;
        tnw0 tnw0Var2 = h5x0Var.d;
        if (tnw0Var.d().isCallActive()) {
            tnw0Var.e().c(true);
            h5x0Var.q = io.reactivex.rxjava3.kotlin.c.f(2, tnw0Var2.e().b(), null, new zzs0(5), new cus0(h5x0Var, 11));
        } else {
            tnw0Var2.b.invoke().tn();
        }
        return s3q0.a;
    }
}
