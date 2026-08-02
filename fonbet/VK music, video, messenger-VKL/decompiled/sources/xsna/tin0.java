package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.android.kt */
/* loaded from: classes.dex */
public interface tin0 extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.android.kt */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = epx.g(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public static void b(sin0 sin0Var) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + sin0Var + ".path");
            if (!sin0Var.isOpen()) {
                String path = sin0Var.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = sin0Var.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    sin0Var.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        a((String) ((Pair) it.next()).second);
                    }
                } else {
                    String path2 = sin0Var.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void c(sin0 sin0Var);

        public abstract void d(sin0 sin0Var, int i, int i2);

        public abstract void e(sin0 sin0Var);

        public abstract void f(sin0 sin0Var, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper.android.kt */
    public static final class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;

        public b(Context context, String str, a aVar, boolean z, boolean z2) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.android.kt */
    public interface c {
        tin0 create(b bVar);
    }

    String getDatabaseName();

    sin0 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
