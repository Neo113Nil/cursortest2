package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* loaded from: classes9.dex */
public interface kfx extends jfx {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    mgx getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
