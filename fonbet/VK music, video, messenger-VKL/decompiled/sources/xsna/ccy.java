package xsna;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* compiled from: KCallable.kt */
/* loaded from: classes11.dex */
public interface ccy<R> extends bcy {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    vcy getReturnType();

    List<Object> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
