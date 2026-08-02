package com.yandex.go.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.as21;
import defpackage.h6r;
import defpackage.i5m;
import defpackage.jst;
import defpackage.scc;
import defpackage.wwg;
import defpackage.zzf;
import java.util.Collection;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.am.w;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/sql/DatabaseHelper;", "Lcom/yandex/go/sql/BaseDatabaseHelper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/database/sqlite/SQLiteDatabase;", "db", "Lzy11;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "", "tableNames", "()Ljava/util/Collection;", "tableCreateCommands", "", "version", "onUpgradeToVersionStep", "(Landroid/database/sqlite/SQLiteDatabase;I)V", "", "isOldDbExists", "()Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatabaseHelper extends BaseDatabaseHelper {
    public DatabaseHelper(Context context) {
        super(context, "ru.yandex.taxi.db", 148);
    }

    private final boolean isOldDbExists() {
        return getContext().getDatabasePath("ru_yandex_taxi.db").exists();
    }

    @Override // com.yandex.go.sql.BaseDatabaseHelper, android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        super.onCreate(db);
        if (isOldDbExists()) {
            getContext().deleteDatabase("ru_yandex_taxi.db");
        } else {
            ((as21) ((zzf) ((h6r) wwg.e(getContext(), h6r.class))).H.get()).e("FIELD_DONT_SMS", true);
        }
    }

    @Override // com.yandex.go.sql.BaseDatabaseHelper
    public void onUpgradeToVersionStep(SQLiteDatabase db, int version) {
        switch (version) {
            case 120:
            case Constants.VPN_TRAFFIC /* 121 */:
            case 122:
            case HProv.PP_PASSWD_TERM /* 123 */:
            case HProv.PP_SAME_MEDIA /* 124 */:
            case HProv.PP_DELETE_KEYSET /* 125 */:
            case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
            case HProv.PP_SECURITY_LEVEL /* 129 */:
            case 130:
            case HProv.PP_CONTAINER_EXTENSION /* 132 */:
            case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
            case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
            case HProv.PP_CONTAINER_DEFAULT /* 135 */:
            case HProv.PP_LCD_QUERY /* 136 */:
            case HProv.PP_ENUM_LOG /* 137 */:
            case HProv.PP_VERSION_EX /* 138 */:
            case 143:
            case 144:
                break;
            case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                db.execSQL("CREATE TABLE IF NOT EXISTS orderchat (_id INTEGER PRIMARY KEY, unique_id INTEGER, order_id TEXT, message_id TEXT, sender_role TEXT, sender_nick TEXT, location_lat INTEGER, location_lon INTEGER, text TEXT, created_date INTEGER, action TEXT, is_read INTEGER, language TEXT, translation_language TEXT, translation_text TEXT);");
                db.execSQL("CREATE TABLE IF NOT EXISTS orderchat_pending (_id INTEGER PRIMARY KEY, unique_id INTEGER, order_id TEXT, location_lat INTEGER, location_lon INTEGER, text TEXT, suggestion_alias TEXT, created_date INTEGER);");
                break;
            case 128:
                dropTables(db, "geofences_v2");
                db.execSQL("CREATE TABLE IF NOT EXISTS geofences_v2 (_id INTEGER PRIMARY KEY, analytics_id TEXT, lat REAL, lon REAL, radius REAL, title TEXT, message TEXT, geofence_id TEXT, ban_time INTEGER, expiration_duration_millis INTEGER, show_notification INTEGER, hash TEXT);");
                db.execSQL("CREATE TABLE IF NOT EXISTS geofences_bans (_id INTEGER PRIMARY KEY, ban_tag TEXT NOT NULL UNIQUE, ban_time INTEGER);");
                break;
            case HProv.PP_FAST_CODE /* 131 */:
                addColumn(db, "orderchat", "language", BaseDatabaseHelper.TYPE_TEXT);
                addColumn(db, "orderchat", "translation_language", BaseDatabaseHelper.TYPE_TEXT);
                addColumn(db, "orderchat", "translation_text", BaseDatabaseHelper.TYPE_TEXT);
                break;
            case 139:
                dropTables(db, "drivers", "order_requirements", "order_extras", "delay_order");
                break;
            case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                addColumn(db, "geofences_v2", "hash", BaseDatabaseHelper.TYPE_INTEGER);
                break;
            case 141:
                db.execSQL("CREATE TABLE IF NOT EXISTS brandings (_id INTEGER PRIMARY KEY, type TEXT, match_info TEXT, content TEXT);");
                break;
            case 142:
                zzf zzfVar = (zzf) ((h6r) wwg.e(getContext(), h6r.class));
                new w(i5m.a(zzfVar.zc), i5m.a(zzfVar.p7)).a();
                break;
            case 145:
                db.execSQL("CREATE TABLE IF NOT EXISTS zero_km (mcc INTEGER PRIMARY KEY, lon REAL, lat REAL);");
                break;
            case HProv.PP_CONTAINER_STATUS /* 146 */:
                dropTables(db, "banners");
                break;
            case 147:
                dropTables(db, "favorites");
                break;
            case 148:
                dropTables(db, "geofences_v2");
                db.execSQL("CREATE TABLE IF NOT EXISTS geofences_v2 (_id INTEGER PRIMARY KEY, analytics_id TEXT, lat REAL, lon REAL, radius REAL, title TEXT, message TEXT, geofence_id TEXT, ban_time INTEGER, expiration_duration_millis INTEGER, show_notification INTEGER, hash TEXT);");
                break;
            default:
                jst.e.k(new IllegalArgumentException(), "Unknown database version: " + version);
                break;
        }
    }

    @Override // com.yandex.go.sql.BaseDatabaseHelper
    public Collection<String> tableCreateCommands() {
        return scc.g("CREATE TABLE IF NOT EXISTS excluded_parks (park_id TEXT PRIMARY KEY);", "CREATE TABLE IF NOT EXISTS geofences_v2 (_id INTEGER PRIMARY KEY, analytics_id TEXT, lat REAL, lon REAL, radius REAL, title TEXT, message TEXT, geofence_id TEXT, ban_time INTEGER, expiration_duration_millis INTEGER, show_notification INTEGER, hash TEXT);", "CREATE TABLE IF NOT EXISTS geofences_bans (_id INTEGER PRIMARY KEY, ban_tag TEXT NOT NULL UNIQUE, ban_time INTEGER);", "CREATE TABLE IF NOT EXISTS orderchat (_id INTEGER PRIMARY KEY, unique_id INTEGER, order_id TEXT, message_id TEXT, sender_role TEXT, sender_nick TEXT, location_lat INTEGER, location_lon INTEGER, text TEXT, created_date INTEGER, action TEXT, is_read INTEGER, language TEXT, translation_language TEXT, translation_text TEXT);", "CREATE TABLE IF NOT EXISTS orderchat_pending (_id INTEGER PRIMARY KEY, unique_id INTEGER, order_id TEXT, location_lat INTEGER, location_lon INTEGER, text TEXT, suggestion_alias TEXT, created_date INTEGER);", "CREATE TABLE IF NOT EXISTS brandings (_id INTEGER PRIMARY KEY, type TEXT, match_info TEXT, content TEXT);", "CREATE TABLE IF NOT EXISTS zero_km (mcc INTEGER PRIMARY KEY, lon REAL, lat REAL);");
    }

    @Override // com.yandex.go.sql.BaseDatabaseHelper
    public Collection<String> tableNames() {
        return scc.g("excluded_parks", "geofences_v2", "geofences_bans", "orderchat", "orderchat_pending", "brandings", "zero_km");
    }
}
