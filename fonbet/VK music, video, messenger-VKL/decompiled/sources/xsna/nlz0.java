package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zabr;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import xsna.x2o0;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class nlz0 extends com.google.android.gms.common.api.c implements omz0 {
    public final ReentrantLock c;
    public final kpz0 d;
    public final int f;
    public final Context g;
    public final Looper h;
    public volatile boolean j;
    public final llz0 m;
    public final GoogleApiAvailability n;

    @Nullable
    public zabr o;
    public final zk3 p;
    public final olc r;
    public final zk3 s;
    public final a.AbstractC0111a t;
    public final ArrayList v;
    public Integer w;
    public final mnz0 y;

    @Nullable
    public pmz0 e = null;
    public final LinkedList i = new LinkedList();
    public final long k = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    public final long l = 5000;
    public Set q = new HashSet();
    public final fhz u = new fhz();

    @Nullable
    public HashSet x = null;

    public nlz0(Context context, ReentrantLock reentrantLock, Looper looper, olc olcVar, GoogleApiAvailability googleApiAvailability, a.AbstractC0111a abstractC0111a, zk3 zk3Var, ArrayList arrayList, ArrayList arrayList2, zk3 zk3Var2, int i, int i2, ArrayList arrayList3) {
        this.w = null;
        d9a d9aVar = new d9a(this);
        this.g = context;
        this.c = reentrantLock;
        this.d = new kpz0(looper, d9aVar);
        this.h = looper;
        this.m = new llz0(this, looper);
        this.n = googleApiAvailability;
        this.f = i;
        if (i >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.s = zk3Var;
        this.p = zk3Var2;
        this.v = arrayList3;
        this.y = new mnz0();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c.b bVar = (c.b) it.next();
            kpz0 kpz0Var = this.d;
            kpz0Var.getClass();
            exc0.i(bVar);
            synchronized (kpz0Var.j) {
                try {
                    ArrayList arrayList4 = kpz0Var.c;
                    if (arrayList4.contains(bVar)) {
                        new StringBuilder(String.valueOf(bVar).length() + 62);
                    } else {
                        arrayList4.add(bVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (kpz0Var.b.a()) {
                com.google.android.gms.internal.base.zar zarVar = kpz0Var.i;
                zarVar.sendMessage(zarVar.obtainMessage(1, bVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.d.a((c.InterfaceC0114c) it2.next());
        }
        this.r = olcVar;
        this.t = abstractC0111a;
    }

    public static int q(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            z2 |= fVar.requiresSignIn();
            z3 |= fVar.providesSignIn();
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, R extends qdg0, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(@NonNull T t) {
        com.google.android.gms.common.api.a<?> api = t.getApi();
        boolean containsKey = this.p.containsKey(t.getClientKey());
        String str = api != null ? api.c : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        exc0.a(sb.toString(), containsKey);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            pmz0 pmz0Var = this.e;
            if (pmz0Var == null) {
                this.i.add(t);
            } else {
                t = (T) pmz0Var.p(t);
            }
            reentrantLock.unlock();
            return t;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends qdg0, A>> T b(@NonNull T t) {
        zk3 zk3Var = this.p;
        com.google.android.gms.common.api.a<?> api = t.getApi();
        boolean containsKey = zk3Var.containsKey(t.getClientKey());
        String str = api != null ? api.c : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        exc0.a(sb.toString(), containsKey);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            pmz0 pmz0Var = this.e;
            if (pmz0Var == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.j) {
                return (T) pmz0Var.o(t);
            }
            LinkedList linkedList = this.i;
            linkedList.add(t);
            while (!linkedList.isEmpty()) {
                com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) linkedList.remove();
                mnz0 mnz0Var = this.y;
                mnz0Var.a.add(aVar);
                aVar.zan(mnz0Var.b);
                aVar.setFailedResult(Status.h);
            }
            reentrantLock.unlock();
            return t;
        } finally {
            this.c.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.c
    @NonNull
    public final a.f c(@NonNull a.g gVar) {
        a.f fVar = (a.f) this.p.get(gVar);
        exc0.j(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper d() {
        return this.h;
    }

    @Override // xsna.omz0
    public final void e(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.j) {
                this.j = true;
                if (this.o == null) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.n;
                        Context applicationContext = this.g.getApplicationContext();
                        mlz0 mlz0Var = new mlz0(this);
                        googleApiAvailability.getClass();
                        this.o = GoogleApiAvailability.j(applicationContext, mlz0Var);
                    } catch (SecurityException unused) {
                    }
                }
                llz0 llz0Var = this.m;
                llz0Var.sendMessageDelayed(llz0Var.obtainMessage(1), this.k);
                llz0Var.sendMessageDelayed(llz0Var.obtainMessage(2), this.l);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.y.a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(mnz0.c);
        }
        kpz0 kpz0Var = this.d;
        com.google.android.gms.internal.base.zar zarVar = kpz0Var.i;
        if (Looper.myLooper() != zarVar.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        zarVar.removeMessages(1);
        synchronized (kpz0Var.j) {
            try {
                kpz0Var.h = true;
                ArrayList arrayList = kpz0Var.c;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = kpz0Var.g;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c.b bVar = (c.b) it.next();
                    if (!kpz0Var.f || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(bVar)) {
                        bVar.onConnectionSuspended(i);
                    }
                }
                kpz0Var.d.clear();
                kpz0Var.h = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        kpz0Var.f = false;
        kpz0Var.g.incrementAndGet();
        if (i == 2) {
            t();
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean f(xlj0 xlj0Var) {
        pmz0 pmz0Var = this.e;
        return pmz0Var != null && pmz0Var.g(xlj0Var);
    }

    @Override // xsna.omz0
    public final void g(@Nullable Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.i;
            if (linkedList.isEmpty()) {
                break;
            } else {
                b((com.google.android.gms.common.api.internal.a) linkedList.remove());
            }
        }
        kpz0 kpz0Var = this.d;
        com.google.android.gms.internal.base.zar zarVar = kpz0Var.i;
        if (Looper.myLooper() != zarVar.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (kpz0Var.j) {
            try {
                exc0.l(!kpz0Var.h);
                zarVar.removeMessages(1);
                kpz0Var.h = true;
                ArrayList arrayList = kpz0Var.d;
                exc0.l(arrayList.isEmpty());
                ArrayList arrayList2 = new ArrayList(kpz0Var.c);
                AtomicInteger atomicInteger = kpz0Var.g;
                int i = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c.b bVar = (c.b) it.next();
                    if (!kpz0Var.f || !kpz0Var.b.a() || atomicInteger.get() != i) {
                        break;
                    } else if (!arrayList.contains(bVar)) {
                        bVar.f(bundle);
                    }
                }
                arrayList.clear();
                kpz0Var.h = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final void h() {
        pmz0 pmz0Var = this.e;
        if (pmz0Var != null) {
            pmz0Var.d();
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final ehz i(@NonNull x2o0.a aVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            fhz fhzVar = this.u;
            Looper looper = this.h;
            Set set = fhzVar.a;
            ehz a = fhz.a(looper, aVar, "NO_TYPE");
            set.add(a);
            return a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final void j(knz0 knz0Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.x == null) {
                this.x = new HashSet();
            }
            this.x.add(knz0Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r4 != false) goto L20;
     */
    @Override // com.google.android.gms.common.api.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(knz0 knz0Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            HashSet hashSet = this.x;
            if (hashSet == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (hashSet.remove(knz0Var)) {
                reentrantLock.lock();
                try {
                    HashSet hashSet2 = this.x;
                    if (hashSet2 == null) {
                        reentrantLock.unlock();
                    } else {
                        boolean isEmpty = hashSet2.isEmpty();
                        reentrantLock.unlock();
                    }
                    pmz0 pmz0Var = this.e;
                    if (pmz0Var != null) {
                        pmz0Var.c();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f >= 0) {
                exc0.k("Sign-in mode should have been set explicitly by auto-manage.", this.w != null);
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(q(this.p.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.w;
            exc0.i(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i = intValue;
                } else if (intValue != 2) {
                    i = intValue;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i);
                    exc0.a(sb.toString(), z);
                    s(i);
                    t();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 22);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                exc0.a(sb2.toString(), z);
                s(i);
                t();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.omz0
    public final void m(ConnectionResult connectionResult) {
        GoogleApiAvailability googleApiAvailability = this.n;
        Context context = this.g;
        int i = connectionResult.c;
        googleApiAvailability.getClass();
        AtomicBoolean atomicBoolean = fau.a;
        if (!(i == 18 ? true : i == 1 ? fau.c(context) : false)) {
            p();
        }
        if (this.j) {
            return;
        }
        kpz0 kpz0Var = this.d;
        com.google.android.gms.internal.base.zar zarVar = kpz0Var.i;
        if (Looper.myLooper() != zarVar.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        zarVar.removeMessages(1);
        synchronized (kpz0Var.j) {
            try {
                ArrayList arrayList = kpz0Var.e;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = kpz0Var.g;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c.InterfaceC0114c interfaceC0114c = (c.InterfaceC0114c) it.next();
                    if (kpz0Var.f && atomicInteger.get() == i2) {
                        if (arrayList.contains(interfaceC0114c)) {
                            interfaceC0114c.g(connectionResult);
                        }
                    }
                }
            } finally {
            }
        }
        kpz0Var.f = false;
        kpz0Var.g.incrementAndGet();
    }

    public final void n() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.y.a();
            pmz0 pmz0Var = this.e;
            if (pmz0Var != null) {
                pmz0Var.a();
            }
            Set set = this.u.a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ehz) it.next()).a();
            }
            set.clear();
            LinkedList<com.google.android.gms.common.api.internal.a> linkedList = this.i;
            for (com.google.android.gms.common.api.internal.a aVar : linkedList) {
                aVar.zan(null);
                aVar.cancel();
            }
            linkedList.clear();
            if (this.e != null) {
                p();
                kpz0 kpz0Var = this.d;
                kpz0Var.f = false;
                kpz0Var.g.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void o(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.g);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.j);
        printWriter.append(" mWorkQueue.size()=").print(this.i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.y.a.size());
        pmz0 pmz0Var = this.e;
        if (pmz0Var != null) {
            pmz0Var.h(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean p() {
        if (!this.j) {
            return false;
        }
        this.j = false;
        llz0 llz0Var = this.m;
        llz0Var.removeMessages(2);
        llz0Var.removeMessages(1);
        zabr zabrVar = this.o;
        if (zabrVar != null) {
            zabrVar.b();
            this.o = null;
        }
        return true;
    }

    public final /* synthetic */ void r() {
        this.c.lock();
        try {
            if (this.j) {
                t();
            }
        } finally {
            this.c.unlock();
        }
    }

    public final void s(int i) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.w.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i != 1 ? i != 2 ? i != 3 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            throw new IllegalStateException(h5s.d(new StringBuilder(str.length() + str2.length() + 51), "Cannot use sign-in mode: ", str2, ". Mode was already set to ", str));
        }
        if (this.e != null) {
            return;
        }
        zk3 zk3Var = this.p;
        Iterator it = ((zk3.e) zk3Var.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            z |= fVar.requiresSignIn();
            z2 |= fVar.providesSignIn();
        }
        int intValue2 = this.w.intValue();
        ArrayList arrayList = this.v;
        zk3 zk3Var2 = this.s;
        boolean z3 = z;
        ReentrantLock reentrantLock = this.c;
        if (intValue2 != 1) {
            if (intValue2 == 2 && z3) {
                this.e = eqz0.j(this.g, this, reentrantLock, this.h, this.n, zk3Var, this.r, zk3Var2, this.t, arrayList);
                return;
            }
        } else {
            if (!z3) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.e = new amz0(this.g, this, reentrantLock, this.h, this.n, zk3Var, this.r, zk3Var2, this.t, arrayList, this);
    }

    public final void t() {
        this.d.f = true;
        pmz0 pmz0Var = this.e;
        exc0.i(pmz0Var);
        pmz0Var.n();
    }
}
