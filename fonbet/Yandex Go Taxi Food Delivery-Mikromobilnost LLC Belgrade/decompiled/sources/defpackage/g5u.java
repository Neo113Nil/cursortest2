package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface g5u {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
