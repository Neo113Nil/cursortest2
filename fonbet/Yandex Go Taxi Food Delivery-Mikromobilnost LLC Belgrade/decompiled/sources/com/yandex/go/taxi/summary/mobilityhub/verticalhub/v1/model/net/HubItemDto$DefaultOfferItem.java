package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubItemDto$DefaultOfferItem", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/y;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemDto$DefaultOfferItem extends y {
    public static final v Companion = new v();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(25))};
    public final String a;
    public final DefaultOfferHeaderDto b;
    public final e c;
    public final t d;
    public final List e;

    public HubItemDto$DefaultOfferItem(int i, String str, DefaultOfferHeaderDto defaultOfferHeaderDto, e eVar, t tVar, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            DefaultOfferHeaderDto.Companion.getClass();
            this.b = DefaultOfferHeaderDto.j;
        } else {
            this.b = defaultOfferHeaderDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = eVar;
        }
        if ((i & 8) == 0) {
            this.d = s.INSTANCE;
        } else {
            this.d = tVar;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public HubItemDto$DefaultOfferItem() {
        DefaultOfferHeaderDto.Companion.getClass();
        DefaultOfferHeaderDto defaultOfferHeaderDto = DefaultOfferHeaderDto.j;
        s sVar = s.INSTANCE;
        this.a = "";
        this.b = defaultOfferHeaderDto;
        this.c = null;
        this.d = sVar;
        this.e = EmptyList.a;
    }
}
