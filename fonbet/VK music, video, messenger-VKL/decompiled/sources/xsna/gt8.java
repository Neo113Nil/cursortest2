package xsna;

import android.app.Activity;
import com.vk.billing.StorePurchasesManager;
import com.vkontakte.android.R;

/* compiled from: BuyMusicSubscriptionHelper.java */
/* loaded from: classes3.dex */
public final class gt8 implements StorePurchasesManager.a<mge0> {
    public final /* synthetic */ com.vk.music.notifications.restriction.b b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ ht8 d;

    public gt8(ht8 ht8Var, com.vk.music.notifications.restriction.b bVar, Activity activity) {
        this.d = ht8Var;
        this.b = bVar;
        this.c = activity;
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
        ht8.e(ht8Var, this.c);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(mge0 mge0Var) {
        this.b.d(mge0Var);
        ht8.e(this.d, this.c);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
    }
}
