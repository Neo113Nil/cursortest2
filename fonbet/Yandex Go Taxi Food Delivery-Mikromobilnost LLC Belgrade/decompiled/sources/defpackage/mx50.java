package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class mx50 implements v7p {
    public final xvf0 a;
    public final xvf0 b;

    public mx50(xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        qiy0 qiy0Var = (qiy0) this.a.get();
        nua0 nua0Var = (nua0) this.b.get();
        OkHttpClient.a aVar = new OkHttpClient.a();
        ((oua0) nua0Var).getClass();
        qiy0Var.getClass();
        return aVar;
    }
}
