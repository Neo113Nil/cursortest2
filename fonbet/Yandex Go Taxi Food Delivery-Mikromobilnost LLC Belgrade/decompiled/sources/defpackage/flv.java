package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class flv implements wp20 {
    public final d5e a;
    public final jo20 b;
    public final AtomicReference c = new AtomicReference(null);

    public flv(d5e d5eVar, vp20 vp20Var) {
        this.a = d5eVar;
        this.b = vp20Var;
    }

    public final OkHttpClient a() {
        Object updateAndGet = this.c.updateAndGet(new saj(1, this));
        if (updateAndGet != null) {
            return (OkHttpClient) updateAndGet;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
