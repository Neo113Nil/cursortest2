package defpackage;

import androidx.fragment.app.Fragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class ckb implements y23 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ cg6 y;
    public final /* synthetic */ Fragment z;

    public /* synthetic */ ckb(CheckoutFragment checkoutFragment, int i, int i2, int i3, int i4, pjb pjbVar, cg6 cg6Var) {
        this.z = checkoutFragment;
        this.b = i;
        this.c = i2;
        this.w = i3;
        this.x = i4;
        this.A = pjbVar;
        this.y = cg6Var;
    }

    @Override // defpackage.y23
    public final void b(u1w u1wVar) {
        int i = this.a;
        Object obj = this.A;
        Fragment fragment = this.z;
        switch (i) {
            case 0:
                cg6 cg6Var = this.y;
                CheckoutFragment.applyInsets$lambda$6$lambda$4((CheckoutFragment) fragment, this.b, this.c, this.w, this.x, (pjb) obj, cg6Var, u1wVar);
                break;
            default:
                UpsaleFragment.applyInsets$lambda$5$lambda$3((UpsaleFragment) fragment, this.b, this.c, this.w, this.x, this.y, (ee21) obj, u1wVar);
                break;
        }
    }

    public /* synthetic */ ckb(UpsaleFragment upsaleFragment, int i, int i2, int i3, int i4, cg6 cg6Var, ee21 ee21Var) {
        this.z = upsaleFragment;
        this.b = i;
        this.c = i2;
        this.w = i3;
        this.x = i4;
        this.y = cg6Var;
        this.A = ee21Var;
    }
}
