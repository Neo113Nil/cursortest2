package com.yandex.passport.internal.social.esia;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes15.dex */
public final class d {
    public static Intent a(Context context, EsiaInternalBindProperties esiaInternalBindProperties) {
        Intent intent = new Intent(context, (Class<?>) EsiaBindActivity.class);
        intent.putExtra("INTERNAL_BIND_PROPERTIES", esiaInternalBindProperties);
        return intent;
    }
}
