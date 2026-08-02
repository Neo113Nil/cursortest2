package xsna;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class ah70 implements ug70 {
    public final boolean b;

    public ah70(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah70) && this.b == ((ah70) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ToggleHeadphoneEnableState(enabled="), this.b, ')');
    }
}
