package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.PersonalAccount;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/YangoPayWalletDto;", "Lcom/yandex/go/payments/data/model/response/y1;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/a2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class YangoPayWalletDto extends y1 {
    public static final a2 Companion = new a2();
    public final String a;
    public final String b;
    public final String c;
    public final ief d;
    public final boolean e;
    public final PersonalAccount.ComplementAttributes f;
    public final Availability g;

    public YangoPayWalletDto(int i, String str, String str2, String str3, ief iefVar, boolean z, PersonalAccount.ComplementAttributes complementAttributes, Availability availability) {
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
            this.d = ief.e;
        } else {
            this.d = iefVar;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = complementAttributes;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = availability;
        }
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getG() {
        return this.g;
    }

    @Override // com.yandex.go.payments.data.model.response.y1
    public final String c() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final ief getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YangoPayWalletDto)) {
            return false;
        }
        YangoPayWalletDto yangoPayWalletDto = (YangoPayWalletDto) obj;
        return jl40.l(this.a, yangoPayWalletDto.a) && jl40.l(this.b, yangoPayWalletDto.b) && jl40.l(this.c, yangoPayWalletDto.c) && jl40.l(this.d, yangoPayWalletDto.d) && this.e == yangoPayWalletDto.e && jl40.l(this.f, yangoPayWalletDto.f) && jl40.l(this.g, yangoPayWalletDto.g);
    }

    public final boolean f() {
        PersonalAccount.ComplementAttributes complementAttributes = this.f;
        return (complementAttributes == null || ((List) complementAttributes.d.getValue()).isEmpty()) ? false : true;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int e = unr0.e((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e);
        PersonalAccount.ComplementAttributes complementAttributes = this.f;
        int hashCode3 = (e + (complementAttributes == null ? 0 : complementAttributes.hashCode())) * 31;
        Availability availability = this.g;
        return hashCode3 + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("YangoPayWalletDto(id=", this.a, ", moneyLeftPlaceholder=", this.b, ", moneyLeft=");
        v.append(this.c);
        v.append(", currencyRulesDto=");
        v.append(this.d);
        v.append(", isComplement=");
        v.append(this.e);
        v.append(", complementAttributes=");
        v.append(this.f);
        v.append(", availability=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public YangoPayWalletDto() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = ief.e;
        this.e = false;
        this.f = null;
        this.g = null;
    }
}
