package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class ge41 implements eya0, oza0 {
    public final zwf0 a;
    public eya0 b;
    public oza0 c;

    public ge41(zwf0 zwf0Var) {
        this.a = zwf0Var;
    }

    @Override // defpackage.eya0
    public final mya0 a(cya0 cya0Var) {
        return qh91.b(this, cya0Var);
    }

    @Override // defpackage.eya0
    public final List c(List list) {
        eya0 eya0Var = this.b;
        if (eya0Var != null) {
            return eya0Var.c(list);
        }
        this.a.f("WebChatPermissionManager", "PermissionChecker not initialized");
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new mya0((cya0) it.next(), false, 2));
        }
        return arrayList;
    }

    @Override // defpackage.oza0
    public final void d(List list, dya0 dya0Var) {
        oza0 oza0Var = this.c;
        if (oza0Var != null) {
            oza0Var.d(list, dya0Var);
        } else {
            this.a.f("WebChatPermissionManager", "PermissionRequester not initialized");
        }
    }

    @Override // defpackage.oza0
    public final void e(og7 og7Var) {
        ai91.d(this, og7Var);
    }
}
