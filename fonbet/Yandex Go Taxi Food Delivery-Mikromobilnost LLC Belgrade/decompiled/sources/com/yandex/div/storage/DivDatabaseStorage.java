package com.yandex.div.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.storage.db.DatabaseOpenHelper;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.j73;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tey0;
import defpackage.wey0;
import defpackage.xey0;
import defpackage.xfy0;
import defpackage.yfy0;
import defpackage.zel;
import defpackage.zfy0;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\u000b*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0016\"\u00020\u0005H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010 R\u001b\u0010%\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/yandex/div/storage/DivDatabaseStorage;", "Lzel;", "Ljava/io/Closeable;", "Landroid/content/Context;", "context", "", "databaseName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/database/sqlite/SQLiteDatabase;", "Lkotlin/Function0;", "Lzy11;", "block", "w", "(Landroid/database/sqlite/SQLiteDatabase;Lsls;)V", "", "", "B", "()Ljava/util/Map;", "cardId", "d", "(Ljava/lang/String;)Ljava/util/Map;", "", "templateId", "a", "([Ljava/lang/String;)Ljava/util/Map;", "templates", "e", "(Ljava/lang/String;Ljava/util/Map;)V", "c", "(Ljava/lang/String;)V", "clear", "()V", "close", "Li3y;", "n", "()Landroid/database/sqlite/SQLiteDatabase;", "database", "Lwey0;", "b", "o", "()Lwey0;", "templateDao", "Lyfy0;", "v", "()Lyfy0;", "templateUsageDao", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivDatabaseStorage implements zel, Closeable {

    /* renamed from: a, reason: from kotlin metadata */
    private final i3y database;

    /* renamed from: b, reason: from kotlin metadata */
    private final i3y templateDao;

    /* renamed from: c, reason: from kotlin metadata */
    private final i3y templateUsageDao;

    public DivDatabaseStorage(final Context context, final String str) {
        this.database = kotlin.a.a(new sls() { // from class: com.yandex.div.storage.DivDatabaseStorage$database$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SQLiteDatabase invoke() {
                return new DatabaseOpenHelper(context, str).getWritableDatabase();
            }
        });
        this.templateDao = kotlin.a.a(new sls() { // from class: com.yandex.div.storage.DivDatabaseStorage$templateDao$2
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final xey0 invoke() {
                SQLiteDatabase n;
                n = DivDatabaseStorage.this.n();
                return new xey0(n);
            }
        });
        this.templateUsageDao = kotlin.a.a(new sls() { // from class: com.yandex.div.storage.DivDatabaseStorage$templateUsageDao$2
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final zfy0 invoke() {
                SQLiteDatabase n;
                n = DivDatabaseStorage.this.n();
                return new zfy0(n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SQLiteDatabase n() {
        return (SQLiteDatabase) this.database.getValue();
    }

    private final wey0 o() {
        return (wey0) this.templateDao.getValue();
    }

    private final yfy0 v() {
        return (yfy0) this.templateUsageDao.getValue();
    }

    private final void w(SQLiteDatabase sQLiteDatabase, sls slsVar) {
        sQLiteDatabase.beginTransaction();
        try {
            slsVar.invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final Map<String, byte[]> B() {
        List<tey0> d = o().d();
        int d2 = gw00.d(tcc.n(d, 10));
        if (d2 < 16) {
            d2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
        for (tey0 tey0Var : d) {
            Pair pair = new Pair(tey0Var.getId(), tey0Var.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String());
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    @Override // defpackage.zel
    public final Map<String, byte[]> a(String... templateId) {
        List<tey0> f = o().f(j73.d0(templateId));
        int d = gw00.d(tcc.n(f, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (tey0 tey0Var : f) {
            Pair pair = new Pair(tey0Var.getId(), tey0Var.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String());
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    @Override // defpackage.zel
    public final void c(String cardId) {
        SQLiteDatabase n = n();
        n.beginTransaction();
        try {
            v().c(cardId);
            o().b();
            n.setTransactionSuccessful();
        } finally {
            n.endTransaction();
        }
    }

    @Override // defpackage.zel
    public final void clear() {
        SQLiteDatabase n = n();
        n.beginTransaction();
        try {
            o().e();
            v().b();
            n.setTransactionSuccessful();
        } finally {
            n.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n().close();
    }

    @Override // defpackage.zel
    public final Map<String, byte[]> d(String cardId) {
        List<tey0> a = o().a(cardId);
        int d = gw00.d(tcc.n(a, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (tey0 tey0Var : a) {
            Pair pair = new Pair(tey0Var.getId(), tey0Var.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String());
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    @Override // defpackage.zel
    public final void e(String cardId, Map<String, byte[]> templates) {
        SQLiteDatabase n = n();
        n.beginTransaction();
        try {
            v().c(cardId);
            for (Map.Entry<String, byte[]> entry : templates.entrySet()) {
                String key = entry.getKey();
                o().c(new tey0(key, entry.getValue()));
                v().a(new xfy0(cardId, key));
            }
            o().b();
            n.setTransactionSuccessful();
            n.endTransaction();
        } catch (Throwable th) {
            n.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivDatabaseStorage(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DivDatabaseStorage(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? "div.db" : str);
    }
}
