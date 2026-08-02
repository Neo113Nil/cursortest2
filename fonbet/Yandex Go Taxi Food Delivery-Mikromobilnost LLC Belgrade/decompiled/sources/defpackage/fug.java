package defpackage;

import com.yandex.go.payments.domain.j0;
import defpackage.dab1;
import defpackage.kw90;
import defpackage.lw90;
import defpackage.mdh;
import defpackage.n65;
import defpackage.sjh;
import defpackage.uyj;
import kotlin.a;
import kotlinx.coroutines.flow.t;

/* loaded from: classes8.dex */
public final class fug {
    public final dqe0 a;
    public final i3y b;
    public final i3y c;

    public fug(on2 on2Var, final tt2 tt2Var, dqe0 dqe0Var, final qea0 qea0Var, final lw90 lw90Var, final tea0 tea0Var) {
        this.a = dqe0Var;
        this.b = a.a(new ck(on2Var, 5));
        this.c = a.a(new sls() { // from class: com.yandex.go.overdraft.domain.c
            @Override // defpackage.sls
            public final Object invoke() {
                kw90 a = lw90.this.a(new n65[0]);
                t T = kotlinx.coroutines.flow.e.T(kotlinx.coroutines.flow.e.I(((j0) qea0Var).a(dab1.L), new DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1(this, tea0Var, a, null)), 1);
                tt2Var.getClass();
                sjh sjhVar = uyj.a;
                return kotlinx.coroutines.flow.e.F(T, mdh.b);
            }
        });
    }
}
