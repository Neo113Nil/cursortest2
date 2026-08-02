package defpackage;

import android.content.Context;
import com.yandex.go.scooters.ignition.controlling.disabling_confirmation.b;
import com.yandex.go.scooters.misc.attention.data.e;
import ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class fzm0 implements v7p {
    public final /* synthetic */ int a;
    public final e7g b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ fzm0(e7g e7gVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = e7gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        e7g e7gVar = this.b;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                return new e((wnt) xvf0Var2.get(), (tt2) e7gVar.get(), (c) xvf0Var.get());
            case 1:
                return new b((tt2) e7gVar.get(), (c) xvf0Var2.get(), (brn0) xvf0Var.get());
            case 2:
                return new fsn0((tt2) e7gVar.get(), (c) xvf0Var2.get(), (brn0) xvf0Var.get());
            case 3:
                return new r3o0((tt2) e7gVar.get(), (cyx) xvf0Var2.get(), (z2o0) xvf0Var.get());
            case 4:
                return new a((Context) xvf0Var2.get(), (tt2) e7gVar.get(), (ru.yandex.taxi.design.utils.a) xvf0Var.get());
            default:
                return new com.yandex.go.scooters.qr.preview.data.a((Context) xvf0Var2.get(), (tt2) e7gVar.get(), (ru.yandex.taxi.design.utils.a) xvf0Var.get());
        }
    }

    public /* synthetic */ fzm0(xvf0 xvf0Var, e7g e7gVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = e7gVar;
        this.d = xvf0Var2;
    }
}
