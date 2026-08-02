package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.e5h;
import defpackage.i3f;
import defpackage.i3f0;
import defpackage.j64;
import defpackage.pzn;
import defpackage.s3c;
import defpackage.sll0;
import defpackage.u0b0;
import defpackage.ugo;
import defpackage.v0x0;
import defpackage.v111;
import defpackage.v2c;
import defpackage.w0x0;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class b implements ugo, w0x0, v2c {
    public static final pzn y = new pzn("proto");
    public final SchemaManager a;
    public final s3c b;
    public final s3c c;
    public final j64 w;
    public final yvf0 x;

    public b(s3c s3cVar, s3c s3cVar2, j64 j64Var, SchemaManager schemaManager, yvf0 yvf0Var) {
        this.a = schemaManager;
        this.b = s3cVar;
        this.c = s3cVar2;
        this.w = j64Var;
        this.x = yvf0Var;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, v111 v111Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(v111Var.b(), String.valueOf(i3f0.a(v111Var.d()))));
        if (v111Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(v111Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{ClidProvider._ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = query;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String o(Iterable iterable) {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((u0b0) it.next()).b());
            if (it.hasNext()) {
                sb.append(HexString.CHAR_COMMA);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object v(Cursor cursor, sll0 sll0Var) {
        try {
            return sll0Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        SchemaManager schemaManager = this.a;
        Objects.requireNonNull(schemaManager);
        s3c s3cVar = this.c;
        long time = s3cVar.getTime();
        while (true) {
            try {
                return schemaManager.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (s3cVar.getTime() >= this.w.c + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object d(sll0 sll0Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = sll0Var.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, v111 v111Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long c = c(sQLiteDatabase, v111Var);
        if (c == null) {
            return arrayList;
        }
        v(sQLiteDatabase.query("events", new String[]{ClidProvider._ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", AuthSdkActivity.RESPONSE_TYPE_CODE, "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{c.toString()}, null, null, null, String.valueOf(i)), new i3f(9, this, arrayList, v111Var));
        return arrayList;
    }

    public final void k(long j, LogEventDropped$Reason logEventDropped$Reason, String str) {
        d(new e5h(str, logEventDropped$Reason, j, 4));
    }

    public final Object n(v0x0 v0x0Var) {
        SQLiteDatabase a = a();
        s3c s3cVar = this.c;
        long time = s3cVar.getTime();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object execute = v0x0Var.execute();
                    a.setTransactionSuccessful();
                    return execute;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (s3cVar.getTime() >= this.w.c + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
