package com.yandex.go.payments.data.model.response;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentsNotification;", "", "Companion", "com/yandex/go/payments/data/model/response/j1", "DeeplinkTapAction", "$serializer", "com/yandex/go/payments/data/model/response/g1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentsNotification {
    public static final g1 Companion = new g1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final j1 h;

    public /* synthetic */ PaymentsNotification(int i, String str, String str2, String str3, String str4, String str5, Integer num, boolean z, j1 j1Var) {
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
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = j1Var;
        }
    }

    public static final /* synthetic */ void i(PaymentsNotification paymentsNotification, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(paymentsNotification.a, "")) {
            yjdVar.o(serialDescriptor, 0, paymentsNotification.a);
        }
        if (yjdVar.F() || !jl40.l(paymentsNotification.b, "")) {
            yjdVar.o(serialDescriptor, 1, paymentsNotification.b);
        }
        if (yjdVar.F() || !jl40.l(paymentsNotification.c, "")) {
            yjdVar.o(serialDescriptor, 2, paymentsNotification.c);
        }
        if (yjdVar.F() || !jl40.l(paymentsNotification.d, "")) {
            yjdVar.o(serialDescriptor, 3, paymentsNotification.d);
        }
        if (yjdVar.F() || paymentsNotification.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, paymentsNotification.e);
        }
        if (yjdVar.F() || paymentsNotification.f != null) {
            yjdVar.g(serialDescriptor, 5, h6w.a, paymentsNotification.f);
        }
        if (yjdVar.F() || !paymentsNotification.g) {
            yjdVar.n(serialDescriptor, 6, paymentsNotification.g);
        }
        if (!yjdVar.F() && paymentsNotification.h == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 7, i1.e, paymentsNotification.h);
    }

    /* renamed from: a, reason: from getter */
    public final j1 getH() {
        return this.h;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    /* renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: e, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentsNotification)) {
            return false;
        }
        PaymentsNotification paymentsNotification = (PaymentsNotification) obj;
        return jl40.l(this.a, paymentsNotification.a) && jl40.l(this.b, paymentsNotification.b) && jl40.l(this.c, paymentsNotification.c) && jl40.l(this.d, paymentsNotification.d) && jl40.l(this.e, paymentsNotification.e) && jl40.l(this.f, paymentsNotification.f) && this.g == paymentsNotification.g && jl40.l(this.h, paymentsNotification.h);
    }

    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: g, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: h, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int e = unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
        j1 j1Var = this.h;
        return e + (j1Var != null ? j1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentsNotification(id=", this.a, ", type=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", iconTag=");
        vfc.w(this.f, this.e, ", autoHideTimeout=", ", closeable=", v);
        v.append(this.g);
        v.append(", action=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentsNotification$DeeplinkTapAction;", "Lcom/yandex/go/payments/data/model/response/j1;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/h1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DeeplinkTapAction extends j1 {
        public static final h1 Companion = new h1();
        public final String a;

        public DeeplinkTapAction(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public DeeplinkTapAction() {
            this.a = "";
        }
    }

    public PaymentsNotification() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = null;
        this.f = null;
        this.g = true;
        this.h = null;
    }
}
