package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l2m0 {
    public static final List a = scc.g(Application.class, v1m0.class);
    public static final List b = Collections.singletonList(v1m0.class);

    public static final Constructor a(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List d0 = j73.d0(constructor.getParameterTypes());
            if (list.equals(d0)) {
                return constructor;
            }
            if (list.size() == d0.size() && d0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final yr31 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (yr31) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            ny61.n(qv10.l(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            ny61.n(qv10.m(cls, "A ", " cannot be instantiated."), e2);
            return null;
        } catch (InvocationTargetException e3) {
            ny61.n(qv10.l(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }
}
