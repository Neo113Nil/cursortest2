package xsna;

import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.notifications.di.NotificationsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ zb8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (NotificationsComponent) this.c.a(fpf0.a(NotificationsComponent.class));
            default:
                return (DialogsScreenFeatureComponent) this.c.a(fpf0.a(DialogsScreenFeatureComponent.class));
        }
    }
}
