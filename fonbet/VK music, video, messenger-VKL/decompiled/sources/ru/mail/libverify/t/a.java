package ru.mail.libverify.t;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class a {

    @NonNull
    private final SharedPreferences a;

    @NonNull
    private final ru.mail.libverify.i0.a b;

    public a(@NonNull SharedPreferences sharedPreferences, @NonNull ru.mail.libverify.i0.a aVar) {
        this.a = sharedPreferences;
        this.b = aVar;
    }

    public final void a(@NonNull String str, @NonNull Long l) {
        this.a.edit().putLong(Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3), l.longValue()).apply();
    }

    public final boolean a(@NonNull String str, long j, @NonNull TimeUnit timeUnit) {
        return new Date(timeUnit.toMillis(j) + this.a.getLong(Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3), 0L)).before(new Date(this.b.b()));
    }

    public final void a(@NonNull String str) {
        this.a.edit().remove(Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3)).apply();
    }
}
