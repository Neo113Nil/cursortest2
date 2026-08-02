package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface n851 {
    ObserveStrategy strategy() default ObserveStrategy.Default;
}
