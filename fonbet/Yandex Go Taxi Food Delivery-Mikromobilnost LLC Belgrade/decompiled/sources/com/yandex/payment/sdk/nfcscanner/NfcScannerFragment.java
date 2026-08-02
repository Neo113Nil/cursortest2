package com.yandex.payment.sdk.nfcscanner;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.yandex.payment.sdk.nfcscanner.tools.c;
import defpackage.cma1;
import defpackage.eja1;
import defpackage.es31;
import defpackage.ew50;
import defpackage.gds;
import defpackage.i3y;
import defpackage.n960;
import defpackage.n9h0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p960;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w8f;
import defpackage.wlh0;
import defpackage.x760;
import defpackage.y8f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010'\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/yandex/payment/sdk/nfcscanner/NfcScannerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lzy11;", "listenNfcState", "Lcom/yandex/payment/sdk/nfcscanner/tools/c;", "requestController", "()Lcom/yandex/payment/sdk/nfcscanner/tools/c;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lx760;", "callbacks", "setCallback", "(Lx760;)V", "Lp960;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lp960;", "viewModel", "Lgds;", "_binding", "Lgds;", "Lx760;", "getBinding", "()Lgds;", "binding", "Companion", "n960", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NfcScannerFragment extends Fragment {
    public static final n960 Companion = new n960();
    public static final String NFC_FRAGMENT_BUNDLE_KEY = "nfc_fragment_bundle_key";
    public static final String NFC_FRAGMENT_REQUEST_KEY = "nfc_fragment_request_key";
    private gds _binding;
    private x760 callbacks;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.payment.sdk.nfcscanner.NfcScannerFragment$special$$inlined$viewModels$default$1] */
    public NfcScannerFragment() {
        ew50 ew50Var = new ew50(24);
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.sdk.nfcscanner.NfcScannerFragment$special$$inlined$viewModels$default$1
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.sdk.nfcscanner.NfcScannerFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(p960.class), new sls() { // from class: com.yandex.payment.sdk.nfcscanner.NfcScannerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, ew50Var, new sls() { // from class: com.yandex.payment.sdk.nfcscanner.NfcScannerFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBinding, reason: from getter */
    public final gds get_binding() {
        return this._binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p960 getViewModel() {
        return (p960) this.viewModel.getValue();
    }

    private final void listenNfcState() {
        p s = eja1.s(getViewLifecycleOwner());
        sjh sjhVar = uyj.a;
        tje.N(s, o400.a, null, new NfcScannerFragment$listenNfcState$1(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c requestController() {
        p960 viewModel = getViewModel();
        x760 x760Var = this.callbacks;
        if (x760Var == null) {
            x760Var = null;
        }
        c cVar = viewModel.b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(x760Var);
        viewModel.b = cVar2;
        return cVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(requestController());
        c requestController = requestController();
        if (!requestController.x) {
            requestController.x = true;
            NfcAdapter nfcAdapter = requestController.y;
            if (nfcAdapter != null) {
                nfcAdapter.enableReaderMode(requestController.w, requestController.D, HProv.PP_FAST_CODE, new Bundle(0));
            }
        }
        tje.N(eja1.s(this), uyj.a, null, new NfcScannerFragment$onCreate$1(this, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(wlh0.fragment_nfc_scanner, container, false);
        int i = n9h0.nfc_bottom_text;
        if (((TextView) cma1.O(i, inflate)) != null) {
            i = n9h0.nfc_icon;
            if (((ImageView) cma1.O(i, inflate)) != null) {
                i = n9h0.nfc_top_txt;
                if (((TextView) cma1.O(i, inflate)) != null) {
                    this._binding = new gds((LinearLayout) inflate);
                    return get_binding().a;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listenNfcState();
    }

    public final void setCallback(x760 callbacks) {
        this.callbacks = callbacks;
    }
}
