package xsna;

/* compiled from: NotificationMenuModalViewState.kt */
/* loaded from: classes4.dex */
public final class ce70 implements ao50 {
    public final fi50 a;

    public ce70(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce70) && this.a.equals(((ce70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("NotificationMenuModalViewState(scene="), this.a, ')');
    }
}
