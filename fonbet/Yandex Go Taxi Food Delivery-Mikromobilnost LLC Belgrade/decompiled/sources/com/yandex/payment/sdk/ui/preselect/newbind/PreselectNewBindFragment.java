package com.yandex.payment.sdk.ui.preselect.newbind;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.model.data.PreselectButtonState;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.bqr0;
import defpackage.bve0;
import defpackage.ckt;
import defpackage.cof;
import defpackage.cve0;
import defpackage.cvy0;
import defpackage.d5b0;
import defpackage.dpb1;
import defpackage.dve0;
import defpackage.es31;
import defpackage.eve0;
import defpackage.fi11;
import defpackage.fve0;
import defpackage.gve0;
import defpackage.hve0;
import defpackage.hvg0;
import defpackage.i3y;
import defpackage.ihq0;
import defpackage.iob1;
import defpackage.iu11;
import defpackage.ive0;
import defpackage.ix90;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.jve0;
import defpackage.jx90;
import defpackage.kve0;
import defpackage.lng0;
import defpackage.ls31;
import defpackage.lve0;
import defpackage.mjf0;
import defpackage.mta1;
import defpackage.mve0;
import defpackage.n891;
import defpackage.njf0;
import defpackage.nve0;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.ojf0;
import defpackage.ove0;
import defpackage.p7u;
import defpackage.pg8;
import defpackage.pjf0;
import defpackage.pve0;
import defpackage.pwf;
import defpackage.px90;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.qve0;
import defpackage.rpa0;
import defpackage.rve0;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.sve0;
import defpackage.tve0;
import defpackage.uve0;
import defpackage.vfc;
import defpackage.vpb;
import defpackage.vu5;
import defpackage.vv90;
import defpackage.vve0;
import defpackage.w511;
import defpackage.wve0;
import defpackage.wy4;
import defpackage.xry0;
import defpackage.y22;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.ybq0;
import defpackage.yry0;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0006_`aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0005J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010)J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0005J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0013\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0013\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020,H\u0002¢\u0006\u0004\b6\u0010.J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0013\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J%\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\u0005J\u001f\u0010E\u001a\u0004\u0018\u00010:*\u0004\u0018\u00010B2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bX\u0010YR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010[R\u0016\u0010\\\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006b"}, d2 = {"Lcom/yandex/payment/sdk/ui/preselect/newbind/PreselectNewBindFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lrpa0;", "Lvu5;", "<init>", "()V", "Ldve0;", "callbacks", "Lzy11;", "setBindCallbacks$paymentsdk_release", "(Ldve0;)V", "setBindCallbacks", "Lcom/yandex/payment/sdk/core/data/PaymentToken;", "paymentToken", "Lybq0;", "continuePaying$paymentsdk_release", "(Lcom/yandex/payment/sdk/core/data/PaymentToken;Lybq0;)V", "continuePaying", "Lcom/yandex/payment/sdk/model/data/PreselectButtonState;", ClidProvider.STATE, "setExternalButtonState$paymentsdk_release", "(Lcom/yandex/payment/sdk/model/data/PreselectButtonState;)V", "setExternalButtonState", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", ConfigConstants.CONFIG, "applyOrientation", "", "debrandingEnabled", "()Z", "observeChanges", "Lqve0;", "setScreenState", "(Lqve0;)V", "Lpjf0;", "showFinalScreen", "(Lpjf0;)V", "showSelectFragment", "Lkve0;", "setButtonState", "(Lkve0;)V", "", "url", "", "Lfi11;", "trustedUrls", "showWebView", "(Ljava/lang/String;Ljava/util/List;)V", "hideWebView", "", "Landroid/content/Context;", "context", "formatSum", "(Ljava/lang/Double;Landroid/content/Context;)Ljava/lang/String;", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lwve0;", "viewModel", "Lwve0;", "Lcom/yandex/payment/sdk/ui/preselect/newbind/PreselectNewBindFragment$a;", "bindCardInputController", "Lcom/yandex/payment/sdk/ui/preselect/newbind/PreselectNewBindFragment$a;", "isBackButtonEnabled", "Z", "startPaymentAfterSelect", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "Ldve0;", "selectCallbacks", "Lybq0;", "Companion", "a", "fve0", "eve0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreselectNewBindFragment extends ViewBindingFragmentImpl<rpa0> implements vu5 {
    private static final String ARG_IS_BACK_BUTTON_ENABLED = "ARG_IS_BACK_BUTTON_ENABLED";
    public static final eve0 Companion = new eve0();
    private static final String START_PAYMENT_AFTER_SELECT = "START_PAYMENT_AFTER_SELECT";
    private dve0 callbacks;
    private boolean isBackButtonEnabled;
    private ybq0 selectCallbacks;
    private boolean startPaymentAfterSelect;
    private wve0 viewModel;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment$special$$inlined$activityViewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment$special$$inlined$activityViewModels$default$3
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment$special$$inlined$activityViewModels$default$2
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
    private final a bindCardInputController = new a();

    /* renamed from: eventReporter$delegate, reason: from kotlin metadata */
    private final i3y eventReporter = kotlin.a.a(new bve0(this, 1));

    public static final class a implements gve0 {
        public CardInputViewImpl a;
    }

    private final void applyOrientation(Configuration config) {
        int i = config.orientation;
        if (i == 1) {
            e eVar = new e();
            eVar.g(getBinding().d);
            eVar.e(j9h0.save_checkbox, 6);
            eVar.e(j9h0.save_checkbox, 3);
            eVar.j(j9h0.save_checkbox, 6, 0, 6, 0);
            eVar.j(j9h0.save_checkbox, 3, j9h0.card_input_container, 4, 0);
            eVar.b(getBinding().d);
            CheckBox checkBox = getBinding().m;
            ViewGroup.LayoutParams layoutParams = checkBox.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = checkBox.getResources().getDimensionPixelSize(hvg0.paymentsdk_save_checkbox_margin_top);
            checkBox.setLayoutParams(layoutParams2);
            TextView textView = getBinding().c;
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = textView.getResources().getDimensionPixelSize(hvg0.paymentsdk_charity_label_margin_top);
            textView.setLayoutParams(layoutParams4);
            return;
        }
        if (i == 2) {
            e eVar2 = new e();
            eVar2.g(getBinding().d);
            eVar2.e(j9h0.save_checkbox, 6);
            eVar2.e(j9h0.save_checkbox, 3);
            eVar2.j(j9h0.save_checkbox, 6, j9h0.card_input_container, 7, 0);
            eVar2.j(j9h0.save_checkbox, 3, j9h0.paymethod_title, 4, 0);
            eVar2.b(getBinding().d);
            CheckBox checkBox2 = getBinding().m;
            ViewGroup.LayoutParams layoutParams5 = checkBox2.getLayoutParams();
            if (layoutParams5 == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = checkBox2.getResources().getDimensionPixelSize(hvg0.paymentsdk_save_checkbox_margin_top);
            checkBox2.setLayoutParams(layoutParams6);
            TextView textView2 = getBinding().c;
            ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
            if (layoutParams7 == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = textView2.getResources().getDimensionPixelSize(hvg0.paymentsdk_charity_label_margin_top);
            textView2.setLayoutParams(layoutParams8);
        }
    }

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rwo eventReporter_delegate$lambda$0(PreselectNewBindFragment preselectNewBindFragment) {
        return ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(preselectNewBindFragment)).componentDispatcher()).b(wy4.class))).c();
    }

    private final String formatSum(Double d, Context context) {
        if (d != null) {
            return mta1.c(context, d.doubleValue(), "RUB", getEventReporter());
        }
        return null;
    }

    private final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    private final rwo getEventReporter() {
        return (rwo) this.eventReporter.getValue();
    }

    private final void hideWebView() {
        dve0 dve0Var = this.callbacks;
        if (dve0Var == null) {
            dve0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var).f();
    }

    private final void observeChanges() {
        wve0 wve0Var = this.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        int i = 7;
        wve0Var.B.f(getViewLifecycleOwner(), new cof(i, new cve0(this, 3)));
        wve0 wve0Var2 = this.viewModel;
        if (wve0Var2 == null) {
            wve0Var2 = null;
        }
        wve0Var2.C.f(getViewLifecycleOwner(), new cof(i, new cve0(this, 4)));
        wve0 wve0Var3 = this.viewModel;
        (wve0Var3 != null ? wve0Var3 : null).D.f(getViewLifecycleOwner(), new cof(i, new cve0(this, 5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$0(PreselectNewBindFragment preselectNewBindFragment, qve0 qve0Var) {
        preselectNewBindFragment.setScreenState(qve0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$1(PreselectNewBindFragment preselectNewBindFragment, kve0 kve0Var) {
        preselectNewBindFragment.setButtonState(kve0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$2(PreselectNewBindFragment preselectNewBindFragment, tve0 tve0Var) {
        if (tve0Var instanceof sve0) {
            sve0 sve0Var = (sve0) tve0Var;
            preselectNewBindFragment.showWebView(sve0Var.a, sve0Var.b);
        } else {
            if (!(tve0Var instanceof rve0)) {
                w511.b();
                return null;
            }
            preselectNewBindFragment.hideWebView();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$1$0(PreselectNewBindFragment preselectNewBindFragment, CardInput$State cardInput$State) {
        wve0 wve0Var = preselectNewBindFragment.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        wve0Var.H = cardInput$State;
        if (cardInput$State == CardInput$State.CARD_DETAILS_VALID && wve0Var.x) {
            o3a0 o3a0Var = o3a0.e;
            if (o3a0Var.a.e()) {
                String str = wve0Var.F;
                if (str == null) {
                    ny61.r("Valid card state without card number");
                    return null;
                }
                PaymentMethod.Card card = new PaymentMethod.Card(new CardId("NEW_CARD"), wve0Var.G, str, BankName.UnknownBank, null);
                if (jl40.l(wve0Var.E, card)) {
                    wve0Var.W();
                } else {
                    wve0Var.E = card;
                    o3a0Var.a(card);
                }
                return zy11.a;
            }
        }
        wve0Var.W();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$1$1(PreselectNewBindFragment preselectNewBindFragment, String str) {
        wve0 wve0Var = preselectNewBindFragment.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        wve0Var.F = str;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$1$2(PreselectNewBindFragment preselectNewBindFragment, CardPaymentSystem cardPaymentSystem) {
        wve0 wve0Var = preselectNewBindFragment.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        wve0Var.G = cardPaymentSystem;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(PreselectNewBindFragment preselectNewBindFragment, View view) {
        ((y22) preselectNewBindFragment.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Нажатие на кнопку назад на экране ввода новой карты", "clicked_back_button_new_card"));
        preselectNewBindFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(PreselectNewBindFragment preselectNewBindFragment, CompoundButton compoundButton, boolean z) {
        CardInputViewImpl cardInputViewImpl = preselectNewBindFragment.bindCardInputController.a;
        if (cardInputViewImpl != null) {
            cardInputViewImpl.setSaveCardOnPayment(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(PreselectNewBindFragment preselectNewBindFragment) {
        rwo eventReporter = preselectNewBindFragment.getEventReporter();
        qv90.a.getClass();
        ((y22) eventReporter).a(sv90.D());
        wve0 wve0Var = preselectNewBindFragment.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        int i = uve0.a[wve0Var.H.ordinal()];
        if (i == 2) {
            CardInputViewImpl cardInputViewImpl = ((a) wve0Var.w).a;
            if (cardInputViewImpl != null) {
                cardInputViewImpl.proceedToCardDetails();
            }
        } else {
            if (i != 4) {
                ny61.r("Illegal card input state");
                return null;
            }
            wve0Var.B.l(ove0.a);
            wve0Var.C.l(jve0.a);
            if (wve0Var.x) {
                PaymentMethod.Card card = wve0Var.E;
                if (card == null) {
                    ny61.r("Valid state without correct payment option");
                    return null;
                }
                ((PreselectNewBindFragment$onCreate$1) wve0Var.z).invoke(new ihq0(card, null));
            } else {
                ((yv90) wve0Var.b).j.a(new nw70(29, wve0Var));
            }
        }
        return zy11.a;
    }

    private final void setButtonState(kve0 state) {
        int i = 0;
        if (state instanceof jve0) {
            dve0 dve0Var = this.callbacks;
            ((com.yandex.payment.sdk.ui.preselect.a) (dve0Var != null ? dve0Var : null)).n(false);
            return;
        }
        if (state instanceof hve0) {
            dve0 dve0Var2 = this.callbacks;
            if (dve0Var2 == null) {
                dve0Var2 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) dve0Var2).n(true);
            dve0 dve0Var3 = this.callbacks;
            if (dve0Var3 == null) {
                dve0Var3 = null;
            }
            ((com.yandex.payment.sdk.ui.preselect.a) dve0Var3).v(ix90.a);
            dve0 dve0Var4 = this.callbacks;
            hve0 hve0Var = (hve0) state;
            ((com.yandex.payment.sdk.ui.preselect.a) (dve0Var4 != null ? dve0Var4 : null)).u(getString(hve0Var.a), formatSum(hve0Var.b, requireContext()), formatSum(hve0Var.c, requireContext()));
            return;
        }
        if (!(state instanceof ive0)) {
            w511.b();
            return;
        }
        dve0 dve0Var5 = this.callbacks;
        if (dve0Var5 == null) {
            dve0Var5 = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var5).n(true);
        dve0 dve0Var6 = this.callbacks;
        if (dve0Var6 == null) {
            dve0Var6 = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var6).v(new jx90(i));
        dve0 dve0Var7 = this.callbacks;
        ive0 ive0Var = (ive0) state;
        ((com.yandex.payment.sdk.ui.preselect.a) (dve0Var7 != null ? dve0Var7 : null)).u(getString(ive0Var.a), formatSum(ive0Var.b, requireContext()), formatSum(ive0Var.c, requireContext()));
    }

    private final void setScreenState(qve0 state) {
        n891.b(getBinding().a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        if (state instanceof nve0) {
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
        if (state instanceof ove0) {
            getBinding().l.setVisibility(0);
            ProgressResultView progressResultView = getBinding().l;
            xry0 xry0Var = yry0.a;
            progressResultView.setState(new njf0(yry0.a.i, true));
            getBinding().e.setVisibility(8);
            getBinding().n.setVisibility(8);
            return;
        }
        if (state instanceof pve0) {
            if (!((pve0) state).a) {
                xry0 xry0Var2 = yry0.a;
                showFinalScreen(new ojf0(yry0.a.f));
                return;
            } else {
                ybq0 ybq0Var = this.selectCallbacks;
                ybq0 ybq0Var2 = ybq0Var != null ? ybq0Var : null;
                xry0 xry0Var3 = yry0.a;
                ((zbq0) ybq0Var2).r(yry0.a.c);
                return;
            }
        }
        if (!(state instanceof lve0)) {
            if (state instanceof mve0) {
                showSelectFragment();
                return;
            } else {
                w511.b();
                return;
            }
        }
        lve0 lve0Var = (lve0) state;
        if (lve0Var.a) {
            ybq0 ybq0Var3 = this.selectCallbacks;
            ((zbq0) (ybq0Var3 != null ? ybq0Var3 : null)).q(lve0Var.b);
        } else {
            PaymentKitError paymentKitError = lve0Var.b;
            xry0 xry0Var4 = yry0.a;
            showFinalScreen(new mjf0(iu11.b(paymentKitError, yry0.a.j), iu11.a(lve0Var.b)));
        }
    }

    private final void showFinalScreen(pjf0 state) {
        dve0 dve0Var = this.callbacks;
        if (dve0Var == null) {
            dve0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var).f();
        getBinding().l.setVisibility(0);
        getBinding().l.setState(state);
        getBinding().e.setVisibility(8);
        getBinding().n.setVisibility(8);
    }

    private final boolean showSelectFragment() {
        if (!isAdded() || getParentFragmentManager().S()) {
            return false;
        }
        dve0 dve0Var = this.callbacks;
        if (dve0Var == null) {
            dve0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var).t(null);
        dve0 dve0Var2 = this.callbacks;
        ((com.yandex.payment.sdk.ui.preselect.a) (dve0Var2 != null ? dve0Var2 : null)).r();
        return true;
    }

    private final void showWebView(String url, List<? extends fi11> trustedUrls) {
        dve0 dve0Var = this.callbacks;
        if (dve0Var == null) {
            dve0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var).d(url, trustedUrls);
    }

    public final void continuePaying$paymentsdk_release(PaymentToken paymentToken, ybq0 callbacks) {
        this.selectCallbacks = callbacks;
        ((zbq0) callbacks).m();
        wve0 wve0Var = this.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        if (wve0Var.x && wve0Var.H == CardInput$State.CARD_DETAILS_VALID) {
            ((yv90) wve0Var.b).i(paymentToken, null, new vve0(wve0Var));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        applyOrientation(newConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isBackButtonEnabled = requireArguments().getBoolean(ARG_IS_BACK_BUTTON_ENABLED);
        this.startPaymentAfterSelect = requireArguments().getBoolean(START_PAYMENT_AFTER_SELECT);
        vv90 f = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).f();
        px90 g = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).g();
        a aVar = this.bindCardInputController;
        boolean z = this.startPaymentAfterSelect;
        Handler handler = new Handler(Looper.getMainLooper());
        dve0 dve0Var = this.callbacks;
        if (dve0Var == null) {
            dve0Var = null;
        }
        this.viewModel = (wve0) new ls31(this, new fve0(f, g, aVar, z, handler, new PreselectNewBindFragment$onCreate$1(1, dve0Var, dve0.class, "onSelectSuccess", "onSelectSuccess(Lcom/yandex/payment/sdk/core/data/SelectedMethod;)V", 0), ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).a().getResultScreenClosing())).b(wve0.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setCurrentBinding(rpa0.o(inflater, container));
        cvy0 cvy0Var = ckt.a;
        int a2 = ckt.a(requireContext());
        Context requireContext = requireContext();
        CardInputMode cardInputMode = this.startPaymentAfterSelect ? CardInputMode.PayAndBind : CardInputMode.BindOnly;
        CardValidationConfig cardValidationConfig = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).a().getCardValidationConfig();
        rwo eventReporter = getEventReporter();
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        boolean o = n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
        CardInputViewImpl cardInputViewImpl = new CardInputViewImpl(new ContextThemeWrapper(requireContext, a2), null, 0, 6, null);
        cardInputViewImpl.setup(cardInputMode, cardValidationConfig, null, eventReporter, o);
        cardInputViewImpl.setOnStateChangeListener(new cve0(this, 0));
        cardInputViewImpl.setMaskedCardNumberListener(new cve0(this, 1));
        cardInputViewImpl.setCardPaymentSystemListener(new cve0(this, 2));
        cardInputViewImpl.setPaymentApi(((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(this)).componentDispatcher()).b(wy4.class))).f());
        this.bindCardInputController.a = cardInputViewImpl;
        getBinding().b.addView(cardInputViewImpl);
        return getBinding().a;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingFragmentImpl, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.bindCardInputController.a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2;
        int i2 = 0;
        if (!this.isBackButtonEnabled || getParentFragmentManager().K() <= 1) {
            HeaderView.setBackButton$default(getBinding().e, false, null, 2, null);
            getBinding().g.setVisibility(8);
        } else {
            getBinding().g.setVisibility(0);
            getBinding().g.setOnClickListener(new d5b0(17, this));
        }
        applyOrientation(getResources().getConfiguration());
        getBinding().e.setTitleText(null);
        getBinding().e.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        getBinding().i.setVisibility(8);
        getBinding().j.setVisibility(8);
        getBinding().k.setVisibility(8);
        getBinding().h.setVisibility(0);
        getBinding().h.setText(ryh0.paymentsdk_bind_card_title);
        getBinding().m.setVisibility(this.startPaymentAfterSelect ? 0 : 8);
        if (this.startPaymentAfterSelect) {
            getBinding().m.setChecked(true);
            CardInputViewImpl cardInputViewImpl = this.bindCardInputController.a;
            if (cardInputViewImpl != null) {
                cardInputViewImpl.setSaveCardOnPayment(true);
            }
            getBinding().m.setOnCheckedChangeListener(new vpb(i, this));
        }
        dve0 dve0Var = this.callbacks;
        if (dve0Var == null) {
            dve0Var = null;
        }
        ((com.yandex.payment.sdk.ui.preselect.a) dve0Var).B(new bve0(this, i2));
        getBinding().e.setCloseButton(true, new PreselectNewBindFragment$onViewCreated$4(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().l.setExitButtonCallback(new PreselectNewBindFragment$onViewCreated$5(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().l.setBrandIconVisible(!debrandingEnabled());
        wve0 wve0Var = this.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        px90.h(wve0Var.c, new pg8(5, wve0Var));
        wve0Var.B.l(nve0.a);
        wve0Var.C.l(new hve0(ryh0.paymentsdk_bind_card_next_button, null, null));
        observeChanges();
        super.onViewCreated(view, savedInstanceState);
    }

    public final void setBindCallbacks$paymentsdk_release(dve0 callbacks) {
        this.callbacks = callbacks;
    }

    public final void setExternalButtonState$paymentsdk_release(PreselectButtonState state) {
        wve0 wve0Var = this.viewModel;
        if (wve0Var == null) {
            wve0Var = null;
        }
        wve0Var.I = state;
        wve0Var.W();
    }
}
