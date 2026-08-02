package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.vk.log.L;
import java.util.Locale;

/* compiled from: OpenHelper.java */
/* loaded from: classes5.dex */
public final class gr80 extends SQLiteOpenHelper {
    public static volatile gr80 b;

    public static gr80 b(Context context) {
        if (b == null) {
            synchronized (gr80.class) {
                try {
                    if (b == null) {
                        b = new gr80(context.getApplicationContext(), "vk.db", null, 127);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS users");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS birthdays");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS friendlists");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS users_friendlists");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS chats");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS groups");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS news");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wall");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS friends_hints_order");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS imported_contacts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS users_name_cases");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS imported_contacts_service");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS users_cases");
        sQLiteDatabase.execSQL("CREATE TABLE users (uid int not null unique, firstname varchar(150), lastname varchar(150), photo_small varchar(200), photo_big varchar(200), domain varchar(200), is_friend bool, sex int, last_updated int, lists int, bday int default -1, bmonth int default -1, byear int default -1, name_r varchar(150), deactivated text, flags int default 0, is_nft bool default 0)");
        sQLiteDatabase.execSQL("CREATE TABLE users_name_cases (uid int not null, firstname varchar(150), lastname varchar(150), name_case int not null)");
        sQLiteDatabase.execSQL("CREATE INDEX users_cases ON users_name_cases (name_case)");
        sQLiteDatabase.execSQL("CREATE TABLE friendlists (lid int unique, name varchar(200))");
        sQLiteDatabase.execSQL("CREATE TABLE users_friendlists (uid int not null, lid int not null)");
        sQLiteDatabase.execSQL("CREATE TABLE friends_hints_order (uid int not null, list_order int not null)");
        sQLiteDatabase.execSQL("CREATE TABLE imported_contacts (vk_id int not null, external_id varchar(30), external_name varchar(150), external_photo varchar(200), description varchar(300), req_sent bool, service int not null, unique(vk_id, external_id) on conflict replace)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS countries");
        sQLiteDatabase.execSQL("CREATE TABLE countries (id int not null, title text, unique(id) on conflict replace)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cities");
        sQLiteDatabase.execSQL("CREATE TABLE cities (id int not null, title text, unique(id) on conflict replace)");
        sQLiteDatabase.execSQL("CREATE INDEX imported_contacts_service ON imported_contacts (service)");
        sQLiteDatabase.execSQL("CREATE TABLE groups (gid int not null unique, name varchar(200), activity varchar(200), domain varchar(200), count int not null, type int not null, closed int not null)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
        Locale locale = Locale.US;
        L.g("vk", new SQLiteException(efz.a(i, i2, "Trying to downgrade db version from ", " to ")));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }
}
