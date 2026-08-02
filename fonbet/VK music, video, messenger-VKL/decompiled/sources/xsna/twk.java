package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: DatabaseSchemeLogger.kt */
/* loaded from: classes3.dex */
public final class twk {
    public static final void a(SQLiteDatabase sQLiteDatabase) {
        Map map;
        try {
            ArrayList l = fl3.l(sQLiteDatabase);
            int e = on00.e(c5g.u(l, 10));
            if (e < 16) {
                e = 16;
            }
            map = new LinkedHashMap(e);
            Iterator it = l.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                map.put(next, b(sQLiteDatabase, (String) next));
            }
        } catch (Exception e2) {
            L.f("DownloadManager", "retrieveTables:", e2);
            map = jgp.b;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            L.e("DownloadManager", zr.a("Table ", str, " with columns:"));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                L.e("DownloadManager", String.valueOf((p9g) it2.next()));
            }
        }
    }

    public static final List b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("pragma table_info(" + str + ");", null);
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (rawQuery.moveToFirst()) {
                        while (!rawQuery.isAfterLast()) {
                            arrayList.add(c(rawQuery));
                            rawQuery.moveToNext();
                        }
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            } finally {
                Trace.endSection();
            }
        } catch (Exception e) {
            L.f("DownloadManager", "retrieveTableColumns:", e);
            return EmptyList.b;
        }
    }

    public static final p9g c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("name");
        String string = columnIndex >= 0 ? cursor.getString(columnIndex) : "";
        int columnIndex2 = cursor.getColumnIndex("type");
        String string2 = columnIndex2 >= 0 ? cursor.getString(columnIndex2) : "";
        int columnIndex3 = cursor.getColumnIndex("pk");
        boolean z = false;
        boolean z2 = columnIndex3 >= 0 && cursor.getInt(columnIndex3) == 1;
        int columnIndex4 = cursor.getColumnIndex("notnull");
        if (columnIndex4 >= 0 && cursor.getInt(columnIndex4) == 1) {
            z = true;
        }
        return new p9g(string, string2, z2, z);
    }
}
