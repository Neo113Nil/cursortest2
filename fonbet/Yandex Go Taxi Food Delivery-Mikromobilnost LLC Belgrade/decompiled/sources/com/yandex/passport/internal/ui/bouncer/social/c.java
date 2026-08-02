package com.yandex.passport.internal.ui.bouncer.social;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import defpackage.x40;

/* loaded from: classes2.dex */
public final class c extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return SocialBrowserActivity.createIntent(context, (Uri) obj);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null || i != -1) {
            return null;
        }
        return data;
    }
}
