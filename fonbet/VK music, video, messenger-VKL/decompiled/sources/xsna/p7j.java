package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.CheckResult;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import xsna.hdq;

/* compiled from: ConsumerAdapter.kt */
@SuppressLint({"BanUncheckedReflection"})
/* loaded from: classes12.dex */
public final class p7j {
    public final ClassLoader a;

    /* compiled from: ConsumerAdapter.kt */
    public static final class a<T> implements InvocationHandler {
        public final rfc a;
        public final hdq.a b;

        public a(rfc rfcVar, hdq.a aVar) {
            this.a = rfcVar;
            this.b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean f = epx.f(method.getName(), "accept");
            hdq.a aVar = this.b;
            if (f && objArr != null && objArr.length == 1) {
                Object obj2 = objArr[0];
                rfc rfcVar = this.a;
                if (rfcVar.c(obj2)) {
                    aVar.invoke(obj2);
                    return s3q0.a;
                }
                throw new ClassCastException("Value cannot be cast to " + rfcVar.h());
            }
            if (epx.f(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (epx.f(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(aVar.hashCode());
            }
            if (epx.f(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return aVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* compiled from: ConsumerAdapter.kt */
    public interface b {
        void dispose();
    }

    public p7j(ClassLoader classLoader) {
        this.a = classLoader;
    }

    @CheckResult
    public final q7j a(Object obj, rfc rfcVar, Activity activity, hdq.a aVar) {
        a aVar2 = new a(rfcVar, aVar);
        ClassLoader classLoader = this.a;
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("java.util.function.Consumer")}, aVar2);
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, classLoader.loadClass("java.util.function.Consumer")).invoke(obj, activity, newProxyInstance);
        return new q7j(obj.getClass().getMethod("removeWindowLayoutInfoListener", classLoader.loadClass("java.util.function.Consumer")), obj, newProxyInstance);
    }
}
