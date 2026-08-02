package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryReceiverDelegate$receiver$1;
import com.vk.video.ui.discovery.minimizable.c;
import xsna.cws0;

/* compiled from: VideoMinimizableDiscoveryReceiverDelegate.kt */
/* loaded from: classes7.dex */
public final class cws0 {
    public final c3k0 a;
    public final IntentFilter b = z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
    public final VideoMinimizableDiscoveryReceiverDelegate$receiver$1 c = new BroadcastReceiver() { // from class: com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryReceiverDelegate$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Parcelable parcelable;
            Object parcelableExtra;
            String action = intent.getAction();
            if (action != null && action.hashCode() == 3866578 && action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("id", UserId.class);
                    parcelable = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("id");
                    if (!(parcelableExtra2 instanceof UserId)) {
                        parcelableExtra2 = null;
                    }
                    parcelable = (UserId) parcelableExtra2;
                }
                UserId userId = (UserId) parcelable;
                if (userId == null) {
                    userId = UserId.d;
                }
                cws0.this.a.invoke(new c.e0(userId));
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v3, types: [com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryReceiverDelegate$receiver$1] */
    public cws0(c3k0 c3k0Var) {
        this.a = c3k0Var;
    }
}
