package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ish0;

/* compiled from: SearchFeatureParametersConfigDelegateBinding.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class mrh0 extends FunctionReferenceImpl implements izs<ish0.k, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ish0.k kVar) {
        ish0.k kVar2 = kVar;
        nrh0 nrh0Var = (nrh0) this.receiver;
        if (kVar2 instanceof ish0.f) {
            nrh0Var.b.a(((ish0.f) kVar2).a);
            return s3q0.a;
        }
        nrh0Var.getClass();
        throw new NoWhenBranchMatchedException();
    }
}
