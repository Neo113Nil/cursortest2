package com.yandex.go.flex.common.descriptors.section.payments.loyalty;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.o3z;
import defpackage.qje;
import defpackage.xvz;
import defpackage.yvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient", "Lyvz;", "Companion", "$serializer", "com/yandex/go/flex/common/descriptors/section/payments/loyalty/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient implements yvz {
    public static final c Companion = new c();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new o3z(26)), kotlin.a.b(lazyThreadSafetyMode, new o3z(27))};
    }

    public /* synthetic */ LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient(List list, List list2, int i) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient)) {
            return false;
        }
        LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient loyaltyProgressViewProperties$ProgressArcColor$LinearGradient = (LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient) obj;
        return jl40.l(this.a, loyaltyProgressViewProperties$ProgressArcColor$LinearGradient.a) && jl40.l(this.b, loyaltyProgressViewProperties$ProgressArcColor$LinearGradient.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return xvz.l("LinearGradient(colors=", this.a, ", positions=", this.b, Extension.C_BRAKE);
    }
}
