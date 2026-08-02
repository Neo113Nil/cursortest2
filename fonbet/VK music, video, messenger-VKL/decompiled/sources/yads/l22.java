package yads;

import android.content.Context;
import android.view.View;
import kotlin.collections.EmptyList;
import xsna.efz;
import xsna.epx;

/* loaded from: classes10.dex */
public class l22 implements k62 {
    public final m32 a;
    public final v9 b;
    public String c;
    public m22 d;

    public l22(oz1 oz1Var, v9 v9Var) {
        this.a = oz1Var;
        this.b = v9Var;
    }

    public xc3 a(int i, Context context, boolean z) {
        m22 m22Var = this.d;
        View a = m22Var != null ? m22Var.c.a() : null;
        if (a == null) {
            return new uc3(tc3.g, null, null);
        }
        if (om3.b(a)) {
            return new uc3(tc3.h, null, null);
        }
        bn3 a2 = om3.a.a(a);
        String str = a2.b;
        this.c = str;
        if (a2.a < 1) {
            return new uc3(tc3.i, null, str);
        }
        if (a(a, i) && !z) {
            return new uc3(tc3.e, null, this.c);
        }
        String str2 = this.b.k;
        eg0[] eg0VarArr = eg0.b;
        return (!epx.f(str2, "divkit") || this.b.H) ? ((oz1) this.a).a(z) : new vc3(EmptyList.b);
    }

    public final lq2 b() {
        return ((oz1) this.a).e();
    }

    public final boolean a() {
        View a;
        m22 m22Var = this.d;
        if (m22Var == null || (a = m22Var.c.a()) == null) {
            return true;
        }
        return om3.b(a);
    }

    public final boolean a(View view, int i) {
        int a = om3.a(view);
        this.c = efz.a(a, i, "actualPercent: ", ", expectedPercent: ");
        return a < i;
    }

    public final void a(m22 m22Var) {
        ((oz1) this.a).d = m22Var;
        this.d = m22Var;
    }
}
