package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.wuk0;

/* compiled from: DatabaseStorage.kt */
/* loaded from: classes11.dex */
public final class wwk extends SQLiteOpenHelper {
    public static final int[] e = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 43, 44, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 96, 123, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 125, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 127};
    public final gzs<lr70> b;
    public final long c;
    public final bpn0 d;

    public wwk(Context context, gzs gzsVar, long j) {
        super(context, "stat_events.db", (SQLiteDatabase.CursorFactory) null, 7);
        this.b = gzsVar;
        this.c = j;
        this.d = new bpn0(new vwk(this, 0));
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("stat_product");
        arrayList.add("stat_product_important");
        arrayList.add("stat_benchmark");
        arrayList.add("stat_benchmark_important");
        arrayList.add("stat_product_state");
        arrayList.add("stat_benchmark_state");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("\n            CREATE TABLE " + ((String) it.next()) + " (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                data TEXT NOT NULL,\n                version_tag TEXT NOT NULL,\n                platform TEXT NOT NULL,\n                user_id INTEGER NOT NULL\n            );\n            ");
        }
    }

    public static String j(boolean z, boolean z2) {
        return z2 ? !z ? "stat_product" : "stat_product_important" : !z ? "stat_benchmark" : "stat_benchmark_important";
    }

    public static String k(boolean z) {
        return z ? "stat_product_state" : "stat_benchmark_state";
    }

    public static LinkedHashMap m(LinkedHashMap linkedHashMap) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b9y e2 = bay.e((String) it.next());
                if (e2 instanceof x9y) {
                    arrayList = new ArrayList(j5g.v0(e2.h(), arrayList2));
                } else if (e2 instanceof l8y) {
                    l8y g = e2.g();
                    ArrayList arrayList3 = new ArrayList(c5g.u(g, 10));
                    Iterator it2 = g.b.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((b9y) it2.next()).h());
                    }
                    arrayList = new ArrayList(j5g.u0(arrayList3, arrayList2));
                } else {
                    new IllegalArgumentException("Can't parse event");
                }
                arrayList2 = arrayList;
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kgl0 c(String str, eta0 eta0Var) {
        Cursor cursor;
        StringBuilder sb;
        kgl0 kgl0Var;
        long j = this.c;
        try {
            sb = new StringBuilder("SELECT * FROM ");
        } catch (Throwable th) {
            th = th;
        }
        try {
            sb.append(str);
            sb.append(" WHERE platform = '");
            sb.append(eta0Var.a);
            sb.append('\'');
            cursor = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        cursor.getCount();
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        boolean z = false;
                        while (true) {
                            if (cursor.isAfterLast()) {
                                break;
                            }
                            int i = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                            if (((lr70) this.d.getValue()).b(cursor.getString(cursor.getColumnIndexOrThrow("version_tag")))) {
                                arrayList2.add(Integer.valueOf(i));
                                cursor.moveToNext();
                            } else {
                                String string = cursor.getString(cursor.getColumnIndexOrThrow("data"));
                                int length = string.length();
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < length) {
                                    int codePointAt = string.codePointAt(i2);
                                    if (codePointAt >= 128) {
                                        i3 += 6;
                                    } else {
                                        if (codePointAt >= 32 && Arrays.binarySearch(e, codePointAt) < 0) {
                                            i3++;
                                        }
                                        i3 += 3;
                                    }
                                    i2 += Character.charCount(codePointAt);
                                }
                                boolean z2 = ((long) (ref$IntRef.element + i3)) > j;
                                if (z2 && arrayList.isEmpty()) {
                                    arrayList.add(Integer.valueOf(i));
                                }
                                if (z2) {
                                    ref$IntRef.element += i3;
                                    z = z2;
                                    break;
                                }
                                long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("user_id"));
                                gzs<s3q0> gzsVar = fkq0.a;
                                UserId userId = new UserId(j2);
                                if (linkedHashMap.get(userId) == null) {
                                    linkedHashMap.put(userId, new ArrayList());
                                }
                                ((ArrayList) linkedHashMap.get(userId)).add(string);
                                arrayList.add(Integer.valueOf(i));
                                ref$IntRef.element += i3;
                                cursor.moveToNext();
                                z = z2;
                            }
                        }
                        if (linkedHashMap.isEmpty()) {
                            cursor.getCount();
                            new IllegalArgumentException("Can't read events!");
                            kgl0 kgl0Var2 = new kgl0(9, arrayList, arrayList2);
                            cursor.close();
                            return kgl0Var2;
                        }
                        LinkedHashMap m = m(linkedHashMap);
                        if (m.isEmpty()) {
                            new IllegalArgumentException("Can't parse events!");
                            kgl0Var = new kgl0(9, arrayList, arrayList2);
                        } else {
                            kgl0 kgl0Var3 = new kgl0(m, arrayList, arrayList2, z);
                            kgl0Var3.e = ref$IntRef.element / j;
                            kgl0Var = kgl0Var3;
                        }
                        cursor.close();
                        return kgl0Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.toString();
                        h(str);
                        kgl0 kgl0Var4 = new kgl0(15, null, null);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return kgl0Var4;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            return new kgl0(15, null, null);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            th.toString();
            h(str);
            kgl0 kgl0Var42 = new kgl0(15, null, null);
            if (cursor != null) {
            }
            return kgl0Var42;
        }
    }

    public final void h(String str) {
        getWritableDatabase().execSQL("DELETE FROM ".concat(str));
    }

    @ozl
    public final m0q i(List list, boolean z) {
        Collection<List<x9y>> values;
        List list2;
        x9y x9yVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map<UserId, List<x9y>> map = c(k(z), (eta0) it.next()).a;
            if (map != null && (values = map.values()) != null && (list2 = (List) j5g.Z(values)) != null && (x9yVar = (x9y) j5g.a0(list2)) != null) {
                Gson gson = wuk0.c;
                return wuk0.a.a(x9yVar).a();
            }
        }
        return new m0q();
    }

    public final boolean n(String str, qyp qypVar, UserId userId) {
        try {
            SQLiteStatement compileStatement = getWritableDatabase().compileStatement("INSERT INTO " + str + " (data, version_tag, platform, user_id) VALUES (?, ?, ?, ?)");
            try {
                compileStatement.bindString(1, qypVar.a);
                compileStatement.bindString(2, ((lr70) this.d.getValue()).a().getValue());
                compileStatement.bindString(3, qypVar.b.a);
                compileStatement.bindLong(4, userId.b);
                long executeInsert = compileStatement.executeInsert();
                compileStatement.close();
                return executeInsert >= 0;
            } finally {
            }
        } catch (Throwable th) {
            th.toString();
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        xwk.c(sQLiteDatabase, new f1j(sQLiteDatabase, 2));
        b(sQLiteDatabase);
        Log.e("StatLog:", String.format(Locale.US, "Trying to downgrade db version from %d to %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)), new SQLiteException());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        xwk.c(sQLiteDatabase, new f1j(sQLiteDatabase, 2));
        b(sQLiteDatabase);
    }
}
