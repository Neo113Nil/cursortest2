package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.tse0;
import defpackage.xlf0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/bottom_panel/PromoInfoDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/q", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoInfoDto {
    public static final q Companion = new q();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(11))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ PromoInfoDto(String str, int i, String str2, String str3, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, PromoInfoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
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
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoInfoDto)) {
            return false;
        }
        PromoInfoDto promoInfoDto = (PromoInfoDto) obj;
        return jl40.l(this.a, promoInfoDto.a) && jl40.l(this.b, promoInfoDto.b) && jl40.l(this.c, promoInfoDto.c) && jl40.l(this.d, promoInfoDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return tse0.j(this.c, ", disclaimerTexts=", Extension.C_BRAKE, b64.v("PromoInfoDto(text=", this.a, ", textColor=", this.b, ", adText="), this.d);
    }
}
