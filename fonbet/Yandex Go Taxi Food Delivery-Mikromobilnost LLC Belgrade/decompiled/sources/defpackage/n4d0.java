package defpackage;

import com.yandex.plus.home.c;
import com.yandex.plus.home.graphql.configuration.a;
import kotlin.Result;

/* loaded from: classes8.dex */
public final /* synthetic */ class n4d0 implements ulp {
    public final /* synthetic */ c a;

    public slp a() {
        Object e = ((a) this.a.f.v.getValue()).e();
        if (e instanceof Result.Failure) {
            e = null;
        }
        xnp0 xnp0Var = (xnp0) e;
        if (xnp0Var != null) {
            return q5b1.i(xnp0Var);
        }
        return null;
    }

    @Override // defpackage.ulp
    /* renamed from: get */
    public tlp mo967get() {
        Object h = this.a.f.a().h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        return new tlp(k2d0Var != null ? k2d0Var.d : null);
    }
}
