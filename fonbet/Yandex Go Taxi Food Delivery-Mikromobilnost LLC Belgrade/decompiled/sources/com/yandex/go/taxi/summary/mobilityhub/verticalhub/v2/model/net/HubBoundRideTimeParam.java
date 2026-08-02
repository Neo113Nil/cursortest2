package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubBoundRideTimeParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubBoundRideTimeParam {
    public static final p Companion = new p();
    public final Integer a;
    public final Integer b;

    public /* synthetic */ HubBoundRideTimeParam(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, HubBoundRideTimeParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = num2;
    }
}
