package xsna;

/* compiled from: HideAppContentState.kt */
/* loaded from: classes15.dex */
public final class j3v implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public j3v() {
        this(false, false, false);
    }

    public static j3v a(j3v j3vVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = j3vVar.b;
        }
        if ((i & 2) != 0) {
            z2 = j3vVar.c;
        }
        if ((i & 4) != 0) {
            z3 = j3vVar.d;
        }
        j3vVar.getClass();
        return new j3v(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3v)) {
            return false;
        }
        j3v j3vVar = (j3v) obj;
        return this.b == j3vVar.b && this.c == j3vVar.c && this.d == j3vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideAppContentState(isHidePushContentEnabled=");
        sb.append(this.b);
        sb.append(", isHideAppContentEnabled=");
        sb.append(this.c);
        sb.append(", needShowHideAppContentDlg=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public j3v(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
