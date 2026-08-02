package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/OrderButtonStyleDto;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/s2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderButtonStyleDto {
    public static final s2 Companion = new s2();
    public final String a;
    public final n2 b;

    public /* synthetic */ OrderButtonStyleDto(int i, String str, n2 n2Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = m2.INSTANCE;
        } else {
            this.b = n2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderButtonStyleDto)) {
            return false;
        }
        OrderButtonStyleDto orderButtonStyleDto = (OrderButtonStyleDto) obj;
        return jl40.l(this.a, orderButtonStyleDto.a) && jl40.l(this.b, orderButtonStyleDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderButtonStyleDto(textColor=" + this.a + ", fill=" + this.b + Extension.C_BRAKE;
    }

    public OrderButtonStyleDto() {
        m2 m2Var = m2.INSTANCE;
        this.a = "";
        this.b = m2Var;
    }
}
