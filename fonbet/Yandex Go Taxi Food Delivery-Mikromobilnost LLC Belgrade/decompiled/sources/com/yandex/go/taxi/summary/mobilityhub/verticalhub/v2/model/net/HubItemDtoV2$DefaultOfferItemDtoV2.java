package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$DefaultOfferItemDtoV2", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/b1;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemDtoV2$DefaultOfferItemDtoV2 extends b1 {
    public static final w0 Companion = new w0();
    public static final i3y[] l;
    public final String a;
    public final Integer b;
    public final HubItemDtoV2$DefaultOfferHeaderDtoV2 c;
    public final boolean d;
    public final f e;
    public final List f;
    public final s0 g;
    public final s0 h;
    public final String i;
    public final String j;
    public final List k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new hqu(28)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new hqu(29))};
    }

    public HubItemDtoV2$DefaultOfferItemDtoV2(int i, String str, Integer num, HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2, boolean z, f fVar, List list, s0 s0Var, s0 s0Var2, String str2, String str3, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            HubItemDtoV2$DefaultOfferHeaderDtoV2.Companion.getClass();
            this.c = HubItemDtoV2$DefaultOfferHeaderDtoV2.l;
        } else {
            this.c = hubItemDtoV2$DefaultOfferHeaderDtoV2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fVar;
        }
        int i2 = i & 32;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.f = emptyList;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = q0.INSTANCE;
        } else {
            this.g = s0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = s0Var2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = emptyList;
        } else {
            this.k = list2;
        }
    }

    public HubItemDtoV2$DefaultOfferItemDtoV2() {
        HubItemDtoV2$DefaultOfferHeaderDtoV2.Companion.getClass();
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2 = HubItemDtoV2$DefaultOfferHeaderDtoV2.l;
        q0 q0Var = q0.INSTANCE;
        this.a = "";
        this.b = null;
        this.c = hubItemDtoV2$DefaultOfferHeaderDtoV2;
        this.d = false;
        this.e = null;
        EmptyList emptyList = EmptyList.a;
        this.f = emptyList;
        this.g = q0Var;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = emptyList;
    }
}
