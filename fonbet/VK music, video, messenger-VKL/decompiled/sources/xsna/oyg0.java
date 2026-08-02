package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import xsna.nlc;
import xsna.uon0;
import xsna.yl5;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public final class oyg0 implements n0q, uon0, klc {
    public static final ijp g = new ijp("proto");
    public final v8h0 b;
    public final zuf c;
    public final zuf d;
    public final o0q e;
    public final e9e0<String> f;

    /* compiled from: SQLiteEventStore.java */
    public interface a<T, U> {
        U apply(T t);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes12.dex */
    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public oyg0(zuf zufVar, zuf zufVar2, o0q o0qVar, v8h0 v8h0Var, e9e0<String> e9e0Var) {
        this.b = v8h0Var;
        this.c = zufVar;
        this.d = zufVar2;
        this.e = o0qVar;
        this.f = e9e0Var;
    }

    @Nullable
    public static Long q(SQLiteDatabase sQLiteDatabase, eo5 eo5Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(eo5Var.a, String.valueOf(acd0.a(eo5Var.c))));
        byte[] bArr = eo5Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String t(Iterable<oy90> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<oy90> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T v(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // xsna.n0q
    public final int G() {
        long C = this.c.C() - this.e.b();
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            String[] strArr = {String.valueOf(C)};
            Cursor rawQuery = p.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (rawQuery.moveToNext()) {
                try {
                    o(rawQuery.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, rawQuery.getString(1));
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            int delete = p.delete("events", "timestamp_ms < ?", strArr);
            p.setTransactionSuccessful();
            return delete;
        } finally {
            p.endTransaction();
        }
    }

    @Override // xsna.n0q
    public final void G3(Iterable<oy90> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + t(iterable);
            SQLiteDatabase p = p();
            p.beginTransaction();
            try {
                p.compileStatement(str).execute();
                Cursor rawQuery = p.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        o(rawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                p.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                p.setTransactionSuccessful();
            } finally {
                p.endTransaction();
            }
        }
    }

    @Override // xsna.n0q
    public final void M3(long j, eo5 eo5Var) {
        r(new whr(j, eo5Var));
    }

    @Override // xsna.n0q
    @Nullable
    public final nn5 O3(final eo5 eo5Var, final a0q a0qVar) {
        Priority priority = eo5Var.c;
        a0qVar.k();
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(priority);
        }
        long longValue = ((Long) r(new a() { // from class: xsna.kyg0
            @Override // xsna.oyg0.a
            public final Object apply(Object obj) {
                long insert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                oyg0 oyg0Var = oyg0.this;
                long simpleQueryForLong = oyg0Var.p().compileStatement("PRAGMA page_size").simpleQueryForLong() * oyg0Var.p().compileStatement("PRAGMA page_count").simpleQueryForLong();
                o0q o0qVar = oyg0Var.e;
                long e = o0qVar.e();
                a0q a0qVar2 = a0qVar;
                if (simpleQueryForLong >= e) {
                    oyg0Var.o(1L, LogEventDropped.Reason.CACHE_FULL, a0qVar2.k());
                    return -1L;
                }
                eo5 eo5Var2 = eo5Var;
                Long q = oyg0.q(sQLiteDatabase, eo5Var2);
                if (q != null) {
                    insert = q.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", eo5Var2.a);
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(acd0.a(eo5Var2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = eo5Var2.b;
                    if (bArr != null) {
                        contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d = o0qVar.d();
                byte[] bArr2 = a0qVar2.d().b;
                boolean z = bArr2.length <= d;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", a0qVar2.k());
                contentValues2.put("timestamp_ms", Long.valueOf(a0qVar2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(a0qVar2.l()));
                contentValues2.put("payload_encoding", a0qVar2.d().a.a);
                contentValues2.put("code", a0qVar2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", a0qVar2.i());
                contentValues2.put("pseudonymous_id", a0qVar2.j());
                contentValues2.put("experiment_ids_clear_blob", a0qVar2.f());
                contentValues2.put("experiment_ids_encrypted_blob", a0qVar2.g());
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / d);
                    for (int i = 1; i <= ceil; i++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * d, Math.min(i * d, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(a0qVar2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new nn5(longValue, eo5Var, a0qVar);
    }

    @Override // xsna.n0q
    public final boolean R1(eo5 eo5Var) {
        Boolean bool;
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            Long q = q(p, eo5Var);
            if (q == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = p().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{q.toString()});
                try {
                    Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                    rawQuery.close();
                    bool = valueOf;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            p.setTransactionSuccessful();
            p.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            p.endTransaction();
            throw th2;
        }
    }

    @Override // xsna.uon0
    public final <T> T b(uon0.a<T> aVar) {
        SQLiteDatabase p = p();
        zuf zufVar = this.d;
        long C = zufVar.C();
        while (true) {
            try {
                p.beginTransaction();
                try {
                    T execute = aVar.execute();
                    p.setTransactionSuccessful();
                    return execute;
                } finally {
                    p.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (zufVar.C() >= this.e.a() + C) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // xsna.n0q
    public final void d1(Iterable<oy90> iterable) {
        if (iterable.iterator().hasNext()) {
            p().compileStatement("DELETE FROM events WHERE _id in " + t(iterable)).execute();
        }
    }

    @Override // xsna.n0q
    public final long e(sop0 sop0Var) {
        Cursor rawQuery = p().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sop0Var.b(), String.valueOf(acd0.a(sop0Var.d()))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // xsna.n0q
    public final Iterable l(eo5 eo5Var) {
        return (Iterable) r(new vff(this, eo5Var));
    }

    @Override // xsna.klc
    public final void m() {
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            p.compileStatement("DELETE FROM log_event_dropped").execute();
            p.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.c.C()).execute();
            p.setTransactionSuccessful();
        } finally {
            p.endTransaction();
        }
    }

    @Override // xsna.klc
    public final nlc n() {
        nlc.a a2 = nlc.a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            nlc nlcVar = (nlc) v(p.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new uo60(this, hashMap, a2));
            p.setTransactionSuccessful();
            return nlcVar;
        } finally {
            p.endTransaction();
        }
    }

    @Override // xsna.klc
    public final void o(final long j, final LogEventDropped.Reason reason, final String str) {
        r(new a() { // from class: xsna.lyg0
            @Override // xsna.oyg0.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                LogEventDropped.Reason reason2 = reason;
                String num = Integer.toString(reason2.getNumber());
                String str2 = str;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, num});
                try {
                    boolean z = rawQuery.getCount() > 0;
                    rawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL(qlb0.a(j2, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(reason2.getNumber())});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
        });
    }

    public final SQLiteDatabase p() {
        v8h0 v8h0Var = this.b;
        Objects.requireNonNull(v8h0Var);
        zuf zufVar = this.d;
        long C = zufVar.C();
        while (true) {
            try {
                return v8h0Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (zufVar.C() >= this.e.a() + C) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final <T> T r(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            T apply = aVar.apply(p);
            p.setTransactionSuccessful();
            return apply;
        } finally {
            p.endTransaction();
        }
    }

    public final ArrayList s(SQLiteDatabase sQLiteDatabase, final eo5 eo5Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long q = q(sQLiteDatabase, eo5Var);
        if (q == null) {
            return arrayList;
        }
        v(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{q.toString()}, null, null, null, String.valueOf(i)), new a() { // from class: xsna.myg0
            @Override // xsna.oyg0.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    yl5.a aVar = new yl5.a();
                    aVar.f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    aVar.a = string;
                    aVar.d = Long.valueOf(cursor.getLong(2));
                    aVar.e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        aVar.c = new uip(string2 == null ? oyg0.g : new ijp(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        ijp ijpVar = string3 == null ? oyg0.g : new ijp(string3);
                        Cursor query = oyg0.this.p().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i2 += blob.length;
                            }
                            byte[] bArr = new byte[i2];
                            int i3 = 0;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i4);
                                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                                i3 += bArr2.length;
                            }
                            query.close();
                            aVar.c = new uip(ijpVar, bArr);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        aVar.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        aVar.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        aVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        aVar.j = cursor.getBlob(11);
                    }
                    arrayList.add(new nn5(j, eo5Var, aVar.b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // xsna.n0q
    public final Iterable<sop0> u3() {
        return (Iterable) r(new fb20());
    }
}
