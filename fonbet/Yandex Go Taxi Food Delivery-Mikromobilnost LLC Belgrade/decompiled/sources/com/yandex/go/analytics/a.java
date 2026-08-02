package com.yandex.go.analytics;

import android.app.Activity;
import android.provider.Settings;
import androidx.lifecycle.Lifecycle;
import defpackage.a2f0;
import defpackage.a32;
import defpackage.tse;
import defpackage.zf;
import defpackage.zz2;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements a2f0 {
    public final Activity a;
    public final ru.yandex.taxi.analytics.j b;
    public final zf c;
    public final zz2 d;
    public final ru.yandex.taxi.perf.b e;
    public final a32 f;
    public final tse g;
    public final Lifecycle h;

    public a(Activity activity, ru.yandex.taxi.analytics.j jVar, zf zfVar, zz2 zz2Var, ru.yandex.taxi.perf.b bVar, a32 a32Var, tse tseVar, Lifecycle lifecycle) {
        this.a = activity;
        this.b = jVar;
        this.c = zfVar;
        this.d = zz2Var;
        this.e = bVar;
        this.f = a32Var;
        this.g = tseVar;
        this.h = lifecycle;
    }

    @Override // defpackage.a2f0
    public final void c() {
        String str;
        try {
            str = Settings.Secure.getString(this.a.getContentResolver(), "default_input_method");
        } catch (Exception unused) {
            str = "unknown_ime";
        }
        zf zfVar = this.c;
        zfVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("activeKeyboard", str);
        zfVar.a.a("keyboard_info", hashMap, 1, new HashMap());
        com.yandex.go.coroutines.b.g(this.g, null, null, new AnalyticsActivityCreateListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AnalyticsActivityCreateListener";
    }
}
