package xsna;

import android.database.Cursor;

/* compiled from: CursorUtil.android.kt */
/* loaded from: classes.dex */
public final class dmk {
    public static final int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String str2;
        int a = a(cursor, str);
        if (a >= 0) {
            return a;
        }
        try {
            str2 = rl3.Z(cursor.getColumnNames(), null, null, null, null, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException(y57.a("column '", str, "' does not exist. Available columns: ", str2));
    }
}
