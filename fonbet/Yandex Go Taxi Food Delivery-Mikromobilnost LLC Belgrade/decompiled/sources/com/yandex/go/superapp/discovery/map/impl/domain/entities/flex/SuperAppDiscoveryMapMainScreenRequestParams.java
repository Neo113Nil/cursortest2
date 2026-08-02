package com.yandex.go.superapp.discovery.map.impl.domain.entities.flex;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/flex/SuperAppDiscoveryMapMainScreenRequestParams;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/domain/entities/flex/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SuperAppDiscoveryMapMainScreenRequestParams {
    public static final c Companion = new c();
    public final SuperAppDiscoveryMapMainScreenDataRequestParams a;
    public final SuperAppDiscoveryMapMainScreenStateRequestParams b;
    public final SuperAppDiscoveryMapFlexGeoPoint c;
    public final SuperAppDiscoveryMapFlexGeoPoint d;

    public /* synthetic */ SuperAppDiscoveryMapMainScreenRequestParams(int i, SuperAppDiscoveryMapMainScreenDataRequestParams superAppDiscoveryMapMainScreenDataRequestParams, SuperAppDiscoveryMapMainScreenStateRequestParams superAppDiscoveryMapMainScreenStateRequestParams, SuperAppDiscoveryMapFlexGeoPoint superAppDiscoveryMapFlexGeoPoint, SuperAppDiscoveryMapFlexGeoPoint superAppDiscoveryMapFlexGeoPoint2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = superAppDiscoveryMapMainScreenDataRequestParams;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = superAppDiscoveryMapMainScreenStateRequestParams;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = superAppDiscoveryMapFlexGeoPoint;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = superAppDiscoveryMapFlexGeoPoint2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppDiscoveryMapMainScreenRequestParams)) {
            return false;
        }
        SuperAppDiscoveryMapMainScreenRequestParams superAppDiscoveryMapMainScreenRequestParams = (SuperAppDiscoveryMapMainScreenRequestParams) obj;
        return jl40.l(this.a, superAppDiscoveryMapMainScreenRequestParams.a) && jl40.l(this.b, superAppDiscoveryMapMainScreenRequestParams.b) && jl40.l(this.c, superAppDiscoveryMapMainScreenRequestParams.c) && jl40.l(this.d, superAppDiscoveryMapMainScreenRequestParams.d);
    }

    public final int hashCode() {
        SuperAppDiscoveryMapMainScreenDataRequestParams superAppDiscoveryMapMainScreenDataRequestParams = this.a;
        int hashCode = (superAppDiscoveryMapMainScreenDataRequestParams == null ? 0 : superAppDiscoveryMapMainScreenDataRequestParams.hashCode()) * 31;
        SuperAppDiscoveryMapMainScreenStateRequestParams superAppDiscoveryMapMainScreenStateRequestParams = this.b;
        int hashCode2 = (hashCode + (superAppDiscoveryMapMainScreenStateRequestParams == null ? 0 : superAppDiscoveryMapMainScreenStateRequestParams.hashCode())) * 31;
        SuperAppDiscoveryMapFlexGeoPoint superAppDiscoveryMapFlexGeoPoint = this.c;
        int hashCode3 = (hashCode2 + (superAppDiscoveryMapFlexGeoPoint == null ? 0 : superAppDiscoveryMapFlexGeoPoint.hashCode())) * 31;
        SuperAppDiscoveryMapFlexGeoPoint superAppDiscoveryMapFlexGeoPoint2 = this.d;
        return hashCode3 + (superAppDiscoveryMapFlexGeoPoint2 != null ? superAppDiscoveryMapFlexGeoPoint2.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppDiscoveryMapMainScreenRequestParams(data=" + this.a + ", state=" + this.b + ", userLocation=" + this.c + ", pointA=" + this.d + Extension.C_BRAKE;
    }

    public SuperAppDiscoveryMapMainScreenRequestParams(SuperAppDiscoveryMapMainScreenDataRequestParams superAppDiscoveryMapMainScreenDataRequestParams, SuperAppDiscoveryMapMainScreenStateRequestParams superAppDiscoveryMapMainScreenStateRequestParams, SuperAppDiscoveryMapFlexGeoPoint superAppDiscoveryMapFlexGeoPoint, SuperAppDiscoveryMapFlexGeoPoint superAppDiscoveryMapFlexGeoPoint2) {
        this.a = superAppDiscoveryMapMainScreenDataRequestParams;
        this.b = superAppDiscoveryMapMainScreenStateRequestParams;
        this.c = superAppDiscoveryMapFlexGeoPoint;
        this.d = superAppDiscoveryMapFlexGeoPoint2;
    }

    public SuperAppDiscoveryMapMainScreenRequestParams() {
        this(null, null, null, null);
    }
}
