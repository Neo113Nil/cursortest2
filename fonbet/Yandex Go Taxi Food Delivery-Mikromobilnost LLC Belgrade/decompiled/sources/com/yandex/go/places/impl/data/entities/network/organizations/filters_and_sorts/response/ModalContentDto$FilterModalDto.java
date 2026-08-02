package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.sq20;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/ModalContentDto$FilterModalDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/m;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ModalContentDto$FilterModalDto extends m {
    public static final j Companion = new j();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new sq20(11)), kotlin.a.b(lazyThreadSafetyMode, new sq20(12))};
    }

    public ModalContentDto$FilterModalDto(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalContentDto$FilterModalDto)) {
            return false;
        }
        ModalContentDto$FilterModalDto modalContentDto$FilterModalDto = (ModalContentDto$FilterModalDto) obj;
        return jl40.l(this.a, modalContentDto$FilterModalDto.a) && jl40.l(this.b, modalContentDto$FilterModalDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("FilterModalDto(blocks=", this.a, ", buttons=", this.b, Extension.C_BRAKE);
    }

    public ModalContentDto$FilterModalDto() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }
}
