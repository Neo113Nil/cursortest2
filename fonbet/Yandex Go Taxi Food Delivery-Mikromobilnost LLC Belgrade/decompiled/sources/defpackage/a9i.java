package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_button.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display.a;

/* loaded from: classes5.dex */
public final class a9i implements v7p {
    public final /* synthetic */ int a;
    public final v7p b;
    public final xvf0 c;

    public a9i(xvf0 xvf0Var, v7p v7pVar) {
        this.a = 4;
        this.c = xvf0Var;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v7p v7pVar = this.b;
        xvf0 xvf0Var = this.c;
        switch (i) {
            case 0:
                return new z8i((z7i) v7pVar.get(), (i130) xvf0Var.get());
            case 1:
                return new a((q8s) xvf0Var.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) v7pVar.get());
            case 2:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a((q8s) xvf0Var.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) v7pVar.get());
            case 3:
                return new b((q8s) xvf0Var.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) v7pVar.get());
            default:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b((q8s) xvf0Var.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) v7pVar.get());
        }
    }

    public /* synthetic */ a9i(v7p v7pVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
    }
}
