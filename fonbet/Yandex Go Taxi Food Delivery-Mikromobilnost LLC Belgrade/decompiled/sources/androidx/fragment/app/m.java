package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import defpackage.oyr;
import defpackage.ycs0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class m {
    public static final ycs0 a = new ycs0();

    public static Class b(ClassLoader classLoader, String str) {
        ycs0 ycs0Var = a;
        ycs0 ycs0Var2 = (ycs0) ycs0Var.get(classLoader);
        if (ycs0Var2 == null) {
            ycs0Var2 = new ycs0();
            ycs0Var.put(classLoader, ycs0Var2);
        }
        Class cls = (Class) ycs0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ycs0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(oyr.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(oyr.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment.InstantiationException(oyr.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.InstantiationException(oyr.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException(oyr.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException(oyr.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
