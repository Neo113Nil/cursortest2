package com.yandex.go.places.searchbar.impl.presentation;

import com.yandex.go.places.searchbar.impl.ui.b;
import defpackage.ad5;
import defpackage.gci0;
import defpackage.k7x0;
import defpackage.p370;
import defpackage.pec0;
import defpackage.pwy0;
import defpackage.tje;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final p370 A;
    public final com.yandex.go.places.searchbar.impl.router.a B;
    public final com.yandex.go.places.searchbar.impl.domain.a x;
    public final k7x0 y;
    public final pwy0 z;

    public a(com.yandex.go.places.searchbar.impl.domain.a aVar, k7x0 k7x0Var, pwy0 pwy0Var, p370 p370Var, com.yandex.go.places.searchbar.impl.router.a aVar2) {
        super(pec0.class);
        this.x = aVar;
        this.y = k7x0Var;
        this.z = pwy0Var;
        this.A = p370Var;
        this.B = aVar2;
    }

    public final void Kg(b bVar) {
        Bg(bVar);
        tje.N(Jg(), null, null, new PlacesSearchbarPresenter$attachView$$inlined$collectIn$1(new m0((gci0) this.A.w, this.z.a(), new PlacesSearchbarPresenter$attachView$1(this, null)), null, bVar), 3);
    }
}
