package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.c;
import defpackage.axt0;
import defpackage.yvf0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\f\"\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/storage/database/b;", "Laxt0;", "Ljava/io/Closeable;", "Lcom/yandex/div/storage/database/c$b;", "db", "<init>", "(Lcom/yandex/div/storage/database/c$b;)V", "", "sql", "Landroid/database/sqlite/SQLiteStatement;", "g", "(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;", "", "selectionArgs", "Lcom/yandex/div/storage/database/ReadState;", "k", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/yandex/div/storage/database/ReadState;", "Lzy11;", "close", "()V", "a", "Lcom/yandex/div/storage/database/c$b;", "", "b", "Ljava/util/List;", "createdStatements", "Landroid/database/Cursor;", "c", "createdCursors", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b implements axt0, Closeable {

    /* renamed from: a, reason: from kotlin metadata */
    private final c.b db;

    /* renamed from: b, reason: from kotlin metadata */
    private final List<SQLiteStatement> createdStatements = new ArrayList();

    /* renamed from: c, reason: from kotlin metadata */
    private final List<Cursor> createdCursors = new ArrayList();

    public b(c.b bVar) {
        this.db = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor c(b bVar, String str, String[] strArr) {
        Cursor S1 = bVar.db.S1(str, strArr);
        bVar.createdCursors.add(S1);
        return S1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            try {
                ((SQLiteStatement) it.next()).close();
            } catch (IOException unused) {
            }
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                try {
                    cursor.close();
                } catch (IOException unused2) {
                }
            }
        }
        this.createdCursors.clear();
    }

    @Override // defpackage.axt0
    public final SQLiteStatement g(String sql) {
        SQLiteStatement g = this.db.g(sql);
        this.createdStatements.add(g);
        return g;
    }

    @Override // defpackage.axt0
    public final ReadState k(final String sql, final String... selectionArgs) {
        return new ReadState(null, new yvf0() { // from class: com.yandex.div.storage.database.a
            @Override // defpackage.yvf0
            public final Object get() {
                Cursor c;
                c = b.c(b.this, sql, selectionArgs);
                return c;
            }
        }, 1, null);
    }
}
