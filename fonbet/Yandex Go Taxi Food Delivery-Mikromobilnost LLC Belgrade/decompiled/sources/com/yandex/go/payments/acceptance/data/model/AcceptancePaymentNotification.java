package com.yandex.go.payments.acceptance.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentNotification;", "", "Companion", "$serializer", "com/yandex/go/payments/acceptance/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AcceptancePaymentNotification {
    public static final e Companion = new e();
    public final String a;
    public final String b;
    public final String c;
    public final AcceptancePaymentActionButton d;

    public /* synthetic */ AcceptancePaymentNotification(int i, String str, String str2, String str3, AcceptancePaymentActionButton acceptancePaymentActionButton) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = acceptancePaymentActionButton;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptancePaymentNotification)) {
            return false;
        }
        AcceptancePaymentNotification acceptancePaymentNotification = (AcceptancePaymentNotification) obj;
        return jl40.l(this.a, acceptancePaymentNotification.a) && jl40.l(this.b, acceptancePaymentNotification.b) && jl40.l(this.c, acceptancePaymentNotification.c) && jl40.l(this.d, acceptancePaymentNotification.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AcceptancePaymentActionButton acceptancePaymentActionButton = this.d;
        return hashCode3 + (acceptancePaymentActionButton != null ? acceptancePaymentActionButton.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AcceptancePaymentNotification(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        v.append(this.c);
        v.append(", button=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public AcceptancePaymentNotification(int i) {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public AcceptancePaymentNotification() {
        this(0);
    }
}
