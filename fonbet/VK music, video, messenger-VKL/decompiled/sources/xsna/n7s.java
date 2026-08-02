package xsna;

import android.app.Notification;
import androidx.annotation.NonNull;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes12.dex */
public final class n7s {
    public final int a;
    public final int b;
    public final Notification c;

    public n7s(int i, @NonNull Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7s.class != obj.getClass()) {
            return false;
        }
        n7s n7sVar = (n7s) obj;
        if (this.a == n7sVar.a && this.b == n7sVar.b) {
            return this.c.equals(n7sVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
