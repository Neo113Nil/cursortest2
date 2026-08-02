package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.chargers.data.j;
import com.yandex.go.chargers.order.details.a;
import com.yandex.go.chargers.partner_subscription.ui.b;
import com.yandex.go.chargers.passes.ui.purchase.d;
import com.yandex.go.chargers.station.data.e;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class lu9 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ lu9(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static lu9 a(xvf0 xvf0Var) {
        return new lu9(xvf0Var, 13);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ku9((rqo) xvf0Var.get());
            case 1:
                return new xx9((o8h) xvf0Var.get());
            case 2:
                return new j((tse) xvf0Var.get());
            case 3:
                return new w2a((v2a) xvf0Var.get());
            case 4:
                return new d3a((rqo) xvf0Var.get(), 0);
            case 5:
                return new n3a((rqo) xvf0Var.get(), 1);
            case 6:
                return new bo5(i5m.a(xvf0Var));
            case 7:
                return new a((c) xvf0Var.get());
            case 8:
                return new b((c) xvf0Var.get());
            case 9:
                return new io9((ofa) xvf0Var.get());
            case 10:
                return new c29(13, (kka) xvf0Var.get());
            case 11:
                return new d((c) xvf0Var.get());
            case 12:
                return new ima((k7x0) xvf0Var.get());
            case 13:
                return new bna((k7x0) xvf0Var.get());
            case 14:
                return new jra((em9) xvf0Var.get());
            case 15:
                return new e((dne0) xvf0Var.get());
            case 16:
                return new com.yandex.go.chargers.subscription.data.mapper.a((c) xvf0Var.get());
            case 17:
                return new fwa((em9) xvf0Var.get());
            case 18:
                return new com.yandex.go.chargers.surge.info.e((c) xvf0Var.get());
            case 19:
                return new rya((rqo) xvf0Var.get());
            case 20:
                return new pj((pho) xvf0Var.get());
            case 21:
                return new i2b((Activity) xvf0Var.get(), 0);
            case 22:
                return new com.yandex.messaging.input.util.c((Context) xvf0Var.get());
            case 23:
                return new Mesix((Activity) xvf0Var.get(), null, 0, 6, null);
            case 24:
                return new u3b((Activity) xvf0Var.get());
            case 25:
                return new io9((x22) xvf0Var.get());
            case 26:
                return new md6((x22) xvf0Var.get());
            case 27:
                return new k6b((com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 28:
                return new z7b((com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            default:
                return new w9b((x22) xvf0Var.get());
        }
    }
}
