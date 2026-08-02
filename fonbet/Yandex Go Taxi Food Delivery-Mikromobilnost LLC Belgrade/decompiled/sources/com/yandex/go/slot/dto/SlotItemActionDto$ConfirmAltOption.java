package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotItemActionDto$ConfirmAltOption", "Lcom/yandex/go/slot/dto/b2;", "Companion", "$serializer", "com/yandex/go/slot/dto/s0", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemActionDto$ConfirmAltOption extends b2 {
    public static final s0 Companion = new s0();
    public final String a;

    public SlotItemActionDto$ConfirmAltOption(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotItemActionDto$ConfirmAltOption) && jl40.l(this.a, ((SlotItemActionDto$ConfirmAltOption) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("ConfirmAltOption(loadingText=", this.a, Extension.C_BRAKE);
    }

    public SlotItemActionDto$ConfirmAltOption() {
        this.a = null;
    }
}
