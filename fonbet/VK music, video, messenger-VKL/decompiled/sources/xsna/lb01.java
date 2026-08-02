package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.internal.zzah;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.core.preference.Preference;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class lb01 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ed01 d;

    public /* synthetic */ lb01(ed01 ed01Var, Object obj, int i) {
        this.b = i;
        this.d = ed01Var;
        this.c = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:29|(1:31)(49:251|252|253|254|(1:256)(2:279|(43:281|258|259|(7:261|(1:263)(1:276)|264|265|266|267|268)(1:277)|269|33|(1:250)(1:37)|38|39|41|(1:43)|44|45|46|(1:48)|49|(9:51|(1:53)(1:237)|54|55|56|57|(3:230|231|60)|59|60)(1:239)|(3:62|(1:64)(1:67)|65)|68|(1:70)(2:227|(23:229|(3:220|221|(21:223|(18:75|(1:77)(3:211|(3:214|(1:216)(1:217)|212)|218)|(1:79)(1:210)|80|(3:82|(1:84)(1:88)|(1:86)(1:87))|89|(1:91)|92|(1:209)(3:95|(2:197|(2:204|(1:206)))(1:105)|106)|(1:108)(1:196)|109|(1:111)|112|(1:116)|117|(2:119|(7:121|(1:123)|124|(1:126)|127|(8:131|(1:133)|134|135|136|(2:144|(2:146|(1:141)))|139|(0))|149))(16:152|(2:154|(12:156|157|(1:159)|160|(3:162|163|164)|169|(2:171|(1:173))|174|(1:176)(1:184)|(1:180)|(1:182)|183))|185|(5:187|(1:189)(1:194)|190|(1:192)|193)|195|157|(0)|160|(0)|169|(0)|174|(0)(0)|(2:178|180)|(0)|183)|150|151)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(2:114|116)|117|(0)(0)|150|151))|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151))|71|(0)|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151))|257|258|259|(0)(0)|269|33|(1:35)|250|38|39|41|(0)|44|45|46|(0)|49|(0)(0)|(0)|68|(0)(0)|71|(0)|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151)|32|33|(0)|250|38|39|41|(0)|44|45|46|(0)|49|(0)(0)|(0)|68|(0)(0)|71|(0)|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:251|252|253|254|(1:256)(2:279|(43:281|258|259|(7:261|(1:263)(1:276)|264|265|266|267|268)(1:277)|269|33|(1:250)(1:37)|38|39|41|(1:43)|44|45|46|(1:48)|49|(9:51|(1:53)(1:237)|54|55|56|57|(3:230|231|60)|59|60)(1:239)|(3:62|(1:64)(1:67)|65)|68|(1:70)(2:227|(23:229|(3:220|221|(21:223|(18:75|(1:77)(3:211|(3:214|(1:216)(1:217)|212)|218)|(1:79)(1:210)|80|(3:82|(1:84)(1:88)|(1:86)(1:87))|89|(1:91)|92|(1:209)(3:95|(2:197|(2:204|(1:206)))(1:105)|106)|(1:108)(1:196)|109|(1:111)|112|(1:116)|117|(2:119|(7:121|(1:123)|124|(1:126)|127|(8:131|(1:133)|134|135|136|(2:144|(2:146|(1:141)))|139|(0))|149))(16:152|(2:154|(12:156|157|(1:159)|160|(3:162|163|164)|169|(2:171|(1:173))|174|(1:176)(1:184)|(1:180)|(1:182)|183))|185|(5:187|(1:189)(1:194)|190|(1:192)|193)|195|157|(0)|160|(0)|169|(0)|174|(0)(0)|(2:178|180)|(0)|183)|150|151)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(2:114|116)|117|(0)(0)|150|151))|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151))|71|(0)|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151))|257|258|259|(0)(0)|269|33|(1:35)|250|38|39|41|(0)|44|45|46|(0)|49|(0)(0)|(0)|68|(0)(0)|71|(0)|73|(0)|219|(0)(0)|80|(0)|89|(0)|92|(0)|207|209|(0)(0)|109|(0)|112|(0)|117|(0)(0)|150|151) */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02ab, code lost:
    
        r10 = "admob_app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01bb, code lost:
    
        r9 = com.huawei.hms.hihealth.data.DeviceInfo.STR_TYPE_UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x030c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0195 A[Catch: NameNotFoundException -> 0x01bb, TryCatch #9 {NameNotFoundException -> 0x01bb, blocks: (B:259:0x018a, B:261:0x0195, B:263:0x01a1), top: B:258:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0286 A[Catch: IllegalStateException -> 0x02aa, TryCatch #6 {IllegalStateException -> 0x02aa, blocks: (B:46:0x0272, B:49:0x027e, B:51:0x0286, B:237:0x0291), top: B:45:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b2 A[Catch: IllegalStateException -> 0x02a8, TryCatch #3 {IllegalStateException -> 0x02a8, blocks: (B:57:0x0299, B:60:0x02a5, B:62:0x02b2, B:64:0x02c3, B:65:0x02c8, B:67:0x02c6, B:231:0x02a1), top: B:56:0x0299 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x043f A[ADDED_TO_REGION] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x901 x901Var;
        kwz0 kwz0Var;
        PackageManager packageManager;
        PackageInfo packageInfo;
        int i;
        String str;
        String str2;
        boolean z;
        int l;
        long j;
        String str3;
        Bundle r;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        u901 u901Var;
        Boolean s;
        Boolean s2;
        xwz0 xwz0Var;
        int i2;
        xwz0 xwz0Var2;
        op01 op01Var;
        x901 x901Var2;
        boolean b;
        SharedPreferences sharedPreferences;
        boolean z2;
        PackageManager packageManager2;
        ServiceInfo serviceInfo;
        String d;
        String string;
        switch (this.b) {
            case 0:
                mb01 mb01Var = (mb01) this.d;
                x901 x901Var3 = mb01Var.i;
                id01 id01Var = (id01) this.c;
                kb01 kb01Var = mb01Var.k;
                AtomicInteger atomicInteger = mb01Var.G;
                k901 k901Var = mb01Var.j;
                mb01.k(kb01Var);
                kb01Var.k();
                kwz0 kwz0Var2 = mb01Var.h;
                ((mb01) kwz0Var2.b).getClass();
                vyz0 vyz0Var = new vyz0(mb01Var);
                vyz0Var.n();
                mb01Var.w = vyz0Var;
                w701 w701Var = new w701(mb01Var, id01Var.f);
                w701Var.m();
                mb01Var.x = w701Var;
                e901 e901Var = new e901(mb01Var);
                e901Var.m();
                mb01Var.u = e901Var;
                yh01 yh01Var = new yh01(mb01Var);
                yh01Var.m();
                mb01Var.v = yh01Var;
                sk01 sk01Var = mb01Var.m;
                boolean z3 = sk01Var.e;
                mb01 mb01Var2 = (mb01) sk01Var.b;
                if (z3) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                sk01Var.k();
                SecureRandom secureRandom = new SecureRandom();
                long nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    nextLong = secureRandom.nextLong();
                    if (nextLong == 0) {
                        k901 k901Var2 = ((mb01) sk01Var.b).j;
                        mb01.k(k901Var2);
                        k901Var2.l.a("Utils falling back to Random for random id");
                    }
                }
                sk01Var.g.set(nextLong);
                mb01Var2.a();
                sk01Var.e = true;
                if (x901Var3.e) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences h = Preference.h(((mb01) x901Var3.b).b, 0, "com.google.android.gms.measurement.prefs");
                x901Var3.f = h;
                boolean z4 = h.getBoolean("has_been_opened", false);
                x901Var3.s = z4;
                if (!z4) {
                    SharedPreferences.Editor edit = x901Var3.f.edit();
                    edit.putBoolean("has_been_opened", true);
                    edit.apply();
                }
                x901Var3.g = new v901(x901Var3, Math.max(0L, ((Long) s701.d.a(null)).longValue()));
                ((mb01) x901Var3.b).a();
                x901Var3.e = true;
                w701 w701Var2 = mb01Var.x;
                boolean z5 = w701Var2.e;
                mb01 mb01Var3 = (mb01) w701Var2.b;
                if (z5) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                Context context = mb01Var3.b;
                String str4 = mb01Var3.t;
                String str5 = mb01Var3.c;
                k901 k901Var3 = mb01Var3.j;
                String packageName = context.getPackageName();
                Context context2 = mb01Var3.b;
                PackageManager packageManager3 = context2.getPackageManager();
                String str6 = "unknown";
                String str7 = DeviceInfo.STR_TYPE_UNKNOWN;
                if (packageManager3 != null) {
                    x901Var = x901Var3;
                    kwz0Var = kwz0Var2;
                    try {
                        str6 = packageManager3.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused) {
                        mb01.k(k901Var3);
                        k901Var3.i.b(k901.r(packageName), "Error retrieving app installer package name. appId");
                    }
                    String str8 = str6;
                    if (str8 == null) {
                        str8 = "manual_install";
                    } else if ("com.android.vending".equals(str8)) {
                        str6 = "";
                        packageInfo = packageManager3.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo == null) {
                            CharSequence applicationLabel = packageManager3.getApplicationLabel(packageInfo.applicationInfo);
                            String str9 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : DeviceInfo.STR_TYPE_UNKNOWN;
                            try {
                                String str10 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    str7 = str10;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str7 = str10;
                                    mb01.k(k901Var3);
                                    packageManager = packageManager3;
                                    k901Var3.i.c("Error retrieving package info. appId, appName", k901.r(packageName), str9);
                                    str = str6;
                                    str2 = str7;
                                    i = Integer.MIN_VALUE;
                                    w701Var2.f = packageName;
                                    w701Var2.i = str;
                                    w701Var2.g = str2;
                                    w701Var2.h = i;
                                    w701Var2.j = 0L;
                                    if (TextUtils.isEmpty(str5)) {
                                    }
                                    l = mb01Var3.l();
                                    switch (l) {
                                    }
                                    w701Var2.o = "";
                                    w701Var2.p = "";
                                    if (z) {
                                    }
                                    d = bbq.d(context2, str4);
                                    w701Var2.o = true != TextUtils.isEmpty(d) ? d : "";
                                    if (TextUtils.isEmpty(d)) {
                                    }
                                    if (l == 0) {
                                    }
                                    w701Var2.l = null;
                                    kwz0 kwz0Var3 = mb01Var3.h;
                                    mb01 mb01Var4 = (mb01) kwz0Var3.b;
                                    exc0.f("analytics.safelisted_events");
                                    r = kwz0Var3.r();
                                    if (r == null) {
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    asList = null;
                                    if (asList != null) {
                                    }
                                    w701Var2.l = asList;
                                    if (packageManager == null) {
                                    }
                                    mb01Var3.a();
                                    w701Var2.e = true;
                                    mb01.k(k901Var);
                                    i901 i901Var = k901Var.o;
                                    kwz0Var.p();
                                    i901Var.b(74029L, "App measurement initialized, version");
                                    mb01.k(k901Var);
                                    i901Var.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    String o = w701Var.o();
                                    if (TextUtils.isEmpty(mb01Var.c)) {
                                    }
                                    mb01.k(k901Var);
                                    k901Var.p.a("Debug-level message logging enabled");
                                    if (mb01Var.F != atomicInteger.get()) {
                                    }
                                    mb01Var.y = true;
                                    zzcl zzclVar = id01Var.g;
                                    Context context3 = mb01Var.b;
                                    long j2 = mb01Var.H;
                                    bf01 bf01Var = mb01Var.q;
                                    mb01.k(kb01Var);
                                    kb01Var.k();
                                    mb01.i(x901Var);
                                    x901 x901Var4 = x901Var;
                                    w901 w901Var = x901Var4.w;
                                    w901 w901Var2 = x901Var4.i;
                                    u901Var = x901Var4.h;
                                    xwz0 p = x901Var4.p();
                                    x901Var4.k();
                                    int i3 = x901Var4.o().getInt("consent_source", 100);
                                    kwz0 kwz0Var4 = kwz0Var;
                                    Object obj = kwz0Var4.b;
                                    s = kwz0Var4.s("google_analytics_default_allow_ad_storage");
                                    s2 = kwz0Var4.s("google_analytics_default_allow_analytics_storage");
                                    if (s == null) {
                                    }
                                    xwz0Var = new xwz0(s, s2);
                                    i2 = -10;
                                    if (xwz0Var == null) {
                                    }
                                    mb01.j(bf01Var);
                                    bf01Var.y(xwz0Var2);
                                    if (u901Var.a() == j) {
                                    }
                                    mb01.j(bf01Var);
                                    op01Var = bf01Var.q;
                                    if (op01Var.b()) {
                                    }
                                    if (!mb01Var.h()) {
                                    }
                                    x901Var4.p.a(true);
                                    return;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        } else {
                            i = Integer.MIN_VALUE;
                        }
                        packageManager = packageManager3;
                        str = str6;
                        str2 = str7;
                        w701Var2.f = packageName;
                        w701Var2.i = str;
                        w701Var2.g = str2;
                        w701Var2.h = i;
                        w701Var2.j = 0L;
                        z = TextUtils.isEmpty(str5) && "am".equals(mb01Var3.d);
                        l = mb01Var3.l();
                        switch (l) {
                            case 0:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.q.a("App measurement collection enabled");
                                break;
                            case 1:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.o.a("App measurement deactivated via the manifest");
                                break;
                            case 2:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.q.a("App measurement deactivated via the init parameters");
                                break;
                            case 3:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.o.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                break;
                            case 4:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.o.a("App measurement disabled via the manifest");
                                break;
                            case 5:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.q.a("App measurement disabled via the init parameters");
                                break;
                            case 6:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.n.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                break;
                            case 7:
                                j = 0;
                                mb01.k(k901Var3);
                                k901Var3.o.a("App measurement disabled via the global data collection setting");
                                break;
                            default:
                                mb01.k(k901Var3);
                                j = 0;
                                k901Var3.o.a("App measurement disabled due to denied storage consent");
                                break;
                        }
                        w701Var2.o = "";
                        w701Var2.p = "";
                        if (z) {
                            w701Var2.p = str5;
                        }
                        d = bbq.d(context2, str4);
                        w701Var2.o = true != TextUtils.isEmpty(d) ? d : "";
                        if (TextUtils.isEmpty(d)) {
                            Resources resources = context2.getResources();
                            if (TextUtils.isEmpty(str4)) {
                                str4 = gb01.a(context2);
                            }
                            str3 = "admob_app_id";
                            try {
                                int identifier = resources.getIdentifier(str3, "string", str4);
                                if (identifier != 0) {
                                    try {
                                        string = resources.getString(identifier);
                                    } catch (Resources.NotFoundException unused4) {
                                    }
                                    w701Var2.p = string;
                                }
                                string = null;
                                w701Var2.p = string;
                            } catch (IllegalStateException e) {
                                e = e;
                                mb01.k(k901Var3);
                                k901Var3.i.c("Fetching Google App Id failed with exception. appId", k901.r(packageName), e);
                                w701Var2.l = null;
                                kwz0 kwz0Var32 = mb01Var3.h;
                                mb01 mb01Var42 = (mb01) kwz0Var32.b;
                                exc0.f("analytics.safelisted_events");
                                r = kwz0Var32.r();
                                if (r == null) {
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                asList = null;
                                if (asList != null) {
                                }
                                w701Var2.l = asList;
                                if (packageManager == null) {
                                }
                                mb01Var3.a();
                                w701Var2.e = true;
                                mb01.k(k901Var);
                                i901 i901Var2 = k901Var.o;
                                kwz0Var.p();
                                i901Var2.b(74029L, "App measurement initialized, version");
                                mb01.k(k901Var);
                                i901Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                String o2 = w701Var.o();
                                if (TextUtils.isEmpty(mb01Var.c)) {
                                }
                                mb01.k(k901Var);
                                k901Var.p.a("Debug-level message logging enabled");
                                if (mb01Var.F != atomicInteger.get()) {
                                }
                                mb01Var.y = true;
                                zzcl zzclVar2 = id01Var.g;
                                Context context32 = mb01Var.b;
                                long j22 = mb01Var.H;
                                bf01 bf01Var2 = mb01Var.q;
                                mb01.k(kb01Var);
                                kb01Var.k();
                                mb01.i(x901Var);
                                x901 x901Var42 = x901Var;
                                w901 w901Var3 = x901Var42.w;
                                w901 w901Var22 = x901Var42.i;
                                u901Var = x901Var42.h;
                                xwz0 p2 = x901Var42.p();
                                x901Var42.k();
                                int i32 = x901Var42.o().getInt("consent_source", 100);
                                kwz0 kwz0Var42 = kwz0Var;
                                Object obj2 = kwz0Var42.b;
                                s = kwz0Var42.s("google_analytics_default_allow_ad_storage");
                                s2 = kwz0Var42.s("google_analytics_default_allow_analytics_storage");
                                if (s == null) {
                                }
                                xwz0Var = new xwz0(s, s2);
                                i2 = -10;
                                if (xwz0Var == null) {
                                }
                                mb01.j(bf01Var2);
                                bf01Var2.y(xwz0Var2);
                                if (u901Var.a() == j) {
                                }
                                mb01.j(bf01Var2);
                                op01Var = bf01Var2.q;
                                if (op01Var.b()) {
                                }
                                if (!mb01Var.h()) {
                                }
                                x901Var42.p.a(true);
                                return;
                            }
                        } else {
                            str3 = "admob_app_id";
                        }
                        if (l == 0) {
                            mb01.k(k901Var3);
                            k901Var3.q.c("App measurement enabled for app package, google app id", w701Var2.f, TextUtils.isEmpty(w701Var2.o) ? w701Var2.p : w701Var2.o);
                        }
                        w701Var2.l = null;
                        kwz0 kwz0Var322 = mb01Var3.h;
                        mb01 mb01Var422 = (mb01) kwz0Var322.b;
                        exc0.f("analytics.safelisted_events");
                        r = kwz0Var322.r();
                        if (r == null) {
                            k901 k901Var4 = mb01Var422.j;
                            mb01.k(k901Var4);
                            k901Var4.i.a("Failed to load metadata: Metadata bundle is null");
                        } else if (r.containsKey("analytics.safelisted_events")) {
                            valueOf = Integer.valueOf(r.getInt("analytics.safelisted_events"));
                            if (valueOf != null) {
                                try {
                                    stringArray = mb01Var422.b.getResources().getStringArray(valueOf.intValue());
                                } catch (Resources.NotFoundException e2) {
                                    k901 k901Var5 = mb01Var422.j;
                                    mb01.k(k901Var5);
                                    k901Var5.i.b(e2, "Failed to load string array from metadata: resource not found");
                                }
                                if (stringArray != null) {
                                    asList = Arrays.asList(stringArray);
                                    if (asList != null) {
                                        if (asList.isEmpty()) {
                                            mb01.k(k901Var3);
                                            k901Var3.n.a("Safelisted event list is empty. Ignoring");
                                        } else {
                                            for (String str11 : asList) {
                                                sk01 sk01Var2 = mb01Var3.m;
                                                mb01.i(sk01Var2);
                                                if (!sk01Var2.O("safelisted event", str11)) {
                                                }
                                            }
                                        }
                                        if (packageManager == null) {
                                            w701Var2.n = q6x.v(context2) ? 1 : 0;
                                        } else {
                                            w701Var2.n = 0;
                                        }
                                        mb01Var3.a();
                                        w701Var2.e = true;
                                        mb01.k(k901Var);
                                        i901 i901Var22 = k901Var.o;
                                        kwz0Var.p();
                                        i901Var22.b(74029L, "App measurement initialized, version");
                                        mb01.k(k901Var);
                                        i901Var22.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                        String o22 = w701Var.o();
                                        if (TextUtils.isEmpty(mb01Var.c)) {
                                            if (TextUtils.isEmpty(o22) ? false : mb01Var2.h.l("debug.firebase.analytics.app").equals(o22)) {
                                                mb01.k(k901Var);
                                                i901Var22.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                            } else {
                                                mb01.k(k901Var);
                                                i901Var22.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(o22)));
                                            }
                                        }
                                        mb01.k(k901Var);
                                        k901Var.p.a("Debug-level message logging enabled");
                                        if (mb01Var.F != atomicInteger.get()) {
                                            mb01.k(k901Var);
                                            k901Var.i.c("Not all components initialized", Integer.valueOf(mb01Var.F), Integer.valueOf(atomicInteger.get()));
                                        }
                                        mb01Var.y = true;
                                        zzcl zzclVar22 = id01Var.g;
                                        Context context322 = mb01Var.b;
                                        long j222 = mb01Var.H;
                                        bf01 bf01Var22 = mb01Var.q;
                                        mb01.k(kb01Var);
                                        kb01Var.k();
                                        mb01.i(x901Var);
                                        x901 x901Var422 = x901Var;
                                        w901 w901Var32 = x901Var422.w;
                                        w901 w901Var222 = x901Var422.i;
                                        u901Var = x901Var422.h;
                                        xwz0 p22 = x901Var422.p();
                                        x901Var422.k();
                                        int i322 = x901Var422.o().getInt("consent_source", 100);
                                        kwz0 kwz0Var422 = kwz0Var;
                                        Object obj22 = kwz0Var422.b;
                                        s = kwz0Var422.s("google_analytics_default_allow_ad_storage");
                                        s2 = kwz0Var422.s("google_analytics_default_allow_analytics_storage");
                                        if ((s == null || s2 != null) && x901Var422.s(-10)) {
                                            xwz0Var = new xwz0(s, s2);
                                            i2 = -10;
                                        } else {
                                            if (!TextUtils.isEmpty(mb01Var.o().p()) && (i322 == 0 || i322 == 30 || i322 == 10 || i322 == 30 || i322 == 30 || i322 == 40)) {
                                                mb01.j(bf01Var22);
                                                bf01Var22.x(xwz0.b, -10, j222);
                                            } else if (TextUtils.isEmpty(mb01Var.o().p()) && zzclVar22 != null && zzclVar22.zzg != null && x901Var422.s(30)) {
                                                xwz0Var = xwz0.a(zzclVar22.zzg);
                                                if (!xwz0Var.equals(xwz0.b)) {
                                                    i2 = 30;
                                                }
                                            }
                                            xwz0Var = null;
                                            i2 = 100;
                                        }
                                        if (xwz0Var == null) {
                                            mb01.j(bf01Var22);
                                            bf01Var22.x(xwz0Var, i2, j222);
                                            xwz0Var2 = xwz0Var;
                                        } else {
                                            xwz0Var2 = p22;
                                        }
                                        mb01.j(bf01Var22);
                                        bf01Var22.y(xwz0Var2);
                                        if (u901Var.a() == j) {
                                            mb01.k(k901Var);
                                            k901Var.q.b(Long.valueOf(j222), "Persisting first open");
                                            u901Var.b(j222);
                                        }
                                        mb01.j(bf01Var22);
                                        op01Var = bf01Var22.q;
                                        if (op01Var.b() && op01Var.c()) {
                                            x901 x901Var5 = op01Var.a.i;
                                            mb01.i(x901Var5);
                                            x901Var5.x.b(null);
                                        }
                                        if (!mb01Var.h()) {
                                            if (TextUtils.isEmpty(mb01Var.o().p())) {
                                                w701 o3 = mb01Var.o();
                                                o3.l();
                                                if (TextUtils.isEmpty(o3.p)) {
                                                    x901Var2 = x901Var422;
                                                    if (!x901Var2.p().f(zzah.ANALYTICS_STORAGE)) {
                                                        w901Var222.b(null);
                                                    }
                                                    mb01.j(bf01Var22);
                                                    bf01Var22.j.set(w901Var222.a());
                                                    zznw.zzc();
                                                    if (kwz0Var422.t(null, s701.c0)) {
                                                        mb01.i(sk01Var);
                                                        try {
                                                            ((mb01) sk01Var.b).b.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                        } catch (ClassNotFoundException unused5) {
                                                            if (!TextUtils.isEmpty(w901Var32.a())) {
                                                                mb01.k(k901Var);
                                                                k901Var.l.a("Remote config removed with active feature rollouts");
                                                                w901Var32.b(null);
                                                            }
                                                        }
                                                    }
                                                    if (TextUtils.isEmpty(mb01Var.o().p())) {
                                                        w701 o4 = mb01Var.o();
                                                        o4.l();
                                                        if (TextUtils.isEmpty(o4.p)) {
                                                            x901Var422 = x901Var2;
                                                        }
                                                    }
                                                    b = mb01Var.b();
                                                    x901Var422 = x901Var2;
                                                    sharedPreferences = x901Var422.f;
                                                    if (!(sharedPreferences != null ? false : sharedPreferences.contains("deferred_analytics_collection")) && !kwz0Var422.w()) {
                                                        x901Var422.q(!b);
                                                    }
                                                    if (b) {
                                                        mb01.j(bf01Var22);
                                                        bf01Var22.G();
                                                    }
                                                    fj01 fj01Var = mb01Var.l;
                                                    mb01.j(fj01Var);
                                                    fj01Var.g.a();
                                                    mb01Var.s().B(new AtomicReference());
                                                    yh01 s3 = mb01Var.s();
                                                    Bundle a = x901Var422.z.a();
                                                    s3.k();
                                                    s3.l();
                                                    s3.w(new og01(s3, s3.t(false), a));
                                                }
                                            }
                                            mb01.i(sk01Var);
                                            String p3 = mb01Var.o().p();
                                            x901Var422.k();
                                            String string2 = x901Var422.o().getString("gmp_app_id", null);
                                            w701 o5 = mb01Var.o();
                                            o5.l();
                                            String str12 = o5.p;
                                            x901Var422.k();
                                            x901Var2 = x901Var422;
                                            if (sk01.W(p3, string2, str12, x901Var2.o().getString(str3, null))) {
                                                mb01.k(k901Var);
                                                k901Var.o.a("Rechecking which service to use due to a GMP App Id change");
                                                x901Var2.k();
                                                x901Var2.k();
                                                Boolean valueOf2 = x901Var2.o().contains("measurement_enabled") ? Boolean.valueOf(x901Var2.o().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor edit2 = x901Var2.o().edit();
                                                edit2.clear();
                                                edit2.apply();
                                                if (valueOf2 != null) {
                                                    x901Var2.k();
                                                    SharedPreferences.Editor edit3 = x901Var2.o().edit();
                                                    edit3.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                    edit3.apply();
                                                }
                                                mb01Var.p().p();
                                                mb01Var.v.A();
                                                mb01Var.v.z();
                                                u901Var.b(j222);
                                                w901Var222.b(null);
                                            }
                                            String p4 = mb01Var.o().p();
                                            x901Var2.k();
                                            SharedPreferences.Editor edit4 = x901Var2.o().edit();
                                            edit4.putString("gmp_app_id", p4);
                                            edit4.apply();
                                            w701 o6 = mb01Var.o();
                                            o6.l();
                                            String str13 = o6.p;
                                            x901Var2.k();
                                            SharedPreferences.Editor edit5 = x901Var2.o().edit();
                                            edit5.putString(str3, str13);
                                            edit5.apply();
                                            if (!x901Var2.p().f(zzah.ANALYTICS_STORAGE)) {
                                            }
                                            mb01.j(bf01Var22);
                                            bf01Var22.j.set(w901Var222.a());
                                            zznw.zzc();
                                            if (kwz0Var422.t(null, s701.c0)) {
                                            }
                                            if (TextUtils.isEmpty(mb01Var.o().p())) {
                                            }
                                            b = mb01Var.b();
                                            x901Var422 = x901Var2;
                                            sharedPreferences = x901Var422.f;
                                            if (!(sharedPreferences != null ? false : sharedPreferences.contains("deferred_analytics_collection"))) {
                                                x901Var422.q(!b);
                                            }
                                            if (b) {
                                            }
                                            fj01 fj01Var2 = mb01Var.l;
                                            mb01.j(fj01Var2);
                                            fj01Var2.g.a();
                                            mb01Var.s().B(new AtomicReference());
                                            yh01 s32 = mb01Var.s();
                                            Bundle a2 = x901Var422.z.a();
                                            s32.k();
                                            s32.l();
                                            s32.w(new og01(s32, s32.t(false), a2));
                                        } else if (mb01Var.b()) {
                                            mb01.i(sk01Var);
                                            if (!sk01Var.Q("android.permission.INTERNET")) {
                                                mb01.k(k901Var);
                                                k901Var.i.a("App is missing INTERNET permission");
                                            }
                                            if (!sk01Var.Q("android.permission.ACCESS_NETWORK_STATE")) {
                                                mb01.k(k901Var);
                                                k901Var.i.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            if (!xzx0.a(context322).c() && !kwz0Var422.y()) {
                                                if (!sk01.V(context322)) {
                                                    mb01.k(k901Var);
                                                    k901Var.i.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                try {
                                                    packageManager2 = context322.getPackageManager();
                                                } catch (PackageManager.NameNotFoundException unused6) {
                                                }
                                                if (packageManager2 != null && (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context322, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                                                    if (serviceInfo.enabled) {
                                                        z2 = true;
                                                        if (!z2) {
                                                            mb01.k(k901Var);
                                                            k901Var.i.a("AppMeasurementService not registered/enabled");
                                                        }
                                                    }
                                                }
                                                z2 = false;
                                                if (!z2) {
                                                }
                                            }
                                            mb01.k(k901Var);
                                            k901Var.i.a("Uploading is not possible. App measurement disabled");
                                        }
                                        x901Var422.p.a(true);
                                        return;
                                    }
                                    w701Var2.l = asList;
                                    if (packageManager == null) {
                                    }
                                    mb01Var3.a();
                                    w701Var2.e = true;
                                    mb01.k(k901Var);
                                    i901 i901Var222 = k901Var.o;
                                    kwz0Var.p();
                                    i901Var222.b(74029L, "App measurement initialized, version");
                                    mb01.k(k901Var);
                                    i901Var222.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    String o222 = w701Var.o();
                                    if (TextUtils.isEmpty(mb01Var.c)) {
                                    }
                                    mb01.k(k901Var);
                                    k901Var.p.a("Debug-level message logging enabled");
                                    if (mb01Var.F != atomicInteger.get()) {
                                    }
                                    mb01Var.y = true;
                                    zzcl zzclVar222 = id01Var.g;
                                    Context context3222 = mb01Var.b;
                                    long j2222 = mb01Var.H;
                                    bf01 bf01Var222 = mb01Var.q;
                                    mb01.k(kb01Var);
                                    kb01Var.k();
                                    mb01.i(x901Var);
                                    x901 x901Var4222 = x901Var;
                                    w901 w901Var322 = x901Var4222.w;
                                    w901 w901Var2222 = x901Var4222.i;
                                    u901Var = x901Var4222.h;
                                    xwz0 p222 = x901Var4222.p();
                                    x901Var4222.k();
                                    int i3222 = x901Var4222.o().getInt("consent_source", 100);
                                    kwz0 kwz0Var4222 = kwz0Var;
                                    Object obj222 = kwz0Var4222.b;
                                    s = kwz0Var4222.s("google_analytics_default_allow_ad_storage");
                                    s2 = kwz0Var4222.s("google_analytics_default_allow_analytics_storage");
                                    if (s == null) {
                                    }
                                    xwz0Var = new xwz0(s, s2);
                                    i2 = -10;
                                    if (xwz0Var == null) {
                                    }
                                    mb01.j(bf01Var222);
                                    bf01Var222.y(xwz0Var2);
                                    if (u901Var.a() == j) {
                                    }
                                    mb01.j(bf01Var222);
                                    op01Var = bf01Var222.q;
                                    if (op01Var.b()) {
                                        x901 x901Var52 = op01Var.a.i;
                                        mb01.i(x901Var52);
                                        x901Var52.x.b(null);
                                    }
                                    if (!mb01Var.h()) {
                                    }
                                    x901Var4222.p.a(true);
                                    return;
                                }
                            }
                            asList = null;
                            if (asList != null) {
                            }
                            w701Var2.l = asList;
                            if (packageManager == null) {
                            }
                            mb01Var3.a();
                            w701Var2.e = true;
                            mb01.k(k901Var);
                            i901 i901Var2222 = k901Var.o;
                            kwz0Var.p();
                            i901Var2222.b(74029L, "App measurement initialized, version");
                            mb01.k(k901Var);
                            i901Var2222.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            String o2222 = w701Var.o();
                            if (TextUtils.isEmpty(mb01Var.c)) {
                            }
                            mb01.k(k901Var);
                            k901Var.p.a("Debug-level message logging enabled");
                            if (mb01Var.F != atomicInteger.get()) {
                            }
                            mb01Var.y = true;
                            zzcl zzclVar2222 = id01Var.g;
                            Context context32222 = mb01Var.b;
                            long j22222 = mb01Var.H;
                            bf01 bf01Var2222 = mb01Var.q;
                            mb01.k(kb01Var);
                            kb01Var.k();
                            mb01.i(x901Var);
                            x901 x901Var42222 = x901Var;
                            w901 w901Var3222 = x901Var42222.w;
                            w901 w901Var22222 = x901Var42222.i;
                            u901Var = x901Var42222.h;
                            xwz0 p2222 = x901Var42222.p();
                            x901Var42222.k();
                            int i32222 = x901Var42222.o().getInt("consent_source", 100);
                            kwz0 kwz0Var42222 = kwz0Var;
                            Object obj2222 = kwz0Var42222.b;
                            s = kwz0Var42222.s("google_analytics_default_allow_ad_storage");
                            s2 = kwz0Var42222.s("google_analytics_default_allow_analytics_storage");
                            if (s == null) {
                            }
                            xwz0Var = new xwz0(s, s2);
                            i2 = -10;
                            if (xwz0Var == null) {
                            }
                            mb01.j(bf01Var2222);
                            bf01Var2222.y(xwz0Var2);
                            if (u901Var.a() == j) {
                            }
                            mb01.j(bf01Var2222);
                            op01Var = bf01Var2222.q;
                            if (op01Var.b()) {
                            }
                            if (!mb01Var.h()) {
                            }
                            x901Var42222.p.a(true);
                            return;
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        asList = null;
                        if (asList != null) {
                        }
                        w701Var2.l = asList;
                        if (packageManager == null) {
                        }
                        mb01Var3.a();
                        w701Var2.e = true;
                        mb01.k(k901Var);
                        i901 i901Var22222 = k901Var.o;
                        kwz0Var.p();
                        i901Var22222.b(74029L, "App measurement initialized, version");
                        mb01.k(k901Var);
                        i901Var22222.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        String o22222 = w701Var.o();
                        if (TextUtils.isEmpty(mb01Var.c)) {
                        }
                        mb01.k(k901Var);
                        k901Var.p.a("Debug-level message logging enabled");
                        if (mb01Var.F != atomicInteger.get()) {
                        }
                        mb01Var.y = true;
                        zzcl zzclVar22222 = id01Var.g;
                        Context context322222 = mb01Var.b;
                        long j222222 = mb01Var.H;
                        bf01 bf01Var22222 = mb01Var.q;
                        mb01.k(kb01Var);
                        kb01Var.k();
                        mb01.i(x901Var);
                        x901 x901Var422222 = x901Var;
                        w901 w901Var32222 = x901Var422222.w;
                        w901 w901Var222222 = x901Var422222.i;
                        u901Var = x901Var422222.h;
                        xwz0 p22222 = x901Var422222.p();
                        x901Var422222.k();
                        int i322222 = x901Var422222.o().getInt("consent_source", 100);
                        kwz0 kwz0Var422222 = kwz0Var;
                        Object obj22222 = kwz0Var422222.b;
                        s = kwz0Var422222.s("google_analytics_default_allow_ad_storage");
                        s2 = kwz0Var422222.s("google_analytics_default_allow_analytics_storage");
                        if (s == null) {
                        }
                        xwz0Var = new xwz0(s, s2);
                        i2 = -10;
                        if (xwz0Var == null) {
                        }
                        mb01.j(bf01Var22222);
                        bf01Var22222.y(xwz0Var2);
                        if (u901Var.a() == j) {
                        }
                        mb01.j(bf01Var22222);
                        op01Var = bf01Var22222.q;
                        if (op01Var.b()) {
                        }
                        if (!mb01Var.h()) {
                        }
                        x901Var422222.p.a(true);
                        return;
                    }
                    str6 = str8;
                    packageInfo = packageManager3.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo == null) {
                    }
                    packageManager = packageManager3;
                    str = str6;
                    str2 = str7;
                    w701Var2.f = packageName;
                    w701Var2.i = str;
                    w701Var2.g = str2;
                    w701Var2.h = i;
                    w701Var2.j = 0L;
                    if (TextUtils.isEmpty(str5)) {
                    }
                    l = mb01Var3.l();
                    switch (l) {
                    }
                    w701Var2.o = "";
                    w701Var2.p = "";
                    if (z) {
                    }
                    d = bbq.d(context2, str4);
                    w701Var2.o = true != TextUtils.isEmpty(d) ? d : "";
                    if (TextUtils.isEmpty(d)) {
                    }
                    if (l == 0) {
                    }
                    w701Var2.l = null;
                    kwz0 kwz0Var3222 = mb01Var3.h;
                    mb01 mb01Var4222 = (mb01) kwz0Var3222.b;
                    exc0.f("analytics.safelisted_events");
                    r = kwz0Var3222.r();
                    if (r == null) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    asList = null;
                    if (asList != null) {
                    }
                    w701Var2.l = asList;
                    if (packageManager == null) {
                    }
                    mb01Var3.a();
                    w701Var2.e = true;
                    mb01.k(k901Var);
                    i901 i901Var222222 = k901Var.o;
                    kwz0Var.p();
                    i901Var222222.b(74029L, "App measurement initialized, version");
                    mb01.k(k901Var);
                    i901Var222222.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    String o222222 = w701Var.o();
                    if (TextUtils.isEmpty(mb01Var.c)) {
                    }
                    mb01.k(k901Var);
                    k901Var.p.a("Debug-level message logging enabled");
                    if (mb01Var.F != atomicInteger.get()) {
                    }
                    mb01Var.y = true;
                    zzcl zzclVar222222 = id01Var.g;
                    Context context3222222 = mb01Var.b;
                    long j2222222 = mb01Var.H;
                    bf01 bf01Var222222 = mb01Var.q;
                    mb01.k(kb01Var);
                    kb01Var.k();
                    mb01.i(x901Var);
                    x901 x901Var4222222 = x901Var;
                    w901 w901Var322222 = x901Var4222222.w;
                    w901 w901Var2222222 = x901Var4222222.i;
                    u901Var = x901Var4222222.h;
                    xwz0 p222222 = x901Var4222222.p();
                    x901Var4222222.k();
                    int i3222222 = x901Var4222222.o().getInt("consent_source", 100);
                    kwz0 kwz0Var4222222 = kwz0Var;
                    Object obj222222 = kwz0Var4222222.b;
                    s = kwz0Var4222222.s("google_analytics_default_allow_ad_storage");
                    s2 = kwz0Var4222222.s("google_analytics_default_allow_analytics_storage");
                    if (s == null) {
                    }
                    xwz0Var = new xwz0(s, s2);
                    i2 = -10;
                    if (xwz0Var == null) {
                    }
                    mb01.j(bf01Var222222);
                    bf01Var222222.y(xwz0Var2);
                    if (u901Var.a() == j) {
                    }
                    mb01.j(bf01Var222222);
                    op01Var = bf01Var222222.q;
                    if (op01Var.b()) {
                    }
                    if (!mb01Var.h()) {
                    }
                    x901Var4222222.p.a(true);
                    return;
                }
                mb01.k(k901Var3);
                kwz0Var = kwz0Var2;
                x901Var = x901Var3;
                k901Var3.i.b(k901.r(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                packageManager = packageManager3;
                str = str6;
                str2 = str7;
                i = Integer.MIN_VALUE;
                w701Var2.f = packageName;
                w701Var2.i = str;
                w701Var2.g = str2;
                w701Var2.h = i;
                w701Var2.j = 0L;
                if (TextUtils.isEmpty(str5)) {
                }
                l = mb01Var3.l();
                switch (l) {
                }
                w701Var2.o = "";
                w701Var2.p = "";
                if (z) {
                }
                d = bbq.d(context2, str4);
                w701Var2.o = true != TextUtils.isEmpty(d) ? d : "";
                if (TextUtils.isEmpty(d)) {
                }
                if (l == 0) {
                }
                w701Var2.l = null;
                kwz0 kwz0Var32222 = mb01Var3.h;
                mb01 mb01Var42222 = (mb01) kwz0Var32222.b;
                exc0.f("analytics.safelisted_events");
                r = kwz0Var32222.r();
                if (r == null) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                asList = null;
                if (asList != null) {
                }
                w701Var2.l = asList;
                if (packageManager == null) {
                }
                mb01Var3.a();
                w701Var2.e = true;
                mb01.k(k901Var);
                i901 i901Var2222222 = k901Var.o;
                kwz0Var.p();
                i901Var2222222.b(74029L, "App measurement initialized, version");
                mb01.k(k901Var);
                i901Var2222222.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                String o2222222 = w701Var.o();
                if (TextUtils.isEmpty(mb01Var.c)) {
                }
                mb01.k(k901Var);
                k901Var.p.a("Debug-level message logging enabled");
                if (mb01Var.F != atomicInteger.get()) {
                }
                mb01Var.y = true;
                zzcl zzclVar2222222 = id01Var.g;
                Context context32222222 = mb01Var.b;
                long j22222222 = mb01Var.H;
                bf01 bf01Var2222222 = mb01Var.q;
                mb01.k(kb01Var);
                kb01Var.k();
                mb01.i(x901Var);
                x901 x901Var42222222 = x901Var;
                w901 w901Var3222222 = x901Var42222222.w;
                w901 w901Var22222222 = x901Var42222222.i;
                u901Var = x901Var42222222.h;
                xwz0 p2222222 = x901Var42222222.p();
                x901Var42222222.k();
                int i32222222 = x901Var42222222.o().getInt("consent_source", 100);
                kwz0 kwz0Var42222222 = kwz0Var;
                Object obj2222222 = kwz0Var42222222.b;
                s = kwz0Var42222222.s("google_analytics_default_allow_ad_storage");
                s2 = kwz0Var42222222.s("google_analytics_default_allow_analytics_storage");
                if (s == null) {
                }
                xwz0Var = new xwz0(s, s2);
                i2 = -10;
                if (xwz0Var == null) {
                }
                mb01.j(bf01Var2222222);
                bf01Var2222222.y(xwz0Var2);
                if (u901Var.a() == j) {
                }
                mb01.j(bf01Var2222222);
                op01Var = bf01Var2222222.q;
                if (op01Var.b()) {
                }
                if (!mb01Var.h()) {
                }
                x901Var42222222.p.a(true);
                return;
            default:
                com.google.android.gms.measurement.internal.zzq zzqVar = (com.google.android.gms.measurement.internal.zzq) this.c;
                yh01 yh01Var2 = (yh01) this.d;
                mb01 mb01Var5 = (mb01) yh01Var2.b;
                v701 v701Var = yh01Var2.g;
                if (v701Var == null) {
                    k901 k901Var6 = mb01Var5.j;
                    mb01.k(k901Var6);
                    k901Var6.i.a("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        v701Var.I0(zzqVar);
                    } catch (RemoteException e3) {
                        k901 k901Var7 = mb01Var5.j;
                        mb01.k(k901Var7);
                        k901Var7.i.b(e3, "Failed to reset data on the service: remote exception");
                    }
                    yh01Var2.v();
                    return;
                }
        }
    }
}
