package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import xsna.epx;

/* compiled from: AndroidDatabaseOpenHelper.kt */
/* loaded from: classes7.dex */
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {
    private final DatabaseManager databaseManager;
    private final SQLiteOpenHelper mSQLiteOpenHelper;
    private final Object mOpenCloseLock = new Object();
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap = new HashMap();

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    public final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database {
        private final SQLiteDatabase mDb;
        private final OpenCloseInfo mOpenCloseInfo;

        public AndroidSQLiteDatabase(SQLiteDatabase sQLiteDatabase, OpenCloseInfo openCloseInfo) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = openCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AndroidDatabaseOpenHelper.this.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public SQLiteStatement compileStatement(String str) {
            return this.mDb.compileStatement(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(String str) {
            this.mDb.execSQL(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public Cursor rawQuery(String str, String[] strArr) {
            return this.mDb.rawQuery(str, strArr);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class DatabaseManager {
        private final SQLiteOpenHelper databaseHelper;
        private SQLiteDatabase readableDatabase;
        private int readableUsersCount;
        private SQLiteDatabase writableDatabase;
        private int writableUsersCount;
        private final Set<Thread> readableUsers = new LinkedHashSet();
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public DatabaseManager(SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }

        public final synchronized void closeDatabase(SQLiteDatabase sQLiteDatabase) {
            try {
                if (epx.f(sQLiteDatabase, this.writableDatabase)) {
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
                } else if (epx.f(sQLiteDatabase, this.readableDatabase)) {
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
                    Assert.fail("Trying to close unknown database from DatabaseManager");
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized SQLiteDatabase openReadableDatabase() {
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            this.readableUsers.add(Thread.currentThread());
            return this.readableDatabase;
        }

        public final synchronized SQLiteDatabase openWritableDatabase() {
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            return this.writableDatabase;
        }
    }

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i) {
            this.currentlyOpenedCount = i;
        }
    }

    public AndroidDatabaseOpenHelper(Context context, String str, int i, final DatabaseOpenHelper.CreateCallback createCallback, final DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                createCallback.onCreate(this.wrapDataBase(sQLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                upgradeCallback.onUpgrade(this.wrapDataBase(sQLiteDatabase), i2, i3);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sQLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            try {
                openCloseInfo = this.mOpenCloseInfoMap.get(sQLiteDatabase);
                if (openCloseInfo == null) {
                    openCloseInfo = new OpenCloseInfo();
                    this.mOpenCloseInfoMap.put(sQLiteDatabase, openCloseInfo);
                }
                openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
                openCloseInfo.getCurrentlyOpenedCount();
            } catch (Throwable th) {
                throw th;
            }
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    public DatabaseOpenHelper.Database getReadableDatabase() {
        return wrapDataBase(this.databaseManager.openReadableDatabase());
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    public DatabaseOpenHelper.Database wrapDataBase(SQLiteDatabase sQLiteDatabase) {
        return new AndroidSQLiteDatabase(sQLiteDatabase, getOpenCloseInfo(sQLiteDatabase));
    }
}
