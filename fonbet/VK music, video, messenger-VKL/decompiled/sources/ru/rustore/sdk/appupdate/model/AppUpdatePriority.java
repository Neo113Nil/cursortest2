package ru.rustore.sdk.appupdate.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes9.dex */
public @interface AppUpdatePriority {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int PRIORITY_0 = 0;
    public static final int PRIORITY_1 = 1;
    public static final int PRIORITY_2 = 2;
    public static final int PRIORITY_3 = 3;
    public static final int PRIORITY_4 = 4;
    public static final int PRIORITY_5 = 5;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int PRIORITY_0 = 0;
        public static final int PRIORITY_1 = 1;
        public static final int PRIORITY_2 = 2;
        public static final int PRIORITY_3 = 3;
        public static final int PRIORITY_4 = 4;
        public static final int PRIORITY_5 = 5;

        private Companion() {
        }
    }
}
