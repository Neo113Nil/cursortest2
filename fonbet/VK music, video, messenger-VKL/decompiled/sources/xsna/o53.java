package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class o53 {
    public static volatile o53 d;
    public static final Object e = new Object();

    @NonNull
    public final Context c;

    @NonNull
    public final HashSet b = new HashSet();

    @NonNull
    public final HashMap a = new HashMap();

    public o53(@NonNull Context context) {
        this.c = context.getApplicationContext();
    }

    @NonNull
    public static o53 d(@NonNull Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new o53(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a() {
        Context context = this.c;
        try {
            try {
                Trace.beginSection(ndp0.f("Startup"));
                b(context.getPackageManager().getProviderInfo(new ComponentName(context.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(@Nullable Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (lzw.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    c((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    @NonNull
    public final Object c(@NonNull Class cls, @NonNull HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.a;
        if (ndp0.e()) {
            try {
                Trace.beginSection(ndp0.f(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                lzw lzwVar = (lzw) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends lzw<?>>> dependencies = lzwVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends lzw<?>> cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            c(cls2, hashSet);
                        }
                    }
                }
                obj = lzwVar.create(this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
