package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubDescriptionsPartsParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubDescriptionsPartsParam {
    public static final i Companion = new i();
    public final String a;
    public final String b;

    public /* synthetic */ HubDescriptionsPartsParam(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, HubDescriptionsPartsParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public HubDescriptionsPartsParam(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
