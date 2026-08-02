package com.yandex.messaging.utils.extension;

import android.content.SharedPreferences;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public abstract class a {
    public static final b a(SharedPreferences sharedPreferences, String str, boolean z) {
        return e.g(new SharedPreferencesKt$getBooleanFlow$1(sharedPreferences, str, z, null));
    }
}
