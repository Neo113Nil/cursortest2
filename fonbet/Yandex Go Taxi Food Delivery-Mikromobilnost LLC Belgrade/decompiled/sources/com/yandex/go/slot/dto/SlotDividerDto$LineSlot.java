package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotDividerDto$LineSlot", "Lcom/yandex/go/slot/dto/d0;", "Companion", "$serializer", "com/yandex/go/slot/dto/a0", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotDividerDto$LineSlot extends d0 {
    public static final a0 Companion = new a0();
    public final String a;
    public final String b;

    public SlotDividerDto$LineSlot(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    @Override // com.yandex.go.slot.dto.d0
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // com.yandex.go.slot.dto.d0
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDividerDto$LineSlot)) {
            return false;
        }
        SlotDividerDto$LineSlot slotDividerDto$LineSlot = (SlotDividerDto$LineSlot) obj;
        return jl40.l(this.a, slotDividerDto$LineSlot.a) && jl40.l(this.b, slotDividerDto$LineSlot.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("LineSlot(id=", this.a, ", backgroundColor=", this.b, Extension.C_BRAKE);
    }

    public SlotDividerDto$LineSlot() {
        this.a = "";
        this.b = null;
    }
}
