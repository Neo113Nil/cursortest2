package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class og7 implements dya0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ og7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.dya0
    public final void a(List list) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                gp50 gp50Var = ((u9j0) obj2).c;
                Uri uri = (Uri) obj;
                List<mya0> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (mya0 mya0Var : list2) {
                        if (jl40.l(mya0Var.a, uxa0.a) && mya0Var.c) {
                            gp50Var.H(uri, "android.intent.action.CALL");
                            return;
                        }
                    }
                }
                gp50Var.H(uri, "android.intent.action.DIAL");
                return;
            case 1:
                dya0 dya0Var = (dya0) obj2;
                prd prdVar = (prd) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mya0 mya0Var2 = (mya0) it.next();
                    ((x8o) prdVar.c).c("Permissions", "Requested permission " + mya0Var2.a.a() + ", granted: " + mya0Var2.c);
                }
                dya0Var.a(list);
                return;
            case 2:
                dya0 dya0Var2 = (dya0) obj2;
                prd prdVar2 = (prd) obj;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((ArrayList) prdVar2.c).iterator();
                    if (it3.hasNext()) {
                        throw unr0.i(it3);
                    }
                }
                dya0Var2.a(list);
                return;
            default:
                ((sya0) obj2).f(list);
                ((dya0) obj).a(list);
                return;
        }
    }
}
