package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.srs0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/dto/SlotItemTrailDto$IconDto", "Lcom/yandex/go/slot/dto/x2;", "Lsrs0;", "Companion", "$serializer", "com/yandex/go/slot/dto/q2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemTrailDto$IconDto extends x2 implements srs0 {
    public static final q2 Companion = new q2();
    public final n7v a;
    public final String b;
    public final b2 c;

    public SlotItemTrailDto$IconDto(int i, n7v n7vVar, String str, b2 b2Var) {
        this.a = (i & 1) == 0 ? n7v.f : n7vVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = y0.INSTANCE;
        } else {
            this.c = b2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemTrailDto$IconDto)) {
            return false;
        }
        SlotItemTrailDto$IconDto slotItemTrailDto$IconDto = (SlotItemTrailDto$IconDto) obj;
        return jl40.l(this.a, slotItemTrailDto$IconDto.a) && jl40.l(this.b, slotItemTrailDto$IconDto.b) && jl40.l(this.c, slotItemTrailDto$IconDto.c);
    }

    @Override // defpackage.srs0
    /* renamed from: f, reason: from getter */
    public final n7v getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "IconDto(image=" + this.a + ", description=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }

    public SlotItemTrailDto$IconDto() {
        n7v n7vVar = n7v.f;
        y0 y0Var = y0.INSTANCE;
        this.a = n7vVar;
        this.b = null;
        this.c = y0Var;
    }
}
