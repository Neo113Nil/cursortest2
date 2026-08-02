package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction", "Lcom/yandex/go/chargers/discovery_flex/ui/action/o;", "Companion", "$serializer", "com/yandex/go/chargers/discovery_flex/ui/action/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction extends o {
    public static final i Companion = new i();
    public final String b;

    public /* synthetic */ ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            qje.Z(i, 1, ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction) && jl40.l(this.b, ((ChargersFlexDiscoveryAction$OpenChargersPlusHomeAction) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenChargersPlusHomeAction(url=", this.b, Extension.C_BRAKE);
    }
}
