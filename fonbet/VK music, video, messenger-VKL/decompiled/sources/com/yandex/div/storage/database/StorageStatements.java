package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.emb;
import xsna.gzs;
import xsna.ho8;
import xsna.izs;
import xsna.j5g;
import xsna.msy;
import xsna.ro;
import xsna.s3q0;

/* compiled from: StorageStatements.kt */
/* loaded from: classes7.dex */
public final class StorageStatements {
    public static final StorageStatements INSTANCE = new StorageStatements();

    private StorageStatements() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String asSqlList(Collection<? extends T> collection) {
        return j5g.g0(collection, "', '", "('", "')", 0, null, 56);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StorageStatement replaceRawJsons$default(StorageStatements storageStatements, List list, izs izsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            izsVar = new izs<List<? extends String>, s3q0>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$1
                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(List<? extends String> list2) {
                    invoke2((List<String>) list2);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<String> list2) {
                    throw new SQLException("Insertion failed for raw jsons with ids: " + j5g.g0(list2, null, null, null, 0, null, 63));
                }
            };
        }
        return storageStatements.replaceRawJsons(list, izsVar);
    }

    public final StorageStatement deleteRawJsons(final Set<String> set) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$deleteRawJsons$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) {
                String asSqlList;
                StringBuilder sb = new StringBuilder("DELETE FROM raw_json WHERE raw_json_id IN ");
                asSqlList = StorageStatements.INSTANCE.asSqlList(set);
                sb.append(asSqlList);
                sqlCompiler.compileStatement(sb.toString()).executeUpdateDelete();
            }

            public String toString() {
                return "Deleting raw jsons with ids: " + set;
            }
        };
    }

    public final StorageStatement dropAllTables() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$dropAllTables$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) {
                ArrayList arrayList = new ArrayList();
                ReadState compileQuery = sqlCompiler.compileQuery("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
                try {
                    Cursor cursor = compileQuery.getCursor();
                    if (!cursor.moveToFirst()) {
                        ro.e(compileQuery, null);
                        return;
                    }
                    do {
                        arrayList.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
                    } while (cursor.moveToNext());
                    s3q0 s3q0Var = s3q0.a;
                    ro.e(compileQuery, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sqlCompiler.compileStatement("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
                    }
                } finally {
                }
            }

            public String toString() {
                return "Drop all database tables";
            }
        };
    }

    public final StorageStatement readRawJsons(final izs<? super ReadState, s3q0> izsVar) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$readRawJsons$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) {
                ReadState compileQuery = sqlCompiler.compileQuery("SELECT * FROM raw_json", new String[0]);
                try {
                    izsVar.invoke(compileQuery);
                    ro.e(compileQuery, null);
                } finally {
                }
            }

            public String toString() {
                return "Selecting all raw jsons";
            }
        };
    }

    public final StorageStatement replaceRawJsons(final List<? extends RawJson> list, final izs<? super List<String>, s3q0> izsVar) {
        return new StorageStatement(list, izsVar) { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2
            final /* synthetic */ izs<List<String>, s3q0> $onFailedTransactions;
            final /* synthetic */ List<RawJson> $rawJsons;
            private final Lazy cardIdsString$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$rawJsons = list;
                this.$onFailedTransactions = izsVar;
                this.cardIdsString$delegate = msy.a(LazyThreadSafetyMode.NONE, new gzs<String>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public final String invoke() {
                        return j5g.g0(list, null, null, null, 0, new izs<RawJson, CharSequence>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2.1
                            @Override // xsna.izs
                            public final CharSequence invoke(RawJson rawJson) {
                                return rawJson.getId();
                            }
                        }, 31);
                    }
                });
            }

            private final String getCardIdsString() {
                return (String) this.cardIdsString$delegate.getValue();
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) {
                ArrayList arrayList = new ArrayList();
                SQLiteStatement compileStatement = sqlCompiler.compileStatement("INSERT OR REPLACE INTO raw_json VALUES (?, ?)");
                for (RawJson rawJson : this.$rawJsons) {
                    compileStatement.bindString(1, rawJson.getId());
                    compileStatement.bindBlob(2, rawJson.getData().toString().getBytes(emb.b));
                    Long valueOf = Long.valueOf(compileStatement.executeInsert());
                    if (valueOf.longValue() >= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(rawJson.getId());
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.$onFailedTransactions.invoke(arrayList);
            }

            public String toString() {
                return ho8.a(new StringBuilder("Replace raw jsons ("), getCardIdsString(), ')');
            }
        };
    }
}
