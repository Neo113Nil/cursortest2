package xsna;

import android.database.Cursor;
import io.requery.android.database.sqlite.SQLiteCursorDriver;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteQuery;

/* compiled from: CustomSizeCursorFactory.kt */
/* loaded from: classes14.dex */
public class znk implements SQLiteDatabase.CursorFactory {
    public final int a;

    public znk(int i) {
        this.a = i;
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal windowSizeBytes value: "));
        }
    }

    @Override // io.requery.android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return new z17(sQLiteCursorDriver, str, sQLiteQuery, this.a);
    }
}
