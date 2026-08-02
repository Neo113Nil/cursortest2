package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.UUID;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: SequenceDatabase.kt */
/* loaded from: classes5.dex */
public final class wki0 extends SQLiteOpenHelper {
    public wki0(Context context) {
        super(context, "stat_events_sequence.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sequence");
            sQLiteDatabase.execSQL("CREATE TABLE sequence (\nid TEXT PRIMARY KEY,\nnext_value INTEGER NOT NULL DEFAULT 0)");
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("id", UUID.randomUUID().toString());
            contentValues.put("next_value", (Integer) 0);
            s3q0 s3q0Var = s3q0.a;
            sQLiteDatabase.insert(SignalingProtocol.KEY_SEQUENCE, null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
    }
}
