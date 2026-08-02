package xsna;

/* compiled from: ClipsGridToolbarConfig.kt */
/* loaded from: classes17.dex */
public final class ree {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ree(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ree)) {
            return false;
        }
        ree reeVar = (ree) obj;
        return this.a == reeVar.a && this.b == reeVar.b && this.c == reeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridToolbarConfig(isOpenedInAppBar=");
        sb.append(this.a);
        sb.append(", showBackButtonInToolBar=");
        sb.append(this.b);
        sb.append(", isParentFitsSystemWindows=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
