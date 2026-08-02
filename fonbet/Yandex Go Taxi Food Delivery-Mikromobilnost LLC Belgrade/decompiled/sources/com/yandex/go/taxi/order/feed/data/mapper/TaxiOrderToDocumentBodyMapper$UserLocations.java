package com.yandex.go.taxi.order.feed.data.mapper;

import com.yandex.go.shortcuts.dto.request.SavedPlace;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.z2y0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/feed/data/mapper/TaxiOrderToDocumentBodyMapper$UserLocations", "", "Companion", "$serializer", "com/yandex/go/taxi/order/feed/data/mapper/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderToDocumentBodyMapper$UserLocations {
    public static final b Companion = new b();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2y0(29))};
    public final SavedPlace.Location a;
    public final SavedPlace.Location b;
    public final SavedPlace.Location c;
    public final List d;

    public /* synthetic */ TaxiOrderToDocumentBodyMapper$UserLocations(int i, SavedPlace.Location location, SavedPlace.Location location2, SavedPlace.Location location3, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, TaxiOrderToDocumentBodyMapper$UserLocations$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = location;
        this.b = location2;
        this.c = location3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderToDocumentBodyMapper$UserLocations)) {
            return false;
        }
        TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations = (TaxiOrderToDocumentBodyMapper$UserLocations) obj;
        return jl40.l(this.a, taxiOrderToDocumentBodyMapper$UserLocations.a) && jl40.l(this.b, taxiOrderToDocumentBodyMapper$UserLocations.b) && jl40.l(this.c, taxiOrderToDocumentBodyMapper$UserLocations.c) && jl40.l(this.d, taxiOrderToDocumentBodyMapper$UserLocations.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SavedPlace.Location location = this.b;
        int hashCode2 = (hashCode + (location == null ? 0 : location.hashCode())) * 31;
        SavedPlace.Location location2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (location2 != null ? location2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UserLocations(currentLocation=" + this.a + ", pointA=" + this.b + ", pointB=" + this.c + ", savedPlaces=" + this.d + Extension.C_BRAKE;
    }

    public TaxiOrderToDocumentBodyMapper$UserLocations(SavedPlace.Location location, SavedPlace.Location location2, SavedPlace.Location location3, List list) {
        this.a = location;
        this.b = location2;
        this.c = location3;
        this.d = list;
    }
}
