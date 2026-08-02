package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.cancel.similar.interactor.h;
import com.yandex.go.taxi.order.cancel.similar.view.CancelSimilarOrdersModalView;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.data.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class n08 extends m230 {
    public final w030 E;
    public final a08 F;
    public final k08 G;
    public final vz7 H;
    public final d08 I;
    public final a J;
    public final com.yandex.go.taxi.order.cancel.similar.notification.a K;

    public n08(w030 w030Var, a08 a08Var, k08 k08Var, vz7 vz7Var, d08 d08Var, a aVar, com.yandex.go.taxi.order.cancel.similar.notification.a aVar2) {
        super(null);
        this.E = w030Var;
        this.F = a08Var;
        this.G = k08Var;
        this.H = vz7Var;
        this.I = d08Var;
        this.J = aVar;
        this.K = aVar2;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = ((m08) obj).a;
        this.J.c(cancelSimilarOrdersNotification.a);
        l08 l08Var = new l08(this, cancelSimilarOrdersNotification.f);
        String str = cancelSimilarOrdersNotification.b;
        this.I.a.getClass();
        m2v m2vVar = new m2v();
        m2vVar.a = cancelSimilarOrdersNotification;
        r0 c = bvf0.c(Boolean.FALSE);
        m2vVar.b = c;
        m2vVar.c = e.d(c);
        m2vVar.w = new LinkedHashSet();
        bu0 bu0Var = this.H.a;
        h hVar = new h(str, m2vVar, (x980) ((xvf0) bu0Var.a).get(), (pz7) ((dx7) bu0Var.b).get(), (h980) ((xvf0) bu0Var.c).get(), (n20) ((xvf0) bu0Var.d).get(), (c) ((xvf0) bu0Var.e).get(), (pdc) ((xvf0) bu0Var.f).get(), (tt2) ((xvf0) bu0Var.g).get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) bu0Var.h).get(), (g08) ((xvf0) bu0Var.i).get());
        c06 c06Var = this.G.a;
        j08 j08Var = new j08(cancelSimilarOrdersNotification, l08Var, hVar, (hh5) ((pg5) c06Var.a).get(), (pwy0) ((xvf0) c06Var.b).get());
        zz7 zz7Var = this.F.a;
        return new CancelSimilarOrdersModalView((Context) zz7Var.a.get(), j08Var, (ip11) zz7Var.b.get());
    }
}
