package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;

/* compiled from: SessionSQLiteHelper.kt */
@ozl
/* loaded from: classes11.dex */
public final class lxi0 extends SQLiteOpenHelper {
    public static final List<String> b = e43.l("sessions_authorized", "sessions_exchange");

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE sessions_authorized(\n    token_value TEXT NOT NULL PRIMARY KEY,\n    \n    expires_in_sec INTEGER NOT NULL,\n    created_ms INTEGER NOT NULL,\n    webview_access_token TEXT,\n    webview_refresh_token TEXT,\n    webview_access_token_expired INTEGER,\n    webview_refresh_token_expired INTEGER,                \n    \n    user_id INTEGER NOT NULL UNIQUE,\n    first_name TEXT,\n    last_name TEXT,\n    email TEXT,\n    phone TEXT,\n    avatar TEXT,\n    profile_type INTEGER NOT NULL,\n    \n    user_state TEXT NOT NULL\n)");
        sQLiteDatabase.execSQL("CREATE TABLE sessions_exchange(\n    token_value TEXT NOT NULL PRIMARY KEY,\n    user_id INTEGER NOT NULL UNIQUE,\n    first_name TEXT,\n    last_name TEXT,\n    email TEXT,\n    phone TEXT,\n    avatar TEXT,\n    profile_type INTEGER NOT NULL\n)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
