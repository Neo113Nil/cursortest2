package com.yandex.go.taxi.order.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pyy0;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TrackingTariffIconOverlayExperiment;", "Lxn11;", "Companion", "TrackingCardIconOverlayExperimentIconModel", "com/yandex/go/taxi/order/experiments/t", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TrackingTariffIconOverlayExperiment implements xn11 {
    public static final t Companion = new t();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(28))};
    public final boolean b;
    public final List c;

    public /* synthetic */ TrackingTariffIconOverlayExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TrackingTariffIconOverlayExperiment$TrackingCardIconOverlayExperimentIconModel;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/experiments/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TrackingCardIconOverlayExperimentIconModel {
        public static final u Companion = new u();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(29))};
        public final String a;
        public final List b;

        public /* synthetic */ TrackingCardIconOverlayExperimentIconModel(int i, String str, List list) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public TrackingCardIconOverlayExperimentIconModel() {
            this.a = null;
            this.b = EmptyList.a;
        }
    }

    public TrackingTariffIconOverlayExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public TrackingTariffIconOverlayExperiment() {
        this(0);
    }
}
