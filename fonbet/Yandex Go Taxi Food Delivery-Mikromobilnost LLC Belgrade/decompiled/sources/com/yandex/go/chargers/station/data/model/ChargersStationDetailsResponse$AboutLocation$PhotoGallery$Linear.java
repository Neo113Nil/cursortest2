package com.yandex.go.chargers.station.data.model;

import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear", "Lcom/yandex/go/chargers/station/data/model/f;", "Companion", "$serializer", "com/yandex/go/chargers/station/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear extends f {
    public static final e Companion = new e();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(25))};
    public final List a;

    public ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear() {
        this.a = EmptyList.a;
    }
}
