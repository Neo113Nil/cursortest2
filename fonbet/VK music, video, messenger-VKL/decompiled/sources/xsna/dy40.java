package xsna;

/* compiled from: MusicPlayerPermissions.kt */
/* loaded from: classes3.dex */
public final class dy40 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public dy40(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static dy40 a(dy40 dy40Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = dy40Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = dy40Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = dy40Var.c;
        }
        boolean z7 = z3;
        boolean z8 = dy40Var.d;
        if ((i & 16) != 0) {
            z4 = dy40Var.e;
        }
        boolean z9 = dy40Var.f;
        dy40Var.getClass();
        return new dy40(z5, z6, z7, z8, z4, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy40)) {
            return false;
        }
        dy40 dy40Var = (dy40) obj;
        return this.a == dy40Var.a && this.b == dy40Var.b && this.c == dy40Var.c && this.d == dy40Var.d && this.e == dy40Var.e && this.f == dy40Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerPermissions(canAddAudio=");
        sb.append(this.a);
        sb.append(", canRemoveAudio=");
        sb.append(this.b);
        sb.append(", canDislike=");
        sb.append(this.c);
        sb.append(", canGoBack=");
        sb.append(this.d);
        sb.append(", canGoForward=");
        sb.append(this.e);
        sb.append(", canViewPlaybackQueue=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
