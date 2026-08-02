package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.vk.instantjobs.exceptions.JobException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultStorageManager.kt */
/* loaded from: classes.dex */
public final class uml implements ygl0 {
    public final a a;
    public boolean b;

    public uml(Context context, String str) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("dbName is blank");
        }
        this.a = new a(context, str, null, 1);
    }

    @Override // xsna.ygl0
    public final synchronized t7x a(long j, String str, String str2) {
        long executeInsert;
        d();
        SQLiteStatement compileStatement = this.a.getWritableDatabase().compileStatement("INSERT INTO instant_jobs (time, type, args) VALUES (?,?,?)");
        try {
            compileStatement.bindLong(1, j);
            compileStatement.bindString(2, str);
            compileStatement.bindString(3, str2);
            executeInsert = compileStatement.executeInsert();
            compileStatement.close();
            if (executeInsert < 0 || executeInsert > 2147483647L) {
                throw new JobException("Unexpected auto-generated job.id value = " + executeInsert);
            }
        } finally {
        }
        return new t7x((int) executeInsert, str, str2, j);
    }

    @Override // xsna.ygl0
    public final synchronized void b(int i, String str) {
        d();
        SQLiteStatement compileStatement = this.a.getWritableDatabase().compileStatement("UPDATE instant_jobs SET args = ? WHERE id = ?");
        try {
            compileStatement.bindString(1, str);
            compileStatement.bindLong(2, i);
            compileStatement.executeUpdateDelete();
            compileStatement.close();
        } finally {
        }
    }

    @Override // xsna.ygl0
    public final synchronized void c(int i) {
        d();
        this.a.getWritableDatabase().execSQL("DELETE FROM instant_jobs WHERE id = ?", new Integer[]{Integer.valueOf(i)});
    }

    public final synchronized void d() {
        if (this.b) {
            throw new IllegalStateException("Instance is released");
        }
    }

    @Override // xsna.ygl0
    public final synchronized ArrayList getAll() {
        ArrayList arrayList;
        d();
        Cursor rawQuery = this.a.getWritableDatabase().rawQuery("SELECT * FROM instant_jobs", null);
        arrayList = new ArrayList(rawQuery.getCount());
        try {
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    arrayList.add(new t7x(rawQuery.getInt(rawQuery.getColumnIndexOrThrow("id")), rawQuery.getString(rawQuery.getColumnIndexOrThrow("type")), rawQuery.getString(rawQuery.getColumnIndexOrThrow("args")), rawQuery.getLong(rawQuery.getColumnIndexOrThrow("time"))));
                    rawQuery.moveToNext();
                }
            }
            s3q0 s3q0Var = s3q0.a;
            rawQuery.close();
        } finally {
        }
        return arrayList;
    }

    /* compiled from: DefaultStorageManager.kt */
    public static final class a extends SQLiteOpenHelper {
        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            List b0 = drm0.b0("\n                CREATE TABLE instant_jobs (\n                    id INTEGER PRIMARY KEY AUTOINCREMENT,\n                    time INT NOT NULL,\n                    type TEXT NOT NULL,\n                    args TEXT NOT NULL\n                );\n            ", new char[]{';'}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : b0) {
                if (!drm0.N((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL((String) it.next());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}
