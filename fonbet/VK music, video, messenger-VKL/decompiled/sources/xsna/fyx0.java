package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class fyx0 implements cyx0 {
    public final WorkDatabase_Impl a;
    public final dyx0 b;
    public final eyx0 c;

    public fyx0(@NonNull WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new dyx0(workDatabase_Impl);
        this.c = new eyx0(workDatabase_Impl);
    }

    @Override // xsna.cyx0
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        eyx0 eyx0Var = this.c;
        zin0 a = eyx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            eyx0Var.d(a);
        }
    }

    @Override // xsna.cyx0
    public final ArrayList c(String str) {
        dmg0 c = dmg0.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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

    @Override // xsna.cyx0
    public final void d(byx0 byx0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(byx0Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }
}
