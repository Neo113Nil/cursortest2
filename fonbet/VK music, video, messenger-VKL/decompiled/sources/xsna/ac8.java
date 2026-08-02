package xsna;

import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.notifications.list.api.di.NotificationListComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ac8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ ac8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (NotificationListComponent) this.c.a(fpf0.a(NotificationListComponent.class));
            case 1:
                return (VerifiedSellerComponent) this.c.a(fpf0.a(VerifiedSellerComponent.class));
            default:
                return (InfoBridgeComponent) this.c.a(fpf0.a(InfoBridgeComponent.class));
        }
    }
}
