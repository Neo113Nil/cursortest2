package com.yandex.go.chargers.passes.ui;

import com.yandex.go.chargers.passes.data.r0;
import defpackage.ffx;
import defpackage.kka;
import defpackage.pwy0;
import defpackage.qka;
import defpackage.rja;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import defpackage.zy11;
import java.util.Arrays;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class d implements yt11 {
    public final r0 a;
    public final e b;
    public final qka c;
    public final n0 d;
    public final tpr e;

    public d(tt2 tt2Var, pwy0 pwy0Var, com.yandex.go.chargers.domain.a aVar, r0 r0Var, e eVar, rja rjaVar, qka qkaVar, com.yandex.go.chargers.payments.data.a aVar2, kka kkaVar) {
        this.a = r0Var;
        this.b = eVar;
        this.c = qkaVar;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.d = b;
        tpr t = kotlinx.coroutines.flow.e.t(new c(new tpr[]{pwy0Var.a(), kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(b, new ChargersPassesUiStateInteractor$passResultFlow$$inlined$start$1(zy11.a, null)), new ChargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1(this, null)), kotlinx.coroutines.flow.e.X(rjaVar.b, new ChargersPassesUiStateInteractor$passResultFlow$silentRefresh$1(this, null))}, 2)), aVar.c(), aVar2.e(), kkaVar.b, qkaVar.b}, this));
        tt2Var.getClass();
        this.e = kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.e;
    }
}
