package xsna;

/* compiled from: NotificationSettingsAction.kt */
/* loaded from: classes5.dex */
public final class qf70 implements rf70 {
    public final int b;

    public qf70(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf70) && this.b == ((qf70) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("SelectLEDColor(color="), this.b, ')');
    }
}
