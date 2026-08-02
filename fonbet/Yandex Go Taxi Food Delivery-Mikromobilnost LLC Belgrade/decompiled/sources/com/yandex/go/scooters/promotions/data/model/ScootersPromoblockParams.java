package com.yandex.go.scooters.promotions.data.model;

import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockParams;", "", "Companion", "$serializer", "com/yandex/go/scooters/promotions/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromoblockParams {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(15)), null};
    public final ScootersPromotionsScreen a;
    public final Integer b;

    public /* synthetic */ ScootersPromoblockParams(int i, ScootersPromotionsScreen scootersPromotionsScreen, Integer num) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ScootersPromoblockParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = scootersPromotionsScreen;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public ScootersPromoblockParams(ScootersPromotionsScreen scootersPromotionsScreen, Integer num) {
        this.a = scootersPromotionsScreen;
        this.b = num;
    }
}
