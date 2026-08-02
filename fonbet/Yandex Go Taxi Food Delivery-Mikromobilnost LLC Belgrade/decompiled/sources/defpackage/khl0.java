package defpackage;

/* loaded from: classes10.dex */
public abstract class khl0 {
    public static final lhl0 a = new lhl0(lr20.a, x4c.D);

    public static final lhl0 a(h43 h43Var, to5 to5Var, fid fidVar, int i) {
        if (h43Var.equals(lr20.a) && jl40.l(to5Var, x4c.D)) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(-1073830487);
            btsVar.t(false);
            return a;
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && btsVar2.k(h43Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !btsVar2.k(to5Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object Q = btsVar2.Q();
        if (z3 || Q == did.a) {
            Q = new lhl0(h43Var, to5Var);
            btsVar2.o0(Q);
        }
        lhl0 lhl0Var = (lhl0) Q;
        btsVar2.t(false);
        return lhl0Var;
    }
}
