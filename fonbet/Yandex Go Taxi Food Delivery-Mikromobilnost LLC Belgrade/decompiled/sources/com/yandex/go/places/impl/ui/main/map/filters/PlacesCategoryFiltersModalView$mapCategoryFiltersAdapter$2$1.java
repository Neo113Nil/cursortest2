package com.yandex.go.places.impl.ui.main.map.filters;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$MapType;
import com.yandex.go.places.impl.domain.entities.FavoritesState;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import defpackage.bgc;
import defpackage.h6c0;
import defpackage.hsj;
import defpackage.ibc0;
import defpackage.iio;
import defpackage.jio;
import defpackage.jl40;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class PlacesCategoryFiltersModalView$mapCategoryFiltersAdapter$2$1 extends FunctionReferenceImpl implements tls {
    public final void i(ibc0 ibc0Var) {
        DiscoveryAnalytics$MapType discoveryAnalytics$MapType;
        f fVar = (f) this.receiver;
        fVar.getClass();
        CategoryFilterType categoryFilterType = ibc0Var.g;
        boolean z = ibc0Var.i;
        CategoryFilterType categoryFilterType2 = CategoryFilterType.FAVOURITES;
        if (categoryFilterType != categoryFilterType2 || !z) {
            jio jioVar = fVar.O.a;
            String str = ibc0Var.b;
            hsj hsjVar = jioVar.b;
            int i = iio.a[jioVar.a.ordinal()];
            if (i == 1) {
                discoveryAnalytics$MapType = DiscoveryAnalytics$MapType.SuperappDiscoveryMap;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                discoveryAnalytics$MapType = DiscoveryAnalytics$MapType.PlacesMap;
            }
            hsjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("map_type", discoveryAnalytics$MapType.getEventValue());
            hsjVar.a.a("Discovery.Map.Suggest.Tapped", hashMap, 1, new HashMap());
        }
        FavoritesState favoritesState = FavoritesState.SELECTED;
        if (categoryFilterType != categoryFilterType2 || z) {
            favoritesState = null;
        }
        if (favoritesState == null) {
            favoritesState = FavoritesState.NOT_SELECTED;
        }
        if (fVar.W != favoritesState) {
            fVar.W = favoritesState;
            ((i) fVar.L.b).b();
        }
        int i2 = h6c0.a[categoryFilterType.ordinal()];
        if (i2 == 1) {
            fVar.C.h(true, false, new bgc(12));
        } else if (i2 == 2) {
            tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$onFilterClicked$1(fVar, ibc0Var, null), 3);
        }
        r0 r0Var = fVar.E.a.a;
        ibc0 ibc0Var2 = (ibc0) r0Var.getValue();
        if (jl40.l(ibc0Var2 != null ? ibc0Var2.a : null, ibc0Var.a)) {
            r0Var.l(null);
        } else {
            r0Var.m(null, ibc0Var);
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((ibc0) obj);
        return zy11.a;
    }
}
