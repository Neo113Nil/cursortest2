package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.syu;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubTollRoadsParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/f1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubTollRoadsParam {
    public static final f1 Companion = new f1();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(16))};
    public final Boolean a;
    public final String b;
    public final Boolean c;
    public final HubAvailableParam d;

    public /* synthetic */ HubTollRoadsParam(int i, Boolean bool, String str, Boolean bool2, HubAvailableParam hubAvailableParam) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, HubTollRoadsParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = str;
        this.c = bool2;
        this.d = hubAvailableParam;
    }

    public HubTollRoadsParam(Boolean bool, String str, Boolean bool2, HubAvailableParam hubAvailableParam) {
        this.a = bool;
        this.b = str;
        this.c = bool2;
        this.d = hubAvailableParam;
    }
}
