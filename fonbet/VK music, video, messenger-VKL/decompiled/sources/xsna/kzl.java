package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class kzl implements izl {
    public final WorkDatabase_Impl a;
    public final jzl b;

    public kzl(@NonNull WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new jzl(workDatabase_Impl);
    }

    @Override // xsna.izl
    public final ArrayList a(String str) {
        dmg0 c = dmg0.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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

    @Override // xsna.izl
    public final boolean b(String str) {
        dmg0 c = dmg0.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        boolean z = false;
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            if (h.moveToFirst()) {
                z = h.getInt(0) != 0;
            }
            return z;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.izl
    public final void c(fzl fzlVar) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(fzlVar);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }

    @Override // xsna.izl
    public final boolean d(String str) {
        dmg0 c = dmg0.c(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        boolean z = false;
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            if (h.moveToFirst()) {
                z = h.getInt(0) != 0;
            }
            return z;
        } finally {
            h.close();
            c.n();
        }
    }
}
