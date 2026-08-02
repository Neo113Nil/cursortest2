package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import defpackage.d7e;
import defpackage.fa51;
import defpackage.k8e;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class b implements d7e {
    public final ConnectivityManager a;

    public b(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.d7e
    public final boolean a(fa51 fa51Var) {
        return fa51Var.j.a() != null;
    }

    @Override // defpackage.d7e
    public final kotlinx.coroutines.flow.b b(k8e k8eVar) {
        return e.g(new NetworkRequestConstraintController$track$1(k8eVar, this, null));
    }
}
