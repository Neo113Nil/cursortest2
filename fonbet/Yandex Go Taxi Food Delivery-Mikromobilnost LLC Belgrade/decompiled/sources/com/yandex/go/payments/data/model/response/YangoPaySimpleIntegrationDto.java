package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/YangoPaySimpleIntegrationDto;", "Lcom/yandex/go/payments/data/model/response/y1;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/z1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class YangoPaySimpleIntegrationDto extends y1 {
    public static final z1 Companion = new z1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Availability e;

    public YangoPaySimpleIntegrationDto(int i, String str, String str2, String str3, String str4, Availability availability) {
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
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getE() {
        return this.e;
    }

    @Override // com.yandex.go.payments.data.model.response.y1
    public final String c() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YangoPaySimpleIntegrationDto)) {
            return false;
        }
        YangoPaySimpleIntegrationDto yangoPaySimpleIntegrationDto = (YangoPaySimpleIntegrationDto) obj;
        return jl40.l(this.a, yangoPaySimpleIntegrationDto.a) && jl40.l(this.b, yangoPaySimpleIntegrationDto.b) && jl40.l(this.c, yangoPaySimpleIntegrationDto.c) && jl40.l(this.d, yangoPaySimpleIntegrationDto.d) && jl40.l(this.e, yangoPaySimpleIntegrationDto.e);
    }

    /* renamed from: f, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Availability availability = this.e;
        return hashCode + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("YangoPaySimpleIntegrationDto(id=", this.a, ", title=", this.b, ", icon=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", availability=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public YangoPaySimpleIntegrationDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = null;
    }
}
