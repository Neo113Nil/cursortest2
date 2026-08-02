package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.mapkit.geometry.Point;
import defpackage.tje;
import defpackage.uac0;
import defpackage.zzv;

/* loaded from: classes13.dex */
public final class b implements zzv {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.zzv
    public final void c(Point point) {
    }

    @Override // defpackage.zzv
    public final void d(Point point) {
        uac0 uac0Var = this.a.y;
        tje.N(uac0Var.Jg(), null, null, new PlacesMainMapPresenter$deselectMyPlacesPin$1(uac0Var, null), 3);
        uac0Var.Kg();
        uac0Var.K = false;
        uac0Var.y.m.b();
    }
}
