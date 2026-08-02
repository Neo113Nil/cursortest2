package defpackage;

import com.yandex.go.scooters.debt.d;
import com.yandex.go.scooters.discovery.m;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class mdn0 implements rgo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ mdn0(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((m) this.b).D.h();
                break;
        }
    }

    @Override // defpackage.rgo0
    public final void j(hfa0 hfa0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                r0 r0Var = ((d) h55Var).F.f.a;
                r0Var.getClass();
                r0Var.m(null, hfa0Var);
                break;
            default:
                m mVar = (m) h55Var;
                mVar.f0.b(hfa0Var.d());
                mVar.D.h();
                break;
        }
    }
}
