package defpackage;

import com.yandex.go.quark.impl.dependencies.a;
import com.yandex.go.quark.impl.dependencies.b;

/* loaded from: classes8.dex */
public final class ohg0 implements lz60 {
    public final tse a;
    public final lhg0 b;
    public final zlf0 c;
    public final zlf0 d;

    public ohg0(tse tseVar, lhg0 lhg0Var, zlf0 zlf0Var, zlf0 zlf0Var2) {
        this.a = tseVar;
        this.b = lhg0Var;
        this.c = zlf0Var;
        this.d = zlf0Var2;
    }

    @Override // defpackage.lz60
    public final void g() {
        a aVar = (a) this.c.get();
        b bVar = (b) this.d.get();
        lhg0 lhg0Var = this.b;
        lhg0Var.a = aVar;
        lhg0Var.b = bVar;
        gtq0.t(this.a, new ate0(3, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "QuarkGoActivityScopeDependenciesLCPListener";
    }
}
