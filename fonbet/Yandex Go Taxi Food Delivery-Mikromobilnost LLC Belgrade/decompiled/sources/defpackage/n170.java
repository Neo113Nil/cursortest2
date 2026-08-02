package defpackage;

import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;

/* loaded from: classes8.dex */
public final class n170 extends fd20 {
    public final p170 w;

    public n170(p170 p170Var, b1f b1fVar) {
        super(new au50((dne0) b1fVar.a.a.get(), "onboarding_preferences"));
        this.w = p170Var;
    }

    @Override // defpackage.fd20
    public final void b(CountersShowPolicy countersShowPolicy) {
        this.w.b.add(countersShowPolicy.getA());
        super.b(countersShowPolicy);
    }

    @Override // defpackage.fd20
    public final void g(CountersShowPolicy countersShowPolicy) {
        String a = countersShowPolicy.getA();
        p170 p170Var = this.w;
        if (p170Var.a.contains(a)) {
            return;
        }
        p170Var.a.add(countersShowPolicy.getA());
        super.g(countersShowPolicy);
    }
}
