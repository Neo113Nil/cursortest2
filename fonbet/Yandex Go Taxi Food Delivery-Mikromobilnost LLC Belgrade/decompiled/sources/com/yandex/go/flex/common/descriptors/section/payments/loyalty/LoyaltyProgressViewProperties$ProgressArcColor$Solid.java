package com.yandex.go.flex.common.descriptors.section.payments.loyalty;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.yvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties$ProgressArcColor$Solid", "Lyvz;", "Companion", "$serializer", "com/yandex/go/flex/common/descriptors/section/payments/loyalty/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LoyaltyProgressViewProperties$ProgressArcColor$Solid implements yvz {
    public static final d Companion = new d();
    public final String a;

    public /* synthetic */ LoyaltyProgressViewProperties$ProgressArcColor$Solid(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, LoyaltyProgressViewProperties$ProgressArcColor$Solid$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoyaltyProgressViewProperties$ProgressArcColor$Solid) && jl40.l(this.a, ((LoyaltyProgressViewProperties$ProgressArcColor$Solid) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Solid(hex=", this.a, Extension.C_BRAKE);
    }
}
