package com.yandex.passport.internal.report.reporters;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.verify.domain.DomainVerificationManager;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.AdjustConfig;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.PassportLocation;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.w1;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.properties.UpdateableProperties;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.a82;
import defpackage.cvu0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.lxj;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class o0 extends l3 {
    public static final m0 C = new m0(0.0f, 3, 0);
    public final com.yandex.passport.internal.features.a A;
    public final com.yandex.passport.internal.network.mappers.h B;
    public final Context b;
    public final com.yandex.passport.internal.core.accounts.j c;
    public final com.yandex.passport.internal.core.accounts.d w;
    public final com.yandex.passport.internal.push.a0 x;
    public final com.yandex.passport.data.network.core.o y;
    public final com.yandex.passport.internal.network.l z;

    public o0(Context context, com.yandex.passport.internal.core.accounts.j jVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.push.a0 a0Var, com.yandex.passport.data.network.core.o oVar, com.yandex.passport.internal.network.l lVar, com.yandex.passport.internal.report.j jVar2, com.yandex.passport.internal.features.a aVar, com.yandex.passport.internal.network.mappers.h hVar) {
        super(jVar2);
        this.b = context;
        this.c = jVar;
        this.w = dVar;
        this.x = a0Var;
        this.y = oVar;
        this.z = lVar;
        this.A = aVar;
        this.B = hVar;
    }

    public static Map k(com.yandex.passport.internal.network.f fVar) {
        return kotlin.collections.b.i(new Pair("url_source", fVar.b.getSource()), new Pair("url", fVar.a));
    }

    public static HashMap u(k0 k0Var) {
        return kotlin.collections.b.h(new Pair("type", String.valueOf(k0Var.h())), new Pair(WebViewActivity.KEY_ENVIRONMENT, String.valueOf(k0Var.a())), new Pair("has_user_info", String.valueOf(k0Var.e())), new Pair("locationId", String.valueOf(k0Var.f())), new Pair("has_stash", String.valueOf(k0Var.b())), new Pair("has_token", String.valueOf(k0Var.c())), new Pair("has_tombstone", String.valueOf(k0Var.d())), new Pair("stash_keys", k0Var.g()));
    }

    public static HashMap v(l0 l0Var) {
        return kotlin.collections.b.h(new Pair("version", l0Var.b), new Pair("am_manifest_version", l0Var.c.toString()), new Pair("signature_info", l0Var.d));
    }

    public static LinkedHashMap w(p2 p2Var) {
        Set<Map.Entry> entrySet = p2Var.getOverrides().entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            Pair pair = (Pair) entry.getKey();
            Pair pair2 = new Pair((pair.c() + Extension.FIX_SPACE + pair.f()).toLowerCase(Locale.ROOT), (String) entry.getValue());
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.A;
        return ((Boolean) aVar.t.getValue(aVar, com.yandex.passport.internal.features.a.J[16])).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r5 = r8.getHostToStateMap();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap j() {
        Map hostToStateMap;
        String[] strArr = {"passport.yango.com", "am.applink.pay.yandex.ru", "passport.yandex.ru", "am.applink.sandbox.pay.yandex.ru", "passport.yandex-team.ru", "passport-rc.yandex.ru"};
        DomainVerificationUserState o = o();
        int d = gw00.d(6);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            Integer num = (o == null || hostToStateMap == null) ? null : (Integer) hostToStateMap.get(str);
            linkedHashMap.put(str, (num != null && num.intValue() == 0) ? "state_none" : (num != null && num.intValue() == 1) ? "state_selected" : (num != null && num.intValue() == 2) ? "state_verified" : "state_unknown");
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x009e -> B:10:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        PassportInitReporter$getAccountsFromSystem$1 passportInitReporter$getAccountsFromSystem$1;
        int i;
        Iterator it;
        List list;
        com.yandex.passport.internal.b bVar;
        MasterToken masterToken;
        int i2;
        k0 k0Var;
        o0 o0Var = this;
        if (continuationImpl instanceof PassportInitReporter$getAccountsFromSystem$1) {
            passportInitReporter$getAccountsFromSystem$1 = (PassportInitReporter$getAccountsFromSystem$1) continuationImpl;
            int i3 = passportInitReporter$getAccountsFromSystem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                passportInitReporter$getAccountsFromSystem$1.label = i3 - Integer.MIN_VALUE;
                Object obj = passportInitReporter$getAccountsFromSystem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportInitReporter$getAccountsFromSystem$1.label;
                String str = null;
                int i4 = 1;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    com.yandex.passport.internal.b a = o0Var.w.a();
                    it = a.b().iterator();
                    list = t;
                    bVar = a;
                    while (it.hasNext()) {
                    }
                    return list;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ModernAccount modernAccount = (ModernAccount) passportInitReporter$getAccountsFromSystem$1.L$5;
                AccountRow a2 = (AccountRow) passportInitReporter$getAccountsFromSystem$1.L$4;
                it = (Iterator) passportInitReporter$getAccountsFromSystem$1.L$3;
                bVar = (com.yandex.passport.internal.b) passportInitReporter$getAccountsFromSystem$1.L$2;
                list = (List) passportInitReporter$getAccountsFromSystem$1.L$1;
                o0 o0Var2 = (o0) passportInitReporter$getAccountsFromSystem$1.L$0;
                kotlin.b.b(obj);
                boolean z = !((Boolean) obj).booleanValue();
                if (modernAccount == null) {
                    String valueOf = String.valueOf(modernAccount.getUid().getValue());
                    int primaryAliasType = modernAccount.getPrimaryAliasType();
                    o0Var2.getClass();
                    String format = primaryAliasType == i4 ? "portal" : primaryAliasType == 10 ? "phone" : primaryAliasType == 12 ? "mail" : primaryAliasType == 5 ? "lite" : primaryAliasType == 6 ? LegacyAccountType.STRING_SOCIAL : primaryAliasType != 7 ? String.format(Locale.US, "undefined [%d]", Arrays.copyOf(new Object[]{Integer.valueOf(primaryAliasType)}, i4)) : "pdd";
                    Environment environment = modernAccount.getUid().getEnvironment();
                    String format2 = environment != Environment.PRODUCTION ? environment != Environment.TESTING ? environment != Environment.RC ? com.yandex.passport.internal.ui.c.t(environment) ? LegacyAccountType.STRING_TEAM : String.format(Locale.US, "unknown [%s]", Arrays.copyOf(new Object[]{environment.toString()}, i4)) : "rc" : "testing" : AdjustConfig.ENVIRONMENT_PRODUCTION;
                    i2 = i4;
                    Long l = new Long(modernAccount.getLocationId());
                    String str2 = a2.userInfoBody;
                    boolean z2 = ((str2 == null || str2.length() == 0) ? i2 : 0) ^ i2;
                    String str3 = a2.stashBody;
                    boolean z3 = ((str3 == null || str3.length() == 0) ? i2 : 0) ^ 1;
                    String str4 = a2.masterTokenValue;
                    k0Var = new k0(valueOf, format, format2, l, z2, z3, ((str4 == null || str4.length() == 0) ? i2 : 0) ^ 1, z, modernAccount.getStash().keys());
                } else {
                    i2 = i4;
                    String valueOf2 = String.valueOf(a2.uidString);
                    String str5 = a2.userInfoBody;
                    boolean z4 = ((str5 == null || str5.length() == 0) ? i2 : 0) ^ 1;
                    String str6 = a2.stashBody;
                    boolean z5 = ((str6 == null || str6.length() == 0) ? i2 : 0) ^ 1;
                    String str7 = a2.masterTokenValue;
                    k0Var = new k0(valueOf2, z4, z5, ((str7 == null || str7.length() == 0) ? i2 : 0) ^ 1, z);
                }
                list.add(k0Var);
                i4 = i2;
                o0Var = o0Var2;
                str = null;
                while (it.hasNext()) {
                    a2 = bVar.a((Account) it.next());
                    if (a2 != null) {
                        ModernAccount b = o0Var.B.b(a2);
                        com.yandex.passport.data.network.core.o oVar = o0Var.y;
                        String value = (b == null || (masterToken = b.getMasterToken()) == null) ? str : masterToken.getValue();
                        passportInitReporter$getAccountsFromSystem$1.L$0 = o0Var;
                        passportInitReporter$getAccountsFromSystem$1.L$1 = list;
                        passportInitReporter$getAccountsFromSystem$1.L$2 = bVar;
                        passportInitReporter$getAccountsFromSystem$1.L$3 = it;
                        passportInitReporter$getAccountsFromSystem$1.L$4 = a2;
                        passportInitReporter$getAccountsFromSystem$1.L$5 = b;
                        passportInitReporter$getAccountsFromSystem$1.label = i4;
                        Object c = ((com.yandex.passport.internal.network.n) oVar).c(value, passportInitReporter$getAccountsFromSystem$1);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        o0Var2 = o0Var;
                        modernAccount = b;
                        obj = c;
                        boolean z6 = !((Boolean) obj).booleanValue();
                        if (modernAccount == null) {
                        }
                        list.add(k0Var);
                        i4 = i2;
                        o0Var = o0Var2;
                        str = null;
                        while (it.hasNext()) {
                        }
                    }
                }
                return list;
            }
        }
        passportInitReporter$getAccountsFromSystem$1 = new PassportInitReporter$getAccountsFromSystem$1(o0Var, continuationImpl);
        Object obj2 = passportInitReporter$getAccountsFromSystem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportInitReporter$getAccountsFromSystem$1.label;
        String str8 = null;
        int i42 = 1;
        if (i != 0) {
        }
    }

    public final ArrayList m() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        l0 l0Var;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent();
        intent.setAction("com.yandex.accounts.AccountAuthenticator");
        intent.setPackage(null);
        Context context = this.b;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(intent, 512).iterator();
        while (it.hasNext()) {
            String str = it.next().serviceInfo.packageName;
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            } catch (PackageManager.NameNotFoundException e) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Name not found: ".concat(str), e);
                }
                applicationInfo = null;
            }
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 8);
            } catch (PackageManager.NameNotFoundException e2) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Name not found: ".concat(str), e2);
                }
                packageInfo = null;
            }
            m0 m0Var = C;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                int i = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
                int i2 = bundle.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", -1);
                float f = bundle.getFloat("com.yandex.auth.VERSION", -1.0f);
                if (i != -1) {
                    m0Var = new m0(i, i2);
                } else if (f != -1.0f) {
                    m0Var = new m0(f, 2, 0);
                }
            }
            if (packageInfo != null) {
                String str2 = packageInfo.packageName;
                byte[] bArr = com.yandex.passport.internal.entities.o.c;
                com.yandex.passport.internal.entities.o r = com.yandex.passport.internal.util.p.r(context.getPackageManager(), str2);
                l0Var = new l0(str2, String.valueOf(packageInfo.versionName), m0Var, r.c() ? "Yandex" : r.b() ? "Development" : "UNKNOWN");
            } else {
                l0Var = new l0("unknown", "unknown", m0Var, "unknown");
            }
            arrayList.add(l0Var);
        }
        return arrayList;
    }

    public final HashMap n() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.c.d().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (cvu0.x(str, "com.yandex.passport", false)) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    public final DomainVerificationUserState o() {
        DomainVerificationManager c;
        DomainVerificationUserState domainVerificationUserState;
        Context context = this.b;
        try {
            if (Build.VERSION.SDK_INT < 31 || (c = a82.c(context.getSystemService(a82.m()))) == null) {
                return null;
            }
            domainVerificationUserState = c.getDomainVerificationUserState(context.getPackageName());
            return domainVerificationUserState;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(2:3|(22:5|6|7|(1:(2:10|11)(2:48|49))(3:50|51|(1:53)(1:54))|12|(1:14)|15|(2:18|16)|19|20|(1:22)(1:47)|23|(2:26|24)|27|28|(6:33|34|(2:36|(1:38)(1:44))(1:45)|39|40|41)|46|34|(0)(0)|39|40|41))|57|6|7|(0)(0)|12|(0)|15|(1:16)|19|20|(0)(0)|23|(1:24)|27|28|(7:30|33|34|(0)(0)|39|40|41)|46|34|(0)(0)|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016d, code lost:
    
        r1.getClass();
        r1.f(com.yandex.passport.internal.report.d0.w, new com.yandex.passport.internal.report.yd(r0), new com.yandex.passport.internal.report.ld(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[Catch: Exception -> 0x0032, LOOP:0: B:16:0x0079->B:18:0x007f, LOOP_END, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0051, B:15:0x0070, B:16:0x0079, B:18:0x007f, B:20:0x009e, B:23:0x00b1, B:24:0x00ba, B:26:0x00c0, B:28:0x00dd, B:30:0x0107, B:34:0x010f, B:36:0x0138, B:39:0x0146, B:51:0x003f), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[Catch: Exception -> 0x0032, LOOP:1: B:24:0x00ba->B:26:0x00c0, LOOP_END, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0051, B:15:0x0070, B:16:0x0079, B:18:0x007f, B:20:0x009e, B:23:0x00b1, B:24:0x00ba, B:26:0x00c0, B:28:0x00dd, B:30:0x0107, B:34:0x010f, B:36:0x0138, B:39:0x0146, B:51:0x003f), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0051, B:15:0x0070, B:16:0x0079, B:18:0x007f, B:20:0x009e, B:23:0x00b1, B:24:0x00ba, B:26:0x00c0, B:28:0x00dd, B:30:0x0107, B:34:0x010f, B:36:0x0138, B:39:0x0146, B:51:0x003f), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(ContinuationImpl continuationImpl) {
        PassportInitReporter$reportPassportInit$1 passportInitReporter$reportPassportInit$1;
        int i;
        long j;
        int d;
        int d2;
        Iterator it;
        lxj k;
        boolean z;
        DomainVerificationUserState o;
        String str;
        boolean isLinkHandlingAllowed;
        o0 o0Var = this;
        if (continuationImpl instanceof PassportInitReporter$reportPassportInit$1) {
            passportInitReporter$reportPassportInit$1 = (PassportInitReporter$reportPassportInit$1) continuationImpl;
            int i2 = passportInitReporter$reportPassportInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportInitReporter$reportPassportInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportInitReporter$reportPassportInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportInitReporter$reportPassportInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    passportInitReporter$reportPassportInit$1.L$0 = o0Var;
                    passportInitReporter$reportPassportInit$1.J$0 = currentTimeMillis;
                    passportInitReporter$reportPassportInit$1.label = 1;
                    obj = o0Var.l(passportInitReporter$reportPassportInit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = currentTimeMillis;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = passportInitReporter$reportPassportInit$1.J$0;
                    o0Var = (o0) passportInitReporter$reportPassportInit$1.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList m = o0Var.m();
                com.yandex.passport.internal.push.a0 a0Var = o0Var.x;
                HashMap n = o0Var.n();
                List<k0> list = (List) obj;
                d = gw00.d(tcc.n(list, 10));
                int i3 = 16;
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (k0 k0Var : list) {
                    Pair pair = new Pair(k0Var.i(), u(k0Var));
                    linkedHashMap.put(pair.c(), pair.f());
                }
                Pair pair2 = new Pair("accounts", linkedHashMap);
                d2 = gw00.d(tcc.n(m, 10));
                if (d2 < 16) {
                    i3 = d2;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                it = m.iterator();
                while (it.hasNext()) {
                    l0 l0Var = (l0) it.next();
                    Pair pair3 = new Pair(l0Var.a, v(l0Var));
                    linkedHashMap2.put(pair3.c(), pair3.f());
                }
                Pair pair4 = new Pair("applications", linkedHashMap2);
                Pair pair5 = new Pair("authenticators", n);
                Pair pair6 = new Pair("notifications_enabled", Boolean.valueOf(a0Var.a.b.areNotificationsEnabled()));
                k = com.yandex.passport.internal.util.p.k(a0Var.a);
                if (k != null && k.b) {
                    z = false;
                    Pair pair7 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
                    Pair pair8 = new Pair("notifications_disabled_channels", a0Var.a());
                    Pair pair9 = new Pair("applinks_verification_status", o0Var.j());
                    o = o0Var.o();
                    if (o == null) {
                        isLinkHandlingAllowed = o.isLinkHandlingAllowed();
                        str = isLinkHandlingAllowed ? "allowed" : "forbidden";
                    } else {
                        str = "unknown";
                    }
                    o0Var.b(com.yandex.passport.internal.report.e0.w, kotlin.collections.b.h(pair2, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("applinks_handling_status", str), new Pair("time_spent", new Long(System.currentTimeMillis() - j))));
                    return zy11.a;
                }
                z = true;
                Pair pair72 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
                Pair pair82 = new Pair("notifications_disabled_channels", a0Var.a());
                Pair pair92 = new Pair("applinks_verification_status", o0Var.j());
                o = o0Var.o();
                if (o == null) {
                }
                o0Var.b(com.yandex.passport.internal.report.e0.w, kotlin.collections.b.h(pair2, pair4, pair5, pair6, pair72, pair82, pair92, new Pair("applinks_handling_status", str), new Pair("time_spent", new Long(System.currentTimeMillis() - j))));
                return zy11.a;
            }
        }
        passportInitReporter$reportPassportInit$1 = new PassportInitReporter$reportPassportInit$1(o0Var, continuationImpl);
        Object obj2 = passportInitReporter$reportPassportInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportInitReporter$reportPassportInit$1.label;
        if (i != 0) {
        }
        ArrayList m2 = o0Var.m();
        com.yandex.passport.internal.push.a0 a0Var2 = o0Var.x;
        HashMap n2 = o0Var.n();
        List<k0> list2 = (List) obj2;
        d = gw00.d(tcc.n(list2, 10));
        int i32 = 16;
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
        while (r0.hasNext()) {
        }
        Pair pair22 = new Pair("accounts", linkedHashMap3);
        d2 = gw00.d(tcc.n(m2, 10));
        if (d2 < 16) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(i32);
        it = m2.iterator();
        while (it.hasNext()) {
        }
        Pair pair42 = new Pair("applications", linkedHashMap22);
        Pair pair52 = new Pair("authenticators", n2);
        Pair pair62 = new Pair("notifications_enabled", Boolean.valueOf(a0Var2.a.b.areNotificationsEnabled()));
        k = com.yandex.passport.internal.util.p.k(a0Var2.a);
        if (k != null) {
            z = false;
            Pair pair722 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
            Pair pair822 = new Pair("notifications_disabled_channels", a0Var2.a());
            Pair pair922 = new Pair("applinks_verification_status", o0Var.j());
            o = o0Var.o();
            if (o == null) {
            }
            o0Var.b(com.yandex.passport.internal.report.e0.w, kotlin.collections.b.h(pair22, pair42, pair52, pair62, pair722, pair822, pair922, new Pair("applinks_handling_status", str), new Pair("time_spent", new Long(System.currentTimeMillis() - j))));
            return zy11.a;
        }
        z = true;
        Pair pair7222 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
        Pair pair8222 = new Pair("notifications_disabled_channels", a0Var2.a());
        Pair pair9222 = new Pair("applinks_verification_status", o0Var.j());
        o = o0Var.o();
        if (o == null) {
        }
        o0Var.b(com.yandex.passport.internal.report.e0.w, kotlin.collections.b.h(pair22, pair42, pair52, pair62, pair7222, pair8222, pair9222, new Pair("applinks_handling_status", str), new Pair("time_spent", new Long(System.currentTimeMillis() - j))));
        return zy11.a;
    }

    public final void q(w1 w1Var) {
        try {
            List e = w1Var.e();
            ArrayList arrayList = new ArrayList(tcc.n(e, 10));
            Iterator it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.yandex.passport.api.i0) it.next()).a().name().toLowerCase(Locale.ROOT));
            }
            Pair pair = new Pair("push_token_providers", kotlin.collections.a.J0(arrayList));
            Pair pair2 = new Pair("preferred_locale", String.valueOf(w1Var.k()));
            Pair pair3 = new Pair("origin", String.valueOf(w1Var.getOrigin()));
            Pair pair4 = new Pair("support_webauthn", Boolean.valueOf(w1Var.o()));
            Pair pair5 = new Pair("is_white_label", Boolean.valueOf(w1Var.isWhiteLabel()));
            Pair pair6 = new Pair("additional_metric_params", w1Var.m());
            Pair pair7 = new Pair("url_override", w(w1Var.getUrlOverride()));
            Set<Map.Entry> entrySet = w1Var.getLocationsUrlOverride().entrySet();
            int d = gw00.d(tcc.n(entrySet, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Map.Entry entry : entrySet) {
                Pair pair8 = new Pair(String.valueOf(((PassportLocation) entry.getKey()).getValue()), w((p2) entry.getValue()));
                linkedHashMap.put(pair8.c(), pair8.f());
            }
            b(com.yandex.passport.internal.report.g0.w, kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("locations_url_override", linkedHashMap)));
        } catch (Exception e2) {
            f(com.yandex.passport.internal.report.f0.w, new yd(e2), new ld(e2));
        }
    }

    public final void r() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<Pair> g = scc.g(new Pair(PassportUrlType.BACKEND, com.yandex.passport.internal.flags.p.a), new Pair(PassportUrlType.WEBAM, com.yandex.passport.internal.flags.p.b), new Pair(PassportUrlType.FRONTEND, com.yandex.passport.internal.flags.p.c));
            ArrayList f = this.w.a().f();
            ArrayList arrayList = new ArrayList(tcc.n(f, 10));
            Iterator it = f.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ModernAccount) it.next()).getLocationId()));
            }
            Iterator it2 = kotlin.collections.a.I(arrayList).iterator();
            while (it2.hasNext()) {
                long longValue = ((Number) it2.next()).longValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Pair pair : g) {
                    linkedHashMap2.put(((PassportUrlType) pair.c()).name().toLowerCase(Locale.US), k(this.z.j(Environment.PRODUCTION, (PassportUrlType) pair.c(), Long.valueOf(longValue), (com.yandex.passport.internal.flags.m) pair.f(), n0.b)));
                }
                com.yandex.passport.internal.network.l lVar = this.z;
                Environment environment = Environment.PRODUCTION;
                linkedHashMap2.put("webam_id_yandex", k(lVar.j(environment, PassportUrlType.FRONTEND_ID, Long.valueOf(longValue), com.yandex.passport.internal.flags.p.c, n0.c)));
                linkedHashMap2.put("user_menu_yandex", k(this.z.l(environment, longValue)));
                linkedHashMap.put(String.valueOf(longValue), linkedHashMap2);
            }
            b(com.yandex.passport.internal.report.h0.w, linkedHashMap);
        } catch (Exception e) {
            f(com.yandex.passport.internal.report.i0.w, new yd(e), new ld(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedHashMap, java.util.Map] */
    public final void s(Throwable th, m2 m2Var) {
        Set entrySet;
        Pair pair = new Pair("throwable", th);
        String message = th.getMessage();
        Object obj = "null";
        if (message == null) {
            message = "null";
        }
        Pair pair2 = new Pair("throwable-message", message);
        p2 urlOverride = m2Var.getUrlOverride();
        Pair pair3 = new Pair("url_override", urlOverride != null ? w(urlOverride) : "null");
        Map locationsUrlOverride = m2Var.getLocationsUrlOverride();
        if (locationsUrlOverride != null && (entrySet = locationsUrlOverride.entrySet()) != null) {
            Set<Map.Entry> set = entrySet;
            int d = gw00.d(tcc.n(set, 10));
            if (d < 16) {
                d = 16;
            }
            obj = new LinkedHashMap(d);
            for (Map.Entry entry : set) {
                Pair pair4 = new Pair(String.valueOf(((PassportLocation) entry.getKey()).getValue()), w((p2) entry.getValue()));
                obj.put(pair4.c(), pair4.f());
            }
        }
        b(com.yandex.passport.internal.report.j0.w, kotlin.collections.b.i(pair, pair2, pair3, new Pair("locations_url_override", obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map] */
    public final void t(UpdateableProperties updateableProperties) {
        Set entrySet;
        try {
            p2 urlOverride = updateableProperties.getUrlOverride();
            String str = "null";
            Pair pair = new Pair("url_override", urlOverride != null ? w(urlOverride) : "null");
            Map locationsUrlOverride = updateableProperties.getLocationsUrlOverride();
            if (locationsUrlOverride != null && (entrySet = locationsUrlOverride.entrySet()) != null) {
                Set<Map.Entry> set = entrySet;
                int d = gw00.d(tcc.n(set, 10));
                if (d < 16) {
                    d = 16;
                }
                ?? linkedHashMap = new LinkedHashMap(d);
                for (Map.Entry entry : set) {
                    Pair pair2 = new Pair(String.valueOf(((PassportLocation) entry.getKey()).getValue()), w((p2) entry.getValue()));
                    linkedHashMap.put(pair2.c(), pair2.f());
                }
                str = linkedHashMap;
            }
            b(com.yandex.passport.internal.report.k0.w, kotlin.collections.b.i(pair, new Pair("locations_url_override", str)));
        } catch (Exception e) {
            s(e, updateableProperties);
        }
    }
}
