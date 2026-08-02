package com.yandex.div.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.DivStorageImpl.CursorDrivenRawJson;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.e9e0;
import xsna.go9;
import xsna.gzs;
import xsna.ipn;
import xsna.izs;
import xsna.j5g;
import xsna.kr;
import xsna.msy;
import xsna.on00;
import xsna.ro;
import xsna.s3q0;
import xsna.sl9;
import xsna.zcl;
import xsna.zr;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes7.dex */
public class DivStorageImpl implements DivStorage {
    public static final Companion Companion = new Companion(null);
    private final SingleTransactionDataSavePerformer dataSaveUseCase;
    private final String dbName;
    private final Migration defaultDropAllMigration;
    private final Map<Pair<Integer, Integer>, Migration> migrations;
    private final DatabaseOpenHelper openHelper;
    private final StorageStatementExecutor statementExecutor;

    /* compiled from: DivStorageImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> String asSqlList(Collection<? extends T> collection) {
            return j5g.g0(collection, "', '", "('", "')", 0, null, 56);
        }

        private Companion() {
        }
    }

    /* compiled from: DivStorageImpl.kt */
    public final class CursorDrivenRawJson implements RawJson, Closeable {
        private final Cursor cursor;
        private boolean cursorInvalid;
        private final Lazy data$delegate;
        private final String id;

        public CursorDrivenRawJson(Cursor cursor) {
            this.cursor = cursor;
            this.id = cursor.getString(DivStorageImpl.this.indexOf(cursor, "raw_json_id"));
            this.data$delegate = msy.a(LazyThreadSafetyMode.NONE, new gzs<JSONObject>() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawJson$data$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public final JSONObject invoke() {
                    boolean z;
                    JSONObject jSONObject;
                    z = DivStorageImpl.CursorDrivenRawJson.this.cursorInvalid;
                    if (z) {
                        throw new IllegalStateException("Data no longer valid!");
                    }
                    jSONObject = r2.toJSONObject(DivStorageImpl.CursorDrivenRawJson.this.getCursor().getBlob(r2.indexOf(DivStorageImpl.CursorDrivenRawJson.this.getCursor(), "raw_json_data")));
                    return jSONObject;
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursorInvalid = true;
        }

        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public JSONObject getData() {
            return (JSONObject) this.data$delegate.getValue();
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public String getId() {
            return this.id;
        }
    }

    public DivStorageImpl(Context context, DatabaseOpenHelperProvider databaseOpenHelperProvider, String str) {
        DatabaseOpenHelper createInternal$lambda$0;
        String concat = str.length() == 0 ? "div-storage.db" : str.concat("-div-storage.db");
        this.dbName = concat;
        DivStorageImpl$openHelper$1 divStorageImpl$openHelper$1 = new DivStorageImpl$openHelper$1(this);
        DivStorageImpl$openHelper$2 divStorageImpl$openHelper$2 = new DivStorageImpl$openHelper$2(this);
        ((kr) databaseOpenHelperProvider).getClass();
        createInternal$lambda$0 = DivStorageComponent.Companion.createInternal$lambda$0(context, concat, 3, divStorageImpl$openHelper$1, divStorageImpl$openHelper$2);
        this.openHelper = createInternal$lambda$0;
        this.statementExecutor = new StorageStatementExecutor(new gzs<DatabaseOpenHelper.Database>() { // from class: com.yandex.div.storage.DivStorageImpl$statementExecutor$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final DatabaseOpenHelper.Database invoke() {
                DatabaseOpenHelper databaseOpenHelper;
                databaseOpenHelper = DivStorageImpl.this.openHelper;
                return databaseOpenHelper.getWritableDatabase();
            }
        });
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(getStatementExecutor());
        this.migrations = on00.f(new Pair(new Pair(2, 3), new ipn()));
        this.defaultDropAllMigration = new Migration() { // from class: xsna.jpn
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.defaultDropAllMigration$lambda$1(DivStorageImpl.this, database);
            }
        };
    }

    private List<RawJson> collectsRawJsons(final Set<String> set) throws SQLException {
        ArrayList arrayList = new ArrayList(set.size());
        ReadState readStateFor = readStateFor(new izs<DatabaseOpenHelper.Database, Cursor>() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRawJsons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Cursor invoke(DatabaseOpenHelper.Database database) {
                String asSqlList;
                StringBuilder sb = new StringBuilder("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n ");
                asSqlList = DivStorageImpl.Companion.asSqlList(set);
                sb.append(asSqlList);
                return database.rawQuery(sb.toString(), new String[0]);
            }
        });
        try {
            Cursor cursor = readStateFor.getCursor();
            if (cursor.getCount() != 0 && cursor.moveToFirst()) {
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = new CursorDrivenRawJson(cursor);
                    arrayList.add(new RawJson.Ready(cursorDrivenRawJson.getId(), cursorDrivenRawJson.getData()));
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
            s3q0 s3q0Var = s3q0.a;
            ro.e(readStateFor, null);
            return arrayList;
        } finally {
        }
    }

    private Set<String> collectsRawJsonsIdsFor(final izs<? super RawJson, Boolean> izsVar) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        getStatementExecutor().execute(StorageStatements.INSTANCE.readRawJsons(new izs<ReadState, s3q0>() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRawJsonsIdsFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(ReadState readState) {
                invoke2(readState);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ReadState readState) {
                Cursor cursor = readState.getCursor();
                if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
                    return;
                }
                do {
                    DivStorageImpl.CursorDrivenRawJson cursorDrivenRawJson = DivStorageImpl.this.new CursorDrivenRawJson(cursor);
                    if (izsVar.invoke(cursorDrivenRawJson).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawJson.getId());
                    }
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
        }));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDropAllMigration$lambda$1(DivStorageImpl divStorageImpl, DatabaseOpenHelper.Database database) {
        divStorageImpl.dropTables(database);
        divStorageImpl.createTables(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalStateException(zr.a("Column '", str, "' not found in cursor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrations$lambda$0(DatabaseOpenHelper.Database database) {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e) {
            throw new SQLException("Create \"raw_json\" table", e);
        }
    }

    private ReadState readStateFor(final izs<? super DatabaseOpenHelper.Database, ? extends Cursor> izsVar) {
        final DatabaseOpenHelper.Database readableDatabase = this.openHelper.getReadableDatabase();
        return new ReadState(new gzs<s3q0>() { // from class: com.yandex.div.storage.DivStorageImpl$readStateFor$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SqlExtensionsKt.closeSilently(DatabaseOpenHelper.Database.this);
            }
        }, new e9e0() { // from class: xsna.hpn
            @Override // xsna.e9e0
            public final Object get() {
                Cursor readStateFor$lambda$12;
                readStateFor$lambda$12 = DivStorageImpl.readStateFor$lambda$12(DatabaseOpenHelper.Database.this, izsVar);
                return readStateFor$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor readStateFor$lambda$12(DatabaseOpenHelper.Database database, izs izsVar) {
        return (Cursor) izsVar.invoke(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toJSONObject(byte[] bArr) {
        return new JSONObject(new String(bArr, StandardCharsets.UTF_8));
    }

    private DivStorageErrorException toStorageException(Exception exc, String str, String str2) {
        return new DivStorageErrorException(go9.b("Unexpected exception on database access: ", str), exc, str2);
    }

    public static /* synthetic */ DivStorageErrorException toStorageException$default(DivStorageImpl divStorageImpl, Exception exc, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toStorageException");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return divStorageImpl.toStorageException(exc, str, str2);
    }

    public void createTables(DatabaseOpenHelper.Database database) throws SQLException {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e) {
            throw new SQLException("Create tables", e);
        }
    }

    public void dropTables(final DatabaseOpenHelper.Database database) throws SQLException {
        new StorageStatementExecutor(new gzs<DatabaseOpenHelper.Database>() { // from class: com.yandex.div.storage.DivStorageImpl$dropTables$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final DatabaseOpenHelper.Database invoke() {
                return DatabaseOpenHelper.Database.this;
            }
        }).execute(StorageStatements.INSTANCE.dropAllTables());
    }

    public Map<Pair<Integer, Integer>, Migration> getMigrations() {
        return this.migrations;
    }

    public StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    public void onCreate(DatabaseOpenHelper.Database database) {
        createTables(database);
    }

    public void onUpgrade(DatabaseOpenHelper.Database database, int i, int i2) {
        KAssert kAssert = KAssert.INSTANCE;
        Integer valueOf = Integer.valueOf(i2);
        if (Assert.isEnabled()) {
            Assert.assertEquals("", valueOf, 3);
        }
        if (i == 3) {
            return;
        }
        Migration migration = getMigrations().get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        if (migration == null) {
            migration = this.defaultDropAllMigration;
        }
        try {
            migration.migrate(database);
        } catch (SQLException e) {
            if (Assert.isEnabled()) {
                Assert.fail(sl9.c(i, i2, "Migration from ", " to ", " throws exception"), e);
            }
            this.defaultDropAllMigration.migrate(database);
        }
    }

    @Override // com.yandex.div.storage.DivStorage
    public DivStorage.LoadDataResult<RawJson> readRawJsons(Set<String> set) {
        String str = "Read raw jsons with ids: " + set;
        ArrayList arrayList = new ArrayList();
        List<RawJson> list = EmptyList.b;
        try {
            list = collectsRawJsons(set);
        } catch (SQLException e) {
            arrayList.add(toStorageException$default(this, e, str, null, 2, null));
        } catch (IllegalStateException e2) {
            arrayList.add(toStorageException$default(this, e2, str, null, 2, null));
        }
        return new DivStorage.LoadDataResult<>(list, arrayList);
    }

    @Override // com.yandex.div.storage.DivStorage
    public DivStorage.RemoveResult removeRawJsons(izs<? super RawJson, Boolean> izsVar) {
        Set<String> collectsRawJsonsIdsFor = collectsRawJsonsIdsFor(izsVar);
        return new DivStorage.RemoveResult(collectsRawJsonsIdsFor, getStatementExecutor().execute(DivDataRepository.ActionOnError.SKIP_ELEMENT, StorageStatements.INSTANCE.deleteRawJsons(collectsRawJsonsIdsFor)).getErrors());
    }

    @Override // com.yandex.div.storage.DivStorage
    public ExecutionResult saveRawJsons(List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.saveRawJsons(list, actionOnError);
    }
}
