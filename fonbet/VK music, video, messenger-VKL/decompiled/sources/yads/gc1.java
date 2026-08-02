package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class gc1 extends po {
    public final Context w;
    public final zp2 x;
    public final Map y;

    public gc1(Context context, String str, zp2 zp2Var, Map map, f71 f71Var) {
        super(context, str, f71Var);
        this.w = context;
        this.x = zp2Var;
        this.y = map;
    }

    @Override // yads.po, yads.qp2
    public final mn3 a(mn3 mn3Var) {
        return mn3Var;
    }

    @Override // yads.qp2
    public final Map d() {
        HashMap hashMap = new HashMap();
        qu2 a = gx2.a().a(this.w);
        if (a != null && a.C) {
            w11 w11Var = w11.c;
            hashMap.put("encrypted-request", "1");
        }
        hashMap.putAll(this.y);
        return hashMap;
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        if (200 != g92Var.a) {
            return new wq2(new h4(m4.e, g92Var));
        }
        j80 j80Var = (j80) this.x.a(g92Var);
        return j80Var != null ? new wq2(j80Var, x11.a(g92Var)) : new wq2(new h4(m4.c, g92Var));
    }
}
