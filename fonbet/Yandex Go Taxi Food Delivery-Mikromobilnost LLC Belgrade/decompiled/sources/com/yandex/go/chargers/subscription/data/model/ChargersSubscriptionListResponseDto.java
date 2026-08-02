package com.yandex.go.chargers.subscription.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionListResponseDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSubscriptionListResponseDto {
    public static final l Companion = new l();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(0)), null, null};
    public final List a;
    public final boolean b;
    public final ChargersSubscriptionListUiDto c;

    public /* synthetic */ ChargersSubscriptionListResponseDto(int i, List list, boolean z, ChargersSubscriptionListUiDto chargersSubscriptionListUiDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersSubscriptionListUiDto;
        }
    }

    public ChargersSubscriptionListResponseDto() {
        this.a = EmptyList.a;
        this.b = false;
        this.c = null;
    }
}
