package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.support.customtabs.IAuthTabCallback;

/* loaded from: classes10.dex */
public final class nl3 {
    public final IAuthTabCallback a;
    public final PendingIntent b;

    public nl3(IAuthTabCallback iAuthTabCallback, PendingIntent pendingIntent) {
        if (iAuthTabCallback == null && pendingIntent == null) {
            ny61.r("AuthTabSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.a = iAuthTabCallback;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nl3) {
            nl3 nl3Var = (nl3) obj;
            PendingIntent pendingIntent = nl3Var.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                IAuthTabCallback iAuthTabCallback = this.a;
                if (iAuthTabCallback == null) {
                    ny61.r("AuthTabSessionToken must have valid binder or pending session");
                    return false;
                }
                IBinder asBinder = iAuthTabCallback.asBinder();
                IAuthTabCallback iAuthTabCallback2 = nl3Var.a;
                if (iAuthTabCallback2 != null) {
                    return asBinder.equals(iAuthTabCallback2.asBinder());
                }
                ny61.r("AuthTabSessionToken must have valid binder or pending session");
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        IAuthTabCallback iAuthTabCallback = this.a;
        if (iAuthTabCallback != null) {
            return iAuthTabCallback.asBinder().hashCode();
        }
        ny61.r("AuthTabSessionToken must have valid binder or pending session");
        return 0;
    }
}
