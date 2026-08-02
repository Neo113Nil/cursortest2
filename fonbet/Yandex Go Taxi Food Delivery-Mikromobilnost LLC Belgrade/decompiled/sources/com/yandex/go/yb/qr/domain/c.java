package com.yandex.go.yb.qr.domain;

import com.yandex.go.yb.data.u;
import defpackage.hu51;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;

/* loaded from: classes8.dex */
public final class c {
    public final u a;
    public final hu51 b;
    public final com.yandex.go.navigation.screen.c c;

    public c(u uVar, hu51 hu51Var, com.yandex.go.navigation.screen.c cVar) {
        this.a = uVar;
        this.b = hu51Var;
        this.c = cVar;
    }

    public final tpr a() {
        b bVar = new b(this.a.c().C);
        com.yandex.go.navigation.screen.b c = this.c.c();
        hu51 hu51Var = this.b;
        tpr t = kotlinx.coroutines.flow.e.t(new e(ru.yandex.taxi.experiments.d.b(hu51Var.b), hu51Var));
        hu51Var.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(bVar, c, kotlinx.coroutines.flow.e.F(t, mdh.b), new YbQrAvailabilityInteractorImpl$availabilityFlow$2(4, this, c.class, "isAvailable", "isAvailable(Lcom/yandex/go/yb/api/domain/model/YbActivationStatus;Lcom/yandex/go/navigation/screen/api/Screen;Lcom/yandex/go/yb/qr/ui/YbQrState;)Z", 4)));
    }
}
