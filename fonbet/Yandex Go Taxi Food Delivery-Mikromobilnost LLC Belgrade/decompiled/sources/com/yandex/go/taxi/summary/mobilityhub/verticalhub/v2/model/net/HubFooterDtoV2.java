package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto;
import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubFooterDtoV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubFooterDtoV2 {
    public static final a0 Companion = new a0();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.z zVar = HubOnboardingDto.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new hqu(14)), kotlin.a.b(lazyThreadSafetyMode, new hqu(15))};
    }

    public /* synthetic */ HubFooterDtoV2(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public HubFooterDtoV2() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }
}
