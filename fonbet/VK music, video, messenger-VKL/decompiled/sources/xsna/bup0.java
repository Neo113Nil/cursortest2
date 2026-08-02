package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import xsna.p5s;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes11.dex */
public class bup0 extends hup0 {
    public static Class<?> a = null;
    public static Constructor<?> b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean e(String str, boolean z, int i, Object obj) {
        f();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void f() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // xsna.hup0
    public Typeface a(Context context, p5s.b bVar, Resources resources, int i) {
        f();
        try {
            Object newInstance = b.newInstance(null);
            for (p5s.c cVar : bVar.a) {
                File c2 = iup0.c(context);
                if (c2 == null) {
                    return null;
                }
                try {
                    if (!iup0.a(c2, resources, cVar.f)) {
                        return null;
                    }
                    if (!e(c2.getPath(), cVar.c, cVar.b, newInstance)) {
                        return null;
                    }
                    c2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    c2.delete();
                }
            }
            f();
            try {
                Object newInstance2 = Array.newInstance(a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
