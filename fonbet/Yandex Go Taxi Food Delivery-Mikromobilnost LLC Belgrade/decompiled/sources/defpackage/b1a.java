package defpackage;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.multiorder.ui.g;
import com.yandex.go.chargers.order.completion.pre_finish.domain.a;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class b1a implements v7p {
    public final /* synthetic */ int a;
    public final lxf b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ b1a(lxf lxfVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = lxfVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        lxf lxfVar = this.b;
        switch (i) {
            case 0:
                return new a((tt2) lxfVar.get(), (e) xvf0Var4.get(), i5m.a(xvf0Var3), (f) xvf0Var2.get(), (v1a) xvf0Var.get());
            case 1:
                return new com.yandex.go.chargers.multiorder.ui.f((tt2) lxfVar.get(), (pwy0) xvf0Var4.get(), (g) xvf0Var3.get(), (com.yandex.go.chargers.data.e) xvf0Var2.get(), (rda) xvf0Var.get());
            default:
                return new kda((tt2) lxfVar.get(), (zuj0) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (c) xvf0Var2.get(), (com.yandex.go.chargers.data.e) xvf0Var.get());
        }
    }
}
