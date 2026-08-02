package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationIdDto;
import defpackage.e9c0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class b implements e9c0 {
    public final /* synthetic */ int a;
    public final KSerializer b;
    public final /* synthetic */ c c;

    public b(c cVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = cVar;
                this.b = e.Companion.serializer();
                break;
            case 2:
                this.c = cVar;
                this.b = OrganizationIdDto.Companion.serializer();
                break;
            default:
                this.c = cVar;
                this.b = OrganizationGalleryDto.Companion.serializer();
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String a() {
        switch (this.a) {
            case 0:
                return "gallerySharedDataParser";
            case 1:
                return "mapObjectSharedDataParser";
            default:
                return "organizationIdSharedDataParser";
        }
    }

    @Override // defpackage.e9c0
    public final void b(Object obj) {
        int i = this.a;
        c cVar = this.c;
        switch (i) {
            case 0:
                tje.N(cVar.Jg(), null, null, new OrganizationCardFlexPresenter$gallerySharedDataParser$1$processSharedData$1(cVar, obj, null), 3);
                break;
            case 1:
                tse Jg = cVar.Jg();
                cVar.K.getClass();
                tje.N(Jg, uyj.a, null, new OrganizationCardFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1(cVar, obj, null), 2);
                break;
            default:
                tje.N(cVar.Jg(), null, null, new OrganizationCardFlexPresenter$organizationIdSharedDataParser$1$processSharedData$1(cVar, obj, null), 3);
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String c() {
        switch (this.a) {
            case 0:
                return "gallery";
            case 1:
                return "map_object";
            default:
                return "organization_id";
        }
    }

    @Override // defpackage.e9c0
    public final KSerializer d() {
        switch (this.a) {
        }
        return this.b;
    }
}
