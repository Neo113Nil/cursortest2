package com.yandex.go.slot.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotDividerDto$SpacerVertical", "Lcom/yandex/go/slot/dto/d0;", "Companion", "$serializer", "com/yandex/go/slot/dto/b0", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotDividerDto$SpacerVertical extends d0 {
    public static final b0 Companion = new b0();
    public final String a;
    public final String b;
    public final int c;

    public SlotDividerDto$SpacerVertical(int i, int i2, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
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
        if (!(obj instanceof SlotDividerDto$SpacerVertical)) {
            return false;
        }
        SlotDividerDto$SpacerVertical slotDividerDto$SpacerVertical = (SlotDividerDto$SpacerVertical) obj;
        return jl40.l(this.a, slotDividerDto$SpacerVertical.a) && jl40.l(this.b, slotDividerDto$SpacerVertical.b) && this.c == slotDividerDto$SpacerVertical.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.v("SpacerVertical(id=", this.a, ", backgroundColor=", this.b, ", value="));
    }

    public SlotDividerDto$SpacerVertical(int i) {
        this.a = "";
        this.b = null;
        this.c = 0;
    }

    public SlotDividerDto$SpacerVertical() {
        this(0);
    }
}
