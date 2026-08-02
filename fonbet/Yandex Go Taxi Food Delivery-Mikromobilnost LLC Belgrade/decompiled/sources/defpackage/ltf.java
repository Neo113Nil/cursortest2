package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.divkit.preselect.f;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.preselect.a;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class ltf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKPreselectFragment b;

    public /* synthetic */ ltf(DKPreselectFragment dKPreselectFragment, int i) {
        this.a = i;
        this.b = dKPreselectFragment;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r5 = r5.getViewModel();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        f viewModel;
        itf itfVar;
        f viewModel2;
        mpa0 binding;
        String queryParameter;
        itf itfVar2;
        f viewModel3;
        kcq0 kcq0Var;
        PaymentMethod paymentMethod;
        String queryParameter2;
        f viewModel4;
        PaymentMethod paymentMethod2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DKPreselectFragment dKPreselectFragment = this.b;
        switch (i) {
            case 0:
                dKPreselectFragment.updateState((gwe0) obj);
                break;
            case 1:
                smk smkVar = (smk) obj;
                List<Pair> list = smkVar.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (Pair pair : list) {
                    if (jl40.l(pair.c(), "select_method_screen_selected_method")) {
                        pair = new Pair(pair.c(), String.valueOf(dKPreselectFragment.getMediator().c()));
                    }
                    arrayList.add(pair);
                }
                dKPreselectFragment.observeDivData(smk.a(smkVar, arrayList));
                break;
            default:
                Uri uri = (Uri) obj;
                String uri2 = uri.toString();
                Integer l = bvu0.l(10, evu0.d0(uri2, "select_method_screen_selected_method&value=", uri2));
                if (l != null) {
                    int intValue = l.intValue();
                    viewModel4 = dKPreselectFragment.getViewModel();
                    kcq0 kcq0Var2 = viewModel4.A;
                    if (kcq0Var2 != null) {
                        kcq0Var2.onSelectPaymentMethod(intValue);
                    }
                    kcq0 kcq0Var3 = viewModel4.A;
                    if (kcq0Var3 != null && (paymentMethod2 = kcq0Var3.z) != null) {
                        ((y22) viewModel4.c).a(f.X(paymentMethod2, true));
                    }
                }
                String host = uri.getHost();
                if (host != null) {
                    switch (host.hashCode()) {
                        case 3015911:
                            if (host.equals("back")) {
                                dKPreselectFragment.requireActivity().onBackPressed();
                                break;
                            }
                            break;
                        case 47329499:
                            if (host.equals("bind_card_click")) {
                                viewModel = dKPreselectFragment.getViewModel();
                                rwo rwoVar = viewModel.c;
                                sv90 sv90Var = qv90.a;
                                PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.NEW_CARD;
                                sv90Var.getClass();
                                ((y22) rwoVar).a(sv90.t0(paymentOptionNameForAnalytics, true));
                                itfVar = dKPreselectFragment.callbacks;
                                ((a) (itfVar != null ? itfVar : null)).p(true);
                                break;
                            }
                            break;
                        case 1115503494:
                            if (host.equals("click_on_promo")) {
                                viewModel2 = dKPreselectFragment.getViewModel();
                                rwo rwoVar2 = viewModel2.c;
                                qv90.a.getClass();
                                ((y22) rwoVar2).a(sv90.O());
                                com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                                dKPreselectFragment.requireActivity();
                                binding = dKPreselectFragment.getBinding();
                                LinearLayout linearLayout = binding.b;
                                eja1.s(dKPreselectFragment);
                                com.yandex.payment.sdk.core.utils.a.c();
                                break;
                            }
                            break;
                        case 1126556261:
                            if (host.equals("show_toast") && (queryParameter = uri.getQueryParameter(Constants.KEY_MESSAGE)) != null) {
                                itfVar2 = dKPreselectFragment.callbacks;
                                if (itfVar2 == null) {
                                    itfVar2 = null;
                                }
                                ((a) itfVar2).a.showSnackBar(queryParameter, (String) null);
                                break;
                            }
                            break;
                        case 1284156530:
                            if (host.equals("pay_button_click") && (kcq0Var = viewModel3.A) != null && (paymentMethod = kcq0Var.z) != null) {
                                r0 r0Var = viewModel3.D;
                                fwe0 fwe0Var = new fwe0(paymentMethod);
                                r0Var.getClass();
                                r0Var.m(null, fwe0Var);
                                break;
                            }
                            break;
                        case 1546100943:
                            if (host.equals("open_link") && (queryParameter2 = uri.getQueryParameter("url")) != null) {
                                dKPreselectFragment.openUrl(queryParameter2);
                                break;
                            }
                            break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
