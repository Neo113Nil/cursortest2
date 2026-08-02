package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FrameworkSQLiteDatabase.android.kt */
/* loaded from: classes.dex */
public final class ogs implements sin0 {
    public static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] d = new String[0];
    public static final Object e;
    public static final Object f;
    public final SQLiteDatabase b;

    /* compiled from: FrameworkSQLiteDatabase.android.kt */
    public static final class a {
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        e = msy.a(lazyThreadSafetyMode, new lnf(4));
        f = msy.a(lazyThreadSafetyMode, new r12(5));
    }

    public ogs(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    @Override // xsna.sin0
    public final void beginTransaction() {
        this.b.beginTransaction();
    }

    @Override // xsna.sin0
    public final void beginTransactionNonExclusive() {
        this.b.beginTransactionNonExclusive();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sin0
    public final void beginTransactionReadOnly() {
        ?? r1 = f;
        if (((Method) r1.getValue()) != null) {
            ?? r2 = e;
            if (((Method) r2.getValue()) != null) {
                Method method = (Method) r1.getValue();
                Object invoke = ((Method) r2.getValue()).invoke(this.b, null);
                if (invoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(invoke, 0, null, 0, null);
                return;
            }
        }
        beginTransaction();
    }

    @Override // xsna.sin0
    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // xsna.sin0
    public final zin0 compileStatement(String str) {
        return new sgs(this.b.compileStatement(str));
    }

    @Override // xsna.sin0
    public final void endTransaction() {
        this.b.endTransaction();
    }

    @Override // xsna.sin0
    public final void execSQL(String str) throws SQLException {
        this.b.execSQL(str);
    }

    @Override // xsna.sin0
    public final List<Pair<String, String>> getAttachedDbs() {
        return this.b.getAttachedDbs();
    }

    @Override // xsna.sin0
    public final String getPath() {
        return this.b.getPath();
    }

    @Override // xsna.sin0
    public final boolean inTransaction() {
        return this.b.inTransaction();
    }

    @Override // xsna.sin0
    public final boolean isOpen() {
        return this.b.isOpen();
    }

    @Override // xsna.sin0
    public final boolean isWriteAheadLoggingEnabled() {
        return this.b.isWriteAheadLoggingEnabled();
    }

    @Override // xsna.sin0
    public final Cursor query(String str) {
        return query(new isj0(str));
    }

    @Override // xsna.sin0
    public final void setTransactionSuccessful() {
        this.b.setTransactionSuccessful();
    }

    @Override // xsna.sin0
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(c[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? StringUtils.COMMA : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        zin0 compileStatement = compileStatement(sb.toString());
        int length2 = objArr2.length;
        int i4 = 0;
        while (i4 < length2) {
            Object obj = objArr2[i4];
            i4++;
            if (obj == null) {
                compileStatement.bindNull(i4);
            } else if (obj instanceof byte[]) {
                compileStatement.bindBlob(i4, (byte[]) obj);
            } else if (obj instanceof Float) {
                compileStatement.bindDouble(i4, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                compileStatement.bindDouble(i4, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                compileStatement.bindLong(i4, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                compileStatement.bindLong(i4, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                compileStatement.bindLong(i4, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                compileStatement.bindLong(i4, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                compileStatement.bindString(i4, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                compileStatement.bindLong(i4, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((sgs) compileStatement).c.executeUpdateDelete();
    }

    @Override // xsna.sin0
    public final void execSQL(String str, Object[] objArr) throws SQLException {
        this.b.execSQL(str, objArr);
    }

    @Override // xsna.sin0
    public final Cursor query(xin0 xin0Var) {
        final mgs mgsVar = new mgs(xin0Var);
        return this.b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: xsna.ngs
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) mgs.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, xin0Var.m(), d, null);
    }
}
