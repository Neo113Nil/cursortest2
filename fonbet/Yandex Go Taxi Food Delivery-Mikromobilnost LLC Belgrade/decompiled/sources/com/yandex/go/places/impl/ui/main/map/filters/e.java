package com.yandex.go.places.impl.ui.main.map.filters;

import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        f fVar = this.a;
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$getMapCategoryFilters$1(fVar, null), 3);
        return zy11.a;
    }
}
