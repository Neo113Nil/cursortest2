package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.e9e0;

/* compiled from: StorageStatementExecutor.kt */
/* loaded from: classes7.dex */
final class ClosableSqlCompiler implements SqlCompiler, Closeable {
    private final DatabaseOpenHelper.Database db;
    private final List<SQLiteStatement> createdStatements = new ArrayList();
    private final List<Cursor> createdCursors = new ArrayList();

    public ClosableSqlCompiler(DatabaseOpenHelper.Database database) {
        this.db = database;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor compileQuery$lambda$2(ClosableSqlCompiler closableSqlCompiler, String str, String[] strArr) {
        Cursor rawQuery = closableSqlCompiler.db.rawQuery(str, strArr);
        closableSqlCompiler.createdCursors.add(rawQuery);
        return rawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            SqlExtensionsKt.closeSilently((SQLiteStatement) it.next());
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                SqlExtensionsKt.closeSilently(cursor);
            }
        }
        this.createdCursors.clear();
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    public ReadState compileQuery(final String str, final String... strArr) {
        return new ReadState(null, new e9e0() { // from class: com.yandex.div.storage.database.a
            @Override // xsna.e9e0
            public final Object get() {
                Cursor compileQuery$lambda$2;
                compileQuery$lambda$2 = ClosableSqlCompiler.compileQuery$lambda$2(ClosableSqlCompiler.this, str, strArr);
                return compileQuery$lambda$2;
            }
        }, 1, null);
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    public SQLiteStatement compileStatement(String str) {
        SQLiteStatement compileStatement = this.db.compileStatement(str);
        this.createdStatements.add(compileStatement);
        return compileStatement;
    }
}
