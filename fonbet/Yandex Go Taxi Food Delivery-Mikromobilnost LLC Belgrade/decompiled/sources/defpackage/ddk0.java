package defpackage;

import com.yandex.go.taxi.order.details.v2.domain.plugins.a;
import com.yandex.go.taxi.order.provider.call.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class ddk0 extends a {
    public final tpr c;

    public ddk0(o2y0 o2y0Var, eg7 eg7Var, tt2 tt2Var) {
        super(new dg7(null, "", false), tt2Var);
        eg7Var.getClass();
        this.c = e.t(new b(o2y0Var.a(), eg7Var));
    }

    @Override // com.yandex.go.taxi.order.details.v2.domain.plugins.a
    public final tpr a() {
        return this.c;
    }
}
