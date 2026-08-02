package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.app.p;
import androidx.recyclerview.widget.x0;
import coil3.disk.a;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lxj {
    public Object a;
    public boolean b;
    public final Object c;
    public final Object d;

    public lxj(NotificationChannelGroup notificationChannelGroup) {
        List list = Collections.EMPTY_LIST;
        String id = notificationChannelGroup.getId();
        this.d = list;
        id.getClass();
        this.c = id;
        this.a = notificationChannelGroup.getName();
        notificationChannelGroup.getDescription();
        this.b = notificationChannelGroup.isBlocked();
        List<NotificationChannel> channels = notificationChannelGroup.getChannels();
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : channels) {
            if (((String) this.c).equals(notificationChannel.getGroup())) {
                arrayList.add(new p(notificationChannel));
            }
        }
        this.d = arrayList;
    }

    public void a() {
        dyj dyjVar = (dyj) this.d;
        synchronized (dyjVar) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jl40.l(((rxj) this.c).g, this)) {
                    dyjVar.c(this, false);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        dyj dyjVar = (dyj) this.d;
        synchronized (dyjVar) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jl40.l(((rxj) this.c).g, this)) {
                    dyjVar.c(this, true);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(boolean z) {
        a aVar = (a) this.d;
        synchronized (aVar.A) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (jl40.l(((oxj) this.c).g, this)) {
                    a.a(aVar, this, z);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        rxj rxjVar = (rxj) this.c;
        if (jl40.l(rxjVar.g, this)) {
            dyj dyjVar = (dyj) this.d;
            if (dyjVar.E) {
                dyjVar.c(this, false);
            } else {
                rxjVar.f = true;
            }
        }
    }

    public oq90 e(int i) {
        oq90 oq90Var;
        a aVar = (a) this.d;
        synchronized (aVar.A) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.a)[i] = true;
            Object obj = ((oxj) this.c).d.get(i);
            w1r.a(aVar.J, (oq90) obj);
            oq90Var = (oq90) obj;
        }
        return oq90Var;
    }

    public synchronized void f() {
        try {
            if (this.b) {
                return;
            }
            Boolean l = l();
            this.a = l;
            if (l == null) {
                yhl yhlVar = new yhl(26);
                weo weoVar = (weo) ((vzu0) this.c);
                weoVar.a(weoVar.c, yhlVar);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean g() {
        Boolean bool;
        try {
            f();
            bool = (Boolean) this.a;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.j();
    }

    public uis0 h(int i) {
        dyj dyjVar = (dyj) this.d;
        synchronized (dyjVar) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!jl40.l(((rxj) this.c).g, this)) {
                    return new o16();
                }
                rxj rxjVar = (rxj) this.c;
                if (!rxjVar.e) {
                    ((boolean[]) this.a)[i] = true;
                }
                try {
                    return new ncp(dyjVar.b.D((oq90) rxjVar.d.get(i), false), new kn2(5, dyjVar, this));
                } catch (FileNotFoundException unused) {
                    return new o16();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ArrayList i() {
        rfw0 rfw0Var = (rfw0) this.d;
        ArrayList arrayList = (ArrayList) ((ThreadLocal) rfw0Var.b).get();
        ArrayList arrayList2 = (ArrayList) ((arrayList == null || arrayList.isEmpty()) ? ((ppr) rfw0Var.a).invoke() : ycc.z(arrayList));
        arrayList2.clear();
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r4.c(r8, r9) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (r4.a(r8, r9, r11) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(x0 x0Var, u0x u0xVar, int i, List list) {
        ArrayList arrayList;
        List list2 = (List) this.a;
        boolean z = this.b;
        if (z) {
            arrayList = i();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((y70) it.next()).b(u0xVar));
            }
        } else {
            arrayList = null;
        }
        v0x a = ((z0x) this.c).a(x0Var.y);
        if (!list.contains(tjd.a) || list.size() != 1) {
            if (list.isEmpty()) {
                a.c(x0Var, u0xVar);
            }
            a.b(x0Var, u0xVar);
        }
        if (z) {
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                ((y70) obj).a(x0Var, i, arrayList != null ? arrayList.get(i2) : null);
                i2 = i3;
            }
            m(arrayList);
        }
    }

    public void k(xa5 xa5Var) {
        Object removeFirst;
        synchronized (((mdz) this.a)) {
            ((x43) this.d).addLast(xa5Var);
            if (this.b) {
                return;
            }
            this.b = true;
            while (true) {
                synchronized (((mdz) this.a)) {
                    if (((x43) this.d).isEmpty()) {
                        this.b = false;
                        return;
                    }
                    removeFirst = ((x43) this.d).removeFirst();
                }
                ((tls) this.c).invoke(removeFirst);
            }
        }
    }

    public Boolean l() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.a aVar = ((FirebaseMessaging) this.d).a;
        aVar.a();
        Context context = aVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void m(ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.clear();
            rfw0 rfw0Var = (rfw0) this.d;
            rfw0Var.getClass();
            ThreadLocal threadLocal = (ThreadLocal) rfw0Var.b;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new ArrayList(1);
                threadLocal.set(obj);
            }
            ArrayList arrayList2 = (ArrayList) obj;
            if (arrayList2.size() < 1) {
                arrayList2.add(arrayList);
            }
        }
    }

    public boolean n(String str, String str2) {
        synchronized (this) {
            try {
                if (!((dlx) ((AtomicMarkableReference) this.c).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.c;
                atomicMarkableReference.set((dlx) atomicMarkableReference.getReference(), true);
                ymp0 ymp0Var = new ymp0(14, this);
                AtomicReference atomicReference = (AtomicReference) this.a;
                while (!atomicReference.compareAndSet(null, ymp0Var)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((jp21) this.d).b.b.a(ymp0Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String o() {
        if (!this.b) {
            this.b = true;
            o5a1 o5a1Var = (o5a1) this.d;
            this.a = o5a1Var.Kg().getString((String) this.c, null);
        }
        return (String) this.a;
    }

    public void p(String str) {
        SharedPreferences.Editor edit = ((o5a1) this.d).Kg().edit();
        edit.putString((String) this.c, str);
        edit.apply();
        this.a = str;
    }

    public lxj(tls tlsVar) {
        this.c = tlsVar;
        this.a = new mdz();
        this.d = new x43();
    }

    public lxj(z0x z0xVar, List list) {
        this.c = z0xVar;
        this.a = list;
        this.b = !list.isEmpty();
        this.d = new rfw0(new ppr(18, this));
    }

    public lxj(o5a1 o5a1Var, String str) {
        this.d = o5a1Var;
        cvw.i(str);
        this.c = str;
    }

    public lxj(String str, String str2, List list, boolean z) {
        this.c = str;
        this.a = str2;
        this.b = z;
        this.d = list;
    }

    public lxj(jp21 jp21Var, boolean z) {
        this.d = jp21Var;
        this.a = new AtomicReference(null);
        this.b = z;
        this.c = new AtomicMarkableReference(new dlx(z ? 8192 : 1024), false);
    }

    public lxj(a aVar, oxj oxjVar) {
        this.d = aVar;
        this.c = oxjVar;
        this.a = new boolean[2];
    }

    public lxj(FirebaseMessaging firebaseMessaging, vzu0 vzu0Var) {
        this.d = firebaseMessaging;
        this.c = vzu0Var;
    }

    public lxj(dyj dyjVar, rxj rxjVar) {
        boolean[] zArr;
        this.d = dyjVar;
        this.c = rxjVar;
        if (rxjVar.e) {
            zArr = null;
        } else {
            dyjVar.getClass();
            zArr = new boolean[2];
        }
        this.a = zArr;
    }
}
