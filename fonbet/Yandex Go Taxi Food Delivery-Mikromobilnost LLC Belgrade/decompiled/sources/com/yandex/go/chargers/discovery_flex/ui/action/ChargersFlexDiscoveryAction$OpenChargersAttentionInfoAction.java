package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.smw0;
import defpackage.vfc;
import defpackage.wu9;
import defpackage.z1a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction", "Lcom/yandex/go/chargers/discovery_flex/ui/action/o;", "Companion", "$serializer", "com/yandex/go/chargers/discovery_flex/ui/action/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction extends o {
    public static final c Companion = new c();
    public static final i3y[] f;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wu9(29)), kotlin.a.b(lazyThreadSafetyMode, new z1a(0)), null, null};
    }

    public /* synthetic */ ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction(int i, CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction)) {
            return false;
        }
        ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction = (ChargersFlexDiscoveryAction$OpenChargersAttentionInfoAction) obj;
        return jl40.l(this.b, chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.b) && jl40.l(this.c, chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.c) && jl40.l(this.d, chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.d) && jl40.l(this.e, chargersFlexDiscoveryAction$OpenChargersAttentionInfoAction.e);
    }

    public final int hashCode() {
        int b = smw0.b(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return g8e.r(vfc.r(this.b, this.c, "OpenChargersAttentionInfoAction(title=", ", body=", ", iconTag="), this.d, ", promoOfferId=", this.e, Extension.C_BRAKE);
    }
}
