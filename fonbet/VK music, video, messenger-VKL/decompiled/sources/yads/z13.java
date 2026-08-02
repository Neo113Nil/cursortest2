package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class z13 extends l22 {
    public final v32 e;
    public final hx2 f;

    public z13(v32 v32Var, oz1 oz1Var, hx2 hx2Var, v9 v9Var) {
        super(oz1Var, v9Var);
        this.e = v32Var;
        this.f = hx2Var;
    }

    @Override // yads.l22
    public final xc3 a(int i, Context context, boolean z) {
        qu2 a = this.f.a(context);
        xc3 a2 = (a == null || a.p) ? super.a(i, context, z) : new vc3(EmptyList.b);
        if (a2 instanceof vc3) {
            List list = this.e.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof q42) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q42 q42Var = (q42) it.next();
                    k62 k62Var = q42Var.d;
                    n82 n82Var = q42Var.e;
                    qu2 a3 = this.f.a(context);
                    boolean z2 = a3 != null ? a3.p : true;
                    Iterator it2 = n82Var.b.iterator();
                    while (it2.hasNext()) {
                        int i2 = z2 ? ((tz2) it2.next()).c : i;
                        if ((z ? ((l22) k62Var).a(i2, context, true) : ((l22) k62Var).a(i2, context, false)) instanceof uc3) {
                            break;
                        }
                    }
                }
            }
            return new uc3(tc3.d, null, null);
        }
        return a2;
    }
}
