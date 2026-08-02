package defpackage;

import android.view.View;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.bind.view.DKCardInputViewImpl;
import com.yandex.payment.sdk.ui.CardInput$State;

/* loaded from: classes2.dex */
public final /* synthetic */ class drf implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ DKCardInputViewImpl b;
    public final /* synthetic */ DKBindCardFragment c;

    public /* synthetic */ drf(DKBindCardFragment dKBindCardFragment, DKCardInputViewImpl dKCardInputViewImpl) {
        this.c = dKBindCardFragment;
        this.b = dKCardInputViewImpl;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        DKBindCardFragment dKBindCardFragment = this.c;
        DKCardInputViewImpl dKCardInputViewImpl = this.b;
        switch (i) {
            case 0:
                zy11Var = DKBindCardFragment.setupInput$lambda$1$4(dKBindCardFragment, dKCardInputViewImpl, (CardInput$State) obj);
                return zy11Var;
            default:
                zy11Var2 = DKBindCardFragment.setupInput$lambda$2(dKCardInputViewImpl, dKBindCardFragment, (View) obj);
                return zy11Var2;
        }
    }

    public /* synthetic */ drf(DKCardInputViewImpl dKCardInputViewImpl, DKBindCardFragment dKBindCardFragment) {
        this.b = dKCardInputViewImpl;
        this.c = dKBindCardFragment;
    }
}
