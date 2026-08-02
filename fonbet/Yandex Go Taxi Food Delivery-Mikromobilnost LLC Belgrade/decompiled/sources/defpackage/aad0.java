package defpackage;

import com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferVendorTypeDto;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class aad0 {
    public static final z9d0 Companion = new z9d0();
    public static final i3y[] k;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final m8d0 f;
    public final String g;
    public final z8d0 h;
    public final PlusPayAcquisitionOfferVendorTypeDto i;
    public final Map j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new q2d0(24)), a.b(lazyThreadSafetyMode, new q2d0(25))};
    }

    public /* synthetic */ aad0(int i, String str, String str2, String str3, String str4, String str5, m8d0 m8d0Var, String str6, z8d0 z8d0Var, PlusPayAcquisitionOfferVendorTypeDto plusPayAcquisitionOfferVendorTypeDto, Map map) {
        if (227 != (i & 227)) {
            qje.Z(i, 227, y9d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
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
            this.e = str5;
        }
        this.f = m8d0Var;
        this.g = str6;
        this.h = z8d0Var;
        if ((i & 256) == 0) {
            this.i = PlusPayAcquisitionOfferVendorTypeDto.UNKNOWN;
        } else {
            this.i = plusPayAcquisitionOfferVendorTypeDto;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aad0)) {
            return false;
        }
        aad0 aad0Var = (aad0) obj;
        return jl40.l(this.a, aad0Var.a) && jl40.l(this.b, aad0Var.b) && jl40.l(this.c, aad0Var.c) && jl40.l(this.d, aad0Var.d) && jl40.l(this.e, aad0Var.e) && jl40.l(this.f, aad0Var.f) && jl40.l(this.g, aad0Var.g) && jl40.l(this.h, aad0Var.h) && this.i == aad0Var.i && jl40.l(this.j, aad0Var.j);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (this.i.hashCode() + ((this.h.hashCode() + unr0.b(unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f.a), 31, this.g)) * 31)) * 31;
        Map map = this.j;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayAcquisitionTariffDto(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", additionalText=");
        sb.append(this.e);
        sb.append(", simpleTariffName=");
        sb.append(this.f);
        sb.append(", period=");
        sb.append(this.g);
        sb.append(", price=");
        sb.append(this.h);
        sb.append(", offerVendorType=");
        sb.append(this.i);
        sb.append(", payload=");
        return smw0.n(sb, this.j, ')');
    }
}
