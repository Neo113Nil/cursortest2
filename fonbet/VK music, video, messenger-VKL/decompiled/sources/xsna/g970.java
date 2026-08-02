package xsna;

import com.vk.dto.notifications.NotificationItem;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g970 implements izs {
    public final /* synthetic */ NotificationItem b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ bj70 e;

    public /* synthetic */ g970(NotificationItem notificationItem, boolean z, String str, bj70 bj70Var) {
        this.b = notificationItem;
        this.c = z;
        this.d = str;
        this.e = bj70Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        NotificationItem notificationItem = this.b;
        if (booleanValue) {
            notificationItem.v = new NotificationItem.b(Integer.valueOf(this.c ? R.drawable.vk_icon_done_24 : R.drawable.vk_icon_cancel_24), this.d);
        } else {
            cvk.u(R.string.common_network_error, false);
        }
        this.e.Q(notificationItem);
        return s3q0.a;
    }
}
