package com.yandex.go.payments.data.model.response;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/SbpToken;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/s1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SbpToken implements k2a0 {
    public static final s1 Companion = new s1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Availability f;

    public /* synthetic */ SbpToken(int i, String str, String str2, String str3, String str4, String str5, Availability availability) {
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
            this.f = availability;
        }
    }

    public static final void h(SbpToken sbpToken, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(sbpToken.a, "")) {
            yjdVar.o(serialDescriptor, 0, sbpToken.a);
        }
        if (yjdVar.F() || !jl40.l(sbpToken.b, "")) {
            yjdVar.o(serialDescriptor, 1, sbpToken.b);
        }
        if (yjdVar.F() || !jl40.l(sbpToken.c, "")) {
            yjdVar.o(serialDescriptor, 2, sbpToken.c);
        }
        if (yjdVar.F() || !jl40.l(sbpToken.d, "")) {
            yjdVar.o(serialDescriptor, 3, sbpToken.d);
        }
        if (yjdVar.F() || sbpToken.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, sbpToken.e);
        }
        if (!yjdVar.F() && sbpToken.f == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 5, Availability$$serializer.INSTANCE, sbpToken.f);
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

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbpToken)) {
            return false;
        }
        SbpToken sbpToken = (SbpToken) obj;
        return jl40.l(this.a, sbpToken.a) && jl40.l(this.b, sbpToken.b) && jl40.l(this.c, sbpToken.c) && jl40.l(this.d, sbpToken.d) && jl40.l(this.e, sbpToken.e) && jl40.l(this.f, sbpToken.f);
    }

    /* renamed from: f, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: g, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Availability availability = this.f;
        return hashCode + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SbpToken(id=", this.a, ", bankId=", this.b, ", bankName=");
        g8e.D(v, this.c, ", title=", this.d, ", subtitle=");
        v.append(this.e);
        v.append(", availability=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public SbpToken() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = null;
        this.f = null;
    }
}
