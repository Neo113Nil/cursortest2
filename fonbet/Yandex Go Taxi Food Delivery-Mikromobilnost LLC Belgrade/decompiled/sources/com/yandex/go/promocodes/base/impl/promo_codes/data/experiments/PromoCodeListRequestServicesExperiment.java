package com.yandex.go.promocodes.base.impl.promo_codes.data.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pmf0;
import defpackage.qmf0;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/experiments/PromoCodeListRequestServicesExperiment;", "Lxn11;", "Companion", "com/yandex/go/promocodes/base/impl/promo_codes/data/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PromoCodeListRequestServicesExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(0))};
    public static final PromoCodeListRequestServicesExperiment d = new PromoCodeListRequestServicesExperiment(0);
    public final List b;

    public /* synthetic */ PromoCodeListRequestServicesExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = qmf0.a;
        } else {
            this.b = list;
        }
    }

    public PromoCodeListRequestServicesExperiment(int i) {
        this.b = qmf0.a;
    }

    public PromoCodeListRequestServicesExperiment() {
        this(0);
    }
}
