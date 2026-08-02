package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class mwx0 implements kwx0 {
    public final WorkDatabase_Impl a;
    public final lwx0 b;

    public mwx0(@NonNull WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new lwx0(workDatabase_Impl);
    }

    @Override // xsna.kwx0
    public final ArrayList a(String str) {
        dmg0 c = dmg0.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                arrayList.add(h.getString(0));
            }
            return arrayList;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.kwx0
    public final void b(jwx0 jwx0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(jwx0Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }
}
