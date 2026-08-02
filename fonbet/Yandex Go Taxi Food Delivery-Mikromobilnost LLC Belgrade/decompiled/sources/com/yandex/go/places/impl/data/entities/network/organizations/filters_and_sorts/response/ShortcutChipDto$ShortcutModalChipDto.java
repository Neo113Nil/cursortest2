package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/ShortcutChipDto$ShortcutModalChipDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/q;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShortcutChipDto$ShortcutModalChipDto extends q {
    public static final o Companion = new o();
    public final String a;
    public final m b;
    public final ChipAppearanceDto c;

    public ShortcutChipDto$ShortcutModalChipDto(int i, String str, m mVar, ChipAppearanceDto chipAppearanceDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = l.INSTANCE;
        } else {
            this.b = mVar;
        }
        if ((i & 4) == 0) {
            this.c = new ChipAppearanceDto(0);
        } else {
            this.c = chipAppearanceDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutChipDto$ShortcutModalChipDto)) {
            return false;
        }
        ShortcutChipDto$ShortcutModalChipDto shortcutChipDto$ShortcutModalChipDto = (ShortcutChipDto$ShortcutModalChipDto) obj;
        return jl40.l(this.a, shortcutChipDto$ShortcutModalChipDto.a) && jl40.l(this.b, shortcutChipDto$ShortcutModalChipDto.b) && jl40.l(this.c, shortcutChipDto$ShortcutModalChipDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShortcutModalChipDto(id=" + this.a + ", modal=" + this.b + ", appearance=" + this.c + Extension.C_BRAKE;
    }

    public ShortcutChipDto$ShortcutModalChipDto() {
        l lVar = l.INSTANCE;
        ChipAppearanceDto chipAppearanceDto = new ChipAppearanceDto(0);
        this.a = "";
        this.b = lVar;
        this.c = chipAppearanceDto;
    }
}
