package com.yandex.payment.sdk.ui.newbind;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.payment.sdk.core.camerascanner.CameraCardScannerProvider;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.datasource.bind.interfaces.CardButtonTitle;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.nfcscanner.NfcResult;
import com.yandex.payment.sdk.nfcscanner.NfcScannerFragment;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.Scenario;
import defpackage.apa1;
import defpackage.bqr0;
import defpackage.c98;
import defpackage.cg8;
import defpackage.ckt;
import defpackage.cof;
import defpackage.cp7;
import defpackage.cvy0;
import defpackage.d560;
import defpackage.d98;
import defpackage.dpb1;
import defpackage.e98;
import defpackage.es31;
import defpackage.f560;
import defpackage.f98;
import defpackage.g560;
import defpackage.gx90;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.i560;
import defpackage.in8;
import defpackage.iob1;
import defpackage.ix90;
import defpackage.j9h0;
import defpackage.jn8;
import defpackage.jx90;
import defpackage.kl41;
import defpackage.kn8;
import defpackage.l560;
import defpackage.ll41;
import defpackage.ln8;
import defpackage.lng0;
import defpackage.ml41;
import defpackage.mn8;
import defpackage.n891;
import defpackage.nb1;
import defpackage.njf0;
import defpackage.nl41;
import defpackage.nn8;
import defpackage.p7u;
import defpackage.pwf;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qu5;
import defpackage.qv90;
import defpackage.rk6;
import defpackage.rpa0;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.tls;
import defpackage.ud30;
import defpackage.vfc;
import defpackage.vu5;
import defpackage.vw90;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wy4;
import defpackage.x460;
import defpackage.xry0;
import defpackage.y22;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.yhl;
import defpackage.yry0;
import defpackage.zl50;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003 RSB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J+\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u0005R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010P¨\u0006T"}, d2 = {"Lcom/yandex/payment/sdk/ui/newbind/NewBindFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lrpa0;", "Lvu5;", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lcom/yandex/payment/sdk/nfcscanner/NfcResult;", "Lzy11;", "onGetNfcResult", "getNfcFragmentResultListener", "(Landroidx/fragment/app/Fragment;Ltls;)V", "Lnn8;", ClidProvider.STATE, "setScreenState", "(Lnn8;)V", "", "debrandingEnabled", "()Z", "Lf98;", "setButtonState", "(Lf98;)V", "Lnl41;", "setWebViewState", "(Lnl41;)V", "Lcom/yandex/payment/sdk/datasource/bind/interfaces/CardButtonTitle;", "title", "", "getTitleString", "(Lcom/yandex/payment/sdk/datasource/bind/interfaces/CardButtonTitle;)Ljava/lang/String;", "Ld560;", "callbacks", "setBindCallbacks$paymentsdk_release", "(Ld560;)V", "setBindCallbacks", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "Lcg8;", "cardInputBridge", "Lcg8;", "Lqu5;", "mediator$delegate", "Li3y;", "getMediator", "()Lqu5;", "mediator", "Lbqr0;", "activityViewModel$delegate", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "Ll560;", "viewModel$delegate", "getViewModel", "()Ll560;", "viewModel", "Lcp7;", "cameraCardScanner", "Lcp7;", "Ld560;", "Companion", "g560", "f560", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewBindFragment extends ViewBindingFragmentImpl<rpa0> implements vu5 {
    public static final f560 Companion = new f560();
    private d560 callbacks;
    private cp7 cameraCardScanner;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    private final cg8 cardInputBridge = new cg8(CardInputMode.BindOnly);

    /* renamed from: mediator$delegate, reason: from kotlin metadata */
    private final i3y mediator = a.a(new x460(this, 1));

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$activityViewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$activityViewModels$default$3
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$activityViewModels$default$2
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

    /* renamed from: eventReporter$delegate, reason: from kotlin metadata */
    private final i3y eventReporter = a.a(new x460(this, 2));

    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$viewModels$default$1] */
    public NewBindFragment() {
        x460 x460Var = new x460(this, 3);
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$viewModels$default$1
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
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(l560.class), new sls() { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, x460Var, new sls() { // from class: com.yandex.payment.sdk.ui.newbind.NewBindFragment$special$$inlined$viewModels$default$4
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

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rwo eventReporter_delegate$lambda$0(NewBindFragment newBindFragment) {
        return ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(newBindFragment)).componentDispatcher()).b(wy4.class))).c();
    }

    private final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    private final rwo getEventReporter() {
        return (rwo) this.eventReporter.getValue();
    }

    private final qu5 getMediator() {
        return (qu5) this.mediator.getValue();
    }

    private final void getNfcFragmentResultListener(Fragment fragment, tls onGetNfcResult) {
        fragment.getChildFragmentManager().m0(NfcScannerFragment.NFC_FRAGMENT_REQUEST_KEY, fragment, new nb1(10, onGetNfcResult));
    }

    private final String getTitleString(CardButtonTitle title) {
        int i;
        int i2 = i560.a[title.ordinal()];
        if (i2 == 1) {
            i = ryh0.paymentsdk_bind_card_next_button;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            i = ryh0.paymentsdk_bind_card_button;
        }
        return getString(i);
    }

    private final l560 getViewModel() {
        return (l560) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qu5 mediator_delegate$lambda$0(NewBindFragment newBindFragment) {
        return new qu5(newBindFragment.getEventReporter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(NewBindFragment newBindFragment) {
        rwo eventReporter = newBindFragment.getEventReporter();
        qv90.a.getClass();
        ((y22) eventReporter).a(sv90.D());
        rk6 rk6Var = newBindFragment.getViewModel().c.o;
        if (rk6Var != null) {
            rk6Var.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(NewBindFragment newBindFragment, nn8 nn8Var) {
        newBindFragment.setScreenState(nn8Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(NewBindFragment newBindFragment, f98 f98Var) {
        newBindFragment.setButtonState(f98Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(NewBindFragment newBindFragment, nl41 nl41Var) {
        newBindFragment.setWebViewState(nl41Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(CardInputView cardInputView, NewBindFragment newBindFragment, NfcResult nfcResult) {
        if (apa1.e(FeatureFlag.ENABLE_NFC_FLAG)) {
            cardInputView.post(new ud30(2, cardInputView, nfcResult.getCardNumber(), nfcResult.getDate()));
        }
        ((y22) newBindFragment.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Данные, полученные от NFC, установлены", "nfc_data_set_on_card"));
        return zy11.a;
    }

    private final void setButtonState(f98 state) {
        if (state instanceof e98) {
            d560 d560Var = this.callbacks;
            (d560Var != null ? d560Var : null).n(false);
            return;
        }
        if (state instanceof c98) {
            d560 d560Var2 = this.callbacks;
            if (d560Var2 == null) {
                d560Var2 = null;
            }
            vw90.D(d560Var2, getTitleString(((c98) state).a), null, 6);
            d560 d560Var3 = this.callbacks;
            if (d560Var3 == null) {
                d560Var3 = null;
            }
            d560Var3.n(true);
            d560 d560Var4 = this.callbacks;
            (d560Var4 != null ? d560Var4 : null).v(ix90.a);
            return;
        }
        if (!(state instanceof d98)) {
            w511.b();
            return;
        }
        d560 d560Var5 = this.callbacks;
        if (d560Var5 == null) {
            d560Var5 = null;
        }
        CardButtonTitle cardButtonTitle = ((d98) state).a;
        vw90.D(d560Var5, getTitleString(cardButtonTitle), null, 6);
        d560 d560Var6 = this.callbacks;
        if (d560Var6 == null) {
            d560Var6 = null;
        }
        d560Var6.n(true);
        d560 d560Var7 = this.callbacks;
        (d560Var7 != null ? d560Var7 : null).v(new jx90(gx90.b));
        if (cardButtonTitle == CardButtonTitle.ShowProcess) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            Scenario scenario = Scenario.CARD_BIND;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.u(scenario));
        }
    }

    private final void setScreenState(nn8 state) {
        n891.b(getBinding().a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        if (state instanceof jn8) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            PsdkScreen psdkScreen = PsdkScreen.BIND;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.w0(psdkScreen));
            getBinding().l.setVisibility(8);
            getBinding().e.setVisibility(0);
            getBinding().n.setVisibility(0);
            return;
        }
        if (state instanceof kn8) {
            getBinding().l.setVisibility(0);
            ProgressResultView progressResultView = getBinding().l;
            xry0 xry0Var = yry0.a;
            progressResultView.setState(new njf0(yry0.a.i, true));
            getBinding().e.setVisibility(8);
            getBinding().n.setVisibility(8);
            return;
        }
        if (state instanceof ln8) {
            d560 d560Var = this.callbacks;
            (d560Var != null ? d560Var : null).c(((ln8) state).a);
        } else if (state instanceof in8) {
            d560 d560Var2 = this.callbacks;
            (d560Var2 != null ? d560Var2 : null).e(((in8) state).a);
        } else if (state instanceof mn8) {
            yhl.d(state, "Illegal model state ");
        } else {
            w511.b();
        }
    }

    private final void setWebViewState(nl41 state) {
        if (state instanceof ll41) {
            d560 d560Var = this.callbacks;
            (d560Var != null ? d560Var : null).d(((ll41) state).a.toString(), EmptyList.a);
        } else if (state instanceof ml41) {
            d560 d560Var2 = this.callbacks;
            ml41 ml41Var = (ml41) state;
            (d560Var2 != null ? d560Var2 : null).d(ml41Var.a.toString(), ml41Var.b);
        } else if (!(state instanceof kl41)) {
            w511.b();
        } else {
            d560 d560Var3 = this.callbacks;
            (d560Var3 != null ? d560Var3 : null).f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$0(NewBindFragment newBindFragment) {
        return new g560(((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(newBindFragment)).componentDispatcher()).b(wy4.class))).f(), ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(newBindFragment)).componentDispatcher()).b(wy4.class))).g(), newBindFragment.getMediator(), newBindFragment.cardInputBridge, newBindFragment, newBindFragment.getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CameraCardScannerProvider cameraCardScannerProvider = (CameraCardScannerProvider) requireArguments().getParcelable("CAMERA_CARD_SCANNER_PROVIDER");
        this.cameraCardScanner = cameraCardScannerProvider != null ? CameraCardScannerProvider.provide$default(cameraCardScannerProvider, this, null, 2, null) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rpa0 o = rpa0.o(inflater, container);
        setCurrentBinding(o);
        return o.a;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingFragmentImpl, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.cardInputBridge.a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        Scenario scenario = Scenario.CARD_BIND;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.x(scenario));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getBinding().e.setTitleText(null);
        final int i = 1;
        final int i2 = 0;
        getBinding().e.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        getBinding().h.setText(ryh0.paymentsdk_bind_card_title);
        int i3 = 8;
        getBinding().i.setVisibility(8);
        getBinding().j.setVisibility(8);
        getBinding().k.setVisibility(8);
        getBinding().h.setVisibility(0);
        getBinding().g.setVisibility(8);
        getBinding().m.setVisibility(8);
        d560 d560Var = this.callbacks;
        if (d560Var == null) {
            d560Var = null;
        }
        vw90.D(d560Var, getString(ryh0.paymentsdk_bind_card_next_button), null, 6);
        d560 d560Var2 = this.callbacks;
        if (d560Var2 == null) {
            d560Var2 = null;
        }
        d560Var2.B(new x460(this, i2));
        cvy0 cvy0Var = ckt.a;
        int a = ckt.a(requireContext());
        Context requireContext = requireContext();
        CardInputMode cardInputMode = CardInputMode.BindOnly;
        CardValidationConfig cardValidationConfig = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).a().getCardValidationConfig();
        cp7 cp7Var = this.cameraCardScanner;
        rwo eventReporter = getEventReporter();
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        boolean o = n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
        CardInputViewImpl cardInputViewImpl = new CardInputViewImpl(new ContextThemeWrapper(requireContext, a), null, 0, 6, null);
        cardInputViewImpl.setup(cardInputMode, cardValidationConfig, cp7Var, eventReporter, o);
        cardInputViewImpl.setPaymentApi(((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).f());
        this.cardInputBridge.a(cardInputViewImpl);
        getBinding().b.addView(cardInputViewImpl);
        if (savedInstanceState == null) {
            cardInputViewImpl.focusInput();
        }
        getBinding().e.setCloseButton(true, new NewBindFragment$onViewCreated$2(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().l.setExitButtonCallback(new NewBindFragment$onViewCreated$3(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().l.setBrandIconVisible(!debrandingEnabled());
        boolean isEmpty = ((AccessibilityManager) requireContext().getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).isEmpty();
        FrameLayout frameLayout = getBinding().f;
        FeatureFlag featureFlag = FeatureFlag.ENABLE_NFC_FLAG;
        if (apa1.e(featureFlag) && isEmpty) {
            i3 = 0;
        }
        frameLayout.setVisibility(i3);
        if (apa1.e(featureFlag) && isEmpty) {
            NfcScannerFragment nfcScannerFragment = new NfcScannerFragment();
            d560 d560Var3 = this.callbacks;
            nfcScannerFragment.setCallback(d560Var3 != null ? d560Var3 : null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            aVar.h(getBinding().f.getId(), nfcScannerFragment, "nfc_fragment");
            aVar.d();
        }
        l560 viewModel = getViewModel();
        int i4 = 5;
        (viewModel.z ? viewModel.w : viewModel.c.l).f(getViewLifecycleOwner(), new cof(i4, new tls(this) { // from class: z460
            public final /* synthetic */ NewBindFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                int i5 = i2;
                NewBindFragment newBindFragment = this.b;
                switch (i5) {
                    case 0:
                        onViewCreated$lambda$1 = NewBindFragment.onViewCreated$lambda$1(newBindFragment, (nn8) obj);
                        return onViewCreated$lambda$1;
                    case 1:
                        onViewCreated$lambda$2 = NewBindFragment.onViewCreated$lambda$2(newBindFragment, (f98) obj);
                        return onViewCreated$lambda$2;
                    default:
                        onViewCreated$lambda$3 = NewBindFragment.onViewCreated$lambda$3(newBindFragment, (nl41) obj);
                        return onViewCreated$lambda$3;
                }
            }
        }));
        l560 viewModel2 = getViewModel();
        (viewModel2.z ? viewModel2.x : viewModel2.c.m).f(getViewLifecycleOwner(), new cof(i4, new tls(this) { // from class: z460
            public final /* synthetic */ NewBindFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                int i5 = i;
                NewBindFragment newBindFragment = this.b;
                switch (i5) {
                    case 0:
                        onViewCreated$lambda$1 = NewBindFragment.onViewCreated$lambda$1(newBindFragment, (nn8) obj);
                        return onViewCreated$lambda$1;
                    case 1:
                        onViewCreated$lambda$2 = NewBindFragment.onViewCreated$lambda$2(newBindFragment, (f98) obj);
                        return onViewCreated$lambda$2;
                    default:
                        onViewCreated$lambda$3 = NewBindFragment.onViewCreated$lambda$3(newBindFragment, (nl41) obj);
                        return onViewCreated$lambda$3;
                }
            }
        }));
        l560 viewModel3 = getViewModel();
        final int i5 = 2;
        (viewModel3.z ? viewModel3.y : viewModel3.c.n).f(getViewLifecycleOwner(), new cof(i4, new tls(this) { // from class: z460
            public final /* synthetic */ NewBindFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                int i52 = i5;
                NewBindFragment newBindFragment = this.b;
                switch (i52) {
                    case 0:
                        onViewCreated$lambda$1 = NewBindFragment.onViewCreated$lambda$1(newBindFragment, (nn8) obj);
                        return onViewCreated$lambda$1;
                    case 1:
                        onViewCreated$lambda$2 = NewBindFragment.onViewCreated$lambda$2(newBindFragment, (f98) obj);
                        return onViewCreated$lambda$2;
                    default:
                        onViewCreated$lambda$3 = NewBindFragment.onViewCreated$lambda$3(newBindFragment, (nl41) obj);
                        return onViewCreated$lambda$3;
                }
            }
        }));
        getNfcFragmentResultListener(this, new zl50(4, cardInputViewImpl, this));
    }

    public final void setBindCallbacks$paymentsdk_release(d560 callbacks) {
        this.callbacks = callbacks;
    }
}
