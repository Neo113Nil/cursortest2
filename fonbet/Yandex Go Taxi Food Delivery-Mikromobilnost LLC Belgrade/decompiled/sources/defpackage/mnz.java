package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.repositories.c;

/* loaded from: classes6.dex */
public final class mnz {
    public final hnz a;
    public final knz b;
    public final c c;
    public final tt2 d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.LONG_SEARCH_V2.getTag(), "LongSearchV2Interactor");
    public pzt0 f;
    public pzt0 g;

    public mnz(hnz hnzVar, knz knzVar, wiq0 wiq0Var, c cVar, tt2 tt2Var) {
        this.a = hnzVar;
        this.b = knzVar;
        this.c = cVar;
        this.d = tt2Var;
    }

    public final void a() {
        a3y0.a(this.e, new String[]{"stopPolling"}, null, 6);
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
    }
}
