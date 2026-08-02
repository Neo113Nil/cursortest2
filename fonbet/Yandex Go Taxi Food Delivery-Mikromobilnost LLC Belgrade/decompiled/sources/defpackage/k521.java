package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class k521 {
    public static final LinkedHashMap a = new LinkedHashMap();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static final LinkedHashMap d = new LinkedHashMap();

    public static View a(Class cls, Context context, int i, int i2) {
        Constructor e = e(cls);
        if (e != null) {
            return (View) e.newInstance(context, null, Integer.valueOf(i), Integer.valueOf(i2));
        }
        Constructor d2 = d(cls);
        if (d2 != null) {
            return (View) d2.newInstance(context, null, Integer.valueOf(i));
        }
        LinkedHashMap linkedHashMap = c;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor == null) {
            try {
                constructor = cls.getConstructor(Context.class);
                linkedHashMap.put(cls, constructor);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
        }
        if (constructor != null) {
            return (View) constructor.newInstance(context);
        }
        Constructor c2 = c(cls);
        if (c2 != null) {
            return (View) c2.newInstance(context, null);
        }
        w511.j("Can't create view ", cls, ", not suitable constructor is found");
        return null;
    }

    public static View b(Context context, Class cls) {
        LinkedHashMap linkedHashMap = c;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor == null) {
            try {
                constructor = cls.getConstructor(Context.class);
                linkedHashMap.put(cls, constructor);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
        }
        if (constructor != null) {
            return (View) constructor.newInstance(context);
        }
        Constructor e = e(cls);
        if (e != null) {
            return (View) e.newInstance(context, null, 0, 0);
        }
        Constructor d2 = d(cls);
        if (d2 != null) {
            return (View) d2.newInstance(context, null, 0);
        }
        Constructor c2 = c(cls);
        if (c2 != null) {
            return (View) c2.newInstance(context, null);
        }
        w511.j("Can't create view ", cls, ", no suitable constructor is found");
        return null;
    }

    public static Constructor c(Class cls) {
        LinkedHashMap linkedHashMap = d;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor constructor2 = cls.getConstructor(Context.class, AttributeSet.class);
            linkedHashMap.put(cls, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Constructor d(Class cls) {
        LinkedHashMap linkedHashMap = b;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor constructor2 = cls.getConstructor(Context.class, AttributeSet.class, Integer.TYPE);
            linkedHashMap.put(cls, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Constructor e(Class cls) {
        LinkedHashMap linkedHashMap = a;
        Constructor constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor != null) {
            return constructor;
        }
        try {
            Class cls2 = Integer.TYPE;
            Constructor constructor2 = cls.getConstructor(Context.class, AttributeSet.class, cls2, cls2);
            linkedHashMap.put(cls, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
