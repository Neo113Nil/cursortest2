package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzr;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class fz91 extends vw91 {
    public String A;
    public long B;
    public final long C;
    public final long D;
    public List E;
    public String F;
    public int G;
    public String H;
    public String I;
    public long J;
    public String K;
    public String w;
    public String x;
    public int y;
    public String z;

    public fz91(g gVar, long j, long j2) {
        super(gVar);
        this.J = 0L;
        this.K = null;
        this.C = j;
        this.D = j2;
    }

    @Override // defpackage.vw91
    public final boolean Jg() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzr Kg(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean z2;
        String str3;
        Class<?> loadClass;
        long a;
        boolean z3;
        String str4;
        g gVar;
        boolean z4;
        int i;
        int i2;
        long j3;
        ApplicationInfo b;
        gw91 gw91Var;
        long j4;
        int i3;
        int extensionVersion;
        Gg();
        String Mg = Mg();
        String Ng = Ng();
        Hg();
        String str5 = this.x;
        Hg();
        long j5 = this.y;
        Hg();
        cvw.l(this.z);
        String str6 = this.z;
        g gVar2 = (g) this.b;
        j691 j691Var = gVar2.w;
        y1a1 y1a1Var = gVar2.y;
        j691 j691Var2 = gVar2.w;
        Context context = gVar2.a;
        ieb1 ieb1Var = gVar2.B;
        o5a1 o5a1Var = gVar2.x;
        j691Var.Lg();
        Hg();
        Gg();
        long j6 = this.B;
        long j7 = 0;
        if (j6 == 0) {
            g.e(ieb1Var);
            g gVar3 = (g) ieb1Var.b;
            String packageName = context.getPackageName();
            ieb1Var.Gg();
            cvw.i(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest Xg = ieb1.Xg();
            long j8 = -1;
            if (Xg == null) {
                y1a1 y1a1Var2 = gVar3.y;
                g.g(y1a1Var2);
                y1a1Var2.z.a("Could not get MD5 instance");
                str2 = str5;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (ieb1Var.ih(context, packageName)) {
                            str2 = str5;
                            j = j5;
                            j8 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = nb51.a(context).c(64, gVar3.a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        y1a1 y1a1Var3 = gVar3.y;
                                        g.g(y1a1Var3);
                                        y1a1Var3.C.a("Could not get signatures");
                                    } else {
                                        j8 = ieb1.Yg(Xg.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    y1a1 y1a1Var4 = gVar3.y;
                                    g.g(y1a1Var4);
                                    y1a1Var4.z.b(e, "Package name not found");
                                    j2 = 0;
                                    this.B = j2;
                                    boolean a2 = gVar2.a();
                                    g.e(o5a1Var);
                                    boolean z5 = !o5a1Var.L;
                                    Gg();
                                    if (gVar2.a()) {
                                    }
                                    z2 = a2;
                                    str3 = null;
                                    g.e(o5a1Var);
                                    a = o5a1Var.z.a();
                                    long j9 = j2;
                                    long j10 = gVar2.W;
                                    if (a != 0) {
                                    }
                                    Hg();
                                    int i4 = this.G;
                                    Boolean Sg = j691Var2.Sg("google_analytics_adid_collection_enabled");
                                    if (Sg != null) {
                                    }
                                    g.e(o5a1Var);
                                    o5a1Var.Gg();
                                    long j11 = j10;
                                    boolean z6 = o5a1Var.Kg().getBoolean("deferred_analytics_collection", z);
                                    Boolean valueOf = Boolean.valueOf(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                                    List list = this.E;
                                    String g = o5a1Var.Ng().g();
                                    if (this.F == null) {
                                    }
                                    String str7 = this.F;
                                    if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean Sg2 = j691Var2.Sg("google_analytics_sgtm_upload_enabled");
                                    if (Sg2 == null) {
                                    }
                                    g.e(ieb1Var);
                                    gVar = (g) ieb1Var.b;
                                    String str8 = str4;
                                    String Mg2 = Mg();
                                    boolean z7 = r3;
                                    if (gVar.a.getPackageManager() == null) {
                                    }
                                    g.e(o5a1Var);
                                    int i5 = o5a1Var.Ng().b;
                                    g.e(o5a1Var);
                                    o5a1Var.Gg();
                                    String str9 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).b;
                                    eib1.a();
                                    gw91Var = nw91.Q0;
                                    if (j691Var2.Qg(null, gw91Var)) {
                                    }
                                    i3 = 0;
                                    eib1.a();
                                    if (j691Var2.Qg(null, gw91Var)) {
                                    }
                                    String str10 = j691Var2.w;
                                    String valueOf2 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j12 = gVar2.W;
                                    g.d(gVar2.N);
                                    return new zzr(Mg, Ng, str2, j, str6, 133005L, j9, str, z2, z3, str3, j11, i4, z4, z6, valueOf, this.C, list, g, str7, str8, z7, j4, i5, str9, i3, j7, str10, valueOf2, j12, gVar2.N.Lg().zza());
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                y1a1 y1a1Var42 = gVar3.y;
                                g.g(y1a1Var42);
                                y1a1Var42.z.b(e, "Package name not found");
                                j2 = 0;
                                this.B = j2;
                                boolean a22 = gVar2.a();
                                g.e(o5a1Var);
                                boolean z52 = !o5a1Var.L;
                                Gg();
                                if (gVar2.a()) {
                                }
                                z2 = a22;
                                str3 = null;
                                g.e(o5a1Var);
                                a = o5a1Var.z.a();
                                long j92 = j2;
                                long j102 = gVar2.W;
                                if (a != 0) {
                                }
                                Hg();
                                int i42 = this.G;
                                Boolean Sg3 = j691Var2.Sg("google_analytics_adid_collection_enabled");
                                if (Sg3 != null) {
                                }
                                g.e(o5a1Var);
                                o5a1Var.Gg();
                                long j112 = j102;
                                boolean z62 = o5a1Var.Kg().getBoolean("deferred_analytics_collection", z);
                                Boolean valueOf3 = Boolean.valueOf(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                                List list2 = this.E;
                                String g2 = o5a1Var.Ng().g();
                                if (this.F == null) {
                                }
                                String str72 = this.F;
                                if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                                }
                                Boolean Sg22 = j691Var2.Sg("google_analytics_sgtm_upload_enabled");
                                if (Sg22 == null) {
                                }
                                g.e(ieb1Var);
                                gVar = (g) ieb1Var.b;
                                String str82 = str4;
                                String Mg22 = Mg();
                                boolean z72 = r3;
                                if (gVar.a.getPackageManager() == null) {
                                }
                                g.e(o5a1Var);
                                int i52 = o5a1Var.Ng().b;
                                g.e(o5a1Var);
                                o5a1Var.Gg();
                                String str92 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).b;
                                eib1.a();
                                gw91Var = nw91.Q0;
                                if (j691Var2.Qg(null, gw91Var)) {
                                }
                                i3 = 0;
                                eib1.a();
                                if (j691Var2.Qg(null, gw91Var)) {
                                }
                                String str102 = j691Var2.w;
                                String valueOf22 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j122 = gVar2.W;
                                g.d(gVar2.N);
                                return new zzr(Mg, Ng, str2, j, str6, 133005L, j92, str, z2, z3, str3, j112, i42, z4, z62, valueOf3, this.C, list2, g2, str72, str82, z72, j4, i52, str92, i3, j7, str102, valueOf22, j122, gVar2.N.Lg().zza());
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j5;
                }
                j2 = 0;
                this.B = j2;
            }
            j2 = j8;
            this.B = j2;
        } else {
            str2 = str5;
            j = j5;
            z = false;
            j2 = j6;
        }
        boolean a222 = gVar2.a();
        g.e(o5a1Var);
        boolean z522 = !o5a1Var.L;
        Gg();
        if (gVar2.a()) {
            ((vlb1) plb1.b.a.get()).getClass();
            if (!j691Var2.Qg(null, nw91.H0)) {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    z2 = a222;
                    try {
                        Object[] objArr = {context};
                        str3 = null;
                        Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                        if (invoke != null) {
                            try {
                                str3 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                g.g(y1a1Var);
                                y1a1Var.E.a("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        g.g(y1a1Var);
                        y1a1Var.D.a("Failed to obtain Firebase Analytics instance");
                    }
                    g.e(o5a1Var);
                    a = o5a1Var.z.a();
                    long j922 = j2;
                    long j1022 = gVar2.W;
                    if (a != 0) {
                        j1022 = Math.min(j1022, a);
                    }
                    Hg();
                    int i422 = this.G;
                    Boolean Sg32 = j691Var2.Sg("google_analytics_adid_collection_enabled");
                    boolean z8 = (Sg32 != null || Sg32.booleanValue()) ? true : z;
                    g.e(o5a1Var);
                    o5a1Var.Gg();
                    long j1122 = j1022;
                    boolean z622 = o5a1Var.Kg().getBoolean("deferred_analytics_collection", z);
                    Boolean valueOf32 = Boolean.valueOf(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                    List list22 = this.E;
                    String g22 = o5a1Var.Ng().g();
                    if (this.F == null) {
                        g.e(ieb1Var);
                        this.F = ieb1Var.xh();
                    }
                    String str722 = this.F;
                    if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                        Gg();
                        if (this.J == 0) {
                            z3 = z522;
                        } else {
                            gVar2.D.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.J;
                            z3 = z522;
                            if (this.I != null && currentTimeMillis > 86400000 && this.K == null) {
                                Lg();
                            }
                        }
                        if (this.I == null) {
                            Lg();
                        }
                        str4 = this.I;
                    } else {
                        z3 = z522;
                        str4 = null;
                    }
                    Boolean Sg222 = j691Var2.Sg("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = Sg222 == null ? false : Sg222.booleanValue();
                    g.e(ieb1Var);
                    gVar = (g) ieb1Var.b;
                    String str822 = str4;
                    String Mg222 = Mg();
                    boolean z722 = booleanValue;
                    if (gVar.a.getPackageManager() == null) {
                        z4 = z8;
                        j3 = 0;
                    } else {
                        try {
                            z4 = z8;
                            i = 0;
                        } catch (PackageManager.NameNotFoundException unused4) {
                            z4 = z8;
                            i = 0;
                        }
                        try {
                            b = nb51.a(gVar.a).b(0, Mg222);
                        } catch (PackageManager.NameNotFoundException unused5) {
                            y1a1 y1a1Var5 = gVar.y;
                            g.g(y1a1Var5);
                            y1a1Var5.F.b(Mg222, "PackageManager failed to find running app: app_id");
                            i2 = i;
                            j3 = i2;
                            g.e(o5a1Var);
                            int i522 = o5a1Var.Ng().b;
                            g.e(o5a1Var);
                            o5a1Var.Gg();
                            String str922 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).b;
                            eib1.a();
                            gw91Var = nw91.Q0;
                            if (j691Var2.Qg(null, gw91Var)) {
                            }
                            i3 = 0;
                            eib1.a();
                            if (j691Var2.Qg(null, gw91Var)) {
                            }
                            String str1022 = j691Var2.w;
                            String valueOf222 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
                            long j1222 = gVar2.W;
                            g.d(gVar2.N);
                            return new zzr(Mg, Ng, str2, j, str6, 133005L, j922, str, z2, z3, str3, j1122, i422, z4, z622, valueOf32, this.C, list22, g22, str722, str822, z722, j4, i522, str922, i3, j7, str1022, valueOf222, j1222, gVar2.N.Lg().zza());
                        }
                        if (b != null) {
                            i2 = b.targetSdkVersion;
                            j3 = i2;
                        }
                        i2 = i;
                        j3 = i2;
                    }
                    g.e(o5a1Var);
                    int i5222 = o5a1Var.Ng().b;
                    g.e(o5a1Var);
                    o5a1Var.Gg();
                    String str9222 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).b;
                    eib1.a();
                    gw91Var = nw91.Q0;
                    if (j691Var2.Qg(null, gw91Var)) {
                        j4 = j3;
                    } else {
                        g.e(ieb1Var);
                        j4 = j3;
                        if (Build.VERSION.SDK_INT >= 30) {
                            extensionVersion = SdkExtensions.getExtensionVersion(30);
                            if (extensionVersion > 3) {
                                i3 = SdkExtensions.getExtensionVersion(1000000);
                                eib1.a();
                                if (j691Var2.Qg(null, gw91Var)) {
                                    g.e(ieb1Var);
                                    j7 = ieb1Var.ah();
                                }
                                String str10222 = j691Var2.w;
                                String valueOf2222 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j12222 = gVar2.W;
                                g.d(gVar2.N);
                                return new zzr(Mg, Ng, str2, j, str6, 133005L, j922, str, z2, z3, str3, j1122, i422, z4, z622, valueOf32, this.C, list22, g22, str722, str822, z722, j4, i5222, str9222, i3, j7, str10222, valueOf2222, j12222, gVar2.N.Lg().zza());
                            }
                        }
                    }
                    i3 = 0;
                    eib1.a();
                    if (j691Var2.Qg(null, gw91Var)) {
                    }
                    String str102222 = j691Var2.w;
                    String valueOf22222 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j122222 = gVar2.W;
                    g.d(gVar2.N);
                    return new zzr(Mg, Ng, str2, j, str6, 133005L, j922, str, z2, z3, str3, j1122, i422, z4, z622, valueOf32, this.C, list22, g22, str722, str822, z722, j4, i5222, str9222, i3, j7, str102222, valueOf22222, j122222, gVar2.N.Lg().zza());
                }
                z2 = a222;
                str3 = null;
                g.e(o5a1Var);
                a = o5a1Var.z.a();
                long j9222 = j2;
                long j10222 = gVar2.W;
                if (a != 0) {
                }
                Hg();
                int i4222 = this.G;
                Boolean Sg322 = j691Var2.Sg("google_analytics_adid_collection_enabled");
                if (Sg322 != null) {
                }
                g.e(o5a1Var);
                o5a1Var.Gg();
                long j11222 = j10222;
                boolean z6222 = o5a1Var.Kg().getBoolean("deferred_analytics_collection", z);
                Boolean valueOf322 = Boolean.valueOf(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                List list222 = this.E;
                String g222 = o5a1Var.Ng().g();
                if (this.F == null) {
                }
                String str7222 = this.F;
                if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                }
                Boolean Sg2222 = j691Var2.Sg("google_analytics_sgtm_upload_enabled");
                if (Sg2222 == null) {
                }
                g.e(ieb1Var);
                gVar = (g) ieb1Var.b;
                String str8222 = str4;
                String Mg2222 = Mg();
                boolean z7222 = booleanValue;
                if (gVar.a.getPackageManager() == null) {
                }
                g.e(o5a1Var);
                int i52222 = o5a1Var.Ng().b;
                g.e(o5a1Var);
                o5a1Var.Gg();
                String str92222 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).b;
                eib1.a();
                gw91Var = nw91.Q0;
                if (j691Var2.Qg(null, gw91Var)) {
                }
                i3 = 0;
                eib1.a();
                if (j691Var2.Qg(null, gw91Var)) {
                }
                String str1022222 = j691Var2.w;
                String valueOf222222 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
                long j1222222 = gVar2.W;
                g.d(gVar2.N);
                return new zzr(Mg, Ng, str2, j, str6, 133005L, j9222, str, z2, z3, str3, j11222, i4222, z4, z6222, valueOf322, this.C, list222, g222, str7222, str8222, z7222, j4, i52222, str92222, i3, j7, str1022222, valueOf222222, j1222222, gVar2.N.Lg().zza());
            }
            g.g(y1a1Var);
            y1a1Var.H.a("Disabled IID for tests.");
        }
        z2 = a222;
        str3 = null;
        g.e(o5a1Var);
        a = o5a1Var.z.a();
        long j92222 = j2;
        long j102222 = gVar2.W;
        if (a != 0) {
        }
        Hg();
        int i42222 = this.G;
        Boolean Sg3222 = j691Var2.Sg("google_analytics_adid_collection_enabled");
        if (Sg3222 != null) {
        }
        g.e(o5a1Var);
        o5a1Var.Gg();
        long j112222 = j102222;
        boolean z62222 = o5a1Var.Kg().getBoolean("deferred_analytics_collection", z);
        Boolean valueOf3222 = Boolean.valueOf(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
        List list2222 = this.E;
        String g2222 = o5a1Var.Ng().g();
        if (this.F == null) {
        }
        String str72222 = this.F;
        if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
        }
        Boolean Sg22222 = j691Var2.Sg("google_analytics_sgtm_upload_enabled");
        if (Sg22222 == null) {
        }
        g.e(ieb1Var);
        gVar = (g) ieb1Var.b;
        String str82222 = str4;
        String Mg22222 = Mg();
        boolean z72222 = booleanValue;
        if (gVar.a.getPackageManager() == null) {
        }
        g.e(o5a1Var);
        int i522222 = o5a1Var.Ng().b;
        g.e(o5a1Var);
        o5a1Var.Gg();
        String str922222 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).b;
        eib1.a();
        gw91Var = nw91.Q0;
        if (j691Var2.Qg(null, gw91Var)) {
        }
        i3 = 0;
        eib1.a();
        if (j691Var2.Qg(null, gw91Var)) {
        }
        String str10222222 = j691Var2.w;
        String valueOf2222222 = String.valueOf(wia1.h(j691Var2.Vg("google_analytics_default_allow_ad_personalization_signals", true)));
        long j12222222 = gVar2.W;
        g.d(gVar2.N);
        return new zzr(Mg, Ng, str2, j, str6, 133005L, j92222, str, z2, z3, str3, j112222, i42222, z4, z62222, valueOf3222, this.C, list2222, g2222, str72222, str82222, z72222, j4, i522222, str922222, i3, j7, str10222222, valueOf2222222, j12222222, gVar2.N.Lg().zza());
    }

    public final void Lg() {
        String format;
        Gg();
        g gVar = (g) this.b;
        o5a1 o5a1Var = gVar.x;
        y1a1 y1a1Var = gVar.y;
        g.e(o5a1Var);
        if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            ieb1 ieb1Var = gVar.B;
            g.e(ieb1Var);
            ieb1Var.Ch().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            g.g(y1a1Var);
            y1a1Var.G.a("Analytics Storage consent is not granted");
            format = null;
        }
        g.g(y1a1Var);
        y1a1Var.G.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.I = format;
        gVar.D.getClass();
        this.J = System.currentTimeMillis();
    }

    public final String Mg() {
        Hg();
        cvw.l(this.w);
        return this.w;
    }

    public final String Ng() {
        Gg();
        Hg();
        cvw.l(this.H);
        return this.H;
    }
}
