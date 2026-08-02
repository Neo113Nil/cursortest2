package com.yandex.go.net.taxi.dto.response.typed_experiments;

import defpackage.gsq0;
import defpackage.xn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/net/taxi/dto/response/typed_experiments/MulticlassTariffPositionExperiment;", "Lxn11;", "Companion", "com/yandex/go/net/taxi/dto/response/typed_experiments/a", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MulticlassTariffPositionExperiment implements xn11 {
    public static final a Companion = new a();
    public final int b;

    public /* synthetic */ MulticlassTariffPositionExperiment(int i, int i2) {
        if ((i & 1) == 0) {
            this.b = Integer.MAX_VALUE;
        } else {
            this.b = i2;
        }
    }

    public MulticlassTariffPositionExperiment() {
        this.b = Integer.MAX_VALUE;
    }
}
