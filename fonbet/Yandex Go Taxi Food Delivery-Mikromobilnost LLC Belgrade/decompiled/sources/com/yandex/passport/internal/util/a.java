package com.yandex.passport.internal.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(Activity activity, Intent intent) {
        intent.addFlags(268468224);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to start activity", e);
            }
            Toast.makeText(activity, R.string.passport_error_unknown, 1).show();
        }
    }
}
