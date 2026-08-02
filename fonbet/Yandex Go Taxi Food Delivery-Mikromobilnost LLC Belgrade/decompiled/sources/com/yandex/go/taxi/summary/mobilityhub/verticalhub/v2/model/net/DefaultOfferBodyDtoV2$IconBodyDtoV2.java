package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/DefaultOfferBodyDtoV2$IconBodyDtoV2", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/f;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDtoV2$IconBodyDtoV2 extends f {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(4)), null};
    public final String a;
    public final String b;
    public final q2 c;
    public final DefaultOfferBodyDtoV2$IconBodyAlignment d;
    public final Integer e;

    public DefaultOfferBodyDtoV2$IconBodyDtoV2(int i, String str, String str2, q2 q2Var, DefaultOfferBodyDtoV2$IconBodyAlignment defaultOfferBodyDtoV2$IconBodyAlignment, Integer num) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = q2Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = defaultOfferBodyDtoV2$IconBodyAlignment;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    public DefaultOfferBodyDtoV2$IconBodyDtoV2() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
