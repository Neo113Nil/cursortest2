package xsna;

import com.vk.billing.StorePurchasesManager;
import com.vk.dto.common.data.Subscription;
import com.vkontakte.android.R;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class n0j0 implements StorePurchasesManager.a<Subscription> {
    public final /* synthetic */ com.vk.core.view.components.spinner.c b;
    public final /* synthetic */ Subscription c;

    public n0j0(com.vk.core.view.components.spinner.c cVar, Subscription subscription) {
        this.b = cVar;
        this.c = subscription;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void a() {
        cvk.u(R.string.purchase_cancelled, false);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void c(Subscription subscription, nge0 nge0Var) {
        com.vk.core.view.components.spinner.c cVar = this.b;
        cvk.w(cVar.getContext().getString(R.string.sett_purchases_restored, this.c.i), false);
        qv20.b(cVar);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(Subscription subscription) {
        cvk.u(R.string.sett_purchases_not_found, false);
        qv20.b(this.b);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
    }
}
