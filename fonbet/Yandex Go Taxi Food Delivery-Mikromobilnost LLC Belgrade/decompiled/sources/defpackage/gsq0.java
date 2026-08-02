package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface gsq0 {
    Class with() default KSerializer.class;
}
