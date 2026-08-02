package com.yandex.go.user_profile.settings.profile.data;

import com.yandex.go.user_profile.fullscreen.models.l;
import defpackage.au50;
import defpackage.ha2;
import defpackage.i3y;
import defpackage.j20;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.g;

/* loaded from: classes8.dex */
public final class b implements j20 {
    public final g a;
    public final i3y b;

    public b(final tse tseVar, final tt2 tt2Var, final com.yandex.go.superapp.order.multi.old.provider.g gVar, g gVar2, final l lVar, final au50 au50Var) {
        this.a = gVar2;
        this.b = kotlin.a.a(new sls() { // from class: com.yandex.go.user_profile.settings.profile.data.a
            @Override // defpackage.sls
            public final Object invoke() {
                ha2 n = e.n(com.yandex.go.superapp.order.multi.old.provider.g.this.h(), lVar.a(), (tpr) au50Var.b, new ActiveOrdersProfileStateRepositoryImpl$profileStateFlow$2$1(this, null));
                tt2Var.getClass();
                sjh sjhVar = uyj.a;
                return e.O(e.F(n, mdh.b), tseVar, wsr0.a(xsr0.a, 3), 1);
            }
        });
    }

    public final tpr a() {
        return (tpr) this.b.getValue();
    }
}
