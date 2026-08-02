package ru.rustore.sdk.appupdate.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes9.dex */
public @interface InstallStatus {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DOWNLOADED = 1;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 3;
    public static final int INSTALLING = 4;
    public static final int PENDING = 5;
    public static final int UNKNOWN = 0;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DOWNLOADED = 1;
        public static final int DOWNLOADING = 2;
        public static final int FAILED = 3;
        public static final int INSTALLING = 4;
        public static final int PENDING = 5;
        public static final int UNKNOWN = 0;

        private Companion() {
        }
    }
}
