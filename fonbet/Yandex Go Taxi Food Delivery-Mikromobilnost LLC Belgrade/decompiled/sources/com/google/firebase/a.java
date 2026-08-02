package com.google.firebase;

import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import defpackage.c1d;
import defpackage.cot;
import defpackage.cvw;
import defpackage.gtq0;
import defpackage.h1d;
import defpackage.ich;
import defpackage.j0d;
import defpackage.j3y;
import defpackage.kjz;
import defpackage.lb7;
import defpackage.lcr;
import defpackage.m1d;
import defpackage.mw4;
import defpackage.n1d;
import defpackage.u53;
import defpackage.ung;
import defpackage.vbr;
import defpackage.w53;
import defpackage.wbr;
import defpackage.wwg;
import defpackage.y2u0;
import defpackage.zvf0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a {
    public static final Object k = new Object();
    public static final w53 l = new w53();
    public final Context a;
    public final String b;
    public final lcr c;
    public final n1d d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final j3y g;
    public final zvf0 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public a(lcr lcrVar, Context context, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        cvw.i(str);
        this.b = str;
        cvw.l(lcrVar);
        this.c = lcrVar;
        y2u0 startupTime = FirebaseInitProvider.getStartupTime();
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList p = new lb7(18, context, new cot(13, ComponentDiscoveryService.class)).p();
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(p);
        int i = 1;
        arrayList.add(new c1d(i, new FirebaseCommonRegistrar()));
        arrayList.add(new c1d(i, new ExecutorsRegistrar()));
        arrayList2.add(j0d.c(context, Context.class, new Class[0]));
        arrayList2.add(j0d.c(this, a.class, new Class[0]));
        arrayList2.add(j0d.c(lcrVar, lcr.class, new Class[0]));
        h1d h1dVar = new h1d();
        if (wwg.w(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            arrayList2.add(j0d.c(startupTime, y2u0.class, new Class[0]));
        }
        n1d n1dVar = new n1d(uiExecutor, arrayList, arrayList2, h1dVar);
        this.d = n1dVar;
        Trace.endSection();
        this.g = new j3y(new m1d(2, this, context));
        this.h = n1dVar.d(ich.class);
        vbr vbrVar = new vbr(this);
        a();
        if (atomicBoolean.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        copyOnWriteArrayList.add(vbrVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((u53) l.values()).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    aVar.a();
                    arrayList.add(aVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static a d() {
        a aVar;
        synchronized (k) {
            try {
                aVar = (a) l.get("[DEFAULT]");
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (gtq0.o == null) {
                        gtq0.o = Application.getProcessName();
                    }
                    sb.append(gtq0.o);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((ich) aVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static a e(String str) {
        a aVar;
        String str2;
        synchronized (k) {
            try {
                aVar = (a) l.get(str.trim());
                if (aVar == null) {
                    ArrayList c = c();
                    if (c.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(Extension.FIX_SPACE, c);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((ich) aVar.h.get()).b();
            } finally {
            }
        }
        return aVar;
    }

    public static a h(lcr lcrVar, Context context, String str) {
        a aVar;
        AtomicReference atomicReference = wbr.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = wbr.a;
            if (atomicReference2.get() == null) {
                wbr wbrVar = new wbr();
                while (true) {
                    if (atomicReference2.compareAndSet(null, wbrVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(wbrVar);
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
            w53 w53Var = l;
            cvw.n("FirebaseApp name " + trim + " already exists!", !w53Var.containsKey(trim));
            cvw.m(context, "Application context cannot be null.");
            aVar = new a(lcrVar, context, trim);
            w53Var.put(trim, aVar);
        }
        aVar.g();
        return aVar;
    }

    public static a i(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return d();
                }
                lcr a = lcr.a(context);
                if (a == null) {
                    return null;
                }
                return h(a, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        cvw.n("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.a();
        return this.b.equals(aVar.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(mw4.b(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(mw4.b(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        Context context = this.a;
        boolean w = wwg.w(context);
        String str = this.b;
        if (!w) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            FirebaseApp$UserUnlockReceiver.ensureReceiverRegistered(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.i("[DEFAULT]".equals(str));
        ((ich) this.h.get()).b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean j() {
        boolean z;
        a();
        ung ungVar = (ung) this.g.get();
        synchronized (ungVar) {
            z = ungVar.a;
        }
        return z;
    }

    public final String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.b, "name");
        kjzVar.b(this.c, "options");
        return kjzVar.toString();
    }
}
