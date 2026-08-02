package ru.mail.libverify.p;

import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class g {
    private final SharedPreferences a;
    private final int b;

    public g(SharedPreferences sharedPreferences, int i) {
        this.a = sharedPreferences;
        this.b = i;
    }

    public final int a() {
        return this.a.getInt("current_count", 0);
    }

    public final int b() {
        return this.a.getInt("total_count", 0);
    }

    public final void c() {
        int i = this.a.getInt("current_count", 0);
        int i2 = this.a.getInt("total_count", 0);
        this.a.edit().putInt("current_count", (this.b == this.a.getInt("last_version_code", -1) ? i : 0) + 1).putInt("total_count", i2 + 1).putInt("last_version_code", this.b).apply();
    }
}
