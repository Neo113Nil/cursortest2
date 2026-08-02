package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class p {
    public final e a;

    public p(e eVar) {
        this.a = eVar;
    }

    public final void a(Environment environment, List list) {
        SharedPreferences b;
        SharedPreferences.Editor edit;
        if (list.isEmpty() || (b = this.a.b(environment)) == null || (edit = b.edit()) == null) {
            return;
        }
        edit.putString("vpn_cookie", kotlin.collections.a.X(list, Extension.SEMICOLON_SPACE, null, null, null, 62));
        edit.apply();
    }
}
