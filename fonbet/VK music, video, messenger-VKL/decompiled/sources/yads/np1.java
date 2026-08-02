package yads;

import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class np1 {
    public final List a;
    public final fq1 b;
    public final sp1 c;
    public final hp1 d;
    public int e;

    public np1(List list, fq1 fq1Var, sp1 sp1Var, hp1 hp1Var) {
        this.a = list;
        this.b = fq1Var;
        this.c = sp1Var;
        this.d = hp1Var;
    }

    public final dp1 a(Context context, Class cls) {
        while (this.e < this.a.size()) {
            List list = this.a;
            int i = this.e;
            this.e = i + 1;
            rr1 rr1Var = (rr1) list.get(i);
            com.monetization.ads.mediation.base.a a = this.c.a(context, rr1Var, cls);
            if (a != null) {
                this.d.getClass();
                return new dp1(a, rr1Var, new gp1(a), this.b);
            }
        }
        return null;
    }

    public /* synthetic */ np1(List list, fq1 fq1Var, yp1 yp1Var) {
        this(list, fq1Var, new sp1(yp1Var), new hp1());
    }
}
