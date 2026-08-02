package com.google.android.gms.gcm;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import defpackage.asa1;
import defpackage.bb1;
import defpackage.gga1;
import defpackage.gtx0;
import defpackage.of3;
import defpackage.w53;
import defpackage.wws;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public abstract class GcmTaskService extends Service {
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private ComponentName componentName;
    private final Object lock = new Object();
    private asa1 zzg;
    private int zzu;
    private ExecutorService zzv;
    private Messenger zzw;
    private a zzx;

    public class zzd extends com.google.android.gms.internal.gcm.zzj {
        public zzd(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Messenger messenger;
            if (!bb1.Q(GcmTaskService.this, message.sendingUid, "com.google.android.gms")) {
                Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
                return;
            }
            int i = message.what;
            if (i == 1) {
                Bundle data = message.getData();
                if (data.isEmpty() || (messenger = message.replyTo) == null) {
                    return;
                }
                String string = data.getString("tag");
                ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                long j = data.getLong("max_exec_duration", 180L);
                if (GcmTaskService.this.zzg(string)) {
                    return;
                }
                Bundle bundle = data.getBundle("extras");
                GcmTaskService gcmTaskService = GcmTaskService.this;
                gcmTaskService.zzd(new wws(gcmTaskService, string, messenger, bundle, j, parcelableArrayList));
                return;
            }
            if (i == 2) {
                if (Log.isLoggable("GcmTaskService", 3)) {
                    new StringBuilder(String.valueOf(message).length() + 45);
                }
            } else {
                if (i == 4) {
                    GcmTaskService.this.onInitializeTasks();
                    return;
                }
                String valueOf = String.valueOf(message);
                StringBuilder sb = new StringBuilder(valueOf.length() + 31);
                sb.append("Unrecognized message received: ");
                sb.append(valueOf);
                Log.e("GcmTaskService", sb.toString());
            }
        }
    }

    private final void zzd(int i) {
        synchronized (this.lock) {
            try {
                this.zzu = i;
                if (!this.zzx.b(this.componentName.getClassName())) {
                    stopSelf(this.zzu);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzg(String str) {
        boolean z;
        boolean z2;
        synchronized (this.lock) {
            try {
                a aVar = this.zzx;
                String className = this.componentName.getClassName();
                synchronized (aVar) {
                    try {
                        Map map = (Map) aVar.a.get(className);
                        if (map == null) {
                            map = new w53();
                            aVar.a.put(className, map);
                        }
                        z = map.put(str, Boolean.FALSE) == null;
                    } finally {
                    }
                }
                z2 = !z;
                if (!z) {
                    new StringBuilder(String.valueOf(getPackageName()).length() + 44 + String.valueOf(str).length());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null || !SERVICE_ACTION_EXECUTE_TASK.equals(intent.getAction())) {
            return null;
        }
        return this.zzw.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        a aVar;
        super.onCreate();
        synchronized (a.class) {
            try {
                if (a.b == null) {
                    getApplicationContext();
                    a.b = new a();
                }
                aVar = a.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zzx = aVar;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new of3(3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzv = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zzw = new Messenger(new zzd(Looper.getMainLooper()));
        this.componentName = new ComponentName(this, getClass());
        this.zzg = gga1.a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        List<Runnable> shutdownNow = this.zzv.shutdownNow();
        if (shutdownNow.isEmpty()) {
            return;
        }
        int size = shutdownNow.size();
        StringBuilder sb = new StringBuilder(79);
        sb.append("Shutting down, but not all tasks are finished executing. Remaining: ");
        sb.append(size);
        Log.e("GcmTaskService", sb.toString());
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(gtx0 gtx0Var);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        GcmTaskService gcmTaskService;
        Throwable th;
        if (intent == null) {
            zzd(i2);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            try {
                if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundleExtra = intent.getBundleExtra("extras");
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                    long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                    if (!(parcelableExtra instanceof PendingCallback)) {
                        try {
                            String packageName = getPackageName();
                            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + String.valueOf(stringExtra).length());
                            sb.append(packageName);
                            sb.append(" ");
                            sb.append(stringExtra);
                            sb.append(": Could not process request, invalid callback.");
                            Log.e("GcmTaskService", sb.toString());
                            zzd(i2);
                            return 2;
                        } catch (Throwable th2) {
                            th = th2;
                            gcmTaskService = this;
                            gcmTaskService.zzd(i2);
                            throw th;
                        }
                    }
                    if (zzg(stringExtra)) {
                        zzd(i2);
                        return 2;
                    }
                    gcmTaskService = this;
                    gcmTaskService.zzd(new wws(gcmTaskService, stringExtra, ((PendingCallback) parcelableExtra).zzan, bundleExtra, longExtra, parcelableArrayListExtra));
                } else {
                    gcmTaskService = this;
                    if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                        gcmTaskService.onInitializeTasks();
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                        sb2.append("Unknown action received ");
                        sb2.append(action);
                        sb2.append(", terminating");
                        Log.e("GcmTaskService", sb2.toString());
                    }
                }
                gcmTaskService.zzd(i2);
                return 2;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                gcmTaskService.zzd(i2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            gcmTaskService = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(wws wwsVar) {
        try {
            this.zzv.execute(wwsVar);
        } catch (RejectedExecutionException e) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            wwsVar.a(1);
        }
    }
}
