package defpackage;

import com.yandex.go.superapp.discovery.map.scooters.impl.domain.ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$1;
import com.yandex.go.superapp.discovery.map.scooters.impl.domain.ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2;
import com.yandex.go.superapp.discovery.map.scooters.impl.domain.ScootersDiscoveryMapEboksClientApiFactory$listenToMapSelection$2;
import kotlinx.coroutines.flow.k;

/* loaded from: classes14.dex */
public final class bin0 implements pgn {
    public final /* synthetic */ cin0 a;

    public bin0(cin0 cin0Var) {
        this.a = cin0Var;
    }

    @Override // defpackage.pgn
    public final tpr a(Object obj) {
        pxn0 pxn0Var = (pxn0) obj;
        boolean z = pxn0Var instanceof yxn0;
        cin0 cin0Var = this.a;
        if (z) {
            return new k(new rol0(new ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$1(null, cin0Var, pxn0Var)), new ScootersDiscoveryMapEboksClientApiFactory$listenToMapSelection$2(3, null));
        }
        if (pxn0Var instanceof mxn0) {
            return new k(new rol0(new ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2(null, cin0Var, pxn0Var)), new ScootersDiscoveryMapEboksClientApiFactory$listenToMapSelection$2(3, null));
        }
        if ((pxn0Var instanceof oxn0) || jl40.l(pxn0Var, nxn0.a)) {
            return pvn.a;
        }
        w511.b();
        return null;
    }
}
