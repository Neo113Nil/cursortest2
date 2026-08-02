package defpackage;

import com.yandex.go.payments.cards.data.m;
import com.yandex.go.payments.cards.data.o;
import com.yandex.go.payments.domain.r0;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.walking.navigation.impl.navigation_core.b;
import com.yandex.messaging.video.a;

/* loaded from: classes8.dex */
public final class g931 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ g931(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new m((o) ((qxu0) xvf0Var).get());
            case 1:
                return new bk31((q) ((dby0) xvf0Var).get());
            case 2:
                return a.a((e9g) ((v8g) xvf0Var).get());
            case 3:
                return new b((com.yandex.go.walking.navigation.impl.navigation_core.a) ((sku0) xvf0Var).get());
            case 4:
                return new z841((egx0) xvf0Var);
            case 5:
                return new nh41((ih01) ((d441) xvf0Var).get());
            case 6:
                return new qc20((gc80) ((q9g) xvf0Var).get());
            case 7:
                return new kk51((rx2) ((zd51) xvf0Var).get());
            case 8:
                return new com.yandex.go.payments_widgets.split.actions.payments.a((tm51) ((g931) xvf0Var).get());
            case 9:
                return new tm51(i5m.a((gga0) xvf0Var));
            case 10:
                return new av51((o7r0) ((zd51) xvf0Var).get());
            default:
                return new r0((sjp) ((zd51) xvf0Var).get());
        }
    }
}
