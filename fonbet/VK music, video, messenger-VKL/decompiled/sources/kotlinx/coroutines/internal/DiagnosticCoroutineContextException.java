package kotlinx.coroutines.internal;

import kotlin.coroutines.d;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes8.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    public final transient d b;

    public DiagnosticCoroutineContextException(d dVar) {
        this.b = dVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.b);
    }
}
