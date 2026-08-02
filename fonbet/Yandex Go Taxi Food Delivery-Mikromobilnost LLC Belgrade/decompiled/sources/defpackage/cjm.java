package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class cjm implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DriverProfileModalView b;

    public /* synthetic */ cjm(DriverProfileModalView driverProfileModalView, int i) {
        this.a = i;
        this.b = driverProfileModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 downloadPhoto$lambda$0;
        zy11 downloadAvatar$lambda$0;
        int i = this.a;
        DriverProfileModalView driverProfileModalView = this.b;
        Drawable drawable = (Drawable) obj;
        switch (i) {
            case 0:
                downloadPhoto$lambda$0 = DriverProfileModalView.downloadPhoto$lambda$0(driverProfileModalView, drawable);
                return downloadPhoto$lambda$0;
            default:
                downloadAvatar$lambda$0 = DriverProfileModalView.downloadAvatar$lambda$0(driverProfileModalView, drawable);
                return downloadAvatar$lambda$0;
        }
    }
}
