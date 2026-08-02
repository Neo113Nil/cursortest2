package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubRideTimeParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubRideTimeParam {
    public static final c0 Companion = new c0();
    public final int a;
    public final String b;

    public /* synthetic */ HubRideTimeParam(int i, int i2, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, HubRideTimeParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public HubRideTimeParam(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
