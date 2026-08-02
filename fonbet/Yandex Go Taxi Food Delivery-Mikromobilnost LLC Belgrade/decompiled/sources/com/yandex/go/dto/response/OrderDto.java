package com.yandex.go.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/OrderDto;", "", "Companion", "$serializer", "com/yandex/go/dto/response/u1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderDto {
    public static final u1 Companion = new u1();
    public final String a;
    public final String b;
    public final String c;
    public final OrderCardDto d;

    public /* synthetic */ OrderDto(int i, String str, String str2, String str3, OrderCardDto orderCardDto) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = orderCardDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final OrderCardDto getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDto)) {
            return false;
        }
        OrderDto orderDto = (OrderDto) obj;
        return jl40.l(this.a, orderDto.a) && jl40.l(this.b, orderDto.b) && jl40.l(this.c, orderDto.c) && jl40.l(this.d, orderDto.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        OrderCardDto orderCardDto = this.d;
        return b + (orderCardDto == null ? 0 : orderCardDto.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderDto(service=", this.a, ", iconTag=", this.b, ", orderId=");
        v.append(this.c);
        v.append(", orderCard=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public OrderDto() {
        this(null, null, 15);
    }

    public OrderDto(String str, String str2, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        this.a = str;
        this.b = "";
        this.c = str2;
        this.d = null;
    }
}
