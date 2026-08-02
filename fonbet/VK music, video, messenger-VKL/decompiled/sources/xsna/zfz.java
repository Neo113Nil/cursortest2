package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: ListPersistentEntityCacheImpl.kt */
/* loaded from: classes17.dex */
public final class zfz<T extends Message<?, ?>> extends SQLiteOpenHelper {
    public final Context b;
    public final String c;
    public final ProtoAdapter<T> d;
    public final ReentrantReadWriteLock e;
    public final LinkedHashMap f;
    public final bpn0 g;

    public zfz(Context context, ProtoAdapter protoAdapter) {
        super(context, new File(context.getCacheDir(), "entity_cache_db__".concat("notification_mentions")).getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 2);
        this.b = context;
        this.c = "notification_mentions";
        this.d = protoAdapter;
        this.e = new ReentrantReadWriteLock();
        this.f = new LinkedHashMap();
        this.g = new bpn0(new rkt(this, 8));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE entities (\n                        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                        key TEXT NOT NULL,\n                        value BLOB,\n                        UNIQUE(key) ON CONFLICT REPLACE\n                    )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS entities");
        onCreate(sQLiteDatabase);
    }
}
