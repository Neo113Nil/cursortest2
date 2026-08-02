package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public class nvc0 {
    public void a(Throwable th, Throwable th2) {
        Method method = mvc0.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object invoke;
        Method method = mvc0.b;
        return (method == null || (invoke = method.invoke(th, null)) == null) ? EmptyList.a : Arrays.asList((Throwable[]) invoke);
    }
}
