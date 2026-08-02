package xsna;

/* compiled from: LyricsListItem.kt */
/* loaded from: classes3.dex */
public final class na00 extends ja00 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public na00(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = z3;
    }

    @Override // xsna.ja00
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na00)) {
            return false;
        }
        na00 na00Var = (na00) obj;
        return this.a == na00Var.a && this.b == na00Var.b && this.c == na00Var.c && this.d == na00Var.d && this.e == na00Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricsListItemLoading(height=");
        sb.append(this.a);
        sb.append(", isEnded=");
        sb.append(this.b);
        sb.append(", isActive=");
        sb.append(this.c);
        sb.append(", color=");
        sb.append(this.d);
        sb.append(", isPaused=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ na00(int i, boolean z, boolean z2, int i2, boolean z3, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, z, z2, (i3 & 16) != 0 ? false : z3);
    }
}
