package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.i3y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final i3y b = kotlin.a.a(new com.yandex.passport.internal.d(2, this));

    public a(Context context) {
        this.a = context;
    }

    public final void a(LinkedHashMap linkedHashMap, List list) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.getValue()).edit();
        edit.clear();
        edit.putStringSet("blacklisted_apps", kotlin.collections.a.N0(list));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.apply();
    }
}
