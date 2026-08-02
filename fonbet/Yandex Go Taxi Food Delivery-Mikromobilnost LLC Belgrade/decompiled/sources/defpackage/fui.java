package defpackage;

import android.view.View;
import com.yandex.go.delivery.tracking.DeliveryTrackingModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class fui implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeliveryTrackingModalView b;

    public /* synthetic */ fui(DeliveryTrackingModalView deliveryTrackingModalView, int i) {
        this.a = i;
        this.b = deliveryTrackingModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 accessibilityButtonsDelegate$lambda$0;
        View insetsType$lambda$0;
        int i = this.a;
        DeliveryTrackingModalView deliveryTrackingModalView = this.b;
        switch (i) {
            case 0:
                accessibilityButtonsDelegate$lambda$0 = DeliveryTrackingModalView.accessibilityButtonsDelegate$lambda$0(deliveryTrackingModalView);
                return accessibilityButtonsDelegate$lambda$0;
            default:
                insetsType$lambda$0 = DeliveryTrackingModalView.insetsType$lambda$0(deliveryTrackingModalView);
                return insetsType$lambda$0;
        }
    }
}
