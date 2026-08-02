package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class f9e implements InvocationHandler {
    public final g0c a;
    public final tls b;

    public f9e(g0c g0cVar, tls tlsVar) {
        this.a = g0cVar;
        this.b = tlsVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean l = jl40.l(method.getName(), "accept");
        tls tlsVar = this.b;
        if (l && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            zbb1.b(this.a, obj2);
            tlsVar.invoke(obj2);
            return zy11.a;
        }
        if (jl40.l(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (jl40.l(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(tlsVar.hashCode());
        }
        if (jl40.l(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return tlsVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
