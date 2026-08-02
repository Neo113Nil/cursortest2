package defpackage;

import android.os.Handler;

/* loaded from: classes10.dex */
public final class kil0 implements pyy {
    public lil0 A;
    public kbh B;
    public volatile boolean C;
    public volatile long E;
    public final int a;
    public final jjl0 b;
    public final vfc0 c;
    public final o8g0 w;
    public final iil0 y;
    public jil0 z;
    public final Handler x = tw21.n(null);
    public volatile long D = -9223372036854775807L;

    public kil0(int i, jjl0 jjl0Var, vfc0 vfc0Var, o8g0 o8g0Var, iil0 iil0Var) {
        this.a = i;
        this.b = jjl0Var;
        this.c = vfc0Var;
        this.w = o8g0Var;
        this.y = iil0Var;
    }

    @Override // defpackage.pyy
    public final void d() {
        this.C = true;
    }

    @Override // defpackage.pyy
    public final void load() {
        if (this.C) {
            this.C = false;
        }
        try {
            if (this.z == null) {
                jil0 e = this.y.e(this.a);
                this.z = e;
                this.x.post(new ud30(28, this, e.D(), this.z));
                jil0 jil0Var = this.z;
                jil0Var.getClass();
                this.B = new kbh(jil0Var, 0L, -1L);
                lil0 lil0Var = new lil0(this.b.a, this.a);
                this.A = lil0Var;
                lil0Var.e(this.w);
            }
            while (!this.C) {
                if (this.D != -9223372036854775807L) {
                    lil0 lil0Var2 = this.A;
                    lil0Var2.getClass();
                    lil0Var2.a(this.E, this.D);
                    this.D = -9223372036854775807L;
                }
                lil0 lil0Var3 = this.A;
                lil0Var3.getClass();
                kbh kbhVar = this.B;
                kbhVar.getClass();
                if (lil0Var3.g(kbhVar, new xde0()) == -1) {
                    break;
                }
            }
            this.C = false;
            jil0 jil0Var2 = this.z;
            jil0Var2.getClass();
            if (jil0Var2.K()) {
                yri0.b(this.z);
                this.z = null;
            }
        } catch (Throwable th) {
            jil0 jil0Var3 = this.z;
            jil0Var3.getClass();
            if (jil0Var3.K()) {
                yri0.b(this.z);
                this.z = null;
            }
            throw th;
        }
    }
}
