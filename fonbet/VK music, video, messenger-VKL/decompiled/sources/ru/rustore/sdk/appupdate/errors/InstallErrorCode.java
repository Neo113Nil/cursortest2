package ru.rustore.sdk.appupdate.errors;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes9.dex */
public @interface InstallErrorCode {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int ERROR_ABORTED = 4010;
    public static final int ERROR_ACTIVITY_SEND_INTENT = 9901;
    public static final int ERROR_ACTIVITY_UNKNOWN = 9902;
    public static final int ERROR_APK_NOT_FOUND = 4011;
    public static final int ERROR_APP_NOT_OWNED = 4008;
    public static final int ERROR_BLOCKED = 4003;
    public static final int ERROR_CONFLICT = 4005;
    public static final int ERROR_DOWNLOAD = 4002;
    public static final int ERROR_EXTERNAL_SOURCE_DENIED = 4012;
    public static final int ERROR_INCOMPATIBLE = 4007;
    public static final int ERROR_INTERNAL_ERROR = 4009;
    public static final int ERROR_INVALID_APK = 4004;
    public static final int ERROR_STORAGE = 4006;
    public static final int ERROR_UNKNOWN = 4001;
    public static final int NO_ERROR = 0;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ERROR_ABORTED = 4010;
        public static final int ERROR_ACTIVITY_SEND_INTENT = 9901;
        public static final int ERROR_ACTIVITY_UNKNOWN = 9902;
        public static final int ERROR_APK_NOT_FOUND = 4011;
        public static final int ERROR_APP_NOT_OWNED = 4008;
        public static final int ERROR_BLOCKED = 4003;
        public static final int ERROR_CONFLICT = 4005;
        public static final int ERROR_DOWNLOAD = 4002;
        public static final int ERROR_EXTERNAL_SOURCE_DENIED = 4012;
        public static final int ERROR_INCOMPATIBLE = 4007;
        public static final int ERROR_INTERNAL_ERROR = 4009;
        public static final int ERROR_INVALID_APK = 4004;
        public static final int ERROR_STORAGE = 4006;
        public static final int ERROR_UNKNOWN = 4001;
        public static final int NO_ERROR = 0;

        private Companion() {
        }
    }
}
