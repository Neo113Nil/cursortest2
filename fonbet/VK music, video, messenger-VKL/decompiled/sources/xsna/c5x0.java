package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipVirtualBackgroundControllerImpl.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class c5x0 extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        h5x0 h5x0Var = (h5x0) this.receiver;
        io.reactivex.rxjava3.disposables.c cVar = h5x0Var.q;
        if (cVar != null) {
            cVar.dispose();
        }
        h5x0Var.q = null;
        h5x0Var.d.e().c(false);
        return s3q0.a;
    }
}
