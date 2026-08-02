package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public abstract class pwf0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final d82 c = new d82(6);
    public static final Object[] d = new Object[0];

    public static Object a(Method method) {
        Class<?> returnType = method.getReturnType();
        if (!returnType.isPrimitive()) {
            return null;
        }
        if (returnType.equals(Long.TYPE)) {
            return 0L;
        }
        if (returnType.equals(Integer.TYPE)) {
            return 0;
        }
        if (returnType.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (returnType.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        return returnType.equals(Double.TYPE) ? Double.valueOf(0.0d) : returnType.equals(Float.TYPE) ? Float.valueOf(0.0f) : returnType.equals(Boolean.TYPE) ? Boolean.FALSE : returnType.equals(Character.TYPE) ? (char) 0 : null;
    }

    public static final nwf0 b(Class cls) {
        final AtomicReference atomicReference = new AtomicReference();
        return new nwf0(atomicReference, d(cls, new InvocationHandler() { // from class: hwf0
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object obj2 = atomicReference.get();
                return obj2 == null ? pwf0.a(method) : method.invoke(obj2, Arrays.copyOf(objArr, objArr.length));
            }
        }));
    }

    public static final Object c(Class cls) {
        return cls.cast(a.computeIfAbsent(cls, new dxd(9, new qda0(22))));
    }

    public static Object d(Class cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new owf0(invocationHandler)));
    }

    public static final zxf0 e(Class cls, zxf0 zxf0Var) {
        return (zxf0) d(cls, new czc0(1, new AtomicReference(zxf0Var)));
    }
}
