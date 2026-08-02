package xsna;

import android.content.Context;
import com.vk.core.native_loader.NativeLib;
import io.requery.android.database.sqlite.SQLiteCustomExtension;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: ModelsSQL.kt */
/* loaded from: classes3.dex */
public final class x330 extends SQLiteOpenHelper {
    public final Context b;
    public final String c;
    public final boolean d;
    public boolean e;

    public x330(Context context, boolean z) {
        super(context, "ml.db", null, 4);
        this.b = context;
        this.c = "ml.db";
        this.d = z;
    }

    public static SQLiteDatabase b(x330 x330Var) {
        return super.m286getReadableDatabase();
    }

    public static SQLiteDatabase c(x330 x330Var) {
        return super.getWritableDatabase();
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabaseConfiguration createConfiguration(String str, int i) {
        SQLiteDatabaseConfiguration createConfiguration = super.createConfiguration(str, i);
        if (this.d) {
            String k = NativeLib.SQLITE_OBSERVER.k();
            final p5y p5yVar = new p5y(k, 8);
            createConfiguration.customExtensions.add(new SQLiteCustomExtension(k, new Supplier() { // from class: xsna.w330
                @Override // java.util.function.Supplier
                public final Object get() {
                    return (Set) p5y.this.invoke();
                }
            }, null));
        }
        return createConfiguration;
    }

    public final SQLiteDatabase h(gzs<SQLiteDatabase> gzsVar) {
        String str = this.c;
        Context context = this.b;
        if (!this.e) {
            try {
                if (!context.getDatabasePath(str).exists()) {
                    close();
                }
                return gzsVar.invoke();
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                if (!this.e) {
                    try {
                        close();
                        File databasePath = context.getDatabasePath(str);
                        if (databasePath.exists()) {
                            SQLiteDatabase.deleteDatabase(databasePath);
                        }
                        return gzsVar.invoke();
                    } catch (Exception e2) {
                        com.vk.metrics.eventtracking.b.a.a(e2);
                        this.e = true;
                        return null;
                    }
                }
            }
        }
        return null;
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS models (\n    feature_name TEXT PRIMARY KEY COLLATE NOCASE,\n    model_path TEXT NOT NULL,\n    model_version INTEGER NOT NULL,\n    meta TEXT NOT NULL,\n    meta_version INTEGER NOT NULL,\n    encrypted INTEGER NOT NULL\n)");
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS models");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS models (\n    feature_name TEXT PRIMARY KEY COLLATE NOCASE,\n    model_path TEXT NOT NULL,\n    model_version INTEGER NOT NULL,\n    meta TEXT NOT NULL,\n    meta_version INTEGER NOT NULL,\n    encrypted INTEGER NOT NULL\n)");
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.getVersion() != 4) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS models");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS models (\n    feature_name TEXT PRIMARY KEY COLLATE NOCASE,\n    model_path TEXT NOT NULL,\n    model_version INTEGER NOT NULL,\n    meta TEXT NOT NULL,\n    meta_version INTEGER NOT NULL,\n    encrypted INTEGER NOT NULL\n)");
            sQLiteDatabase.setVersion(4);
        }
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 4) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS models");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS models (\n    feature_name TEXT PRIMARY KEY COLLATE NOCASE,\n    model_path TEXT NOT NULL,\n    model_version INTEGER NOT NULL,\n    meta TEXT NOT NULL,\n    meta_version INTEGER NOT NULL,\n    encrypted INTEGER NOT NULL\n)");
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS models");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS models (\n    feature_name TEXT PRIMARY KEY COLLATE NOCASE,\n    model_path TEXT NOT NULL,\n    model_version INTEGER NOT NULL,\n    meta TEXT NOT NULL,\n    meta_version INTEGER NOT NULL,\n    encrypted INTEGER NOT NULL\n)");
            }
        }
    }
}
