package com.yandex.passport.biometric.ui.verification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import defpackage.vng;
import defpackage.x40;

/* loaded from: classes15.dex */
public final class c extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Intent intent = new Intent(context, (Class<?>) BiometricAuthSdkActivity.class);
        intent.putExtra("biometric_properties", ((BiometricAuthSdkProperties) obj).toBundle());
        return intent;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i == -1) {
            return com.yandex.passport.common.ebs.e.a;
        }
        if (i == 0) {
            return com.yandex.passport.common.ebs.b.a;
        }
        if (i == 999) {
            return com.yandex.passport.common.ebs.d.a;
        }
        Throwable th = null;
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            try {
                th = (Throwable) vng.w(extras, Throwable.class, EsiaBindActivity.EXTRA_EXCEPTION);
            } catch (Exception unused) {
            }
        }
        return new com.yandex.passport.common.ebs.c(th);
    }
}
