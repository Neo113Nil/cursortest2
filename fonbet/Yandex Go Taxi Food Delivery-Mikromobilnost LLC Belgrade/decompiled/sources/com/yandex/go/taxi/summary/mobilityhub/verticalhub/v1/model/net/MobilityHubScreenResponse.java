package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.sq20;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MobilityHubScreenResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/u0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MobilityHubScreenResponse {
    public static final u0 Companion = new u0();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sq20(8)), null, null, null};
    public final List a;
    public final HubAnalyticsPayload b;
    public final ief c;
    public final HubFooterDto d;

    public /* synthetic */ MobilityHubScreenResponse(int i, List list, HubAnalyticsPayload hubAnalyticsPayload, ief iefVar, HubFooterDto hubFooterDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new HubAnalyticsPayload(0);
        } else {
            this.b = hubAnalyticsPayload;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iefVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hubFooterDto;
        }
    }

    public MobilityHubScreenResponse() {
        HubAnalyticsPayload hubAnalyticsPayload = new HubAnalyticsPayload(0);
        this.a = EmptyList.a;
        this.b = hubAnalyticsPayload;
        this.c = null;
        this.d = null;
    }
}
