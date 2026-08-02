package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
public abstract class BackendResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FATAL_ERROR;
        public static final Status INVALID_PAYLOAD;
        public static final Status OK;
        public static final Status TRANSIENT_ERROR;

        static {
            Status status = new Status("OK", 0);
            OK = status;
            Status status2 = new Status("TRANSIENT_ERROR", 1);
            TRANSIENT_ERROR = status2;
            Status status3 = new Status("FATAL_ERROR", 2);
            FATAL_ERROR = status3;
            Status status4 = new Status("INVALID_PAYLOAD", 3);
            INVALID_PAYLOAD = status4;
            $VALUES = new Status[]{status, status2, status3, status4};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public abstract long a();

    public abstract Status b();
}
