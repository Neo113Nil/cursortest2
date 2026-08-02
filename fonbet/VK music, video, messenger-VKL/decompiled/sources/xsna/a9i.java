package xsna;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: ComponentDiscovery.java */
/* loaded from: classes.dex */
public final class a9i<T> {
    public final Context a;
    public final a b;

    /* compiled from: ComponentDiscovery.java */
    public static class a {
        public final Class<? extends Service> a;

        public a(Class cls) {
            this.a = cls;
        }
    }

    public a9i(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final ArrayList a() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = this.a;
        Class<? extends Service> cls = this.b.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (final String str2 : arrayList) {
            arrayList2.add(new f9e0() { // from class: xsna.z8i
                @Override // xsna.f9e0
                public final Object get() {
                    String str3 = str2;
                    try {
                        Class<?> cls2 = Class.forName(str3);
                        if (ComponentRegistrar.class.isAssignableFrom(cls2)) {
                            return (ComponentRegistrar) cls2.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new InvalidRegistrarException("Class " + str3 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        return null;
                    } catch (IllegalAccessException e) {
                        throw new InvalidRegistrarException(zr.a("Could not instantiate ", str3, "."), e);
                    } catch (InstantiationException e2) {
                        throw new InvalidRegistrarException(zr.a("Could not instantiate ", str3, "."), e2);
                    } catch (NoSuchMethodException e3) {
                        throw new InvalidRegistrarException(go9.b("Could not instantiate ", str3), e3);
                    } catch (InvocationTargetException e4) {
                        throw new InvalidRegistrarException(go9.b("Could not instantiate ", str3), e4);
                    }
                }
            });
        }
        return arrayList2;
    }
}
