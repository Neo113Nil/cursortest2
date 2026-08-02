package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final class ix50 implements v7p {
    public final jx50 a;

    public ix50(jx50 jx50Var) {
        this.a = jx50Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new OkHttpClient((OkHttpClient.a) this.a.get());
    }
}
