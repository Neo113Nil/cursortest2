package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import com.yandex.payment.divkit.select.DKSelectFragment;
import com.yandex.payment.divkit.select.PlusCardTopUpState;
import com.yandex.payment.divkit.select.a;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class puf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKSelectFragment b;

    public /* synthetic */ puf(DKSelectFragment dKSelectFragment, int i) {
        this.a = i;
        this.b = dKSelectFragment;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        avf viewModel;
        do21 buildUserInput;
        raq0 raq0Var;
        avf viewModel2;
        raq0 raq0Var2;
        avf viewModel3;
        rwl binding;
        String queryParameter;
        raq0 raq0Var3;
        avf viewModel4;
        avf viewModel5;
        raq0 raq0Var4;
        String userTypedEmail;
        avf viewModel6;
        rwl binding2;
        raq0 raq0Var5;
        raq0 raq0Var6;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DKSelectFragment dKSelectFragment = this.b;
        switch (i) {
            case 0:
                dKSelectFragment.updateState((keq0) obj);
                break;
            case 1:
                smk smkVar = (smk) obj;
                List<Pair> list = smkVar.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (Pair pair : list) {
                    if (jl40.l(pair.c(), "select_method_screen_selected_method")) {
                        pair = new Pair(pair.c(), String.valueOf(dKSelectFragment.getMediator().c()));
                    }
                    arrayList.add(pair);
                }
                dKSelectFragment.observeDivData(smk.a(smkVar, arrayList));
                break;
            case 2:
                uv90 uv90Var = (uv90) obj;
                if (uv90Var != null) {
                    dKSelectFragment.updatePayment(uv90Var);
                    break;
                }
                break;
            case 3:
                int i2 = a.a[((PlusCardTopUpState) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        viewModel = dKSelectFragment.getViewModel();
                        buildUserInput = dKSelectFragment.buildUserInput();
                        viewModel.t(buildUserInput);
                        break;
                    }
                } else {
                    DKSelectFragment.setStateLoading$default(dKSelectFragment, false, false, 3, null);
                    break;
                }
                break;
            case 4:
                String str = (String) obj;
                raq0Var = dKSelectFragment.callbacks;
                if (raq0Var == null) {
                    raq0Var = null;
                }
                BaseActivity baseActivity = ((zbq0) raq0Var).a;
                PaymentActivity paymentActivity = baseActivity instanceof PaymentActivity ? (PaymentActivity) baseActivity : null;
                if (paymentActivity != null) {
                    paymentActivity.restoreSelectFragment(str);
                    break;
                }
                break;
            case 5:
                Uri uri = (Uri) obj;
                String uri2 = uri.toString();
                Integer l = bvu0.l(10, evu0.d0(uri2, "select_method_screen_selected_method&value=", uri2));
                if (l != null) {
                    int intValue = l.intValue();
                    viewModel5 = dKSelectFragment.getViewModel();
                    viewModel5.j(intValue);
                }
                String host = uri.getHost();
                if (host != null) {
                    switch (host.hashCode()) {
                        case 3015911:
                            if (host.equals("back")) {
                                dKSelectFragment.requireActivity().onBackPressed();
                                break;
                            }
                            break;
                        case 47329499:
                            if (host.equals("bind_card_click")) {
                                viewModel2 = dKSelectFragment.getViewModel();
                                viewModel2.G();
                                raq0Var2 = dKSelectFragment.callbacks;
                                ((zbq0) (raq0Var2 != null ? raq0Var2 : null)).O(true);
                                break;
                            }
                            break;
                        case 1115503494:
                            if (host.equals("click_on_promo")) {
                                viewModel3 = dKSelectFragment.getViewModel();
                                viewModel3.A();
                                com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                                dKSelectFragment.requireActivity();
                                binding = dKSelectFragment.getBinding();
                                LinearLayout linearLayout = binding.b;
                                eja1.s(dKSelectFragment);
                                com.yandex.payment.sdk.core.utils.a.c();
                                break;
                            }
                            break;
                        case 1126556261:
                            if (host.equals("show_toast") && (queryParameter = uri.getQueryParameter(Constants.KEY_MESSAGE)) != null) {
                                raq0Var3 = dKSelectFragment.callbacks;
                                if (raq0Var3 == null) {
                                    raq0Var3 = null;
                                }
                                BaseActivity baseActivity2 = ((zbq0) raq0Var3).a;
                                if (baseActivity2 instanceof PaymentActivity) {
                                    ((PaymentActivity) baseActivity2).showSnackBar(queryParameter, (String) null);
                                    break;
                                } else if (baseActivity2 instanceof PreselectActivity) {
                                    ((PreselectActivity) baseActivity2).showSnackBar(queryParameter, (String) null);
                                    break;
                                }
                            }
                            break;
                        case 1284156530:
                            if (host.equals("pay_button_click")) {
                                viewModel4 = dKSelectFragment.getViewModel();
                                Object E = viewModel4.E(new do21(0), continuation);
                                if (E == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                            }
                            break;
                    }
                }
                break;
            default:
                ceq0 ceq0Var = (ceq0) obj;
                if (ceq0Var instanceof xdq0) {
                    raq0Var6 = dKSelectFragment.callbacks;
                    ((zbq0) (raq0Var6 != null ? raq0Var6 : null)).O(false);
                    break;
                } else if (ceq0Var instanceof aeq0) {
                    raq0Var5 = dKSelectFragment.callbacks;
                    raq0 raq0Var7 = raq0Var5 != null ? raq0Var5 : null;
                    aeq0 aeq0Var = (aeq0) ceq0Var;
                    int i3 = aeq0Var.a;
                    Integer num = new Integer(aeq0Var.b);
                    BaseActivity baseActivity3 = ((zbq0) raq0Var7).a;
                    if (baseActivity3 instanceof PaymentActivity) {
                        ((PaymentActivity) baseActivity3).showSnackBar(i3, num);
                        break;
                    } else if (baseActivity3 instanceof PreselectActivity) {
                        ((PreselectActivity) baseActivity3).showSnackBar(i3, num);
                        break;
                    }
                } else if (ceq0Var instanceof beq0) {
                    viewModel6 = dKSelectFragment.getViewModel();
                    viewModel6.v();
                    com.yandex.payment.sdk.core.utils.a aVar2 = com.yandex.payment.sdk.core.utils.a.a;
                    dKSelectFragment.requireActivity();
                    binding2 = dKSelectFragment.getBinding();
                    LinearLayout linearLayout2 = binding2.b;
                    eja1.s(dKSelectFragment);
                    com.yandex.payment.sdk.core.utils.a.c();
                    break;
                } else if (ceq0Var instanceof zdq0) {
                    raq0Var4 = dKSelectFragment.callbacks;
                    raq0 raq0Var8 = raq0Var4 != null ? raq0Var4 : null;
                    userTypedEmail = dKSelectFragment.getUserTypedEmail();
                    zdq0 zdq0Var = (zdq0) ceq0Var;
                    ((zbq0) raq0Var8).S(userTypedEmail, zdq0Var.a, zdq0Var.b);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
