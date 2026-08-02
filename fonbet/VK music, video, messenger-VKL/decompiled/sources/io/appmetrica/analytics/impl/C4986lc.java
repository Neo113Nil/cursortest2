package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.lc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4986lc implements K6 {
    public final Context a;
    public final String b;
    public final C5178sn c;
    public final C4958ka d;
    public C4955k7 e;

    public C4986lc(Context context, String str, @NonNull C5178sn c5178sn) {
        this(context, str, new C4958ka(str), c5178sn);
    }

    @Override // io.appmetrica.analytics.impl.K6
    @Nullable
    public final synchronized SQLiteDatabase a() {
        C4955k7 c4955k7;
        try {
            this.d.a();
            c4955k7 = new C4955k7(this.a, this.b, this.c, PublicLogger.getAnonymousInstance());
            this.e = c4955k7;
        } catch (Throwable unused) {
            return null;
        }
        return c4955k7.getWritableDatabase();
    }

    public C4986lc(@NonNull Context context, @NonNull String str, @NonNull C4958ka c4958ka, @NonNull C5178sn c5178sn) {
        this.a = context;
        this.b = str;
        this.d = c4958ka;
        this.c = c5178sn;
    }

    @Override // io.appmetrica.analytics.impl.K6
    public final synchronized void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        vo.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}
