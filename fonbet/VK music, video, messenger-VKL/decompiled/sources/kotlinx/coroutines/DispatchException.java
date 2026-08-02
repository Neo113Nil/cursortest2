package kotlinx.coroutines;

import kotlin.coroutines.d;
import xsna.ovj;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes11.dex */
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th, ovj ovjVar, d dVar) {
        super("Coroutine dispatcher " + ovjVar + " threw an exception, context = " + dVar, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
