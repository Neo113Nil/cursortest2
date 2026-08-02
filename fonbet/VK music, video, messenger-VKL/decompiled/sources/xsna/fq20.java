package xsna;

import com.vk.billing.StorePurchasesManager;
import com.vk.superapp.bridges.SuperappPurchasesBridge$PurchaseResult;

/* compiled from: MiniAppPurchaseManagerImpl.kt */
/* loaded from: classes6.dex */
public final class fq20 implements StorePurchasesManager.a<dq20> {
    public final /* synthetic */ eq20 b;
    public final /* synthetic */ wwq c;

    public fq20(eq20 eq20Var, wwq wwqVar) {
        this.b = eq20Var;
        this.c = wwqVar;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void a() {
        this.c.invoke(null, null, SuperappPurchasesBridge$PurchaseResult.CANCEL);
        this.b.c = null;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
        this.c.invoke(null, null, SuperappPurchasesBridge$PurchaseResult.UNAVAILABLE);
        this.b.c = null;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void c(dq20 dq20Var, nge0 nge0Var) {
        this.c.invoke(dq20Var, nge0Var, SuperappPurchasesBridge$PurchaseResult.SUCCESS);
        this.b.c = null;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(dq20 dq20Var) {
        this.c.invoke(dq20Var, null, SuperappPurchasesBridge$PurchaseResult.ERROR);
        this.b.c = null;
    }
}
