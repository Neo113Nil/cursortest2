package defpackage;

import androidx.compose.ui.graphics.Path$Direction;

/* loaded from: classes10.dex */
public final class hx80 extends ix80 {
    public final sxk0 a;
    public final jb2 b;

    public hx80(sxk0 sxk0Var) {
        jb2 jb2Var;
        this.a = sxk0Var;
        if (ora1.d(sxk0Var)) {
            jb2Var = null;
        } else {
            jb2Var = nb2.a();
            jb2Var.f(sxk0Var, Path$Direction.CounterClockwise);
        }
        this.b = jb2Var;
    }

    @Override // defpackage.ix80
    public final zii0 a() {
        sxk0 sxk0Var = this.a;
        return new zii0(sxk0Var.a, sxk0Var.b, sxk0Var.c, sxk0Var.d);
    }

    public final sxk0 b() {
        return this.a;
    }

    public final jb2 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hx80) {
            return this.a.equals(((hx80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
