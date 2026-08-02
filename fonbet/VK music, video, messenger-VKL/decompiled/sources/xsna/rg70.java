package xsna;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class rg70 implements ug70 {
    public final gg70 b;

    public rg70(gg70 gg70Var) {
        this.b = gg70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg70) && epx.f(this.b, ((rg70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DataLoaded(notificationSettingsData=" + this.b + ')';
    }
}
