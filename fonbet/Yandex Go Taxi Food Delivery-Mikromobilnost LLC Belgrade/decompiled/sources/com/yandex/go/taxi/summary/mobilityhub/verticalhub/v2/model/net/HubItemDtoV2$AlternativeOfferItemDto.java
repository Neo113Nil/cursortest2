package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$AlternativeOfferItemDto", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/u0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemDtoV2$AlternativeOfferItemDto {
    public static final u0 Companion = new u0();
    public static final i3y[] j = {null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(27))};
    public final String a;
    public final Integer b;
    public final HubItemDtoV2$DefaultOfferHeaderDtoV2 c;
    public final f d;
    public final s0 e;
    public final s0 f;
    public final String g;
    public final String h;
    public final List i;

    public HubItemDtoV2$AlternativeOfferItemDto(int i, String str, Integer num, HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2, f fVar, s0 s0Var, s0 s0Var2, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
            this.d = null;
        } else {
            this.d = fVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = s0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = s0Var2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
    }

    public HubItemDtoV2$AlternativeOfferItemDto() {
        HubItemDtoV2$DefaultOfferHeaderDtoV2.Companion.getClass();
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2 = HubItemDtoV2$DefaultOfferHeaderDtoV2.l;
        this.a = null;
        this.b = null;
        this.c = hubItemDtoV2$DefaultOfferHeaderDtoV2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = EmptyList.a;
    }
}
