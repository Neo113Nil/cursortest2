package xsna;

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
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: DisplayNotification.java */
/* loaded from: classes13.dex */
public final class zfn {
    public final ExecutorService a;
    public final FirebaseMessagingService b;
    public final fe70 c;

    public zfn(FirebaseMessagingService firebaseMessagingService, fe70 fe70Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = firebaseMessagingService;
        this.c = fe70Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(81:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(78:245|246|(1:24)|25|26|27|(1:29)|242|31|32|33|34|35|(62:224|(2:228|(2:232|(3:234|(1:236)(1:238)|237)))|38|(1:40)|41|(1:43)|44|(3:215|(2:219|220)|(1:218))|50|(1:52)|53|(1:55)(2:209|(1:214)(1:213))|(1:57)|58|(1:60)(5:199|(1:201)|202|(1:204)(1:208)|(1:206)(1:207))|61|(1:63)(6:181|(4:184|(2:192|193)(1:190)|191|182)|194|195|(1:197)|198)|64|(1:66)(1:180)|(1:68)|69|(36:176|177|(1:75)|76|(1:78)|79|(1:81)|(1:83)|84|(1:86)|(1:88)|89|(1:91)|(1:93)|94|(21:158|159|(1:98)|99|(3:148|149|(18:151|(1:153)|154|(1:103)|104|(4:133|134|135|(2:137|(12:139|(1:108)|109|(1:111)|112|(1:114)|115|(1:132)|117|(4:121|122|(1:124)(1:127)|125)|119|120)(2:140|141))(2:142|143))|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120)(2:155|156))|101|(0)|104|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120)|71|(39:172|173|(0)|76|(0)|79|(1:168)|81|(0)|84|(1:164)|86|(0)|89|(1:162)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120)|37|38|(0)|41|(0)|44|(2:46|48)|215|(0)|(0)|50|(0)|53|(0)(0)|(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120)|22|(0)|25|26|27|(0)|242|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)|215|(0)|(0)|50|(0)|53|(0)(0)|(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x009d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x009e, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0470 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0387 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: NameNotFoundException -> 0x009d, TRY_LEAVE, TryCatch #11 {NameNotFoundException -> 0x009d, blocks: (B:27:0x0091, B:29:0x0097), top: B:26:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        piw piwVar;
        FirebaseMessagingService firebaseMessagingService;
        fe70 fe70Var;
        Bundle bundle;
        CharSequence d;
        CharSequence d2;
        String e;
        int i;
        String e2;
        Uri defaultUri;
        String e3;
        Intent launchIntentForPackage;
        int i2;
        PendingIntent activity;
        PendingIntent broadcast;
        String e4;
        Integer valueOf;
        CharSequence e5;
        Integer b;
        Integer b2;
        Integer b3;
        String e6;
        Long valueOf2;
        JSONArray c;
        long[] jArr;
        JSONArray c2;
        int[] iArr;
        String e7;
        int i3;
        String string;
        ApplicationInfo applicationInfo;
        int i4 = 1;
        if (this.c.a("gcm.n.noui")) {
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
        String e8 = this.c.e("gcm.n.image");
        if (!TextUtils.isEmpty(e8)) {
            try {
                piwVar = new piw(new URL(e8));
            } catch (MalformedURLException unused) {
            }
            if (piwVar != null) {
                ExecutorService executorService = this.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                piwVar.c = executorService.submit(new d7n(i4, piwVar, taskCompletionSource));
                piwVar.d = taskCompletionSource.getTask();
            }
            firebaseMessagingService = this.b;
            fe70Var = this.c;
            AtomicInteger atomicInteger = flg.a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String e9 = fe70Var.e("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(e9) || notificationManager.getNotificationChannel(e9) == null) {
                    e9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(e9) || notificationManager.getNotificationChannel(e9) == null) {
                        e9 = "fcm_fallback_notification_channel";
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
                AtomicInteger atomicInteger2 = flg.a;
                String packageName = firebaseMessagingService.getPackageName();
                Resources resources = firebaseMessagingService.getResources();
                PackageManager packageManager = firebaseMessagingService.getPackageManager();
                NotificationCompat.h hVar = new NotificationCompat.h(firebaseMessagingService, e9);
                d = fe70Var.d(resources, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d)) {
                    hVar.k(d);
                }
                d2 = fe70Var.d(resources, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d2)) {
                    hVar.j(d2);
                    NotificationCompat.f fVar = new NotificationCompat.f();
                    fVar.e = NotificationCompat.h.d(d2);
                    hVar.B(fVar);
                }
                e = fe70Var.e("gcm.n.icon");
                if (!TextUtils.isEmpty(e) || ((i = resources.getIdentifier(e, "drawable", packageName)) == 0 && (i = resources.getIdentifier(e, "mipmap", packageName)) == 0)) {
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i == 0) {
                        try {
                            i = packageManager.getApplicationInfo(packageName, 0).icon;
                        } catch (PackageManager.NameNotFoundException e10) {
                            e10.toString();
                        }
                    }
                    if (i == 0) {
                        i = 17301651;
                    }
                }
                hVar.I.icon = i;
                e2 = fe70Var.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e2)) {
                    e2 = fe70Var.e("gcm.n.sound");
                }
                if (TextUtils.isEmpty(e2)) {
                    defaultUri = null;
                } else if (BuildConfig.FLAVOR.equals(e2) || resources.getIdentifier(e2, "raw", packageName) == 0) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else {
                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e2);
                }
                if (defaultUri != null) {
                    hVar.A(defaultUri);
                }
                e3 = fe70Var.e("gcm.n.click_action");
                if (TextUtils.isEmpty(e3)) {
                    String e11 = fe70Var.e("gcm.n.link_android");
                    if (TextUtils.isEmpty(e11)) {
                        e11 = fe70Var.e("gcm.n.link");
                    }
                    Uri parse = !TextUtils.isEmpty(e11) ? Uri.parse(e11) : null;
                    if (parse != null) {
                        launchIntentForPackage = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setData(parse);
                    } else {
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    }
                } else {
                    launchIntentForPackage = new Intent(e3);
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setFlags(268435456);
                }
                if (launchIntentForPackage == null) {
                    i2 = 1;
                    activity = null;
                } else {
                    launchIntentForPackage.addFlags(67108864);
                    Bundle bundle3 = fe70Var.a;
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
                    if (fe70Var.a("google.c.a.e")) {
                        launchIntentForPackage.putExtra("gcm.n.analytics_data", fe70Var.g());
                    }
                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                }
                hVar.g = activity;
                broadcast = !fe70Var.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(fe70Var.g())), 1140850688);
                if (broadcast != null) {
                    hVar.I.deleteIntent = broadcast;
                }
                e4 = fe70Var.e("gcm.n.color");
                if (!TextUtils.isEmpty(e4)) {
                    try {
                        valueOf = Integer.valueOf(Color.parseColor(e4));
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (valueOf != null) {
                        hVar.w = valueOf.intValue();
                    }
                    hVar.e(!fe70Var.a("gcm.n.sticky"));
                    hVar.t = fe70Var.a("gcm.n.local_only");
                    e5 = fe70Var.e("gcm.n.ticker");
                    if (e5 != null) {
                        hVar.D(e5);
                    }
                    b = fe70Var.b("gcm.n.notification_priority");
                    if (b != null || b.intValue() < -2 || b.intValue() > 2) {
                        b = null;
                    }
                    if (b != null) {
                        hVar.k = b.intValue();
                    }
                    b2 = fe70Var.b("gcm.n.visibility");
                    if (b2 != null || b2.intValue() < -1 || b2.intValue() > i2) {
                        b2 = null;
                    }
                    if (b2 != null) {
                        hVar.x = b2.intValue();
                    }
                    b3 = fe70Var.b("gcm.n.notification_count");
                    if (b3 != null || b3.intValue() < 0) {
                        b3 = null;
                    }
                    if (b3 != null) {
                        hVar.j = b3.intValue();
                    }
                    e6 = fe70Var.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e6)) {
                        try {
                            valueOf2 = Long.valueOf(Long.parseLong(e6));
                        } catch (NumberFormatException unused3) {
                            fe70.h("gcm.n.event_time");
                        }
                        if (valueOf2 != null) {
                            hVar.l = true;
                            hVar.I.when = valueOf2.longValue();
                        }
                        c = fe70Var.c("gcm.n.vibrate_timings");
                        if (c != null) {
                            try {
                            } catch (NumberFormatException | JSONException unused4) {
                                c.toString();
                            }
                            if (c.length() <= 1) {
                                throw new JSONException("vibrateTimings have invalid length");
                            }
                            int length = c.length();
                            jArr = new long[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                jArr[i6] = c.optLong(i6);
                            }
                            if (jArr != null) {
                                hVar.I.vibrate = jArr;
                            }
                            c2 = fe70Var.c("gcm.n.light_settings");
                            if (c2 != null) {
                                iArr = new int[3];
                                try {
                                } catch (IllegalArgumentException e12) {
                                    c2.toString();
                                    e12.getMessage();
                                } catch (JSONException unused5) {
                                    c2.toString();
                                }
                                if (c2.length() != 3) {
                                    throw new JSONException("lightSettings don't have all three fields");
                                }
                                int parseColor = Color.parseColor(c2.optString(0));
                                if (parseColor == -16777216) {
                                    throw new IllegalArgumentException("Transparent color is invalid");
                                }
                                iArr[0] = parseColor;
                                iArr[1] = c2.optInt(1);
                                iArr[2] = c2.optInt(2);
                                if (iArr != null) {
                                    hVar.r(iArr[0], iArr[1], iArr[2]);
                                }
                                boolean a = fe70Var.a("gcm.n.default_sound");
                                boolean z = a;
                                if (fe70Var.a("gcm.n.default_vibrate_timings")) {
                                    z = (a ? 1 : 0) | 2;
                                }
                                int i7 = z;
                                if (fe70Var.a("gcm.n.default_light_settings")) {
                                    i7 = (z ? 1 : 0) | 4;
                                }
                                hVar.l(i7);
                                e7 = fe70Var.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e7)) {
                                    e7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                }
                                String str2 = e7;
                                if (piwVar != null) {
                                    try {
                                        Task<Bitmap> task = piwVar.d;
                                        exc0.i(task);
                                        Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                                        hVar.q(bitmap);
                                        NotificationCompat.e eVar = new NotificationCompat.e();
                                        eVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                                        eVar.f = null;
                                        eVar.g = true;
                                        hVar.B(eVar);
                                    } catch (InterruptedException unused6) {
                                        piwVar.close();
                                        Thread.currentThread().interrupt();
                                    } catch (ExecutionException e13) {
                                        Objects.toString(e13.getCause());
                                    } catch (TimeoutException unused7) {
                                        piwVar.close();
                                    }
                                }
                                ((NotificationManager) this.b.getSystemService("notification")).notify(str2, 0, hVar.c());
                                return true;
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a2 = fe70Var.a("gcm.n.default_sound");
                            boolean z2 = a2;
                            if (fe70Var.a("gcm.n.default_vibrate_timings")) {
                            }
                            int i72 = z2;
                            if (fe70Var.a("gcm.n.default_light_settings")) {
                            }
                            hVar.l(i72);
                            e7 = fe70Var.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e7)) {
                            }
                            String str22 = e7;
                            if (piwVar != null) {
                            }
                            ((NotificationManager) this.b.getSystemService("notification")).notify(str22, 0, hVar.c());
                            return true;
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c2 = fe70Var.c("gcm.n.light_settings");
                        if (c2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean a22 = fe70Var.a("gcm.n.default_sound");
                        boolean z22 = a22;
                        if (fe70Var.a("gcm.n.default_vibrate_timings")) {
                        }
                        int i722 = z22;
                        if (fe70Var.a("gcm.n.default_light_settings")) {
                        }
                        hVar.l(i722);
                        e7 = fe70Var.e("gcm.n.tag");
                        if (TextUtils.isEmpty(e7)) {
                        }
                        String str222 = e7;
                        if (piwVar != null) {
                        }
                        ((NotificationManager) this.b.getSystemService("notification")).notify(str222, 0, hVar.c());
                        return true;
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c = fe70Var.c("gcm.n.vibrate_timings");
                    if (c != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c2 = fe70Var.c("gcm.n.light_settings");
                    if (c2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a222 = fe70Var.a("gcm.n.default_sound");
                    boolean z222 = a222;
                    if (fe70Var.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i7222 = z222;
                    if (fe70Var.a("gcm.n.default_light_settings")) {
                    }
                    hVar.l(i7222);
                    e7 = fe70Var.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e7)) {
                    }
                    String str2222 = e7;
                    if (piwVar != null) {
                    }
                    ((NotificationManager) this.b.getSystemService("notification")).notify(str2222, 0, hVar.c());
                    return true;
                }
                i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i3 != 0) {
                    try {
                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i3));
                    } catch (Resources.NotFoundException unused8) {
                    }
                    if (valueOf != null) {
                    }
                    hVar.e(!fe70Var.a("gcm.n.sticky"));
                    hVar.t = fe70Var.a("gcm.n.local_only");
                    e5 = fe70Var.e("gcm.n.ticker");
                    if (e5 != null) {
                    }
                    b = fe70Var.b("gcm.n.notification_priority");
                    if (b != null) {
                    }
                    b = null;
                    if (b != null) {
                    }
                    b2 = fe70Var.b("gcm.n.visibility");
                    if (b2 != null) {
                    }
                    b2 = null;
                    if (b2 != null) {
                    }
                    b3 = fe70Var.b("gcm.n.notification_count");
                    if (b3 != null) {
                    }
                    b3 = null;
                    if (b3 != null) {
                    }
                    e6 = fe70Var.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c = fe70Var.c("gcm.n.vibrate_timings");
                    if (c != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c2 = fe70Var.c("gcm.n.light_settings");
                    if (c2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a2222 = fe70Var.a("gcm.n.default_sound");
                    boolean z2222 = a2222;
                    if (fe70Var.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i72222 = z2222;
                    if (fe70Var.a("gcm.n.default_light_settings")) {
                    }
                    hVar.l(i72222);
                    e7 = fe70Var.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e7)) {
                    }
                    String str22222 = e7;
                    if (piwVar != null) {
                    }
                    ((NotificationManager) this.b.getSystemService("notification")).notify(str22222, 0, hVar.c());
                    return true;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                hVar.e(!fe70Var.a("gcm.n.sticky"));
                hVar.t = fe70Var.a("gcm.n.local_only");
                e5 = fe70Var.e("gcm.n.ticker");
                if (e5 != null) {
                }
                b = fe70Var.b("gcm.n.notification_priority");
                if (b != null) {
                }
                b = null;
                if (b != null) {
                }
                b2 = fe70Var.b("gcm.n.visibility");
                if (b2 != null) {
                }
                b2 = null;
                if (b2 != null) {
                }
                b3 = fe70Var.b("gcm.n.notification_count");
                if (b3 != null) {
                }
                b3 = null;
                if (b3 != null) {
                }
                e6 = fe70Var.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c = fe70Var.c("gcm.n.vibrate_timings");
                if (c != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c2 = fe70Var.c("gcm.n.light_settings");
                if (c2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a22222 = fe70Var.a("gcm.n.default_sound");
                boolean z22222 = a22222;
                if (fe70Var.a("gcm.n.default_vibrate_timings")) {
                }
                int i722222 = z22222;
                if (fe70Var.a("gcm.n.default_light_settings")) {
                }
                hVar.l(i722222);
                e7 = fe70Var.e("gcm.n.tag");
                if (TextUtils.isEmpty(e7)) {
                }
                String str222222 = e7;
                if (piwVar != null) {
                }
                ((NotificationManager) this.b.getSystemService("notification")).notify(str222222, 0, hVar.c());
                return true;
            }
            e9 = null;
            AtomicInteger atomicInteger22 = flg.a;
            String packageName2 = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            PackageManager packageManager2 = firebaseMessagingService.getPackageManager();
            NotificationCompat.h hVar2 = new NotificationCompat.h(firebaseMessagingService, e9);
            d = fe70Var.d(resources2, packageName2, "gcm.n.title");
            if (!TextUtils.isEmpty(d)) {
            }
            d2 = fe70Var.d(resources2, packageName2, "gcm.n.body");
            if (!TextUtils.isEmpty(d2)) {
            }
            e = fe70Var.e("gcm.n.icon");
            if (!TextUtils.isEmpty(e)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i == 0) {
            }
            if (i == 0) {
            }
            hVar2.I.icon = i;
            e2 = fe70Var.e("gcm.n.sound2");
            if (TextUtils.isEmpty(e2)) {
            }
            if (TextUtils.isEmpty(e2)) {
            }
            if (defaultUri != null) {
            }
            e3 = fe70Var.e("gcm.n.click_action");
            if (TextUtils.isEmpty(e3)) {
            }
            if (launchIntentForPackage == null) {
            }
            hVar2.g = activity;
            if (!fe70Var.a("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            e4 = fe70Var.e("gcm.n.color");
            if (!TextUtils.isEmpty(e4)) {
            }
            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            hVar2.e(!fe70Var.a("gcm.n.sticky"));
            hVar2.t = fe70Var.a("gcm.n.local_only");
            e5 = fe70Var.e("gcm.n.ticker");
            if (e5 != null) {
            }
            b = fe70Var.b("gcm.n.notification_priority");
            if (b != null) {
            }
            b = null;
            if (b != null) {
            }
            b2 = fe70Var.b("gcm.n.visibility");
            if (b2 != null) {
            }
            b2 = null;
            if (b2 != null) {
            }
            b3 = fe70Var.b("gcm.n.notification_count");
            if (b3 != null) {
            }
            b3 = null;
            if (b3 != null) {
            }
            e6 = fe70Var.e("gcm.n.event_time");
            if (!TextUtils.isEmpty(e6)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            c = fe70Var.c("gcm.n.vibrate_timings");
            if (c != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            c2 = fe70Var.c("gcm.n.light_settings");
            if (c2 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean a222222 = fe70Var.a("gcm.n.default_sound");
            boolean z222222 = a222222;
            if (fe70Var.a("gcm.n.default_vibrate_timings")) {
            }
            int i7222222 = z222222;
            if (fe70Var.a("gcm.n.default_light_settings")) {
            }
            hVar2.l(i7222222);
            e7 = fe70Var.e("gcm.n.tag");
            if (TextUtils.isEmpty(e7)) {
            }
            String str2222222 = e7;
            if (piwVar != null) {
            }
            ((NotificationManager) this.b.getSystemService("notification")).notify(str2222222, 0, hVar2.c());
            return true;
        }
        piwVar = null;
        if (piwVar != null) {
        }
        firebaseMessagingService = this.b;
        fe70Var = this.c;
        AtomicInteger atomicInteger3 = flg.a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String e92 = fe70Var.e("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        e92 = null;
        AtomicInteger atomicInteger222 = flg.a;
        String packageName22 = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        PackageManager packageManager22 = firebaseMessagingService.getPackageManager();
        NotificationCompat.h hVar22 = new NotificationCompat.h(firebaseMessagingService, e92);
        d = fe70Var.d(resources22, packageName22, "gcm.n.title");
        if (!TextUtils.isEmpty(d)) {
        }
        d2 = fe70Var.d(resources22, packageName22, "gcm.n.body");
        if (!TextUtils.isEmpty(d2)) {
        }
        e = fe70Var.e("gcm.n.icon");
        if (!TextUtils.isEmpty(e)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0) {
        }
        if (i == 0) {
        }
        hVar22.I.icon = i;
        e2 = fe70Var.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e2)) {
        }
        if (TextUtils.isEmpty(e2)) {
        }
        if (defaultUri != null) {
        }
        e3 = fe70Var.e("gcm.n.click_action");
        if (TextUtils.isEmpty(e3)) {
        }
        if (launchIntentForPackage == null) {
        }
        hVar22.g = activity;
        if (!fe70Var.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e4 = fe70Var.e("gcm.n.color");
        if (!TextUtils.isEmpty(e4)) {
        }
        i3 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i3 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        hVar22.e(!fe70Var.a("gcm.n.sticky"));
        hVar22.t = fe70Var.a("gcm.n.local_only");
        e5 = fe70Var.e("gcm.n.ticker");
        if (e5 != null) {
        }
        b = fe70Var.b("gcm.n.notification_priority");
        if (b != null) {
        }
        b = null;
        if (b != null) {
        }
        b2 = fe70Var.b("gcm.n.visibility");
        if (b2 != null) {
        }
        b2 = null;
        if (b2 != null) {
        }
        b3 = fe70Var.b("gcm.n.notification_count");
        if (b3 != null) {
        }
        b3 = null;
        if (b3 != null) {
        }
        e6 = fe70Var.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c = fe70Var.c("gcm.n.vibrate_timings");
        if (c != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c2 = fe70Var.c("gcm.n.light_settings");
        if (c2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a2222222 = fe70Var.a("gcm.n.default_sound");
        boolean z2222222 = a2222222;
        if (fe70Var.a("gcm.n.default_vibrate_timings")) {
        }
        int i72222222 = z2222222;
        if (fe70Var.a("gcm.n.default_light_settings")) {
        }
        hVar22.l(i72222222);
        e7 = fe70Var.e("gcm.n.tag");
        if (TextUtils.isEmpty(e7)) {
        }
        String str22222222 = e7;
        if (piwVar != null) {
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(str22222222, 0, hVar22.c());
        return true;
    }
}
