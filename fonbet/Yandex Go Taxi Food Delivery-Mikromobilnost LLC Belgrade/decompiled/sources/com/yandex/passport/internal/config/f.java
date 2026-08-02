package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class f {
    public final e a;
    public final com.yandex.passport.common.c b;
    public final com.yandex.passport.common.common.a c;

    public f(e eVar, com.yandex.passport.common.c cVar, com.yandex.passport.common.common.a aVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = aVar;
    }

    public final boolean a(Environment environment, String str, String str2) {
        SharedPreferences b = this.a.b(environment);
        if (b == null) {
            return true;
        }
        long j = b.getLong(str, 0L);
        String string = b.getString(str2, null);
        if (j <= 0 || !jl40.l(string, ((com.yandex.passport.internal.common.e) this.c).a())) {
            return false;
        }
        ((com.yandex.passport.common.a) this.b).getClass();
        long currentTimeMillis = System.currentTimeMillis() - j;
        return currentTimeMillis >= 0 && currentTimeMillis < 86400000;
    }

    public final void b(Environment environment, String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences b = this.a.b(environment);
        if (b == null || (edit = b.edit()) == null) {
            return;
        }
        String a = ((com.yandex.passport.internal.common.e) this.c).a();
        ((com.yandex.passport.common.a) this.b).getClass();
        edit.putLong(str, System.currentTimeMillis());
        edit.putString(str2, a);
        edit.apply();
    }
}
