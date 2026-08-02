package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import com.yandex.go.masstransit.sdk.core.image.MtSdkImage;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemLeadDto$Icon", "Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/k;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/core/design/slot/dto/g", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitSlotItemLeadDto$Icon extends k {
    public static final g Companion = new g();
    public final MtSdkImage a;

    public MasstransitSlotItemLeadDto$Icon(int i, MtSdkImage mtSdkImage) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mtSdkImage;
        }
    }

    @Override // com.yandex.go.masstransit.sdk.core.design.slot.dto.k
    /* renamed from: a, reason: from getter */
    public final MtSdkImage getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MasstransitSlotItemLeadDto$Icon) && jl40.l(this.a, ((MasstransitSlotItemLeadDto$Icon) obj).a);
    }

    public final int hashCode() {
        MtSdkImage mtSdkImage = this.a;
        if (mtSdkImage == null) {
            return 0;
        }
        return mtSdkImage.hashCode();
    }

    public final String toString() {
        return "Icon(image=" + this.a + Extension.C_BRAKE;
    }

    public MasstransitSlotItemLeadDto$Icon() {
        this.a = null;
    }
}
