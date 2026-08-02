package com.yandex.go.taxi.order.experiments;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kz60;
import defpackage.scc;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/OnlyV2RideCardExperiment;", "Lw96;", "Companion", "com/yandex/go/taxi/order/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnlyV2RideCardExperiment extends w96 {
    public static final c Companion = new c();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(3))};
    public static final OnlyV2RideCardExperiment e = new OnlyV2RideCardExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ OnlyV2RideCardExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = scc.g(RideCardPresentationType.COMPACT, RideCardPresentationType.DETAILS);
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public OnlyV2RideCardExperiment() {
        this(0);
    }

    public OnlyV2RideCardExperiment(int i) {
        List g = scc.g(RideCardPresentationType.COMPACT, RideCardPresentationType.DETAILS);
        this.b = false;
        this.c = g;
    }
}
