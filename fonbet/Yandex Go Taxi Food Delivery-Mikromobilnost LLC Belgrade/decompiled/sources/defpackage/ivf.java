package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.divkit.verify.DKVerifyCardFragment;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ivf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKVerifyCardFragment b;

    public /* synthetic */ ivf(DKVerifyCardFragment dKVerifyCardFragment, int i) {
        this.a = i;
        this.b = dKVerifyCardFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r3 = r3.div2View;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Div2View div2View;
        kvf viewModel;
        kvf viewModel2;
        Div2View div2View2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DKVerifyCardFragment dKVerifyCardFragment = this.b;
        switch (i) {
            case 0:
                m960 m960Var = (m960) obj;
                if (!jl40.l(m960Var, m960.a)) {
                    if (!jl40.l(m960Var, m960.b)) {
                        if (jl40.l(m960Var, m960.c) && div2View != null) {
                            div2View.setVariable("card_input_screen_nfc_visibility", "gone");
                            break;
                        }
                    } else {
                        viewModel = dKVerifyCardFragment.getViewModel();
                        if (viewModel.K == null) {
                            viewModel.K = Boolean.TRUE;
                            break;
                        }
                    }
                } else {
                    viewModel2 = dKVerifyCardFragment.getViewModel();
                    if (viewModel2.K == null) {
                        viewModel2.K = Boolean.FALSE;
                    }
                    div2View2 = dKVerifyCardFragment.div2View;
                    if (div2View2 != null) {
                        div2View2.setVariable("card_input_screen_nfc_visibility", "gone");
                        break;
                    }
                }
                break;
            default:
                dKVerifyCardFragment.observeDivData((cnk) obj);
                dKVerifyCardFragment.listenNfcState();
                break;
        }
        return zy11Var;
    }
}
