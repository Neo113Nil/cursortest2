package xsna;

import io.requery.android.database.sqlite.SQLiteCursor;
import io.requery.android.database.sqlite.SQLiteCursorDriver;
import io.requery.android.database.sqlite.SQLiteQuery;

/* compiled from: BigSQLiteCursor.kt */
/* loaded from: classes14.dex */
public final class z17 extends SQLiteCursor {
    public final int b;

    public z17(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery, int i) {
        super(sQLiteCursorDriver, str, sQLiteQuery);
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal windowSizeBytes value: "));
        }
    }

    @Override // io.requery.android.database.AbstractWindowedCursor
    public final Integer getWindowSizeBytes() {
        return Integer.valueOf(this.b);
    }
}
