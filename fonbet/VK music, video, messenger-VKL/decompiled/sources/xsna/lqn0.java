package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class lqn0 implements hqn0 {
    public final WorkDatabase_Impl a;
    public final iqn0 b;
    public final jqn0 c;
    public final kqn0 d;

    public lqn0(@NonNull WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new iqn0(workDatabase_Impl);
        this.c = new jqn0(workDatabase_Impl);
        this.d = new kqn0(workDatabase_Impl);
    }

    @Override // xsna.hqn0
    public final ArrayList b() {
        dmg0 c = dmg0.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
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

    @Override // xsna.hqn0
    public final void d(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        jqn0 jqn0Var = this.c;
        zin0 a = jqn0Var.a();
        a.bindString(1, str);
        a.bindLong(2, i);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            jqn0Var.d(a);
        }
    }

    @Override // xsna.hqn0
    public final void e(gqn0 gqn0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(gqn0Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }

    @Override // xsna.hqn0
    public final gqn0 f(int i, String str) {
        dmg0 c = dmg0.c(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        c.bindString(1, str);
        c.bindLong(2, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            return h.moveToFirst() ? new gqn0(h.getString(dmk.b(h, "work_spec_id")), h.getInt(dmk.b(h, "generation")), h.getInt(dmk.b(h, "system_id"))) : null;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.hqn0
    public final void g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        kqn0 kqn0Var = this.d;
        zin0 a = kqn0Var.a();
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
            kqn0Var.d(a);
        }
    }
}
