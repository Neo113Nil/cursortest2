package org.chromium.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface ApplicationState {
    public static final int HAS_DESTROYED_ACTIVITIES = 4;
    public static final int HAS_PAUSED_ACTIVITIES = 2;
    public static final int HAS_RUNNING_ACTIVITIES = 1;
    public static final int HAS_STOPPED_ACTIVITIES = 3;
    public static final int UNKNOWN = 0;
}
