package com.yandex.go.superapp.discovery.map.impl.experiments;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/f;", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction extends f {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final String c;

    public SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction(int i, String str, String str2, String str3) {
        if (5 != (i & 5)) {
            qje.Z(i, 5, SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction)) {
            return false;
        }
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction = (SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction) obj;
        return jl40.l(this.a, superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.a) && jl40.l(this.b, superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.b) && jl40.l(this.c, superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("OpenOrganizationsAction(screenTitle=", this.a, ", suggestReqId=", this.b, ", geosearchContext="), this.c, Extension.C_BRAKE);
    }
}
