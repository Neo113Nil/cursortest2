package com.yandex.go.explorer.impl.data.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/RegionItemDto;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegionItemDto {
    public static final h Companion = new h();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(29))};
    public final String a;
    public final String b;
    public final double c;
    public final List d;

    public /* synthetic */ RegionItemDto(int i, String str, String str2, double d, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, RegionItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = d;
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
        if (!(obj instanceof RegionItemDto)) {
            return false;
        }
        RegionItemDto regionItemDto = (RegionItemDto) obj;
        return jl40.l(this.a, regionItemDto.a) && jl40.l(this.b, regionItemDto.b) && Double.compare(this.c, regionItemDto.c) == 0 && jl40.l(this.d, regionItemDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.a(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("RegionItemDto(id=", this.a, ", title=", this.b, ", coverage=");
        v.append(this.c);
        v.append(", polygons=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
