package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class eqz0 implements pmz0 {
    public final Context a;
    public final nlz0 b;
    public final Looper e;
    public final amz0 f;
    public final amz0 g;
    public final Map h;

    @Nullable
    public final a.f j;

    @Nullable
    public Bundle k;
    public final Lock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    public ConnectionResult l = null;

    @Nullable
    public ConnectionResult m = null;
    public boolean n = false;
    public int p = 0;

    public eqz0(Context context, nlz0 nlz0Var, Lock lock, Looper looper, com.google.android.gms.common.a aVar, zk3 zk3Var, zk3 zk3Var2, olc olcVar, a.AbstractC0111a abstractC0111a, @Nullable a.f fVar, ArrayList arrayList, ArrayList arrayList2, zk3 zk3Var3, zk3 zk3Var4) {
        this.a = context;
        this.b = nlz0Var;
        this.o = lock;
        this.e = looper;
        this.j = fVar;
        this.f = new amz0(context, nlz0Var, lock, looper, aVar, zk3Var2, null, zk3Var4, null, arrayList2, new bqz0(this));
        this.g = new amz0(context, nlz0Var, lock, looper, aVar, zk3Var, olcVar, zk3Var3, abstractC0111a, arrayList, new dqz0(this));
        zk3 zk3Var5 = new zk3();
        Iterator it = ((zk3.c) zk3Var2.keySet()).iterator();
        while (it.hasNext()) {
            zk3Var5.put((a.c) it.next(), this.f);
        }
        Iterator it2 = ((zk3.c) zk3Var.keySet()).iterator();
        while (it2.hasNext()) {
            zk3Var5.put((a.c) it2.next(), this.g);
        }
        this.h = Collections.unmodifiableMap(zk3Var5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eqz0 j(Context context, nlz0 nlz0Var, ReentrantLock reentrantLock, Looper looper, com.google.android.gms.common.a aVar, zk3 zk3Var, olc olcVar, zk3 zk3Var2, a.AbstractC0111a abstractC0111a, ArrayList arrayList) {
        zk3 zk3Var3 = new zk3();
        zk3 zk3Var4 = new zk3();
        Iterator it = ((zk3.a) zk3Var.entrySet()).iterator();
        a.f fVar = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a.f fVar2 = (a.f) entry.getValue();
            if (true == fVar2.providesSignIn()) {
                fVar = fVar2;
            }
            if (fVar2.requiresSignIn()) {
                zk3Var3.put((a.c) entry.getKey(), fVar2);
            } else {
                zk3Var4.put((a.c) entry.getKey(), fVar2);
            }
        }
        exc0.k("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !zk3Var3.isEmpty());
        zk3 zk3Var5 = new zk3();
        zk3 zk3Var6 = new zk3();
        Iterator it2 = ((zk3.c) zk3Var2.keySet()).iterator();
        while (it2.hasNext()) {
            com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) it2.next();
            a.g gVar = aVar2.b;
            if (zk3Var3.containsKey(gVar)) {
                zk3Var5.put(aVar2, (Boolean) zk3Var2.get(aVar2));
            } else {
                if (!zk3Var4.containsKey(gVar)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                zk3Var6.put(aVar2, (Boolean) zk3Var2.get(aVar2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vpz0 vpz0Var = (vpz0) arrayList.get(i);
            com.google.android.gms.common.api.a aVar3 = vpz0Var.a;
            if (zk3Var5.containsKey(aVar3)) {
                arrayList2.add(vpz0Var);
            } else {
                if (!zk3Var6.containsKey(aVar3)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(vpz0Var);
            }
        }
        return new eqz0(context, nlz0Var, reentrantLock, looper, aVar, zk3Var3, zk3Var4, olcVar, abstractC0111a, fVar, arrayList2, arrayList3, zk3Var5, zk3Var6);
    }

    @Override // xsna.pmz0
    public final void a() {
        this.m = null;
        this.l = null;
        this.p = 0;
        this.f.a();
        this.g.a();
        f();
    }

    @Override // xsna.pmz0
    public final ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.pmz0
    public final void c() {
        this.f.c();
        this.g.c();
    }

    @Override // xsna.pmz0
    public final void d() {
        Lock lock = this.o;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z = this.p == 2;
                lock.unlock();
                this.g.a();
                this.m = new ConnectionResult(4);
                if (z) {
                    new com.google.android.gms.internal.base.zar(this.e).post(new zpz0(this));
                } else {
                    f();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.p == 1) goto L11;
     */
    @Override // xsna.pmz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        this.o.lock();
        try {
            boolean z = false;
            if (this.f.m instanceof ykz0) {
                if (!(this.g.m instanceof ykz0) && !i()) {
                }
                z = true;
            }
            return z;
        } finally {
            this.o.unlock();
        }
    }

    public final void f() {
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((xlj0) it.next()).onComplete();
        }
        set.clear();
    }

    @Override // xsna.pmz0
    public final boolean g(xlj0 xlj0Var) {
        Lock lock;
        this.o.lock();
        try {
            lock = this.o;
            lock.lock();
            try {
                boolean z = true;
                boolean z2 = this.p == 2;
                lock.unlock();
                if (!z2) {
                    if (e()) {
                    }
                    z = false;
                    return z;
                }
                amz0 amz0Var = this.g;
                if (!(amz0Var.m instanceof ykz0)) {
                    this.i.add(xlj0Var);
                    if (this.p == 0) {
                        this.p = 1;
                    }
                    this.m = null;
                    amz0Var.n();
                    return z;
                }
                z = false;
                return z;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.o;
        }
    }

    @Override // xsna.pmz0
    public final void h(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.g.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.f.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean i() {
        ConnectionResult connectionResult = this.m;
        return connectionResult != null && connectionResult.c == 4;
    }

    public final void k() {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3 = this.l;
        amz0 amz0Var = this.f;
        if (connectionResult3 == null || !connectionResult3.j()) {
            ConnectionResult connectionResult4 = this.l;
            amz0 amz0Var2 = this.g;
            if (connectionResult4 != null && (connectionResult2 = this.m) != null && connectionResult2.j()) {
                amz0Var2.a();
                ConnectionResult connectionResult5 = this.l;
                exc0.i(connectionResult5);
                l(connectionResult5);
                return;
            }
            ConnectionResult connectionResult6 = this.l;
            if (connectionResult6 == null || (connectionResult = this.m) == null) {
                return;
            }
            if (amz0Var2.o < amz0Var.o) {
                connectionResult6 = connectionResult;
            }
            l(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = this.m;
        if ((connectionResult7 == null || !connectionResult7.j()) && !i()) {
            ConnectionResult connectionResult8 = this.m;
            if (connectionResult8 != null) {
                if (this.p == 1) {
                    f();
                    return;
                } else {
                    l(connectionResult8);
                    amz0Var.a();
                    return;
                }
            }
            return;
        }
        int i = this.p;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.p = 0;
            } else {
                nlz0 nlz0Var = this.b;
                exc0.i(nlz0Var);
                nlz0Var.g(this.k);
            }
        }
        f();
        this.p = 0;
    }

    public final void l(ConnectionResult connectionResult) {
        int i = this.p;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = 0;
            }
            this.b.m(connectionResult);
        }
        f();
        this.p = 0;
    }

    @Override // xsna.pmz0
    public final void n() {
        this.p = 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.f.n();
        this.g.n();
    }

    @Override // xsna.pmz0
    public final com.google.android.gms.common.api.internal.a o(@NonNull com.google.android.gms.common.api.internal.a aVar) {
        amz0 amz0Var = (amz0) this.h.get(aVar.getClientKey());
        exc0.j(amz0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!amz0Var.equals(this.g)) {
            amz0 amz0Var2 = this.f;
            amz0Var2.getClass();
            aVar.zak();
            return amz0Var2.m.o(aVar);
        }
        if (i()) {
            a.f fVar = this.j;
            aVar.setFailedResult(new Status(4, (String) null, fVar == null ? null : com.google.android.gms.internal.base.zan.zaa(this.a, System.identityHashCode(this.b), fVar.getSignInIntent(), com.google.android.gms.internal.base.zan.zaa | 134217728)));
            return aVar;
        }
        amz0 amz0Var3 = this.g;
        amz0Var3.getClass();
        aVar.zak();
        return amz0Var3.m.o(aVar);
    }

    @Override // xsna.pmz0
    public final com.google.android.gms.common.api.internal.a p(@NonNull com.google.android.gms.common.api.internal.a aVar) {
        amz0 amz0Var = (amz0) this.h.get(aVar.getClientKey());
        exc0.j(amz0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!amz0Var.equals(this.g)) {
            amz0 amz0Var2 = this.f;
            amz0Var2.getClass();
            aVar.zak();
            amz0Var2.m.p(aVar);
            return aVar;
        }
        if (i()) {
            a.f fVar = this.j;
            aVar.setFailedResult(new Status(4, (String) null, fVar == null ? null : com.google.android.gms.internal.base.zan.zaa(this.a, System.identityHashCode(this.b), fVar.getSignInIntent(), com.google.android.gms.internal.base.zan.zaa | 134217728)));
            return aVar;
        }
        amz0 amz0Var3 = this.g;
        amz0Var3.getClass();
        aVar.zak();
        amz0Var3.m.p(aVar);
        return aVar;
    }
}
