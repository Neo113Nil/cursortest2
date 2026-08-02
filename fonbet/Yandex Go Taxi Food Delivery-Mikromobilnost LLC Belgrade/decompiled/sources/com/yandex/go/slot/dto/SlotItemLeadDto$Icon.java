package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotItemLeadDto$Icon", "Lcom/yandex/go/slot/dto/k2;", "Companion", "$serializer", "com/yandex/go/slot/dto/g2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemLeadDto$Icon extends k2 {
    public static final g2 Companion = new g2();
    public final n7v a;

    public SlotItemLeadDto$Icon(int i, n7v n7vVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = n7vVar;
        }
    }

    @Override // com.yandex.go.slot.dto.k2
    /* renamed from: a, reason: from getter */
    public final n7v getA() {
        return this.a;
    }

    @Override // com.yandex.go.slot.dto.k2
    public final SlotItemLeadDto$Type b() {
        return SlotItemLeadDto$Type.ICON;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotItemLeadDto$Icon) && jl40.l(this.a, ((SlotItemLeadDto$Icon) obj).a);
    }

    public final int hashCode() {
        n7v n7vVar = this.a;
        if (n7vVar == null) {
            return 0;
        }
        return n7vVar.hashCode();
    }

    public final String toString() {
        return "Icon(image=" + this.a + Extension.C_BRAKE;
    }

    public SlotItemLeadDto$Icon() {
        this.a = null;
    }
}
