package xsna;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class fh70 implements ug70 {
    public final boolean b;

    public fh70(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh70) && this.b == ((fh70) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SystemNotificationSettingToggled(enabled="), this.b, ')');
    }
}
