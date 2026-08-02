package xsna;

/* compiled from: ExecuteNotificationsDeleteGroupSource.kt */
/* loaded from: classes5.dex */
public final class bvl {
    public final boolean a;
    public final boolean b;

    public bvl() {
        this(true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvl)) {
            return false;
        }
        bvl bvlVar = (bvl) obj;
        return this.a == bvlVar.a && this.b == bvlVar.b;
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

    public bvl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
