package com.yandex.passport.biometric.ui.initialization;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.common.ebs.CryptoSdkProperties;
import com.yandex.passport.common.ebs.p;
import com.yandex.passport.common.ebs.q;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import defpackage.vng;
import defpackage.x40;

/* loaded from: classes15.dex */
public final class b extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Intent intent = new Intent(context, (Class<?>) CryptoSdkInitializationActivity.class);
        intent.putExtra("crypto_sdk_properties", ((CryptoSdkProperties) obj).toBundle());
        return intent;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i == -1) {
            return q.a;
        }
        Throwable th = null;
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            try {
                th = (Throwable) vng.w(extras, Throwable.class, EsiaBindActivity.EXTRA_EXCEPTION);
            } catch (Exception unused) {
            }
        }
        return new p(th);
    }
}
