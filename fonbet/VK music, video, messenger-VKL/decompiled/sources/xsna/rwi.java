package xsna;

import android.content.Context;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes11.dex */
public final class rwi implements d2l {
    public static final con0 a = new con0("CLOSED");
    public static final rwi b = new rwi();
    public static final rwi c = new rwi();
    public static bpn0 d;
    public static Context e;

    public static final Object c(n4i0 n4i0Var, long j, wzs wzsVar) {
        while (true) {
            if (n4i0Var.d >= j && !n4i0Var.d()) {
                return n4i0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = swi.b;
            Object obj = atomicReferenceFieldUpdater.get(n4i0Var);
            con0 con0Var = a;
            if (obj == con0Var) {
                return con0Var;
            }
            n4i0 n4i0Var2 = (n4i0) ((swi) obj);
            if (n4i0Var2 == null) {
                n4i0Var2 = (n4i0) wzsVar.invoke(Long.valueOf(n4i0Var.d + 1), n4i0Var);
                if (iq.f(atomicReferenceFieldUpdater, n4i0Var, n4i0Var2)) {
                    if (n4i0Var.d()) {
                        n4i0Var.e();
                    }
                }
            }
            n4i0Var = n4i0Var2;
        }
    }

    public static final sw50 d() {
        bpn0 bpn0Var = d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (sw50) bpn0Var.getValue();
    }

    @Override // xsna.d2l
    public void a(SQLiteDatabase sQLiteDatabase) {
        List b0 = drm0.b0(ahn.B("\n            CREATE TABLE key_value (\n            key TEXT NOT NULL PRIMARY KEY,\n            value_simple TEXT,\n            value_blob BLOB\n            );\n                "), new char[]{';'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : b0) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL((String) it.next());
        }
    }

    @Override // xsna.d2l
    public void b(SQLiteDatabase sQLiteDatabase) {
        rdi.r(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // xsna.d2l
    public int getVersion() {
        return 1;
    }
}
