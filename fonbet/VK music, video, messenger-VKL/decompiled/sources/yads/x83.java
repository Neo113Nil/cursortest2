package yads;

/* loaded from: classes10.dex */
public final class x83 {
    public final int a;
    public final no2[] b;
    public final pp0[] c;
    public final s93 d;
    public final Object e;

    public x83(no2[] no2VarArr, pp0[] pp0VarArr, s93 s93Var, mj1 mj1Var) {
        this.b = no2VarArr;
        this.c = (pp0[]) pp0VarArr.clone();
        this.d = s93Var;
        this.e = mj1Var;
        this.a = no2VarArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }
}
