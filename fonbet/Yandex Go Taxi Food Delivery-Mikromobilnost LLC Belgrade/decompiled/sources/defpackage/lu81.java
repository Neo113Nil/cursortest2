package defpackage;

/* loaded from: classes7.dex */
public final class lu81 {
    public final int a;
    public final v581[] b;
    public final gk71[] c;
    public final ph81 d;
    public final zp1 e;

    public lu81(v581[] v581VarArr, gk71[] gk71VarArr, ph81 ph81Var, zp1 zp1Var) {
        this.b = v581VarArr;
        this.c = (gk71[]) gk71VarArr.clone();
        this.d = ph81Var;
        this.e = zp1Var;
        this.a = v581VarArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }
}
