package xsna;

/* compiled from: UserProfileLegoAvatarContextMenu.kt */
/* loaded from: classes5.dex */
public final class tqq0 {
    public final ax0 a;
    public final rtg0 b;

    public tqq0(ax0 ax0Var, rtg0 rtg0Var) {
        this.a = ax0Var;
        this.b = rtg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqq0)) {
            return false;
        }
        tqq0 tqq0Var = (tqq0) obj;
        return this.a.equals(tqq0Var.a) && this.b.equals(tqq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuLifecycle(dismissAndResetElevation=" + this.a + ", onMenuShown=" + this.b + ')';
    }
}
