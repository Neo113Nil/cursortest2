package org.chromium.base.version_info;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface Channel {
    public static final int BETA = 3;
    public static final int CANARY = 1;
    public static final int DEFAULT = 0;
    public static final int DEV = 2;
    public static final int STABLE = 4;
    public static final int UNKNOWN = 0;
}
