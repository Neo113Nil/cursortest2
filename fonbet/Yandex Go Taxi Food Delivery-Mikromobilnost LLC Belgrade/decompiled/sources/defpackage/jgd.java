package defpackage;

import com.yandex.go.payments.order.domain.e;
import java.util.List;

/* loaded from: classes12.dex */
public final /* synthetic */ class jgd implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yvf0 b;

    public /* synthetic */ jgd(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return (oav) yvf0Var.get();
            case 1:
                return (e) yvf0Var.get();
            default:
                return (List) yvf0Var.get();
        }
    }
}
