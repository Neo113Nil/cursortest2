package xsna;

/* compiled from: NotificationEvents.kt */
@vby
/* loaded from: classes4.dex */
public final class xj70 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof xj70) {
            return this.a == ((xj70) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "NotificationsReloadEvent(reloadFromPush=" + this.a + ')';
    }
}
