package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class fyz0 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(k901 k901Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        Throwable th;
        Cursor cursor;
        if (k901Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        ?? r3 = 0;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e) {
                    e = e;
                    k901Var.l.c("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    try {
                        HashSet hashSet = new HashSet();
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(StringUtils.COMMA)) {
                                if (!hashSet.remove(str4)) {
                                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                                }
                            }
                            if (strArr != null) {
                                for (int i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            k901Var.l.c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    } catch (SQLiteException e2) {
                        k901Var.i.b(str, "Failed to verify columns on table that was just created");
                        throw e2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r3 = str2;
                if (r3 != 0) {
                    throw th;
                }
                r3.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            if (r3 != 0) {
            }
        }
    }

    public static void b(k901 k901Var, SQLiteDatabase sQLiteDatabase) {
        if (k901Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        i901 i901Var = k901Var.l;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            i901Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            i901Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            i901Var.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        i901Var.a("Failed to turn on database write permission for owner");
    }
}
