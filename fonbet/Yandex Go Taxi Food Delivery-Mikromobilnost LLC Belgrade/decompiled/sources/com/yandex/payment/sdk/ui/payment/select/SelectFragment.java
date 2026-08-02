package com.yandex.payment.sdk.ui.payment.select;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.cvv_confirm.CvvScreenArguments;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.PersonalInfoConfig;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.SelectPaymentAdapter$AdapterMode;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.afq0;
import defpackage.apa1;
import defpackage.bqr0;
import defpackage.ckt;
import defpackage.cof;
import defpackage.cvy0;
import defpackage.deq0;
import defpackage.dgo;
import defpackage.dn60;
import defpackage.do21;
import defpackage.dpb1;
import defpackage.e4p;
import defpackage.eeq0;
import defpackage.egb1;
import defpackage.es31;
import defpackage.ev5;
import defpackage.f4p;
import defpackage.feq0;
import defpackage.fi11;
import defpackage.fve0;
import defpackage.g4p;
import defpackage.geq0;
import defpackage.gx90;
import defpackage.h4p;
import defpackage.heq0;
import defpackage.hx90;
import defpackage.i3y;
import defpackage.i4p;
import defpackage.ieq0;
import defpackage.iob1;
import defpackage.ix90;
import defpackage.j9h0;
import defpackage.jeq0;
import defpackage.jl40;
import defpackage.jx90;
import defpackage.kcq0;
import defpackage.keq0;
import defpackage.lng0;
import defpackage.ls31;
import defpackage.m991;
import defpackage.mta1;
import defpackage.n891;
import defpackage.njf0;
import defpackage.ny61;
import defpackage.ong0;
import defpackage.oy80;
import defpackage.oy90;
import defpackage.p7u;
import defpackage.pgk0;
import defpackage.pwf;
import defpackage.qgn0;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rnf;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.t27;
import defpackage.u27;
import defpackage.ucq0;
import defpackage.uv90;
import defpackage.v27;
import defpackage.vbq0;
import defpackage.vpa0;
import defpackage.vv90;
import defpackage.vvb1;
import defpackage.vw90;
import defpackage.w511;
import defpackage.wbq0;
import defpackage.weq0;
import defpackage.wga0;
import defpackage.wy4;
import defpackage.xbq0;
import defpackage.xcq0;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.y22;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.ybq0;
import defpackage.yry0;
import defpackage.yv90;
import defpackage.z27;
import defpackage.zbq0;
import defpackage.zeq0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0006hijB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0005J\u0011\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0005J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000200H\u0002¢\u0006\u0004\b9\u0010:J%\u00109\u001a\u00020\b2\u0006\u00108\u001a\u0002002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b9\u0010>J\u000f\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010\u0005J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0005J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010L\u001a\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010Y¨\u0006k"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/select/SelectFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Lvpa0;", "Lucq0;", "<init>", "()V", "Lybq0;", "callbacks", "Lzy11;", "setSelectCallbacks$paymentsdk_release", "(Lybq0;)V", "setSelectCallbacks", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "position", "onSelectPaymentMethod", "(I)V", "", "isValid", "Lrnf;", "cvnInput", "onChangeCvn", "(IZLrnf;)V", "debrandingEnabled", "()Z", "observeChanges", "Lkeq0;", ClidProvider.STATE, "setScreenState", "(Lkeq0;)V", "Lz27;", "setButtonState", "(Lz27;)V", "setupPayButtonWithSum", "", "getUserTypedEmail", "()Ljava/lang/String;", "Luv90;", "payment", "updatePayment", "(Luv90;)V", "updatePersonalInfo", "url", "showWebView", "(Ljava/lang/String;)V", "", "Lfi11;", "trustedUrls", "(Ljava/lang/String;Ljava/util/List;)V", "hideChallenge", "cancelPayment", "Ldo21;", "buildUserInput", "()Ldo21;", "Lafq0;", "viewModel", "Lafq0;", "Lxcq0;", "adapter", "Lxcq0;", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "preferredMethod", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;", "personalInfoVisibility", "Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;", "formattedSum", "Ljava/lang/String;", "isLightTheme", "Z", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lybq0;", "Lkcq0;", "mediator", "Lkcq0;", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "showFooterOnSelectOnly", "Companion", "FixupOnLayoutChangeListener", "fve0", "xbq0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectFragment extends ViewBindingFragmentImpl<vpa0> implements ucq0 {
    private static final String ARG_PERSONAL_INFO_VISIBILITY = "ARG_PERSONAL_INFO_STATE";
    private static final String ARG_PREFERRED_METHOD = "ARG_PREFERRED_METHOD";
    public static final xbq0 Companion = new xbq0();

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.select.SelectFragment$special$$inlined$activityViewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.select.SelectFragment$special$$inlined$activityViewModels$default$3
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.select.SelectFragment$special$$inlined$activityViewModels$default$2
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
    private xcq0 adapter;
    private ybq0 callbacks;

    /* renamed from: eventReporter$delegate, reason: from kotlin metadata */
    private final i3y eventReporter;
    private String formattedSum;
    private boolean isLightTheme;
    private View.OnLayoutChangeListener layoutChangeListener;
    private final kcq0 mediator;
    private PersonalInfoVisibility personalInfoVisibility;
    private PaymentMethod preferredMethod;
    private boolean showFooterOnSelectOnly;
    private afq0 viewModel;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/select/SelectFragment$FixupOnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/ViewGroup;", "target", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Landroid/view/ViewGroup;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FixupOnLayoutChangeListener implements View.OnLayoutChangeListener {
        private final ViewGroup target;

        public FixupOnLayoutChangeListener(ViewGroup viewGroup) {
            this.target = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            TransitionManager.b(this.target);
        }
    }

    public SelectFragment() {
        PersonalInfoConfig personalInfoConfig;
        PersonalInfoVisibility.Companion.getClass();
        PersonalInfoConfig.Companion.getClass();
        personalInfoConfig = PersonalInfoConfig.DEFAULT;
        this.personalInfoVisibility = new PersonalInfoVisibility(false, personalInfoConfig);
        this.isLightTheme = true;
        this.mediator = new kcq0();
        this.eventReporter = a.a(new wbq0(this, 3));
    }

    private final do21 buildUserInput() {
        String userTypedEmail = getUserTypedEmail();
        xcq0 xcq0Var = this.adapter;
        if (xcq0Var == null) {
            xcq0Var = null;
        }
        return new do21(userTypedEmail, xcq0Var.B);
    }

    private final void cancelPayment() {
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        ((zbq0) ybq0Var).G();
    }

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rwo eventReporter_delegate$lambda$0(SelectFragment selectFragment) {
        return ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(selectFragment)).componentDispatcher()).b(wy4.class))).c();
    }

    private final rwo getEventReporter() {
        return (rwo) this.eventReporter.getValue();
    }

    private final String getUserTypedEmail() {
        if (this.personalInfoVisibility.shouldShowAnything()) {
            return getBinding().e.getEmailView().getEmail();
        }
        return null;
    }

    private final void hideChallenge() {
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        ((zbq0) ybq0Var).K();
    }

    private final void observeChanges() {
        afq0 afq0Var = this.viewModel;
        if (afq0Var == null) {
            afq0Var = null;
        }
        int i = 11;
        afq0Var.B.f(getViewLifecycleOwner(), new cof(i, new vbq0(this, 0)));
        afq0 afq0Var2 = this.viewModel;
        if (afq0Var2 == null) {
            afq0Var2 = null;
        }
        afq0Var2.C.f(getViewLifecycleOwner(), new cof(i, new vbq0(this, 1)));
        afq0 afq0Var3 = this.viewModel;
        if (afq0Var3 == null) {
            afq0Var3 = null;
        }
        afq0Var3.D.f(getViewLifecycleOwner(), new cof(i, new vbq0(this, 2)));
        afq0 afq0Var4 = this.viewModel;
        if (afq0Var4 == null) {
            afq0Var4 = null;
        }
        afq0Var4.E.f(getViewLifecycleOwner(), new cof(i, new vbq0(this, 3)));
        afq0 afq0Var5 = this.viewModel;
        (afq0Var5 != null ? afq0Var5 : null).F.f(getViewLifecycleOwner(), new cof(i, new vbq0(this, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$0(SelectFragment selectFragment, uv90 uv90Var) {
        selectFragment.updatePayment(uv90Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$1(SelectFragment selectFragment, Pair pair) {
        if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_CHALLENGER_FLAG)) {
            DKChallengerFragment b = new xsf().b((SbpChallengeInfo) pair.c(), (PaymentMethod.SbpToken) pair.f());
            ybq0 ybq0Var = selectFragment.callbacks;
            if (ybq0Var == null) {
                ybq0Var = null;
            }
            ((zbq0) ybq0Var).P(b, false);
        } else {
            Intent intent = new Intent(selectFragment.requireContext(), (Class<?>) SbpChallengerActivity.class);
            intent.putExtra(SbpChallengerActivity.EXTRA_CHALLENGE_INFO_DATA, (Parcelable) pair.c());
            intent.putExtra(SbpChallengerActivity.EXTRA_SBP_TOKEN_DATA, (Parcelable) pair.f());
            intent.putExtra(SbpChallengerActivity.EXTRA_MODULE_DATA, selectFragment.requireActivity().getIntent().getExtras());
            selectFragment.requireActivity().startActivityForResult(intent, 1111);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$2(SelectFragment selectFragment, keq0 keq0Var) {
        selectFragment.setScreenState(keq0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$3(SelectFragment selectFragment, z27 z27Var) {
        selectFragment.setButtonState(z27Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$4(SelectFragment selectFragment, i4p i4pVar) {
        if (i4pVar instanceof g4p) {
            g4p g4pVar = (g4p) i4pVar;
            selectFragment.showWebView(g4pVar.a, g4pVar.b);
        } else {
            if ((i4pVar instanceof e4p) || jl40.l(i4pVar, f4p.a)) {
                ybq0 ybq0Var = selectFragment.callbacks;
                ((zbq0) (ybq0Var != null ? ybq0Var : null)).K();
            } else {
                if (!(i4pVar instanceof h4p)) {
                    w511.b();
                    return null;
                }
                ybq0 ybq0Var2 = selectFragment.callbacks;
                if (ybq0Var2 == null) {
                    ybq0Var2 = null;
                }
                ((zbq0) ybq0Var2).L();
                new xsf();
                h4p h4pVar = (h4p) i4pVar;
                int i = h4pVar.a;
                String str = h4pVar.b;
                String str2 = h4pVar.c;
                CvvConfirmFragment.Companion.getClass();
                CvvConfirmFragment cvvConfirmFragment = new CvvConfirmFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("paymentsdk_cvv_args_key", new CvvScreenArguments.Challenge(i, str, str2));
                cvvConfirmFragment.setArguments(bundle);
                ybq0 ybq0Var3 = selectFragment.callbacks;
                ((zbq0) (ybq0Var3 != null ? ybq0Var3 : null)).P(cvvConfirmFragment, false);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(SelectFragment selectFragment) {
        afq0 afq0Var = selectFragment.viewModel;
        if (afq0Var == null) {
            afq0Var = null;
        }
        afq0Var.a0(selectFragment.buildUserInput());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(SelectFragment selectFragment, boolean z) {
        ((y22) selectFragment.getEventReporter()).a(sv90.A0(qv90.a, TextFieldNameForAnalytics.EMAIL, z));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(SelectFragment selectFragment) {
        afq0 afq0Var = selectFragment.viewModel;
        if (afq0Var == null) {
            afq0Var = null;
        }
        afq0Var.H = true;
        afq0Var.D.l(feq0.a);
        ybq0 ybq0Var = selectFragment.callbacks;
        zbq0 zbq0Var = (zbq0) (ybq0Var != null ? ybq0Var : null);
        zbq0Var.getClass();
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) zbq0Var.b).b());
        if (a != null) {
            a.a(vvb1.J);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(SelectFragment selectFragment) {
        rwo eventReporter = selectFragment.getEventReporter();
        qv90.a.getClass();
        ((y22) eventReporter).a(sv90.D());
        afq0 afq0Var = selectFragment.viewModel;
        if (afq0Var == null) {
            afq0Var = null;
        }
        afq0Var.X(selectFragment.buildUserInput());
        return zy11.a;
    }

    private final void setButtonState(z27 state) {
        m991 m991Var = gx90.b;
        if (jl40.l(state, v27.a)) {
            ybq0 ybq0Var = this.callbacks;
            ((zbq0) (ybq0Var != null ? ybq0Var : null)).n(false);
            return;
        }
        if (!(state instanceof t27)) {
            if (!(state instanceof u27)) {
                w511.b();
                return;
            }
            updatePersonalInfo();
            ybq0 ybq0Var2 = this.callbacks;
            if (ybq0Var2 == null) {
                ybq0Var2 = null;
            }
            ((zbq0) ybq0Var2).n(true);
            ybq0 ybq0Var3 = this.callbacks;
            ybq0 ybq0Var4 = ybq0Var3 != null ? ybq0Var3 : null;
            if (((u27) state).a && !debrandingEnabled()) {
                m991Var = new hx90(this.isLightTheme);
            }
            ((zbq0) ybq0Var4).v(new jx90(m991Var));
            setupPayButtonWithSum();
            return;
        }
        ybq0 ybq0Var5 = this.callbacks;
        if (ybq0Var5 == null) {
            ybq0Var5 = null;
        }
        ((zbq0) ybq0Var5).n(true);
        ybq0 ybq0Var6 = this.callbacks;
        if (ybq0Var6 == null) {
            ybq0Var6 = null;
        }
        ((zbq0) ybq0Var6).v(ix90.a);
        t27 t27Var = (t27) state;
        if (t27Var.a == null) {
            setupPayButtonWithSum();
            return;
        }
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        String str = this.formattedSum;
        ybq0 ybq0Var7 = this.callbacks;
        if (ybq0Var7 == null) {
            ybq0Var7 = null;
        }
        Integer num = t27Var.a;
        String string = num != null ? getString(num.intValue()) : null;
        if (string == null) {
            string = "";
        }
        vw90.D(ybq0Var7, string, str, 4);
    }

    private final void setScreenState(keq0 state) {
        n891.b(getBinding().a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        if (state instanceof geq0) {
            getBinding().f.setVisibility(0);
            ProgressResultView progressResultView = getBinding().f;
            xry0 xry0Var = yry0.a;
            geq0 geq0Var = (geq0) state;
            progressResultView.setState(new njf0(yry0.a.d, geq0Var.b));
            getBinding().b.setVisibility(8);
            getBinding().h.setVisibility(8);
            if (this.showFooterOnSelectOnly) {
                ybq0 ybq0Var = this.callbacks;
                if (ybq0Var == null) {
                    ybq0Var = null;
                }
                ((zbq0) ybq0Var).p(false);
            }
            if (geq0Var.a) {
                ybq0 ybq0Var2 = this.callbacks;
                ((zbq0) (ybq0Var2 != null ? ybq0Var2 : null)).m();
                return;
            }
            return;
        }
        if (state instanceof deq0) {
            ybq0 ybq0Var3 = this.callbacks;
            ((zbq0) (ybq0Var3 != null ? ybq0Var3 : null)).O(((deq0) state).a);
            return;
        }
        if (state instanceof ieq0) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            PsdkScreen psdkScreen = PsdkScreen.SELECT;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.w0(psdkScreen));
            getBinding().f.setVisibility(8);
            getBinding().b.setVisibility(0);
            getBinding().h.setVisibility(0);
            ybq0 ybq0Var4 = this.callbacks;
            if (ybq0Var4 == null) {
                ybq0Var4 = null;
            }
            ((zbq0) ybq0Var4).p(true);
            ybq0 ybq0Var5 = this.callbacks;
            if (ybq0Var5 == null) {
                ybq0Var5 = null;
            }
            zbq0 zbq0Var = (zbq0) ybq0Var5;
            zbq0Var.getClass();
            xry0 xry0Var2 = yry0.a;
            yry0.a.getClass();
            if (zbq0Var.B == null) {
                zbq0Var.p(false);
            }
            boolean z = getResources().getConfiguration().orientation == 1;
            xcq0 xcq0Var = this.adapter;
            ieq0 ieq0Var = (ieq0) state;
            (xcq0Var != null ? xcq0Var : null).h(ieq0Var.a, ieq0Var.b, z);
            return;
        }
        if (state instanceof jeq0) {
            getActivityViewModel().X();
            if (this.showFooterOnSelectOnly) {
                ybq0 ybq0Var6 = this.callbacks;
                if (ybq0Var6 == null) {
                    ybq0Var6 = null;
                }
                ((zbq0) ybq0Var6).p(false);
            }
            ybq0 ybq0Var7 = this.callbacks;
            if (ybq0Var7 == null) {
                ybq0Var7 = null;
            }
            ((zbq0) ybq0Var7).f();
            ybq0 ybq0Var8 = this.callbacks;
            ((zbq0) (ybq0Var8 != null ? ybq0Var8 : null)).r(((jeq0) state).a);
            return;
        }
        if (!(state instanceof eeq0)) {
            if (jl40.l(state, feq0.a)) {
                cancelPayment();
                return;
            } else {
                if (state instanceof heq0) {
                    ybq0 ybq0Var9 = this.callbacks;
                    heq0 heq0Var = (heq0) state;
                    ((zbq0) (ybq0Var9 != null ? ybq0Var9 : null)).S(getUserTypedEmail(), heq0Var.a, heq0Var.b);
                    return;
                }
                return;
            }
        }
        getActivityViewModel().X();
        if (this.showFooterOnSelectOnly) {
            ybq0 ybq0Var10 = this.callbacks;
            if (ybq0Var10 == null) {
                ybq0Var10 = null;
            }
            ((zbq0) ybq0Var10).p(false);
        }
        ybq0 ybq0Var11 = this.callbacks;
        if (ybq0Var11 == null) {
            ybq0Var11 = null;
        }
        ((zbq0) ybq0Var11).f();
        ybq0 ybq0Var12 = this.callbacks;
        ((zbq0) (ybq0Var12 != null ? ybq0Var12 : null)).q(((eeq0) state).a);
    }

    private final void setupPayButtonWithSum() {
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        vw90.D(ybq0Var, getString(ryh0.paymentsdk_pay_title), this.formattedSum, 4);
    }

    private final void showWebView(String url) {
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        ((zbq0) ybq0Var).j(url);
    }

    private final void updatePayment(uv90 payment) {
        wga0 wga0Var = (wga0) payment;
        this.formattedSum = mta1.d(requireContext(), wga0Var.g(), getEventReporter());
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        zbq0 zbq0Var = (zbq0) ybq0Var;
        zbq0Var.B = wga0Var;
        xry0 xry0Var = yry0.a;
        yry0.a.getClass();
        if (zbq0Var.B == null) {
            zbq0Var.p(false);
        }
    }

    private final void updatePersonalInfo() {
        if (this.personalInfoVisibility.shouldShowAnything()) {
            ybq0 ybq0Var = this.callbacks;
            if (ybq0Var == null) {
                ybq0Var = null;
            }
            ((zbq0) ybq0Var).A = getBinding().e.getPersonalInfo();
        }
    }

    public final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    @Override // defpackage.ucq0
    public void onChangeCvn(int position, boolean isValid, rnf cvnInput) {
        this.mediator.onChangeCvn(position, isValid, cvnInput);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        if (((zbq0) ybq0Var).C) {
            return;
        }
        this.preferredMethod = (PaymentMethod) requireArguments().getParcelable(ARG_PREFERRED_METHOD);
        PersonalInfoVisibility personalInfoVisibility = (PersonalInfoVisibility) requireArguments().getParcelable(ARG_PERSONAL_INFO_VISIBILITY);
        if (personalInfoVisibility != null) {
            this.personalInfoVisibility = personalInfoVisibility;
        }
        ybq0 ybq0Var2 = this.callbacks;
        if (ybq0Var2 == null) {
            ybq0Var2 = null;
        }
        oy90 H = ((zbq0) ybq0Var2).H();
        ybq0 ybq0Var3 = this.callbacks;
        if (ybq0Var3 == null) {
            ybq0Var3 = null;
        }
        vv90 k = ((zbq0) ybq0Var3).k();
        PaymentMethod paymentMethod = this.preferredMethod;
        ybq0 ybq0Var4 = this.callbacks;
        if (ybq0Var4 == null) {
            ybq0Var4 = null;
        }
        NewCard I = ((zbq0) ybq0Var4).I();
        ybq0 ybq0Var5 = this.callbacks;
        if (ybq0Var5 == null) {
            ybq0Var5 = null;
        }
        String email = ((zbq0) ybq0Var5).A.getEmail();
        ybq0 ybq0Var6 = this.callbacks;
        if (ybq0Var6 == null) {
            ybq0Var6 = null;
        }
        this.viewModel = (afq0) new ls31(this, new fve0(H, k, paymentMethod, I, email, ((pwf) ((zbq0) ybq0Var6).b).e().isAuthorized(), getEventReporter())).b(afq0.class);
        TypedValue c = iob1.c(requireContext().getTheme(), lng0.paymentsdk_paymentCellElements);
        if (c == null) {
            ny61.g("No integer for passed attribute");
            return;
        }
        int i = c.data;
        if (i >= SelectPaymentAdapter$AdapterMode.values().length) {
            ny61.g("Wrong enum value for AdapterMode");
            return;
        }
        SelectPaymentAdapter$AdapterMode selectPaymentAdapter$AdapterMode = SelectPaymentAdapter$AdapterMode.values()[i];
        this.isLightTheme = iob1.d(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        cvy0 cvy0Var = ckt.a;
        xcq0 xcq0Var = new xcq0(this, new dn60(ckt.a(requireContext()), 11, (byte) 0), this.isLightTheme, selectPaymentAdapter$AdapterMode, getEventReporter());
        this.adapter = xcq0Var;
        xcq0Var.C = debrandingEnabled();
        xcq0 xcq0Var2 = this.adapter;
        (xcq0Var2 != null ? xcq0Var2 : null).setHasStableIds(true);
        this.showFooterOnSelectOnly = iob1.d(requireActivity().getTheme(), ong0.paymentsdk_showFooterOnSelectOnly, false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vpa0 o = vpa0.o(inflater, container);
        setCurrentBinding(o);
        return o.a;
    }

    @Override // com.yandex.payment.sdk.ui.ViewBindingFragmentImpl, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        if (!((zbq0) ybq0Var).C) {
            LinearLayout linearLayout = getBinding().a;
            View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
            if (onLayoutChangeListener == null) {
                onLayoutChangeListener = null;
            }
            linearLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
            kcq0 kcq0Var = this.mediator;
            kcq0Var.x = EmptyList.a;
            kcq0Var.a = null;
            kcq0Var.b = null;
            kcq0Var.c = null;
            kcq0Var.w = null;
        }
        super.onDestroyView();
    }

    @Override // defpackage.ucq0
    public void onSelectPaymentMethod(int position) {
        getBinding().g.smoothScrollToPosition(position);
        this.mediator.onSelectPaymentMethod(position);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        if (((zbq0) ybq0Var).C) {
            return;
        }
        getBinding().f.setExitButtonCallback(new SelectFragment$onViewCreated$1(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        int i = 1;
        getBinding().b.setCloseButton(true, new SelectFragment$onViewCreated$2(0, getActivityViewModel(), bqr0.class, "showConfirmDialog", "showConfirmDialog()V", 0));
        int i2 = 0;
        int i3 = 2;
        HeaderView.setBackButton$default(getBinding().b, false, null, 2, null);
        getBinding().b.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        int i4 = 5;
        if (this.personalInfoVisibility.shouldShowAnything()) {
            getBinding().b.setTitleText(null);
            getBinding().d.setVisibility(0);
            getBinding().d.setText(ryh0.paymentsdk_personal_label);
            getBinding().e.setVisibility(0);
            getBinding().e.setCallback(new wbq0(this, i2));
            getBinding().e.onEmailFocusChanged(new vbq0(this, i4));
            PersonalInfoView personalInfoView = getBinding().e;
            ybq0 ybq0Var2 = this.callbacks;
            if (ybq0Var2 == null) {
                ybq0Var2 = null;
            }
            personalInfoView.setValidators(egb1.a(((pwf) ((zbq0) ybq0Var2).b).a().getCardValidationConfig()));
            getBinding().e.setPersonalInfoVisibility(this.personalInfoVisibility);
            PersonalInfoView personalInfoView2 = getBinding().e;
            ybq0 ybq0Var3 = this.callbacks;
            if (ybq0Var3 == null) {
                ybq0Var3 = null;
            }
            personalInfoView2.setPersonalInfo(((zbq0) ybq0Var3).A);
            getBinding().c.setVisibility(0);
            TextView textView = getBinding().c;
            xry0 xry0Var = yry0.a;
            textView.setText(yry0.a.a);
        } else {
            HeaderView headerView = getBinding().b;
            xry0 xry0Var2 = yry0.a;
            yry0.a.getClass();
            headerView.setTitleTextString(view.getContext().getString(yry0.a.a));
            getBinding().d.setVisibility(8);
            getBinding().e.setVisibility(8);
            getBinding().c.setVisibility(8);
        }
        RecyclerView recyclerView = getBinding().g;
        xcq0 xcq0Var = this.adapter;
        if (xcq0Var == null) {
            xcq0Var = null;
        }
        recyclerView.setAdapter(xcq0Var);
        getBinding().g.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().g.setHasFixedSize(true);
        this.layoutChangeListener = new FixupOnLayoutChangeListener(getBinding().a);
        LinearLayout linearLayout = getBinding().a;
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
        if (onLayoutChangeListener == null) {
            onLayoutChangeListener = null;
        }
        linearLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        getBinding().f.setCloseCallback(new wbq0(this, i));
        getBinding().f.setBrandIconVisible(!debrandingEnabled());
        ybq0 ybq0Var4 = this.callbacks;
        if (ybq0Var4 == null) {
            ybq0Var4 = null;
        }
        ((zbq0) ybq0Var4).B(new wbq0(this, i3));
        ybq0 ybq0Var5 = this.callbacks;
        if (ybq0Var5 == null) {
            ybq0Var5 = null;
        }
        ((zbq0) ybq0Var5).p(true);
        ybq0 ybq0Var6 = this.callbacks;
        if (ybq0Var6 == null) {
            ybq0Var6 = null;
        }
        ((zbq0) ybq0Var6).getClass();
        yry0.a.getClass();
        afq0 afq0Var = this.viewModel;
        if (afq0Var == null) {
            afq0Var = null;
        }
        ybq0 ybq0Var7 = this.callbacks;
        wga0 wga0Var = ((zbq0) (ybq0Var7 != null ? ybq0Var7 : null)).B;
        kcq0 kcq0Var = this.mediator;
        afq0Var.getClass();
        kcq0Var.c = new weq0(afq0Var, i);
        kcq0Var.b = new qgn0(13, afq0Var);
        kcq0Var.a = new zeq0(afq0Var);
        afq0Var.I = kcq0Var;
        if (wga0Var == null) {
            afq0Var.D.l(new geq0(false, false));
            afq0Var.E.l(v27.a);
            oy90 oy90Var = afq0Var.b;
            ((yv90) oy90Var.d).i(oy90Var.b, oy90Var.c, new oy80(i4, oy90Var, new pgk0(19, afq0Var)));
        } else {
            afq0Var.G = wga0Var;
            afq0Var.W(wga0Var);
        }
        observeChanges();
    }

    public final void setSelectCallbacks$paymentsdk_release(ybq0 callbacks) {
        this.callbacks = callbacks;
    }

    private final void showWebView(String url, List<? extends fi11> trustedUrls) {
        ybq0 ybq0Var = this.callbacks;
        if (ybq0Var == null) {
            ybq0Var = null;
        }
        ((zbq0) ybq0Var).d(url, trustedUrls);
    }
}
