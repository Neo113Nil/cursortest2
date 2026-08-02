package org.chromium.base.task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface TaskRunnerType {
    public static final int BASE = 0;
    public static final int SEQUENCED = 1;
    public static final int SINGLE_THREAD = 2;
}
