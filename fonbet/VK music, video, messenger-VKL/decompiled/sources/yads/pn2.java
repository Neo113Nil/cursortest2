package yads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.epx;

/* loaded from: classes10.dex */
public abstract class pn2 {
    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        Object obj2 = null;
        try {
            Method a = a(cls, str, clsArr);
            if (a == null) {
                return null;
            }
            a.setAccessible(true);
            obj2 = a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            a.setAccessible(false);
            return obj2;
        } catch (Throwable unused) {
            return obj2;
        }
    }

    public static Object a(Object obj, String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = copyOf.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = copyOf[i];
            Class<?> cls = obj2 != null ? obj2.getClass() : null;
            if (cls != null) {
                arrayList.add(cls);
            }
        }
        return a(obj, obj.getClass(), str, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(objArr, objArr.length));
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (epx.f(str, method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == clsArr2.length) {
                        int length = parameterTypes.length;
                        for (int i = 0; i < length; i++) {
                            if (!parameterTypes[i].isAssignableFrom(clsArr2[i])) {
                                break;
                            }
                        }
                        return method;
                    }
                    continue;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static Object a(String str, Object... objArr) {
        Class<?> cls = Class.forName(str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList(copyOf.length);
        for (Object obj : copyOf) {
            arrayList.add(obj.getClass());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            boolean isAccessible = declaredConstructor.isAccessible();
            if (!isAccessible) {
                declaredConstructor.setAccessible(true);
            }
            Object newInstance = declaredConstructor.newInstance(Arrays.copyOf(copyOf, copyOf.length));
            if (!isAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return newInstance;
        } catch (Throwable unused) {
            Arrays.toString(copyOf);
            return null;
        }
    }
}
