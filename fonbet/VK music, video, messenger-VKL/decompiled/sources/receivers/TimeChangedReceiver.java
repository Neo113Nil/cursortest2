package receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import xsna.qni0;
import xsna.ro;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: TimeChangedReceiver.kt */
/* loaded from: classes11.dex */
public final class TimeChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qni0.a.getClass();
        ro roVar = qni0.r;
        if (roVar != null) {
            roVar.k("TimeChangedReceiver.onReceive");
        }
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        qni0.h = (currentTimeMillis - qni0.i) + qni0.h;
        qni0.i = currentTimeMillis;
        long currentTimeMillis2 = System.currentTimeMillis();
        wzs<? super Long, ? super Long, s3q0> wzsVar = qni0.n;
        if (wzsVar != null) {
            wzsVar.invoke(Long.valueOf(qni0.m), Long.valueOf(currentTimeMillis2));
        }
        qni0.m = currentTimeMillis2;
        qni0.c().edit().putLong("ServerTimeProvider_KEY_TIME_DIFF", qni0.h).apply();
    }
}
