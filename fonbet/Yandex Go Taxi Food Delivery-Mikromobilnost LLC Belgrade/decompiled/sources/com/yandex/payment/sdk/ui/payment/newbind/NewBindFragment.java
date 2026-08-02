package com.yandex.payment.sdk.ui.payment.newbind;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
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
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.payment.sdk.datasource.bind.interfaces.CardButtonTitle;
import com.yandex.payment.sdk.model.data.PersonalInfoConfig;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.Scenario;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.b560;
import defpackage.bm50;
import defpackage.bqr0;
import defpackage.c560;
import defpackage.c98;
import defpackage.cg8;
import defpackage.ckt;
import defpackage.cof;
import defpackage.cvy0;
import defpackage.d98;
import defpackage.dpb1;
import defpackage.e560;
import defpackage.e98;
import defpackage.egb1;
import defpackage.es31;
import defpackage.f98;
import defpackage.g98;
import defpackage.h560;
import defpackage.hvg0;
import defpackage.i3y;
import defpackage.in8;
import defpackage.iob1;
import defpackage.ix90;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.jn8;
import defpackage.jx90;
import defpackage.k560;
import defpackage.kl41;
import defpackage.kn8;
import defpackage.ll41;
import defpackage.ln8;
import defpackage.lng0;
import defpackage.ls31;
import defpackage.ml41;
import defpackage.mn8;
import defpackage.mta1;
import defpackage.n891;
import defpackage.njf0;
import defpackage.nl41;
import defpackage.nn8;
import defpackage.ny61;
import defpackage.p560;
import defpackage.p7u;
import defpackage.pwf;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rk6;
import defpackage.rpa0;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.uv90;
import defpackage.vfc;
import defpackage.vpb;
import defpackage.vu5;
import defpackage.vw90;
import defpackage.w511;
import defpackage.wga0;
import defpackage.wy4;
import defpackage.xry0;
import defpackage.y22;
import defpackage.y460;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.yhl;
import defpackage.yry0;
import defpackage.zbq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0006^_B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0005J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0005J\u0017\u00102\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\b2\u0006\u00101\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\b2\u0006\u00101\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0005R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010OR\u0016\u0010X\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/newbind/NewBindFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lrpa0;", "Lvu5;", "<init>", "()V", "Lc560;", "callbacks", "Lzy11;", "setBindCallbacks$paymentsdk_release", "(Lc560;)V", "setBindCallbacks", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onStart", "bindHeader", "(Landroid/view/View;)V", "", "debrandingEnabled", "()Z", "bindPersonalInfo", "bindCardView", ConfigConstants.CONFIG, "applyOrientation", "applyPortraitOrientation", "applyLandscapeOrientation", "isNext", "updateButtonText", "(Z)V", "observeChanges", "onBackButtonClick", "Lnn8;", ClidProvider.STATE, "setScreenState", "(Lnn8;)V", "Lf98;", "setButtonState", "(Lf98;)V", "Lnl41;", "setWebViewState", "(Lnl41;)V", "updatePersonalInfo", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lcg8;", "cardInputBridge", "Lcg8;", "Lp560;", "mediator$delegate", "getMediator", "()Lp560;", "mediator", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "isBackButtonEnabled", "Z", "shouldShowSaveCard", "Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;", "personalInfoVisibility", "Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;", "Lcom/yandex/payment/sdk/core/data/PaymentSettings;", "paymentSettings", "Lcom/yandex/payment/sdk/core/data/PaymentSettings;", "showCharityLabel", "shouldShowKeyboard", "Lc560;", "Lk560;", "viewModel", "Lk560;", "Companion", "h560", "e560", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewBindFragment extends ViewBindingFragmentImpl<rpa0> implements vu5 {
    private static final String ARG_IS_BACK_BUTTON_ENABLED = "ARG_IS_BACK_BUTTON_ENABLED";
    private static final String ARG_PAYMENT_SETTINGS = "ARG_PAYMENT_SETTINGS";
    private static final String ARG_PERSONAL_INFO_VISIBILITY = "ARG_PERSONAL_INFO_VISIBILITY";
    private static final String ARG_SHOULD_SHOW_SAVE_CARD = "ARG_SHOULD_SHOW_SAVE_CARD";
    private static final String ARG_SHOW_CHARITY_LABEL = "ARG_SHOW_CHARITY_LABEL";
    public static final e560 Companion = new e560();
    private c560 callbacks;
    private boolean isBackButtonEnabled;
    private PaymentSettings paymentSettings;
    private PersonalInfoVisibility personalInfoVisibility;
    private boolean shouldShowKeyboard;
    private boolean shouldShowSaveCard;
    private boolean showCharityLabel;
    private k560 viewModel;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment$special$$inlined$activityViewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment$special$$inlined$activityViewModels$default$3
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment$special$$inlined$activityViewModels$default$2
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
    private final cg8 cardInputBridge = new cg8(CardInputMode.PayAndBind);

    /* renamed from: mediator$delegate, reason: from kotlin metadata */
    private final i3y mediator = a.a(new b560(this, 3));

    /* renamed from: eventReporter$delegate, reason: from kotlin metadata */
    private final i3y eventReporter = a.a(new b560(this, 4));

    public NewBindFragment() {
        PersonalInfoConfig personalInfoConfig;
        PersonalInfoVisibility.Companion.getClass();
        PersonalInfoConfig.Companion.getClass();
        personalInfoConfig = PersonalInfoConfig.DEFAULT;
        this.personalInfoVisibility = new PersonalInfoVisibility(false, personalInfoConfig);
    }

    private final void applyLandscapeOrientation() {
        e eVar = new e();
        eVar.g(getBinding().d);
        eVar.e(j9h0.save_checkbox, 6);
        eVar.e(j9h0.save_checkbox, 3);
        eVar.j(j9h0.save_checkbox, 6, j9h0.card_input_container, 7, 0);
        eVar.j(j9h0.save_checkbox, 3, j9h0.paymethod_title, 4, 0);
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
    }

    private final void applyOrientation(Configuration config) {
        int i = config.orientation;
        if (i == 1) {
            applyPortraitOrientation();
        } else if (i == 2) {
            applyLandscapeOrientation();
        }
    }

    private final void applyPortraitOrientation() {
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
    }

    private final void bindCardView() {
        cvy0 cvy0Var = ckt.a;
        int a = ckt.a(requireContext());
        Context requireContext = requireContext();
        CardInputMode cardInputMode = CardInputMode.PayAndBind;
        c560 c560Var = this.callbacks;
        if (c560Var == null) {
            c560Var = null;
        }
        CardValidationConfig o = ((zbq0) c560Var).o();
        rwo eventReporter = getEventReporter();
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        boolean o2 = n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
        CardInputViewImpl cardInputViewImpl = new CardInputViewImpl(new ContextThemeWrapper(requireContext, a), null, 0, 6, null);
        cardInputViewImpl.setup(cardInputMode, o, null, eventReporter, o2);
        c560 c560Var2 = this.callbacks;
        cardInputViewImpl.setPaymentApi(((zbq0) (c560Var2 != null ? c560Var2 : null)).k());
        this.cardInputBridge.a(cardInputViewImpl);
        getBinding().m.setVisibility(this.shouldShowSaveCard ? 0 : 8);
        CheckBox checkBox = getBinding().m;
        rwo eventReporter2 = getEventReporter();
        sv90 sv90Var = qv90.a;
        Scenario scenario = Scenario.NEW_CARD_PAY;
        sv90Var.getClass();
        int i = 1;
        ((y22) eventReporter2).a(sv90.b(true, scenario, true));
        checkBox.setChecked(true);
        CardInputView cardInputView = this.cardInputBridge.b;
        if (cardInputView != null) {
            cardInputView.setSaveCardOnPayment(true);
        }
        if (this.shouldShowSaveCard) {
            getBinding().m.setOnCheckedChangeListener(new vpb(i, this));
        }
        getBinding().b.addView(cardInputViewImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCardView$lambda$1(NewBindFragment newBindFragment, CompoundButton compoundButton, boolean z) {
        rwo eventReporter = newBindFragment.getEventReporter();
        sv90 sv90Var = qv90.a;
        Scenario scenario = Scenario.NEW_CARD_PAY;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.b(z, scenario, false));
        CardInputView cardInputView = newBindFragment.cardInputBridge.b;
        if (cardInputView != null) {
            cardInputView.setSaveCardOnPayment(z);
        }
        if (newBindFragment.showCharityLabel) {
            n891.a(newBindFragment.getBinding().a, (ViewGroup) newBindFragment.requireView().getRootView().findViewById(j9h0.container_layout));
            newBindFragment.getBinding().c.setVisibility(z ? 8 : 0);
        }
    }

    private final void bindHeader(View view) {
        getBinding().e.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        getBinding().e.setTitleText(null);
        getBinding().h.setVisibility(0);
        getBinding().h.setText(ryh0.paymentsdk_header_title);
        getBinding().e.setCloseButton(true, new NewBindFragment$bindHeader$1(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
    }

    private final void bindPersonalInfo() {
        if (this.personalInfoVisibility.shouldShowAnything()) {
            getBinding().j.setVisibility(0);
            getBinding().j.setText(ryh0.paymentsdk_personal_label);
            getBinding().k.setVisibility(0);
            getBinding().k.setPersonalInfoVisibility(this.personalInfoVisibility);
            getBinding().g.setVisibility(8);
        } else {
            getBinding().i.setVisibility(8);
            getBinding().j.setVisibility(8);
            getBinding().k.setVisibility(8);
        }
        PersonalInfoView personalInfoView = getBinding().k;
        c560 c560Var = this.callbacks;
        if (c560Var == null) {
            c560Var = null;
        }
        personalInfoView.setValidators(egb1.a(((zbq0) c560Var).o()));
        c560 c560Var2 = this.callbacks;
        if (c560Var2 == null) {
            c560Var2 = null;
        }
        personalInfoView.setPersonalInfo(((zbq0) c560Var2).A);
        k560 k560Var = this.viewModel;
        if (k560Var == null) {
            k560Var = null;
        }
        k560Var.c.i = !this.personalInfoVisibility.shouldShowEmail();
        k560 k560Var2 = this.viewModel;
        if (k560Var2 == null) {
            k560Var2 = null;
        }
        String email = personalInfoView.getEmailView().isValid() ? personalInfoView.getEmailView().getEmail() : null;
        k560Var2.w = email;
        p560 p560Var = k560Var2.c;
        if (!jl40.l(email, p560Var.h)) {
            p560Var.h = email;
            g98 g98Var = p560Var.d;
            if (g98Var != null) {
                g98Var.e(p560Var.d(p560Var.g));
            }
        }
        personalInfoView.setCallback(new bm50(2, this, personalInfoView));
        personalInfoView.onEmailFocusChanged(new y460(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindPersonalInfo$lambda$0$0(NewBindFragment newBindFragment, PersonalInfoView personalInfoView) {
        k560 k560Var = newBindFragment.viewModel;
        if (k560Var == null) {
            k560Var = null;
        }
        String email = personalInfoView.getEmailView().isValid() ? personalInfoView.getEmailView().getEmail() : null;
        k560Var.w = email;
        p560 p560Var = k560Var.c;
        if (!jl40.l(email, p560Var.h)) {
            p560Var.h = email;
            g98 g98Var = p560Var.d;
            if (g98Var != null) {
                g98Var.e(p560Var.d(p560Var.g));
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindPersonalInfo$lambda$0$1(NewBindFragment newBindFragment, boolean z) {
        ((y22) newBindFragment.getEventReporter()).a(sv90.A0(qv90.a, TextFieldNameForAnalytics.EMAIL, z));
        return zy11.a;
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

    private final p560 getMediator() {
        return (p560) this.mediator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p560 mediator_delegate$lambda$0(NewBindFragment newBindFragment) {
        return new p560(newBindFragment.getEventReporter());
    }

    private final void observeChanges() {
        k560 k560Var = this.viewModel;
        if (k560Var == null) {
            k560Var = null;
        }
        int i = 4;
        k560Var.c.l.f(getViewLifecycleOwner(), new cof(i, new y460(this, 0)));
        k560 k560Var2 = this.viewModel;
        if (k560Var2 == null) {
            k560Var2 = null;
        }
        k560Var2.c.k.f(getViewLifecycleOwner(), new cof(i, new y460(this, 1)));
        k560 k560Var3 = this.viewModel;
        (k560Var3 != null ? k560Var3 : null).c.m.f(getViewLifecycleOwner(), new cof(i, new y460(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$0(NewBindFragment newBindFragment, f98 f98Var) {
        newBindFragment.setButtonState(f98Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$1(NewBindFragment newBindFragment, nn8 nn8Var) {
        newBindFragment.setScreenState(nn8Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$2(NewBindFragment newBindFragment, nl41 nl41Var) {
        newBindFragment.setWebViewState(nl41Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackButtonClick() {
        ((y22) getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Нажатие на кнопку назад на экране ввода новой карты", "clicked_back_button_new_card"));
        requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uv90 onCreate$lambda$1(NewBindFragment newBindFragment) {
        c560 c560Var = newBindFragment.callbacks;
        if (c560Var == null) {
            c560Var = null;
        }
        wga0 wga0Var = ((zbq0) c560Var).B;
        if (wga0Var != null) {
            return wga0Var;
        }
        ny61.r("Null payment for pay new card fragment");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(NewBindFragment newBindFragment) {
        newBindFragment.onBackButtonClick();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(NewBindFragment newBindFragment) {
        rwo eventReporter = newBindFragment.getEventReporter();
        qv90.a.getClass();
        ((y22) eventReporter).a(sv90.D());
        k560 k560Var = newBindFragment.viewModel;
        if (k560Var == null) {
            k560Var = null;
        }
        rk6 rk6Var = k560Var.c.n;
        if (rk6Var != null) {
            rk6Var.invoke();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setButtonState(f98 state) {
        Object[] objArr = 0;
        if (jl40.l(state, e98.a)) {
            c560 c560Var = this.callbacks;
            ((zbq0) (c560Var != null ? c560Var : null)).n(false);
            return;
        }
        if (state instanceof c98) {
            updateButtonText(((c98) state).a == CardButtonTitle.ShowNext);
            c560 c560Var2 = this.callbacks;
            if (c560Var2 == null) {
                c560Var2 = null;
            }
            ((zbq0) c560Var2).n(true);
            c560 c560Var3 = this.callbacks;
            ((zbq0) (c560Var3 != null ? c560Var3 : null)).v(ix90.a);
            return;
        }
        if (!(state instanceof d98)) {
            w511.b();
            return;
        }
        CardButtonTitle cardButtonTitle = ((d98) state).a;
        updateButtonText(cardButtonTitle == CardButtonTitle.ShowNext);
        updatePersonalInfo();
        if (cardButtonTitle == CardButtonTitle.ShowProcess) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            Scenario scenario = Scenario.NEW_CARD_PAY;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.u(scenario));
        }
        c560 c560Var4 = this.callbacks;
        if (c560Var4 == null) {
            c560Var4 = null;
        }
        ((zbq0) c560Var4).n(true);
        c560 c560Var5 = this.callbacks;
        ((zbq0) (c560Var5 != null ? c560Var5 : null)).v(new jx90((int) (objArr == true ? 1 : 0)));
    }

    private final void setScreenState(nn8 state) {
        n891.b(getBinding().a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        if (jl40.l(state, jn8.a)) {
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
        if (jl40.l(state, kn8.a)) {
            c560 c560Var = this.callbacks;
            ((zbq0) (c560Var != null ? c560Var : null)).m();
            getBinding().l.setVisibility(0);
            ProgressResultView progressResultView = getBinding().l;
            xry0 xry0Var = yry0.a;
            progressResultView.setState(new njf0(yry0.a.d, true));
            getBinding().e.setVisibility(8);
            getBinding().n.setVisibility(8);
            return;
        }
        if (state instanceof mn8) {
            c560 c560Var2 = this.callbacks;
            if (c560Var2 == null) {
                c560Var2 = null;
            }
            ((zbq0) c560Var2).f();
            c560 c560Var3 = this.callbacks;
            c560 c560Var4 = c560Var3 != null ? c560Var3 : null;
            xry0 xry0Var2 = yry0.a;
            ((zbq0) c560Var4).r(yry0.a.c);
            return;
        }
        if (!(state instanceof in8)) {
            if (state instanceof ln8) {
                yhl.d(state, "Illegal model state ");
                return;
            } else {
                w511.b();
                return;
            }
        }
        c560 c560Var5 = this.callbacks;
        if (c560Var5 == null) {
            c560Var5 = null;
        }
        ((zbq0) c560Var5).f();
        c560 c560Var6 = this.callbacks;
        ((zbq0) (c560Var6 != null ? c560Var6 : null)).q(((in8) state).a);
    }

    private final void setWebViewState(nl41 state) {
        if (state instanceof kl41) {
            c560 c560Var = this.callbacks;
            ((zbq0) (c560Var != null ? c560Var : null)).f();
        } else if (state instanceof ll41) {
            c560 c560Var2 = this.callbacks;
            ((zbq0) (c560Var2 != null ? c560Var2 : null)).j(((ll41) state).a.toString());
        } else {
            if (!(state instanceof ml41)) {
                w511.b();
                return;
            }
            c560 c560Var3 = this.callbacks;
            ml41 ml41Var = (ml41) state;
            ((zbq0) (c560Var3 != null ? c560Var3 : null)).d(ml41Var.a.toString(), ml41Var.b);
        }
    }

    private final void updateButtonText(boolean isNext) {
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        c560 c560Var = this.callbacks;
        if (isNext) {
            if (c560Var == null) {
                c560Var = null;
            }
            vw90.D(c560Var, getString(ryh0.paymentsdk_bind_card_next_button), null, 6);
        } else {
            if (c560Var == null) {
                c560Var = null;
            }
            String string = getString(ryh0.paymentsdk_pay_title);
            Context requireContext = requireContext();
            PaymentSettings paymentSettings = this.paymentSettings;
            vw90.D(c560Var, string, mta1.d(requireContext, paymentSettings != null ? paymentSettings : null, getEventReporter()), 4);
        }
    }

    private final void updatePersonalInfo() {
        c560 c560Var = this.callbacks;
        if (c560Var == null) {
            c560Var = null;
        }
        ((zbq0) c560Var).A = getBinding().k.getPersonalInfo();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        applyOrientation(newConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle requireArguments = requireArguments();
        this.isBackButtonEnabled = requireArguments.getBoolean(ARG_IS_BACK_BUTTON_ENABLED);
        this.shouldShowSaveCard = requireArguments.getBoolean(ARG_SHOULD_SHOW_SAVE_CARD);
        PersonalInfoVisibility personalInfoVisibility = (PersonalInfoVisibility) requireArguments.getParcelable(ARG_PERSONAL_INFO_VISIBILITY);
        if (personalInfoVisibility != null) {
            this.personalInfoVisibility = personalInfoVisibility;
        }
        this.paymentSettings = (PaymentSettings) requireArguments.getParcelable(ARG_PAYMENT_SETTINGS);
        this.showCharityLabel = requireArguments.getBoolean(ARG_SHOW_CHARITY_LABEL);
        b560 b560Var = new b560(this, 2);
        c560 c560Var = this.callbacks;
        if (c560Var == null) {
            c560Var = null;
        }
        this.viewModel = (k560) new ls31(this, new h560(b560Var, ((pwf) ((zbq0) c560Var).b).g(), getMediator(), this.cardInputBridge)).b(k560.class);
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
        if (this.shouldShowKeyboard) {
            this.shouldShowKeyboard = false;
            CardInputView cardInputView = this.cardInputBridge.b;
            if (cardInputView != null) {
                cardInputView.focusInput();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final int i = 0;
        final int i2 = 1;
        if (!this.isBackButtonEnabled || getParentFragmentManager().K() <= 1) {
            if (iob1.d(view.getContext().getTheme(), lng0.paymentsdk_bindShowCloseButton, false)) {
                getBinding().e.setCloseButton(true, new b560(this, i));
            } else {
                HeaderView.setCloseButton$default(getBinding().e, false, null, 2, null);
            }
            getBinding().g.setVisibility(8);
        } else if (this.personalInfoVisibility.shouldShowAnything()) {
            getBinding().i.setVisibility(0);
            getBinding().i.setOnClickListener(new View.OnClickListener(this) { // from class: a560
                public final /* synthetic */ NewBindFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i;
                    NewBindFragment newBindFragment = this.b;
                    switch (i3) {
                        case 0:
                            newBindFragment.onBackButtonClick();
                            break;
                        default:
                            newBindFragment.onBackButtonClick();
                            break;
                    }
                }
            });
        } else {
            getBinding().g.setVisibility(0);
            getBinding().g.setOnClickListener(new View.OnClickListener(this) { // from class: a560
                public final /* synthetic */ NewBindFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i2;
                    NewBindFragment newBindFragment = this.b;
                    switch (i3) {
                        case 0:
                            newBindFragment.onBackButtonClick();
                            break;
                        default:
                            newBindFragment.onBackButtonClick();
                            break;
                    }
                }
            });
        }
        applyOrientation(getResources().getConfiguration());
        bindHeader(view);
        bindPersonalInfo();
        bindCardView();
        updateButtonText(true);
        c560 c560Var = this.callbacks;
        if (c560Var == null) {
            c560Var = null;
        }
        ((zbq0) c560Var).B(new b560(this, i2));
        c560 c560Var2 = this.callbacks;
        if (c560Var2 == null) {
            c560Var2 = null;
        }
        ((zbq0) c560Var2).p(true);
        c560 c560Var3 = this.callbacks;
        ((zbq0) (c560Var3 != null ? c560Var3 : null)).getClass();
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        if (savedInstanceState == null && !this.personalInfoVisibility.shouldShowAnything()) {
            this.shouldShowKeyboard = true;
        }
        getBinding().l.setExitButtonCallback(new NewBindFragment$onViewCreated$5(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        getBinding().l.setBrandIconVisible(!debrandingEnabled());
        observeChanges();
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        Scenario scenario = Scenario.NEW_CARD_PAY;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.x(scenario));
        super.onViewCreated(view, savedInstanceState);
    }

    public final void setBindCallbacks$paymentsdk_release(c560 callbacks) {
        this.callbacks = callbacks;
    }
}
