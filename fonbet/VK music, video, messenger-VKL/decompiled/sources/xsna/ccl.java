package xsna;

import com.vk.billing.StorePurchasesManager;
import xsna.ys8;

/* compiled from: DefaultBuyMusicSubscriptionButtonModel.kt */
/* loaded from: classes3.dex */
public final class ccl implements StorePurchasesManager.b {
    public final /* synthetic */ ys8.b a;
    public final /* synthetic */ dcl b;

    public ccl(ys8.b bVar, dcl dclVar) {
        this.a = bVar;
        this.b = dclVar;
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void a() {
        bn40.h("BMSBM", "GetPriceFailed: billing unavailable");
        this.a.onError(5);
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void b() {
        bn40.h("BMSBM", "GetPriceFailed: billing failed");
        this.a.onError(dcl.c(false));
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void c(mge0 mge0Var) {
        u1u0.e(new vw1(mge0Var, this.a, this.b, 1));
    }

    @Override // com.vk.billing.StorePurchasesManager.b
    public final void d(int i) {
    }
}
