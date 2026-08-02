package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.Priority;
import com.google.firebase.a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class lz10 {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            a.d();
            a d = a.d();
            d.a();
            Context context = d.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:17|(1:19)|20|(1:22)(3:101|(2:104|105)|103)|23|(2:95|96)|25|(1:27)(1:94)|28|(27:30|(1:87)|32|(1:34)(1:(1:86))|35|(1:37)|(1:39)|40|(1:44)|(1:46)|47|(1:49)|50|(1:52)|53|(1:55)|56|(5:81|82|65|(1:67)|68)|58|(5:77|78|65|(0)|68)|60|61|(1:63)(6:70|(2:73|(1:75))|72|65|(0)|68)|64|65|(0)|68)|88|(1:90)(3:91|(1:93)|32)|(0)(0)|35|(0)|(0)|40|(2:42|44)|(0)|47|(0)|50|(0)|53|(0)|56|(0)|58|(0)|60|61|(0)(0)|64|65|(0)|68) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175 A[Catch: NumberFormatException -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x0183, blocks: (B:63:0x0175, B:75:0x018e), top: B:61:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Intent intent) {
        int parseInt;
        Object[] objArr;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        long parseLong;
        String str;
        String str2;
        if (d(intent)) {
            c(intent.getExtras(), "_nr");
        }
        int i = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : a()) {
            MessagingClientEvent$Event messagingClientEvent$Event = MessagingClientEvent$Event.MESSAGE_DELIVERED;
            i211 i211Var = (i211) FirebaseMessaging.l.get();
            if (i211Var == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            oz10 oz10Var = null;
            r3 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                nz10 a = oz10.a();
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    parseInt = 0;
                }
                a.n(parseInt);
                a.e(messagingClientEvent$Event);
                String string6 = extras.getString("google.to");
                if (TextUtils.isEmpty(string6)) {
                    try {
                        a d = a.d();
                        Object obj2 = com.google.firebase.installations.a.m;
                        string6 = (String) udq0.f(((com.google.firebase.installations.a) d.b(hcr.class)).c());
                    } catch (InterruptedException | ExecutionException e) {
                        ny61.j(e);
                        return;
                    }
                }
                a.f(string6);
                a d2 = a.d();
                d2.a();
                a.i(d2.a.getPackageName());
                a.l(MessagingClientEvent$SDKPlatform.ANDROID);
                a.h(fl10.A(extras) ? MessagingClientEvent$MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent$MessageType.DATA_MESSAGE);
                String string7 = extras.getString("google.delivered_priority");
                if (string7 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string7 = extras.getString("google.priority");
                    }
                    objArr = 2;
                    if (objArr != 2) {
                        i = 5;
                    } else if (objArr == 1) {
                        i = 10;
                    }
                    a.j(i);
                    string = extras.getString("google.message_id");
                    if (string == null) {
                        string = extras.getString("message_id");
                    }
                    if (string != null) {
                        a.g(string);
                    }
                    string2 = extras.getString("from");
                    if (string2 != null && string2.startsWith("/topics/")) {
                        str3 = string2;
                    }
                    if (str3 != null) {
                        a.m(str3);
                    }
                    string3 = extras.getString("collapse_key");
                    if (string3 != null) {
                        a.c(string3);
                    }
                    string4 = extras.getString("google.c.a.m_l");
                    if (string4 != null) {
                        a.b(string4);
                    }
                    string5 = extras.getString("google.c.a.c_l");
                    if (string5 != null) {
                        a.d(string5);
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException unused2) {
                        }
                        if (parseLong > 0) {
                            a.k(parseLong);
                        }
                        oz10Var = a.a();
                    }
                    a d3 = a.d();
                    lcr lcrVar = d3.c;
                    d3.a();
                    str = lcrVar.e;
                    if (str != null) {
                        try {
                            parseLong = Long.parseLong(str);
                        } catch (NumberFormatException unused3) {
                        }
                        if (parseLong > 0) {
                        }
                        oz10Var = a.a();
                    }
                    d3.a();
                    str2 = lcrVar.b;
                    if (str2.startsWith("1:")) {
                        parseLong = Long.parseLong(str2);
                    } else {
                        String[] split = str2.split(":");
                        if (split.length >= 2) {
                            String str4 = split[1];
                            if (!str4.isEmpty()) {
                                parseLong = Long.parseLong(str4);
                            }
                        }
                        parseLong = 0;
                        if (parseLong > 0) {
                        }
                        oz10Var = a.a();
                    }
                    if (parseLong > 0) {
                    }
                    oz10Var = a.a();
                }
                if (Constants.HIGH.equals(string7)) {
                    objArr = 1;
                } else {
                    if (!Constants.NORMAL.equals(string7)) {
                        objArr = 0;
                    }
                    objArr = 2;
                }
                if (objArr != 2) {
                }
                a.j(i);
                string = extras.getString("google.message_id");
                if (string == null) {
                }
                if (string != null) {
                }
                string2 = extras.getString("from");
                if (string2 != null) {
                    str3 = string2;
                }
                if (str3 != null) {
                }
                string3 = extras.getString("collapse_key");
                if (string3 != null) {
                }
                string4 = extras.getString("google.c.a.m_l");
                if (string4 != null) {
                }
                string5 = extras.getString("google.c.a.c_l");
                if (string5 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                a d32 = a.d();
                lcr lcrVar2 = d32.c;
                d32.a();
                str = lcrVar2.e;
                if (str != null) {
                }
                d32.a();
                str2 = lcrVar2.b;
                if (str2.startsWith("1:")) {
                }
                if (parseLong > 0) {
                }
                oz10Var = a.a();
            }
            if (oz10Var == null) {
                return;
            }
            try {
                y74 y74Var = new y74(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                z211 a2 = ((j211) i211Var).a("FCM_CLIENT_EVENT_LOGGING", new pzn("proto"), new ak00(9));
                fl10 a3 = pz10.a();
                a3.E(oz10Var);
                a2.b(new g64(a3.o(), Priority.DEFAULT, y74Var));
            } catch (RuntimeException unused4) {
            }
        }
    }

    public static void c(Bundle bundle, String str) {
        try {
            a.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = fl10.A(bundle) ? "display" : io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA;
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            c32 c32Var = (c32) a.d().b(c32.class);
            if (c32Var != null) {
                ((d32) c32Var).a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean d(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
