package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import xsna.air;

/* loaded from: classes11.dex */
public final class m7z0 extends SQLiteOpenHelper {
    public final qu5 b;

    public m7z0(Context context, qu5 qu5Var) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.b = qu5Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2 && sQLiteDatabase != null) {
            this.b.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = sQLiteDatabase.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
            try {
                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("uuid");
                int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("metrics_event");
                while (rawQuery.moveToNext()) {
                    arrayList.add(vtk0.b(rawQuery.getString(columnIndexOrThrow), brm0.u(rawQuery.getBlob(columnIndexOrThrow2))));
                }
                s3q0 s3q0Var = s3q0.a;
                rawQuery.close();
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wfz0 wfz0Var = (wfz0) it.next();
                    Map<String, String> map = wfz0Var.c;
                    String str = wfz0Var.b;
                    String str2 = wfz0Var.a;
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject d = yq.d("name", str);
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    d.put("data", jSONObject);
                    String Y = rl3.Y(d.toString(0).getBytes(emb.b), "", ru.rustore.sdk.metrics.internal.a.i, 30);
                    JSONObject d2 = yq.d("name", str);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        jSONObject2.put(entry2.getKey(), entry2.getValue());
                    }
                    d2.put("data", jSONObject2);
                    d2.put("time", currentTimeMillis);
                    String a = ss9.a("\n                WHEN metrics_event = x'", Y, "' THEN x'", rl3.Y(d2.toString(0).getBytes(emb.b), "", ru.rustore.sdk.metrics.internal.a.i, 30), "'\n            ");
                    arrayList2.add(str2);
                    sb.append(a);
                }
                sb.append("\n                END\n                WHERE uuid IN (" + j5g.g0(arrayList2, null, null, null, 0, new izs<String, CharSequence>() { // from class: ru.rustore.sdk.metrics.internal.B$a
                    @Override // xsna.izs
                    public final CharSequence invoke(String str3) {
                        return air.b('\'', "'", str3);
                    }
                }, 31) + ")\n            ");
                sQLiteDatabase.execSQL(xqm0.g(sb.toString()));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(rawQuery, th);
                    throw th2;
                }
            }
        }
    }
}
