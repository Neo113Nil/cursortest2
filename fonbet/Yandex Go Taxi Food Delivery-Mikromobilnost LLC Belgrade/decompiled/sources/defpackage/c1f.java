package defpackage;

import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;

/* loaded from: classes8.dex */
public final class c1f extends fd20 {
    public final d1f w;

    public c1f(d1f d1fVar, b1f b1fVar) {
        super(new au50((dne0) b1fVar.a.a.get(), "counters_preferences"));
        this.w = d1fVar;
    }

    @Override // defpackage.fd20
    public final void g(CountersShowPolicy countersShowPolicy) {
        String a = countersShowPolicy.getA();
        d1f d1fVar = this.w;
        if (d1fVar.a.contains(a)) {
            return;
        }
        d1fVar.a.add(countersShowPolicy.getA());
        super.g(countersShowPolicy);
    }
}
