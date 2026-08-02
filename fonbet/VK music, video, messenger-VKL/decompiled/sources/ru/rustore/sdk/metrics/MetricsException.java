package ru.rustore.sdk.metrics;

/* loaded from: classes11.dex */
public abstract class MetricsException extends Exception {

    /* loaded from: classes9.dex */
    public static final class MetricsDbError extends MetricsException {
        public MetricsDbError(Throwable th) {
            super("Interaction with database failed", th);
        }
    }

    public static final class NetworkError extends MetricsException {
    }

    /* loaded from: classes9.dex */
    public static final class SaveMetricsEventError extends MetricsException {
        public SaveMetricsEventError(String str) {
            super(str, null);
        }
    }
}
