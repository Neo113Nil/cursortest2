package com.yandex.go.order.external.unifiedpolling.dto.card.header;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/card/header/EatsOrderCardHeaderDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/card/header/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderCardHeaderDto {
    public static final b Companion = new b();
    public final EatsOrderCardHeaderBackgroundDto a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ EatsOrderCardHeaderDto(int i, EatsOrderCardHeaderBackgroundDto eatsOrderCardHeaderBackgroundDto, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? new EatsOrderCardHeaderBackgroundDto(0) : eatsOrderCardHeaderBackgroundDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final EatsOrderCardHeaderBackgroundDto getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public EatsOrderCardHeaderDto() {
        this(0);
    }

    public EatsOrderCardHeaderDto(int i) {
        this.a = new EatsOrderCardHeaderBackgroundDto(0);
        this.b = "";
        this.c = "";
        this.d = null;
    }
}
