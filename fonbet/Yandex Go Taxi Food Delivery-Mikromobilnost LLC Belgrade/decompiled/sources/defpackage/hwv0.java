package defpackage;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import com.yandex.go.superapp.discovery.map.impl.navigation.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class hwv0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ hwv0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        c cVar = this.b;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = (SuperAppDiscoveryMapOverlayState) obj;
        switch (i) {
            case 0:
                cVar.getClass();
                int i2 = iwv0.a[superAppDiscoveryMapOverlayState.ordinal()];
                if (i2 == 1) {
                    z = true;
                } else if (i2 != 2 && i2 != 3 && i2 != 4) {
                    w511.b();
                    return null;
                }
                return Boolean.valueOf(z);
            default:
                cVar.getClass();
                int i3 = iwv0.a[superAppDiscoveryMapOverlayState.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    z = true;
                } else if (i3 != 3 && i3 != 4) {
                    w511.b();
                    return null;
                }
                return Boolean.valueOf(z);
        }
    }
}
