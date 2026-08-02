package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.d;

/* loaded from: classes5.dex */
public final class fo60 implements v7p {
    public final /* synthetic */ int a = 0;
    public final z6x0 b;
    public final xvf0 c;
    public final lq40 d;

    public fo60(z6x0 z6x0Var, lq40 lq40Var, xvf0 xvf0Var) {
        this.b = z6x0Var;
        this.d = lq40Var;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        lq40 lq40Var = this.d;
        xvf0 xvf0Var = this.c;
        z6x0 z6x0Var = this.b;
        switch (i) {
            case 0:
                return new d((hwo0) z6x0Var.get(), (p070) lq40Var.get(), (nuy0) xvf0Var.get());
            default:
                return new lw0((hwo0) z6x0Var.get(), (a) xvf0Var.get(), (p070) lq40Var.get());
        }
    }

    public fo60(z6x0 z6x0Var, xvf0 xvf0Var, lq40 lq40Var) {
        this.b = z6x0Var;
        this.c = xvf0Var;
        this.d = lq40Var;
    }
}
