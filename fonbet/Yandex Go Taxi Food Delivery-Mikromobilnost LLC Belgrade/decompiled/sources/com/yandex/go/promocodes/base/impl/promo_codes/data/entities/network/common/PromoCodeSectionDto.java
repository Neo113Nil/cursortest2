package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeSectionDto;", "", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoCodeSectionDto {
    public static final j Companion = new j();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(7))};
    public final String a;
    public final List b;

    public /* synthetic */ PromoCodeSectionDto(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public static final /* synthetic */ void b(PromoCodeSectionDto promoCodeSectionDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || promoCodeSectionDto.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, promoCodeSectionDto.a);
        }
        if (!yjdVar.F() && jl40.l(promoCodeSectionDto.b, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), promoCodeSectionDto.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeSectionDto)) {
            return false;
        }
        PromoCodeSectionDto promoCodeSectionDto = (PromoCodeSectionDto) obj;
        return jl40.l(this.a, promoCodeSectionDto.a) && jl40.l(this.b, promoCodeSectionDto.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("PromoCodeSectionDto(title=", this.a, ", promoCodeSectionIds=", Extension.C_BRAKE, this.b);
    }

    public PromoCodeSectionDto() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
