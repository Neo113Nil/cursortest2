package com.yandex.go.scooters.zones.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonInfoResponse;", "", "Companion", "$serializer", "com/yandex/go/scooters/zones/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPolygonInfoResponse {
    public static final d Companion = new d();
    public final ScootersPolygonInfo a;
    public final ScootersPolygonLegend b;

    public /* synthetic */ ScootersPolygonInfoResponse(int i, ScootersPolygonInfo scootersPolygonInfo, ScootersPolygonLegend scootersPolygonLegend) {
        this.a = (i & 1) == 0 ? new ScootersPolygonInfo(0) : scootersPolygonInfo;
        if ((i & 2) == 0) {
            this.b = new ScootersPolygonLegend(0);
        } else {
            this.b = scootersPolygonLegend;
        }
    }

    public ScootersPolygonInfoResponse() {
        ScootersPolygonInfo scootersPolygonInfo = new ScootersPolygonInfo(0);
        ScootersPolygonLegend scootersPolygonLegend = new ScootersPolygonLegend(0);
        this.a = scootersPolygonInfo;
        this.b = scootersPolygonLegend;
    }
}
