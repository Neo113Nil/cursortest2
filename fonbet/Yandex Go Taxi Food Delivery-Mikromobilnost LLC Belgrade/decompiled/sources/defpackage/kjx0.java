package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class kjx0 extends x8 {
    public final pex0 e;
    public final w3r0 f;
    public final wiq0 g;

    public kjx0(pex0 pex0Var, w3r0 w3r0Var, wiq0 wiq0Var, dqe0 dqe0Var, ynj0 ynj0Var) {
        super(dqe0Var.a.x, ynj0Var);
        this.e = pex0Var;
        this.f = w3r0Var;
        this.g = wiq0Var;
    }

    @Override // defpackage.x8
    public final void b() {
        ArrayList arrayList = this.d;
        pex0 pex0Var = this.e;
        if (pex0Var == null) {
            pex0Var = ((k) this.g).m();
        }
        w3r0.b(this.f, arrayList, null, null, pex0Var, 6);
    }
}
