package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/c;", "", "Lcom/yandex/div/storage/database/c$b;", "getReadableDatabase", "()Lcom/yandex/div/storage/database/c$b;", "readableDatabase", "getWritableDatabase", "writableDatabase", "a", "b", "c", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/c$a;", "", "Lcom/yandex/div/storage/database/c$b;", "db", "Lzy11;", "a", "(Lcom/yandex/div/storage/database/c$b;)V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a(b db);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006Jm\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/c$b;", "Ljava/io/Closeable;", "", "sql", "Lzy11;", "r", "(Ljava/lang/String;)V", "table", "", "columns", "selection", "selectionArgs", "groupBy", "having", "orderBy", "limit", "Landroid/database/Cursor;", "m1", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "query", "S1", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", CoreConstants.PushMessage.SERVICE_TYPE, "()V", "s", "t", "Landroid/database/sqlite/SQLiteStatement;", "g", "(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b extends Closeable {
        Cursor S1(String query, String[] selectionArgs);

        SQLiteStatement g(String sql);

        void i();

        Cursor m1(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit);

        void r(String sql);

        void s();

        void t();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/c$c;", "", "Lcom/yandex/div/storage/database/c$b;", "db", "", "oldVersion", "newVersion", "Lzy11;", "a", "(Lcom/yandex/div/storage/database/c$b;II)V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.storage.database.c$c, reason: collision with other inner class name */
    public interface InterfaceC0036c {
        void a(b db, int oldVersion, int newVersion);
    }

    b getReadableDatabase();

    b getWritableDatabase();
}
