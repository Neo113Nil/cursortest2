package com.yandex.go.navigator;

import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.repository.o;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.d240;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.mth;
import defpackage.tt2;
import defpackage.wa50;
import defpackage.zzv;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class f implements zzv, wa50 {
    public final ah00 a;
    public final com.yandex.go.navigator.map_interactions.experiment.a b;
    public final o c;
    public final com.yandex.go.navigator.domain.e d;
    public final tt2 e;
    public final hbp0 f = new hbp0(new d240(14, this), f.class.getSimpleName(), null, 4);
    public final r0 g;
    public final e h;

    public f(ah00 ah00Var, com.yandex.go.navigator.map_interactions.experiment.a aVar, o oVar, com.yandex.go.navigator.domain.e eVar, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = aVar;
        this.c = oVar;
        this.d = eVar;
        this.e = tt2Var;
        r0 c = bvf0.c(null);
        this.g = c;
        this.h = new e(new mth(c, 6), this);
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void a(NavigationLayer navigationLayer) {
        this.f.a();
        ((gh00) this.a).d(this);
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void b(NavigationLayer navigationLayer) {
        this.f.b();
        ((gh00) this.a).t(this);
    }

    @Override // defpackage.zzv
    public final void c(Point point) {
        hbp0.e(this.f, null, null, new NavigatorMapInputListener$onMapLongTap$1(this, point, null), 3);
        this.d.a(FocusMode.FREE);
        this.c.b();
    }

    @Override // defpackage.zzv
    public final void d(Point point) {
        this.d.a(FocusMode.FREE);
        this.c.b();
    }
}
