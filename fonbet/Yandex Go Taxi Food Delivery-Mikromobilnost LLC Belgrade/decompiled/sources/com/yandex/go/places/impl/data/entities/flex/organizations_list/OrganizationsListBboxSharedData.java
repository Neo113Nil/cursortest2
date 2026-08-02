package com.yandex.go.places.impl.data.entities.flex.organizations_list;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.uc4;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/flex/organizations_list/OrganizationsListBboxSharedData;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/flex/organizations_list/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationsListBboxSharedData {
    public static final a Companion = new a();
    public final uc4 a;

    public /* synthetic */ OrganizationsListBboxSharedData(int i, uc4 uc4Var) {
        if (1 == (i & 1)) {
            this.a = uc4Var;
        } else {
            qje.Z(i, 1, OrganizationsListBboxSharedData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrganizationsListBboxSharedData) && jl40.l(this.a, ((OrganizationsListBboxSharedData) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrganizationsListBboxSharedData(bbox=" + this.a + Extension.C_BRAKE;
    }
}
