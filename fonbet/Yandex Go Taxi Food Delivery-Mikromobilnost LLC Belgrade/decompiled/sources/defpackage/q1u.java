package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.vertical_stack.a;

/* loaded from: classes5.dex */
public final class q1u implements v7p {
    public final /* synthetic */ int a;
    public final eqh b;
    public final lq40 c;

    public /* synthetic */ q1u(eqh eqhVar, lq40 lq40Var, int i) {
        this.a = i;
        this.b = eqhVar;
        this.c = lq40Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        lq40 lq40Var = this.c;
        eqh eqhVar = this.b;
        switch (i) {
            case 0:
                return new c(i5m.a(eqhVar), (p070) lq40Var.get());
            case 1:
                return new b(i5m.a(eqhVar), (p070) lq40Var.get());
            default:
                return new a(i5m.a(eqhVar), (p070) lq40Var.get());
        }
    }
}
