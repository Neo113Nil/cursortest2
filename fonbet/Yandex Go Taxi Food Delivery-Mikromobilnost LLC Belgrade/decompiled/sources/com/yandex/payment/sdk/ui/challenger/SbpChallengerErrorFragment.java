package com.yandex.payment.sdk.ui.challenger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import defpackage.agm0;
import defpackage.cgm0;
import defpackage.cma1;
import defpackage.dle;
import defpackage.eaj0;
import defpackage.egm0;
import defpackage.es31;
import defpackage.g8m0;
import defpackage.i3y;
import defpackage.j9h0;
import defpackage.lfm0;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.rlh0;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.upa0;
import defpackage.y8f;
import defpackage.yfm0;
import defpackage.zfm0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/sdk/ui/challenger/SbpChallengerErrorFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lupa0;", "<init>", "()V", "binding", "Lzy11;", "initBinding", "(Lupa0;)V", "", CRLReasonCodeExtension.REASON, "setErrorDescription", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Legm0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Legm0;", "activityViewModel", "Companion", "lfm0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SbpChallengerErrorFragment extends ViewBindingFragmentImpl<upa0> {
    public static final int CANT_WITHDRAW = 11;
    public static final lfm0 Companion = new lfm0();
    public static final int NO_ATTEMPTS = 10;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(egm0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerErrorFragment$special$$inlined$activityViewModels$default$1
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerErrorFragment$special$$inlined$activityViewModels$default$3
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerErrorFragment$special$$inlined$activityViewModels$default$2
        final /* synthetic */ sls $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            y8f y8fVar;
            sls slsVar = this.$extrasProducer;
            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : y8fVar;
        }
    });

    private final egm0 getActivityViewModel() {
        return (egm0) this.activityViewModel.getValue();
    }

    private final void initBinding(upa0 binding) {
        binding.b.setOnClickListener(new eaj0(6, this));
        getActivityViewModel().y.f(getViewLifecycleOwner(), new dle(4, new g8m0(10, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBinding$lambda$0(SbpChallengerErrorFragment sbpChallengerErrorFragment, View view) {
        sbpChallengerErrorFragment.getActivityViewModel().y.m(yfm0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initBinding$lambda$1(SbpChallengerErrorFragment sbpChallengerErrorFragment, cgm0 cgm0Var) {
        if (cgm0Var instanceof agm0) {
            sbpChallengerErrorFragment.setErrorDescription(10);
        } else if (cgm0Var instanceof zfm0) {
            sbpChallengerErrorFragment.setErrorDescription(11);
        }
        return zy11.a;
    }

    private final void setErrorDescription(int reason) {
        if (reason == 10) {
            getBinding().c.setText(ryh0.paymentsdk_challenger_no_attempts_error_desc);
        } else {
            if (reason != 11) {
                return;
            }
            getBinding().c.setText(ryh0.paymentsdk_challenger_withdraw_error_desc);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(rlh0.paymentsdk_fragment_sbp_challenger_no_attemts, container, false);
        int i = j9h0.errorCloseButton;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = j9h0.errorDescription;
            TextView textView2 = (TextView) cma1.O(i, inflate);
            if (textView2 != null) {
                i = j9h0.errorImage;
                if (((ImageView) cma1.O(i, inflate)) != null) {
                    i = j9h0.errorTitle;
                    if (((TextView) cma1.O(i, inflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        upa0 upa0Var = new upa0(constraintLayout, textView, textView2);
                        setCurrentBinding(upa0Var);
                        initBinding(upa0Var);
                        return constraintLayout;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
