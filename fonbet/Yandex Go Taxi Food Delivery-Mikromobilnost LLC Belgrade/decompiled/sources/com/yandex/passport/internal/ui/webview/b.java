package com.yandex.passport.internal.ui.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.t0;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;

/* loaded from: classes2.dex */
public final class b {
    public static Intent a(t0 t0Var, Context context, PassportTheme passportTheme, WebCaseType webCaseType, Bundle bundle, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra(WebViewActivity.KEY_ENVIRONMENT, t0Var.getInteger());
        intent.putExtra(WebViewActivity.KEY_WEB_CASE, webCaseType.ordinal());
        intent.putExtra(WebViewActivity.KEY_WEB_CASE_DATA, bundle);
        intent.putExtra(WebViewActivity.KEY_SHOW_DEBUG_OVERLAY, z);
        intent.putExtra(WebViewActivity.KEY_THEME, passportTheme.ordinal());
        return intent.addFlags(65536);
    }

    public static /* synthetic */ Intent b(b bVar, t0 t0Var, Context context, PassportTheme passportTheme, WebCaseType webCaseType, Bundle bundle) {
        bVar.getClass();
        return a(t0Var, context, passportTheme, webCaseType, bundle, false);
    }
}
