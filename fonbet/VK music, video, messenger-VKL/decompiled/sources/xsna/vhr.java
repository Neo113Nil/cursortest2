package xsna;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9i;
import xsna.dq70;
import xsna.gw5;
import xsna.zk3;

/* compiled from: FirebaseApp.java */
/* loaded from: classes.dex */
public final class vhr {
    public static final Object k = new Object();
    public static final zk3 l = new zk3();
    public final Context a;
    public final String b;
    public final ejr c;
    public final aai d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final cqy<xtk> g;
    public final f9e0<com.google.firebase.heartbeatinfo.a> h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    /* compiled from: FirebaseApp.java */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    public static class b implements gw5.a {
        public static final AtomicReference<b> a = new AtomicReference<>();

        @Override // xsna.gw5.a
        public final void a(boolean z) {
            synchronized (vhr.k) {
                try {
                    Iterator it = new ArrayList(vhr.l.values()).iterator();
                    while (it.hasNext()) {
                        vhr vhrVar = (vhr) it.next();
                        if (vhrVar.e.get()) {
                            Iterator it2 = vhrVar.i.iterator();
                            while (it2.hasNext()) {
                                ((a) it2.next()).a(z);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* loaded from: classes13.dex */
    public static class c extends BroadcastReceiver {
        public static final AtomicReference<c> b = new AtomicReference<>();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static void a(Context context) {
            AtomicReference<c> atomicReference = b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (vhr.k) {
                try {
                    Iterator it = ((zk3.e) vhr.l.values()).iterator();
                    while (it.hasNext()) {
                        ((vhr) it.next()).g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    public vhr(final Context context, String str, ejr ejrVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        exc0.f(str);
        this.b = str;
        this.c = ejrVar;
        vn5 vn5Var = FirebaseInitProvider.b;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList a2 = new a9i(context, new a9i.a(ComponentDiscoveryService.class)).a();
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(a2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList.add(new f9e0() { // from class: xsna.z9i
            @Override // xsna.f9e0
            public final Object get() {
                return ComponentRegistrar.this;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList.add(new f9e0() { // from class: xsna.z9i
            @Override // xsna.f9e0
            public final Object get() {
                return ComponentRegistrar.this;
            }
        });
        arrayList2.add(i8i.c(context, Context.class, new Class[0]));
        arrayList2.add(i8i.c(this, vhr.class, new Class[0]));
        arrayList2.add(i8i.c(ejrVar, ejr.class, new Class[0]));
        i9i i9iVar = new i9i();
        if (wkq0.a(context) && FirebaseInitProvider.c.get()) {
            arrayList2.add(i8i.c(vn5Var, frk0.class, new Class[0]));
        }
        aai aaiVar = new aai(uiExecutor, arrayList, arrayList2, i9iVar);
        this.d = aaiVar;
        Trace.endSection();
        this.g = new cqy<>(new f9e0() { // from class: xsna.thr
            @Override // xsna.f9e0
            public final Object get() {
                vhr vhrVar = vhr.this;
                return new xtk(context, vhrVar.f(), (gfe0) vhrVar.d.a(gfe0.class));
            }
        });
        this.h = aaiVar.e(com.google.firebase.heartbeatinfo.a.class);
        a aVar = new a() { // from class: xsna.uhr
            @Override // xsna.vhr.a
            public final void a(boolean z) {
                if (z) {
                    return;
                }
                vhr.this.h.get().c();
            }
        };
        a();
        if (atomicBoolean.get()) {
            gw5.f.b.get();
        }
        copyOnWriteArrayList.add(aVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((zk3.e) l.values()).iterator();
                while (it.hasNext()) {
                    vhr vhrVar = (vhr) it.next();
                    vhrVar.a();
                    arrayList.add(vhrVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static vhr d() {
        vhr vhrVar;
        synchronized (k) {
            try {
                vhrVar = (vhr) l.get("[DEFAULT]");
                if (vhrVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ahd0.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                vhrVar.h.get().c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static vhr e() {
        vhr vhrVar;
        String str;
        synchronized (k) {
            try {
                vhrVar = (vhr) l.get("libverify");
                if (vhrVar == null) {
                    ArrayList c2 = c();
                    if (c2.isEmpty()) {
                        str = "";
                    } else {
                        str = "Available app names: " + TextUtils.join(", ", c2);
                    }
                    throw new IllegalStateException("FirebaseApp with name libverify doesn't exist. " + str);
                }
                vhrVar.h.get().c();
            } finally {
            }
        }
        return vhrVar;
    }

    @NonNull
    public static vhr h(@NonNull Context context, @NonNull String str, @NonNull ejr ejrVar) {
        vhr vhrVar;
        AtomicReference<b> atomicReference = b.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        gw5.a(application);
                        gw5 gw5Var = gw5.f;
                        gw5Var.getClass();
                        synchronized (gw5Var) {
                            gw5Var.d.add(bVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            zk3 zk3Var = l;
            exc0.k("FirebaseApp name " + trim + " already exists!", !zk3Var.containsKey(trim));
            exc0.j(context, "Application context cannot be null.");
            vhrVar = new vhr(context, trim, ejrVar);
            zk3Var.put(trim, vhrVar);
        }
        vhrVar.g();
        return vhrVar;
    }

    public final void a() {
        exc0.k("FirebaseApp was deleted", !this.f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vhr)) {
            return false;
        }
        vhr vhrVar = (vhr) obj;
        vhrVar.a();
        return this.b.equals(vhrVar.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(k46.c(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(k46.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        Context context = this.a;
        if (!wkq0.a(context)) {
            a();
            c.a(context);
            return;
        }
        a();
        a();
        this.d.i("[DEFAULT]".equals(this.b));
        this.h.get().c();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        boolean z;
        a();
        xtk xtkVar = this.g.get();
        synchronized (xtkVar) {
            z = xtkVar.b;
        }
        return z;
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "name");
        aVar.a(this.c, SignalingProtocol.KEY_OPTIONS);
        return aVar.toString();
    }
}
