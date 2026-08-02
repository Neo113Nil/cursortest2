package com.yandex.payment.divkit.sbp;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.usecases.k;
import com.yandex.payment.divkit.usecases.t;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.a6v;
import defpackage.asw;
import defpackage.auf;
import defpackage.b55;
import defpackage.bhm0;
import defpackage.bw;
import defpackage.cf4;
import defpackage.cma1;
import defpackage.cpa0;
import defpackage.cuf;
import defpackage.dcq0;
import defpackage.dle;
import defpackage.ds31;
import defpackage.duf;
import defpackage.dzf;
import defpackage.dzj;
import defpackage.eez0;
import defpackage.ehm0;
import defpackage.eja1;
import defpackage.es31;
import defpackage.euf;
import defpackage.evu0;
import defpackage.fhm0;
import defpackage.fme0;
import defpackage.fq4;
import defpackage.fuf;
import defpackage.ghm0;
import defpackage.gkk;
import defpackage.gme0;
import defpackage.grj0;
import defpackage.guf;
import defpackage.hrj0;
import defpackage.hu31;
import defpackage.huf;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.i891;
import defpackage.igm0;
import defpackage.iu31;
import defpackage.iuf;
import defpackage.j9h0;
import defpackage.jgm0;
import defpackage.jl40;
import defpackage.juf;
import defpackage.kgm0;
import defpackage.kuf;
import defpackage.l9h0;
import defpackage.m93;
import defpackage.mxe0;
import defpackage.n891;
import defpackage.ncq0;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.ong0;
import defpackage.oy90;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.q6k;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.tc5;
import defpackage.tem0;
import defpackage.tje;
import defpackage.tjk;
import defpackage.u131;
import defpackage.u2l;
import defpackage.uf4;
import defpackage.ulh0;
import defpackage.upk0;
import defpackage.vv90;
import defpackage.vyj0;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wsf;
import defpackage.xc5;
import defpackage.xsf;
import defpackage.xtf;
import defpackage.xvf0;
import defpackage.xw41;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y8f;
import defpackage.ybf;
import defpackage.ytf;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zmk;
import defpackage.zry0;
import defpackage.ztf;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002:rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bP\u0010Q\u0012\u0004\bV\u0010\u0005\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010+\u001a\u0004\bY\u0010ZR\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR(\u0010g\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bg\u0010h\u0012\u0004\bm\u0010\u0005\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/yandex/payment/divkit/sbp/DKSbpFragment;", "Landroidx/fragment/app/Fragment;", "Ljgm0;", "Lcf4;", "<init>", "()V", "Ligm0;", "callbacks", "Lzy11;", "setCallback", "(Ligm0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "", "onBackPressed", "()Z", "observeChanges", "Lguf;", Constants.KEY_DATA, "openBankApp", "(Lguf;)V", "Lkuf;", ClidProvider.STATE, "setScreenState", "(Lkuf;)Lzy11;", "setupContainersViews", "Ligm0;", "Lcpa0;", "_binding", "Lcpa0;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lgrj0;", "resIdProvider$delegate", "getResIdProvider", "()Lgrj0;", "resIdProvider", "Lcom/yandex/div/core/view2/Div2View;", "banksDivView", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/core/Div2Context;", "divContext", "Lcom/yandex/div/core/Div2Context;", "Lauf;", "viewModelFactory", "Lauf;", "getViewModelFactory", "()Lauf;", "setViewModelFactory", "(Lauf;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lnx;", "actionFlowObservable", "Lnx;", "getActionFlowObservable", "()Lnx;", "setActionFlowObservable", "(Lnx;)V", "getActionFlowObservable$annotations", "Lcom/yandex/payment/divkit/sbp/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/payment/divkit/sbp/a;", "viewModel", "Lkgm0;", "sbpDivKitConfiguration", "Lkgm0;", "getSbpDivKitConfiguration", "()Lkgm0;", "setSbpDivKitConfiguration", "(Lkgm0;)V", "Lcom/yandex/payment/divkit/sbp/DKSbpSearchBankLayout;", "input", "Lcom/yandex/payment/divkit/sbp/DKSbpSearchBankLayout;", "Lhu31;", "viewReadyObservable", "Lhu31;", "getViewReadyObservable", "()Lhu31;", "setViewReadyObservable", "(Lhu31;)V", "getViewReadyObservable$annotations", "getBinding", "()Lcpa0;", "binding", "Companion", "ztf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKSbpFragment extends Fragment implements jgm0, cf4 {
    private static final String ARG_CAN_GO_BACK = "ARG_CAN_GO_BACK";
    private static final String ARG_EMAIL = "ARG_EMAIL";
    private static final String ARG_SBP_OPERATION = "ARG_BIND_SBP_TOKEN";
    private static final String ARG_SELECTED_BANK_SCHEME = "ARG_SELECTED_BANK_SCHEME";
    public static final ztf Companion = new ztf();
    private static final String IS_LIGHT_THEME = "isLightTheme";
    private cpa0 _binding;
    public nx actionFlowObservable;
    private Div2View banksDivView;
    private igm0 callbacks;
    private Div2Context divContext;
    public rwo eventReporter;
    private DKSbpSearchBankLayout input;
    public u2l parsingEnvironment;
    public kgm0 sbpDivKitConfiguration;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public auf viewModelFactory;
    public hu31 viewReadyObservable;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = kotlin.a.a(new ytf(this, 1));

    /* renamed from: resIdProvider$delegate, reason: from kotlin metadata */
    private final i3y resIdProvider = kotlin.a.a(new ytf(this, 2));

    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.payment.divkit.sbp.DKSbpFragment$special$$inlined$viewModels$default$1] */
    public DKSbpFragment() {
        ytf ytfVar = new ytf(this, 3);
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.sbp.DKSbpFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.sbp.DKSbpFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.payment.divkit.sbp.DKSbpFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, ytfVar, new sls() { // from class: com.yandex.payment.divkit.sbp.DKSbpFragment$special$$inlined$viewModels$default$4
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
    public static final tc5 activityViewModel_delegate$lambda$0(DKSbpFragment dKSbpFragment) {
        igm0 igm0Var = dKSbpFragment.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        return ((zbq0) igm0Var).a();
    }

    public static /* synthetic */ void getActionFlowObservable$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    private final cpa0 getBinding() {
        cpa0 cpa0Var = this._binding;
        if (cpa0Var != null) {
            return cpa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final grj0 getResIdProvider() {
        return (grj0) this.resIdProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    public static /* synthetic */ void getViewReadyObservable$annotations() {
    }

    private final void observeChanges() {
        getViewModel().D.f(getViewLifecycleOwner(), new dle(3, new xtf(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeChanges$lambda$0(DKSbpFragment dKSbpFragment, kuf kufVar) {
        dKSbpFragment.setScreenState(kufVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(DKSbpFragment dKSbpFragment, View view) {
        if (view instanceof DKSbpSearchBankLayout) {
            DKSbpSearchBankLayout dKSbpSearchBankLayout = (DKSbpSearchBankLayout) view;
            dKSbpFragment.input = dKSbpSearchBankLayout;
            dKSbpSearchBankLayout.requestInputFocus();
            dKSbpSearchBankLayout.setOnTextChangeListener(new xtf(dKSbpFragment, 0));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zy11 onViewCreated$lambda$0$0(DKSbpFragment dKSbpFragment, String str) {
        String str2;
        RecyclerView recyclerView;
        Object obj;
        a viewModel = dKSbpFragment.getViewModel();
        viewModel.getClass();
        boolean J = evu0.J(str);
        List list = viewModel.E;
        String str3 = "";
        if (J) {
            fq4 fq4Var = (fq4) kotlin.collections.a.b0(list);
            str2 = fq4Var != null ? fq4Var.a : null;
        } else {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (evu0.y(((fq4) obj).a, str, true)) {
                    break;
                }
            }
            fq4 fq4Var2 = (fq4) obj;
            str2 = fq4Var2 != null ? fq4Var2.a : null;
        }
        Div2View div2View = dKSbpFragment.banksDivView;
        if (div2View != null) {
            div2View.setVariable("select_bank_screen_last_bank_name", str3);
        }
        Div2View div2View2 = dKSbpFragment.banksDivView;
        if (div2View2 != null) {
            div2View2.setVariable("select_bank_screen_bank_name_filter", str);
        }
        Div2View div2View3 = dKSbpFragment.banksDivView;
        if (div2View3 != null && (recyclerView = (RecyclerView) div2View3.findViewById(l9h0.banks_recycler_view)) != null) {
            recyclerView.scrollToPosition(0);
        }
        return zy11.a;
    }

    private final void openBankApp(guf data) {
        igm0 igm0Var = this.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        Intent intent = data.a;
        String str = data.b;
        boolean R = ((zbq0) igm0Var).R(intent);
        if (R) {
            rwo eventReporter = getEventReporter();
            sv90 sv90Var = qv90.a;
            String str2 = data.c;
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.g0(str, str2));
        } else {
            rwo eventReporter2 = getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter2).a(sv90.n0(str));
        }
        a viewModel = getViewModel();
        hrj0 hrj0Var = viewModel.A;
        if (R) {
            hrj0Var.getClass();
            viewModel.b0(new fuf(ryh0.paymentsdk_sbp_payment_waiting_title, 4));
            viewModel.c0();
        } else {
            if (viewModel.x instanceof SbpOperation.BindSbpToken) {
                return;
            }
            PaymentKitError.Companion.getClass();
            PaymentKitError paymentKitError = new PaymentKitError(PaymentKitError.Kind.startBankError, PaymentKitError.Trigger.nspk, null, null, "Error starting bank app", null);
            hrj0Var.getClass();
            viewModel.b0(new euf(paymentKitError, ryh0.paymentsdk_sbp_payment_bank_not_open_title, ryh0.paymentsdk_sbp_payment_bank_not_open_description, true));
            ((yv90) viewModel.b.b).j.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final grj0 resIdProvider_delegate$lambda$0(DKSbpFragment dKSbpFragment) {
        igm0 igm0Var = dKSbpFragment.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        ((zbq0) igm0Var).getClass();
        return new hrj0();
    }

    private final zy11 setScreenState(kuf state) {
        getBinding();
        n891.b(getBinding().a, (ViewGroup) requireView().getRootView().findViewById(l9h0.mainContainer));
        return setupContainersViews(state);
    }

    private final zy11 setupContainersViews(kuf state) {
        com.yandex.div.core.expression.variables.a divVariableController;
        TextRes.IntRes intRes;
        TextRes.IntRes intRes2;
        Integer num;
        cpa0 binding = getBinding();
        boolean z = state instanceof fuf;
        int i = 0;
        zy11 zy11Var = zy11.a;
        Div2View div2View = null;
        if (z) {
            a viewModel = getViewModel();
            rwo rwoVar = viewModel.B;
            sv90 sv90Var = qv90.a;
            String str = viewModel.H;
            if (str == null) {
                str = "";
            }
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.r0(str));
            xsf xsfVar = new xsf();
            fuf fufVar = (fuf) state;
            boolean z2 = fufVar.b;
            TextRes.IntRes intRes3 = new TextRes.IntRes(fufVar.a);
            TextRes.IntRes intRes4 = (!z2 || (num = fufVar.c) == null) ? null : new TextRes.IntRes(num.intValue());
            if (z2) {
                ((hrj0) getResIdProvider()).getClass();
                intRes2 = new TextRes.IntRes(ryh0.paymentsdk_sbp_open_payment);
            } else {
                intRes2 = null;
            }
            DKResultFragment c = xsfVar.c(true, false, intRes3, intRes4, intRes2, ResultScreenIdentifier.SbpPaymentLoading.INSTANCE);
            vyj0.h(c, null, new DKSbpFragment$setupContainersViews$1$2$1(0, getViewModel(), a.class, "retryOpenBankApp", "retryOpenBankApp()V", 0), new ytf(this, i), 1);
            igm0 igm0Var = this.callbacks;
            ((zbq0) (igm0Var != null ? igm0Var : null)).Q(c);
            return zy11Var;
        }
        if (state instanceof euf) {
            xsf xsfVar2 = new xsf();
            euf eufVar = (euf) state;
            PaymentKitError paymentKitError = eufVar.a;
            boolean z3 = eufVar.d;
            TextRes.IntRes intRes5 = new TextRes.IntRes(eufVar.b);
            if (z3) {
                ((hrj0) getResIdProvider()).getClass();
                intRes = new TextRes.IntRes(ryh0.paymentsdk_sbp_another_bank);
            } else {
                ((hrj0) getResIdProvider()).getClass();
                intRes = new TextRes.IntRes(ryh0.paymentsdk_close);
            }
            DKResultFragment a = wsf.a(xsfVar2, intRes5, intRes, new TextRes.IntRes(eufVar.c), null, -1L, new ResultScreenIdentifier.SbpFailure(paymentKitError));
            vyj0.h(a, new DKSbpFragment$setupContainersViews$1$3$1(0, getViewModel(), a.class, "chooseAnotherBank", "chooseAnotherBank()V", 0), new DKSbpFragment$setupContainersViews$1$3$2(0, getViewModel(), a.class, "retryOpenBankApp", "retryOpenBankApp()V", 0), null, 4);
            if (z3) {
                igm0 igm0Var2 = this.callbacks;
                ((zbq0) (igm0Var2 != null ? igm0Var2 : null)).Q(a);
                return zy11Var;
            }
            if (paymentKitError == null) {
                return null;
            }
            igm0 igm0Var3 = this.callbacks;
            ((zbq0) (igm0Var3 != null ? igm0Var3 : null)).N(paymentKitError);
            return zy11Var;
        }
        if (!(state instanceof duf)) {
            if (state instanceof juf) {
                ((xc5) getActivityViewModel()).X();
                igm0 igm0Var4 = this.callbacks;
                ((zbq0) (igm0Var4 != null ? igm0Var4 : null)).r(((juf) state).a);
                return zy11Var;
            }
            if (state instanceof guf) {
                openBankApp((guf) state);
                return zy11Var;
            }
            if (state instanceof iuf) {
                igm0 igm0Var5 = this.callbacks;
                ((zbq0) (igm0Var5 != null ? igm0Var5 : null)).L();
                return zy11Var;
            }
            if (state instanceof cuf) {
                igm0 igm0Var6 = this.callbacks;
                igm0 igm0Var7 = igm0Var6 != null ? igm0Var6 : null;
                cuf cufVar = (cuf) state;
                ((zbq0) igm0Var7).M(cufVar.a, cufVar.b);
                return zy11Var;
            }
            if (!jl40.l(state, huf.a)) {
                w511.b();
                return null;
            }
            igm0 igm0Var8 = this.callbacks;
            igm0 igm0Var9 = igm0Var8 == null ? null : igm0Var8;
            TextRes.IntRes intRes6 = new TextRes.IntRes(((zbq0) (igm0Var8 != null ? igm0Var8 : null)).J().b);
            zbq0 zbq0Var = (zbq0) igm0Var9;
            zbq0Var.getClass();
            DKResultFragment c2 = new xsf().c(false, true, intRes6, null, null, ResultScreenIdentifier.SelectMethodScreenLoading.INSTANCE);
            BaseActivity baseActivity = zbq0Var.a;
            baseActivity.replaceFragment$paymentsdk_release(c2, false, j9h0.loading_fragment_container);
            baseActivity.showLoading$paymentsdk_release();
            return zy11Var;
        }
        igm0 igm0Var10 = this.callbacks;
        if (igm0Var10 == null) {
            igm0Var10 = null;
        }
        ((zbq0) igm0Var10).L();
        kgm0 sbpDivKitConfiguration = getSbpDivKitConfiguration();
        pey viewLifecycleOwner = getViewLifecycleOwner();
        igm0 igm0Var11 = this.callbacks;
        if (igm0Var11 == null) {
            igm0Var11 = null;
        }
        boolean s = ((zbq0) igm0Var11).s();
        sbpDivKitConfiguration.getClass();
        new gkk();
        FragmentActivity fragmentActivity = sbpDivKitConfiguration.b;
        Context context = sbpDivKitConfiguration.a;
        tjk tjkVar = new tjk(new dcq0(context, s));
        tjkVar.b = (q6k) sbpDivKitConfiguration.f.getValue();
        tjkVar.b(new a6v());
        tjkVar.b(new xw41());
        tjkVar.e = new bhm0(sbpDivKitConfiguration.d);
        tjkVar.b(new mxe0());
        tjkVar.j = sbpDivKitConfiguration.e;
        int i2 = 3;
        tjkVar.h = new dzj(context, i2);
        tjkVar.p = true;
        tjkVar.q = false;
        this.divContext = new Div2Context(fragmentActivity, tjkVar.a(), 0, viewLifecycleOwner, 4, null);
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        Div2Context div2Context = this.divContext;
        if (div2Context != null && (divVariableController = div2Context.getDivVariableController()) != null) {
            divVariableController.i(new u131(IS_LIGHT_THEME, h));
        }
        duf dufVar = (duf) state;
        omk omkVar = dufVar.a.a;
        Div2Context div2Context2 = this.divContext;
        if (div2Context2 != null) {
            Div2View div2View2 = new Div2View(div2Context2, null, 0, 6, null);
            div2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            div2View2.setData(omkVar, new zmk(div2View2.getLogId()));
            div2View2.setId(View.generateViewId());
            div2View = div2View2;
        }
        this.banksDivView = div2View;
        binding.b.addView(div2View);
        Div2View div2View3 = this.banksDivView;
        if (div2View3 != null) {
            div2View3.post(new uf4(dufVar, this, h, i2));
        }
        rwo eventReporter = getEventReporter();
        sv90 sv90Var2 = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.DK_SELECT_BANK;
        sv90Var2.getClass();
        ((y22) eventReporter).a(sv90.w0(psdkScreen));
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupContainersViews$lambda$0$1$0(DKSbpFragment dKSbpFragment) {
        tem0 tem0Var = dKSbpFragment.getViewModel().C;
        tem0Var.b.invoke();
        tem0Var.a = false;
        igm0 igm0Var = dKSbpFragment.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        ((zbq0) igm0Var).L();
        a viewModel = dKSbpFragment.getViewModel();
        pzt0 pzt0Var = viewModel.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((eez0) viewModel.F.getValue()).b("INFO_TIMER_TAG");
        viewModel.N = null;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupContainersViews$lambda$0$4(kuf kufVar, DKSbpFragment dKSbpFragment, boolean z) {
        for (Pair pair : ((duf) kufVar).a.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKSbpFragment.banksDivView;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
        Div2View div2View2 = dKSbpFragment.banksDivView;
        if (div2View2 != null) {
            div2View2.setVariable(IS_LIGHT_THEME, String.valueOf(z));
        }
    }

    public final nx getActionFlowObservable() {
        nx nxVar = this.actionFlowObservable;
        if (nxVar != null) {
            return nxVar;
        }
        return null;
    }

    public final rwo getEventReporter() {
        rwo rwoVar = this.eventReporter;
        if (rwoVar != null) {
            return rwoVar;
        }
        return null;
    }

    public final u2l getParsingEnvironment() {
        u2l u2lVar = this.parsingEnvironment;
        if (u2lVar != null) {
            return u2lVar;
        }
        return null;
    }

    public final kgm0 getSbpDivKitConfiguration() {
        kgm0 kgm0Var = this.sbpDivKitConfiguration;
        if (kgm0Var != null) {
            return kgm0Var;
        }
        return null;
    }

    public final auf getViewModelFactory() {
        auf aufVar = this.viewModelFactory;
        if (aufVar != null) {
            return aufVar;
        }
        return null;
    }

    public final hu31 getViewReadyObservable() {
        hu31 hu31Var = this.viewReadyObservable;
        if (hu31Var != null) {
            return hu31Var;
        }
        return null;
    }

    @Override // defpackage.cf4
    public boolean onBackPressed() {
        return getViewModel().G;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String string = requireArguments().getString(ARG_EMAIL);
        Parcelable parcelable = requireArguments().getParcelable(ARG_SBP_OPERATION);
        if (parcelable == null) {
            ny61.r("Required value was null.");
            return null;
        }
        SbpOperation sbpOperation = (SbpOperation) parcelable;
        String string2 = requireArguments().getString(ARG_SELECTED_BANK_SCHEME);
        igm0 igm0Var = this.callbacks;
        if (igm0Var == null) {
            igm0Var = null;
        }
        xxk xxkVar = (xxk) ((zbq0) igm0Var).b(this, xxk.class);
        igm0 igm0Var2 = this.callbacks;
        if (igm0Var2 == null) {
            igm0Var2 = null;
        }
        oy90 H = ((zbq0) igm0Var2).H();
        igm0 igm0Var3 = this.callbacks;
        if (igm0Var3 == null) {
            igm0Var3 = null;
        }
        vv90 k = ((zbq0) igm0Var3).k();
        FragmentActivity requireActivity = requireActivity();
        igm0 igm0Var4 = this.callbacks;
        if (igm0Var4 == null) {
            igm0Var4 = null;
        }
        ((zbq0) igm0Var4).getClass();
        hrj0 hrj0Var = new hrj0();
        H.getClass();
        k.getClass();
        ehm0 ehm0Var = new ehm0();
        new ncq0();
        new gme0();
        xvf0 b = i5m.b(new b55(29, ehm0Var));
        xvf0 b2 = i5m.b(new b55(28, ehm0Var));
        xvf0 b3 = i5m.b(new upk0(ehm0Var, b2, 18));
        xvf0 b4 = i5m.b(new upk0(ehm0Var, b2, 19));
        xvf0 b5 = i5m.b(new fhm0(0, ehm0Var));
        xvf0 b6 = i5m.b(new upk0(ehm0Var, b5, 21));
        xvf0 b7 = i5m.b(new upk0(ehm0Var, b5, 20));
        dzf dzfVar = (dzf) xxkVar;
        Application application = dzfVar.a;
        Context applicationContext = application.getApplicationContext();
        t tVar = new t(H, k, applicationContext.getSharedPreferences(fme0.b(applicationContext), 0), (tem0) b.get());
        rwo rwoVar = dzfVar.g;
        k kVar = new k(new m93(application.getApplicationContext()), dzfVar.e(), new com.yandex.payment.divkit.common.a(new com.yandex.payment.divkit.repository.a(dzfVar.d(), rwoVar), rwoVar));
        Context applicationContext2 = application.getApplicationContext();
        this.viewModelFactory = new auf(rwoVar, hrj0Var, (tem0) b.get(), applicationContext2.getSharedPreferences(fme0.b(applicationContext2), 0), sbpOperation, kVar, tVar, string, string2);
        u2l c = dzfVar.c();
        q5z.h(c);
        this.parsingEnvironment = c;
        this.eventReporter = rwoVar;
        this.actionFlowObservable = (nx) b3.get();
        this.sbpDivKitConfiguration = new kgm0(application.getApplicationContext(), requireActivity, (bw) b4.get(), (iu31) b6.get());
        this.viewReadyObservable = (hu31) b7.get();
        View inflate = inflater.inflate(ulh0.paymentsdk_divkit_fragment_sbp, container, false);
        int i = l9h0.divContainer;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = l9h0.fullscreenView;
            if (((LinearLayout) cma1.O(i, inflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this._binding = new cpa0(constraintLayout, linearLayout);
                return constraintLayout;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.input = null;
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle savedInstanceState) {
        boolean z;
        igm0 igm0Var;
        boolean z2;
        super.onViewCreated(view, savedInstanceState);
        igm0 igm0Var2 = this.callbacks;
        if (igm0Var2 == null) {
            igm0Var2 = null;
        }
        if (((zbq0) igm0Var2).C) {
            return;
        }
        a viewModel = getViewModel();
        igm0 igm0Var3 = this.callbacks;
        if (igm0Var3 == null) {
            igm0Var3 = null;
        }
        zry0 J = ((zbq0) igm0Var3).J();
        igm0 igm0Var4 = this.callbacks;
        if (igm0Var4 == null) {
            igm0Var4 = null;
        }
        ((zbq0) igm0Var4).getClass();
        ghm0 ghm0Var = new ghm0();
        u2l parsingEnvironment = getParsingEnvironment();
        igm0 igm0Var5 = this.callbacks;
        if (igm0Var5 == null) {
            igm0Var5 = null;
        }
        vv90 k = ((zbq0) igm0Var5).k();
        igm0 igm0Var6 = this.callbacks;
        if (igm0Var6 == null) {
            igm0Var6 = null;
        }
        boolean s = ((zbq0) igm0Var6).s();
        viewModel.K = J;
        viewModel.M = ghm0Var;
        viewModel.L = parsingEnvironment;
        int i = 1;
        if (!s) {
            SbpOperation sbpOperation = viewModel.x;
            if ((sbpOperation instanceof SbpOperation.BindSbpToken) || (sbpOperation instanceof SbpOperation.NewTokenPay)) {
                z2 = true;
            } else {
                asw aswVar = k instanceof asw ? (asw) k : null;
                z2 = n891.o(aswVar != null ? Boolean.valueOf(((yv90) aswVar).d()) : null);
            }
            if (z2) {
                z = true;
                viewModel.O = z;
                viewModel.b0(huf.a);
                tje.N(ds31.a(viewModel), null, null, new DKSbpViewModel$loadListBanks$1(viewModel, null), 3);
                viewModel.C.b = new ybf(6, viewModel);
                igm0Var = this.callbacks;
                if (igm0Var == null) {
                    igm0Var = null;
                }
                ((zbq0) igm0Var).n(false);
                observeChanges();
                ((iu31) getViewReadyObservable()).a = new xtf(this, i);
                tje.N(eja1.s(this), null, null, new DKSbpFragment$onViewCreated$2(this, null), 3);
            }
        }
        z = false;
        viewModel.O = z;
        viewModel.b0(huf.a);
        tje.N(ds31.a(viewModel), null, null, new DKSbpViewModel$loadListBanks$1(viewModel, null), 3);
        viewModel.C.b = new ybf(6, viewModel);
        igm0Var = this.callbacks;
        if (igm0Var == null) {
        }
        ((zbq0) igm0Var).n(false);
        observeChanges();
        ((iu31) getViewReadyObservable()).a = new xtf(this, i);
        tje.N(eja1.s(this), null, null, new DKSbpFragment$onViewCreated$2(this, null), 3);
    }

    public final void setActionFlowObservable(nx nxVar) {
        this.actionFlowObservable = nxVar;
    }

    @Override // defpackage.jgm0
    public void setCallback(igm0 callbacks) {
        this.callbacks = callbacks;
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setSbpDivKitConfiguration(kgm0 kgm0Var) {
        this.sbpDivKitConfiguration = kgm0Var;
    }

    public final void setViewModelFactory(auf aufVar) {
        this.viewModelFactory = aufVar;
    }

    public final void setViewReadyObservable(hu31 hu31Var) {
        this.viewReadyObservable = hu31Var;
    }
}
