package com.yandex.delivery.live.location.api;

import com.yandex.delivery.live.location.impl.repository.b;
import defpackage.bdi;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.pu2;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tbz;
import defpackage.tje;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes.dex */
public final class a implements pu2 {
    public final b a;
    public final com.yandex.delivery.live.location.impl.domain.a b;
    public final f c;
    public final tbz d;
    public final bdi e;
    public pzt0 f;
    public pzt0 g;
    public pzt0 h;
    public final ike i;

    public a(st2 st2Var, b bVar, com.yandex.delivery.live.location.impl.domain.a aVar, f fVar, tbz tbzVar, bdi bdiVar) {
        this.a = bVar;
        this.b = aVar;
        this.c = fVar;
        this.d = tbzVar;
        this.e = bdiVar;
        this.i = bvf0.a(st2Var.c);
    }

    @Override // defpackage.pu2
    public final void a(boolean z) {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.h;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        LiveLocationEventsListener$checkPermissionAndUpdateState$1 liveLocationEventsListener$checkPermissionAndUpdateState$1 = new LiveLocationEventsListener$checkPermissionAndUpdateState$1(this, null);
        ike ikeVar = this.i;
        this.g = tje.N(ikeVar, null, null, liveLocationEventsListener$checkPermissionAndUpdateState$1, 3);
        this.h = e.H(ikeVar, new jqr(new ru.yandex.taxi.delivery.experiments.b(this.e.a.a()), new LiveLocationEventsListener$subscribeExperiment$1(this, null), 3));
        this.f = e.H(ikeVar, new jqr(e.t(new m0(this.a.b, this.c.e(), new LiveLocationEventsListener$onAppResumed$1(3, null))), new LiveLocationEventsListener$onAppResumed$2(this, null), 3));
    }

    @Override // defpackage.pu2
    public final void b() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.h;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
    }
}
