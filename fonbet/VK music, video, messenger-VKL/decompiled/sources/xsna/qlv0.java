package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: VkStatDatabaseStorage.kt */
/* loaded from: classes5.dex */
public final class qlv0 extends SQLiteOpenHelper implements Closeable {
    public static final /* synthetic */ int g = 0;
    public final m66 b;
    public final zzp c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public volatile xlv0 f;

    public qlv0(Context context, m66 m66Var, zzp zzpVar) {
        super(context, "vk_stat_events_db", (SQLiteDatabase.CursorFactory) null, 2);
        this.b = m66Var;
        this.c = zzpVar;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.d = newSingleThreadScheduledExecutor;
        this.e = newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new or4(this, 19), 0L, 10000L, TimeUnit.MILLISECONDS);
    }

    public final void b(ArrayList arrayList) {
        xlv0 xlv0Var;
        if (arrayList.isEmpty()) {
            return;
        }
        m66 m66Var = this.b;
        UserId userId = m66Var != null ? (UserId) m66Var.invoke() : null;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        r3e r3eVar = new r3e(arrayList, userId, this, ref$IntRef, 5);
        writableDatabase.beginTransactionNonExclusive();
        try {
            r3eVar.invoke(writableDatabase);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (ref$IntRef.element <= 0 || (xlv0Var = this.f) == null) {
                return;
            }
            int i = ref$IntRef.element;
            Iterator<pur> it = xlv0Var.l.iterator();
            while (it.hasNext()) {
                it.next().a(i);
            }
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final void c(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("sentStatus", "SENT");
        Collection<Integer> collection2 = collection;
        String b = air.b(')', "id IN (", j5g.g0(collection2, StringUtils.COMMA, null, null, 0, new pzt0(3), 30));
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            kq.d((Number) it.next(), arrayList);
        }
        getWritableDatabase().updateWithOnConflict("vk_stat_events", contentValues, b, (String[]) arrayList.toArray(new String[0]), 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.e.cancel(true);
        this.d.shutdown();
        super.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("\n            CREATE TABLE vk_stat_events (\n                id              INTEGER PRIMARY KEY AUTOINCREMENT,\n                event_type_id   TEXT NOT NULL,\n                user_id         LONG,\n                schema_version  TEXT DEFAULT NULL,\n                eventJson      TEXT NOT NULL,\n                sentStatus     TEXT DEFAULT INITIAL,\n                uuid            TEXT DEFAULT NULL,\n                size            INTEGER\n            );\n            ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vk_stat_events");
        sQLiteDatabase.execSQL("\n            CREATE TABLE vk_stat_events (\n                id              INTEGER PRIMARY KEY AUTOINCREMENT,\n                event_type_id   TEXT NOT NULL,\n                user_id         LONG,\n                schema_version  TEXT DEFAULT NULL,\n                eventJson      TEXT NOT NULL,\n                sentStatus     TEXT DEFAULT INITIAL,\n                uuid            TEXT DEFAULT NULL,\n                size            INTEGER\n            );\n            ");
    }
}
