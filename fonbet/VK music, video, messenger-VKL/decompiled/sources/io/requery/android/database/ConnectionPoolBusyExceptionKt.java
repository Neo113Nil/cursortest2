package io.requery.android.database;

/* compiled from: ConnectionPoolBusyException.kt */
/* loaded from: classes8.dex */
public final class ConnectionPoolBusyExceptionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable setCause(Throwable th, Throwable th2) {
        Throwable th3;
        if (th != null && th2 != null) {
            Throwable th4 = th;
            while (true) {
                th3 = null;
                if (th.getCause() == null || th.getCause() == th4) {
                    break;
                }
                th4 = th4 != null ? th4.getCause() : null;
            }
            if (th4 != null) {
                try {
                    th3 = th4.getCause();
                } catch (IllegalStateException unused) {
                }
            }
            if (th3 == null && th4 != null) {
                th4.initCause(th2);
            }
        }
        return th;
    }
}
