package io.requery.android.database.sqlite;

import android.content.Context;
import io.requery.android.database.DatabaseErrorHandler;
import java.util.Collections;
import java.util.Iterator;
import xsna.tin0;

/* loaded from: classes8.dex */
public final class RequerySQLiteOpenHelperFactory implements tin0.c {
    private final Iterable<ConfigurationOptions> configurationOptions;

    public static final class CallbackDatabaseErrorHandler implements DatabaseErrorHandler {
        private final tin0.a callback;

        public CallbackDatabaseErrorHandler(tin0.a aVar) {
            this.callback = aVar;
        }

        @Override // io.requery.android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            this.callback.getClass();
            tin0.a.b(sQLiteDatabase);
        }
    }

    public static final class CallbackSQLiteOpenHelper extends SQLiteOpenHelper {
        private final tin0.a callback;
        private final Iterable<ConfigurationOptions> configurationOptions;

        public CallbackSQLiteOpenHelper(Context context, String str, tin0.a aVar, Iterable<ConfigurationOptions> iterable) {
            super(context, str, null, aVar.a, new CallbackDatabaseErrorHandler(aVar));
            this.callback = aVar;
            this.configurationOptions = iterable;
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabaseConfiguration createConfiguration(String str, int i) {
            SQLiteDatabaseConfiguration createConfiguration = super.createConfiguration(str, i);
            Iterator<ConfigurationOptions> it = this.configurationOptions.iterator();
            while (it.hasNext()) {
                createConfiguration = it.next().apply(createConfiguration);
            }
            return createConfiguration;
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.callback.getClass();
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.callback.c(sQLiteDatabase);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.callback.d(sQLiteDatabase, i, i2);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            this.callback.e(sQLiteDatabase);
        }

        @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.callback.f(sQLiteDatabase, i, i2);
        }
    }

    public interface ConfigurationOptions {
        SQLiteDatabaseConfiguration apply(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration);
    }

    public RequerySQLiteOpenHelperFactory(Iterable<ConfigurationOptions> iterable) {
        this.configurationOptions = iterable;
    }

    @Override // xsna.tin0.c
    public tin0 create(tin0.b bVar) {
        return new CallbackSQLiteOpenHelper(bVar.a, bVar.b, bVar.c, this.configurationOptions);
    }

    public RequerySQLiteOpenHelperFactory() {
        this(Collections.EMPTY_LIST);
    }
}
