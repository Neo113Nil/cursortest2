package com.yandex.go.slot.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SlotDividerDto$GroupTitle", "Lcom/yandex/go/slot/dto/d0;", "Companion", "$serializer", "com/yandex/go/slot/dto/y", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotDividerDto$GroupTitle extends d0 {
    public static final y Companion = new y();
    public final String a;
    public final String b;
    public final String c;

    public SlotDividerDto$GroupTitle(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
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
        if (!(obj instanceof SlotDividerDto$GroupTitle)) {
            return false;
        }
        SlotDividerDto$GroupTitle slotDividerDto$GroupTitle = (SlotDividerDto$GroupTitle) obj;
        return jl40.l(this.a, slotDividerDto$GroupTitle.a) && jl40.l(this.b, slotDividerDto$GroupTitle.b) && jl40.l(this.c, slotDividerDto$GroupTitle.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("GroupTitle(id=", this.a, ", backgroundColor=", this.b, ", title="), this.c, Extension.C_BRAKE);
    }

    public SlotDividerDto$GroupTitle() {
        this.a = "";
        this.b = null;
        this.c = "";
    }
}
