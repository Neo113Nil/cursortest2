package xsna;

/* compiled from: ExecuteNotificationsDeleteGroupSource.kt */
/* loaded from: classes14.dex */
public final class cvl {
    public final boolean a;
    public final boolean b;

    public cvl() {
        this(true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvl)) {
            return false;
        }
        cvl cvlVar = (cvl) obj;
        return this.a == cvlVar.a && this.b == cvlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteGroupSourceResult(result=");
        sb.append(this.a);
        sb.append(", canAdd=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public cvl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
