package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.rsf;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtPaymentMethodDto;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtPaymentMethodDto {
    public static final r Companion = new r();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(19))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ DebtPaymentMethodDto(int i, String str, String str2, List list) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtPaymentMethodDto)) {
            return false;
        }
        DebtPaymentMethodDto debtPaymentMethodDto = (DebtPaymentMethodDto) obj;
        return jl40.l(this.a, debtPaymentMethodDto.a) && jl40.l(this.b, debtPaymentMethodDto.b) && jl40.l(this.c, debtPaymentMethodDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("DebtPaymentMethodDto(type=", this.a, ", paymentMethodId=", this.b, ", complements="), this.c, Extension.C_BRAKE);
    }

    public DebtPaymentMethodDto() {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
    }
}
