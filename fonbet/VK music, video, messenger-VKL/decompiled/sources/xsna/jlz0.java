package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class jlz0 implements xlz0 {
    public final amz0 a;
    public final Lock b;
    public final Context c;
    public final com.google.android.gms.common.a d;

    @Nullable
    public ConnectionResult e;
    public int f;
    public int h;

    @Nullable
    public znz0 k;
    public boolean l;
    public boolean m;
    public boolean n;

    @Nullable
    public com.google.android.gms.common.internal.b o;
    public boolean p;
    public boolean q;

    @Nullable
    public final olc r;
    public final Map s;

    @Nullable
    public final a.AbstractC0111a t;
    public int g = 0;
    public final Bundle i = new Bundle();
    public final HashSet j = new HashSet();
    public final ArrayList u = new ArrayList();

    public jlz0(amz0 amz0Var, @Nullable olc olcVar, Map map, com.google.android.gms.common.a aVar, @Nullable a.AbstractC0111a abstractC0111a, Lock lock, Context context) {
        this.a = amz0Var;
        this.r = olcVar;
        this.s = map;
        this.d = aVar;
        this.t = abstractC0111a;
        this.b = lock;
        this.c = context;
    }

    public final void a() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.g = 1;
            amz0 amz0Var = this.a;
            Map map = amz0Var.h;
            this.h = map.size();
            for (a.c cVar : map.keySet()) {
                if (!amz0Var.i.containsKey(cVar)) {
                    arrayList.add((a.f) map.get(cVar));
                } else if (h()) {
                    b();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(bmz0.a.submit(new elz0(this, arrayList)));
        }
    }

    public final void b() {
        amz0 amz0Var = this.a;
        amz0Var.a.lock();
        try {
            amz0Var.p.p();
            amz0Var.m = new ykz0(amz0Var);
            amz0Var.m.m();
            amz0Var.b.signalAll();
            amz0Var.a.unlock();
            bmz0.a.execute(new zkz0(this));
            znz0 znz0Var = this.k;
            if (znz0Var != null) {
                if (this.p) {
                    com.google.android.gms.common.internal.b bVar = this.o;
                    exc0.i(bVar);
                    znz0Var.a(bVar, this.q);
                }
                f(false);
            }
            Iterator it = amz0Var.i.keySet().iterator();
            while (it.hasNext()) {
                a.f fVar = (a.f) amz0Var.h.get((a.c) it.next());
                exc0.i(fVar);
                fVar.disconnect();
            }
            Bundle bundle = this.i;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            amz0Var.q.g(bundle);
        } catch (Throwable th) {
            amz0Var.a.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r3.d.b(null, r4.c, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
        int priority = aVar.a.getPriority();
        if (z && !connectionResult.i()) {
        }
        if (this.e == null || priority < this.f) {
            this.e = connectionResult;
            this.f = priority;
        }
        this.a.i.put(aVar.b, connectionResult);
    }

    public final void d() {
        this.m = false;
        amz0 amz0Var = this.a;
        amz0Var.p.q = Collections.EMPTY_SET;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            a.c cVar = (a.c) it.next();
            HashMap hashMap = amz0Var.i;
            if (!hashMap.containsKey(cVar)) {
                hashMap.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    public final void e(ConnectionResult connectionResult) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        f(!connectionResult.i());
        amz0 amz0Var = this.a;
        amz0Var.i(connectionResult);
        amz0Var.q.m(connectionResult);
    }

    public final void f(boolean z) {
        znz0 znz0Var = this.k;
        if (znz0Var != null) {
            if (znz0Var.isConnected() && z) {
                znz0Var.m();
            }
            znz0Var.disconnect();
            exc0.i(this.r);
            this.o = null;
        }
    }

    public final boolean g(int i) {
        if (this.g == i) {
            return true;
        }
        nlz0 nlz0Var = this.a.p;
        nlz0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        nlz0Var.o("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
        "Unexpected callback in ".concat(toString());
        new StringBuilder(String.valueOf(this.h).length() + 22);
        String str = this.g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        Log.e("GACConnecting", h5s.d(new StringBuilder(str2.length() + str.length() + 70), "GoogleApiClient connecting is in step ", str, " but received callback for step ", str2), new Exception());
        e(new ConnectionResult(8, null));
        return false;
    }

    public final boolean h() {
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        amz0 amz0Var = this.a;
        if (i >= 0) {
            ConnectionResult connectionResult = this.e;
            if (connectionResult == null) {
                return true;
            }
            amz0Var.o = this.f;
            e(connectionResult);
            return false;
        }
        nlz0 nlz0Var = amz0Var.p;
        nlz0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        nlz0Var.o("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new ConnectionResult(8, null));
        return false;
    }

    @Override // xsna.xlz0
    public final boolean l() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        f(true);
        this.a.i(null);
        return true;
    }

    @Override // xsna.xlz0
    public final void m() {
        amz0 amz0Var = this.a;
        HashMap hashMap = amz0Var.i;
        Map map = amz0Var.h;
        hashMap.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.s;
        boolean z = false;
        for (com.google.android.gms.common.api.a aVar : map2.keySet()) {
            a.f fVar = (a.f) map.get(aVar.b);
            exc0.i(fVar);
            z |= aVar.a.getPriority() == 1;
            boolean booleanValue = ((Boolean) map2.get(aVar)).booleanValue();
            if (fVar.requiresSignIn()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(aVar.b);
                } else {
                    this.l = false;
                }
            }
            hashMap2.put(fVar, new alz0(this, aVar, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            olc olcVar = this.r;
            exc0.i(olcVar);
            a.AbstractC0111a abstractC0111a = this.t;
            exc0.i(abstractC0111a);
            nlz0 nlz0Var = amz0Var.p;
            olcVar.h = Integer.valueOf(System.identityHashCode(nlz0Var));
            hlz0 hlz0Var = new hlz0(this);
            this.k = (znz0) abstractC0111a.buildClient(this.c, nlz0Var.h, olcVar, (olc) olcVar.g, (c.b) hlz0Var, (c.InterfaceC0114c) hlz0Var);
        }
        this.h = map.size();
        this.u.add(bmz0.a.submit(new dlz0(this, hashMap2)));
    }

    @Override // xsna.xlz0
    public final com.google.android.gms.common.api.internal.a o(com.google.android.gms.common.api.internal.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // xsna.xlz0
    public final com.google.android.gms.common.api.internal.a p(com.google.android.gms.common.api.internal.a aVar) {
        this.a.p.i.add(aVar);
        return aVar;
    }

    @Override // xsna.xlz0
    public final void q(@Nullable Bundle bundle) {
        if (g(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (h()) {
                b();
            }
        }
    }

    @Override // xsna.xlz0
    public final void r(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
        if (g(1)) {
            c(connectionResult, aVar, z);
            if (h()) {
                b();
            }
        }
    }

    @Override // xsna.xlz0
    public final void s(int i) {
        e(new ConnectionResult(8, null));
    }

    @Override // xsna.xlz0
    public final void n() {
    }
}
