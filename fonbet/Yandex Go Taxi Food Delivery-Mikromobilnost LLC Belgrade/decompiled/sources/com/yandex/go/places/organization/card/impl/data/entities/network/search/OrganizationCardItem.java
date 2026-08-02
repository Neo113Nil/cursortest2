package com.yandex.go.places.organization.card.impl.data.entities.network.search;

import com.yandex.go.places.models.data.entities.network.map.e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/search/OrganizationCardItem;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/search/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationCardItem {
    public static final c Companion = new c();
    public final String a;
    public final e b;

    public /* synthetic */ OrganizationCardItem(int i, String str, e eVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationCardItem)) {
            return false;
        }
        OrganizationCardItem organizationCardItem = (OrganizationCardItem) obj;
        return jl40.l(this.a, organizationCardItem.a) && jl40.l(this.b, organizationCardItem.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e eVar = this.b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "OrganizationCardItem(oid=" + this.a + ", mapObject=" + this.b + Extension.C_BRAKE;
    }

    public OrganizationCardItem() {
        this.a = "";
        this.b = null;
    }
}
