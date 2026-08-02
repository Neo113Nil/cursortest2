package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class tqy0 implements zgy0 {
    public final SQLiteDatabase b;

    public tqy0(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public static SQLiteDatabase b(Context context) {
        SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("com_my_target_sdk.db", 0, null);
        openOrCreateDatabase.setVersion(2);
        try {
            openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_url_resolver_cookie( uri_key TEXT NOT NULL, uri TEXT NOT NULL, cookie_json TEXT NOT NULL)");
        } catch (Throwable th) {
            gu8.c(null, "CookieStore: create table cookie error, " + th);
        }
        try {
            openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_stat_send( id INTEGER PRIMARY KEY AUTOINCREMENT, url TEXT NOT NULL, type TEXT NOT NULL, timestampMs INTEGER(8) NOT NULL, deadlineMs INTEGER(8) NOT NULL, adId TEXT NOT NULL, monitoring TEXT NOT NULL, neededDetailedMonitoring INTEGER(8) NOT NULL)");
        } catch (Throwable th2) {
            gu8.c(null, "StatSend: create table statSender error, " + th2);
        }
        try {
            openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_audit_pixel_attempts( id INTEGER PRIMARY KEY AUTOINCREMENT, adId TEXT NOT NULL, pixelUrl TEXT NOT NULL, type TEXT, attempt INTEGER(8) NOT NULL, timestamp INTEGER(8) NOT NULL, error TEXT, isCompleted INTEGER(8) NOT NULL DEFAULT 0, monitoring TEXT NOT NULL DEFAULT '')");
        } catch (Throwable th3) {
            gu8.c(null, "AuditPixelDbTableReal.createTableDefinitions() error, " + th3);
        }
        return openOrCreateDatabase;
    }

    @Override // xsna.zgy0
    public final SQLiteDatabase a() {
        return this.b;
    }
}
