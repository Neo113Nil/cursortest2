package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: EventsStorage.kt */
/* loaded from: classes.dex */
public final class qwk extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        List b0 = drm0.b0("\n            CREATE TABLE events (\n                event_name TEXT NOT NULL,\n                user_id INT NOT NULL,\n                app_hash TEXT NOT NULL,\n                session_id INT NOT NULL,\n                date INT NOT NULL\n            );\n            CREATE INDEX idx_name_user_id ON events(event_name,user_id);\n\n            CREATE TABLE sessions (\n                session_id INTEGER PRIMARY KEY AUTOINCREMENT\n            );\n        ", new char[]{';'}, 0, 6);
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
        sQLiteDatabase.beginTransaction();
        try {
            hr80.t(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            L.g("vk", new SQLiteException(String.format(Locale.US, "Trying to downgrade db version from %d to %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2))));
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.beginTransaction();
        try {
            hr80.t(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
