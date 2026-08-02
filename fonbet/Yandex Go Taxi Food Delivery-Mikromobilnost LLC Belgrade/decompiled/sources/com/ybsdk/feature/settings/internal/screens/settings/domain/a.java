package com.ybsdk.feature.settings.internal.screens.settings.domain;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.settings.internal.data.b;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.d7g0;
import defpackage.dqg;
import defpackage.j59;
import defpackage.krl0;
import defpackage.l04;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.pgk0;
import defpackage.qq7;
import defpackage.v7r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4e;
import defpackage.x7r0;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public final b a;
    public final l04 b;
    public final pgk0 c;
    public final krl0 d;

    public a(x7r0 x7r0Var, b bVar, l04 l04Var, pgk0 pgk0Var, krl0 krl0Var, d7g0 d7g0Var) {
        this.a = bVar;
        this.b = l04Var;
        this.c = pgk0Var;
        this.d = krl0Var;
    }

    public final j59 a() {
        Object obj = this.c.b;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SettingsInteractor$loadSettings$1 settingsInteractor$loadSettings$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof SettingsInteractor$loadSettings$1) {
            settingsInteractor$loadSettings$1 = (SettingsInteractor$loadSettings$1) continuationImpl;
            int i2 = settingsInteractor$loadSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsInteractor$loadSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsInteractor$loadSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsInteractor$loadSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    settingsInteractor$loadSettings$1.label = 1;
                    a = this.a.a(settingsInteractor$loadSettings$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                l04 l04Var = this.b;
                AppAnalyticsReporter appAnalyticsReporter = l04Var.a;
                if (!(a instanceof Result.Failure)) {
                    dqg dqgVar = (dqg) a;
                    if (dqgVar instanceof bqg) {
                        qq7.l(appAnalyticsReporter.h0, ((bqg) dqgVar).a, null, 2);
                    } else {
                        if (!(dqgVar instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        qq7 qq7Var = appAnalyticsReporter.h0;
                        v7r0 v7r0Var = (v7r0) ((cqg) dqgVar).a;
                        JSONArray jSONArray = new JSONArray();
                        for (j59 j59Var : v7r0Var.c) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("category_title", d.a(l04Var.b, j59Var.b));
                            jSONObject.put("category_id", j59Var.a);
                            JSONArray jSONArray2 = new JSONArray();
                            for (o8r0 o8r0Var : j59Var.c) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("title", o8r0Var.c);
                                jSONObject2.put("key", o8r0Var.a);
                                jSONObject2.put("bool_value", o8r0Var.g);
                                jSONArray2.put(jSONObject2);
                            }
                            jSONObject.put("settings", jSONArray2);
                            jSONArray.put(jSONObject);
                        }
                        qq7.l(qq7Var, null, jSONArray.toString(), 1);
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    qq7.l(appAnalyticsReporter.h0, a2.toString(), null, 2);
                }
                return a;
            }
        }
        settingsInteractor$loadSettings$1 = new SettingsInteractor$loadSettings$1(this, continuationImpl);
        Object obj2 = settingsInteractor$loadSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsInteractor$loadSettings$1.label;
        if (i != 0) {
        }
        l04 l04Var2 = this.b;
        AppAnalyticsReporter appAnalyticsReporter2 = l04Var2.a;
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o8r0 o8r0Var, String str, String str2, com.ybsdk.feature.settings.internal.screens.settings.presentation.a aVar, ContinuationImpl continuationImpl) {
        SettingsInteractor$setCommonSetting$1 settingsInteractor$setCommonSetting$1;
        int i;
        String str3;
        CharSequence a;
        if (continuationImpl instanceof SettingsInteractor$setCommonSetting$1) {
            settingsInteractor$setCommonSetting$1 = (SettingsInteractor$setCommonSetting$1) continuationImpl;
            int i2 = settingsInteractor$setCommonSetting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsInteractor$setCommonSetting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsInteractor$setCommonSetting$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsInteractor$setCommonSetting$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                l04 l04Var = this.b;
                qq7 qq7Var = l04Var.a.h0;
                String str4 = o8r0Var.a;
                Text text = o8r0Var.c;
                if (text == null || (a = d.a(l04Var.b, text)) == null || (str3 = a.toString()) == null) {
                    str3 = "";
                }
                Boolean valueOf = Boolean.valueOf(o8r0Var.g);
                LinkedHashMap t = x4e.t(3, "key", str4, "title", str3);
                t.put("boolean_value", valueOf);
                qq7Var.a.a("settings.change.started", t);
                Object obj3 = o8r0Var.a;
                wls settingsInteractor$setCommonSetting$2 = new SettingsInteractor$setCommonSetting$2(this, o8r0Var, str, str2, null);
                settingsInteractor$setCommonSetting$1.label = 1;
                Object O = aVar.O(settingsInteractor$setCommonSetting$2, obj3, settingsInteractor$setCommonSetting$1);
                return O == obj2 ? obj2 : O;
            }
        }
        settingsInteractor$setCommonSetting$1 = new SettingsInteractor$setCommonSetting$1(this, continuationImpl);
        Object obj4 = settingsInteractor$setCommonSetting$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsInteractor$setCommonSetting$1.label;
        if (i == 0) {
        }
    }
}
