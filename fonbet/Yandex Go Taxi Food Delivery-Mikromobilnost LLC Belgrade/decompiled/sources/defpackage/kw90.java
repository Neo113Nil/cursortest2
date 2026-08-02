package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class kw90 implements jw90 {
    public static final kw90 b = new kw90(new n65[0]);
    public final ArrayList a;

    public kw90(n65... n65VarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ycc.t(arrayList, n65VarArr);
    }

    @Override // defpackage.jw90
    public final bw90 a(PaymentMethod$Type paymentMethod$Type) {
        bw90 bw90Var;
        xw91 xw91Var = xw91.C;
        Iterator it = this.a.iterator();
        do {
            bw90Var = null;
            if (!it.hasNext()) {
                break;
            }
            n65 n65Var = (n65) it.next();
            if (n65Var instanceof gw90) {
                bw90 a = ((gw90) n65Var).a(paymentMethod$Type);
                if (!jl40.l(a, xw91Var)) {
                    bw90Var = a;
                }
            }
        } while (bw90Var == null);
        return bw90Var == null ? xw91Var : bw90Var;
    }

    @Override // defpackage.jw90
    public final bw90 b(lea0 lea0Var) {
        bw90 bw90Var;
        bw90 b2;
        xw91 xw91Var = xw91.C;
        if (lea0Var != null) {
            Iterator it = this.a.iterator();
            do {
                bw90Var = null;
                if (!it.hasNext()) {
                    break;
                }
                n65 n65Var = (n65) it.next();
                if (n65Var instanceof gw90) {
                    b2 = ((gw90) n65Var).a(lea0Var.c());
                    if (jl40.l(b2, xw91Var)) {
                    }
                    bw90Var = b2;
                } else {
                    if (!(n65Var instanceof fw90)) {
                        w511.b();
                        return null;
                    }
                    b2 = ((fw90) n65Var).b(lea0Var);
                    if (jl40.l(b2, xw91Var)) {
                    }
                    bw90Var = b2;
                }
            } while (bw90Var == null);
            if (bw90Var != null) {
                return bw90Var;
            }
        }
        return xw91Var;
    }
}
