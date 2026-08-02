package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: TableMigrations.kt */
/* loaded from: classes2.dex */
public abstract class pxn0 {
    public final List<String> b;
    public final List<String> d;
    public final String a = "channels_recommendations";
    public final String c = "";

    /* compiled from: TableMigrations.kt */
    public static final class a extends pxn0 {
        public a() {
            super(e43.l("id INTEGER NOT NULL PRIMARY KEY", "last_updated_millis INT NOT NULL", "parent_id INT", "track_code TEXT", "avatar TEXT", "name TEXT"), EmptyList.b);
        }
    }

    public pxn0(List list, List list2) {
        this.b = list;
        this.d = list2;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL((String) it.next());
        }
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder c = r11.c("CREATE ", "TABLE ");
        c.append(this.a);
        String str = this.c;
        if (!drm0.N(str)) {
            c.append(" USING ");
            c.append(str);
        }
        List<String> list = this.b;
        if (!list.isEmpty()) {
            c.append('(');
            c.append(j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            c.append(')');
        }
        c.append(";");
        sQLiteDatabase.execSQL(c.toString());
    }

    public final String c() {
        return this.a;
    }
}
