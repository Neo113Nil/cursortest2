package com.yandex.go.chargers.qr.data.model;

import com.yandex.go.chargers.data.model.ChargersStationDto;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/qr/data/model/ChargersStationSearchResponse;", "", "Companion", "$serializer", "com/yandex/go/chargers/qr/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationSearchResponse {
    public static final b Companion = new b();
    public final ChargersStationDto a;

    public /* synthetic */ ChargersStationSearchResponse(int i, ChargersStationDto chargersStationDto) {
        if ((i & 1) == 0) {
            this.a = new ChargersStationDto("", "", "");
        } else {
            this.a = chargersStationDto;
        }
    }

    public ChargersStationSearchResponse() {
        this.a = new ChargersStationDto("", "", "");
    }
}
