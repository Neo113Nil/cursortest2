package com.yandex.go.superapp.discovery.map.impl.domain.entities.flex;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto;
import defpackage.bnv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/flex/SuperAppDiscoveryMapMainScreenStateRequestParams;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/domain/entities/flex/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SuperAppDiscoveryMapMainScreenStateRequestParams {
    public static final d Companion = new d();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(25))};
    public final zzs a;
    public final SuperAppDiscoveryMapLayerDto b;

    public /* synthetic */ SuperAppDiscoveryMapMainScreenStateRequestParams(int i, zzs zzsVar, SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, SuperAppDiscoveryMapMainScreenStateRequestParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        this.b = superAppDiscoveryMapLayerDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppDiscoveryMapMainScreenStateRequestParams)) {
            return false;
        }
        SuperAppDiscoveryMapMainScreenStateRequestParams superAppDiscoveryMapMainScreenStateRequestParams = (SuperAppDiscoveryMapMainScreenStateRequestParams) obj;
        return jl40.l(this.a, superAppDiscoveryMapMainScreenStateRequestParams.a) && this.b == superAppDiscoveryMapMainScreenStateRequestParams.b;
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        return this.b.hashCode() + ((zzsVar == null ? 0 : zzsVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SuperAppDiscoveryMapMainScreenStateRequestParams(geoPoint=" + this.a + ", currentLayer=" + this.b + Extension.C_BRAKE;
    }

    public SuperAppDiscoveryMapMainScreenStateRequestParams(zzs zzsVar, SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto) {
        this.a = zzsVar;
        this.b = superAppDiscoveryMapLayerDto;
    }
}
