package xsna;

/* compiled from: GalvitaLayoutParams.kt */
/* loaded from: classes17.dex */
public final class uzt0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public uzt0() {
        this(15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzt0)) {
            return false;
        }
        uzt0 uzt0Var = (uzt0) obj;
        return this.a == uzt0Var.a && this.b == uzt0Var.b && this.c == uzt0Var.c && this.d == uzt0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewPosition(isLeftTop=");
        sb.append(this.a);
        sb.append(", isRightTop=");
        sb.append(this.b);
        sb.append(", isRightBottom=");
        sb.append(this.c);
        sb.append(", isLeftBottom=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ uzt0(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, (i & 8) == 0);
    }

    public uzt0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
