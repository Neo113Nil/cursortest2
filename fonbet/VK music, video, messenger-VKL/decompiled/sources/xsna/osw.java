package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.vk.log.L;
import com.vk.voip.ui.notifications.incoming.IncomingCallNotificationsTrampolineActivity;
import com.vk.voip.ui.notifications.incoming.IncomingCallNotifierBroadcastReceiver;

/* compiled from: IncomingCallActionsImpl.kt */
/* loaded from: classes7.dex */
public final class osw implements nsw {
    public final Context a;

    public osw(Context context) {
        this.a = context;
    }

    @Override // xsna.nsw
    public final PendingIntent a(Context context, String str) {
        return c(context, str, "com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.ACTION_DECLINE");
    }

    @Override // xsna.nsw
    public final PendingIntent b(Context context, String str) {
        return c(context, str, "com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.ACTION_ACCEPT");
    }

    public final PendingIntent c(Context context, String str, String str2) {
        boolean z = this.a.getApplicationInfo().targetSdkVersion >= 31;
        L.e("IncomingCallActions", zhy0.a("doesTargetVersionRequire ", z));
        L.e("IncomingCallActions", "use activity as trampoline: " + z);
        if (z) {
            Intent intent = new Intent(context, (Class<?>) IncomingCallNotificationsTrampolineActivity.class);
            intent.setAction(str2);
            intent.putExtra("com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.EXTRA_IDENTITY", str);
            return t2i0.a(context, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(context, (Class<?>) IncomingCallNotifierBroadcastReceiver.class);
        intent2.setAction(str2);
        intent2.putExtra("com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.EXTRA_IDENTITY", str);
        return t2i0.b(context, 0, intent2, 201326592);
    }
}
