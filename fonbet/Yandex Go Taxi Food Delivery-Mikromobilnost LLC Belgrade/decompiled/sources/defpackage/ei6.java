package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes11.dex */
public class ei6 {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(ei6.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
