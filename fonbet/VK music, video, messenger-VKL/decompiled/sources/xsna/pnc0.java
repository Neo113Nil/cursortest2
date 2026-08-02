package xsna;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class pnc0 extends FunctionReferenceImpl implements izs<Integer, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Integer num) {
        a4d0 a4d0Var;
        a4d0 a4d0Var2;
        Integer num2 = num;
        h0c0 h0c0Var = ((enc0) this.receiver).p;
        if (num2 != null) {
            if (num2.intValue() == 3) {
                pcc0 pcc0Var = h0c0Var.g;
                if (pcc0Var != null && (a4d0Var2 = pcc0Var.n.g) != null) {
                    a4d0Var2.P.f = false;
                }
            } else {
                pcc0 pcc0Var2 = h0c0Var.g;
                if (pcc0Var2 != null && (a4d0Var = pcc0Var2.n.g) != null) {
                    d4d0 d4d0Var = a4d0Var.P;
                    d4d0Var.f = true;
                    if (!d4d0Var.h) {
                        Object parent = d4d0Var.a.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        d4d0Var.c(view != null ? view.getScrollX() : 0);
                    }
                }
            }
        }
        return s3q0.a;
    }
}
