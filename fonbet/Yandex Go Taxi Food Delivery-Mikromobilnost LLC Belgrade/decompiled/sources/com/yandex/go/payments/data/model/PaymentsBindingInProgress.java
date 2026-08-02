package com.yandex.go.payments.data.model;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/PaymentsBindingInProgress;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentsBindingInProgress {
    public static final c0 Companion = new c0();
    public final String a;
    public final String b;

    public /* synthetic */ PaymentsBindingInProgress(int i, String str, String str2) {
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

    public static final /* synthetic */ void c(PaymentsBindingInProgress paymentsBindingInProgress, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || paymentsBindingInProgress.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, paymentsBindingInProgress.a);
        }
        if (!yjdVar.F() && paymentsBindingInProgress.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, auu0.a, paymentsBindingInProgress.b);
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentsBindingInProgress)) {
            return false;
        }
        PaymentsBindingInProgress paymentsBindingInProgress = (PaymentsBindingInProgress) obj;
        return jl40.l(this.a, paymentsBindingInProgress.a) && jl40.l(this.b, paymentsBindingInProgress.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("PaymentsBindingInProgress(type=", this.a, ", bindingId=", this.b, Extension.C_BRAKE);
    }

    public PaymentsBindingInProgress() {
        this.a = null;
        this.b = null;
    }
}
