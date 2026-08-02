package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class wxc0 implements uxc0 {
    public final RoomDatabase a;
    public final vxc0 b;

    public wxc0(@NonNull WorkDatabase workDatabase) {
        this.a = workDatabase;
        this.b = new vxc0(workDatabase);
    }

    @Override // xsna.uxc0
    public final void a(txc0 txc0Var) {
        RoomDatabase roomDatabase = this.a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.b.j(txc0Var);
            roomDatabase.w();
        } finally {
            roomDatabase.q();
        }
    }

    @Override // xsna.uxc0
    public final Long b(String str) {
        dmg0 c = dmg0.c(1, "SELECT long_value FROM Preference where `key`=?");
        c.bindString(1, str);
        RoomDatabase roomDatabase = this.a;
        roomDatabase.b();
        Cursor h = u370.h(roomDatabase, c, false);
        try {
            Long l = null;
            if (h.moveToFirst() && !h.isNull(0)) {
                l = Long.valueOf(h.getLong(0));
            }
            return l;
        } finally {
            h.close();
            c.n();
        }
    }
}
