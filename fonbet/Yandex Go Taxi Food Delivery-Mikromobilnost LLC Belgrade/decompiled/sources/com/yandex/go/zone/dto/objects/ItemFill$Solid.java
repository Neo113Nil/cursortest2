package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/ItemFill$Solid", "Lcom/yandex/go/zone/dto/objects/n2;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/l2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ItemFill$Solid extends n2 {
    public static final l2 Companion = new l2();
    public final String a;

    public ItemFill$Solid(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ItemFill$Solid) && jl40.l(this.a, ((ItemFill$Solid) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Solid(color=", this.a, Extension.C_BRAKE);
    }

    public ItemFill$Solid() {
        this.a = "";
    }
}
