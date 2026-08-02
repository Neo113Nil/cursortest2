package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/TransportExternalPaymentMethod;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/w1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TransportExternalPaymentMethod implements k2a0 {
    public static final w1 Companion = new w1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Availability f;

    public /* synthetic */ TransportExternalPaymentMethod(int i, String str, String str2, String str3, String str4, String str5, Availability availability) {
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
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = availability;
        }
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getE() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportExternalPaymentMethod)) {
            return false;
        }
        TransportExternalPaymentMethod transportExternalPaymentMethod = (TransportExternalPaymentMethod) obj;
        return jl40.l(this.a, transportExternalPaymentMethod.a) && jl40.l(this.b, transportExternalPaymentMethod.b) && jl40.l(this.c, transportExternalPaymentMethod.c) && jl40.l(this.d, transportExternalPaymentMethod.d) && jl40.l(this.e, transportExternalPaymentMethod.e) && jl40.l(this.f, transportExternalPaymentMethod.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Availability availability = this.f;
        return b + (availability == null ? 0 : availability.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("TransportExternalPaymentMethod(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", shortName=", this.d, ", iconTag=");
        v.append(this.e);
        v.append(", availability=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public TransportExternalPaymentMethod() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = null;
    }
}
