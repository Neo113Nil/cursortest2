package com.yandex.go.preorder.navigation;

import defpackage.tje;
import defpackage.wl00;

/* loaded from: classes13.dex */
public final class o implements wl00 {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    @Override // defpackage.wl00
    public final void onMapCollapsed() {
        p pVar = this.a;
        tje.N(pVar.o(), null, null, new TaxiMainRouter$registerMapListener$1$1$onMapCollapsed$1(pVar, null), 3);
    }

    @Override // defpackage.wl00
    public final void onMapDragged() {
        p pVar = this.a;
        tje.N(pVar.o(), null, null, new TaxiMainRouter$registerMapListener$1$1$onMapDragged$1(pVar, null), 3);
    }

    @Override // defpackage.wl00
    public final void onMapExpanded() {
        p pVar = this.a;
        tje.N(pVar.o(), null, null, new TaxiMainRouter$registerMapListener$1$1$onMapExpanded$1(pVar, null), 3);
    }

    @Override // defpackage.wl00
    public final void onMapPressed() {
        p pVar = this.a;
        tje.N(pVar.o(), null, null, new TaxiMainRouter$registerMapListener$1$1$onMapPressed$1(pVar, null), 3);
    }

    @Override // defpackage.wl00
    public final void onMapReleased() {
        p pVar = this.a;
        tje.N(pVar.o(), null, null, new TaxiMainRouter$registerMapListener$1$1$onMapReleased$1(pVar, null), 3);
    }
}
