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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/SbpBindToken;", "Lcom/yandex/go/payments/data/model/response/r0;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/r1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SbpBindToken extends r0 implements k2a0 {
    public static final r1 Companion = new r1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Availability e;

    public SbpBindToken(int i, String str, String str2, String str3, String str4, Availability availability) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
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
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = availability;
        }
    }

    @Override // defpackage.k2a0
    /* renamed from: a */
    public final String getA() {
        String str = this.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getE() {
        return this.e;
    }

    @Override // com.yandex.go.payments.data.model.response.r0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbpBindToken)) {
            return false;
        }
        SbpBindToken sbpBindToken = (SbpBindToken) obj;
        return jl40.l(this.a, sbpBindToken.a) && jl40.l(this.b, sbpBindToken.b) && jl40.l(this.c, sbpBindToken.c) && jl40.l(this.d, sbpBindToken.d) && jl40.l(this.e, sbpBindToken.e);
    }

    /* renamed from: f, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Availability availability = this.e;
        return hashCode2 + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SbpBindToken(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", availability=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public SbpBindToken() {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
