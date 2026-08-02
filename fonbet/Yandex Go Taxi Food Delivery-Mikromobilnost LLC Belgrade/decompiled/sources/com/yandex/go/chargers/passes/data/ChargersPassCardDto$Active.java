package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassCardDto$Active", "Lcom/yandex/go/chargers/passes/data/r;", "Companion", "com/yandex/go/chargers/passes/data/n", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassCardDto$Active extends r {
    public static final n Companion = new n();
    public final String a;
    public final ChargersPassProgressDto b;
    public final ChargersPassButtonDto c;
    public final ChargersPassInfoBadgeDto d;

    public ChargersPassCardDto$Active(int i, String str, ChargersPassProgressDto chargersPassProgressDto, ChargersPassButtonDto chargersPassButtonDto, ChargersPassInfoBadgeDto chargersPassInfoBadgeDto) {
        this.a = (i & 1) == 0 ? ClidProvider.APP_ACTIVE : str;
        if ((i & 2) == 0) {
            this.b = new ChargersPassProgressDto(0);
        } else {
            this.b = chargersPassProgressDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersPassButtonDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = chargersPassInfoBadgeDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassCardDto$Active)) {
            return false;
        }
        ChargersPassCardDto$Active chargersPassCardDto$Active = (ChargersPassCardDto$Active) obj;
        return jl40.l(this.a, chargersPassCardDto$Active.a) && jl40.l(this.b, chargersPassCardDto$Active.b) && jl40.l(this.c, chargersPassCardDto$Active.c) && jl40.l(this.d, chargersPassCardDto$Active.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ChargersPassButtonDto chargersPassButtonDto = this.c;
        int hashCode2 = (hashCode + (chargersPassButtonDto == null ? 0 : chargersPassButtonDto.hashCode())) * 31;
        ChargersPassInfoBadgeDto chargersPassInfoBadgeDto = this.d;
        return hashCode2 + (chargersPassInfoBadgeDto != null ? chargersPassInfoBadgeDto.hashCode() : 0);
    }

    public final String toString() {
        return "Active(type=" + this.a + ", progress=" + this.b + ", trailButton=" + this.c + ", badge=" + this.d + Extension.C_BRAKE;
    }

    public ChargersPassCardDto$Active() {
        ChargersPassProgressDto chargersPassProgressDto = new ChargersPassProgressDto(0);
        this.a = ClidProvider.APP_ACTIVE;
        this.b = chargersPassProgressDto;
        this.c = null;
        this.d = null;
    }
}
