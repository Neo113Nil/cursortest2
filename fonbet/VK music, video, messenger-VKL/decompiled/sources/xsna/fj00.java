package xsna;

import java.lang.reflect.InvocationTargetException;

/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes12.dex */
public final class fj00 {
    public static b1u a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (newInstance instanceof b1u) {
                    return (b1u) newInstance;
                }
                throw new RuntimeException(cqi.c(newInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                b(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(vr.b(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
