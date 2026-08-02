package com.yandex.go.places.searchbar.impl.router;

import defpackage.fr;
import defpackage.rec0;
import defpackage.tje;
import defpackage.zsa;

/* loaded from: classes13.dex */
public final class a {
    public final rec0 a;
    public final /* synthetic */ zsa b;

    public a(zsa zsaVar, rec0 rec0Var) {
        this.b = zsaVar;
        this.a = rec0Var;
    }

    public final void a(fr frVar) {
        tje.N(this.b.o(), null, null, new PlacesSearchbarRouterImpl$InnerNavigator$handleAction$1(this, frVar, null), 3);
    }

    public final void b() {
        tje.N(this.b.o(), null, null, new PlacesSearchbarRouterImpl$InnerNavigator$scrollUp$1(this, null), 3);
    }
}
