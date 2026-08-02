package com.yandex.go.places.impl.data.entities.network.organizations.layer;

import defpackage.fvb0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.uc4;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerResponse;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/layer/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesOrganizationsLayerResponse {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(15))};
    public final uc4 a;
    public final List b;

    public /* synthetic */ PlacesOrganizationsLayerResponse(int i, uc4 uc4Var, List list) {
        this.a = (i & 1) == 0 ? null : uc4Var;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesOrganizationsLayerResponse)) {
            return false;
        }
        PlacesOrganizationsLayerResponse placesOrganizationsLayerResponse = (PlacesOrganizationsLayerResponse) obj;
        return jl40.l(this.a, placesOrganizationsLayerResponse.a) && jl40.l(this.b, placesOrganizationsLayerResponse.b);
    }

    public final int hashCode() {
        uc4 uc4Var = this.a;
        return this.b.hashCode() + ((uc4Var == null ? 0 : uc4Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PlacesOrganizationsLayerResponse(bbox=" + this.a + ", mapObjects=" + this.b + Extension.C_BRAKE;
    }

    public PlacesOrganizationsLayerResponse() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
