package xsna;

import com.vk.billing.StorePurchasesManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vkontakte.android.R;

/* compiled from: BuyMusicSubscriptionHelper.java */
/* loaded from: classes3.dex */
public final class et8 implements StorePurchasesManager.a<mge0> {
    public final /* synthetic */ StorePurchasesManager.a b;
    public final /* synthetic */ FragmentImpl c;
    public final /* synthetic */ ht8 d;

    public et8(ht8 ht8Var, MusicSubscriptionControlFragment.d dVar, FragmentImpl fragmentImpl) {
        this.d = ht8Var;
        this.b = dVar;
        this.c = fragmentImpl;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void a() {
        cvk.u(R.string.purchase_cancelled, false);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void c(mge0 mge0Var, nge0 nge0Var) {
        this.b.c(mge0Var, nge0Var);
        ht8 ht8Var = this.d;
        ht8Var.c(mge0Var, nge0Var);
        ht8.e(ht8Var, this.c.getActivity());
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(mge0 mge0Var) {
        this.b.d(mge0Var);
        ht8.e(this.d, this.c.getActivity());
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
    }
}
