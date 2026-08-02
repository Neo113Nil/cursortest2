package org.chromium.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface Idempotency {
    public static final int DEFAULT_IDEMPOTENCY = 0;
    public static final int IDEMPOTENT = 1;
    public static final int NOT_IDEMPOTENT = 2;
}
