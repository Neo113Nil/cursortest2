package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.b;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.hgz;
import defpackage.q270;
import defpackage.r270;
import java.util.Collections;

/* loaded from: classes10.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String TAG = hgz.o("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        hgz.g().getClass();
        try {
            b.i(context).e(Collections.singletonList((r270) new q270(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e) {
            hgz.g().f(TAG, "WorkManager is not initialized", e);
        }
    }
}
