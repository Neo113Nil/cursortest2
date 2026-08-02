package xsna;

import android.view.View;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import xsna.av20;

/* compiled from: VkPayConfirmationFragment.kt */
/* loaded from: classes6.dex */
public final class pbv0 implements av20.b<PayMethodData> {
    public final /* synthetic */ nbv0 a;

    public pbv0(nbv0 nbv0Var) {
        this.a = nbv0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        PayMethodData payMethodData = (PayMethodData) obj;
        nbv0 nbv0Var = this.a;
        dw20 dw20Var = nbv0Var.p;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        nbv0Var.p = null;
        if (payMethodData instanceof Card) {
            mbv0 mbv0Var = (mbv0) nbv0Var.h;
            if (mbv0Var != null) {
                mbv0Var.D0((Card) payMethodData);
                return;
            }
            return;
        }
        if (!(payMethodData instanceof AddCardMethod)) {
            throw new IllegalArgumentException("Nothing but cards is supported by now");
        }
        mbv0 mbv0Var2 = (mbv0) nbv0Var.h;
        if (mbv0Var2 != null) {
            mbv0Var2.r1();
        }
    }
}
