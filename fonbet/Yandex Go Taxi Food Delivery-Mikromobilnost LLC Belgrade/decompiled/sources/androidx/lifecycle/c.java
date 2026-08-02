package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.ny61;
import defpackage.pey;
import defpackage.qir;
import defpackage.yci0;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class c {
    public static final c c = new c();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void c(HashMap hashMap, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) hashMap.get(bVar);
        if (event2 != null && event != event2) {
            qir.r("Method ", bVar.b.getName(), " in ", cls.getName(), " already declared with different @OnLifecycleEvent value: previous value ", event2, ", new value ", event);
        } else if (event2 == null) {
            hashMap.put(bVar, event);
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            a aVar = (a) hashMap2.get(superclass);
            if (aVar == null) {
                aVar = a(superclass, null);
            }
            hashMap.putAll(aVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVar2 = (a) hashMap2.get(cls2);
            if (aVar2 == null) {
                aVar2 = a(cls2, null);
            }
            for (Map.Entry entry : aVar2.b.entrySet()) {
                c(hashMap, (b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                yci0.p("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
                return null;
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            w wVar = (w) method.getAnnotation(w.class);
            if (wVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!pey.class.isAssignableFrom(parameterTypes[0])) {
                        ny61.g("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                Lifecycle.Event value = wVar.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        ny61.g("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        ny61.g("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    ny61.g("cannot have more than 2 params");
                    return null;
                }
                c(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        a aVar3 = new a(hashMap);
        hashMap2.put(cls, aVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar3;
    }

    public final boolean b(Class cls) {
        HashMap hashMap = this.b;
        Boolean bool = (Boolean) hashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((w) method.getAnnotation(w.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            hashMap.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            yci0.p("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            return false;
        }
    }
}
