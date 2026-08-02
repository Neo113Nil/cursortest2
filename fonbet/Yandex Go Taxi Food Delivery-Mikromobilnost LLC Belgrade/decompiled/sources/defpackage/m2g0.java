package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class m2g0 {
    public final SharedPreferences a;

    public m2g0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a(Long l) {
        this.a.edit().putLong("currentSubscribedUid", l != null ? l.longValue() : 0L).apply();
    }
}
