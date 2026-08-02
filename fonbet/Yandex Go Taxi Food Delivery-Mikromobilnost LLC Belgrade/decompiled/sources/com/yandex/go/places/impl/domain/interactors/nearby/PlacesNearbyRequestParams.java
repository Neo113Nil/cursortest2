package com.yandex.go.places.impl.domain.interactors.nearby;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/interactors/nearby/PlacesNearbyRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/domain/interactors/nearby/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesNearbyRequestParams {
    public static final c Companion = new c();
    public final PlacesFlexGeoPoint a;
    public final PlacesFlexGeoPoint b;
    public final PlacesNearbyStateRequestParams c;

    public /* synthetic */ PlacesNearbyRequestParams(int i, PlacesFlexGeoPoint placesFlexGeoPoint, PlacesFlexGeoPoint placesFlexGeoPoint2, PlacesNearbyStateRequestParams placesNearbyStateRequestParams) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = placesFlexGeoPoint;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = placesFlexGeoPoint2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = placesNearbyStateRequestParams;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesNearbyRequestParams)) {
            return false;
        }
        PlacesNearbyRequestParams placesNearbyRequestParams = (PlacesNearbyRequestParams) obj;
        return jl40.l(this.a, placesNearbyRequestParams.a) && jl40.l(this.b, placesNearbyRequestParams.b) && jl40.l(this.c, placesNearbyRequestParams.c);
    }

    public final int hashCode() {
        PlacesFlexGeoPoint placesFlexGeoPoint = this.a;
        int hashCode = (placesFlexGeoPoint == null ? 0 : placesFlexGeoPoint.hashCode()) * 31;
        PlacesFlexGeoPoint placesFlexGeoPoint2 = this.b;
        int hashCode2 = (hashCode + (placesFlexGeoPoint2 == null ? 0 : placesFlexGeoPoint2.hashCode())) * 31;
        PlacesNearbyStateRequestParams placesNearbyStateRequestParams = this.c;
        return hashCode2 + (placesNearbyStateRequestParams != null ? placesNearbyStateRequestParams.hashCode() : 0);
    }

    public final String toString() {
        return "PlacesNearbyRequestParams(pointA=" + this.a + ", userLocation=" + this.b + ", state=" + this.c + Extension.C_BRAKE;
    }

    public PlacesNearbyRequestParams(PlacesFlexGeoPoint placesFlexGeoPoint, PlacesFlexGeoPoint placesFlexGeoPoint2, PlacesNearbyStateRequestParams placesNearbyStateRequestParams) {
        this.a = placesFlexGeoPoint;
        this.b = placesFlexGeoPoint2;
        this.c = placesNearbyStateRequestParams;
    }

    public PlacesNearbyRequestParams() {
        this(null, null, null);
    }
}
