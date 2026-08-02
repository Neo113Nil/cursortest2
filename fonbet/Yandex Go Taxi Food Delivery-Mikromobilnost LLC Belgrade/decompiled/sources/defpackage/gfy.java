package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class gfy {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            nzs.n(constructor.newInstance(obj));
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            int i2 = 0;
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String concat = cvu0.v(canonicalName, Extension.DOT_CHAR, "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                ny61.j(e);
                return 0;
            }
            HashMap hashMap2 = b;
            if (constructor != null) {
                hashMap2.put(cls, Collections.singletonList(constructor));
            } else if (!c.c.b(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && oey.class.isAssignableFrom(superclass)) {
                    if (b(superclass) != 1) {
                        arrayList = new ArrayList((Collection) hashMap2.get(superclass));
                    }
                }
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i2 < length) {
                        Class<?> cls2 = interfaces[i2];
                        if (cls2 != null && oey.class.isAssignableFrom(cls2)) {
                            if (b(cls2) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addAll((Collection) hashMap2.get(cls2));
                        }
                        i2++;
                    } else if (arrayList != null) {
                        hashMap2.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }

    public static final q c(oey oeyVar) {
        boolean z = oeyVar instanceof q;
        boolean z2 = oeyVar instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new f((DefaultLifecycleObserver) oeyVar, (q) oeyVar);
        }
        if (z2) {
            return new f((DefaultLifecycleObserver) oeyVar, null);
        }
        if (z) {
            return (q) oeyVar;
        }
        Class<?> cls = oeyVar.getClass();
        if (b(cls) != 2) {
            return new z(oeyVar);
        }
        List list = (List) b.get(cls);
        if (list.size() == 1) {
            a((Constructor) list.get(0), oeyVar);
            throw null;
        }
        int size = list.size();
        h[] hVarArr = new h[size];
        if (size <= 0) {
            return new d(hVarArr);
        }
        a((Constructor) list.get(0), oeyVar);
        throw null;
    }
}
