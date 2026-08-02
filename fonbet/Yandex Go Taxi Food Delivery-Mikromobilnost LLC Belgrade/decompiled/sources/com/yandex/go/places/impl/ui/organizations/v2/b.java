package com.yandex.go.places.impl.ui.organizations.v2;

import com.yandex.go.places.impl.data.entities.flex.organizations_list.OrganizationsListButtonsSharedData;
import com.yandex.go.places.impl.data.entities.network.map.MapObjectsItemDtoWrapper;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsListSearchbarDto;
import defpackage.e9c0;
import defpackage.lec0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class b implements e9c0 {
    public final /* synthetic */ int a;
    public final KSerializer b;
    public final /* synthetic */ f c;

    public b(f fVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = fVar;
                this.b = OrganizationsListButtonsSharedData.Companion.serializer();
                break;
            case 2:
                this.c = fVar;
                this.b = OrganizationsListSearchbarDto.Companion.serializer();
                break;
            default:
                this.c = fVar;
                this.b = MapObjectsItemDtoWrapper.Companion.serializer();
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String a() {
        switch (this.a) {
            case 0:
                return "mapObjectsSharedDataParser";
            case 1:
                return "organizationsListButtonsSharedDataParser";
            default:
                return "searchbarSharedDataParser";
        }
    }

    @Override // defpackage.e9c0
    public final void b(Object obj) {
        int i = this.a;
        f fVar = this.c;
        switch (i) {
            case 0:
                tse Jg = fVar.Jg();
                fVar.F.getClass();
                tje.N(Jg, uyj.a, null, new OrganizationsListV2Presenter$mapObjectSharedDataParser$1$processSharedData$1(obj, fVar, null), 2);
                break;
            case 1:
                OrganizationsListButtonsSharedData organizationsListButtonsSharedData = obj instanceof OrganizationsListButtonsSharedData ? (OrganizationsListButtonsSharedData) obj : null;
                if (organizationsListButtonsSharedData != null) {
                    tje.N(fVar.Jg(), null, null, new OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1(fVar, organizationsListButtonsSharedData, null), 3);
                    break;
                }
                break;
            default:
                if (fVar.e0 instanceof lec0) {
                    tje.N(fVar.Jg(), null, null, new OrganizationsListV2Presenter$searchbarSharedDataParser$1$processSharedData$1(obj, fVar, null), 3);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String c() {
        switch (this.a) {
            case 0:
                return "map_objects_field";
            case 1:
                return "buttons_field";
            default:
                return "organizations_list_search_bar_info";
        }
    }

    @Override // defpackage.e9c0
    public final KSerializer d() {
        switch (this.a) {
        }
        return this.b;
    }
}
