package com.yandex.go.places.impl.ui.nearby.flex;

import com.yandex.go.places.impl.data.entities.network.map.MapObjectsItemDtoWrapper;
import defpackage.e9c0;
import defpackage.tj50;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class b implements e9c0 {
    public final KSerializer a = MapObjectsItemDtoWrapper.Companion.serializer();
    public final /* synthetic */ tj50 b;

    public b(tj50 tj50Var) {
        this.b = tj50Var;
    }

    @Override // defpackage.e9c0
    public final String a() {
        return "mapObjectsSharedDataParser";
    }

    @Override // defpackage.e9c0
    public final void b(Object obj) {
        tj50 tj50Var = this.b;
        tse Jg = tj50Var.Jg();
        tj50Var.F.getClass();
        tje.N(Jg, uyj.a, null, new NearbyFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1(obj, tj50Var, null), 2);
    }

    @Override // defpackage.e9c0
    public final String c() {
        return "map_objects_field";
    }

    @Override // defpackage.e9c0
    public final KSerializer d() {
        return this.a;
    }
}
