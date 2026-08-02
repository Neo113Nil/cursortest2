package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.WorkInfo$State;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ia51 {
    public final RoomDatabase a;
    public final ple0 b = new ple0(5);
    public final jku0 c = new jku0(1);

    public ia51(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final void a(oll0 oll0Var, w53 w53Var) {
        s53 s53Var = (s53) w53Var.keySet();
        w53 w53Var2 = s53Var.a;
        if (w53Var2.isEmpty()) {
            return;
        }
        if (w53Var.c > 999) {
            aja1.d(w53Var, new ha51(this, oll0Var, 0));
            return;
        }
        StringBuilder t = qv10.t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        q5z.b(t, w53Var2.c);
        t.append(Extension.C_BRAKE);
        ull0 T0 = oll0Var.T0(t.toString());
        Iterator it = s53Var.iterator();
        int i = 1;
        while (true) {
            yqv yqvVar = (yqv) it;
            if (!yqvVar.hasNext()) {
                try {
                    break;
                } finally {
                    T0.close();
                }
            } else {
                T0.g1(i, (String) yqvVar.next());
                i++;
            }
        }
        int k = eja1.k(T0, "work_spec_id");
        if (k == -1) {
            return;
        }
        while (T0.q()) {
            List list = (List) w53Var.get(T0.Y1(k));
            if (list != null) {
                byte[] blob = T0.getBlob(0);
                ong ongVar = ong.b;
                list.add(bb1.l(blob));
            }
        }
    }

    public final void b(oll0 oll0Var, w53 w53Var) {
        s53 s53Var = (s53) w53Var.keySet();
        w53 w53Var2 = s53Var.a;
        if (w53Var2.isEmpty()) {
            return;
        }
        if (w53Var.c > 999) {
            aja1.d(w53Var, new ha51(this, oll0Var, 1));
            return;
        }
        StringBuilder t = qv10.t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        q5z.b(t, w53Var2.c);
        t.append(Extension.C_BRAKE);
        ull0 T0 = oll0Var.T0(t.toString());
        Iterator it = s53Var.iterator();
        int i = 1;
        while (true) {
            yqv yqvVar = (yqv) it;
            if (!yqvVar.hasNext()) {
                try {
                    break;
                } finally {
                    T0.close();
                }
            } else {
                T0.g1(i, (String) yqvVar.next());
                i++;
            }
        }
        int k = eja1.k(T0, "work_spec_id");
        if (k == -1) {
            return;
        }
        while (T0.q()) {
            List list = (List) w53Var.get(T0.Y1(k));
            if (list != null) {
                list.add(T0.Y1(0));
            }
        }
    }

    public final WorkInfo$State c(String str) {
        return (WorkInfo$State) a.b(this.a, true, false, new brd(str, 18));
    }

    public final fa51 d(String str) {
        return (fa51) a.b(this.a, true, false, new brd(str, 20));
    }

    public final List e(String str) {
        return (List) a.b(this.a, true, false, new brd(str, 17));
    }

    public final void f(long j, String str) {
        ((Number) a.b(this.a, false, true, new hku0(j, str))).intValue();
    }

    public final void g(WorkInfo$State workInfo$State, String str) {
        ((Number) a.b(this.a, false, true, new fgw0(6, workInfo$State, str))).intValue();
    }

    public final void h(String str, int i) {
        a.b(this.a, false, true, new c3x0(i, str));
    }
}
