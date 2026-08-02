package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.txw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/OrderCardDto;", "", "Companion", "$serializer", "com/yandex/go/dto/response/t1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderCardDto {
    public static final t1 Companion = new t1();
    public final txw0 a;

    public /* synthetic */ OrderCardDto(int i, txw0 txw0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = txw0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final txw0 getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderCardDto) && jl40.l(this.a, ((OrderCardDto) obj).a);
    }

    public final int hashCode() {
        txw0 txw0Var = this.a;
        if (txw0Var == null) {
            return 0;
        }
        return txw0Var.hashCode();
    }

    public final String toString() {
        return "OrderCardDto(swipeAction=" + this.a + Extension.C_BRAKE;
    }

    public OrderCardDto() {
        this.a = null;
    }
}
