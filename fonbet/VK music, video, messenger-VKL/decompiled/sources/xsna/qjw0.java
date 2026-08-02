package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cbv;

/* compiled from: VoipCallView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class qjw0 extends FunctionReferenceImpl implements izs<cbv.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(cbv.a aVar) {
        cbv.a aVar2 = aVar;
        mjw0 mjw0Var = (mjw0) this.receiver;
        int i = mjw0.m1;
        if (aVar2 instanceof cbv.a.c) {
            mjw0Var.h1 = false;
        } else if (aVar2 instanceof cbv.a.b) {
            mjw0Var.setControlsAreHidden(true);
            mjw0Var.h1 = true;
        } else {
            if (!(aVar2 instanceof cbv.a.C2656a)) {
                mjw0Var.getClass();
                throw new NoWhenBranchMatchedException();
            }
            mjw0Var.h1 = false;
        }
        return s3q0.a;
    }
}
