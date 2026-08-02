package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Trace;
import com.coremedia.iso.boxes.MetaBox;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;

/* compiled from: ModelsDao.kt */
/* loaded from: classes3.dex */
public final class j330 {
    public final bpn0 a;

    public j330(Context context) {
        this.a = new bpn0(new f3g(context, 3));
    }

    public static zb00 c(Cursor cursor) {
        String E = fl3.E(cursor, "feature_name");
        String E2 = fl3.E(cursor, "model_path");
        return new zb00(fl3.A(cursor, "model_version"), E, E2, fl3.E(cursor, MetaBox.TYPE), fl3.x(cursor, "encrypted"), fl3.A(cursor, "meta_version"));
    }

    public final long a(zb00 zb00Var) {
        SQLiteDatabase h;
        String str = zb00Var.a;
        if (b(str) != null) {
            e(str, false);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("feature_name", str);
        contentValues.put("model_path", zb00Var.b);
        contentValues.put("model_version", Integer.valueOf(zb00Var.c));
        contentValues.put(MetaBox.TYPE, zb00Var.d);
        contentValues.put("meta_version", Integer.valueOf(zb00Var.e));
        contentValues.put("encrypted", Boolean.valueOf(zb00Var.f));
        x330 x330Var = (x330) this.a.getValue();
        if (x330Var == null || (h = x330Var.h(new m130(x330Var, 1))) == null) {
            return 0L;
        }
        return h.insertOrThrow("models", null, contentValues);
    }

    public final zb00 b(String str) {
        SQLiteDatabase h;
        Cursor query;
        x330 x330Var = (x330) this.a.getValue();
        if (x330Var == null || (h = x330Var.h(new Cnew(x330Var, 7))) == null || (query = h.query("models", (String[]) null, "feature_name = ?", new String[]{str}, (String) null, (String) null, (String) null, (rq9) null)) == null) {
            return null;
        }
        try {
            return query.moveToFirst() ? c(query) : null;
        } finally {
            query.close();
        }
    }

    public final ArrayList d(String str, String[] strArr) {
        SQLiteDatabase h;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        x330 x330Var = (x330) this.a.getValue();
        if (x330Var == null || (h = x330Var.h(new Cnew(x330Var, 7))) == null || (query = h.query("models", (String[]) null, str, strArr, (String) null, (String) null, (String) null, (rq9) null)) == null) {
            return arrayList;
        }
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (query.moveToFirst()) {
                    while (!query.isAfterLast()) {
                        arrayList.add(c(query));
                        query.moveToNext();
                    }
                }
                Trace.endSection();
                return arrayList;
            } finally {
                query.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void e(String str, boolean z) {
        SQLiteDatabase h;
        if (z) {
            Iterator it = d("feature_name = ?", new String[]{str}).iterator();
            while (it.hasNext()) {
                String str2 = ((zb00) it.next()).b;
                Regex regex = com.vk.core.files.a.a;
                vhk0.c(str2);
            }
        }
        x330 x330Var = (x330) this.a.getValue();
        if (x330Var == null || (h = x330Var.h(new m130(x330Var, 1))) == null) {
            return;
        }
        h.delete("models", "feature_name = ?", new String[]{str});
    }
}
