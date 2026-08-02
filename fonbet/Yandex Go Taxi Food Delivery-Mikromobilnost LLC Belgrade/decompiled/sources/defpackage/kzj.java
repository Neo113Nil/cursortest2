package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class kzj {
    public final ExecutorService a;
    public final FirebaseMessagingService b;
    public final fl10 c;

    public kzj(FirebaseMessagingService firebaseMessagingService, fl10 fl10Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = firebaseMessagingService;
        this.c = fl10Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(78:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(75:213|214|(1:24)|25|26|27|(1:29)|210|31|32|33|34|35|(59:192|(2:196|(2:200|(3:202|(1:204)(1:206)|205)))|38|(1:40)|41|(1:43)|44|(3:183|(2:187|188)|(1:186))|50|(1:52)|53|(1:55)(2:177|(1:182)(1:181))|(1:57)|58|(1:60)(5:167|(1:169)|170|(1:172)(1:176)|(1:174)(1:175))|61|(1:63)(6:149|(4:152|(2:160|161)(1:158)|159|150)|162|163|(1:165)|166)|64|(1:66)(1:148)|(1:68)|69|(33:144|145|(1:75)|76|(1:78)|79|(1:81)|(1:83)|84|(1:86)|(1:88)|89|(1:91)|(1:93)|94|(18:126|127|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108|(1:110)|111|(1:125)|113|(2:118|119)|115|116|117)|96|(0)|99|(0)|102|(0)|105|(0)|108|(0)|111|(0)|113|(0)|115|116|117)|71|(36:140|141|(0)|76|(0)|79|(1:136)|81|(0)|84|(1:132)|86|(0)|89|(1:130)|91|(0)|94|(0)|96|(0)|99|(0)|102|(0)|105|(0)|108|(0)|111|(0)|113|(0)|115|116|117)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|102|(0)|105|(0)|108|(0)|111|(0)|113|(0)|115|116|117)|37|38|(0)|41|(0)|44|(2:46|48)|183|(0)|(0)|50|(0)|53|(0)(0)|(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|102|(0)|105|(0)|108|(0)|111|(0)|113|(0)|115|116|117)|22|(0)|25|26|27|(0)|210|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)|183|(0)|(0)|50|(0)|53|(0)(0)|(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|102|(0)|105|(0)|108|(0)|111|(0)|113|(0)|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x009d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x009e, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x038a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: NameNotFoundException -> 0x009d, TRY_LEAVE, TryCatch #8 {NameNotFoundException -> 0x009d, blocks: (B:27:0x0091, B:29:0x0097), top: B:26:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        j9v j9vVar;
        FirebaseMessagingService firebaseMessagingService;
        fl10 fl10Var;
        Bundle bundle;
        CharSequence x;
        CharSequence x2;
        String y;
        int i;
        String y2;
        Uri defaultUri;
        String y3;
        Intent launchIntentForPackage;
        int i2;
        PendingIntent activity;
        PendingIntent broadcast;
        String y4;
        Integer valueOf;
        CharSequence y5;
        Integer s;
        Integer s2;
        Integer s3;
        String y6;
        Long valueOf2;
        long[] z;
        int[] u;
        String y7;
        int i3;
        String string;
        ApplicationInfo applicationInfo;
        int i4 = 1;
        if (this.c.p("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = this.b;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String y8 = this.c.y("gcm.n.image");
        if (!TextUtils.isEmpty(y8)) {
            try {
                j9vVar = new j9v(new URL(y8));
            } catch (MalformedURLException unused) {
            }
            if (j9vVar != null) {
                ExecutorService executorService = this.a;
                atx0 atx0Var = new atx0();
                j9vVar.b = executorService.submit(new r7v(i4, j9vVar, atx0Var));
                j9vVar.c = atx0Var.a;
            }
            firebaseMessagingService = this.b;
            fl10Var = this.c;
            AtomicInteger atomicInteger = soc.a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String y9 = fl10Var.y("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(y9) || notificationManager.getNotificationChannel(y9) == null) {
                    y9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(y9) || notificationManager.getNotificationChannel(y9) == null) {
                        y9 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
                AtomicInteger atomicInteger2 = soc.a;
                String packageName = firebaseMessagingService.getPackageName();
                Resources resources = firebaseMessagingService.getResources();
                PackageManager packageManager = firebaseMessagingService.getPackageManager();
                v vVar = new v(firebaseMessagingService, y9);
                x = fl10Var.x(resources, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(x)) {
                    vVar.f(x);
                }
                x2 = fl10Var.x(resources, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(x2)) {
                    vVar.e(x2);
                    t.b bVar = new t.b();
                    bVar.e = v.d(x2);
                    vVar.l(bVar);
                }
                y = fl10Var.y("gcm.n.icon");
                if (!TextUtils.isEmpty(y) || ((i = resources.getIdentifier(y, "drawable", packageName)) == 0 && (i = resources.getIdentifier(y, "mipmap", packageName)) == 0)) {
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i == 0) {
                        try {
                            i = packageManager.getApplicationInfo(packageName, 0).icon;
                        } catch (PackageManager.NameNotFoundException e) {
                            e.toString();
                        }
                    }
                    if (i == 0) {
                        i = 17301651;
                    }
                }
                vVar.K.icon = i;
                y2 = fl10Var.y("gcm.n.sound2");
                if (TextUtils.isEmpty(y2)) {
                    y2 = fl10Var.y("gcm.n.sound");
                }
                if (TextUtils.isEmpty(y2)) {
                    defaultUri = null;
                } else if ("default".equals(y2) || resources.getIdentifier(y2, "raw", packageName) == 0) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else {
                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + y2);
                }
                if (defaultUri != null) {
                    vVar.k(defaultUri);
                }
                y3 = fl10Var.y("gcm.n.click_action");
                if (TextUtils.isEmpty(y3)) {
                    String y10 = fl10Var.y("gcm.n.link_android");
                    if (TextUtils.isEmpty(y10)) {
                        y10 = fl10Var.y("gcm.n.link");
                    }
                    Uri parse = !TextUtils.isEmpty(y10) ? Uri.parse(y10) : null;
                    if (parse != null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setData(parse);
                    } else {
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    }
                } else {
                    launchIntentForPackage = new Intent(y3);
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setFlags(SelfTester_JCP.IMITA);
                }
                if (launchIntentForPackage == null) {
                    i2 = 1;
                    activity = null;
                } else {
                    launchIntentForPackage.addFlags(SelfTester_JCP.DECRYPT_CBC);
                    Bundle bundle3 = (Bundle) fl10Var.a;
                    Bundle bundle4 = new Bundle(bundle3);
                    for (String str : bundle3.keySet()) {
                        int i5 = i4;
                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                            bundle4.remove(str);
                        }
                        i4 = i5;
                    }
                    i2 = i4;
                    launchIntentForPackage.putExtras(bundle4);
                    if (fl10Var.p("google.c.a.e")) {
                        launchIntentForPackage.putExtra("gcm.n.analytics_data", fl10Var.C());
                    }
                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                }
                vVar.h = activity;
                broadcast = !fl10Var.p("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(fl10Var.C())), 1140850688);
                if (broadcast != null) {
                    vVar.K.deleteIntent = broadcast;
                }
                y4 = fl10Var.y("gcm.n.color");
                if (!TextUtils.isEmpty(y4)) {
                    try {
                        valueOf = Integer.valueOf(Color.parseColor(y4));
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (valueOf != null) {
                        vVar.z = valueOf.intValue();
                    }
                    vVar.h(16, !fl10Var.p("gcm.n.sticky"));
                    vVar.u = fl10Var.p("gcm.n.local_only");
                    y5 = fl10Var.y("gcm.n.ticker");
                    if (y5 != null) {
                        vVar.m(y5);
                    }
                    s = fl10Var.s("gcm.n.notification_priority");
                    if (s != null || s.intValue() < -2 || s.intValue() > 2) {
                        s = null;
                    }
                    if (s != null) {
                        vVar.m = s.intValue();
                    }
                    s2 = fl10Var.s("gcm.n.visibility");
                    if (s2 != null || s2.intValue() < -1 || s2.intValue() > i2) {
                        s2 = null;
                    }
                    if (s2 != null) {
                        vVar.A = s2.intValue();
                    }
                    s3 = fl10Var.s("gcm.n.notification_count");
                    if (s3 != null || s3.intValue() < 0) {
                        s3 = null;
                    }
                    if (s3 != null) {
                        vVar.l = s3.intValue();
                    }
                    y6 = fl10Var.y("gcm.n.event_time");
                    if (!TextUtils.isEmpty(y6)) {
                        try {
                            valueOf2 = Long.valueOf(Long.parseLong(y6));
                        } catch (NumberFormatException unused3) {
                        }
                        if (valueOf2 != null) {
                            vVar.n = true;
                            vVar.K.when = valueOf2.longValue();
                        }
                        z = fl10Var.z();
                        if (z != null) {
                            vVar.K.vibrate = z;
                        }
                        u = fl10Var.u();
                        if (u != null) {
                            vVar.j(u[0], u[1], u[2]);
                        }
                        boolean p = fl10Var.p("gcm.n.default_sound");
                        boolean z2 = p;
                        if (fl10Var.p("gcm.n.default_vibrate_timings")) {
                            z2 = (p ? 1 : 0) | 2;
                        }
                        int i6 = z2;
                        if (fl10Var.p("gcm.n.default_light_settings")) {
                            i6 = (z2 ? 1 : 0) | 4;
                        }
                        vVar.g(i6);
                        y7 = fl10Var.y("gcm.n.tag");
                        if (TextUtils.isEmpty(y7)) {
                            y7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                        }
                        String str2 = y7;
                        if (j9vVar != null) {
                            try {
                                zzw zzwVar = j9vVar.c;
                                cvw.l(zzwVar);
                                Bitmap bitmap = (Bitmap) udq0.g(zzwVar, 5L, TimeUnit.SECONDS);
                                vVar.i(bitmap);
                                t.a aVar = new t.a();
                                aVar.e(bitmap);
                                aVar.f = null;
                                aVar.g = true;
                                vVar.l(aVar);
                            } catch (InterruptedException unused4) {
                                j9vVar.close();
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e2) {
                                e2.getCause();
                            } catch (TimeoutException unused5) {
                                j9vVar.close();
                            }
                        }
                        Log.isLoggable("FirebaseMessaging", 3);
                        ((NotificationManager) this.b.getSystemService("notification")).notify(str2, 0, vVar.b());
                        return true;
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    z = fl10Var.z();
                    if (z != null) {
                    }
                    u = fl10Var.u();
                    if (u != null) {
                    }
                    boolean p2 = fl10Var.p("gcm.n.default_sound");
                    boolean z22 = p2;
                    if (fl10Var.p("gcm.n.default_vibrate_timings")) {
                    }
                    int i62 = z22;
                    if (fl10Var.p("gcm.n.default_light_settings")) {
                    }
                    vVar.g(i62);
                    y7 = fl10Var.y("gcm.n.tag");
                    if (TextUtils.isEmpty(y7)) {
                    }
                    String str22 = y7;
                    if (j9vVar != null) {
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    ((NotificationManager) this.b.getSystemService("notification")).notify(str22, 0, vVar.b());
                    return true;
                }
                i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i3 != 0) {
                    try {
                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i3));
                    } catch (Resources.NotFoundException unused6) {
                    }
                    if (valueOf != null) {
                    }
                    vVar.h(16, !fl10Var.p("gcm.n.sticky"));
                    vVar.u = fl10Var.p("gcm.n.local_only");
                    y5 = fl10Var.y("gcm.n.ticker");
                    if (y5 != null) {
                    }
                    s = fl10Var.s("gcm.n.notification_priority");
                    if (s != null) {
                    }
                    s = null;
                    if (s != null) {
                    }
                    s2 = fl10Var.s("gcm.n.visibility");
                    if (s2 != null) {
                    }
                    s2 = null;
                    if (s2 != null) {
                    }
                    s3 = fl10Var.s("gcm.n.notification_count");
                    if (s3 != null) {
                    }
                    s3 = null;
                    if (s3 != null) {
                    }
                    y6 = fl10Var.y("gcm.n.event_time");
                    if (!TextUtils.isEmpty(y6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    z = fl10Var.z();
                    if (z != null) {
                    }
                    u = fl10Var.u();
                    if (u != null) {
                    }
                    boolean p22 = fl10Var.p("gcm.n.default_sound");
                    boolean z222 = p22;
                    if (fl10Var.p("gcm.n.default_vibrate_timings")) {
                    }
                    int i622 = z222;
                    if (fl10Var.p("gcm.n.default_light_settings")) {
                    }
                    vVar.g(i622);
                    y7 = fl10Var.y("gcm.n.tag");
                    if (TextUtils.isEmpty(y7)) {
                    }
                    String str222 = y7;
                    if (j9vVar != null) {
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    ((NotificationManager) this.b.getSystemService("notification")).notify(str222, 0, vVar.b());
                    return true;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                vVar.h(16, !fl10Var.p("gcm.n.sticky"));
                vVar.u = fl10Var.p("gcm.n.local_only");
                y5 = fl10Var.y("gcm.n.ticker");
                if (y5 != null) {
                }
                s = fl10Var.s("gcm.n.notification_priority");
                if (s != null) {
                }
                s = null;
                if (s != null) {
                }
                s2 = fl10Var.s("gcm.n.visibility");
                if (s2 != null) {
                }
                s2 = null;
                if (s2 != null) {
                }
                s3 = fl10Var.s("gcm.n.notification_count");
                if (s3 != null) {
                }
                s3 = null;
                if (s3 != null) {
                }
                y6 = fl10Var.y("gcm.n.event_time");
                if (!TextUtils.isEmpty(y6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                z = fl10Var.z();
                if (z != null) {
                }
                u = fl10Var.u();
                if (u != null) {
                }
                boolean p222 = fl10Var.p("gcm.n.default_sound");
                boolean z2222 = p222;
                if (fl10Var.p("gcm.n.default_vibrate_timings")) {
                }
                int i6222 = z2222;
                if (fl10Var.p("gcm.n.default_light_settings")) {
                }
                vVar.g(i6222);
                y7 = fl10Var.y("gcm.n.tag");
                if (TextUtils.isEmpty(y7)) {
                }
                String str2222 = y7;
                if (j9vVar != null) {
                }
                Log.isLoggable("FirebaseMessaging", 3);
                ((NotificationManager) this.b.getSystemService("notification")).notify(str2222, 0, vVar.b());
                return true;
            }
            y9 = null;
            AtomicInteger atomicInteger22 = soc.a;
            String packageName2 = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            PackageManager packageManager2 = firebaseMessagingService.getPackageManager();
            v vVar2 = new v(firebaseMessagingService, y9);
            x = fl10Var.x(resources2, packageName2, "gcm.n.title");
            if (!TextUtils.isEmpty(x)) {
            }
            x2 = fl10Var.x(resources2, packageName2, "gcm.n.body");
            if (!TextUtils.isEmpty(x2)) {
            }
            y = fl10Var.y("gcm.n.icon");
            if (!TextUtils.isEmpty(y)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i == 0) {
            }
            if (i == 0) {
            }
            vVar2.K.icon = i;
            y2 = fl10Var.y("gcm.n.sound2");
            if (TextUtils.isEmpty(y2)) {
            }
            if (TextUtils.isEmpty(y2)) {
            }
            if (defaultUri != null) {
            }
            y3 = fl10Var.y("gcm.n.click_action");
            if (TextUtils.isEmpty(y3)) {
            }
            if (launchIntentForPackage == null) {
            }
            vVar2.h = activity;
            if (!fl10Var.p("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            y4 = fl10Var.y("gcm.n.color");
            if (!TextUtils.isEmpty(y4)) {
            }
            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            vVar2.h(16, !fl10Var.p("gcm.n.sticky"));
            vVar2.u = fl10Var.p("gcm.n.local_only");
            y5 = fl10Var.y("gcm.n.ticker");
            if (y5 != null) {
            }
            s = fl10Var.s("gcm.n.notification_priority");
            if (s != null) {
            }
            s = null;
            if (s != null) {
            }
            s2 = fl10Var.s("gcm.n.visibility");
            if (s2 != null) {
            }
            s2 = null;
            if (s2 != null) {
            }
            s3 = fl10Var.s("gcm.n.notification_count");
            if (s3 != null) {
            }
            s3 = null;
            if (s3 != null) {
            }
            y6 = fl10Var.y("gcm.n.event_time");
            if (!TextUtils.isEmpty(y6)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            z = fl10Var.z();
            if (z != null) {
            }
            u = fl10Var.u();
            if (u != null) {
            }
            boolean p2222 = fl10Var.p("gcm.n.default_sound");
            boolean z22222 = p2222;
            if (fl10Var.p("gcm.n.default_vibrate_timings")) {
            }
            int i62222 = z22222;
            if (fl10Var.p("gcm.n.default_light_settings")) {
            }
            vVar2.g(i62222);
            y7 = fl10Var.y("gcm.n.tag");
            if (TextUtils.isEmpty(y7)) {
            }
            String str22222 = y7;
            if (j9vVar != null) {
            }
            Log.isLoggable("FirebaseMessaging", 3);
            ((NotificationManager) this.b.getSystemService("notification")).notify(str22222, 0, vVar2.b());
            return true;
        }
        j9vVar = null;
        if (j9vVar != null) {
        }
        firebaseMessagingService = this.b;
        fl10Var = this.c;
        AtomicInteger atomicInteger3 = soc.a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String y92 = fl10Var.y("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        y92 = null;
        AtomicInteger atomicInteger222 = soc.a;
        String packageName22 = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        PackageManager packageManager22 = firebaseMessagingService.getPackageManager();
        v vVar22 = new v(firebaseMessagingService, y92);
        x = fl10Var.x(resources22, packageName22, "gcm.n.title");
        if (!TextUtils.isEmpty(x)) {
        }
        x2 = fl10Var.x(resources22, packageName22, "gcm.n.body");
        if (!TextUtils.isEmpty(x2)) {
        }
        y = fl10Var.y("gcm.n.icon");
        if (!TextUtils.isEmpty(y)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0) {
        }
        if (i == 0) {
        }
        vVar22.K.icon = i;
        y2 = fl10Var.y("gcm.n.sound2");
        if (TextUtils.isEmpty(y2)) {
        }
        if (TextUtils.isEmpty(y2)) {
        }
        if (defaultUri != null) {
        }
        y3 = fl10Var.y("gcm.n.click_action");
        if (TextUtils.isEmpty(y3)) {
        }
        if (launchIntentForPackage == null) {
        }
        vVar22.h = activity;
        if (!fl10Var.p("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        y4 = fl10Var.y("gcm.n.color");
        if (!TextUtils.isEmpty(y4)) {
        }
        i3 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i3 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        vVar22.h(16, !fl10Var.p("gcm.n.sticky"));
        vVar22.u = fl10Var.p("gcm.n.local_only");
        y5 = fl10Var.y("gcm.n.ticker");
        if (y5 != null) {
        }
        s = fl10Var.s("gcm.n.notification_priority");
        if (s != null) {
        }
        s = null;
        if (s != null) {
        }
        s2 = fl10Var.s("gcm.n.visibility");
        if (s2 != null) {
        }
        s2 = null;
        if (s2 != null) {
        }
        s3 = fl10Var.s("gcm.n.notification_count");
        if (s3 != null) {
        }
        s3 = null;
        if (s3 != null) {
        }
        y6 = fl10Var.y("gcm.n.event_time");
        if (!TextUtils.isEmpty(y6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        z = fl10Var.z();
        if (z != null) {
        }
        u = fl10Var.u();
        if (u != null) {
        }
        boolean p22222 = fl10Var.p("gcm.n.default_sound");
        boolean z222222 = p22222;
        if (fl10Var.p("gcm.n.default_vibrate_timings")) {
        }
        int i622222 = z222222;
        if (fl10Var.p("gcm.n.default_light_settings")) {
        }
        vVar22.g(i622222);
        y7 = fl10Var.y("gcm.n.tag");
        if (TextUtils.isEmpty(y7)) {
        }
        String str222222 = y7;
        if (j9vVar != null) {
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.b.getSystemService("notification")).notify(str222222, 0, vVar22.b());
        return true;
    }
}
