package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes.dex */
public final class v8h0 extends SQLiteOpenHelper {
    public static final String d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int e = 7;
    public static final List<a> f = Arrays.asList(new o8h0(), new p8h0(), new q8h0(), new r8h0(), new s8h0(), new t8h0(), new u8h0());
    public final int b;
    public boolean c;

    /* compiled from: SchemaManager.java */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public v8h0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.c = false;
        this.b = i;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = f;
        if (i2 <= list.size()) {
            while (i < i2) {
                list.get(i).a(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder a2 = odj.a(i, i2, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
            a2.append(list.size());
            a2.append(" migrations are provided");
            throw new IllegalArgumentException(a2.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.c) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, this.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.c) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.c) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, i, i2);
    }
}
