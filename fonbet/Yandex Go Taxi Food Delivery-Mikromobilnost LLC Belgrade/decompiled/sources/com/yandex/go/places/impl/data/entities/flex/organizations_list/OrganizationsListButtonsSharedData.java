package com.yandex.go.places.impl.data.entities.flex.organizations_list;

import defpackage.gsq0;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/flex/organizations_list/OrganizationsListButtonsSharedData;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/flex/organizations_list/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationsListButtonsSharedData {
    public static final b Companion = new b();
    public final boolean a;

    public /* synthetic */ OrganizationsListButtonsSharedData(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrganizationsListButtonsSharedData) && this.a == ((OrganizationsListButtonsSharedData) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("OrganizationsListButtonsSharedData(areFiltersApplied=", Extension.C_BRAKE, this.a);
    }

    public OrganizationsListButtonsSharedData() {
        this.a = false;
    }
}
