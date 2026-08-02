package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ctb0;
import xsna.trb0;

/* compiled from: PollReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class erb0 extends FunctionReferenceImpl implements izs<trb0, ctb0.b> {
    @Override // xsna.izs
    public final ctb0.b invoke(trb0 trb0Var) {
        trb0 trb0Var2 = trb0Var;
        dtb0 dtb0Var = (dtb0) this.receiver;
        dtb0Var.getClass();
        if (trb0Var2 instanceof trb0.a) {
            return dtb0Var.b((trb0.a) trb0Var2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
