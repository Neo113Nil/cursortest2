package io.requery.android.database;

/* compiled from: ConnectionPoolBusyException.kt */
/* loaded from: classes8.dex */
public final class PrimaryConnectionPoolBusyHolder extends IllegalStateException {
    private final Thread thread;

    public PrimaryConnectionPoolBusyHolder(Thread thread, boolean z) {
        super("held with " + thread.getName() + ", isPrimaryRequest: " + z);
        this.thread = thread;
    }

    public final PrimaryConnectionPoolBusyHolder initCause$libsqlite_requery_release() {
        IllegalStateException illegalStateException = new IllegalStateException();
        illegalStateException.setStackTrace(this.thread.getStackTrace());
        ConnectionPoolBusyExceptionKt.setCause(this, illegalStateException);
        return this;
    }
}
