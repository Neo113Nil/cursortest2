package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.compose.driver.a;
import com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionOrchestrator;

/* loaded from: classes14.dex */
public final /* synthetic */ class lhk0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RideCardDriverSectionOrchestrator b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ zls w;

    public /* synthetic */ lhk0(RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, tls tlsVar, zls zlsVar, int i, int i2) {
        this.a = i2;
        this.b = rideCardDriverSectionOrchestrator;
        this.c = tlsVar;
        this.w = zlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zls zlsVar = this.w;
        tls tlsVar = this.c;
        RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.f(rideCardDriverSectionOrchestrator, tlsVar, zlsVar, fidVar, vng.O(7));
                break;
            case 1:
                a.f(rideCardDriverSectionOrchestrator, tlsVar, zlsVar, fidVar, vng.O(7));
                break;
            default:
                a.g(rideCardDriverSectionOrchestrator, tlsVar, zlsVar, fidVar, vng.O(7));
                break;
        }
        return zy11Var;
    }
}
