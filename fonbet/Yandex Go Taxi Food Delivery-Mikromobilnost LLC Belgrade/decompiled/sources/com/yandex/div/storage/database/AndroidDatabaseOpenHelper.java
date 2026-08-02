package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.c;
import defpackage.jl40;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001:\u0003\u0017\u0011\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100 8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper;", "Lcom/yandex/div/storage/database/c;", "Landroid/content/Context;", "context", "", "name", "", "version", "Lcom/yandex/div/storage/database/c$a;", "ccb", "Lcom/yandex/div/storage/database/c$c;", "ucb", "<init>", "(Landroid/content/Context;Ljava/lang/String;ILcom/yandex/div/storage/database/c$a;Lcom/yandex/div/storage/database/c$c;)V", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$c;", "b", "(Landroid/database/sqlite/SQLiteDatabase;)Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$c;", "Lcom/yandex/div/storage/database/c$b;", "c", "(Landroid/database/sqlite/SQLiteDatabase;)Lcom/yandex/div/storage/database/c$b;", "Landroid/database/sqlite/SQLiteOpenHelper;", "a", "Landroid/database/sqlite/SQLiteOpenHelper;", "mSQLiteOpenHelper", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$b;", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$b;", "databaseManager", "", "Ljava/lang/Object;", "mOpenCloseLock", "", "d", "Ljava/util/Map;", "mOpenCloseInfoMap", "getReadableDatabase", "()Lcom/yandex/div/storage/database/c$b;", "readableDatabase", "getWritableDatabase", "writableDatabase", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class AndroidDatabaseOpenHelper implements com.yandex.div.storage.database.c {

    /* renamed from: a, reason: from kotlin metadata */
    private final SQLiteOpenHelper mSQLiteOpenHelper;

    /* renamed from: b, reason: from kotlin metadata */
    private final b databaseManager;

    /* renamed from: c, reason: from kotlin metadata */
    private final Object mOpenCloseLock = new Object();

    /* renamed from: d, reason: from kotlin metadata */
    private final Map<SQLiteDatabase, c> mOpenCloseInfoMap = new HashMap();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJm\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\b2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$a;", "Lcom/yandex/div/storage/database/c$b;", "Landroid/database/sqlite/SQLiteDatabase;", "mDb", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$c;", "mOpenCloseInfo", "<init>", "(Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper;Landroid/database/sqlite/SQLiteDatabase;Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$c;)V", "", "sql", "Lzy11;", "r", "(Ljava/lang/String;)V", "table", "", "columns", "selection", "selectionArgs", "groupBy", "having", "orderBy", "limit", "Landroid/database/Cursor;", "m1", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "query", "S1", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", CoreConstants.PushMessage.SERVICE_TYPE, "()V", "s", "t", "Landroid/database/sqlite/SQLiteStatement;", "g", "(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;", "close", "a", "Landroid/database/sqlite/SQLiteDatabase;", "b", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$c;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a implements c.b {

        /* renamed from: a, reason: from kotlin metadata */
        private final SQLiteDatabase mDb;

        /* renamed from: b, reason: from kotlin metadata */
        private final c mOpenCloseInfo;

        public a(SQLiteDatabase sQLiteDatabase, c cVar) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = cVar;
        }

        @Override // com.yandex.div.storage.database.c.b
        public final Cursor S1(String query, String[] selectionArgs) {
            return this.mDb.rawQuery(query, selectionArgs);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            AndroidDatabaseOpenHelper.this.databaseManager.a(this.mDb);
        }

        @Override // com.yandex.div.storage.database.c.b
        public final SQLiteStatement g(String sql) {
            return this.mDb.compileStatement(sql);
        }

        @Override // com.yandex.div.storage.database.c.b
        public final void i() {
            this.mDb.beginTransaction();
        }

        @Override // com.yandex.div.storage.database.c.b
        public final Cursor m1(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {
            return this.mDb.query(table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
        }

        @Override // com.yandex.div.storage.database.c.b
        public final void r(String sql) {
            this.mDb.execSQL(sql);
        }

        @Override // com.yandex.div.storage.database.c.b
        public final void s() {
            this.mDb.setTransactionSuccessful();
        }

        @Override // com.yandex.div.storage.database.c.b
        public final void t() {
            this.mDb.endTransaction();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$b;", "", "Landroid/database/sqlite/SQLiteOpenHelper;", "databaseHelper", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "Landroid/database/sqlite/SQLiteDatabase;", "c", "()Landroid/database/sqlite/SQLiteDatabase;", "b", "mDb", "Lzy11;", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteOpenHelper;", "", "Ljava/lang/Thread;", "Ljava/util/Set;", "readableUsers", "", CA20Status.STATUS_USER_I, "readableUsersCount", "d", "Landroid/database/sqlite/SQLiteDatabase;", "readableDatabase", "e", "writableUsers", "f", "writableUsersCount", "g", "writableDatabase", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: from kotlin metadata */
        private final SQLiteOpenHelper databaseHelper;

        /* renamed from: c, reason: from kotlin metadata */
        private int readableUsersCount;

        /* renamed from: d, reason: from kotlin metadata */
        private SQLiteDatabase readableDatabase;

        /* renamed from: f, reason: from kotlin metadata */
        private int writableUsersCount;

        /* renamed from: g, reason: from kotlin metadata */
        private SQLiteDatabase writableDatabase;

        /* renamed from: b, reason: from kotlin metadata */
        private final Set<Thread> readableUsers = new LinkedHashSet();

        /* renamed from: e, reason: from kotlin metadata */
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public b(SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }

        public final synchronized void a(SQLiteDatabase mDb) {
            try {
                if (jl40.l(mDb, this.writableDatabase)) {
                    this.writableUsers.remove(Thread.currentThread());
                    if (this.writableUsers.isEmpty()) {
                        while (true) {
                            int i = this.writableUsersCount;
                            this.writableUsersCount = i - 1;
                            if (i <= 0) {
                                break;
                            } else {
                                this.writableDatabase.close();
                            }
                        }
                    }
                } else if (jl40.l(mDb, this.readableDatabase)) {
                    this.readableUsers.remove(Thread.currentThread());
                    if (this.readableUsers.isEmpty()) {
                        while (true) {
                            int i2 = this.readableUsersCount;
                            this.readableUsersCount = i2 - 1;
                            if (i2 <= 0) {
                                break;
                            } else {
                                this.readableDatabase.close();
                            }
                        }
                    }
                } else {
                    mDb.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized SQLiteDatabase b() {
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            this.readableUsers.add(Thread.currentThread());
            return this.readableDatabase;
        }

        public final synchronized SQLiteDatabase c() {
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            return this.writableDatabase;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$c;", "", "<init>", "()V", "", "a", CA20Status.STATUS_USER_I, "()I", "b", "(I)V", "currentlyOpenedCount", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: from kotlin metadata */
        private int currentlyOpenedCount;

        /* renamed from: a, reason: from getter */
        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void b(int i) {
            this.currentlyOpenedCount = i;
        }
    }

    public AndroidDatabaseOpenHelper(Context context, String str, int i, final c.a aVar, final c.InterfaceC0036c interfaceC0036c) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(SQLiteDatabase db) {
                db.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sqLiteDatabase) {
                aVar.a(this.c(sqLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
                interfaceC0036c.a(this.c(sqLiteDatabase), oldVersion, newVersion);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new b(sQLiteOpenHelper);
    }

    private c b(SQLiteDatabase sqLiteDatabase) {
        c cVar;
        synchronized (this.mOpenCloseLock) {
            try {
                cVar = this.mOpenCloseInfoMap.get(sqLiteDatabase);
                if (cVar == null) {
                    cVar = new c();
                    this.mOpenCloseInfoMap.put(sqLiteDatabase, cVar);
                }
                cVar.b(cVar.getCurrentlyOpenedCount() + 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final c.b c(SQLiteDatabase sqLiteDatabase) {
        return new a(sqLiteDatabase, b(sqLiteDatabase));
    }

    @Override // com.yandex.div.storage.database.c
    public final c.b getReadableDatabase() {
        return c(this.databaseManager.b());
    }

    @Override // com.yandex.div.storage.database.c
    public final c.b getWritableDatabase() {
        return c(this.databaseManager.c());
    }
}
