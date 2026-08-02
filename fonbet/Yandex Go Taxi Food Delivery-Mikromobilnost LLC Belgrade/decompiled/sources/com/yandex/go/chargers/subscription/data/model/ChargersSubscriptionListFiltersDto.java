package com.yandex.go.chargers.subscription.data.model;

import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionListFiltersDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSubscriptionListFiltersDto {
    public static final j Companion = new j();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(29))};
    public final List a;

    public /* synthetic */ ChargersSubscriptionListFiltersDto(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ChargersSubscriptionListFiltersDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public ChargersSubscriptionListFiltersDto(List list) {
        this.a = list;
    }
}
