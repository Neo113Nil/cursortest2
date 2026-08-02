package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: SQLDatabaseHelper.kt */
/* loaded from: classes17.dex */
public final class gyg0 extends SQLiteOpenHelper {
    public final xke b;
    public final qxn0 c;
    public final nm8 d;

    public gyg0(xke xkeVar, Context context, qxn0 qxn0Var) {
        super(context, "clips_drafts.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.b = xkeVar;
        this.c = qxn0Var;
        nm8 a = w0b.a(Integer.MAX_VALUE, null, null, 6);
        this.d = a;
        new hua(a, false);
    }

    public static ContentValues c(String[] strArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", strArr[0]);
        contentValues.put("json", strArr[1]);
        contentValues.put("is_active", strArr[2]);
        contentValues.put("edit_timestamp", strArr[3]);
        contentValues.put("deleted_at", strArr[4]);
        return contentValues;
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + p() + " (id INTEGER PRIMARY KEY,json TEXT, is_active BIT DEFAULT 0 NOT NULL, edit_timestamp INTEGER, deleted_at INTEGER DEFAULT NULL);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase = super.getReadableDatabase();
        b(readableDatabase);
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        b(writableDatabase);
        return writableDatabase;
    }

    public final String[] m() {
        Cursor rawQuery = getReadableDatabase().rawQuery(zr.a("SELECT * FROM ", p(), " WHERE is_active=? AND deleted_at IS NULL"), new String[]{"1"});
        try {
            rawQuery.moveToFirst();
            String[] strArr = null;
            if (rawQuery.getCount() > 0) {
                String[] strArr2 = new String[5];
                for (int i = 0; i < 5; i++) {
                    strArr2[i] = rawQuery.isNull(i) ? null : rawQuery.getString(i);
                }
                strArr = strArr2;
            } else {
                this.b.d("ClipsDraftsDatabase", "no active draft");
            }
            rawQuery.close();
            return strArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(rawQuery, th);
                throw th2;
            }
        }
    }

    public final String n(String str) {
        String[] o = o(str);
        if (o != null && o[4] == null) {
            return o[1];
        }
        return null;
    }

    public final String[] o(String str) {
        Cursor rawQuery = getReadableDatabase().rawQuery(zr.a("SELECT * FROM ", p(), " WHERE id=?"), new String[]{str});
        try {
            rawQuery.moveToFirst();
            String[] strArr = null;
            if (rawQuery.getCount() > 0) {
                String[] strArr2 = new String[5];
                for (int i = 0; i < 5; i++) {
                    strArr2[i] = rawQuery.isNull(i) ? null : rawQuery.getString(i);
                }
                strArr = strArr2;
            } else {
                this.b.d("ClipsDraftsDatabase", "no draft with id=" + str);
            }
            rawQuery.close();
            return strArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(rawQuery, th);
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name LIKE 'drafts_%'", null);
            while (rawQuery.moveToNext()) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE " + rawQuery.getString(0) + " ADD COLUMN deleted_at INTEGER DEFAULT NULL");
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            ro.e(rawQuery, null);
        }
    }

    public final String p() {
        return (String) this.c.c.getValue();
    }

    public final void q(String str, String str2, boolean z) {
        String[] o = o(str2);
        if (o == null) {
            return;
        }
        ContentValues c = c(o);
        c.put("json", str);
        r(str2, c, z);
        this.d.f(new fdo(str2, z));
    }

    public final void r(String str, ContentValues contentValues, boolean z) {
        String p = p();
        if (z) {
            contentValues.put("edit_timestamp", Long.valueOf(System.currentTimeMillis()));
        }
        getWritableDatabase().update(p, contentValues, "id = ?", new String[]{str});
    }
}
