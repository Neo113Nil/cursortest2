package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class amz0 implements pmz0, c.b {
    public final Lock a;
    public final Condition b;
    public final Context e;
    public final com.google.android.gms.common.a f;
    public final zlz0 g;
    public final Map h;

    @Nullable
    public final olc j;
    public final Map k;

    @Nullable
    public final a.AbstractC0111a l;
    public volatile xlz0 m;
    public int o;
    public final nlz0 p;
    public final omz0 q;
    public final HashMap i = new HashMap();

    @Nullable
    public ConnectionResult n = null;

    public amz0(Context context, nlz0 nlz0Var, Lock lock, Looper looper, com.google.android.gms.common.a aVar, zk3 zk3Var, @Nullable olc olcVar, zk3 zk3Var2, @Nullable a.AbstractC0111a abstractC0111a, ArrayList arrayList, omz0 omz0Var) {
        this.e = context;
        this.a = lock;
        this.f = aVar;
        this.h = zk3Var;
        this.j = olcVar;
        this.k = zk3Var2;
        this.l = abstractC0111a;
        this.p = nlz0Var;
        this.q = omz0Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vpz0) arrayList.get(i)).e = this;
        }
        this.g = new zlz0(this, looper);
        this.b = lock.newCondition();
        this.m = new klz0(this);
    }

    @Override // xsna.pmz0
    public final void a() {
        if (this.m.l()) {
            this.i.clear();
        }
    }

    @Override // xsna.pmz0
    public final ConnectionResult b() {
        n();
        while (this.m instanceof jlz0) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.m instanceof ykz0) {
            return ConnectionResult.g;
        }
        ConnectionResult connectionResult = this.n;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // xsna.pmz0
    public final void c() {
        if (this.m instanceof ykz0) {
            ykz0 ykz0Var = (ykz0) this.m;
            if (ykz0Var.b) {
                ykz0Var.b = false;
                ykz0Var.a.p.y.a();
                ykz0Var.l();
            }
        }
    }

    @Override // xsna.pmz0
    public final boolean e() {
        return this.m instanceof ykz0;
    }

    @Override // xsna.x3j
    public final void f(@Nullable Bundle bundle) {
        this.a.lock();
        try {
            this.m.q(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // xsna.pmz0
    public final boolean g(xlj0 xlj0Var) {
        return false;
    }

    @Override // xsna.pmz0
    public final void h(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.a aVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.c).println(StringUtils.PROCESS_POSTFIX_DELIMITER);
            a.f fVar = (a.f) this.h.get(aVar.b);
            exc0.i(fVar);
            fVar.dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    public final void i(@Nullable ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.n = connectionResult;
            this.m = new klz0(this);
            this.m.m();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // xsna.pmz0
    public final void n() {
        this.m.n();
    }

    @Override // xsna.pmz0
    public final com.google.android.gms.common.api.internal.a o(@NonNull com.google.android.gms.common.api.internal.a aVar) {
        aVar.zak();
        return this.m.o(aVar);
    }

    @Override // xsna.x3j
    public final void onConnectionSuspended(int i) {
        this.a.lock();
        try {
            this.m.s(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // xsna.pmz0
    public final com.google.android.gms.common.api.internal.a p(@NonNull com.google.android.gms.common.api.internal.a aVar) {
        aVar.zak();
        this.m.p(aVar);
        return aVar;
    }

    @Override // xsna.pmz0
    public final void d() {
    }
}
