package xsna;

import com.vk.billing.StorePurchasesManager;
import com.vk.dto.common.data.Subscription;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import kotlin.Pair;

/* compiled from: MusicSubscriptionControlContractPresenterContract.kt */
/* loaded from: classes3.dex */
public final class a950 implements StorePurchasesManager.b {
    public final /* synthetic */ b950 a;
    public final /* synthetic */ Subscription b;

    public a950(b950 b950Var, Subscription subscription) {
        this.a = b950Var;
        this.b = subscription;
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void a() {
        this.a.b.jo(null, null, true);
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void b() {
        this.a.b.jo(null, null, false);
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void c(mge0 mge0Var) {
        MusicSubscriptionControlFragment musicSubscriptionControlFragment = this.a.b;
        boolean ma = mge0Var.ma();
        Subscription subscription = this.b;
        if (!ma) {
            musicSubscriptionControlFragment.jo(subscription, null, false);
            return;
        }
        d950 d950Var = musicSubscriptionControlFragment.V;
        if (d950Var == null) {
            d950Var = null;
        }
        d950Var.k.x0(new Pair(subscription.i, subscription.l));
        d950Var.n.x0(subscription);
        d950Var.m.x0(null);
        d950Var.l.x0(null);
        d950Var.p.x0(null);
        d950Var.o.x0(null);
        d950Var.r.x0(subscription.o);
        d950Var.C0(false);
        mzp0 mzp0Var = musicSubscriptionControlFragment.J;
        if (mzp0Var != null) {
            mzp0Var.d(musicSubscriptionControlFragment.getView());
        }
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void d(int i) {
    }
}
