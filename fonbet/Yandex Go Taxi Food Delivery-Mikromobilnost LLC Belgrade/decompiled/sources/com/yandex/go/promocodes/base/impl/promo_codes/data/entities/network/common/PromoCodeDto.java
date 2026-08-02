package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gef;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xlf0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDto;", "", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoCodeDto {
    public static final c Companion = new c();
    public static final i3y[] o;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final PromoCodeStatusDto e;
    public final boolean f;
    public final String g;
    public final PromoCodeErrorDto h;
    public final ief i;
    public final PromoCodeActionDto j;
    public final List k;
    public final String l;
    public final List m;
    public final String n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new xlf0(4)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new xlf0(5)), null, kotlin.a.b(lazyThreadSafetyMode, new xlf0(6)), null};
    }

    public /* synthetic */ PromoCodeDto(int i, String str, String str2, String str3, String str4, PromoCodeStatusDto promoCodeStatusDto, boolean z, String str5, PromoCodeErrorDto promoCodeErrorDto, ief iefVar, PromoCodeActionDto promoCodeActionDto, List list, String str6, List list2, String str7) {
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
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = promoCodeStatusDto;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = promoCodeErrorDto;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = iefVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = promoCodeActionDto;
        }
        int i2 = i & 1024;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.k = emptyList;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
        if ((i & 4096) == 0) {
            this.m = emptyList;
        } else {
            this.m = list2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
    }

    public static final /* synthetic */ void b(PromoCodeDto promoCodeDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(promoCodeDto.a, "")) {
            yjdVar.o(serialDescriptor, 0, promoCodeDto.a);
        }
        if (yjdVar.F() || promoCodeDto.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, promoCodeDto.b);
        }
        if (yjdVar.F() || promoCodeDto.c != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, promoCodeDto.c);
        }
        if (yjdVar.F() || promoCodeDto.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, promoCodeDto.d);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = o;
        if (F || promoCodeDto.e != null) {
            yjdVar.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), promoCodeDto.e);
        }
        if (yjdVar.F() || promoCodeDto.f) {
            yjdVar.n(serialDescriptor, 5, promoCodeDto.f);
        }
        if (yjdVar.F() || promoCodeDto.g != null) {
            yjdVar.g(serialDescriptor, 6, auu0.a, promoCodeDto.g);
        }
        if (yjdVar.F() || promoCodeDto.h != null) {
            yjdVar.g(serialDescriptor, 7, PromoCodeErrorDto$$serializer.INSTANCE, promoCodeDto.h);
        }
        if (yjdVar.F() || promoCodeDto.i != null) {
            yjdVar.g(serialDescriptor, 8, gef.a, promoCodeDto.i);
        }
        if (yjdVar.F() || promoCodeDto.j != null) {
            yjdVar.g(serialDescriptor, 9, PromoCodeActionDto$$serializer.INSTANCE, promoCodeDto.j);
        }
        boolean F2 = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        if (F2 || !jl40.l(promoCodeDto.k, emptyList)) {
            yjdVar.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), promoCodeDto.k);
        }
        if (yjdVar.F() || promoCodeDto.l != null) {
            yjdVar.g(serialDescriptor, 11, auu0.a, promoCodeDto.l);
        }
        if (yjdVar.F() || !jl40.l(promoCodeDto.m, emptyList)) {
            yjdVar.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), promoCodeDto.m);
        }
        if (!yjdVar.F() && promoCodeDto.n == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 13, auu0.a, promoCodeDto.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeDto)) {
            return false;
        }
        PromoCodeDto promoCodeDto = (PromoCodeDto) obj;
        return jl40.l(this.a, promoCodeDto.a) && jl40.l(this.b, promoCodeDto.b) && jl40.l(this.c, promoCodeDto.c) && jl40.l(this.d, promoCodeDto.d) && this.e == promoCodeDto.e && this.f == promoCodeDto.f && jl40.l(this.g, promoCodeDto.g) && jl40.l(this.h, promoCodeDto.h) && jl40.l(this.i, promoCodeDto.i) && jl40.l(this.j, promoCodeDto.j) && jl40.l(this.k, promoCodeDto.k) && jl40.l(this.l, promoCodeDto.l) && jl40.l(this.m, promoCodeDto.m) && jl40.l(this.n, promoCodeDto.n);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PromoCodeStatusDto promoCodeStatusDto = this.e;
        int e = unr0.e((hashCode4 + (promoCodeStatusDto == null ? 0 : promoCodeStatusDto.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        int hashCode5 = (e + (str4 == null ? 0 : str4.hashCode())) * 31;
        PromoCodeErrorDto promoCodeErrorDto = this.h;
        int hashCode6 = (hashCode5 + (promoCodeErrorDto == null ? 0 : promoCodeErrorDto.hashCode())) * 31;
        ief iefVar = this.i;
        int hashCode7 = (hashCode6 + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        PromoCodeActionDto promoCodeActionDto = this.j;
        int c = unr0.c((hashCode7 + (promoCodeActionDto == null ? 0 : promoCodeActionDto.hashCode())) * 31, 31, this.k);
        String str5 = this.l;
        int c2 = unr0.c((c + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.m);
        String str6 = this.n;
        return c2 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoCodeDto(code=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", content=", this.d, ", status=");
        v.append(this.e);
        v.append(", isSelected=");
        v.append(this.f);
        v.append(", iconTag=");
        v.append(this.g);
        v.append(", error=");
        v.append(this.h);
        v.append(", currencyRules=");
        v.append(this.i);
        v.append(", action=");
        v.append(this.j);
        v.append(", services=");
        oyr.D(", sectionId=", this.l, ", classes=", v, this.k);
        return n.l(", additionalDiscountInfo=", this.n, Extension.C_BRAKE, v, this.m);
    }

    public PromoCodeDto() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        EmptyList emptyList = EmptyList.a;
        this.k = emptyList;
        this.l = null;
        this.m = emptyList;
        this.n = null;
    }
}
