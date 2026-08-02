package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface djg0 {
    boolean encoded() default false;

    String value();
}
