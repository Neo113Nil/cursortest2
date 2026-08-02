package ru.rustore.sdk.appupdate.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes9.dex */
public @interface AppUpdateType {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int FLEXIBLE = 0;
    public static final int IMMEDIATE = 1;
    public static final int SILENT = 2;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int FLEXIBLE = 0;
        public static final int IMMEDIATE = 1;
        public static final int SILENT = 2;

        private Companion() {
        }
    }
}
