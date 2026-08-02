package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemActionV2$SelectOffer", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s0;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemActionV2$SelectOffer extends s0 {
    public static final j0 Companion = new j0();
    public static final i3y[] l;
    public final String a;
    public final HubOfferType b;
    public final String c;
    public final List d;
    public final String e;
    public final List f;
    public final HubButtonContainerDto g;
    public final List h;
    public final Integer i;
    public final ScooterPriceDto j;
    public final String k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new hqu(19)), null, kotlin.a.b(lazyThreadSafetyMode, new hqu(20)), null, kotlin.a.b(lazyThreadSafetyMode, new hqu(21)), null, kotlin.a.b(lazyThreadSafetyMode, new hqu(22)), null, null, null};
    }

    public HubItemActionV2$SelectOffer(int i, String str, HubOfferType hubOfferType, String str2, List list, String str3, List list2, HubButtonContainerDto hubButtonContainerDto, List list3, Integer num, ScooterPriceDto scooterPriceDto, String str4) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = HubOfferType.UNKNOWN;
        } else {
            this.b = hubOfferType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = hubButtonContainerDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = scooterPriceDto;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
    }

    public HubItemActionV2$SelectOffer() {
        HubOfferType hubOfferType = HubOfferType.UNKNOWN;
        this.a = "";
        this.b = hubOfferType;
        this.c = null;
        this.d = EmptyList.a;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }
}
