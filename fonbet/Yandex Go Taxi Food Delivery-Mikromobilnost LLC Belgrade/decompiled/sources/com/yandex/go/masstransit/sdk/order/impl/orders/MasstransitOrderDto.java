package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto$$serializer;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr00;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitOrderDto {
    public static final f Companion = new f();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(17)), null, null, null, null, null};
    public final String a;
    public final List b;
    public final MasstransitOrderPresentationsDto c;
    public final CurrencyRulesDto d;
    public final String e;
    public final NfcAnimationsDto f;
    public final Integer g;

    public /* synthetic */ MasstransitOrderDto(int i, String str, List list, MasstransitOrderPresentationsDto masstransitOrderPresentationsDto, CurrencyRulesDto currencyRulesDto, String str2, NfcAnimationsDto nfcAnimationsDto, Integer num) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = new MasstransitOrderPresentationsDto(0);
        } else {
            this.c = masstransitOrderPresentationsDto;
        }
        if ((i & 8) == 0) {
            this.d = new CurrencyRulesDto(0);
        } else {
            this.d = currencyRulesDto;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = new NfcAnimationsDto(0);
        } else {
            this.f = nfcAnimationsDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public static MasstransitOrderDto b(MasstransitOrderDto masstransitOrderDto, String str) {
        return new MasstransitOrderDto(masstransitOrderDto.a, masstransitOrderDto.b, masstransitOrderDto.c, masstransitOrderDto.d, str, masstransitOrderDto.f, masstransitOrderDto.g);
    }

    public static final /* synthetic */ void h(MasstransitOrderDto masstransitOrderDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(masstransitOrderDto.a, "")) {
            yjdVar.o(serialDescriptor, 0, masstransitOrderDto.a);
        }
        if (yjdVar.F() || !jl40.l(masstransitOrderDto.b, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) h[1].getValue(), masstransitOrderDto.b);
        }
        if (yjdVar.F() || !jl40.l(masstransitOrderDto.c, new MasstransitOrderPresentationsDto(0))) {
            yjdVar.e(serialDescriptor, 2, MasstransitOrderPresentationsDto$$serializer.INSTANCE, masstransitOrderDto.c);
        }
        if (yjdVar.F() || !jl40.l(masstransitOrderDto.d, new CurrencyRulesDto(0))) {
            yjdVar.e(serialDescriptor, 3, CurrencyRulesDto$$serializer.INSTANCE, masstransitOrderDto.d);
        }
        if (yjdVar.F() || !jl40.l(masstransitOrderDto.e, "")) {
            yjdVar.o(serialDescriptor, 4, masstransitOrderDto.e);
        }
        if (yjdVar.F() || !jl40.l(masstransitOrderDto.f, new NfcAnimationsDto(0))) {
            yjdVar.e(serialDescriptor, 5, NfcAnimationsDto$$serializer.INSTANCE, masstransitOrderDto.f);
        }
        if (!yjdVar.F() && masstransitOrderDto.g == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 6, h6w.a, masstransitOrderDto.g);
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final NfcAnimationsDto getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasstransitOrderDto)) {
            return false;
        }
        MasstransitOrderDto masstransitOrderDto = (MasstransitOrderDto) obj;
        return jl40.l(this.a, masstransitOrderDto.a) && jl40.l(this.b, masstransitOrderDto.b) && jl40.l(this.c, masstransitOrderDto.c) && jl40.l(this.d, masstransitOrderDto.d) && jl40.l(this.e, masstransitOrderDto.e) && jl40.l(this.f, masstransitOrderDto.f) && jl40.l(this.g, masstransitOrderDto.g);
    }

    /* renamed from: f, reason: from getter */
    public final MasstransitOrderPresentationsDto getC() {
        return this.c;
    }

    /* renamed from: g, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.b((this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e)) * 31;
        Integer num = this.g;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder r = xvz.r("MasstransitOrderDto(id=", this.a, ", tickets=", this.b, ", presentations=");
        r.append(this.c);
        r.append(", currencyRules=");
        r.append(this.d);
        r.append(", onboardingId=");
        r.append(this.e);
        r.append(", nfcAnimations=");
        r.append(this.f);
        r.append(", screenBrightness=");
        return oo31.j(r, this.g, Extension.C_BRAKE);
    }

    public MasstransitOrderDto() {
        this(0);
    }

    public MasstransitOrderDto(String str, List list, MasstransitOrderPresentationsDto masstransitOrderPresentationsDto, CurrencyRulesDto currencyRulesDto, String str2, NfcAnimationsDto nfcAnimationsDto, Integer num) {
        this.a = str;
        this.b = list;
        this.c = masstransitOrderPresentationsDto;
        this.d = currencyRulesDto;
        this.e = str2;
        this.f = nfcAnimationsDto;
        this.g = num;
    }

    public /* synthetic */ MasstransitOrderDto(int i) {
        this("", EmptyList.a, new MasstransitOrderPresentationsDto(0), new CurrencyRulesDto(0), "", new NfcAnimationsDto(0), null);
    }
}
