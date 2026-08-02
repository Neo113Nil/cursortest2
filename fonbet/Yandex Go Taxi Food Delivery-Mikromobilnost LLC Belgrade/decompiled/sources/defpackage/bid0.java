package defpackage;

import android.content.Context;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.cashback.login.PlusPortalLoginModalView;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes6.dex */
public final class bid0 {
    public final Context a;
    public final g b;
    public final w030 c;
    public final d d;
    public final com.yandex.go.superapp.order.multi.old.provider.g e;
    public final l f;

    public bid0(Context context, g gVar, w030 w030Var, d dVar, com.yandex.go.superapp.order.multi.old.provider.g gVar2, l lVar) {
        this.a = context;
        this.b = gVar;
        this.c = w030Var;
        this.d = dVar;
        this.e = gVar2;
        this.f = lVar;
    }

    public final void a(wnb0 wnb0Var) {
        if (this.b.a.Mg() && this.f.a().f && !this.e.e()) {
            w030 w030Var = this.c;
            w030Var.m(PlusPortalLoginModalView.class);
            w030Var.k(new PlusPortalLoginModalView(this.a, new oy80(21, this, wnb0Var)), 3.0f, true);
        }
    }
}
