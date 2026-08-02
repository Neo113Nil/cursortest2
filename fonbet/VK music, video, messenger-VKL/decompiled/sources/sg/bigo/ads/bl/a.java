package sg.bigo.ads.bl;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes9.dex */
public final class a {
    public static Object a(Object obj, String str) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (Exception unused) {
                field = obj.getClass().getField(str);
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            sg.bigo.ads.bn.a.a(0, "ReflectionHelper", Log.getStackTraceString(e));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(Object obj, String str, Class cls) {
        boolean z;
        if (obj == null) {
            return null;
        }
        Method[] methods = obj.getClass().getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = methods[i];
            if (TextUtils.equals(str, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (!l.a((Object[]) null)) {
                    throw null;
                }
                if ((l.a(parameterTypes) ? 0 : parameterTypes.length) == 0) {
                    for (int i2 = 0; i2 < 0; i2++) {
                        if (parameterTypes[i2] == null) {
                        }
                    }
                    z = true;
                    if (z) {
                        continue;
                    } else {
                        Class<?> returnType = method.getReturnType();
                        if ((a(cls) && a(returnType)) || returnType == cls) {
                            try {
                                method.setAccessible(true);
                                return method.invoke(obj, null);
                            } catch (Exception e) {
                                sg.bigo.ads.bn.a.a(0, "ReflectionHelper", Log.getStackTraceString(e));
                                return null;
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
            i++;
        }
    }

    @Nullable
    public static <T> T a(String str, Class<T> cls) {
        try {
            Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(null);
        } catch (Exception unused) {
            sg.bigo.ads.bn.a.a(0, 5, "ReflectionHelper", "Cannot find class: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static boolean a(Class cls) {
        return cls == null || Void.class == cls;
    }

    public static boolean a(Class<?> cls, String... strArr) {
        Class<?> cls2;
        if (l.a(strArr)) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            try {
                cls2 = Class.forName(strArr[i]);
            } catch (Exception unused) {
                cls2 = null;
            }
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
