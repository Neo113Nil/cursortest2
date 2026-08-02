package defpackage;

/* loaded from: classes10.dex */
public final class j531 {
    public final gor a;
    public sj2 b;
    public sj2 c;
    public sj2 d;
    public final float e;

    public j531(gor gorVar) {
        this.a = gorVar;
        this.e = gorVar.c();
    }

    public final sj2 a(long j, sj2 sj2Var, sj2 sj2Var2) {
        sj2 sj2Var3;
        if (this.c == null) {
            this.c = sj2Var.c();
        }
        sj2 sj2Var4 = this.c;
        if (sj2Var4 == null) {
            sj2Var4 = null;
        }
        int b = sj2Var4.b();
        int i = 0;
        while (true) {
            sj2Var3 = this.c;
            if (i >= b) {
                break;
            }
            if (sj2Var3 == null) {
                sj2Var3 = null;
            }
            sj2Var.getClass();
            sj2Var3.e(this.a.k(sj2Var2.a(i), j), i);
            i++;
        }
        if (sj2Var3 == null) {
            return null;
        }
        return sj2Var3;
    }
}
