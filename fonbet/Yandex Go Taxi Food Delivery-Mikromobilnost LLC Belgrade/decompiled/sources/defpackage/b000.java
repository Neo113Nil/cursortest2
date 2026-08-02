package defpackage;

import com.yandex.go.payments.data.q;
import com.yandex.go.payments.mbank.domain.a;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.sbp.domain.e;

/* loaded from: classes8.dex */
public final class b000 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final on11 c;

    public /* synthetic */ b000(eqh eqhVar, on11 on11Var, int i) {
        this.a = i;
        this.b = eqhVar;
        this.c = on11Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        on11 on11Var = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((c) xvf0Var.get(), (q) on11Var.get());
            case 1:
                return new com.yandex.go.payments.nequi.domain.unbinding.a((c) xvf0Var.get(), (q) on11Var.get());
            case 2:
                return new e((c) xvf0Var.get(), (q) on11Var.get());
            default:
                return new com.yandex.go.payments.yape.domain.unbinding.a((c) xvf0Var.get(), (q) on11Var.get());
        }
    }
}
