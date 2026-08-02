package xsna;

import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: LazyStorage.java */
/* loaded from: classes11.dex */
public final class yxy {
    public static final Logger a = Logger.getLogger(yxy.class.getName());
    public static final ipj b;

    static {
        ipj ipjVar;
        ArrayList arrayList;
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!BuildConfig.FLAVOR.equals(property)) {
            ClassLoader classLoader = yxy.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(jpj.class, classLoader).iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (!arrayList2.isEmpty()) {
                        if (!property.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.contextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                                    ipjVar = uqo0.INSTANCE;
                                    break;
                                }
                                jpj jpjVar = (jpj) it2.next();
                                if (jpjVar.getClass().getName().equals(property)) {
                                    ipjVar = jpjVar.get();
                                    break;
                                }
                            }
                        } else if (arrayList2.size() == 1) {
                            ipjVar = ((jpj) arrayList2.get(0)).get();
                        } else {
                            atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.contextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                            ipjVar = uqo0.INSTANCE;
                        }
                    } else {
                        ipjVar = uqo0.INSTANCE;
                    }
                } else {
                    jpj jpjVar2 = (jpj) it.next();
                    if (jpjVar2.getClass().getName().equals("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider")) {
                        ipjVar = jpjVar2.get();
                        break;
                    }
                    arrayList2.add(jpjVar2);
                }
            }
        } else {
            ipjVar = uqo0.INSTANCE;
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            ipjVar = npm0.h(ipjVar);
        }
        synchronized (kpj.b) {
            arrayList = kpj.a;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ipjVar = (ipj) ((Function) it3.next()).apply(ipjVar);
        }
        b = ipjVar;
        synchronized (kpj.b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
