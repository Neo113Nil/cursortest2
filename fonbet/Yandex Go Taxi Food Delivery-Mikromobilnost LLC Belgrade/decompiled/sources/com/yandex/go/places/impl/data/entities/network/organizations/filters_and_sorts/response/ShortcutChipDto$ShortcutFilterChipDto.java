package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/ShortcutChipDto$ShortcutFilterChipDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/q;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShortcutChipDto$ShortcutFilterChipDto extends q {
    public static final n Companion = new n();
    public final FilterChipDto a;

    public ShortcutChipDto$ShortcutFilterChipDto(int i, FilterChipDto filterChipDto) {
        if ((i & 1) == 0) {
            this.a = new FilterChipDto(0);
        } else {
            this.a = filterChipDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortcutChipDto$ShortcutFilterChipDto) && jl40.l(this.a, ((ShortcutChipDto$ShortcutFilterChipDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShortcutFilterChipDto(filterChip=" + this.a + Extension.C_BRAKE;
    }

    public ShortcutChipDto$ShortcutFilterChipDto() {
        this.a = new FilterChipDto(0);
    }
}
