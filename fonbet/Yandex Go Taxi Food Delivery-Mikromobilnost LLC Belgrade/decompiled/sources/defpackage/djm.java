package defpackage;

import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class djm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DriverProfileModalView b;

    public /* synthetic */ djm(DriverProfileModalView driverProfileModalView, int i) {
        this.a = i;
        this.b = driverProfileModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DriverProfileModalView driverProfileModalView = this.b;
        switch (i) {
            case 0:
                DriverProfileModalView.setupCarInfoComponent$lambda$0$0(driverProfileModalView);
                break;
            default:
                DriverProfileModalView.setupBottomCloseButton$lambda$0(driverProfileModalView);
                break;
        }
    }
}
