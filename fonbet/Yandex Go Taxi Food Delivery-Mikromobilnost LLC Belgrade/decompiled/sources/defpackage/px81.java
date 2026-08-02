package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.base.zau;
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
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class px81 implements ty81 {
    public final om2 A;
    public Bundle B;
    public final Lock F;
    public final Context a;
    public final d b;
    public final Looper c;
    public final e w;
    public final e x;
    public final Map y;
    public final Set z = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult C = null;
    public ConnectionResult D = null;
    public boolean E = false;
    public int G = 0;

    public px81(Context context, d dVar, ReentrantLock reentrantLock, Looper looper, b bVar, w53 w53Var, w53 w53Var2, y2c y2cVar, jm2 jm2Var, om2 om2Var, ArrayList arrayList, ArrayList arrayList2, w53 w53Var3, w53 w53Var4) {
        this.a = context;
        this.b = dVar;
        this.F = reentrantLock;
        this.c = looper;
        this.A = om2Var;
        this.w = new e(context, dVar, reentrantLock, looper, bVar, w53Var2, null, w53Var4, null, arrayList2, new sl81(this));
        this.x = new e(context, dVar, reentrantLock, looper, bVar, w53Var, y2cVar, w53Var3, jm2Var, arrayList, new lm71(19, this));
        w53 w53Var5 = new w53();
        Iterator it = ((s53) w53Var2.keySet()).iterator();
        while (it.hasNext()) {
            w53Var5.put((km2) it.next(), this.w);
        }
        Iterator it2 = ((s53) w53Var.keySet()).iterator();
        while (it2.hasNext()) {
            w53Var5.put((km2) it2.next(), this.x);
        }
        this.y = Collections.unmodifiableMap(w53Var5);
    }

    public static void j(px81 px81Var) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4 = px81Var.C;
        e eVar = px81Var.x;
        e eVar2 = px81Var.w;
        if (connectionResult4 == null || !connectionResult4.isSuccess()) {
            if (px81Var.C != null && (connectionResult2 = px81Var.D) != null && connectionResult2.isSuccess()) {
                eVar.e();
                ConnectionResult connectionResult5 = px81Var.C;
                cvw.l(connectionResult5);
                px81Var.h(connectionResult5);
                return;
            }
            ConnectionResult connectionResult6 = px81Var.C;
            if (connectionResult6 == null || (connectionResult = px81Var.D) == null) {
                return;
            }
            if (eVar.E < eVar2.E) {
                connectionResult6 = connectionResult;
            }
            px81Var.h(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = px81Var.D;
        if ((connectionResult7 == null || !connectionResult7.isSuccess()) && ((connectionResult3 = px81Var.D) == null || connectionResult3.getErrorCode() != 4)) {
            ConnectionResult connectionResult8 = px81Var.D;
            if (connectionResult8 != null) {
                if (px81Var.G == 1) {
                    px81Var.i();
                    return;
                } else {
                    px81Var.h(connectionResult8);
                    eVar2.e();
                    return;
                }
            }
            return;
        }
        int i = px81Var.G;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                px81Var.G = 0;
            } else {
                d dVar = px81Var.b;
                cvw.l(dVar);
                dVar.j(px81Var.B);
            }
        }
        px81Var.i();
        px81Var.G = 0;
    }

    @Override // defpackage.ty81
    public final a a(a aVar) {
        e eVar = (e) this.y.get(aVar.H);
        cvw.m(eVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (eVar != this.x) {
            e eVar2 = this.w;
            eVar2.getClass();
            aVar.l();
            return eVar2.D.p(aVar);
        }
        ConnectionResult connectionResult = this.D;
        if (connectionResult != null && connectionResult.getErrorCode() == 4) {
            om2 om2Var = this.A;
            aVar.n(new Status(4, (String) null, om2Var == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), om2Var.getSignInIntent(), g091.a | SelfTester_JCP.DECRYPT_CNT)));
            return aVar;
        }
        e eVar3 = this.x;
        eVar3.getClass();
        aVar.l();
        return eVar3.D.p(aVar);
    }

    @Override // defpackage.ty81
    public final void b() {
        this.G = 2;
        this.E = false;
        this.D = null;
        this.C = null;
        this.w.b();
        this.x.b();
    }

    @Override // defpackage.ty81
    public final void c() {
        Lock lock = this.F;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z = this.G == 2;
                lock.unlock();
                this.x.e();
                this.D = new ConnectionResult(4);
                if (z) {
                    new zau(this.c).post(new h3s0(25, this));
                } else {
                    i();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ty81
    public final boolean d(t091 t091Var) {
        Lock lock;
        this.F.lock();
        try {
            lock = this.F;
            lock.lock();
            try {
                boolean z = true;
                boolean z2 = this.G == 2;
                lock.unlock();
                if (!z2) {
                    if (g()) {
                    }
                    z = false;
                    return z;
                }
                if (!(this.x.D instanceof ux81)) {
                    this.z.add(t091Var);
                    if (this.G == 0) {
                        this.G = 1;
                    }
                    this.D = null;
                    this.x.b();
                    return z;
                }
                z = false;
                return z;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.F;
        }
    }

    @Override // defpackage.ty81
    public final void e() {
        this.D = null;
        this.C = null;
        this.G = 0;
        this.w.e();
        this.x.e();
        i();
    }

    @Override // defpackage.ty81
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.x.f(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.w.f(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.G == 1) goto L16;
     */
    @Override // defpackage.ty81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.F.lock();
        try {
            boolean z = false;
            if (this.w.D instanceof ux81) {
                if (!(this.x.D instanceof ux81)) {
                    ConnectionResult connectionResult = this.D;
                    if (!(connectionResult != null && connectionResult.getErrorCode() == 4)) {
                    }
                }
                z = true;
            }
            return z;
        } finally {
            this.F.unlock();
        }
    }

    public final void h(ConnectionResult connectionResult) {
        int i = this.G;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.G = 0;
            }
            this.b.o(connectionResult);
        }
        i();
        this.G = 0;
    }

    public final void i() {
        Set set = this.z;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t091) it.next()).i.release();
        }
        set.clear();
    }
}
