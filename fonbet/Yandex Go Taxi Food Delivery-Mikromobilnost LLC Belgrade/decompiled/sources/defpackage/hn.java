package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.acquisition.adapter.internal.controller.b;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes2.dex */
public final class hn implements fn {
    public final ViewGroup a;
    public final sls b;
    public pzt0 c;
    public final i3y d;
    public final i3y e = a.a(new d4(7, this));

    public hn(ViewGroup viewGroup, sls slsVar, in inVar, y17 y17Var, PropertyReference0Impl propertyReference0Impl, ijd0 ijd0Var, imd0 imd0Var, y821 y821Var) {
        this.a = viewGroup;
        this.b = slsVar;
        this.d = a.a(new gn(y17Var, this, inVar, propertyReference0Impl, ijd0Var, imd0Var, y821Var, 0));
    }

    public final void a() {
        this.b.invoke();
        b bVar = (b) ((g0d0) this.d.getValue());
        pzt0 pzt0Var = bVar.b;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.b = null;
        View view = ((qs90) this.e.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
        this.a.removeAllViews();
    }
}
