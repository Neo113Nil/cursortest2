package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.compose.driver.a;
import com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionOrchestrator;

/* loaded from: classes14.dex */
public final /* synthetic */ class ihk0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ RideCardDriverSectionOrchestrator c;
    public final /* synthetic */ int w;

    public /* synthetic */ ihk0(f530 f530Var, RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = rideCardDriverSectionOrchestrator;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.b(f530Var, rideCardDriverSectionOrchestrator, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                a.b(f530Var, rideCardDriverSectionOrchestrator, fidVar, vng.O(i2 | 1));
                break;
            case 2:
                a.c(f530Var, rideCardDriverSectionOrchestrator, fidVar, vng.O(i2 | 1));
                break;
            default:
                a.c(f530Var, rideCardDriverSectionOrchestrator, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
