package com.yandex.passport.internal.properties;

import com.yandex.passport.api.m3;

/* loaded from: classes15.dex */
public final class d0 {
    public static WebAmProperties a(m3 m3Var) {
        return new WebAmProperties(m3Var.getIgnoreUnsupportedLanguageFallback(), m3Var.getIgnoreWebViewCrashFallback(), m3Var.getIgnoreExperimentSettingsFallback(), m3Var.getIgnoreBackToNativeFallback(), m3Var.getTestId(), m3Var.isClearCookiesBeforeAuthorization());
    }
}
