package defpackage;

import jason.statham.tools.a;

/* loaded from: classes13.dex */
public final class jcn0 {
    public static final /* synthetic */ int b = 0;
    public final icn0 a;

    static {
        s6x s6xVar = icn0.b;
    }

    public jcn0(icn0 icn0Var) {
        this.a = icn0Var;
    }

    public final void a(boolean z) {
        k6x k6xVar = this.a.a;
        if (k6xVar.a()) {
            d6x d = a.d(k6xVar.b(), icn0.a("is_submit_in_progress"), jx81.M(Boolean.valueOf(z)), icn0.b);
            if (d.equals(k6xVar.b())) {
                return;
            }
            k6xVar.e(d);
        }
    }
}
