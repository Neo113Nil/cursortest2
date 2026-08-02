package defpackage;

import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.model.data.AdditionalSettings;

/* loaded from: classes2.dex */
public final class d55 implements v7p {
    public final /* synthetic */ int a;
    public final w3i b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ d55(w3i w3iVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = w3iVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        w3i w3iVar = this.b;
        switch (i) {
            case 0:
                return new ps90(znb1.h((Payer) w3iVar.c), new ag1(((Merchant) w3iVar.w).getServiceToken(), 6), (nhj) xvf0Var2.get(), ((AdditionalSettings) w3iVar.x).getRegionId(), (rwo) xvf0Var.get());
            default:
                Payer payer = (Payer) w3iVar.c;
                r501 r501Var = new r501(27);
                znb1.h(payer);
                return r501Var;
        }
    }
}
