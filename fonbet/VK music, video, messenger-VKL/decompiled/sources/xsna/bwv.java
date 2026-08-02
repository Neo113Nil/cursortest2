package xsna;

import java.util.Set;
import okhttp3.p;
import xsna.k8g0;
import xsna.yy2;

/* compiled from: IgnoreNetExperimentsInterceptor.kt */
/* loaded from: classes.dex */
public final class bwv implements yy2.a {
    public final Set<String> a;

    public bwv(Set<String> set) {
        this.a = set;
    }

    @Override // xsna.yy2.a
    public final okhttp3.p a(okhttp3.p pVar, String str) {
        if (!this.a.contains(str)) {
            return pVar;
        }
        p.a b = pVar.b();
        b.h(k8g0.b.class, k8g0.b.a);
        return b.b();
    }
}
