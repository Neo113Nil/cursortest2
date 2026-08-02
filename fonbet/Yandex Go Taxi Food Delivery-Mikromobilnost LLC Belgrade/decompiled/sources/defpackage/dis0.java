package defpackage;

import androidx.compose.foundation.text.selection.CrossStatus;

/* loaded from: classes10.dex */
public final class dis0 implements rkq0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ckq0 d;
    public final dfq0 e;

    public dis0(boolean z, int i, int i2, ckq0 ckq0Var, dfq0 dfq0Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = ckq0Var;
        this.e = dfq0Var;
    }

    @Override // defpackage.rkq0
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.rkq0
    public final dfq0 b() {
        return this.e;
    }

    @Override // defpackage.rkq0
    public final CrossStatus c() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : this.e.b();
    }

    @Override // defpackage.rkq0
    public final ckq0 d() {
        return this.d;
    }

    @Override // defpackage.rkq0
    public final dfq0 e() {
        return this.e;
    }

    @Override // defpackage.rkq0
    public final dfq0 f() {
        return this.e;
    }

    @Override // defpackage.rkq0
    public final int g() {
        return this.b;
    }

    @Override // defpackage.rkq0
    public final int getSize() {
        return 1;
    }

    @Override // defpackage.rkq0
    public final boolean h(rkq0 rkq0Var) {
        if (this.d == null || rkq0Var == null || !(rkq0Var instanceof dis0)) {
            return true;
        }
        dis0 dis0Var = (dis0) rkq0Var;
        if (this.b != dis0Var.b || this.c != dis0Var.c || this.a != dis0Var.a) {
            return true;
        }
        dfq0 dfq0Var = dis0Var.e;
        dfq0 dfq0Var2 = this.e;
        return (dfq0Var2.a == dfq0Var.a && dfq0Var2.c == dfq0Var.c && dfq0Var2.d == dfq0Var.d) ? false : true;
    }

    @Override // defpackage.rkq0
    public final void i(tls tlsVar) {
    }

    @Override // defpackage.rkq0
    public final dfq0 j() {
        return this.e;
    }

    @Override // defpackage.rkq0
    public final int k() {
        return this.c;
    }

    @Override // defpackage.rkq0
    public final gy40 l(ckq0 ckq0Var) {
        boolean z = ckq0Var.c;
        bkq0 bkq0Var = ckq0Var.b;
        bkq0 bkq0Var2 = ckq0Var.a;
        if ((!z && bkq0Var2.b > bkq0Var.b) || (z && bkq0Var2.b <= bkq0Var.b)) {
            ckq0Var = ckq0.a(ckq0Var, null, null, !z, 3);
        }
        long j = this.e.a;
        gy40 gy40Var = zlz.a;
        gy40 gy40Var2 = new gy40((Object) null);
        gy40Var2.h(j, ckq0Var);
        return gy40Var2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + c() + ", info=\n\t" + this.e + ')';
    }
}
