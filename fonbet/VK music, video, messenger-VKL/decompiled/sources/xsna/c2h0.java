package xsna;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.android.kt */
/* loaded from: classes12.dex */
public final class c2h0 {
    public static final List<Class<?>> a = e43.l(Application.class, androidx.lifecycle.w.class);
    public static final List<Class<?>> b = Collections.singletonList(androidx.lifecycle.w.class);

    public static final Constructor a(List list, Class cls) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List u0 = rl3.u0(constructor.getParameterTypes());
            if (list.equals(u0)) {
                return constructor;
            }
            if (list.size() == u0.size() && u0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends nyt0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(vr.b(cls, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(vr.b(cls, "An exception happened in constructor of "), e3.getCause());
        }
    }
}
