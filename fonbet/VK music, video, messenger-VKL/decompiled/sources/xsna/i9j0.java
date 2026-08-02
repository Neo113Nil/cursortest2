package xsna;

/* compiled from: ShareViewState.kt */
/* loaded from: classes7.dex */
public final class i9j0 {
    public final int a;
    public final boolean b;

    public i9j0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9j0)) {
            return false;
        }
        i9j0 i9j0Var = (i9j0) obj;
        return this.a == i9j0Var.a && this.b == i9j0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareTimeVs(timeSec=");
        sb.append(this.a);
        sb.append(", shareTimeChecked=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
