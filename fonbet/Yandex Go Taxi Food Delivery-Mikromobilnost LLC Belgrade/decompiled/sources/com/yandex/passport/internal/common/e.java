package com.yandex.passport.internal.common;

import android.content.Context;
import android.content.pm.PackageManager;
import com.yandex.passport.internal.properties.p;

/* loaded from: classes8.dex */
public final class e implements com.yandex.passport.common.common.a {
    public final Context a;
    public final p b;

    public e(Context context, p pVar) {
        this.a = context;
        this.b = pVar;
    }

    public final String a() {
        String e = com.yandex.passport.common.util.a.e(this.b.c);
        return e == null ? this.a.getPackageName() : e;
    }

    public final String b() {
        String str;
        String e = com.yandex.passport.common.util.a.e(this.b.d);
        if (e != null) {
            return e;
        }
        Context context = this.a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        String e2 = com.yandex.passport.common.util.a.e(str);
        return e2 == null ? "null" : e2;
    }
}
