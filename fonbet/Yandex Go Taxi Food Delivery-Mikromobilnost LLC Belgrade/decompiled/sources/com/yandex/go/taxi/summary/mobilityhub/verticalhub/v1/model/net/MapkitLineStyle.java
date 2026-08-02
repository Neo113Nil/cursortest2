package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitLineStyle;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitLineStyle {
    public static final k0 Companion = new k0();
    public final int a;

    public /* synthetic */ MapkitLineStyle(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            qje.Z(i, 1, MapkitLineStyle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public MapkitLineStyle(int i) {
        this.a = i;
    }
}
