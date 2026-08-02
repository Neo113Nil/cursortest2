package com.yandex.go.order.external.unifiedpolling.dto.details;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import defpackage.v6z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/details/EatsOrderDetailsDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/details/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderDetailsDto {
    public static final a Companion = new a();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(24))};
    public final String a;
    public final EatsOrderDetailsStatusDto b;
    public final v6z c;
    public final boolean d;
    public final String e;
    public final EatsOrderDetailsDeliveryTypeDto f;

    public /* synthetic */ EatsOrderDetailsDto(int i, String str, EatsOrderDetailsStatusDto eatsOrderDetailsStatusDto, v6z v6zVar, boolean z, String str2, EatsOrderDetailsDeliveryTypeDto eatsOrderDetailsDeliveryTypeDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eatsOrderDetailsStatusDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = v6zVar;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = eatsOrderDetailsDeliveryTypeDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final v6z getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public EatsOrderDetailsDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
    }
}
