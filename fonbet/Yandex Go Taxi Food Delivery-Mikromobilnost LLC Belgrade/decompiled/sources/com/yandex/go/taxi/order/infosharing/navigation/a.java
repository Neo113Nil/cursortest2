package com.yandex.go.taxi.order.infosharing.navigation;

import com.yandex.go.permission.b;
import defpackage.d50;
import defpackage.q5y0;
import defpackage.s5y0;
import defpackage.t5y0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zlb0;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        s5y0 s5y0Var = (s5y0) obj;
        t5y0 t5y0Var = s5y0Var.a;
        final q5y0 q5y0Var = s5y0Var.b;
        final int i = 0;
        final int i2 = 1;
        boolean z = q5y0Var.b && q5y0Var.a != null;
        if (z && ((b) t5y0Var.E).a(7)) {
            t5y0Var.r(new tls() { // from class: r5y0
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i3 = i;
                    zy11 zy11Var = zy11.a;
                    q5y0 q5y0Var2 = q5y0Var;
                    k5y0 k5y0Var = (k5y0) obj2;
                    switch (i3) {
                        case 0:
                            k5y0Var.h1(q5y0Var2.a);
                            break;
                        default:
                            k5y0Var.h1(q5y0Var2.a);
                            break;
                    }
                    return zy11Var;
                }
            });
        } else if (z) {
            com.yandex.go.navigation.activity.b bVar = t5y0Var.F;
            zlb0.a aVar = new zlb0.a();
            aVar.a = d50.a;
            bVar.d(aVar.a(), 145);
            tje.N(t5y0Var.o(), null, null, new TaxiOrderScreenshotSharingRouterImpl$onLaunch$1$onCloseAndShare$2(t5y0Var, null), 3);
        } else {
            t5y0Var.r(new tls() { // from class: r5y0
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    q5y0 q5y0Var2 = q5y0Var;
                    k5y0 k5y0Var = (k5y0) obj2;
                    switch (i3) {
                        case 0:
                            k5y0Var.h1(q5y0Var2.a);
                            break;
                        default:
                            k5y0Var.h1(q5y0Var2.a);
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        return zy11.a;
    }
}
