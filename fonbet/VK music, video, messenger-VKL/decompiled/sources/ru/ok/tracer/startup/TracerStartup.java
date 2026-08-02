package ru.ok.tracer.startup;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.utils.Logger;
import xsna.brm0;

/* compiled from: TracerStartup.kt */
/* loaded from: classes11.dex */
public final class TracerStartup {
    private static final String META_DATA_PREFIX = "ru.ok.tracer.startup.Initializer@";
    public static final TracerStartup INSTANCE = new TracerStartup();
    private static final AtomicReference<Context> prevAppContext = new AtomicReference<>();

    private TracerStartup() {
    }

    public static final void init(Context context) {
        String string;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("applicationContext required");
        }
        AtomicReference<Context> atomicReference = prevAppContext;
        while (!atomicReference.compareAndSet(null, applicationContext)) {
            if (atomicReference.get() != null) {
                if (applicationContext != prevAppContext.get()) {
                    throw new IllegalStateException("Trying to initialize again with different app context");
                }
                return;
            }
        }
        if (AppTokenUtils.isTracerBuildDisabled(context)) {
            Logger.d$default("Tracer disabled on build. Skipping initialization", null, 2, null);
            Tracer.disable();
            return;
        }
        Bundle bundle = PackageManagerCompat.getApplicationInfoCompat(applicationContext.getPackageManager(), applicationContext.getPackageName(), 128).metaData;
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            if (brm0.B(str, META_DATA_PREFIX, false) && (string = bundle.getString(str)) != null) {
                arrayList.add(Class.forName(string));
            }
        }
        if (arrayList.isEmpty()) {
            Logger.e$default("Couldn't find initializer classes. Did you remove it from manifest", null, 2, null);
            return;
        }
        Iterator<T> it = INSTANCE.orderInitializers(arrayList).iterator();
        while (it.hasNext()) {
            ((Initializer) it.next()).create(applicationContext);
        }
    }

    private final List<Initializer<?>> orderInitializers(Collection<? extends Class<? extends Initializer<?>>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends Class<? extends Initializer<?>>> it = collection.iterator();
        while (it.hasNext()) {
            INSTANCE.orderInitializersInto(arrayList, it.next());
        }
        return arrayList;
    }

    private final void orderInitializersInto(List<Initializer<?>> list, Class<? extends Initializer<?>> cls) {
        List<Initializer<?>> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((Initializer) it.next()).getClass() == cls) {
                    return;
                }
            }
        }
        Initializer<?> newInstance = cls.newInstance();
        Iterator<Class<? extends Initializer<?>>> it2 = newInstance.dependencies().iterator();
        while (it2.hasNext()) {
            orderInitializersInto(list, it2.next());
        }
        list.add(newInstance);
    }
}
