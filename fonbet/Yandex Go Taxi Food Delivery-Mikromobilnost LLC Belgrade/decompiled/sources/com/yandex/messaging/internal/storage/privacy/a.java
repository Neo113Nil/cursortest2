package com.yandex.messaging.internal.storage.privacy;

import android.content.SharedPreferences;
import defpackage.tje;
import defpackage.xdf0;
import kotlinx.coroutines.flow.b;

/* loaded from: classes15.dex */
public final class a {
    public final SharedPreferences a;
    public final xdf0 b;
    public final b c;

    public a(SharedPreferences sharedPreferences, xdf0 xdf0Var) {
        this.a = sharedPreferences;
        this.b = xdf0Var;
        this.c = com.yandex.messaging.utils.extension.a.a(sharedPreferences, "privacy_search_alert_shown", false);
    }

    public final void a() {
        tje.N(this.b, null, null, new PrivacySearchAlertPreferences$markAlertAsShown$1(this, null), 3);
    }
}
