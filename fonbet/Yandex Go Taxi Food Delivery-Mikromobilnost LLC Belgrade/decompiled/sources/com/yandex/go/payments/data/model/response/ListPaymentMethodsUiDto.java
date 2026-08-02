package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.wwx;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ListPaymentMethodsUiDto;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/o0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ListPaymentMethodsUiDto {
    public static final o0 Companion = new o0();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final List c;

    static {
        f fVar = AddPaymentMethodButton.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wwx(13)), kotlin.a.b(lazyThreadSafetyMode, new wwx(14)), kotlin.a.b(lazyThreadSafetyMode, new wwx(15))};
    }

    public /* synthetic */ ListPaymentMethodsUiDto(int i, List list, List list2, List list3) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPaymentMethodsUiDto)) {
            return false;
        }
        ListPaymentMethodsUiDto listPaymentMethodsUiDto = (ListPaymentMethodsUiDto) obj;
        return jl40.l(this.a, listPaymentMethodsUiDto.a) && jl40.l(this.b, listPaymentMethodsUiDto.b) && jl40.l(this.c, listPaymentMethodsUiDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(qv10.v("ListPaymentMethodsUiDto(addButtons=", this.a, ", coopAccounts=", this.b, ", notifications="), this.c, Extension.C_BRAKE);
    }

    public ListPaymentMethodsUiDto() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
    }
}
