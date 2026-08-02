package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotItemActionDto$CloseAndDeeplink", "Lcom/yandex/go/slot/dto/b2;", "Companion", "$serializer", "com/yandex/go/slot/dto/r0", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemActionDto$CloseAndDeeplink extends b2 {
    public static final r0 Companion = new r0();
    public final String a;

    public SlotItemActionDto$CloseAndDeeplink(int i, String str) {
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
        return (obj instanceof SlotItemActionDto$CloseAndDeeplink) && jl40.l(this.a, ((SlotItemActionDto$CloseAndDeeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CloseAndDeeplink(deeplink=", this.a, Extension.C_BRAKE);
    }

    public SlotItemActionDto$CloseAndDeeplink() {
        this.a = "";
    }
}
