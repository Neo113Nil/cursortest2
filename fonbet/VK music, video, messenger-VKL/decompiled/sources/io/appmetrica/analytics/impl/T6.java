package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class T6 {
    public final CounterConfigurationReporterType a;

    public T6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(2:15|(8:18|76|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50)))|59|60))|5|6|7|8|(4:10|12|15|(2:18|76))|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final R6 a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C5276wj c5276wj;
        C5226uj c5226uj;
        Y3 y3;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    C4710ak c4710ak = AbstractC5326yj.a;
                    c4710ak.getClass();
                    c4710ak.a(new C5351zj("select_rows_to_delete_exception", th));
                    vo.a(cursor);
                    arrayList = null;
                    int i2 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new R6(arrayList, i2);
                } finally {
                    vo.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i22 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i22 == arrayList.size() && z) {
                    c5276wj = C5342za.I.f;
                    if (str2 != null && c5276wj != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.a;
                        synchronized (c5276wj) {
                            c5226uj = (C5226uj) c5276wj.c.get(str2);
                            if (c5226uj == null) {
                                c5226uj = new C5226uj(str2, c5276wj.b, counterConfigurationReporterType, c5276wj.a);
                                c5276wj.c.put(str2, c5226uj);
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            JSONArray jSONArray2 = new JSONArray();
                            for (ContentValues contentValues2 : arrayList) {
                                Integer asInteger = contentValues2.getAsInteger("global_number");
                                Integer asInteger2 = contentValues2.getAsInteger("type");
                                if (asInteger != null && asInteger2 != null) {
                                    jSONArray.put(asInteger);
                                    EnumC5037nb a = EnumC5037nb.a(asInteger2.intValue());
                                    if (a == null) {
                                        Map map = Zf.a;
                                        num = null;
                                    } else {
                                        num = (Integer) Zf.c.get(a);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", S6.a(i)).put("cleared", jSONObject).put("actual_deleted_number", i22));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = I9.a;
                            EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
                            y3 = new Y3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            y3 = null;
                        }
                        if (y3 != null && c5226uj.c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c5226uj.a);
                                counterConfiguration.setReporterType(c5226uj.c);
                                c5226uj.d.a.reportData(1, y3.d(new Ph(new Lf(c5226uj.b, (ResultReceiver) null), counterConfiguration, new P8(new Bl(LoggerStorage.getOrCreatePublicLogger(c5226uj.a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new R6(arrayList, i22);
            }
        }
        arrayList = null;
        int i222 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c5276wj = C5342za.I.f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.a;
                synchronized (c5276wj) {
                }
            }
        }
        return new R6(arrayList, i222);
    }
}
