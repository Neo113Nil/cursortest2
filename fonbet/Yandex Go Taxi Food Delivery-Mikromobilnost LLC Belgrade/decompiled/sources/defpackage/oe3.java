package defpackage;

import com.yandex.go.route.interactor.c;
import com.yandex.go.summary.interactor.core.b;
import com.yandex.go.taxi.auction.domain.a;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.preorder.tollroad.data.e;

/* loaded from: classes14.dex */
public final class oe3 implements v7p {
    public final /* synthetic */ int a;
    public final w0g b;
    public final xvf0 c;
    public final xvf0 d;

    public oe3(x0g x0gVar, w0g w0gVar, xvf0 xvf0Var) {
        this.a = 4;
        this.c = x0gVar;
        this.b = w0gVar;
        this.d = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        w0g w0gVar = this.b;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                return new ymu((wiq0) w0gVar.get(), (a) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 1:
                return new b((wiq0) w0gVar.get(), (pev0) xvf0Var2.get(), (lb5) xvf0Var.get());
            case 2:
                return new wwf((k) xvf0Var2.get(), (c) xvf0Var.get(), (wiq0) w0gVar.get());
            case 3:
                return new rn40((wiq0) w0gVar.get(), i5m.a(xvf0Var2), (tbx0) xvf0Var.get());
            case 4:
                return new q6c0(10, (e) xvf0Var2.get(), (wiq0) w0gVar.get(), (opz0) xvf0Var.get());
            default:
                return new ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.a((llv0) xvf0Var2.get(), (ru.yandex.taxi.summary.promotions.repository.e) xvf0Var.get(), (wiq0) w0gVar.get());
        }
    }

    public /* synthetic */ oe3(v7p v7pVar, xvf0 xvf0Var, w0g w0gVar, int i) {
        this.a = i;
        this.c = v7pVar;
        this.d = xvf0Var;
        this.b = w0gVar;
    }

    public /* synthetic */ oe3(w0g w0gVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = w0gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }
}
