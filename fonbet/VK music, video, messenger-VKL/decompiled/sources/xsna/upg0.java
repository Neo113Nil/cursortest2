package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.MBridgeConstans;
import io.jsonwebtoken.JwsHeader;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final class upg0 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final dr01 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public com.google.android.gms.cloudmessaging.zze g;
    public final dpj0 a = new dpj0();
    public final Messenger e = new Messenger(new dvz0(this, Looper.getMainLooper()));

    public upg0(@NonNull Context context) {
        this.b = context;
        this.c = new dr01(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final Task a(Bundle bundle) {
        final String num;
        synchronized (upg0.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.a) {
            this.a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (upg0.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
                }
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, i);
            } finally {
            }
        }
        intent.putExtra(JwsHeader.KEY_ID, "|ID|" + num + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.a(obtain);
                }
            } catch (RemoteException unused) {
            }
            final ScheduledFuture<?> schedule = this.d.schedule(new Runnable() { // from class: xsna.muz0
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"));
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(ns01.b, new OnCompleteListener() { // from class: xsna.uuz0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    upg0 upg0Var = upg0.this;
                    String str = num;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (upg0Var.a) {
                        upg0Var.a.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.d.schedule(new Runnable() { // from class: xsna.muz0
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(ns01.b, new OnCompleteListener() { // from class: xsna.uuz0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                upg0 upg0Var = upg0.this;
                String str = num;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (upg0Var.a) {
                    upg0Var.a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void b(String str, @Nullable Bundle bundle) {
        synchronized (this.a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.a.remove(str);
                if (taskCompletionSource == null) {
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
