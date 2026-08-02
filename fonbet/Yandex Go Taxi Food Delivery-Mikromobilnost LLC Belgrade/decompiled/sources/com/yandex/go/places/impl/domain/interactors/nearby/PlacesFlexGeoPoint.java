package com.yandex.go.places.impl.domain.interactors.nearby;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/interactors/nearby/PlacesFlexGeoPoint;", "", "Companion", "$serializer", "com/yandex/go/places/impl/domain/interactors/nearby/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesFlexGeoPoint {
    public static final a Companion = new a();
    public final Double a;
    public final Double b;

    public /* synthetic */ PlacesFlexGeoPoint(int i, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesFlexGeoPoint)) {
            return false;
        }
        PlacesFlexGeoPoint placesFlexGeoPoint = (PlacesFlexGeoPoint) obj;
        return jl40.l(this.a, placesFlexGeoPoint.a) && jl40.l(this.b, placesFlexGeoPoint.b);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "PlacesFlexGeoPoint(lon=" + this.a + ", lat=" + this.b + Extension.C_BRAKE;
    }

    public PlacesFlexGeoPoint(Double d, Double d2) {
        this.a = d;
        this.b = d2;
    }

    public PlacesFlexGeoPoint() {
        this(null, null);
    }
}
