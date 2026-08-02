package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtAvailablePaymentMethod;", "", "Companion", "com/yandex/go/overdraft/data/model/h", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtAvailablePaymentMethod {
    public static final h Companion = new h();
    public static final DebtAvailablePaymentMethod c = new DebtAvailablePaymentMethod(null, null);
    public final String a;
    public final String b;

    public /* synthetic */ DebtAvailablePaymentMethod(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtAvailablePaymentMethod)) {
            return false;
        }
        DebtAvailablePaymentMethod debtAvailablePaymentMethod = (DebtAvailablePaymentMethod) obj;
        return jl40.l(this.a, debtAvailablePaymentMethod.a) && jl40.l(this.b, debtAvailablePaymentMethod.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("DebtAvailablePaymentMethod(type=", this.a, ", paymentMethodId=", this.b, Extension.C_BRAKE);
    }

    public DebtAvailablePaymentMethod(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public DebtAvailablePaymentMethod() {
        this(null, null);
    }
}
