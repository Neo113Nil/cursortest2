package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteParamV2;", "", "Companion", "AddressV2", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/u1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteParamV2 {
    public static final u1 Companion = new u1();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(24))};
    public final List a;

    public /* synthetic */ RouteParamV2(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, RouteParamV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public RouteParamV2(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteParamV2$AddressV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/t1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AddressV2 {
        public static final t1 Companion = new t1();
        public final PositionObject a;
        public final String b;

        public /* synthetic */ AddressV2(int i, PositionObject positionObject, String str) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, RouteParamV2$AddressV2$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = positionObject;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public AddressV2(PositionObject positionObject, String str) {
            this.a = positionObject;
            this.b = str;
        }
    }
}
