package com.yandex.go.places.models.data.entities.network.map;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qxz;
import defpackage.unr0;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectItemDto$UniversalPinDto", "Lcom/yandex/go/places/models/data/entities/network/map/e;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/c", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MapObjectItemDto$UniversalPinDto extends e {
    public static final c Companion = new c();
    public static final i3y[] i = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(19)), null, null, null, null};
    public final String a;
    public final zzs b;
    public final Double c;
    public final List d;
    public final Boolean e;
    public final u f;
    public final u g;
    public final MapObjectPinStyleDto$UniversalSPinStyleDto h;

    public MapObjectItemDto$UniversalPinDto(int i2, String str, zzs zzsVar, Double d, List list, Boolean bool, u uVar, u uVar2, MapObjectPinStyleDto$UniversalSPinStyleDto mapObjectPinStyleDto$UniversalSPinStyleDto) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = zzs.f;
        } else {
            this.b = zzsVar;
        }
        if ((i2 & 4) == 0) {
            this.c = Double.valueOf(0.0d);
        } else {
            this.c = d;
        }
        if ((i2 & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i2 & 16) == 0) {
            this.e = Boolean.FALSE;
        } else {
            this.e = bool;
        }
        if ((i2 & 32) == 0) {
            this.f = t.INSTANCE;
        } else {
            this.f = uVar;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = uVar2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = mapObjectPinStyleDto$UniversalSPinStyleDto;
        }
    }

    @Override // com.yandex.go.places.models.data.entities.network.map.e
    /* renamed from: a, reason: from getter */
    public final zzs getB() {
        return this.b;
    }

    @Override // com.yandex.go.places.models.data.entities.network.map.e
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.places.models.data.entities.network.map.e
    /* renamed from: c, reason: from getter */
    public final List getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapObjectItemDto$UniversalPinDto)) {
            return false;
        }
        MapObjectItemDto$UniversalPinDto mapObjectItemDto$UniversalPinDto = (MapObjectItemDto$UniversalPinDto) obj;
        return jl40.l(this.a, mapObjectItemDto$UniversalPinDto.a) && jl40.l(this.b, mapObjectItemDto$UniversalPinDto.b) && jl40.l(this.c, mapObjectItemDto$UniversalPinDto.c) && jl40.l(this.d, mapObjectItemDto$UniversalPinDto.d) && jl40.l(this.e, mapObjectItemDto$UniversalPinDto.e) && jl40.l(this.f, mapObjectItemDto$UniversalPinDto.f) && jl40.l(this.g, mapObjectItemDto$UniversalPinDto.g) && jl40.l(this.h, mapObjectItemDto$UniversalPinDto.h);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        Double d = this.c;
        int c = unr0.c((b + (d == null ? 0 : d.hashCode())) * 31, 31, this.d);
        Boolean bool = this.e;
        int hashCode = (this.f.hashCode() + ((c + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        u uVar = this.g;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        MapObjectPinStyleDto$UniversalSPinStyleDto mapObjectPinStyleDto$UniversalSPinStyleDto = this.h;
        return hashCode2 + (mapObjectPinStyleDto$UniversalSPinStyleDto != null ? mapObjectPinStyleDto$UniversalSPinStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalPinDto(id=" + this.a + ", geometry=" + this.b + ", priority=" + this.c + ", triggerActions=" + this.d + ", isFavorite=" + this.e + ", defaultStyle=" + this.f + ", selectedStyle=" + this.g + ", dustStyle=" + this.h + Extension.C_BRAKE;
    }

    public MapObjectItemDto$UniversalPinDto() {
        zzs zzsVar = zzs.f;
        Double valueOf = Double.valueOf(0.0d);
        Boolean bool = Boolean.FALSE;
        t tVar = t.INSTANCE;
        this.a = "";
        this.b = zzsVar;
        this.c = valueOf;
        this.d = EmptyList.a;
        this.e = bool;
        this.f = tVar;
        this.g = null;
        this.h = null;
    }
}
