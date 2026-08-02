package com.yandex.go.sql;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.jst;
import defpackage.oz4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\b\b \u0018\u0000 &2\u00020\u0001:\u0001'B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0014J-\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040 \"\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/yandex/go/sql/BaseDatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "", "version", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "", "tableNames", "()Ljava/util/Collection;", "tableCreateCommands", "Landroid/database/sqlite/SQLiteDatabase;", "db", "Lzy11;", "onUpgradeToVersionStep", "(Landroid/database/sqlite/SQLiteDatabase;I)V", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "onDowngrade", "recreateDb", "table", "column", "type", "addColumn", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "dropTables", "(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "oz4", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseDatabaseHelper extends SQLiteOpenHelper {
    public static final oz4 Companion = new oz4();
    public static final String TYPE_INTEGER = "INTEGER";
    public static final String TYPE_TEXT = "TEXT";
    private final Context context;

    public BaseDatabaseHelper(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.context = context;
    }

    public final void addColumn(SQLiteDatabase db, String table, String column, String type) {
        try {
            db.execSQL("ALTER TABLE " + table + " ADD COLUMN " + column + " " + type);
        } catch (SQLException unused) {
            jst.e.getClass();
        }
    }

    public final void dropTables(SQLiteDatabase db, String... tableNames) {
        for (String str : tableNames) {
            db.execSQL("DROP TABLE IF EXISTS " + str);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Iterator<String> it = tableCreateCommands().iterator();
        while (it.hasNext()) {
            db.execSQL(it.next());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        jst.e.getClass();
        recreateDb(db);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        jst.e.getClass();
        int i = oldVersion + 1;
        if (i > newVersion) {
            return;
        }
        while (true) {
            try {
                onUpgradeToVersionStep(db, i);
                if (i == newVersion) {
                    return;
                } else {
                    i++;
                }
            } catch (Exception e) {
                jst.e.k(e, "Exception trying to update database");
                recreateDb(db);
                return;
            }
        }
    }

    public abstract void onUpgradeToVersionStep(SQLiteDatabase db, int version);

    public final void recreateDb(SQLiteDatabase db) {
        String[] strArr = (String[]) tableNames().toArray(new String[0]);
        dropTables(db, (String[]) Arrays.copyOf(strArr, strArr.length));
        onCreate(db);
    }

    public abstract Collection<String> tableCreateCommands();

    public abstract Collection<String> tableNames();
}
