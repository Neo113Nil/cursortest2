package com.yandex.go.taxi.summary.models;

import defpackage.f2s;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/models/ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink", "Lf2s;", "Companion", "$serializer", "com/yandex/go/taxi/summary/models/a", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink implements f2s {
    public static final a Companion = new a();
    public final String a;

    public /* synthetic */ ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink) && jl40.l(this.a, ((ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }
}
