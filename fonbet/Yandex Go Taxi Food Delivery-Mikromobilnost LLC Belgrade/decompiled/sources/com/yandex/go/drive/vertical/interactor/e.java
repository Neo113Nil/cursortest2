package com.yandex.go.drive.vertical.interactor;

import defpackage.avj0;
import defpackage.hay;
import defpackage.kyh0;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wi70;
import defpackage.wiq0;
import defpackage.ycm;
import defpackage.zuj0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes12.dex */
public final class e {
    public final zuj0 a;
    public final ru.yandex.taxi.am.g b;
    public final tt2 c;
    public final wiq0 d;
    public final pwy0 e;

    public e(zuj0 zuj0Var, ru.yandex.taxi.am.g gVar, tt2 tt2Var, wiq0 wiq0Var, pwy0 pwy0Var) {
        this.a = zuj0Var;
        this.b = gVar;
        this.c = tt2Var;
        this.d = wiq0Var;
        this.e = pwy0Var;
    }

    public final wi70 a(ycm ycmVar, String str, String str2) {
        if (str == null) {
            str = ((avj0) this.a).h(kyh0.summary_confirm);
        }
        if (str2 == null) {
            str2 = "";
        }
        return hay.g(str, str2, ycmVar.b, ycmVar.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
    }

    public final tpr b() {
        tpr t = kotlinx.coroutines.flow.e.t(new d(new m0(new b(((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).j.b()), this.e.a(), new DriveOrderButtonStateInteractor$stateFlow$1(this, null)), this));
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
