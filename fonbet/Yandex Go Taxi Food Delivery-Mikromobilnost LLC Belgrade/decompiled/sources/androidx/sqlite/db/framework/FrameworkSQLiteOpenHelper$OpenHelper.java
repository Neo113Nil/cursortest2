package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import defpackage.hkw0;
import defpackage.jkw0;
import defpackage.k4o;
import defpackage.ufs;
import defpackage.vfs;
import defpackage.w511;
import defpackage.w5f0;
import defpackage.wfs;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 92\u00020\u0001:\u0003:;<B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00101¨\u0006="}, d2 = {"androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Lvfs;", "dbRef", "Ljkw0;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lvfs;Ljkw0;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "innerGetDatabase", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "getWritableOrReadableDatabase", "Lhkw0;", "getSupportDatabase", "(Z)Lhkw0;", "sqLiteDatabase", "Lufs;", "getWrappedDb", "(Landroid/database/sqlite/SQLiteDatabase;)Lufs;", "Lzy11;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lvfs;", "getDbRef", "()Lvfs;", "Ljkw0;", "getCallback", "()Ljkw0;", "Z", "getAllowDataLossOnRecovery", "()Z", "migrated", "Lw5f0;", "lock", "Lw5f0;", "opened", "Companion", "CallbackException", "CallbackName", "wfs", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class FrameworkSQLiteOpenHelper$OpenHelper extends SQLiteOpenHelper {
    public static final wfs Companion = new wfs();
    private final boolean allowDataLossOnRecovery;
    private final jkw0 callback;
    private final Context context;
    private final vfs dbRef;
    private final w5f0 lock;
    private boolean migrated;
    private boolean opened;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "a", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallbackException extends RuntimeException {
        private final CallbackName callbackName;
        private final Throwable cause;

        public CallbackException(CallbackName callbackName, Throwable th) {
            super(th);
            this.callbackName = callbackName;
            this.cause = th;
        }

        /* renamed from: a, reason: from getter */
        public final CallbackName getCallbackName() {
            return this.callbackName;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class CallbackName {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CallbackName[] $VALUES;
        public static final CallbackName ON_CONFIGURE;
        public static final CallbackName ON_CREATE;
        public static final CallbackName ON_DOWNGRADE;
        public static final CallbackName ON_OPEN;
        public static final CallbackName ON_UPGRADE;

        static {
            CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
            ON_CONFIGURE = callbackName;
            CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
            ON_CREATE = callbackName2;
            CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
            ON_UPGRADE = callbackName3;
            CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
            ON_DOWNGRADE = callbackName4;
            CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
            ON_OPEN = callbackName5;
            CallbackName[] callbackNameArr = {callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            $VALUES = callbackNameArr;
            $ENTRIES = kotlin.enums.a.a(callbackNameArr);
        }

        public static CallbackName valueOf(String str) {
            return (CallbackName) Enum.valueOf(CallbackName.class, str);
        }

        public static CallbackName[] values() {
            return (CallbackName[]) $VALUES.clone();
        }
    }

    public FrameworkSQLiteOpenHelper$OpenHelper(Context context, String str, final vfs vfsVar, final jkw0 jkw0Var, boolean z) {
        super(context, str, null, jkw0Var.a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                FrameworkSQLiteOpenHelper$OpenHelper._init_$lambda$0(jkw0.this, vfsVar, sQLiteDatabase);
            }
        });
        this.context = context;
        this.dbRef = vfsVar;
        this.callback = jkw0Var;
        this.allowDataLossOnRecovery = z;
        this.lock = new w5f0(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(jkw0 jkw0Var, vfs vfsVar, SQLiteDatabase sQLiteDatabase) {
        Companion.getClass();
        ufs ufsVar = vfsVar.a;
        if (ufsVar == null || !ufsVar.a.equals(sQLiteDatabase)) {
            ufsVar = new ufs(sQLiteDatabase);
            vfsVar.a = ufsVar;
        }
        SQLiteDatabase sQLiteDatabase2 = ufsVar.a;
        jkw0Var.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ufsVar + ".path");
        if (!sQLiteDatabase2.isOpen()) {
            String path = sQLiteDatabase2.getPath();
            if (path != null) {
                jkw0.a(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        jkw0.a((String) ((Pair) it.next()).second);
                    }
                } else {
                    String path2 = sQLiteDatabase2.getPath();
                    if (path2 != null) {
                        jkw0.a(path2);
                    }
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            ufsVar.close();
        } catch (IOException unused2) {
        }
        if (list != null) {
            return;
        }
    }

    private final SQLiteDatabase getWritableOrReadableDatabase(boolean writable) {
        return writable ? getWritableDatabase() : getReadableDatabase();
    }

    private final SQLiteDatabase innerGetDatabase(boolean writable) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z = this.opened;
        if (databaseName != null && !z && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return getWritableOrReadableDatabase(writable);
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return this.getWritableOrReadableDatabase(writable);
            } catch (Throwable th) {
                th = th;
                if (th instanceof CallbackException) {
                    CallbackException callbackException = (CallbackException) th;
                    Throwable cause = callbackException.getCause();
                    int i = c.a[callbackException.getCallbackName().ordinal()];
                    if (i == 1) {
                        throw cause;
                    }
                    if (i == 2) {
                        throw cause;
                    }
                    if (i == 3) {
                        throw cause;
                    }
                    if (i == 4) {
                        throw cause;
                    }
                    if (i != 5) {
                        w511.b();
                        return null;
                    }
                    if (!(cause instanceof SQLiteException)) {
                        throw cause;
                    }
                    th = cause;
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                    throw th;
                }
                this.context.deleteDatabase(databaseName);
                try {
                    return this.getWritableOrReadableDatabase(writable);
                } catch (CallbackException e) {
                    throw e.getCause();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        try {
            w5f0 w5f0Var = this.lock;
            w5f0Var.a(w5f0Var.a);
            super.close();
            this.dbRef.a = null;
            this.opened = false;
        } finally {
            this.lock.b();
        }
    }

    public final boolean getAllowDataLossOnRecovery() {
        return this.allowDataLossOnRecovery;
    }

    public final jkw0 getCallback() {
        return this.callback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final vfs getDbRef() {
        return this.dbRef;
    }

    public final hkw0 getSupportDatabase(boolean writable) {
        hkw0 wrappedDb;
        try {
            this.lock.a((this.opened || getDatabaseName() == null) ? false : true);
            this.migrated = false;
            SQLiteDatabase innerGetDatabase = innerGetDatabase(writable);
            if (this.migrated) {
                close();
                wrappedDb = getSupportDatabase(writable);
            } else {
                wrappedDb = getWrappedDb(innerGetDatabase);
            }
            this.lock.b();
            return wrappedDb;
        } catch (Throwable th) {
            this.lock.b();
            throw th;
        }
    }

    public final ufs getWrappedDb(SQLiteDatabase sqLiteDatabase) {
        wfs wfsVar = Companion;
        vfs vfsVar = this.dbRef;
        wfsVar.getClass();
        ufs ufsVar = vfsVar.a;
        if (ufsVar != null && ufsVar.a.equals(sqLiteDatabase)) {
            return ufsVar;
        }
        ufs ufsVar2 = new ufs(sqLiteDatabase);
        vfsVar.a = ufsVar2;
        return ufsVar2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase db) {
        if (!this.migrated && this.callback.a != db.getVersion()) {
            db.setMaxSqlCacheSize(1);
        }
        try {
            jkw0 jkw0Var = this.callback;
            getWrappedDb(db);
            jkw0Var.getClass();
        } catch (Throwable th) {
            throw new CallbackException(CallbackName.ON_CONFIGURE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            this.callback.b(getWrappedDb(sqLiteDatabase));
        } catch (Throwable th) {
            throw new CallbackException(CallbackName.ON_CREATE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.migrated = true;
        try {
            this.callback.c(getWrappedDb(db), oldVersion, newVersion);
        } catch (Throwable th) {
            throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase db) {
        if (!this.migrated) {
            try {
                this.callback.d(getWrappedDb(db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_OPEN, th);
            }
        }
        this.opened = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        this.migrated = true;
        try {
            this.callback.e(getWrappedDb(sqLiteDatabase), oldVersion, newVersion);
        } catch (Throwable th) {
            throw new CallbackException(CallbackName.ON_UPGRADE, th);
        }
    }
}
