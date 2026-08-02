package xsna;

/* compiled from: NotificationListViewState.kt */
/* loaded from: classes4.dex */
public final class ad70 implements ao50 {
    public final fi50 a;

    public ad70(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad70) && this.a.equals(((ad70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("NotificationListViewState(scene="), this.a, ')');
    }
}
