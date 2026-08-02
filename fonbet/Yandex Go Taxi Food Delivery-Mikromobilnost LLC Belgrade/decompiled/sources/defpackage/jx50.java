package defpackage;

import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final class jx50 implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final ssj e;

    public jx50(n3w n3wVar, t160 t160Var, xvf0 xvf0Var, zi60 zi60Var, ssj ssjVar) {
        this.a = n3wVar;
        this.b = t160Var;
        this.c = xvf0Var;
        this.d = zi60Var;
        this.e = ssjVar;
    }

    public static OkHttpClient.a a(Set set, s160 s160Var, Optional optional, v1k0 v1k0Var) {
        OkHttpClient.a aVar = new OkHttpClient.a();
        if (optional.isPresent() && ((w870) optional.get()).isEnabled()) {
            aVar.a(new ws50(1, (w870) optional.get()));
        }
        Iterator it = a.x0(set, new dx50()).iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        aVar.a(v1k0Var);
        aVar.d(s160Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.b(30L, timeUnit);
        aVar.g(30L, timeUnit);
        aVar.i(30L);
        return aVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Set set = (Set) this.a.get();
        s160 s160Var = (s160) this.b.get();
        Optional optional = (Optional) this.c.get();
        return a(set, s160Var, optional, (v1k0) this.e.get());
    }
}
