package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemActionV2$TaxiOrder", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s0;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemActionV2$TaxiOrder extends s0 {
    public static final l0 Companion = new l0();
    public final String a;
    public final SelectedTariffInfoDto b;
    public final TollRoadDto c;
    public final MultimodalPointsDto d;
    public final String e;
    public final String f;
    public final Long g;

    public HubItemActionV2$TaxiOrder(int i, String str, SelectedTariffInfoDto selectedTariffInfoDto, TollRoadDto tollRoadDto, MultimodalPointsDto multimodalPointsDto, String str2, String str3, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = selectedTariffInfoDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = tollRoadDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = multimodalPointsDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
    }

    public HubItemActionV2$TaxiOrder() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
