package xsna;

/* compiled from: SpoilerMeta.kt */
/* loaded from: classes15.dex */
public final class bmk0 {
    public final boolean a;
    public final boolean b;

    public bmk0() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmk0)) {
            return false;
        }
        bmk0 bmk0Var = (bmk0) obj;
        return this.a == bmk0Var.a && this.b == bmk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpoilerMeta(isSpoiled=");
        sb.append(this.a);
        sb.append(", isDonut=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public bmk0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
