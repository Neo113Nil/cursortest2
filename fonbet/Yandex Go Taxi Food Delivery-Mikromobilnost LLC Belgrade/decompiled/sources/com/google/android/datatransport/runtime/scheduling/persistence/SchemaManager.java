package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.b64;
import defpackage.wom0;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class SchemaManager extends SQLiteOpenHelper {
    private static final String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final String CREATE_GLOBAL_LOG_EVENT_STATE_TABLE = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
    private static final String CREATE_LOG_EVENT_DROPPED_TABLE = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
    private static final String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    static final String DB_NAME = "com.google.android.datatransport.events";
    private static final String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final String DROP_GLOBAL_LOG_EVENT_STATE_SQL = "DROP TABLE IF EXISTS global_log_event_state";
    private static final String DROP_LOG_EVENT_DROPPED_SQL = "DROP TABLE IF EXISTS log_event_dropped";
    private static final String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
    private static final List<wom0> INCREMENTAL_MIGRATIONS;
    private static final wom0 MIGRATE_TO_V1;
    private static final wom0 MIGRATE_TO_V2;
    private static final wom0 MIGRATE_TO_V3;
    private static final wom0 MIGRATE_TO_V4;
    private static final wom0 MIGRATE_TO_V6;
    private static final wom0 MIGRATE_TO_V7;
    private static final wom0 MIGRATION_TO_V5;
    private boolean configured;
    private final int schemaVersion;
    private static final String CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + Extension.C_BRAKE;
    static int SCHEMA_VERSION = 7;

    static {
        final int i = 0;
        wom0 wom0Var = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATE_TO_V1 = wom0Var;
        final int i2 = 1;
        wom0 wom0Var2 = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i2) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATE_TO_V2 = wom0Var2;
        final int i3 = 2;
        wom0 wom0Var3 = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i3) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATE_TO_V3 = wom0Var3;
        final int i4 = 3;
        wom0 wom0Var4 = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i4) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATE_TO_V4 = wom0Var4;
        final int i5 = 4;
        wom0 wom0Var5 = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i5) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATION_TO_V5 = wom0Var5;
        final int i6 = 5;
        wom0 wom0Var6 = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i6) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATE_TO_V6 = wom0Var6;
        final int i7 = 6;
        wom0 wom0Var7 = new wom0() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // defpackage.wom0
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i7) {
                    case 0:
                        SchemaManager.lambda$static$0(sQLiteDatabase);
                        break;
                    case 1:
                        SchemaManager.lambda$static$1(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        SchemaManager.lambda$static$3(sQLiteDatabase);
                        break;
                    case 4:
                        SchemaManager.lambda$static$4(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        SchemaManager.lambda$static$6(sQLiteDatabase);
                        break;
                }
            }
        };
        MIGRATE_TO_V7 = wom0Var7;
        INCREMENTAL_MIGRATIONS = Arrays.asList(wom0Var, wom0Var2, wom0Var3, wom0Var4, wom0Var5, wom0Var6, wom0Var7);
    }

    public SchemaManager(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.configured = false;
        this.schemaVersion = i;
    }

    private void ensureConfigured(SQLiteDatabase sQLiteDatabase) {
        if (this.configured) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_EVENTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_METADATA_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_BACKEND_INDEX_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$3(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(DROP_PAYLOADS_SQL);
        sQLiteDatabase.execSQL(CREATE_PAYLOADS_TABLE_V4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$4(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        sQLiteDatabase.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        sQLiteDatabase.execSQL(CREATE_LOG_EVENT_DROPPED_TABLE);
        sQLiteDatabase.execSQL(CREATE_GLOBAL_LOG_EVENT_STATE_TABLE);
        sQLiteDatabase.execSQL(CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$6(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void onCreate(SQLiteDatabase sQLiteDatabase, int i) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, 0, i);
    }

    private void upgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<wom0> list = INCREMENTAL_MIGRATIONS;
        if (i2 <= list.size()) {
            while (i < i2) {
                INCREMENTAL_MIGRATIONS.get(i).a(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder s = b64.s(i, i2, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
            s.append(list.size());
            s.append(" migrations are provided");
            throw new IllegalArgumentException(s.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.configured = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(DROP_EVENTS_SQL);
        sQLiteDatabase.execSQL(DROP_EVENT_METADATA_SQL);
        sQLiteDatabase.execSQL(DROP_CONTEXTS_SQL);
        sQLiteDatabase.execSQL(DROP_PAYLOADS_SQL);
        sQLiteDatabase.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        sQLiteDatabase.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        onCreate(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        ensureConfigured(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(sQLiteDatabase, this.schemaVersion);
    }
}
