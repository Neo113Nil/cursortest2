package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.b;
import defpackage.hgz;
import java.util.Objects;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String TAG = hgz.o("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        hgz g = hgz.g();
        Objects.toString(intent);
        g.getClass();
        try {
            b i = b.i(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            i.getClass();
            synchronized (b.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = i.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    i.i = goAsync;
                    if (i.h) {
                        goAsync.finish();
                        i.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            hgz.g().f(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
