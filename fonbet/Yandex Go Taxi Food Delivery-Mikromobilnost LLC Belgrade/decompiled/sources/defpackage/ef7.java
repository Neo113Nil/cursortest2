package defpackage;

import java.util.Calendar;

/* loaded from: classes4.dex */
public final class ef7 extends zij {
    public static final ef7 a = new ef7();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        kf7 kf7Var = (kf7) obj;
        kf7 kf7Var2 = (kf7) obj2;
        if ((kf7Var instanceof jf7) && (kf7Var2 instanceof jf7)) {
            pf7 pf7Var = ((jf7) kf7Var).a;
            kb61 kb61Var = pf7Var.a;
            pf7 pf7Var2 = ((jf7) kf7Var2).a;
            return kb61Var.equals(pf7Var2.a) && pf7Var.b == pf7Var2.b && kdb1.k(pf7Var.d, pf7Var2.d) && kdb1.k(pf7Var.e, pf7Var2.e);
        }
        if ((kf7Var instanceof gf7) && (kf7Var2 instanceof gf7)) {
            return true;
        }
        if (!(kf7Var instanceof hf7) || !(kf7Var2 instanceof hf7)) {
            return false;
        }
        ze7 ze7Var = ((hf7) kf7Var).a;
        Calendar calendar = ze7Var.a;
        ze7 ze7Var2 = ((hf7) kf7Var2).a;
        return kdb1.j(calendar, ze7Var2.a) && ze7Var.d == ze7Var2.d && ze7Var.b == ze7Var2.b && ze7Var.c.equals(ze7Var2.c) && jl40.l(ze7Var.e, ze7Var2.e) && jl40.l(ze7Var.f, ze7Var2.f);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        kf7 kf7Var = (kf7) obj;
        kf7 kf7Var2 = (kf7) obj2;
        if ((kf7Var instanceof jf7) && (kf7Var2 instanceof jf7)) {
            return ((jf7) kf7Var).a.a.equals(((jf7) kf7Var2).a.a);
        }
        if ((kf7Var instanceof gf7) && (kf7Var2 instanceof gf7)) {
            return true;
        }
        if ((kf7Var instanceof hf7) && (kf7Var2 instanceof hf7)) {
            return kdb1.j((Calendar) ((hf7) kf7Var).a.a.clone(), (Calendar) ((hf7) kf7Var2).a.a.clone());
        }
        return false;
    }
}
