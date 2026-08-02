package xsna;

import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import java.util.LinkedHashMap;
import xsna.hjl0;

/* compiled from: StorefrontEventsObserver.kt */
/* loaded from: classes18.dex */
public final class aml0 {
    public final StorefrontFragment.c a;
    public final ull0 b;
    public boolean c;
    public final LinkedHashMap d = new LinkedHashMap();
    public io.reactivex.rxjava3.disposables.c e;

    public aml0(StorefrontFragment.c cVar, ull0 ull0Var) {
        this.a = cVar;
        this.b = ull0Var;
        ((q530) ull0Var.d.getValue()).d(new zll0(this));
    }

    public final void a(ay00 ay00Var) {
        boolean z = ay00Var instanceof gu00;
        StorefrontFragment.c cVar = this.a;
        if (z || (ay00Var instanceof iu00) || (ay00Var instanceof hu00) || (ay00Var instanceof ju00) || (ay00Var instanceof ku00) || (ay00Var instanceof fu00)) {
            if (ay00Var.q() != null) {
                cVar.invoke(new gjl0(ay00Var));
                cVar.invoke(new mjl0(ay00Var));
                cVar.invoke(new hjl0.b.C3004b(ay00Var));
                return;
            }
            return;
        }
        if ((ay00Var instanceof MarketEventGoodCreated) || (ay00Var instanceof iy00) || (ay00Var instanceof cy00) || (ay00Var instanceof dy00)) {
            cVar.invoke(hjl0.e.b);
        } else if (ay00Var instanceof hy00) {
            cVar.invoke(hjl0.b.a.b);
        }
    }
}
