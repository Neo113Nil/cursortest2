package xsna;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class klz0 implements xlz0 {
    public final amz0 a;

    public klz0(amz0 amz0Var) {
        this.a = amz0Var;
    }

    @Override // xsna.xlz0
    public final boolean l() {
        return true;
    }

    @Override // xsna.xlz0
    public final void m() {
        amz0 amz0Var = this.a;
        Iterator it = amz0Var.h.values().iterator();
        while (it.hasNext()) {
            ((a.f) it.next()).disconnect();
        }
        amz0Var.p.q = Collections.EMPTY_SET;
    }

    @Override // xsna.xlz0
    public final void n() {
        amz0 amz0Var = this.a;
        Lock lock = amz0Var.a;
        lock.lock();
        try {
            amz0Var.m = new jlz0(amz0Var, amz0Var.j, amz0Var.k, amz0Var.f, amz0Var.l, lock, amz0Var.e);
            amz0Var.m.m();
            amz0Var.b.signalAll();
        } finally {
            amz0Var.a.unlock();
        }
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
    }

    @Override // xsna.xlz0
    public final void s(int i) {
    }

    @Override // xsna.xlz0
    public final void r(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
    }
}
