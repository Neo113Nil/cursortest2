package xsna;

/* compiled from: NotificationSettingsViewState.kt */
/* loaded from: classes5.dex */
public final class uh70 implements ao50 {
    public final fi50 a;

    public uh70(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh70) && this.a.equals(((uh70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("NotificationSettingsViewState(scene="), this.a, ')');
    }
}
