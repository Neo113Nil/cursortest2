package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.aig;
import xsna.vhg;

/* compiled from: CommonViewEventToActionMapper.kt */
/* loaded from: classes7.dex */
public final class lng {
    public static vhg[] a(aig aigVar) {
        vhg aVar;
        vhg vhgVar;
        if (aigVar instanceof aig.e) {
            vhgVar = vhg.d.b;
        } else if (aigVar instanceof aig.f) {
            vhgVar = vhg.a.b;
        } else if (aigVar instanceof aig.c) {
            vhgVar = vhg.b.C3891b.b;
        } else if (aigVar instanceof aig.d) {
            vhgVar = vhg.b.a.b;
        } else {
            if (aigVar instanceof aig.a) {
                aVar = new vhg.c.f(((aig.a) aigVar).a);
            } else if (aigVar instanceof aig.g) {
                aig.g gVar = (aig.g) aigVar;
                aVar = new vhg.c.C3892c(gVar.b, gVar.a);
            } else if (aigVar instanceof aig.h) {
                aVar = new vhg.c.d(((aig.h) aigVar).a);
            } else {
                if (!(aigVar instanceof aig.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new vhg.c.a(((aig.b) aigVar).a);
            }
            vhgVar = aVar;
        }
        return new vhg[]{vhgVar};
    }
}
