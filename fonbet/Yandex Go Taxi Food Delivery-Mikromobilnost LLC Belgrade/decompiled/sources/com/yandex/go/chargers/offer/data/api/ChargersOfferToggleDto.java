package com.yandex.go.chargers.offer.data.api;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferToggleDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferToggleDto {
    public static final q Companion = new q();
    public final String a;
    public final boolean b;

    public /* synthetic */ ChargersOfferToggleDto(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public ChargersOfferToggleDto() {
        this.a = "";
        this.b = false;
    }
}
