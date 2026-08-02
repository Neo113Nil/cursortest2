package yads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class lq3 {
    public final gq3 a;
    public final ArrayList b = new ArrayList();
    public up2 c;
    public int d;

    public lq3(gq3 gq3Var) {
        this.a = gq3Var;
    }

    public final void a(Context context, List list, up2 up2Var, Object obj) {
        if (list.isEmpty()) {
            up2Var.onSuccess(this.b);
            return;
        }
        this.c = up2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ye3 ye3Var = (ye3) it.next();
            this.d++;
            gq3 gq3Var = this.a;
            kq3 kq3Var = new kq3(this);
            gq3Var.getClass();
            hq3 hq3Var = new hq3(kq3Var, new iq3(context, ye3Var));
            tf3 tf3Var = gq3Var.e;
            ov2 ov2Var = gq3Var.b;
            d4 d4Var = gq3Var.a;
            vd3 vd3Var = gq3Var.c;
            jh3 jh3Var = gq3Var.d;
            tf3Var.getClass();
            de3 de3Var = new de3();
            String str = ye3Var.i;
            if (str == null) {
                str = "";
            }
            Uri parse = Uri.parse(str);
            if (j5g.P((List) ca1.a.getValue(), parse.getHost())) {
                str = nm2.a(parse, new ce3(de3Var, vd3Var, d4Var, context)).toString();
            }
            String str2 = str;
            qq3 qq3Var = new qq3(jh3Var);
            un3 un3Var = new un3(hq3Var);
            bu1 a = ((mv3) ov2Var).a();
            iz2.a.getClass();
            iz2 a2 = hz2.a(context);
            he3 he3Var = new he3(context, d4Var, a, str2, un3Var, ye3Var, qq3Var, a2, new ez2(a2), new md3(context, a));
            he3Var.q = obj;
            tf3Var.a.a(he3Var);
        }
    }
}
