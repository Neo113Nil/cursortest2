package xsna;

import java.util.List;

/* compiled from: MotionBanner.kt */
/* loaded from: classes8.dex */
public final class ba30 {
    public final String a;
    public final int b;
    public final int c;
    public final ka30 d;
    public final List<na30> e;

    public ba30(String str, int i, int i2, ka30 ka30Var, List<na30> list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = ka30Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba30)) {
            return false;
        }
        ba30 ba30Var = (ba30) obj;
        return epx.f(this.a, ba30Var.a) && this.b == ba30Var.b && this.c == ba30Var.c && epx.f(this.d, ba30Var.d) && epx.f(this.e, ba30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder b = xy6.b(this.b, "MotionBanner(id=", this.a, ", durationMs=", ", positionMs=");
        b.append(this.c);
        b.append(", header=");
        b.append(this.d);
        b.append(", items=");
        return vp.b(")", b, this.e);
    }
}
