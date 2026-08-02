package xsna;

import android.graphics.Rect;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import xsna.aqx0;

/* compiled from: RootViewAnimationCallback.kt */
/* loaded from: classes2.dex */
public final class omg0 extends aqx0.b implements u080 {
    public final u3k d;
    public final w8q e;
    public final n5i f;
    public final jcg g;
    public View h;
    public bqx0 i;
    public boolean j;

    public omg0(u3k u3kVar, w8q w8qVar, n5i n5iVar, jcg jcgVar) {
        super(1);
        this.d = u3kVar;
        this.e = w8qVar;
        this.f = n5iVar;
        this.g = jcgVar;
    }

    @Override // xsna.aqx0.b
    public final void a(aqx0 aqx0Var) {
        View view;
        if (!this.j || (aqx0Var.a.d() & 8) == 0) {
            return;
        }
        this.j = false;
        this.e.invoke();
        bqx0 bqx0Var = this.i;
        if (bqx0Var == null || (view = this.h) == null) {
            return;
        }
        iut0.c(view, bqx0Var);
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        this.h = view;
        this.i = bqx0Var;
        h4x i = bqx0Var.a.i(this.j ? 519 : IronSourceError.ERROR_NON_EXISTENT_INSTANCE);
        int i2 = i.d;
        int i3 = i.c;
        int i4 = i.b;
        int i5 = i.a;
        view.setPadding(i5, i4, i3, i2);
        Rect rect = new Rect(i5, i4, i3, i2);
        int i6 = ify.a;
        ify.f(rect);
        return bqx0.b;
    }

    @Override // xsna.aqx0.b
    public final void c(aqx0 aqx0Var) {
        if ((aqx0Var.a.d() & 8) != 0) {
            this.j = true;
            this.d.invoke();
            int i = ify.a;
            if (ify.e(ify.c)) {
                this.g.invoke();
            } else {
                this.f.invoke();
            }
        }
    }

    @Override // xsna.aqx0.b
    public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
        return bqx0Var;
    }
}
