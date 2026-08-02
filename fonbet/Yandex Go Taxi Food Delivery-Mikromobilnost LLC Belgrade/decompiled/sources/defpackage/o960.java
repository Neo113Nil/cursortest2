package defpackage;

import com.yandex.payment.sdk.nfcscanner.NfcResult;
import com.yandex.payment.sdk.nfcscanner.NfcScannerFragment;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o960 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ NfcScannerFragment b;

    public /* synthetic */ o960(NfcScannerFragment nfcScannerFragment, int i) {
        this.a = i;
        this.b = nfcScannerFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        gds gdsVar;
        p960 viewModel;
        gds gdsVar2;
        p960 viewModel2;
        gds gdsVar3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        NfcScannerFragment nfcScannerFragment = this.b;
        switch (i) {
            case 0:
                m960 m960Var = (m960) obj;
                if (!jl40.l(m960Var, m960.a)) {
                    if (!jl40.l(m960Var, m960.b)) {
                        if (jl40.l(m960Var, m960.c)) {
                            gdsVar = nfcScannerFragment.get_binding();
                            gdsVar.a.setVisibility(8);
                            break;
                        }
                    } else {
                        viewModel = nfcScannerFragment.getViewModel();
                        if (viewModel.c == null) {
                            viewModel.c = Boolean.TRUE;
                        }
                        gdsVar2 = nfcScannerFragment.get_binding();
                        gdsVar2.a.setVisibility(0);
                        break;
                    }
                } else {
                    viewModel2 = nfcScannerFragment.getViewModel();
                    if (viewModel2.c == null) {
                        viewModel2.c = Boolean.FALSE;
                    }
                    gdsVar3 = nfcScannerFragment.get_binding();
                    gdsVar3.a.setVisibility(8);
                    break;
                }
                break;
            default:
                hua1.f(wwg.g(new Pair(NfcScannerFragment.NFC_FRAGMENT_BUNDLE_KEY, (NfcResult) obj)), nfcScannerFragment, NfcScannerFragment.NFC_FRAGMENT_REQUEST_KEY);
                break;
        }
        return zy11Var;
    }
}
