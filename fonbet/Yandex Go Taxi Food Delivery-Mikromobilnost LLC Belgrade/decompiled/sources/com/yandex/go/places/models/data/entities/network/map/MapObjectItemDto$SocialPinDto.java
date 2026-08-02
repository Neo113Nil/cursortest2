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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectItemDto$SocialPinDto", "Lcom/yandex/go/places/models/data/entities/network/map/e;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/b", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MapObjectItemDto$SocialPinDto extends e {
    public static final b Companion = new b();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(18)), null};
    public final String a;
    public final zzs b;
    public final Double c;
    public final List d;
    public final u e;

    public MapObjectItemDto$SocialPinDto(int i, String str, zzs zzsVar, Double d, List list, u uVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = zzs.f;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = Double.valueOf(0.0d);
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = t.INSTANCE;
        } else {
            this.e = uVar;
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
        if (!(obj instanceof MapObjectItemDto$SocialPinDto)) {
            return false;
        }
        MapObjectItemDto$SocialPinDto mapObjectItemDto$SocialPinDto = (MapObjectItemDto$SocialPinDto) obj;
        return jl40.l(this.a, mapObjectItemDto$SocialPinDto.a) && jl40.l(this.b, mapObjectItemDto$SocialPinDto.b) && jl40.l(this.c, mapObjectItemDto$SocialPinDto.c) && jl40.l(this.d, mapObjectItemDto$SocialPinDto.d) && jl40.l(this.e, mapObjectItemDto$SocialPinDto.e);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        Double d = this.c;
        return this.e.hashCode() + unr0.c((b + (d == null ? 0 : d.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "SocialPinDto(id=" + this.a + ", geometry=" + this.b + ", priority=" + this.c + ", triggerActions=" + this.d + ", defaultStyle=" + this.e + Extension.C_BRAKE;
    }

    public MapObjectItemDto$SocialPinDto() {
        zzs zzsVar = zzs.f;
        Double valueOf = Double.valueOf(0.0d);
        t tVar = t.INSTANCE;
        this.a = "";
        this.b = zzsVar;
        this.c = valueOf;
        this.d = EmptyList.a;
        this.e = tVar;
    }
}
