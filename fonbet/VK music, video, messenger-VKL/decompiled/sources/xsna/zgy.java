package xsna;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public final class zgy extends jgy {
    public final boolean b;
    public final boolean c;

    public zgy(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // xsna.jgy
    public final jgy a(boolean z) {
        return new zgy(this.b, z);
    }

    @Override // xsna.jgy
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgy)) {
            return false;
        }
        zgy zgyVar = (zgy) obj;
        return this.b == zgyVar.b && this.c == zgyVar.c;
    }

    @Override // xsna.jgy
    public final int getId() {
        return -1000;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardRefreshButtonItem(isLoading=");
        sb.append(this.b);
        sb.append(", selected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
