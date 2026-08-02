package com.yandex.go.explorer.impl.ui.map;

import com.yandex.mapkit.geometry.Point;
import defpackage.tje;
import defpackage.zzv;

/* loaded from: classes12.dex */
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
        l lVar = this.a.c;
        if (lVar.H) {
            tje.N(lVar.Jg(), null, null, new ExplorerPresenter$onMapTapped$1(lVar, point, null), 3);
        }
    }
}
