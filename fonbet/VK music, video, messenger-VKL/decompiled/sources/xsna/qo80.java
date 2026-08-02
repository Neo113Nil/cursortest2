package xsna;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.vk.voip.VoipService;
import com.vk.voip.ui.notifications.incoming.a;
import com.vkontakte.android.R;

/* compiled from: OngoingCallNotifier.kt */
/* loaded from: classes7.dex */
public final class qo80 implements a.InterfaceC2068a {
    public final /* synthetic */ po80 a;

    public qo80(po80 po80Var) {
        this.a = po80Var;
    }

    @Override // com.vk.voip.ui.notifications.incoming.a.InterfaceC2068a
    public final PendingIntent a() {
        po80 po80Var = this.a;
        return t2i0.a(po80Var.a, 0, (Intent) po80Var.e.invoke(), 167772160);
    }

    @Override // com.vk.voip.ui.notifications.incoming.a.InterfaceC2068a
    public final NotificationCompat.a b() {
        po80 po80Var = this.a;
        io80 io80Var = po80Var.g;
        VoipService voipService = po80Var.a;
        PendingIntent b = io80Var.b(voipService, po80Var.i);
        if (b == null) {
            return null;
        }
        return new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, voipService.getString(R.string.voip_call_notification_accept), b).b();
    }

    @Override // com.vk.voip.ui.notifications.incoming.a.InterfaceC2068a
    public final NotificationCompat.a c() {
        po80 po80Var = this.a;
        io80 io80Var = po80Var.g;
        VoipService voipService = po80Var.a;
        PendingIntent c = io80Var.c(voipService, po80Var.i);
        if (c == null) {
            return null;
        }
        return new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, voipService.getString(R.string.voip_call_notification_decline), c).b();
    }
}
