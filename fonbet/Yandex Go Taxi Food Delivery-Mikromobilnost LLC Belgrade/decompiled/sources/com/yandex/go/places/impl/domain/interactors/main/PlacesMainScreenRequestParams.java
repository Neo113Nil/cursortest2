package com.yandex.go.places.impl.domain.interactors.main;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/interactors/main/PlacesMainScreenRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/domain/interactors/main/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesMainScreenRequestParams {
    public static final d Companion = new d();
    public final PlacesMainScreenDataRequestParams a;
    public final PlacesMainScreenStateRequestParams b;
    public final PlacesFlexGeoPoint c;
    public final PlacesFlexGeoPoint d;

    public /* synthetic */ PlacesMainScreenRequestParams(int i, PlacesMainScreenDataRequestParams placesMainScreenDataRequestParams, PlacesMainScreenStateRequestParams placesMainScreenStateRequestParams, PlacesFlexGeoPoint placesFlexGeoPoint, PlacesFlexGeoPoint placesFlexGeoPoint2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = placesMainScreenDataRequestParams;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = placesMainScreenStateRequestParams;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = placesFlexGeoPoint;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = placesFlexGeoPoint2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesMainScreenRequestParams)) {
            return false;
        }
        PlacesMainScreenRequestParams placesMainScreenRequestParams = (PlacesMainScreenRequestParams) obj;
        return jl40.l(this.a, placesMainScreenRequestParams.a) && jl40.l(this.b, placesMainScreenRequestParams.b) && jl40.l(this.c, placesMainScreenRequestParams.c) && jl40.l(this.d, placesMainScreenRequestParams.d);
    }

    public final int hashCode() {
        PlacesMainScreenDataRequestParams placesMainScreenDataRequestParams = this.a;
        int hashCode = (placesMainScreenDataRequestParams == null ? 0 : placesMainScreenDataRequestParams.hashCode()) * 31;
        PlacesMainScreenStateRequestParams placesMainScreenStateRequestParams = this.b;
        int hashCode2 = (hashCode + (placesMainScreenStateRequestParams == null ? 0 : placesMainScreenStateRequestParams.hashCode())) * 31;
        PlacesFlexGeoPoint placesFlexGeoPoint = this.c;
        int hashCode3 = (hashCode2 + (placesFlexGeoPoint == null ? 0 : placesFlexGeoPoint.hashCode())) * 31;
        PlacesFlexGeoPoint placesFlexGeoPoint2 = this.d;
        return hashCode3 + (placesFlexGeoPoint2 != null ? placesFlexGeoPoint2.hashCode() : 0);
    }

    public final String toString() {
        return "PlacesMainScreenRequestParams(data=" + this.a + ", state=" + this.b + ", userLocation=" + this.c + ", pointA=" + this.d + Extension.C_BRAKE;
    }

    public PlacesMainScreenRequestParams(PlacesMainScreenDataRequestParams placesMainScreenDataRequestParams, PlacesMainScreenStateRequestParams placesMainScreenStateRequestParams, PlacesFlexGeoPoint placesFlexGeoPoint, PlacesFlexGeoPoint placesFlexGeoPoint2) {
        this.a = placesMainScreenDataRequestParams;
        this.b = placesMainScreenStateRequestParams;
        this.c = placesFlexGeoPoint;
        this.d = placesFlexGeoPoint2;
    }

    public PlacesMainScreenRequestParams() {
        this(null, null, null, null);
    }
}
