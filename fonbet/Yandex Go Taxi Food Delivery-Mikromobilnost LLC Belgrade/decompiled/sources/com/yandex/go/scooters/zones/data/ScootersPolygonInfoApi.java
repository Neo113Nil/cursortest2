package com.yandex.go.scooters.zones.data;

import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfoResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.uau;
import defpackage.wqs;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/zones/data/ScootersPolygonInfoApi;", "", "", "", "headers", "polygonId", "Lcmt;", "Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonInfoResponse;", "a", "(Ljava/util/Map;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersPolygonInfoApi {
    @wqs("scooters/v1/polygon/info")
    cmt<ScootersPolygonInfoResponse> a(@uau Map<String, String> headers, @djg0("id") String polygonId);
}
