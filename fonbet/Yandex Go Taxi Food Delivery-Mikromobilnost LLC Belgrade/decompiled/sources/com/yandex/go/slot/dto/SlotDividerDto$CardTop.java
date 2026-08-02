package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotDividerDto$CardTop", "Lcom/yandex/go/slot/dto/d0;", "Companion", "$serializer", "com/yandex/go/slot/dto/x", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotDividerDto$CardTop extends d0 {
    public static final x Companion = new x();
    public final String a;
    public final String b;

    public SlotDividerDto$CardTop(int i, String str, String str2) {
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
        if (!(obj instanceof SlotDividerDto$CardTop)) {
            return false;
        }
        SlotDividerDto$CardTop slotDividerDto$CardTop = (SlotDividerDto$CardTop) obj;
        return jl40.l(this.a, slotDividerDto$CardTop.a) && jl40.l(this.b, slotDividerDto$CardTop.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("CardTop(id=", this.a, ", backgroundColor=", this.b, Extension.C_BRAKE);
    }

    public SlotDividerDto$CardTop() {
        this.a = "";
        this.b = null;
    }
}
