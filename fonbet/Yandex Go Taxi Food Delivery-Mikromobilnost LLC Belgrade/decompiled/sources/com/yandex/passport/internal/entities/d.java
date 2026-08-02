package com.yandex.passport.internal.entities;

import android.content.Intent;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class d {
    public static Cookie a(Intent intent) {
        WebViewActivity.Companion.getClass();
        Parcelable parcelableExtra = intent.getParcelableExtra(WebViewActivity.KEY_WEBVIEW_RESULT);
        if (parcelableExtra != null) {
            return (Cookie) parcelableExtra;
        }
        ny61.r("webview-result is missing");
        return null;
    }
}
