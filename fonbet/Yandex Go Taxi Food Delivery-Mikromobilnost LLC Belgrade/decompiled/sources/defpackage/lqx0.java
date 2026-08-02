package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.taxi.summary.shared.lifecycle.a;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.preorder.summary.selector.data.TariffCardType;

/* loaded from: classes6.dex */
public final class lqx0 {
    public static final /* synthetic */ kgx[] i = {new PropertyReference0Impl(CallableReference.NO_RECEIVER, lqx0.class, "bindingController", "<v#0>", 0)};
    public final bbx0 a;
    public final pav b;
    public final boolean c;
    public final k051 d;
    public final f1f0 e;
    public final c f;
    public final a g;
    public final h051 h = new h051();

    public lqx0(bbx0 bbx0Var, pav pavVar, boolean z, k051 k051Var, f1f0 f1f0Var, c cVar, a aVar) {
        this.a = bbx0Var;
        this.b = pavVar;
        this.c = z;
        this.d = k051Var;
        this.e = f1f0Var;
        this.f = cVar;
        this.g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sb5 a(ViewGroup viewGroup, int i2, hbp0 hbp0Var) {
        j051 j051Var;
        bbx0 bbx0Var = this.a;
        int i3 = kqx0.a[bbx0Var.a.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            kgx kgxVar = i[0];
            return new oju(new wjm(viewGroup), this.b, this.a, this.c, hbp0Var, this.e, this.f, this.g);
        }
        if (i2 == TariffCardType.Single.getViewId()) {
            amp0 amp0Var = new amp0();
            amp0Var.a = viewGroup;
            j051Var = amp0Var;
        } else {
            j051Var = new j051(bbx0Var);
        }
        return new i051(LayoutInflater.from(viewGroup.getContext()).inflate(vrh0.tariff_card_item_wide_holder, viewGroup, false), j051Var, this.b, this.a, this.d, this.h, hbp0Var, this.e, this.f, this.g);
    }
}
