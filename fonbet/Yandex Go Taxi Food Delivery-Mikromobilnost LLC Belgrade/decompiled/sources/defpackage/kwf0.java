package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public abstract class kwf0 implements InvocationHandler {
    public abstract Object a(Object obj, Method method, Object[] objArr);

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = pwf0.d;
        }
        int length = objArr.length;
        if (length == 0) {
            String name = method.getName();
            if (jl40.l(name, "hashCode")) {
                return Integer.valueOf(hashCode());
            }
            if (jl40.l(name, "toString")) {
                return toString();
            }
        } else if (length == 1 && jl40.l(method.getName(), "equals") && jl40.l(method.getParameterTypes()[0], Object.class)) {
            return Boolean.valueOf(equals(objArr[0]));
        }
        return a(obj, method, objArr);
    }
}
