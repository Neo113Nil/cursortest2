package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.syu;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenResponseV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/d1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubScreenResponseV2 {
    public static final d1 Companion = new d1();
    public static final i3y[] d;
    public final List a;
    public final HubAnalyticsPayload b;
    public final HubFooterDtoV2 c;

    static {
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.z zVar = HubOnboardingDto.Companion;
        d = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(13)), null, null};
    }

    public /* synthetic */ HubScreenResponseV2(int i, List list, HubAnalyticsPayload hubAnalyticsPayload, HubFooterDtoV2 hubFooterDtoV2) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = hubAnalyticsPayload;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hubFooterDtoV2;
        }
    }

    public HubScreenResponseV2() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
    }
}
