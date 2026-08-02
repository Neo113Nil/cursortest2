package xsna;

/* compiled from: NotificationSettingViewState.kt */
/* loaded from: classes5.dex */
public final class nf70 implements ao50 {
    public final fi50 a;

    public nf70(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf70) && this.a.equals(((nf70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("NotificationSettingViewState(scene="), this.a, ')');
    }
}
