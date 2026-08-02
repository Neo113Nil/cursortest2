package defpackage;

@gsq0
/* loaded from: classes9.dex */
public final class nc61 {
    public static final mc61 Companion = new mc61();
    public final zzs a;
    public final v03 b;
    public final String c;
    public final k5q0 d;

    public /* synthetic */ nc61(int i, zzs zzsVar, v03 v03Var, String str, k5q0 k5q0Var) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, lc61.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        this.b = v03Var;
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = k5q0Var;
        }
    }

    public nc61(zzs zzsVar, v03 v03Var, String str, k5q0 k5q0Var) {
        this.a = zzsVar;
        this.b = v03Var;
        this.c = str;
        this.d = k5q0Var;
    }
}
