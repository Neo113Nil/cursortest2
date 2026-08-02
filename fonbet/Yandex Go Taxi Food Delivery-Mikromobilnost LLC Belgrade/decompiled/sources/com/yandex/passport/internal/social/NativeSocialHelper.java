package com.yandex.passport.internal.social;

import android.app.Activity;
import android.content.Intent;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.ua;
import com.yandex.passport.internal.report.va;
import com.yandex.passport.internal.report.wa;
import com.yandex.passport.internal.report.yd;
import defpackage.w53;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes15.dex */
public abstract class NativeSocialHelper {
    public static final w53 a;

    static {
        w53 w53Var = new w53();
        a = w53Var;
        w53Var.put(PassportSocialConfiguration.SOCIAL_VKONTAKTE, "com.yandex.passport.action.NATIVE_SOCIAL_VKONTAKTE_AUTH");
        w53Var.put(PassportSocialConfiguration.SOCIAL_FACEBOOK, "com.yandex.passport.action.NATIVE_SOCIAL_FACEBOOK_AUTH");
        w53Var.put(PassportSocialConfiguration.SOCIAL_GOOGLE, "com.yandex.passport.action.NATIVE_SOCIAL_GOOGLE_AUTH");
        w53Var.put(PassportSocialConfiguration.MAILISH_GOOGLE, "com.yandex.passport.action.NATIVE_MAILISH_GOOGLE_AUTH");
    }

    public static void onCancel(Activity activity) {
        activity.setResult(0);
        activity.finish();
        w0 socialReporter = com.yandex.passport.internal.di.a.a().getSocialReporter();
        socialReporter.getClass();
        socialReporter.h(ua.w);
    }

    public static void onFailure(Activity activity, Exception exc) {
        com.yandex.passport.legacy.a.c("Error native auth", exc);
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, exc);
        activity.setResult(0, intent);
        activity.finish();
        w0 socialReporter = com.yandex.passport.internal.di.a.a().getSocialReporter();
        socialReporter.getClass();
        socialReporter.f(va.w, new yd(exc));
    }

    public static void onNativeNotSupported(Activity activity) {
        com.yandex.passport.legacy.a.b("Native auth not supported");
        activity.setResult(100);
        activity.finish();
        w0 socialReporter = com.yandex.passport.internal.di.a.a().getSocialReporter();
        socialReporter.getClass();
        socialReporter.h(wa.w);
    }

    public static void onTokenReceived(Activity activity, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("social-token", str);
        intent.putExtra("application-id", str2);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
