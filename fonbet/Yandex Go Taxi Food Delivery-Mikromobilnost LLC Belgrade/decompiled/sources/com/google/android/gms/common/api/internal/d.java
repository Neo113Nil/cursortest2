package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import defpackage.cvw;
import defpackage.cy81;
import defpackage.dy81;
import defpackage.ey81;
import defpackage.fwt;
import defpackage.gnc;
import defpackage.h091;
import defpackage.hz81;
import defpackage.jm2;
import defpackage.km2;
import defpackage.lta0;
import defpackage.ny61;
import defpackage.om2;
import defpackage.ouy;
import defpackage.oy81;
import defpackage.pm2;
import defpackage.puy;
import defpackage.px81;
import defpackage.sl81;
import defpackage.t091;
import defpackage.ty81;
import defpackage.unr0;
import defpackage.vst;
import defpackage.w53;
import defpackage.wst;
import defpackage.x8u0;
import defpackage.xst;
import defpackage.xz81;
import defpackage.y2c;
import defpackage.yst;
import defpackage.zm2;
import defpackage.zx81;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public final class d extends yst implements oy81 {
    public volatile boolean B;
    public final zabc E;
    public final com.google.android.gms.common.a F;
    public zabx G;
    public final w53 H;
    public final y2c J;
    public final w53 K;
    public final jm2 L;
    public final ArrayList N;
    public Integer O;
    public final hz81 P;
    public final ReentrantLock b;
    public final com.google.android.gms.common.internal.zak c;
    public final int x;
    public final Context y;
    public final Looper z;
    public ty81 w = null;
    public final LinkedList A = new LinkedList();
    public final long C = 120000;
    public final long D = 5000;
    public Set I = new HashSet();
    public final puy M = new puy();

    public d(Context context, ReentrantLock reentrantLock, Looper looper, y2c y2cVar, com.google.android.gms.common.a aVar, jm2 jm2Var, w53 w53Var, ArrayList arrayList, ArrayList arrayList2, w53 w53Var2, int i, int i2, ArrayList arrayList3) {
        this.O = null;
        sl81 sl81Var = new sl81(this);
        this.y = context;
        this.b = reentrantLock;
        this.c = new com.google.android.gms.common.internal.zak(looper, sl81Var);
        this.z = looper;
        this.E = new zabc(this, looper);
        this.F = aVar;
        this.x = i;
        if (i >= 0) {
            this.O = Integer.valueOf(i2);
        }
        this.K = w53Var;
        this.H = w53Var2;
        this.N = arrayList3;
        this.P = new hz81();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.zaf((wst) it.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.c.zag((xst) it2.next());
        }
        this.J = y2cVar;
        this.L = jm2Var;
    }

    public static int q(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            om2 om2Var = (om2) it.next();
            z2 |= om2Var.requiresSignIn();
            z3 |= om2Var.providesSignIn();
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    public static /* bridge */ /* synthetic */ void r(d dVar) {
        dVar.b.lock();
        try {
            if (dVar.B) {
                dVar.u();
            }
        } finally {
            dVar.b.unlock();
        }
    }

    @Override // defpackage.yst
    public final lta0 a() {
        ty81 ty81Var = this.w;
        boolean z = true;
        cvw.n("GoogleApiClient is not connected yet.", ty81Var != null && ty81Var.g());
        Integer num = this.O;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        cvw.n("Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API", z);
        x8u0 x8u0Var = new x8u0(this);
        if (this.H.containsKey(gnc.a)) {
            gnc.c.getClass();
            e(new com.google.android.gms.common.internal.service.a(gnc.b, this)).c(new dy81(this, x8u0Var, false, this));
            return x8u0Var;
        }
        AtomicReference atomicReference = new AtomicReference();
        zx81 zx81Var = new zx81(this, atomicReference, x8u0Var);
        cy81 cy81Var = new cy81(x8u0Var);
        vst vstVar = new vst(this.y);
        vstVar.a(gnc.b);
        vstVar.n.add(zx81Var);
        vstVar.o.add(cy81Var);
        zabc zabcVar = this.E;
        cvw.m(zabcVar, "Handler must not be null");
        vstVar.k = zabcVar.getLooper();
        d b = vstVar.b();
        atomicReference.set(b);
        b.b();
        return x8u0Var;
    }

    @Override // defpackage.yst
    public final void b() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = this.x;
            Integer num = this.O;
            int i2 = 2;
            boolean z = false;
            if (i >= 0) {
                cvw.n("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                this.O = Integer.valueOf(q(this.H.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.O;
            cvw.l(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i2 = intValue;
                } else if (intValue != 2) {
                    i2 = intValue;
                    cvw.d("Illegal sign-in mode: " + i2, z);
                    t(i2);
                    u();
                    reentrantLock.unlock();
                    return;
                }
                cvw.d("Illegal sign-in mode: " + i2, z);
                t(i2);
                u();
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

    @Override // defpackage.yst
    public final void c() {
        LinkedList<a> linkedList = this.A;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.P.a();
            ty81 ty81Var = this.w;
            if (ty81Var != null) {
                ty81Var.e();
            }
            Set set = this.M.a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ouy) it.next()).a();
            }
            set.clear();
            for (a aVar : linkedList) {
                aVar.z.set(null);
                aVar.e();
            }
            linkedList.clear();
            if (this.w != null) {
                s();
                this.c.zaa();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.yst
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.y);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.B);
        printWriter.append(" mWorkQueue.size()=").print(this.A.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.P.a.size());
        ty81 ty81Var = this.w;
        if (ty81Var != null) {
            ty81Var.f(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.yst
    public final a e(a aVar) {
        w53 w53Var = this.H;
        zm2 zm2Var = aVar.I;
        cvw.d("GoogleApiClient is not configured to use " + (zm2Var != null ? zm2Var.c : "the API") + " required for this call.", w53Var.containsKey(aVar.H));
        this.b.lock();
        try {
            ty81 ty81Var = this.w;
            if (ty81Var == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.B) {
                this.A.add(aVar);
                while (!this.A.isEmpty()) {
                    a aVar2 = (a) this.A.remove();
                    hz81 hz81Var = this.P;
                    hz81Var.a.add(aVar2);
                    aVar2.z.set(hz81Var.b);
                    aVar2.n(Status.RESULT_INTERNAL_ERROR);
                }
            } else {
                aVar = ty81Var.a(aVar);
            }
            this.b.unlock();
            return aVar;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.yst
    public final om2 f(km2 km2Var) {
        om2 om2Var = (om2) this.H.get(km2Var);
        cvw.m(om2Var, "Appropriate Api was not requested.");
        return om2Var;
    }

    @Override // defpackage.oy81
    public final void g(int i) {
        if (i == 1) {
            if (!this.B) {
                this.B = true;
                if (this.G == null) {
                    try {
                        com.google.android.gms.common.a aVar = this.F;
                        Context applicationContext = this.y.getApplicationContext();
                        ey81 ey81Var = new ey81(this);
                        aVar.getClass();
                        this.G = com.google.android.gms.common.a.g(applicationContext, ey81Var);
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabcVar = this.E;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.C);
                zabc zabcVar2 = this.E;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.D);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.P.a.toArray(new BasePendingResult[0])) {
            basePendingResult.g(hz81.c);
        }
        this.c.zae(i);
        this.c.zaa();
        if (i == 2) {
            u();
        }
    }

    @Override // defpackage.yst
    public final Context h() {
        return this.y;
    }

    @Override // defpackage.yst
    public final Looper i() {
        return this.z;
    }

    @Override // defpackage.oy81
    public final void j(Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.A;
            if (linkedList.isEmpty()) {
                this.c.zad(bundle);
                return;
            }
            e((a) linkedList.remove());
        }
    }

    @Override // defpackage.yst
    public final boolean k(t091 t091Var) {
        ty81 ty81Var = this.w;
        return ty81Var != null && ty81Var.d(t091Var);
    }

    @Override // defpackage.yst
    public final void l() {
        ty81 ty81Var = this.w;
        if (ty81Var != null) {
            ty81Var.c();
        }
    }

    @Override // defpackage.yst
    public final void m(xz81 xz81Var) {
        this.c.zag(xz81Var);
    }

    @Override // defpackage.yst
    public final void n(wst wstVar) {
        this.c.zah(wstVar);
    }

    @Override // defpackage.oy81
    public final void o(ConnectionResult connectionResult) {
        com.google.android.gms.common.a aVar = this.F;
        Context context = this.y;
        int errorCode = connectionResult.getErrorCode();
        aVar.getClass();
        AtomicBoolean atomicBoolean = fwt.a;
        if (!(errorCode != 18 ? errorCode == 1 ? fwt.c(context) : false : true)) {
            s();
        }
        if (this.B) {
            return;
        }
        this.c.zac(connectionResult);
        this.c.zaa();
    }

    @Override // defpackage.yst
    public final void p(xz81 xz81Var) {
        this.c.zai(xz81Var);
    }

    public final boolean s() {
        if (!this.B) {
            return false;
        }
        this.B = false;
        this.E.removeMessages(2);
        this.E.removeMessages(1);
        zabx zabxVar = this.G;
        if (zabxVar != null) {
            zabxVar.zab();
            this.G = null;
        }
        return true;
    }

    public final void t(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.O;
        if (num == null) {
            this.O = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.O.intValue();
            throw new IllegalStateException(unr0.r(new StringBuilder("Cannot use sign-in mode: "), i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", ". Mode was already set to ", intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED"));
        }
        if (this.w != null) {
            return;
        }
        w53 w53Var = this.H;
        boolean z = false;
        boolean z2 = false;
        for (om2 om2Var : w53Var.values()) {
            z |= om2Var.requiresSignIn();
            z2 |= om2Var.providesSignIn();
        }
        int intValue2 = this.O.intValue();
        ArrayList arrayList = this.N;
        w53 w53Var2 = this.K;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z) {
                ny61.r("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            } else {
                if (z2) {
                    ny61.r("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
                w53Var = w53Var;
            }
        } else {
            if (intValue2 == 2 && z) {
                w53 w53Var3 = new w53();
                w53 w53Var4 = new w53();
                om2 om2Var2 = null;
                for (Map.Entry entry : w53Var.entrySet()) {
                    om2 om2Var3 = (om2) entry.getValue();
                    if (true == om2Var3.providesSignIn()) {
                        om2Var2 = om2Var3;
                    }
                    if (om2Var3.requiresSignIn()) {
                        w53Var3.put((km2) entry.getKey(), om2Var3);
                    } else {
                        w53Var4.put((km2) entry.getKey(), om2Var3);
                    }
                }
                cvw.n("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !w53Var3.isEmpty());
                w53 w53Var5 = new w53();
                w53 w53Var6 = new w53();
                for (zm2 zm2Var : w53Var2.keySet()) {
                    pm2 pm2Var = zm2Var.b;
                    if (w53Var3.containsKey(pm2Var)) {
                        w53Var5.put(zm2Var, (Boolean) w53Var2.get(zm2Var));
                    } else {
                        if (!w53Var4.containsKey(pm2Var)) {
                            ny61.r("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        w53Var6.put(zm2Var, (Boolean) w53Var2.get(zm2Var));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h091 h091Var = (h091) arrayList.get(i2);
                    if (w53Var5.containsKey(h091Var.a)) {
                        arrayList2.add(h091Var);
                    } else {
                        if (!w53Var6.containsKey(h091Var.a)) {
                            ny61.r("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(h091Var);
                    }
                }
                this.w = new px81(this.y, this, reentrantLock2, this.z, this.F, w53Var3, w53Var4, this.J, this.L, om2Var2, arrayList2, arrayList3, w53Var5, w53Var6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.w = new e(this.y, this, reentrantLock, this.z, this.F, w53Var, this.J, w53Var2, this.L, arrayList, this);
    }

    public final void u() {
        this.c.zab();
        ty81 ty81Var = this.w;
        cvw.l(ty81Var);
        ty81Var.b();
    }
}
