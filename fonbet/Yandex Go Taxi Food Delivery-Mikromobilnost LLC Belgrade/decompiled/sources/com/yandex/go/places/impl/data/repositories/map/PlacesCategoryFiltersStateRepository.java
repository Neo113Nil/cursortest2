package com.yandex.go.places.impl.data.repositories.map;

import defpackage.bvf0;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class PlacesCategoryFiltersStateRepository {
    public final r0 a;
    public final r0 b;
    public final m0 c;

    public PlacesCategoryFiltersStateRepository() {
        r0 c = bvf0.c(null);
        this.a = c;
        r0 c2 = bvf0.c(EmptyList.a);
        this.b = c2;
        this.c = new m0(e.d(c2), e.d(c), new PlacesCategoryFiltersStateRepository$categoryFilters$1(3, null));
    }
}
