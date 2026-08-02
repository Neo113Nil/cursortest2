package defpackage;

import com.yandex.go.scooters.domain.g0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.scooters.data.ScootersActiveOrdersLifecycleRepository$listenSessionAppearance$$inlined$flatMapLatest$1;

/* loaded from: classes8.dex */
public final /* synthetic */ class d6p0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ d6p0(g0 g0Var, int i) {
        this.a = i;
        this.b = g0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        g0 g0Var = this.b;
        switch (i) {
            case 0:
                return g0Var.e.a();
            default:
                pqm0 pqm0Var = g0Var.e;
                g X = e.X(pqm0Var.b.a, new ScootersActiveOrdersLifecycleRepository$listenSessionAppearance$$inlined$flatMapLatest$1(null, pqm0Var));
                pqm0Var.a.getClass();
                return e.F(X, uyj.a);
        }
    }
}
