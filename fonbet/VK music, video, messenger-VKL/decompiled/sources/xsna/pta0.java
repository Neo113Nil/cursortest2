package xsna;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes11.dex */
public class pta0 {

    /* compiled from: PlatformImplementations.kt */
    /* loaded from: classes8.dex */
    public static final class a {
        public static final Method a;
        public static final Method b;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (epx.f(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if (epx.f(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            a = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (epx.f(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            b = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        Method method = a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List<Throwable> b(Throwable th) {
        Object invoke;
        Method method = a.b;
        return (method == null || (invoke = method.invoke(th, null)) == null) ? EmptyList.b : Arrays.asList((Throwable[]) invoke);
    }
}
