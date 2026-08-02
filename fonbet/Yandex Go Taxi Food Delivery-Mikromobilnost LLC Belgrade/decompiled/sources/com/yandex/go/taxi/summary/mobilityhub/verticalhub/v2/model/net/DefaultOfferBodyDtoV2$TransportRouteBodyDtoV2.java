package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSeparator;
import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/f;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 extends f {
    public static final d Companion = new d();
    public static final i3y[] e;
    public final List a;
    public final TransportRouteSeparator b;
    public final q2 c;
    public final String d;

    static {
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.z0 z0Var = TransportRouteSection.Companion;
        e = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(5)), null, null, null};
    }

    public DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2(int i, List list, TransportRouteSeparator transportRouteSeparator, q2 q2Var, String str) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = transportRouteSeparator;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = q2Var;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final TransportRouteSeparator getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final q2 getC() {
        return this.c;
    }

    public DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
        this.d = "";
    }
}
