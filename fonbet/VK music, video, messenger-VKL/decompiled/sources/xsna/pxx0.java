package xsna;

import android.database.Cursor;
import androidx.annotation.Nullable;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.fxx0;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class pxx0 implements Callable<List<fxx0.c>> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ayx0 c;

    public pxx0(ayx0 ayx0Var, dmg0 dmg0Var) {
        this.c = ayx0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final List<fxx0.c> call() throws Exception {
        ayx0 ayx0Var = this.c;
        WorkDatabase_Impl workDatabase_Impl = ayx0Var.a;
        workDatabase_Impl.c();
        try {
            Cursor h = u370.h(workDatabase_Impl, this.b, true);
            try {
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
                while (h.moveToNext()) {
                    String string = h.getString(0);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList<>());
                    }
                    String string2 = h.getString(0);
                    if (!hashMap2.containsKey(string2)) {
                        hashMap2.put(string2, new ArrayList<>());
                    }
                }
                h.moveToPosition(-1);
                ayx0Var.b(hashMap);
                ayx0Var.a(hashMap2);
                ArrayList arrayList = new ArrayList(h.getCount());
                while (h.moveToNext()) {
                    String string3 = h.getString(0);
                    WorkInfo.State f = hyx0.f(h.getInt(1));
                    Data a = Data.a(h.getBlob(2));
                    int i = h.getInt(3);
                    int i2 = h.getInt(4);
                    arrayList.add(new fxx0.c(string3, f, a, h.getLong(14), h.getLong(15), h.getLong(16), new p6j(hyx0.j(h.getBlob(6)), hyx0.d(h.getInt(5)), h.getInt(7) != 0, h.getInt(8) != 0, h.getInt(9) != 0, h.getInt(10) != 0, h.getLong(11), h.getLong(12), hyx0.a(h.getBlob(13))), i, hyx0.c(h.getInt(17)), h.getLong(18), h.getLong(19), h.getInt(20), i2, h.getLong(21), h.getInt(22), hashMap.get(h.getString(0)), hashMap2.get(h.getString(0))));
                }
                workDatabase_Impl.w();
                h.close();
                return arrayList;
            } catch (Throwable th) {
                h.close();
                throw th;
            }
        } finally {
            workDatabase_Impl.q();
        }
    }

    public final void finalize() {
        this.b.n();
    }
}
