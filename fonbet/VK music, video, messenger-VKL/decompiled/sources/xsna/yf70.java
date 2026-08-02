package xsna;

/* compiled from: NotificationSettingsAction.kt */
/* loaded from: classes5.dex */
public final class yf70 implements rf70 {
    public final boolean b;

    public yf70(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yf70) && this.b == ((yf70) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SystemNotificationSettingChange(enabled="), this.b, ')');
    }
}
