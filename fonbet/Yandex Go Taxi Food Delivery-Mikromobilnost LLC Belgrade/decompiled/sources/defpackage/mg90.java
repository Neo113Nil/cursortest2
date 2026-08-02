package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface mg90 {
    String encoding() default "binary";

    String value() default "";
}
