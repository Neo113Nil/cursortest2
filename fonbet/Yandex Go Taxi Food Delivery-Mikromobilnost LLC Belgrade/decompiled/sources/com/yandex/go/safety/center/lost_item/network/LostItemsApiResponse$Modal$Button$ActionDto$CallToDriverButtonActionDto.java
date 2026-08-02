package com.yandex.go.safety.center.lost_item.network;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto", "Lcom/yandex/go/safety/center/lost_item/network/h;", "Companion", "$serializer", "com/yandex/go/safety/center/lost_item/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto extends h {
    public static final c Companion = new c();
    public final String a;

    public LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto() {
        this.a = "";
    }
}
