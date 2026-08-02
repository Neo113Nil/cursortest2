package com.yandex.go.preorder.map;

import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import defpackage.biv0;
import defpackage.brb0;
import defpackage.crb0;
import defpackage.git0;
import defpackage.gmb0;
import defpackage.h3y;
import defpackage.m8t0;
import defpackage.tit0;
import defpackage.z3g0;
import defpackage.zzs;
import java.util.List;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes13.dex */
public final class b {
    public final git0 a;
    public final biv0 b;
    public final brb0 c;
    public final h3y d;
    public final ru.yandex.taxi.preorder.source.pickup.a e;
    public final z3g0 f;
    public final h3y g;
    public final tit0 h;
    public final c i;

    public b(git0 git0Var, biv0 biv0Var, brb0 brb0Var, h3y h3yVar, ru.yandex.taxi.preorder.source.pickup.a aVar, z3g0 z3g0Var, h3y h3yVar2, tit0 tit0Var, c cVar) {
        this.a = git0Var;
        this.b = biv0Var;
        this.c = brb0Var;
        this.d = h3yVar;
        this.e = aVar;
        this.f = z3g0Var;
        this.g = h3yVar2;
        this.h = tit0Var;
        this.i = cVar;
    }

    public final void a(zzs zzsVar, gmb0 gmb0Var) {
        Float f;
        brb0 brb0Var = this.c;
        List b = gmb0Var.b();
        m8t0 m8t0Var = new m8t0(6, this);
        crb0 crb0Var = (crb0) brb0Var;
        ClarifyPointsScreenStrategyConfigurationExperiment.PointConfigurationDto pointConfigurationDto = crb0Var.a.a;
        crb0Var.a(zzsVar, b, (pointConfigurationDto == null || (f = pointConfigurationDto.b) == null) ? 13.0f : f.floatValue(), m8t0Var);
    }

    public final void b(MapPositionAction mapPositionAction) {
        ru.yandex.taxi.lifecycle.c.b(this.a.a, CoroutineStart.UNDISPATCHED, new SourcePointMapPositionActionHandler$handle$1(this, mapPositionAction, null));
    }
}
