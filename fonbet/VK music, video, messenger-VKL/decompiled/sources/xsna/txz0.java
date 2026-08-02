package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class txz0 extends SQLiteOpenHelper {
    public final /* synthetic */ ayz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txz0(ayz0 ayz0Var, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.b = ayz0Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        ayz0 ayz0Var = this.b;
        gj01 gj01Var = ayz0Var.h;
        mb01 mb01Var = (mb01) ayz0Var.b;
        mb01Var.getClass();
        if (gj01Var.b != 0 && gj01Var.a.elapsedRealtime() - gj01Var.b < 3600000) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            gj01Var.b = gj01Var.a.elapsedRealtime();
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Opening the database failed, dropping and recreating it");
            mb01Var.getClass();
            if (!mb01Var.b.getDatabasePath("google_app_measurement.db").delete()) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b("google_app_measurement.db", "Failed to delete corrupted db file");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                gj01Var.b = 0L;
                return writableDatabase;
            } catch (SQLiteException e) {
                k901 k901Var3 = mb01Var.j;
                mb01.k(k901Var3);
                k901Var3.i.b(e, "Failed to open freshly created database");
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        k901 k901Var = ((mb01) this.b.b).j;
        mb01.k(k901Var);
        fyz0.b(k901Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        ayz0 ayz0Var = this.b;
        k901 k901Var = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var);
        fyz0.a(k901Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", ayz0.i);
        k901 k901Var2 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var2);
        fyz0.a(k901Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        k901 k901Var3 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var3);
        fyz0.a(k901Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", ayz0.j);
        k901 k901Var4 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var4);
        fyz0.a(k901Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", ayz0.k);
        k901 k901Var5 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var5);
        fyz0.a(k901Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", ayz0.m);
        k901 k901Var6 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var6);
        fyz0.a(k901Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        k901 k901Var7 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var7);
        fyz0.a(k901Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", ayz0.l);
        k901 k901Var8 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var8);
        fyz0.a(k901Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", ayz0.n);
        k901 k901Var9 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var9);
        fyz0.a(k901Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", ayz0.o);
        k901 k901Var10 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var10);
        fyz0.a(k901Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        k901 k901Var11 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var11);
        fyz0.a(k901Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", ayz0.p);
        k901 k901Var12 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var12);
        fyz0.a(k901Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        k901 k901Var13 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var13);
        fyz0.a(k901Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        k901 k901Var14 = ((mb01) ayz0Var.b).j;
        mb01.k(k901Var14);
        fyz0.a(k901Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
