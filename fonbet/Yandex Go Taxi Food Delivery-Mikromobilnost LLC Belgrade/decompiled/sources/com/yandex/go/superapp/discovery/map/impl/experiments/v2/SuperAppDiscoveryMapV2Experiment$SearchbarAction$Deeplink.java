package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/n;", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink extends n {
    public static final k Companion = new k();
    public final String a;

    public SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink) && jl40.l(this.a, ((SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }

    public SuperAppDiscoveryMapV2Experiment$SearchbarAction$Deeplink() {
        this.a = "";
    }
}
