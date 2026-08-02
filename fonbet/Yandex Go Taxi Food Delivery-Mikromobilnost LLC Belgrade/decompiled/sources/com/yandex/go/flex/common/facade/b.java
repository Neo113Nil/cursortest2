package com.yandex.go.flex.common.facade;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b3k;
import defpackage.czo0;
import defpackage.gqq;
import defpackage.hbp0;
import defpackage.o400;
import defpackage.pey;
import defpackage.rhr;
import defpackage.rkr;
import defpackage.sjh;
import defpackage.szl;
import defpackage.uyj;
import defpackage.vng;
import defpackage.xhr;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements xhr {
    public final flex.engine.a a;
    public final rhr b;
    public final b3k c;
    public final hbp0 d = new hbp0(new czo0(14), b.class.getSimpleName(), null);

    public b(flex.engine.a aVar, rhr rhrVar, gqq gqqVar) {
        this.a = aVar;
        this.b = rhrVar;
        this.c = gqqVar;
    }

    public final void a(szl szlVar) {
        this.a.b(szlVar);
    }

    public final void b(ViewGroup viewGroup, rkr rkrVar) {
        pey o = vng.o(viewGroup);
        flex.engine.a aVar = this.a;
        if (o != null) {
            aVar.g(viewGroup, o);
            this.c.a(viewGroup.getContext(), o);
        }
        RecyclerView.g d = this.b.d();
        if (d != null) {
            aVar.d(d);
        }
        hbp0 hbp0Var = this.d;
        hbp0Var.f();
        sjh sjhVar = uyj.a;
        hbp0.e(hbp0Var, o400.a.x, null, new FlexControllerImpl$attach$3(this, rkrVar, null), 2);
    }

    public final void c() {
        this.a.i();
    }

    public final void d() {
        this.d.b();
        RecyclerView.g d = this.b.d();
        flex.engine.a aVar = this.a;
        if (d != null) {
            aVar.y(d);
        }
        aVar.j();
    }

    public final void e(szl szlVar) {
        ((ArrayList) this.a.P.c).remove(szlVar);
    }
}
