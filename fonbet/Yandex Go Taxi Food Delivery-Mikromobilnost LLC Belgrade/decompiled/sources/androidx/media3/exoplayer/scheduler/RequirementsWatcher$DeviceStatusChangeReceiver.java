package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class RequirementsWatcher$DeviceStatusChangeReceiver extends BroadcastReceiver {
    final /* synthetic */ b this$0;

    private RequirementsWatcher$DeviceStatusChangeReceiver(b bVar) {
        this.this$0 = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.this$0.a();
    }
}
