package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import java.util.ArrayList;

/* compiled from: DatabaseCache.kt */
/* loaded from: classes.dex */
public final class fwk extends SQLiteOpenHelper {
    public static final /* synthetic */ int c = 0;
    public final int b;

    /* compiled from: DatabaseCache.kt */
    public static final class a {
        public static final String a() {
            int i = fwk.c;
            return Build.FINGERPRINT + '_' + BuildInfo.d;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fwk() {
        super(r0 == null ? null : r0, "AppStateCache.db", (SQLiteDatabase.CursorFactory) null, 3);
        Context context = e43.a;
        this.b = 128;
    }

    public final String b(String str, String str2) {
        String str3;
        Cursor rawQuery = getWritableDatabase().rawQuery("SELECT * FROM " + str2 + " WHERE uid = '" + str + '\'', null);
        ArrayList arrayList = new ArrayList(rawQuery.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        String E = fl3.E(rawQuery, HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
                        String a2 = a.a();
                        if (TextUtils.equals(a2, E)) {
                            str3 = fl3.E(rawQuery, "data");
                        } else {
                            L.G("AppStateCache", y57.a("DATA store: fingerprint changed ", a2, " -> ", E));
                            str3 = null;
                        }
                        arrayList.add(str3);
                        rawQuery.moveToNext();
                    }
                }
                Trace.endSection();
                if (arrayList.size() > 0) {
                    return (String) arrayList.get(0);
                }
                return null;
            } finally {
                rawQuery.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int c(String str) {
        try {
            Integer J = fl3.J(getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ".concat(str), null));
            if (J != null) {
                return J.intValue();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final boolean h(String str, String str2) {
        int c2 = c("app_state_cache");
        int i = this.b;
        if (c2 > i) {
            String a2 = uqi.a("DELETE FROM app_state_cache WHERE id IN (SELECT id FROM app_state_cache ORDER BY id ASC LIMIT ", (c2 - i) + 1, ')');
            L.e("AppStateCache", "TRIM store REGULAR");
            getWritableDatabase().execSQL(a2);
        }
        SQLiteStatement compileStatement = getWritableDatabase().compileStatement("INSERT INTO app_state_cache (uid, data, fingerprint) VALUES (?,?,?)");
        try {
            compileStatement.bindString(1, str);
            compileStatement.bindString(2, str2);
            compileStatement.bindString(3, a.a());
            long executeInsert = compileStatement.executeInsert();
            compileStatement.close();
            return executeInsert >= 0;
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("\n            CREATE TABLE app_state_cache (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                uid TEXT NOT NULL,\n                data TEXT NOT NULL,\n                fingerprint TEXT NOT NULL\n            );\n        ");
        sQLiteDatabase.execSQL("\n            CREATE TABLE app_persistent_state_cache (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                uid TEXT NOT NULL,\n                data TEXT NOT NULL,\n                fingerprint TEXT NOT NULL,\n                keep_until_ms INTEGER\n            );\n        ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        fl3.k(sQLiteDatabase, new gj80(sQLiteDatabase, 16));
        sQLiteDatabase.execSQL("\n            CREATE TABLE app_state_cache (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                uid TEXT NOT NULL,\n                data TEXT NOT NULL,\n                fingerprint TEXT NOT NULL\n            );\n        ");
        sQLiteDatabase.execSQL("\n            CREATE TABLE app_persistent_state_cache (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                uid TEXT NOT NULL,\n                data TEXT NOT NULL,\n                fingerprint TEXT NOT NULL,\n                keep_until_ms INTEGER\n            );\n        ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
