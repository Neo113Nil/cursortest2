package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class Al implements K6 {
    public final C4955k7 a;

    public Al(C4955k7 c4955k7) {
        this.a = c4955k7;
    }

    @Override // io.appmetrica.analytics.impl.K6
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.K6
    @Nullable
    public final SQLiteDatabase a() {
        try {
            return this.a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
