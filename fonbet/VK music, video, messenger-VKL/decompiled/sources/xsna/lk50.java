package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.hn50;
import xsna.on50;

/* compiled from: MviCompositeTaskManager.kt */
/* loaded from: classes3.dex */
public final class lk50<TaskId extends on50, Task extends hn50<TaskId>> extends pn50<TaskId, Task, jn50> {
    public final aui<?, TaskId, Task, ?, ?> b;
    public final ArrayList c;
    public final a d = new a();

    public lk50(aui auiVar, ArrayList arrayList) {
        this.b = auiVar;
        this.c = arrayList;
    }

    @Override // xsna.pn50
    public final jn50 a(TaskId taskid) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jn50 a2 = ((pn50) it.next()).a(taskid);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // xsna.pn50
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((pn50) it.next()).b();
        }
    }

    @Override // xsna.pn50
    public final void c(long j) {
        Iterator it = this.c.iterator();
        if (it.hasNext()) {
            ((pn50) it.next()).c(j);
        }
    }

    @Override // xsna.pn50
    public final nom0<TaskId, Task, jn50> e() {
        return this.d;
    }

    @Override // xsna.pn50
    public final boolean f(f730 f730Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((pn50) it.next()).f(f730Var)) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: MviCompositeTaskManager.kt */
    public final class a implements nom0<TaskId, Task, jn50> {
        public a() {
        }

        @Override // xsna.nom0
        public final jn50 a(on50 on50Var) {
            return null;
        }

        @Override // xsna.nom0
        public final jn50 b(on50 on50Var) {
            return null;
        }

        @Override // xsna.nom0
        public final jn50 d(hn50 hn50Var) {
            lk50.this.b.d(hn50Var);
            return null;
        }

        @Override // xsna.nom0
        public final void c(on50 on50Var) {
        }
    }

    @Override // xsna.pn50
    public final void g(TaskId taskid, jn50 jn50Var) {
    }
}
