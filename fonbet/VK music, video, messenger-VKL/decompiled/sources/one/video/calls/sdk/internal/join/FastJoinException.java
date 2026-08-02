package one.video.calls.sdk.internal.join;

import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: FastJoinException.kt */
/* loaded from: classes8.dex */
public final class FastJoinException extends ApiInvocationException {
    private final Throwable cause;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FastJoinException(Throwable th) {
        super(1, r0);
        String str = null;
        String message = th != null ? th.getMessage() : null;
        if (message != null) {
            str = message;
        } else if (th != null) {
            str = th.getClass().getName();
        }
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
