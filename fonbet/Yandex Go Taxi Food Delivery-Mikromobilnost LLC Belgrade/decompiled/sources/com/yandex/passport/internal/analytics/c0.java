package com.yandex.passport.internal.analytics;

import android.util.Log;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.v5;
import com.yandex.passport.internal.ui.EventError;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.w53;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c0 {
    public final t a;

    public c0(t tVar) {
        this.a = tVar;
    }

    public final void a(Exception exc, long j) {
        w53 w53Var = new w53();
        w53Var.put("uid", Long.toString(j));
        w53Var.put("error", Log.getStackTraceString(exc));
        k kVar = k.b;
        this.a.a(com.yandex.passport.internal.a0.i(), w53Var);
    }

    public final void b(EventError eventError) {
        w53 w53Var = new w53();
        w53Var.put("uitype", "empty");
        w53Var.put("error_code", eventError.getErrorCode());
        w53Var.put("error", Log.getStackTraceString(eventError.getException()));
        g gVar = g.b;
        this.a.a(com.yandex.passport.internal.a0.s(), w53Var);
    }

    public final void c(ModernAccount modernAccount, boolean z) {
        String str;
        w53 w53Var = new w53();
        int primaryAliasType = modernAccount.getPrimaryAliasType();
        if (primaryAliasType == 6) {
            Map map = w0.w;
            str = (String) com.yandex.passport.internal.properties.u.w().get(modernAccount.getSocialProviderCode());
            if (str == null) {
                str = LegacyAccountType.STRING_SOCIAL;
            }
        } else if (primaryAliasType != 12) {
            str = LegacyAccountType.STRING_LOGIN;
        } else {
            Map map2 = w0.w;
            str = (String) com.yandex.passport.internal.properties.u.v().get(modernAccount.getSocialProviderCode());
            if (str == null) {
                str = "mailish";
            }
        }
        w53Var.put("fromLoginSDK", String.valueOf(z));
        w53Var.put("subtype", str);
        w53Var.put("uid", String.valueOf(modernAccount.getUid().getValue()));
        g gVar = g.b;
        this.a.a(com.yandex.passport.internal.a0.t(), w53Var);
    }

    public final void d() {
        this.a.b((String) v5.w.c, kotlin.collections.b.f());
    }

    public final void e(ModernAccount modernAccount) {
        IReporterYandex iReporterYandex = this.a.a;
        if (modernAccount == null) {
            iReporterYandex.setUserInfo(new UserInfo());
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "clearMetricaUserInfo", 8);
                return;
            }
            return;
        }
        long value = modernAccount.getUid().getValue();
        String legacyAccountType = modernAccount.getLegacyAccountType();
        UserInfo userInfo = new UserInfo(String.valueOf(value));
        userInfo.setType(legacyAccountType);
        iReporterYandex.setUserInfo(userInfo);
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "setMetricaUserInfo: " + userInfo, 8);
        }
    }

    public final void f(int i, int i2, String str, String str2) {
        w53 w53Var = new w53();
        w53Var.put("authenticator", str);
        w53Var.put("source", str2);
        w53Var.put("old_account_count", String.valueOf(i));
        w53Var.put("new_account_count", String.valueOf(i2));
        k kVar = k.b;
        this.a.a(com.yandex.passport.internal.a0.o(), w53Var);
    }

    public final void g(Throwable th) {
        w53 w53Var = new w53();
        w53Var.put("error", Log.getStackTraceString(th));
        f fVar = f.b;
        this.a.a(com.yandex.passport.internal.a0.z(), w53Var);
    }

    public final void h(long j, String str, String str2) {
        w53 w53Var = new w53();
        w53Var.put("from", str);
        w53Var.put("uid", String.valueOf(j));
        w53Var.put("account_action", str2);
        g gVar = g.b;
        this.a.a(com.yandex.passport.internal.a0.G(), w53Var);
    }

    public final void i(String str, p pVar) {
        w53 w53Var = new w53();
        w53Var.put("remote_package_name", str);
        this.a.a(pVar, w53Var);
    }

    public final void j(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        w53 w53Var = new w53();
        w53Var.put("session_hash", str);
        w53Var.put("accounts_num", Integer.toString(i));
        w53Var.put("uid", kotlin.collections.a.X(arrayList, ",", "[", "]", null, 56));
        w53Var.put("action", kotlin.collections.a.X(arrayList2, ",", "[", "]", null, 56));
        this.a.a(p.m, w53Var);
    }

    public final void k(Throwable th) {
        w53 w53Var = new w53();
        if (!(th instanceof IOException)) {
            w53Var.put("error", Log.getStackTraceString(th));
        }
        w53Var.put(Constants.KEY_MESSAGE, th.getMessage());
        this.a.a(l.k, w53Var);
    }

    public final void l(int i, String str) {
        w53 w53Var = new w53();
        w53Var.put(LaunchBrowserActivity.KEY_URI, str);
        w53Var.put("error_code", Integer.toString(i));
        this.a.a(l.m, w53Var);
    }

    public final void m(int i, String str) {
        w53 w53Var = new w53();
        w53Var.put(LaunchBrowserActivity.KEY_URI, str);
        w53Var.put("error_code", Integer.toString(i));
        this.a.a(l.l, w53Var);
    }
}
