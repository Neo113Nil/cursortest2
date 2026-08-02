package com.google.android.gms.gcm;

import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.t;
import androidx.core.app.v;
import com.google.android.gms.iid.zze;
import defpackage.asa1;
import defpackage.gga1;
import defpackage.ixh0;
import defpackage.wg91;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Deprecated
/* loaded from: classes11.dex */
public class GcmListenerService extends zze {
    private asa1 zzg = gga1.a;

    public static void zzd(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0246  */
    @Override // com.google.android.gms.iid.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        wg91 wg91Var;
        int i;
        String a;
        String a2;
        int i2;
        Uri defaultUri;
        String a3;
        Intent launchIntentForPackage;
        PendingIntent pendingIntent;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String a4;
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            intent.getAction();
            return;
        }
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = CoreConstants.Transport.GCM;
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                return;
            case "gcm":
                Bundle extras = intent.getExtras();
                extras.remove("message_type");
                extras.remove("androidx.contentpager.content.wakelockid");
                if ("1".equals(wg91.a(extras, "gcm.n.e")) || wg91.a(extras, "gcm.n.icon") != null) {
                    if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        int myPid = Process.myPid();
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (next.pid == myPid) {
                                        if (next.importance == 100) {
                                            Bundle bundle2 = new Bundle();
                                            Iterator<String> it2 = extras.keySet().iterator();
                                            while (it2.hasNext()) {
                                                String next2 = it2.next();
                                                String string = extras.getString(next2);
                                                if (next2.startsWith("gcm.notification.")) {
                                                    next2 = next2.replace("gcm.notification.", "gcm.n.");
                                                }
                                                if (next2.startsWith("gcm.n.")) {
                                                    if (!"gcm.n.e".equals(next2)) {
                                                        bundle2.putString(next2.substring(6), string);
                                                    }
                                                    it2.remove();
                                                }
                                            }
                                            String string2 = bundle2.getString("sound2");
                                            if (string2 != null) {
                                                bundle2.remove("sound2");
                                                bundle2.putString("sound", string2);
                                            }
                                            if (!bundle2.isEmpty()) {
                                                extras.putBundle("notification", bundle2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (wg91.class) {
                        try {
                            if (wg91.d == null) {
                                wg91.d = new wg91(this);
                            }
                            wg91Var = wg91.d;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    String str = "fcm_fallback_notification_channel";
                    Context context = wg91Var.a;
                    CharSequence b = wg91Var.b(extras, "gcm.n.title");
                    if (TextUtils.isEmpty(b)) {
                        b = context.getApplicationInfo().loadLabel(context.getPackageManager());
                    }
                    String b2 = wg91Var.b(extras, "gcm.n.body");
                    String a5 = wg91.a(extras, "gcm.n.icon");
                    if (!TextUtils.isEmpty(a5)) {
                        Resources resources = context.getResources();
                        i = resources.getIdentifier(a5, "drawable", context.getPackageName());
                        if (i == 0 && (i = resources.getIdentifier(a5, "mipmap", context.getPackageName())) == 0) {
                            new StringBuilder(String.valueOf(a5).length() + 57);
                        }
                        a = wg91.a(extras, "gcm.n.color");
                        a2 = wg91.a(extras, "gcm.n.sound2");
                        if (TextUtils.isEmpty(a2)) {
                            if ("default".equals(a2)) {
                                i2 = 2;
                            } else {
                                i2 = 2;
                                if (context.getResources().getIdentifier(a2, "raw", context.getPackageName()) != 0) {
                                    String packageName = context.getPackageName();
                                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + String.valueOf(packageName).length() + 24);
                                    sb.append("android.resource://");
                                    sb.append(packageName);
                                    sb.append("/raw/");
                                    sb.append(a2);
                                    defaultUri = Uri.parse(sb.toString());
                                }
                            }
                            defaultUri = RingtoneManager.getDefaultUri(i2);
                        } else {
                            defaultUri = null;
                        }
                        a3 = wg91.a(extras, "gcm.n.click_action");
                        if (TextUtils.isEmpty(a3)) {
                            launchIntentForPackage = new Intent(a3);
                            launchIntentForPackage.setPackage(context.getPackageName());
                            launchIntentForPackage.setFlags(SelfTester_JCP.IMITA);
                        } else {
                            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                            if (launchIntentForPackage == null) {
                                pendingIntent = null;
                                String a6 = wg91.a(extras, "gcm.n.android_channel_id");
                                if (context.getApplicationInfo().targetSdkVersion < 26) {
                                    str = null;
                                } else {
                                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                                    if (!TextUtils.isEmpty(a6)) {
                                        if (notificationManager.getNotificationChannel(a6) == null) {
                                            new StringBuilder(String.valueOf(a6).length() + 122);
                                        }
                                        str = a6;
                                    }
                                    a6 = wg91Var.b;
                                    if (a6 == null) {
                                        try {
                                            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                                        } catch (PackageManager.NameNotFoundException unused) {
                                            applicationInfo = null;
                                        }
                                        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        String string3 = bundle.getString("com.google.android.gms.gcm.default_notification_channel_id");
                                        wg91Var.b = string3;
                                        if (TextUtils.isEmpty(string3) || notificationManager.getNotificationChannel(wg91Var.b) == null) {
                                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(ixh0.gcm_fallback_notification_channel_label), 3));
                                            }
                                            wg91Var.b = "fcm_fallback_notification_channel";
                                        } else {
                                            str = wg91Var.b;
                                        }
                                    }
                                    str = a6;
                                }
                                v vVar = new v(context, null);
                                vVar.h(16, true);
                                vVar.K.icon = i;
                                if (!TextUtils.isEmpty(b)) {
                                    vVar.f(b);
                                }
                                if (!TextUtils.isEmpty(b2)) {
                                    vVar.e(b2);
                                    t.b bVar = new t.b();
                                    bVar.e = v.d(b2);
                                    vVar.l(bVar);
                                }
                                if (!TextUtils.isEmpty(a)) {
                                    vVar.z = Color.parseColor(a);
                                }
                                if (defaultUri != null) {
                                    vVar.k(defaultUri);
                                }
                                if (pendingIntent != null) {
                                    vVar.h = pendingIntent;
                                }
                                if (str != null) {
                                    vVar.F = str;
                                }
                                Notification b3 = vVar.b();
                                a4 = wg91.a(extras, "gcm.n.tag");
                                Log.isLoggable("GcmNotification", 3);
                                NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
                                if (TextUtils.isEmpty(a4)) {
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    StringBuilder sb2 = new StringBuilder(37);
                                    sb2.append("GCM-Notification:");
                                    sb2.append(uptimeMillis);
                                    a4 = sb2.toString();
                                }
                                notificationManager2.notify(a4, 0, b3);
                                return;
                            }
                        }
                        Bundle bundle3 = new Bundle(extras);
                        zzd(bundle3);
                        launchIntentForPackage.putExtras(bundle3);
                        for (String str2 : bundle3.keySet()) {
                            if (str2.startsWith("gcm.n.") || str2.startsWith("gcm.notification.")) {
                                launchIntentForPackage.removeExtra(str2);
                            }
                        }
                        pendingIntent = PendingIntent.getActivity(context, wg91Var.c.getAndIncrement(), launchIntentForPackage, 1073741824);
                        String a62 = wg91.a(extras, "gcm.n.android_channel_id");
                        if (context.getApplicationInfo().targetSdkVersion < 26) {
                        }
                        v vVar2 = new v(context, null);
                        vVar2.h(16, true);
                        vVar2.K.icon = i;
                        if (!TextUtils.isEmpty(b)) {
                        }
                        if (!TextUtils.isEmpty(b2)) {
                        }
                        if (!TextUtils.isEmpty(a)) {
                        }
                        if (defaultUri != null) {
                        }
                        if (pendingIntent != null) {
                        }
                        if (str != null) {
                        }
                        Notification b32 = vVar2.b();
                        a4 = wg91.a(extras, "gcm.n.tag");
                        Log.isLoggable("GcmNotification", 3);
                        NotificationManager notificationManager22 = (NotificationManager) context.getSystemService("notification");
                        if (TextUtils.isEmpty(a4)) {
                        }
                        notificationManager22.notify(a4, 0, b32);
                        return;
                    }
                    int i3 = context.getApplicationInfo().icon;
                    if (i3 == 0) {
                        i3 = R.drawable.sym_def_app_icon;
                    }
                    i = i3;
                    a = wg91.a(extras, "gcm.n.color");
                    a2 = wg91.a(extras, "gcm.n.sound2");
                    if (TextUtils.isEmpty(a2)) {
                    }
                    a3 = wg91.a(extras, "gcm.n.click_action");
                    if (TextUtils.isEmpty(a3)) {
                    }
                    Bundle bundle32 = new Bundle(extras);
                    zzd(bundle32);
                    launchIntentForPackage.putExtras(bundle32);
                    while (r11.hasNext()) {
                    }
                    pendingIntent = PendingIntent.getActivity(context, wg91Var.c.getAndIncrement(), launchIntentForPackage, 1073741824);
                    String a622 = wg91.a(extras, "gcm.n.android_channel_id");
                    if (context.getApplicationInfo().targetSdkVersion < 26) {
                    }
                    v vVar22 = new v(context, null);
                    vVar22.h(16, true);
                    vVar22.K.icon = i;
                    if (!TextUtils.isEmpty(b)) {
                    }
                    if (!TextUtils.isEmpty(b2)) {
                    }
                    if (!TextUtils.isEmpty(a)) {
                    }
                    if (defaultUri != null) {
                    }
                    if (pendingIntent != null) {
                    }
                    if (str != null) {
                    }
                    Notification b322 = vVar22.b();
                    a4 = wg91.a(extras, "gcm.n.tag");
                    Log.isLoggable("GcmNotification", 3);
                    NotificationManager notificationManager222 = (NotificationManager) context.getSystemService("notification");
                    if (TextUtils.isEmpty(a4)) {
                    }
                    notificationManager222.notify(a4, 0, b322);
                    return;
                }
                String string4 = extras.getString("from");
                extras.remove("from");
                zzd(extras);
                this.zzg.getClass();
                onMessageReceived(string4, extras);
                return;
            case "send_error":
                String stringExtra2 = intent.getStringExtra("google.message_id");
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra("message_id");
                }
                onSendError(stringExtra2, intent.getStringExtra("error"));
                return;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzg = gga1.a;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }
}
