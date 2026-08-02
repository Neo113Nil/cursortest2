package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ChannelMessageNotification.kt */
/* loaded from: classes5.dex */
public final class u1b extends pa20 {
    public final String S;
    public final String T;

    /* compiled from: ChannelMessageNotification.kt */
    public static final class a {
        public static String a(Long l, Long l2) {
            return "community_msg_notification_" + l + '_' + l2;
        }
    }

    public /* synthetic */ u1b(Context context, MessageNotificationContainer messageNotificationContainer, List list) {
        this(context, messageNotificationContainer, null, list);
    }

    @Override // xsna.pa20
    public final NotificationCompat.a D() {
        Intent k = k(null, "msg_mark_as_read_channel");
        MessageNotificationContainer messageNotificationContainer = this.z;
        k.putExtra("peer_id", messageNotificationContainer.z);
        k.putExtra("msg_cnv_id", messageNotificationContainer.A);
        k.putExtra("owner_id", messageNotificationContainer.j());
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, this.c.getString(R.string.notification_mark_as_read), l(k));
        c0022a.e.putBundle("android.wearable.EXTENSIONS", ar.b(5, "flags"));
        c0022a.h = false;
        c0022a.g = 2;
        return c0022a.b();
    }

    @Override // xsna.pa20
    public final Intent E() {
        xyv a2 = g2v.c().a();
        MessageNotificationContainer messageNotificationContainer = this.z;
        return a2.a(this.c, messageNotificationContainer.z, ChannelHistoryOpenMode.OpenAtUnread.b, messageNotificationContainer.j(), g2v.c().b().D());
    }

    @Override // xsna.pa20
    public final boolean G() {
        return false;
    }

    @Override // xsna.pa20
    public final boolean H() {
        return false;
    }

    @Override // xsna.pa20, com.vk.pushes.notifications.base.a, xsna.ri6
    public final Intent b() {
        Intent b = super.b();
        b.setAction("delete_channel_cache");
        MessageNotificationContainer messageNotificationContainer = this.z;
        b.putExtra("peer_id", messageNotificationContainer.z);
        b.putExtra("owner_id", messageNotificationContainer.j());
        return b;
    }

    @Override // xsna.pa20, com.vk.pushes.notifications.base.a, xsna.ri6
    public final String c() {
        return this.T;
    }

    @Override // xsna.pa20, com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.S;
    }

    @Override // xsna.pa20, xsna.dfq0
    public final String toString() {
        return "ChannelMessageNotification(notify=" + this.z + ')';
    }

    public u1b(Context context, MessageNotificationContainer messageNotificationContainer, Bitmap bitmap, List<PushMessage> list) {
        super(context, messageNotificationContainer, bitmap, list, (Intent) null, (gzs) null, (gzs) null, 232);
        this.S = a.a(Long.valueOf(messageNotificationContainer.z), messageNotificationContainer.j());
        x870 x870Var = x870.a;
        this.T = "community_channels_messages";
    }
}
