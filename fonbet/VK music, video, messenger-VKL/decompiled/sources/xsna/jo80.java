package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.vk.log.L;
import com.vk.voip.VoipService;
import com.vk.voip.ui.notifications.ongoing.OngoingCallNotificationsTrampolineActivity;
import com.vk.voip.ui.notifications.ongoing.OngoingCallNotifierBroadcastReceiver;

/* compiled from: OngoingCallActionsImpl.kt */
/* loaded from: classes7.dex */
public final class jo80 implements io80 {
    public final Context a;

    public jo80(Context context) {
        this.a = context;
    }

    @Override // xsna.io80
    public final PendingIntent a(VoipService voipService, String str) {
        return d(voipService, str, "com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.ACTION_FINISH");
    }

    @Override // xsna.io80
    public final PendingIntent b(VoipService voipService, String str) {
        return d(voipService, str, "com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.ACTION_ACCEPT");
    }

    @Override // xsna.io80
    public final PendingIntent c(VoipService voipService, String str) {
        return d(voipService, str, "com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.ACTION_DECLINE");
    }

    public final PendingIntent d(VoipService voipService, String str, String str2) {
        boolean z = this.a.getApplicationInfo().targetSdkVersion >= 31;
        L.e("OngoingCallActionsImpl", zhy0.a("doesTargetVersionRequire ", z));
        L.e("OngoingCallActionsImpl", "use activity as trampoline: " + z);
        if (z) {
            Intent intent = new Intent(voipService, (Class<?>) OngoingCallNotificationsTrampolineActivity.class);
            intent.setAction(str2);
            intent.putExtra("com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.EXTRA_IDENTITY", str);
            return t2i0.a(voipService, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(voipService, (Class<?>) OngoingCallNotifierBroadcastReceiver.class);
        intent2.setAction(str2);
        intent2.putExtra("com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.EXTRA_IDENTITY", str);
        return t2i0.b(voipService, 0, intent2, 201326592);
    }
}
