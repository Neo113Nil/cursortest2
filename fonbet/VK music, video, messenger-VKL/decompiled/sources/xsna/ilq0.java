package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: UserPlacesEntityCache.kt */
/* loaded from: classes5.dex */
public final class ilq0<T> {
    public final a<T> a;

    /* compiled from: UserPlacesEntityCache.kt */
    public interface a<T> {
        int a(T t);

        void b(SQLiteDatabase sQLiteDatabase);

        ContentValues c(T t);

        T d(ContentValues contentValues);

        String getTableName();
    }

    public ilq0(a<T> aVar) {
        this.a = aVar;
    }
}
