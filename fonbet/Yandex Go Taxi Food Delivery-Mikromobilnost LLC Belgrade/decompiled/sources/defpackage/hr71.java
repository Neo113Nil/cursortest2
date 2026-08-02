package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class hr71 implements ck81 {
    public final /* synthetic */ int a;
    public final rr41 b;

    public hr71(v981 v981Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new rr41(v981Var);
                break;
            default:
                this.b = new rr41(v981Var);
                break;
        }
    }

    @Override // defpackage.ck81
    public final void a(Context context, tg81 tg81Var, v881 v881Var, vi71 vi71Var, ck61 ck61Var, nr41 nr41Var, fo71 fo71Var) {
        hk61 hk61Var;
        switch (this.a) {
            case 0:
                List list = tg81Var.a.a;
                if (list.isEmpty()) {
                    hk61Var = null;
                } else if (list.size() > 1) {
                    hk61Var = vi71Var.h(context, tg81Var, v881Var, ck61Var, nr41Var);
                } else {
                    hk61Var = this.b.k(context, tg81Var, v881Var, vi71Var, ck61Var, nr41Var, (se71) list.get(0));
                }
                if (hk61Var == null) {
                    fo71Var.b(so61.a);
                    break;
                } else {
                    fo71Var.c(hk61Var);
                    break;
                }
            default:
                List list2 = tg81Var.a.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    t681 k = this.b.k(context, tg81Var, v881Var, vi71Var, ck61Var, nr41Var, (se71) it.next());
                    if (k != null) {
                        arrayList.add(k);
                    }
                }
                if (!arrayList.isEmpty()) {
                    fo71Var.n(arrayList);
                    break;
                } else {
                    fo71Var.b(so61.a);
                    break;
                }
        }
    }
}
