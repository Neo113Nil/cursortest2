package com.yandex.go.order.external.unifiedpolling.dto.contact;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/contact/EatsOrderContactDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/contact/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderContactDto {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(21)), null};
    public final EatsOrderContactKindDto a;
    public final String b;

    public /* synthetic */ EatsOrderContactDto(int i, EatsOrderContactKindDto eatsOrderContactKindDto, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = eatsOrderContactKindDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public EatsOrderContactDto() {
        this.a = null;
        this.b = null;
    }
}
