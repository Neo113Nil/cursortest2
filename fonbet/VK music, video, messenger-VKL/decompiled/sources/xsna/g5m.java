package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import ru.ok.tensorflow.detection.Detector;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class g5m implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g5m(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        switch (this.b) {
            case 0:
                ((Detector) this.d).lambda$detectGPU$1(this.c, (HashMap) this.e);
                return;
            case 1:
                vva0 vva0Var = (vva0) this.d;
                iwa0 iwa0Var = (iwa0) this.e;
                vva0Var.b.c(iwa0Var);
                ((dv40) vva0Var.c.getValue()).a(iwa0Var, this.c);
                ((dv40) vva0Var.d.getValue()).a(iwa0Var, false);
                return;
            default:
                Context context = (Context) this.d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.e;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor edit = Preference.h(applicationContext, 0, "com.google.firebase.messaging").edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.c) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    taskCompletionSource.trySetResult(null);
                    return;
                } catch (Throwable th) {
                    taskCompletionSource.trySetResult(null);
                    throw th;
                }
        }
    }

    public /* synthetic */ g5m(vva0 vva0Var, iwa0 iwa0Var, boolean z) {
        this.b = 1;
        this.d = vva0Var;
        this.e = iwa0Var;
        this.c = z;
    }
}
