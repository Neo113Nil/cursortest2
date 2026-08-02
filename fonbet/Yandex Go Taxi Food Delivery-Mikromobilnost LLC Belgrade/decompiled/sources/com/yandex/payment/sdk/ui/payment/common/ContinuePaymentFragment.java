package com.yandex.payment.sdk.ui.payment.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import defpackage.bga0;
import defpackage.cle;
import defpackage.cma1;
import defpackage.dle;
import defpackage.ele;
import defpackage.fle;
import defpackage.gle;
import defpackage.hle;
import defpackage.iob1;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.jle;
import defpackage.ls31;
import defpackage.n891;
import defpackage.njf0;
import defpackage.ny61;
import defpackage.ong0;
import defpackage.ppa0;
import defpackage.px90;
import defpackage.rlh0;
import defpackage.ss8;
import defpackage.vqb;
import defpackage.w511;
import defpackage.wke;
import defpackage.xry0;
import defpackage.yry0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/common/ContinuePaymentFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lppa0;", "<init>", "()V", "", "debrandingEnabled", "()Z", "Lhle;", ClidProvider.STATE, "Lzy11;", "setScreenState", "(Lhle;)V", "Lcle;", "callbacks", "setContinuePaymentCallbacks", "(Lcle;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljle;", "viewModel", "Ljle;", "Lcle;", "showFooterOnSelectOnly", "Z", "ss8", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContinuePaymentFragment extends ViewBindingFragmentImpl<ppa0> {
    private cle callbacks;
    private boolean showFooterOnSelectOnly;
    private jle viewModel;

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(ContinuePaymentFragment continuePaymentFragment, hle hleVar) {
        continuePaymentFragment.setScreenState(hleVar);
        return zy11.a;
    }

    private final void setScreenState(hle state) {
        cle cleVar = this.callbacks;
        if (cleVar == null) {
            return;
        }
        if (jl40.l(state, fle.a)) {
            getBinding().b.setVisibility(0);
            ProgressResultView progressResultView = getBinding().b;
            xry0 xry0Var = yry0.a;
            progressResultView.setState(new njf0(yry0.a.d, false));
            if (this.showFooterOnSelectOnly) {
                ((wke) cleVar).a.p(false);
                return;
            }
            return;
        }
        if (state instanceof ele) {
            if (this.showFooterOnSelectOnly) {
                ((wke) cleVar).a.p(false);
            }
            wke wkeVar = (wke) cleVar;
            wkeVar.a.f();
            wkeVar.a.q(((ele) state).a);
            return;
        }
        if (!(state instanceof gle)) {
            w511.b();
            return;
        }
        if (this.showFooterOnSelectOnly) {
            ((wke) cleVar).a.p(false);
        }
        wke wkeVar2 = (wke) cleVar;
        wkeVar2.a.f();
        wkeVar2.a.r(((gle) state).a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cle cleVar = this.callbacks;
        if (cleVar == null) {
            return;
        }
        Pair pair = ((wke) cleVar).b;
        this.viewModel = (jle) new ls31(this, new ss8(1, (px90) pair.c(), (bga0) pair.f(), cleVar)).b(jle.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(rlh0.paymentsdk_fragment_continue, container, false);
        int i = j9h0.progress_result_view;
        ProgressResultView progressResultView = (ProgressResultView) cma1.O(i, inflate);
        if (progressResultView == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        setCurrentBinding(new ppa0(frameLayout, progressResultView));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        cle cleVar = this.callbacks;
        if (cleVar == null) {
            return;
        }
        int i = 0;
        this.showFooterOnSelectOnly = iob1.d(requireActivity().getTheme(), ong0.paymentsdk_showFooterOnSelectOnly, false);
        jle jleVar = this.viewModel;
        if (jleVar == null) {
            jleVar = null;
        }
        jleVar.c.f(getViewLifecycleOwner(), new dle(i, new vqb(26, this)));
        getBinding().b.setExitButtonCallback(new ContinuePaymentFragment$onViewCreated$2(0, cleVar, cle.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().b.setBrandIconVisible(!debrandingEnabled());
        ((wke) cleVar).a.n(false);
    }

    public final void setContinuePaymentCallbacks(cle callbacks) {
        this.callbacks = callbacks;
    }
}
