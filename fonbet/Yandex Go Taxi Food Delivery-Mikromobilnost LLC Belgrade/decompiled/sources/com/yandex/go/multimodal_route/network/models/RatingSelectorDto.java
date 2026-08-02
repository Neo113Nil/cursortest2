package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/RatingSelectorDto;", "", "Companion", "com/yandex/go/multimodal_route/network/models/o", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RatingSelectorDto {
    public static final o Companion = new o();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(13))};
    public static final RatingSelectorDto e = new RatingSelectorDto();
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ RatingSelectorDto(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, RatingSelectorDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingSelectorDto)) {
            return false;
        }
        RatingSelectorDto ratingSelectorDto = (RatingSelectorDto) obj;
        return jl40.l(this.a, ratingSelectorDto.a) && jl40.l(this.b, ratingSelectorDto.b) && jl40.l(this.c, ratingSelectorDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("RatingSelectorDto(id=", this.a, ", analyticsId=", this.b, ", hints="), this.c, Extension.C_BRAKE);
    }

    public RatingSelectorDto() {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
    }
}
