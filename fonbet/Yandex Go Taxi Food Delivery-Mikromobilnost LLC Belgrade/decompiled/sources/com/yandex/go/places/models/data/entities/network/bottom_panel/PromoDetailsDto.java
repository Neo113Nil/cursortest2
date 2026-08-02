package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr;
import defpackage.qje;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/bottom_panel/PromoDetailsDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/p", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoDetailsDto {
    public static final p Companion = new p();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(9))};
    public final kr a;

    public /* synthetic */ PromoDetailsDto(int i, kr krVar) {
        if (1 == (i & 1)) {
            this.a = krVar;
        } else {
            qje.Z(i, 1, PromoDetailsDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromoDetailsDto) && jl40.l(this.a, ((PromoDetailsDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PromoDetailsDto(action=" + this.a + Extension.C_BRAKE;
    }
}
