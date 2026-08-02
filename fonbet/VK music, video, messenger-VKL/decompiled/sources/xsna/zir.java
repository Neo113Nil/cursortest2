package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.vk.core.preference.Preference;
import com.vk.dto.Push;
import com.vkontakte.android.VKApplication;
import java.util.Iterator;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zir implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zir(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.b;
        int i2 = 2;
        Push.Priority priority = null;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                Context context = ((FirebaseMessaging) obj).d;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (!Preference.h(applicationContext, 0, "com.google.firebase.messaging").getBoolean("proxy_notification_initialized", false)) {
                    try {
                        Context applicationContext2 = context.getApplicationContext();
                        PackageManager packageManager = applicationContext2.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 29) {
                        Tasks.forResult(null);
                        break;
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        new g5m(context, z, taskCompletionSource, i2).run();
                        taskCompletionSource.getTask();
                        break;
                    }
                }
                break;
            case 1:
                VKApplication vKApplication = ((ccg0) obj).b;
                qje0 qje0Var = new qje0(vKApplication);
                ca70 ca70Var = ca70.a;
                Iterator it = yh70.b.e(((NotificationManager) vKApplication.getSystemService("notification")).getActiveNotifications()).iterator();
                while (it.hasNext()) {
                    qje0Var.g(new Push((Map) it.next(), priority, i2));
                }
                break;
            case 2:
                qmg0 qmg0Var = (qmg0) obj;
                qmg0Var.e.b = false;
                try {
                    if (!qmg0Var.isFakeDragging()) {
                        qmg0Var.beginFakeDrag();
                        if (qmg0Var.isFakeDragging()) {
                            qmg0Var.endFakeDrag();
                        }
                    }
                } catch (Exception unused2) {
                }
                qmg0Var.e.b = true;
                break;
            default:
                mjk0 mjk0Var = ((pjk0) obj).j;
                if (mjk0Var != null) {
                    mjk0Var.c();
                    break;
                }
                break;
        }
    }
}
