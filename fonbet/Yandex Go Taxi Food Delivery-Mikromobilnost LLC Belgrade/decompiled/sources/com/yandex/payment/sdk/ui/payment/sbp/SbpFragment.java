package com.yandex.payment.sdk.ui.payment.sbp;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.apa1;
import defpackage.bk;
import defpackage.bqr0;
import defpackage.cma1;
import defpackage.cof;
import defpackage.dhm0;
import defpackage.djm0;
import defpackage.dna;
import defpackage.dpb1;
import defpackage.eaj0;
import defpackage.eez0;
import defpackage.ejm0;
import defpackage.es31;
import defpackage.exg0;
import defpackage.fjm0;
import defpackage.fme0;
import defpackage.gjm0;
import defpackage.hgm0;
import defpackage.hjm0;
import defpackage.i3y;
import defpackage.igm0;
import defpackage.iho;
import defpackage.ijm0;
import defpackage.iob1;
import defpackage.j9h0;
import defpackage.jgm0;
import defpackage.jjm0;
import defpackage.kjm0;
import defpackage.lgm0;
import defpackage.ljm0;
import defpackage.lng0;
import defpackage.ls31;
import defpackage.n891;
import defpackage.ngm0;
import defpackage.ny61;
import defpackage.ogm0;
import defpackage.ong0;
import defpackage.p7u;
import defpackage.pgm0;
import defpackage.phd;
import defpackage.pwf;
import defpackage.px6;
import defpackage.qgm0;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rgm0;
import defpackage.rlh0;
import defpackage.rm;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sgm0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.tgm0;
import defpackage.vfc;
import defpackage.vv90;
import defpackage.w511;
import defpackage.wy4;
import defpackage.y22;
import defpackage.y891;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.ywg0;
import defpackage.zbq0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002JKB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0005J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\b2\u0006\u0010\"\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/sbp/SbpFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Ltgm0;", "Ljgm0;", "<init>", "()V", "Ligm0;", "callbacks", "Lzy11;", "setCallback", "(Ligm0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initLayouts", "initHeader", "()Lzy11;", "", "debrandingEnabled", "()Z", "initErrorLayout", "initLoadingLayout", "initBankListLayout", "observeChanges", "Lljm0;", ClidProvider.STATE, "setScreenState", "(Lljm0;)V", "", "setupContainersViews", "(Lljm0;)Ljava/lang/Object;", "Lijm0;", "Ldhm0;", "handleLoadingState", "(Lijm0;)Ldhm0;", "Lhjm0;", "Lngm0;", "handleErrorState", "(Lhjm0;)Lngm0;", "Lfjm0;", "handleBankListState", "(Lfjm0;)V", "Lejm0;", Constants.KEY_DATA, "openBank", "(Lejm0;)V", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Lcom/yandex/payment/sdk/ui/payment/sbp/d;", "viewModel", "Lcom/yandex/payment/sdk/ui/payment/sbp/d;", "Ligm0;", "Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter;", "banksAdapter", "Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter;", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "Companion", "sgm0", "rgm0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SbpFragment extends ViewBindingFragmentImpl<tgm0> implements jgm0 {
    private static final String ARG_CAN_GO_BACK = "ARG_CAN_GO_BACK";
    private static final String ARG_EMAIL = "ARG_EMAIL";
    private static final String ARG_SBP_OPERATION = "ARG_BIND_SBP_TOKEN";
    private static final String ARG_SELECTED_BANK_SCHEME = "ARG_SELECTED_BANK_SCHEME";
    public static final rgm0 Companion = new rgm0();
    private BankAppsAdapter banksAdapter;
    private igm0 callbacks;
    private d viewModel;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.sbp.SbpFragment$special$$inlined$activityViewModels$default$1
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.sbp.SbpFragment$special$$inlined$activityViewModels$default$3
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
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.sbp.SbpFragment$special$$inlined$activityViewModels$default$2
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
    private final i3y eventReporter = kotlin.a.a(new qgm0(this, 0));

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rwo eventReporter_delegate$lambda$0(SbpFragment sbpFragment) {
        return ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(sbpFragment)).componentDispatcher()).b(wy4.class))).c();
    }

    private final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rwo getEventReporter() {
        return (rwo) this.eventReporter.getValue();
    }

    private final void handleBankListState(fjm0 state) {
        EditText editText;
        hgm0 o = getBinding().o();
        TextInputLayout n = o.n();
        boolean z = state.c;
        n.setVisibility(!z ? 0 : 8);
        o.a().setVisibility(z ? 8 : 0);
        if (!z && (editText = o.n().getEditText()) != null) {
            editText.setText((CharSequence) null);
        }
        if (state.b) {
            igm0 igm0Var = this.callbacks;
            if (igm0Var == null) {
                igm0Var = null;
            }
            zbq0 zbq0Var = (zbq0) igm0Var;
            TextView textView = (TextView) zbq0Var.w.invoke();
            String string = textView.getContext().getString(ryh0.paymentsdk_license_agreement_preview_on_terms);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) textView.getContext().getString(ryh0.paymentsdk_license_agreement_preview_yb));
            spannableStringBuilder.append((CharSequence) " ");
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(string.subSequence(0, string.length()));
            spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
            textView.setText(spannableStringBuilder);
            textView.setOnClickListener(new eaj0(11, zbq0Var));
            zbq0Var.p(!zbq0Var.s());
        }
        BankAppsAdapter bankAppsAdapter = this.banksAdapter;
        (bankAppsAdapter != null ? bankAppsAdapter : null).setData(state.a, z);
    }

    private final ngm0 handleErrorState(hjm0 state) {
        ngm0 p = getBinding().p();
        if (state.a.getKind() == PaymentKitError.Kind.startBankError) {
            ImageView m = p.m();
            TypedValue c = iob1.c(p.m().getContext().getTheme(), ong0.paymentsdk_warning_icon);
            m.setImageResource(c != null ? c.resourceId : ywg0.paymentsdk_ic_warning_light);
            p.j().setText(state.b);
            p.l().setText(state.c);
            return p;
        }
        PaymentKitError paymentKitError = state.a;
        igm0 igm0Var = this.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        ((zbq0) igm0Var).N(paymentKitError);
        return p;
    }

    private final dhm0 handleLoadingState(ijm0 state) {
        dhm0 q = getBinding().q();
        TextView d = q.d();
        boolean z = state.b;
        d.setVisibility(z ? 0 : 8);
        q.h().setBackgroundResource(z ? exg0.paymentsdk_bg_enabled_button : exg0.paymentsdk_bg_disabled_button);
        TypedValue c = iob1.c(requireContext().getTheme(), z ? ong0.paymentsdk_alternativePrimaryTextColor : R.attr.textColorPrimary);
        if (c == null) {
            ny61.g("No integer for passed attribute");
            return null;
        }
        q.h().setTextColor(c.data);
        n891.c(q.a(), state.c);
        q.b().setText(state.a);
        return q;
    }

    private final void initBankListLayout() {
        hgm0 o = getBinding().o();
        ImageView i = o.i();
        int i2 = 0;
        int i3 = 1;
        if (i != null) {
            i.setVisibility(getParentFragmentManager().K() > 1 ? 0 : 8);
        }
        ImageView i4 = o.i();
        if (i4 != null) {
            i4.setOnClickListener(new pgm0(this, i2));
        }
        BankAppsAdapter bankAppsAdapter = new BankAppsAdapter(getEventReporter());
        bankAppsAdapter.setHasStableIds(true);
        d dVar = this.viewModel;
        bankAppsAdapter.setOnMoreButtonClickListener(new SbpFragment$initBankListLayout$1$2$1(0, dVar == null ? null : dVar, d.class, "onShowFullListClick", "onShowFullListClick()V", 0));
        d dVar2 = this.viewModel;
        bankAppsAdapter.setOnBankClickListener(new SbpFragment$initBankListLayout$1$2$2(2, dVar2 == null ? null : dVar2, d.class, "onBankClick", "onBankClick(Ljava/lang/String;I)V", 0));
        this.banksAdapter = bankAppsAdapter;
        RecyclerView f = o.f();
        f.setLayoutManager(new LinearLayoutManager(f.getContext()));
        f.setHasFixedSize(true);
        BankAppsAdapter bankAppsAdapter2 = this.banksAdapter;
        f.setAdapter(bankAppsAdapter2 != null ? bankAppsAdapter2 : null);
        final EditText editText = o.n().getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.payment.sbp.SbpFragment$initBankListLayout$lambda$0$3$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    BankAppsAdapter bankAppsAdapter3;
                    rwo eventReporter;
                    bankAppsAdapter3 = SbpFragment.this.banksAdapter;
                    if (bankAppsAdapter3 == null) {
                        bankAppsAdapter3 = null;
                    }
                    bankAppsAdapter3.getFilter().filter(s);
                    sv90 sv90Var = qv90.a;
                    String valueOf = String.valueOf(s);
                    sv90Var.getClass();
                    iho c = editText.hasFocus() ? y891.c("sbp_other_bank_list-bank_search-input", vfc.i(0, "input", valueOf, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Введенное значение в поиске банков: ".concat(valueOf))) : null;
                    if (c != null) {
                        eventReporter = SbpFragment.this.getEventReporter();
                        ((y22) eventReporter).a(c);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
            editText.setOnFocusChangeListener(new bk(25, this));
        }
        o.c().setOnClickListener(new pgm0(this, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBankListLayout$lambda$0$0(SbpFragment sbpFragment, View view) {
        sbpFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBankListLayout$lambda$0$3$1(SbpFragment sbpFragment, View view, boolean z) {
        if (z) {
            ((y22) sbpFragment.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь нажал на поиск в списке банков СБП", "sbp_tap_on_search"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBankListLayout$lambda$0$4(SbpFragment sbpFragment, View view) {
        d dVar = sbpFragment.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        BankAppsAdapter bankAppsAdapter = sbpFragment.banksAdapter;
        dVar.Y(n891.q((bankAppsAdapter != null ? bankAppsAdapter : null).getSelectedIndex()));
    }

    private final void initErrorLayout() {
        ngm0 p = getBinding().p();
        p.g().setOnClickListener(new pgm0(this, 5));
        p.k().setOnClickListener(new pgm0(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initErrorLayout$lambda$0$0(SbpFragment sbpFragment, View view) {
        d dVar = sbpFragment.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        dVar.getClass();
        dVar.a0(new ijm0(0));
        ((eez0) dVar.E.getValue()).c(3L, new djm0(dVar, 1));
        ejm0 ejm0Var = dVar.H;
        if (ejm0Var != null) {
            dVar.C.m(ejm0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initErrorLayout$lambda$0$1(SbpFragment sbpFragment, View view) {
        d dVar = sbpFragment.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b0();
    }

    private final zy11 initHeader() {
        HeaderView headerView;
        ImageView imageView;
        tgm0 binding = getBinding();
        switch (binding.a) {
            case 0:
                headerView = (HeaderView) binding.c;
                break;
            default:
                headerView = null;
                break;
        }
        int i = 1;
        if (headerView != null) {
            headerView.setCloseButton(true, new qgm0(this, i));
        }
        tgm0 binding2 = getBinding();
        switch (binding2.a) {
            case 0:
                imageView = null;
                break;
            default:
                imageView = (ImageView) binding2.g;
                break;
        }
        if (imageView != null) {
            imageView.setOnClickListener(new pgm0(this, 4));
        }
        if (headerView != null) {
            headerView.setTitleText(null);
        }
        View view = getView();
        if (view == null || headerView == null) {
            return null;
        }
        headerView.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initHeader$lambda$0$0(SbpFragment sbpFragment) {
        sbpFragment.getActivityViewModel().L();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHeader$lambda$0$1(SbpFragment sbpFragment, View view) {
        sbpFragment.getActivityViewModel().L();
    }

    private final void initLayouts() {
        initHeader();
        initBankListLayout();
        initLoadingLayout();
        initErrorLayout();
    }

    private final void initLoadingLayout() {
        dhm0 q = getBinding().q();
        ProgressBar e = q.e();
        int i = 2;
        int i2 = 3;
        e.getViewTreeObserver().addOnGlobalLayoutListener(new phd(i2, e, new ogm0(this, i)));
        q.h().setOnClickListener(new pgm0(this, i));
        q.d().setOnClickListener(new pgm0(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initLoadingLayout$lambda$0$0(SbpFragment sbpFragment, View view) {
        if (view.getVisibility() == 0) {
            d dVar = sbpFragment.viewModel;
            if (dVar == null) {
                dVar = null;
            }
            rwo rwoVar = dVar.A;
            sv90 sv90Var = qv90.a;
            String str = dVar.G;
            if (str == null) {
                str = "";
            }
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.r0(str));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLoadingLayout$lambda$0$1(SbpFragment sbpFragment, View view) {
        d dVar = sbpFragment.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLoadingLayout$lambda$0$2(SbpFragment sbpFragment, View view) {
        d dVar = sbpFragment.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        dVar.getClass();
        dVar.a0(new ijm0(0));
        ((eez0) dVar.E.getValue()).c(3L, new djm0(dVar, 1));
        ejm0 ejm0Var = dVar.H;
        if (ejm0Var != null) {
            dVar.C.m(ejm0Var);
        }
    }

    private final void observeChanges() {
        d dVar = this.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        int i = 10;
        dVar.B.f(getViewLifecycleOwner(), new cof(i, new ogm0(this, 0)));
        d dVar2 = this.viewModel;
        (dVar2 != null ? dVar2 : null).C.f(getViewLifecycleOwner(), new cof(i, new ogm0(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$0(SbpFragment sbpFragment, ljm0 ljm0Var) {
        sbpFragment.setScreenState(ljm0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$1(SbpFragment sbpFragment, ejm0 ejm0Var) {
        sbpFragment.openBank(ejm0Var);
        return zy11.a;
    }

    private final void openBank(ejm0 data) {
        igm0 igm0Var = this.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        Intent intent = data.a;
        String str = data.c;
        boolean R = ((zbq0) igm0Var).R(intent);
        if (R) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            String str2 = data.b;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.g0(str, str2));
        } else {
            rwo eventReporter2 = getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter2).a(sv90.n0(str));
        }
        d dVar = this.viewModel;
        d dVar2 = dVar != null ? dVar : null;
        dVar2.getClass();
        if (R) {
            dVar2.a0(new ijm0(ryh0.paymentsdk_sbp_payment_waiting_title, Integer.valueOf(ryh0.paymentsdk_sbp_waiting_info), true));
            ((eez0) dVar2.E.getValue()).c(5L, new djm0(dVar2, 0));
        } else {
            PaymentKitError.Companion.getClass();
            dVar2.a0(new hjm0(new PaymentKitError(PaymentKitError.Kind.startBankError, PaymentKitError.Trigger.nspk, null, null, "Error starting bank app", null), ryh0.paymentsdk_sbp_payment_bank_not_open_title, ryh0.paymentsdk_sbp_payment_bank_not_open_description));
        }
    }

    private final void setScreenState(ljm0 state) {
        lgm0 lgm0Var;
        tgm0 binding = getBinding();
        setupContainersViews(state);
        switch (binding.a) {
            case 0:
                lgm0Var = (lgm0) binding.g;
                break;
            default:
                lgm0Var = (lgm0) binding.f;
                break;
        }
        lgm0Var.getRoot().setVisibility(state instanceof jjm0 ? 0 : 8);
        binding.q().getRoot().setVisibility(state instanceof ijm0 ? 0 : 8);
        binding.o().getRoot().setVisibility(state instanceof fjm0 ? 0 : 8);
        binding.p().getRoot().setVisibility(state instanceof hjm0 ? 0 : 8);
        n891.b((ViewGroup) getBinding().getRoot(), (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
    }

    private final Object setupContainersViews(ljm0 state) {
        getBinding();
        if (state instanceof ijm0) {
            return handleLoadingState((ijm0) state);
        }
        if (state instanceof hjm0) {
            return handleErrorState((hjm0) state);
        }
        boolean z = state instanceof fjm0;
        zy11 zy11Var = zy11.a;
        if (z) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            PsdkScreen psdkScreen = PsdkScreen.SELECT_BANK;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.w0(psdkScreen));
            handleBankListState((fjm0) state);
            return zy11Var;
        }
        if (state instanceof kjm0) {
            getActivityViewModel().X();
            igm0 igm0Var = this.callbacks;
            ((zbq0) (igm0Var != null ? igm0Var : null)).r(((kjm0) state).a);
            return zy11Var;
        }
        if (state instanceof gjm0) {
            igm0 igm0Var2 = this.callbacks;
            gjm0 gjm0Var = (gjm0) state;
            ((zbq0) (igm0Var2 != null ? igm0Var2 : null)).M(gjm0Var.a, gjm0Var.b);
            return zy11Var;
        }
        if (state instanceof jjm0) {
            return zy11Var;
        }
        w511.b();
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tgm0 tgm0Var;
        View O;
        View O2;
        View O3;
        View O4;
        if (!apa1.e(FeatureFlag.FULLSCREEN_FLAG)) {
            View inflate = inflater.inflate(rlh0.paymentsdk_fragment_sbp, container, false);
            int i = j9h0.brand_icon;
            if (((ImageView) cma1.O(i, inflate)) != null && (O = cma1.O((i = j9h0.chooseBankContainer), inflate)) != null) {
                int i2 = j9h0.banks_list_recycler_view;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i2, O);
                if (recyclerView != null) {
                    i2 = j9h0.field;
                    if (((TextInputEditText) cma1.O(i2, O)) != null) {
                        i2 = j9h0.infoCard;
                        TextView textView = (TextView) cma1.O(i2, O);
                        if (textView != null) {
                            i2 = j9h0.pay_text;
                            TextView textView2 = (TextView) cma1.O(i2, O);
                            if (textView2 != null) {
                                LinearLayout linearLayout = (LinearLayout) O;
                                i2 = j9h0.search_input_layout;
                                TextInputLayout textInputLayout = (TextInputLayout) cma1.O(i2, O);
                                if (textInputLayout != null) {
                                    dna dnaVar = new dna(linearLayout, recyclerView, textView, textView2, textInputLayout, 5);
                                    i = j9h0.close_button;
                                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                                    if (imageView != null && (O2 = cma1.O((i = j9h0.emptyLoadingContainer), inflate)) != null) {
                                        int i3 = j9h0.loadingTitle;
                                        if (((TextView) cma1.O(i3, O2)) != null) {
                                            i3 = j9h0.progressBar;
                                            if (((ProgressBar) cma1.O(i3, O2)) != null) {
                                                px6 px6Var = new px6((LinearLayout) O2, 3);
                                                int i4 = j9h0.errorContainer;
                                                View O5 = cma1.O(i4, inflate);
                                                if (O5 != null) {
                                                    int i5 = j9h0.errorButtonsContainer;
                                                    if (((LinearLayout) cma1.O(i5, O5)) != null) {
                                                        i5 = j9h0.errorChooseBankButton;
                                                        TextView textView3 = (TextView) cma1.O(i5, O5);
                                                        if (textView3 != null) {
                                                            i5 = j9h0.errorCloseButton;
                                                            if (((TextView) cma1.O(i5, O5)) != null) {
                                                                i5 = j9h0.errorDescription;
                                                                TextView textView4 = (TextView) cma1.O(i5, O5);
                                                                if (textView4 != null) {
                                                                    i5 = j9h0.errorImageView;
                                                                    ImageView imageView2 = (ImageView) cma1.O(i5, O5);
                                                                    if (imageView2 != null) {
                                                                        i5 = j9h0.errorRetryOpenBankButton;
                                                                        TextView textView5 = (TextView) cma1.O(i5, O5);
                                                                        if (textView5 != null) {
                                                                            i5 = j9h0.errorTitle;
                                                                            TextView textView6 = (TextView) cma1.O(i5, O5);
                                                                            if (textView6 != null) {
                                                                                i5 = j9h0.exitButtonContainer;
                                                                                if (((LinearLayout) cma1.O(i5, O5)) != null) {
                                                                                    rm rmVar = new rm((LinearLayout) O5, textView3, textView4, imageView2, textView5, textView6, 7);
                                                                                    i4 = j9h0.headerLayout;
                                                                                    if (((ConstraintLayout) cma1.O(i4, inflate)) != null && (O3 = cma1.O((i4 = j9h0.loadingContainer), inflate)) != null) {
                                                                                        int i6 = j9h0.chooseBankButton;
                                                                                        TextView textView7 = (TextView) cma1.O(i6, O3);
                                                                                        if (textView7 != null) {
                                                                                            i6 = j9h0.infoCard;
                                                                                            TextView textView8 = (TextView) cma1.O(i6, O3);
                                                                                            if (textView8 != null) {
                                                                                                i6 = j9h0.loadingTitle;
                                                                                                TextView textView9 = (TextView) cma1.O(i6, O3);
                                                                                                if (textView9 != null) {
                                                                                                    i6 = j9h0.openPaymentButton;
                                                                                                    TextView textView10 = (TextView) cma1.O(i6, O3);
                                                                                                    if (textView10 != null) {
                                                                                                        i6 = j9h0.progressBar;
                                                                                                        ProgressBar progressBar = (ProgressBar) cma1.O(i6, O3);
                                                                                                        if (progressBar != null) {
                                                                                                            rm rmVar2 = new rm((LinearLayout) O3, textView7, textView8, textView9, textView10, progressBar, 9);
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) inflate;
                                                                                                            i4 = j9h0.stateContainer;
                                                                                                            if (((LinearLayout) cma1.O(i4, inflate)) != null) {
                                                                                                                tgm0Var = new tgm0(new rm(linearLayout2, dnaVar, imageView, px6Var, rmVar, rmVar2, 4), (byte) 0);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i6)));
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ny61.t("Missing required view with ID: ".concat(O5.getResources().getResourceName(i5)));
                                                    return null;
                                                }
                                                i = i4;
                                            }
                                        }
                                        ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i3)));
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                return null;
            }
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            return null;
        }
        View inflate2 = inflater.inflate(rlh0.paymentsdk_fragment_sbp_full, container, false);
        int i7 = j9h0.chooseBankContainer;
        View O6 = cma1.O(i7, inflate2);
        if (O6 != null) {
            int i8 = j9h0.bank_choose_back_button;
            ImageView imageView3 = (ImageView) cma1.O(i8, O6);
            if (imageView3 != null) {
                i8 = j9h0.banks_list_recycler_view;
                RecyclerView recyclerView2 = (RecyclerView) cma1.O(i8, O6);
                if (recyclerView2 != null) {
                    i8 = j9h0.button_container_layout;
                    if (((LinearLayout) cma1.O(i8, O6)) != null) {
                        i8 = j9h0.field;
                        if (((TextInputEditText) cma1.O(i8, O6)) != null) {
                            i8 = j9h0.infoCard;
                            TextView textView11 = (TextView) cma1.O(i8, O6);
                            if (textView11 != null) {
                                i8 = j9h0.pay_text;
                                TextView textView12 = (TextView) cma1.O(i8, O6);
                                if (textView12 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) O6;
                                    i8 = j9h0.search_input_layout;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) cma1.O(i8, O6);
                                    if (textInputLayout2 != null) {
                                        i8 = j9h0.title_bank_choose_text;
                                        if (((TextView) cma1.O(i8, O6)) != null) {
                                            rm rmVar3 = new rm(constraintLayout, imageView3, recyclerView2, textView11, textView12, textInputLayout2, 6);
                                            i7 = j9h0.emptyLoadingContainer;
                                            View O7 = cma1.O(i7, inflate2);
                                            if (O7 != null) {
                                                int i9 = j9h0.loadingTitle;
                                                if (((TextView) cma1.O(i9, O7)) != null) {
                                                    i9 = j9h0.progressBar;
                                                    if (((ProgressBar) cma1.O(i9, O7)) != null) {
                                                        px6 px6Var2 = new px6((LinearLayout) O7, 4);
                                                        int i10 = j9h0.errorContainer;
                                                        View O8 = cma1.O(i10, inflate2);
                                                        if (O8 != null) {
                                                            int i11 = j9h0.errorChooseBankButton;
                                                            TextView textView13 = (TextView) cma1.O(i11, O8);
                                                            if (textView13 != null) {
                                                                i11 = j9h0.errorDescription;
                                                                TextView textView14 = (TextView) cma1.O(i11, O8);
                                                                if (textView14 != null) {
                                                                    i11 = j9h0.errorImageView;
                                                                    ImageView imageView4 = (ImageView) cma1.O(i11, O8);
                                                                    if (imageView4 != null) {
                                                                        i11 = j9h0.errorRetryOpenBankButton;
                                                                        TextView textView15 = (TextView) cma1.O(i11, O8);
                                                                        if (textView15 != null) {
                                                                            i11 = j9h0.errorTitle;
                                                                            TextView textView16 = (TextView) cma1.O(i11, O8);
                                                                            if (textView16 != null) {
                                                                                rm rmVar4 = new rm((ConstraintLayout) O8, textView13, textView14, imageView4, textView15, textView16, 8);
                                                                                i10 = j9h0.header_view;
                                                                                HeaderView headerView = (HeaderView) cma1.O(i10, inflate2);
                                                                                if (headerView != null && (O4 = cma1.O((i10 = j9h0.loadingContainer), inflate2)) != null) {
                                                                                    int i12 = j9h0.chooseBankButton;
                                                                                    TextView textView17 = (TextView) cma1.O(i12, O4);
                                                                                    if (textView17 != null) {
                                                                                        i12 = j9h0.infoCard;
                                                                                        TextView textView18 = (TextView) cma1.O(i12, O4);
                                                                                        if (textView18 != null) {
                                                                                            i12 = j9h0.loadingTitle;
                                                                                            TextView textView19 = (TextView) cma1.O(i12, O4);
                                                                                            if (textView19 != null) {
                                                                                                i12 = j9h0.openPaymentButton;
                                                                                                TextView textView20 = (TextView) cma1.O(i12, O4);
                                                                                                if (textView20 != null) {
                                                                                                    i12 = j9h0.progressBar;
                                                                                                    ProgressBar progressBar2 = (ProgressBar) cma1.O(i12, O4);
                                                                                                    if (progressBar2 != null) {
                                                                                                        rm rmVar5 = new rm((ConstraintLayout) O4, textView17, textView18, textView19, textView20, progressBar2, 10);
                                                                                                        LinearLayout linearLayout3 = (LinearLayout) inflate2;
                                                                                                        i10 = j9h0.stateContainer;
                                                                                                        if (((LinearLayout) cma1.O(i10, inflate2)) != null) {
                                                                                                            tgm0Var = new tgm0(new rm(linearLayout3, rmVar3, px6Var2, rmVar4, headerView, rmVar5, 5));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ny61.t("Missing required view with ID: ".concat(O4.getResources().getResourceName(i12)));
                                                                                    return null;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            ny61.t("Missing required view with ID: ".concat(O8.getResources().getResourceName(i11)));
                                                            return null;
                                                        }
                                                        i7 = i10;
                                                    }
                                                }
                                                ny61.t("Missing required view with ID: ".concat(O7.getResources().getResourceName(i9)));
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O6.getResources().getResourceName(i8)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i7)));
        return null;
        setCurrentBinding(tgm0Var);
        return tgm0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        igm0 igm0Var = this.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        if (((zbq0) igm0Var).C) {
            return;
        }
        String string = requireArguments().getString(ARG_EMAIL);
        Parcelable parcelable = requireArguments().getParcelable(ARG_SBP_OPERATION);
        if (parcelable == null) {
            ny61.r("Required value was null.");
            return;
        }
        SbpOperation sbpOperation = (SbpOperation) parcelable;
        String string2 = requireArguments().getString(ARG_SELECTED_BANK_SCHEME);
        igm0 igm0Var2 = this.callbacks;
        if (igm0Var2 == null) {
            igm0Var2 = null;
        }
        vv90 k = ((zbq0) igm0Var2).k();
        igm0 igm0Var3 = this.callbacks;
        if (igm0Var3 == null) {
            igm0Var3 = null;
        }
        d dVar = (d) new ls31(this, new sgm0(k, ((zbq0) igm0Var3).H(), string, sbpOperation, fme0.a(requireContext()), string2, getEventReporter())).b(d.class);
        this.viewModel = dVar;
        rwo rwoVar = dVar.A;
        sv90 sv90Var = qv90.a;
        String str = dVar.G;
        if (str == null) {
            str = "";
        }
        sv90Var.getClass();
        ((y22) rwoVar).a(y891.c("sbp_waiting_payment-close_button-shown", vfc.i(0, "selected_bank", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отображение кнопки Закрыть на экране ожидания ответа от банка ".concat(str))));
        igm0 igm0Var4 = this.callbacks;
        ((zbq0) (igm0Var4 != null ? igm0Var4 : null)).n(false);
        initLayouts();
        observeChanges();
    }

    @Override // defpackage.jgm0
    public void setCallback(igm0 callbacks) {
        this.callbacks = callbacks;
    }
}
