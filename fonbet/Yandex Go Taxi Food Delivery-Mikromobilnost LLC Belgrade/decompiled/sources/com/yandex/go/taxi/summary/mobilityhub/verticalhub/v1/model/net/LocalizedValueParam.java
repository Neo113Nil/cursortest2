package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/LocalizedValueParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/h0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocalizedValueParam {
    public static final h0 Companion = new h0();
    public final double a;
    public final String b;

    public /* synthetic */ LocalizedValueParam(double d, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, LocalizedValueParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = str;
    }

    public LocalizedValueParam(double d, String str) {
        this.a = d;
        this.b = str;
    }
}
