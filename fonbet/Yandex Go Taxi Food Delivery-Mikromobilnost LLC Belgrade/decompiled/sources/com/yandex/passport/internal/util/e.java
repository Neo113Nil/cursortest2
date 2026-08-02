package com.yandex.passport.internal.util;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.AdjustConfig;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.oyr;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class e {
    public static final d h = new d();
    public final String a;
    public final PackageManager b;
    public final com.yandex.passport.common.analytics.f c;
    public final com.yandex.passport.internal.core.accounts.j d;
    public final com.yandex.passport.internal.core.accounts.d e;
    public final com.yandex.passport.internal.flags.experiments.g f;
    public final com.yandex.passport.internal.network.mappers.h g;

    public e(String str, PackageManager packageManager, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.internal.core.accounts.j jVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.flags.experiments.g gVar, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = str;
        this.b = packageManager;
        this.c = fVar;
        this.d = jVar;
        this.e = dVar;
        this.f = gVar;
        this.g = hVar;
    }

    public final String a() {
        String str;
        String p;
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        String str2;
        JSONObject jSONObject;
        Iterator<ResolveInfo> it;
        String str3;
        String str4;
        List list;
        String str5 = "Name not found: ";
        Intent intent = new Intent();
        intent.setAction("com.yandex.accounts.AccountAuthenticator");
        ApplicationInfo applicationInfo2 = null;
        intent.setPackage(null);
        PackageManager packageManager = this.b;
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 512);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it2 = queryIntentServices.iterator();
        while (true) {
            String str6 = "unknown";
            if (!it2.hasNext()) {
                break;
            }
            String str7 = it2.next().serviceInfo.packageName;
            try {
                applicationInfo = packageManager.getApplicationInfo(str7, 128);
            } catch (PackageManager.NameNotFoundException e) {
                com.yandex.passport.legacy.a.c(str5 + str7, e);
                applicationInfo = applicationInfo2;
            }
            try {
                packageInfo = packageManager.getPackageInfo(str7, 8);
            } catch (PackageManager.NameNotFoundException e2) {
                com.yandex.passport.legacy.a.c(str5 + str7, e2);
                packageInfo = applicationInfo2;
            }
            d dVar = h;
            if (applicationInfo != null) {
                String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    str2 = str5;
                    it = it2;
                    int i = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
                    int i2 = bundle.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", -1);
                    jSONObject = jSONObject2;
                    float f = bundle.getFloat("com.yandex.auth.VERSION", -1.0f);
                    dVar = i == -1 ? f != -1.0f ? new d(f) : dVar : new d(i, i2);
                } else {
                    str2 = str5;
                    jSONObject = jSONObject2;
                    it = it2;
                }
                str3 = charSequence;
            } else {
                str2 = str5;
                jSONObject = jSONObject2;
                it = it2;
                str3 = "<unknown>";
            }
            if (packageInfo != null) {
                str4 = packageInfo.versionName;
                str6 = packageInfo.packageName;
            } else {
                str4 = "<unknown>";
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("manifest", dVar.toString());
            JSONObject put = jSONObject3.put("label", str3).put("application_id", str6).put("version", str4).put("amVersions", jSONObject4);
            JSONArray jSONArray2 = new JSONArray();
            try {
                byte[] bArr = com.yandex.passport.internal.entities.o.c;
                Iterator it3 = p.f(packageManager, str7).a.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(Base64.encodeToString((byte[]) it3.next(), 2));
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e3) {
                com.yandex.passport.legacy.a.c("Failed to calculate signature", e3);
                jSONArray2.put("<unknown>");
            }
            put.put("signatures", jSONArray2);
            try {
                byte[] bArr2 = com.yandex.passport.internal.entities.o.c;
                String encodeToString = Base64.encodeToString(p.f(packageManager, str7).a(), 2);
                if (hashMap.containsKey(encodeToString)) {
                    list = (List) hashMap.get(encodeToString);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    hashMap.put(encodeToString, arrayList2);
                    list = arrayList2;
                }
                list.add(str7);
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e4) {
                com.yandex.passport.legacy.a.c("Failed to calculate signature", e4);
                arrayList.add(str7);
            }
            jSONArray.put(jSONObject3);
            str5 = str2;
            it2 = it;
            jSONObject2 = jSONObject;
            applicationInfo2 = null;
        }
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("unknown", arrayList);
        for (String str8 : hashMap.keySet()) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator it4 = ((List) hashMap.get(str8)).iterator();
            while (it4.hasNext()) {
                jSONArray3.put((String) it4.next());
            }
            jSONObject6.put(str8, jSONArray3);
        }
        JSONObject jSONObject7 = new JSONObject();
        com.yandex.passport.internal.flags.experiments.b bVar = this.f.e;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, ?> entry : bVar.a.getAll().entrySet()) {
            hashMap2.put("experiments_" + entry.getKey(), String.valueOf(entry.getValue()));
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            jSONObject7.put((String) entry2.getKey(), entry2.getValue());
        }
        JSONObject put2 = jSONObject5.put("signatures", jSONObject6);
        JSONObject jSONObject8 = new JSONObject();
        com.yandex.passport.internal.b a = this.e.a();
        Iterator it5 = a.b().iterator();
        while (it5.hasNext()) {
            Account account = (Account) it5.next();
            JSONObject jSONObject9 = new JSONObject();
            AccountRow a2 = a.a(account);
            if (a2 == null) {
                jSONObject8.put(account.name, new JSONObject());
            } else {
                if (TextUtils.isEmpty(a2.masterTokenValue)) {
                    jSONObject9.put(AuthSdkActivity.RESPONSE_TYPE_TOKEN, "-");
                } else {
                    jSONObject9.put(AuthSdkActivity.RESPONSE_TYPE_TOKEN, com.yandex.passport.internal.ui.sloth.e.l(a2.masterTokenValue));
                }
                ModernAccount b = this.g.b(a2);
                if (b != null) {
                    int primaryAliasType = b.getPrimaryAliasType();
                    Environment environment = b.getUid().getEnvironment();
                    jSONObject9.put("uid", b.getUid().getValue());
                    if (primaryAliasType == 1) {
                        str = "portal";
                    } else if (primaryAliasType == 10) {
                        str = "phone";
                    } else if (primaryAliasType == 12) {
                        str = "mail";
                    } else if (primaryAliasType == 5) {
                        str = "lite";
                    } else if (primaryAliasType == 6) {
                        str = LegacyAccountType.STRING_SOCIAL;
                    } else if (primaryAliasType != 7) {
                        Locale locale = Locale.US;
                        str = oyr.j(primaryAliasType, "unknown [", "]");
                    } else {
                        str = "pdd";
                    }
                    jSONObject9.put("type", str);
                    if (environment == Environment.PRODUCTION) {
                        p = AdjustConfig.ENVIRONMENT_PRODUCTION;
                    } else if (environment == Environment.TESTING) {
                        p = "testing";
                    } else if (environment == Environment.RC) {
                        p = "rc";
                    } else if (com.yandex.passport.internal.ui.c.t(environment)) {
                        p = LegacyAccountType.STRING_TEAM;
                    } else {
                        Locale locale2 = Locale.US;
                        p = oyr.p("unknown [", environment.toString(), "]");
                    }
                    jSONObject9.put(WebViewActivity.KEY_ENVIRONMENT, p);
                    jSONObject9.put("locationId", b.getLocationId());
                } else {
                    jSONObject9.put("uid", a2.uidString);
                }
                jSONObject9.put("hasUserInfo", !TextUtils.isEmpty(a2.userInfoBody));
                jSONObject9.put("hasStash", !TextUtils.isEmpty(a2.stashBody));
                jSONObject9.put("userInfoMeta", a2.userInfoMeta);
                jSONObject8.put(a2.name, jSONObject9);
            }
        }
        JSONObject put3 = put2.put("accounts", jSONObject8).put("applications", jSONArray).put("device", new JSONObject(this.c.c(null, null)));
        JSONObject jSONObject10 = new JSONObject();
        for (Map.Entry entry3 : this.d.d().entrySet()) {
            if (((String) entry3.getKey()).startsWith("com.yandex.passport")) {
                jSONObject10.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        put3.put("authenticators", jSONObject10).put("experiments", jSONObject7);
        String jSONObject11 = jSONObject5.toString(4);
        com.yandex.passport.legacy.a.a(jSONObject11);
        return jSONObject11;
    }
}
