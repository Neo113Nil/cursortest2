package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5327yk implements Uc {
    public final Go a;
    public final String b = "startup_state";
    public final AESEncrypter c;

    public C5327yk(Go go) {
        this.a = go;
        C4689a c4689a = new C4689a(C5342za.k().g());
        this.c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4689a.b(), c4689a.a());
    }

    public static void a(Go go, C5177sm c5177sm, Mb mb) {
        String optStringOrNull;
        synchronized (go) {
            optStringOrNull = JsonUtils.optStringOrNull(go.a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(mb.d)) {
                go.a(mb.d);
            }
            if (!TextUtils.isEmpty(mb.e)) {
                go.b(mb.e);
            }
            if (TextUtils.isEmpty(mb.a)) {
                return;
            }
            c5177sm.a = mb.a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Uc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C5342za.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Mb a = a(readableDatabase);
                C5177sm c5177sm = new C5177sm(new C5286x4(new C5236v4()));
                if (a != null) {
                    a(this.a, c5177sm, a);
                    c5177sm.p = a.c;
                    c5177sm.r = a.b;
                }
                C5203tm c5203tm = new C5203tm(c5177sm);
                AbstractC4739bn abstractC4739bn = (AbstractC4739bn) Zm.a(C5203tm.class);
                abstractC4739bn.a(context, abstractC4739bn.b(context)).save(c5203tm);
            } catch (Throwable unused) {
            }
        }
    }

    public final Mb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Mb mb = (Mb) MessageNano.mergeFrom(new Mb(), this.c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return mb;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtilsKt.closeSafely(cursor);
        return null;
    }
}
