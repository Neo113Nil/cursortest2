package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yec0 implements Callable {
    public final /* synthetic */ bfc0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ yec0(bfc0 bfc0Var, long j) {
        this.b = bfc0Var;
        this.c = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        SQLiteDatabase readableDatabase = ((SQLiteOpenHelper) this.b.a.getValue()).getReadableDatabase();
        if (readableDatabase != null) {
            Cursor query = readableDatabase.query("draft", bfc0.b, "uid = ?", new String[]{String.valueOf(this.c)}, null, null, "draft_id DESC", "1");
            if (query != null) {
                try {
                    Long valueOf = query.moveToFirst() ? Long.valueOf(fl3.C(query, "draft_id")) : null;
                    if (valueOf != null) {
                        j = valueOf.longValue();
                        return Long.valueOf(j);
                    }
                } finally {
                    query.close();
                }
            }
        }
        j = -1;
        return Long.valueOf(j);
    }
}
