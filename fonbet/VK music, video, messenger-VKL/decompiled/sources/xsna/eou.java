package xsna;

/* compiled from: GroupedNotificationListViewState.kt */
/* loaded from: classes4.dex */
public final class eou implements ao50 {
    public final fi50 a;

    public eou(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eou) && this.a.equals(((eou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("GroupedNotificationListViewState(scene="), this.a, ')');
    }
}
