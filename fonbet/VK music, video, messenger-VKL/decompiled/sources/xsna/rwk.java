package xsna;

import android.content.Context;
import com.vk.core.native_loader.NativeLib;
import com.vk.im.engine.internal.storage.structure.DbException;
import com.vk.im.engine.internal.storage.structure.DbMigrationException;
import io.requery.android.database.SlowQueryLogger;
import io.requery.android.database.sqlite.SQLiteCustomExtension;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.Set;
import java.util.function.Supplier;
import xsna.b2l;

/* compiled from: DatabaseOpenHelper.kt */
/* loaded from: classes2.dex */
public final class rwk extends SQLiteOpenHelper {
    public final String b;
    public final d2l c;
    public final b2l d;
    public final boolean e;
    public final boolean f;
    public final SlowQueryLogger g;

    public rwk(Context context, String str, d2l d2lVar, b2l b2lVar, boolean z, boolean z2, SlowQueryLogger slowQueryLogger) {
        super(context, str, null, d2lVar.getVersion());
        this.b = str;
        this.c = d2lVar;
        this.d = b2lVar;
        this.e = z;
        this.f = z2;
        this.g = slowQueryLogger;
        setWriteAheadLoggingEnabled(true);
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabaseConfiguration createConfiguration(String str, int i) {
        SQLiteDatabaseConfiguration createConfiguration = super.createConfiguration(str, i);
        createConfiguration.noCheckpointOnClose = this.f;
        if (this.e) {
            String k = NativeLib.SQLITE_OBSERVER.k();
            final nwk nwkVar = new nwk(k, 0);
            createConfiguration.customExtensions.add(new SQLiteCustomExtension(k, new Supplier() { // from class: xsna.owk
                @Override // java.util.function.Supplier
                public final Object get() {
                    return (Set) nwk.this.invoke();
                }
            }, null));
            createConfiguration.slowQueryLogger = this.g;
        }
        return createConfiguration;
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setMaxSqlCacheSize(100);
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.c.a(sQLiteDatabase);
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c.b(sQLiteDatabase);
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int version = sQLiteDatabase.getVersion();
        d2l d2lVar = this.c;
        if (version != d2lVar.getVersion()) {
            d2lVar.b(sQLiteDatabase);
            sQLiteDatabase.setVersion(d2lVar.getVersion());
        }
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            this.d.a(new b2l.a(sQLiteDatabase, i, i2, this.b, i));
        } catch (DbException e) {
            if (e instanceof DbMigrationException) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
            this.c.b(sQLiteDatabase);
        }
    }
}
