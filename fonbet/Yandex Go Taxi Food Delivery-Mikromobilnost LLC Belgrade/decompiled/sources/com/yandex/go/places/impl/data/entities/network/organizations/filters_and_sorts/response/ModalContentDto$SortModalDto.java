package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/ModalContentDto$SortModalDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/m;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ModalContentDto$SortModalDto extends m {
    public static final k Companion = new k();
    public final SortModalItemBlockDto a;

    public ModalContentDto$SortModalDto(int i, SortModalItemBlockDto sortModalItemBlockDto) {
        if ((i & 1) == 0) {
            this.a = new SortModalItemBlockDto(0);
        } else {
            this.a = sortModalItemBlockDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalContentDto$SortModalDto) && jl40.l(this.a, ((ModalContentDto$SortModalDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SortModalDto(sortBlock=" + this.a + Extension.C_BRAKE;
    }

    public ModalContentDto$SortModalDto() {
        this.a = new SortModalItemBlockDto(0);
    }
}
