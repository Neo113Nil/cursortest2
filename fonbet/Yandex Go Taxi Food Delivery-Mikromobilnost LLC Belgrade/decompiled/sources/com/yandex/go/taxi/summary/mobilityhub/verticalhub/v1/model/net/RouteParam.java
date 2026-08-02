package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/RouteParam;", "", "Companion", "Address", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteParam {
    public static final w0 Companion = new w0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(23))};
    public final List a;

    public /* synthetic */ RouteParam(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, RouteParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/RouteParam$Address;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Address {
        public static final v0 Companion = new v0();
        public final zzs a;

        public /* synthetic */ Address(int i, zzs zzsVar) {
            if (1 == (i & 1)) {
                this.a = zzsVar;
            } else {
                qje.Z(i, 1, RouteParam$Address$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public Address(zzs zzsVar) {
            this.a = zzsVar;
        }
    }

    public RouteParam(ArrayList arrayList) {
        this.a = arrayList;
    }
}
