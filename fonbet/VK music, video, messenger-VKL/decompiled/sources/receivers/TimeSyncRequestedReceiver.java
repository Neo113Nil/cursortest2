package receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.qni0;
import xsna.ro;

/* compiled from: TimeSyncRequestedReceiver.kt */
/* loaded from: classes9.dex */
public final class TimeSyncRequestedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qni0.a.getClass();
        ro roVar = qni0.r;
        if (roVar != null) {
            roVar.k("TimeSyncRequestedReceiver.onReceive");
        }
        qni0.d(context);
    }
}
