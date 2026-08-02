package com.yandex.runtime.sensors.internal;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.zzb;
import com.google.android.gms.tasks.zzw;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import defpackage.cvw;
import defpackage.hn71;
import defpackage.iy60;
import defpackage.mm2;
import defpackage.n40;
import defpackage.o40;
import defpackage.sl81;
import defpackage.sst;
import defpackage.t070;
import defpackage.v391;
import defpackage.y591;
import defpackage.ysx0;
import defpackage.zsx0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public class ActivityTrackerSubscription {
    private static final String BROADCAST_ACTION = "activityRecognitionAction";
    private static final int FLAG_MUTABLE = 33554432;
    private static final long MS_IN_SEC = 1000;
    private static final String TAG = "com.yandex.runtime.sensors.internal.ActivityTrackerSubscription";
    private BroadcastReceiver broadcastReceiver_;
    private o40 client_;
    private boolean connected_;
    private NativeObject nativeObject_;
    private PendingIntent pendingIntent_;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityTrackerSubscription(NativeObject nativeObject, int i) {
        Object[] objArr = 0;
        this.connected_ = false;
        Log.i(TAG, "ActivityTracker started");
        this.nativeObject_ = nativeObject;
        Intent intent = new Intent();
        intent.setAction(BROADCAST_ACTION);
        intent.setPackage(Runtime.getApplicationContext().getPackageName());
        this.pendingIntent_ = PendingIntent.getBroadcast(Runtime.getApplicationContext(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : SelfTester_JCP.DECRYPT_CNT);
        Context applicationContext = Runtime.getApplicationContext();
        int i2 = n40.a;
        this.client_ = new y591(applicationContext, null, y591.k, mm2.V0, sst.c);
        this.broadcastReceiver_ = new ActivityTrackerBroadcastReceiver(this, objArr == true ? 1 : 0);
        o40 o40Var = this.client_;
        long j = i * 1000;
        PendingIntent pendingIntent = this.pendingIntent_;
        y591 y591Var = (y591) o40Var;
        y591Var.getClass();
        v391 v391Var = new v391();
        cvw.d("intervalMillis can't be negative.", j >= 0);
        v391Var.a = j;
        cvw.n("Must set intervalMillis.", j != Long.MIN_VALUE);
        zzb zzbVar = new zzb(v391Var.a, true, null, null, null, false, null, 0L, null);
        zzbVar.zza(y591Var.b);
        ysx0 a = zsx0.a();
        a.a = new hn71(27, zzbVar, pendingIntent);
        a.d = 2401;
        zzw d = y591Var.d(1, a.a());
        d.f(new t070(this) { // from class: com.yandex.runtime.sensors.internal.ActivityTrackerSubscription.1
            @Override // defpackage.t070
            public void onSuccess(Object obj) {
                Log.i(ActivityTrackerSubscription.TAG, "ActivityTracker subscribed");
            }
        });
        d.d(new iy60(this) { // from class: com.yandex.runtime.sensors.internal.ActivityTrackerSubscription.2
            @Override // defpackage.iy60
            public void onFailure(Exception exc) {
                Log.e(ActivityTrackerSubscription.TAG, "ActivityTracker failed to subscribe: " + exc.getMessage());
            }
        });
        Runtime.getApplicationContext().registerReceiver(this.broadcastReceiver_, new IntentFilter(BROADCAST_ACTION), 4);
        this.connected_ = true;
    }

    private void doStop() {
        o40 o40Var = this.client_;
        PendingIntent pendingIntent = this.pendingIntent_;
        y591 y591Var = (y591) o40Var;
        y591Var.getClass();
        ysx0 a = zsx0.a();
        a.a = new sl81(pendingIntent);
        a.d = 2402;
        y591Var.d(1, a.a());
        Runtime.getApplicationContext().unregisterReceiver(this.broadcastReceiver_);
        Log.i(TAG, "ActivityTracker stopped");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handle(ActivityRecognitionResult activityRecognitionResult) {
        HashMap hashMap = new HashMap();
        Iterator<DetectedActivity> it = activityRecognitionResult.getProbableActivities().iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            if (type != 2) {
                hashMap.put(Integer.valueOf(type), Float.valueOf(r1.getConfidence() / 100.0f));
            }
        }
        updateActivity(this.nativeObject_, hashMap);
    }

    public static boolean isActivityTrackerAvailable() {
        return a.d.d(Runtime.getApplicationContext(), b.a) == 0;
    }

    public static native void updateActivity(NativeObject nativeObject, Map map);

    public void stop() {
        if (this.connected_) {
            doStop();
            this.connected_ = false;
        }
    }

    public class ActivityTrackerBroadcastReceiver extends BroadcastReceiver {
        private ActivityTrackerBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                ActivityTrackerSubscription.this.handle(ActivityRecognitionResult.extractResult(intent));
            }
        }

        public /* synthetic */ ActivityTrackerBroadcastReceiver(ActivityTrackerSubscription activityTrackerSubscription, int i) {
            this();
        }
    }
}
