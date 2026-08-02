package com.yandex.passport.common.browser;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.g;
import com.adjust.sdk.Constants;
import com.google.ar.core.ImageMetadata;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.slf;
import defpackage.tlf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public abstract class c {
    public static final Uri a = Uri.parse("https://yandex.ru/");

    public static final String a(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.VIEW", a);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, ImageMetadata.EDGE_MODE);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            Iterator it = BrowserUtil$SupportedBrowser.a().iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, ((BrowserUtil$SupportedBrowser) it.next()).getPackageName())) {
                    return str;
                }
            }
        }
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, ImageMetadata.EDGE_MODE)) {
            for (BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser2 : BrowserUtil$SupportedBrowser.values()) {
                if (jl40.l(resolveInfo.activityInfo.packageName, browserUtil$SupportedBrowser2.getPackageName()) && (browserUtil$SupportedBrowser == null || browserUtil$SupportedBrowser.ordinal() > browserUtil$SupportedBrowser2.ordinal())) {
                    browserUtil$SupportedBrowser = browserUtil$SupportedBrowser2;
                }
            }
        }
        if (browserUtil$SupportedBrowser != null) {
            return browserUtil$SupportedBrowser.getPackageName();
        }
        return null;
    }

    public static final String b(Context context) {
        return String.format("%s.%s://%s/", Arrays.copyOf(new Object[]{context.getPackageName(), "passport", LegacyAccountType.STRING_SOCIAL}, 3));
    }

    public static Serializable c(Context context, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            if (g.a(context, Collections.singletonList(context.getPackageName()), true) != null) {
                str2 = context.getPackageName();
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "This app is browser and support chrome tab. Current packageName = " + str2, 8);
                }
                try {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Open url in current browser", 8);
                    }
                    tlf a2 = new slf().a();
                    a2.a.setPackage(str2);
                    a2.a(context, parse);
                } catch (Exception e) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error open url in current browser. Fallback with FLAG_ACTIVITY_NEW_TASK", e);
                    }
                    tlf a3 = new slf().a();
                    a3.a.setPackage(str2).setFlags(SelfTester_JCP.IMITA);
                    a3.a(context, parse);
                }
            } else {
                str2 = a(context.getPackageManager());
                tlf a4 = new slf().a();
                a4.a.setPackage(str2).setFlags(SelfTester_JCP.IMITA);
                a4.a(context, parse);
            }
        } catch (Exception e2) {
            try {
                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error searching for the best browser. Fallback to startActivity", e2);
                }
                context.startActivity(new Intent("android.intent.action.VIEW", parse).setFlags(SelfTester_JCP.IMITA));
                str2 = null;
            } catch (Exception unused) {
                return new Result.Failure(new RuntimeException("Url could not be opened"));
            }
        }
        com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "OpenExternalUrl: " + parse, 8);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r5.isEmpty() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable d(Context context, String str) {
        Uri parse = Uri.parse(str);
        PackageManager packageManager = context.getPackageManager();
        if (jl40.l(parse.getScheme(), "http") || jl40.l(parse.getScheme(), Constants.SCHEME)) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", parse), 0);
            if (!queryIntentActivities.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : queryIntentActivities) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://example.com/help?key=value"));
                    intent.setPackage(((ResolveInfo) obj).activityInfo.packageName);
                    if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                        arrayList.add(obj);
                    }
                }
            }
            return c(context, str);
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "URL can be handled by other app: " + parse, 8);
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", parse).setFlags(SelfTester_JCP.IMITA));
            return "opened_in_another_app";
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to open URL in other app, fallback to browser", e);
            }
        }
    }
}
