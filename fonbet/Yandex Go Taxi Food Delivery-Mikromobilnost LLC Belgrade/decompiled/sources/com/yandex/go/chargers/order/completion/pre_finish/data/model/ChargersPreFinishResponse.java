package com.yandex.go.chargers.order.completion.pre_finish.data.model;

import com.yandex.go.chargers.data.model.ChargersStationInfoDto;
import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishResponse;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/completion/pre_finish/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPreFinishResponse {
    public static final f Companion = new f();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(0)), null};
    public final ChargersStationInfoDto a;
    public final List b;
    public final ActiveOrderDto c;

    public /* synthetic */ ChargersPreFinishResponse(int i, ChargersStationInfoDto chargersStationInfoDto, List list, ActiveOrderDto activeOrderDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersStationInfoDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = activeOrderDto;
        }
    }

    public ChargersPreFinishResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
