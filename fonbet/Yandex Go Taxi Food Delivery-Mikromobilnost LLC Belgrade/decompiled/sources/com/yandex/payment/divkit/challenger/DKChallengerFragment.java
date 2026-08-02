package com.yandex.payment.divkit.challenger;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.usecases.e;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.common.c;
import defpackage.a99;
import defpackage.as31;
import defpackage.cnk;
import defpackage.cof;
import defpackage.csf;
import defpackage.dke;
import defpackage.ds31;
import defpackage.dsf;
import defpackage.dye;
import defpackage.dzf;
import defpackage.eja1;
import defpackage.es31;
import defpackage.esf;
import defpackage.evu0;
import defpackage.f89;
import defpackage.fsf;
import defpackage.g99;
import defpackage.gpa0;
import defpackage.h12;
import defpackage.hsf;
import defpackage.hu31;
import defpackage.hyj0;
import defpackage.i3y;
import defpackage.i891;
import defpackage.isf;
import defpackage.iu31;
import defpackage.j9f;
import defpackage.jl40;
import defpackage.jsf;
import defpackage.ksf;
import defpackage.kyj0;
import defpackage.lsf;
import defpackage.m93;
import defpackage.msf;
import defpackage.ncq0;
import defpackage.nsf;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.ong0;
import defpackage.osf;
import defpackage.psf;
import defpackage.pwf;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qsf;
import defpackage.qv90;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.tc5;
import defpackage.tje;
import defpackage.u131;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.vv90;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wsf;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y8f;
import defpackage.yry0;
import defpackage.z89;
import defpackage.zbq0;
import defpackage.zmk;
import defpackage.zrf;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\bD\u0010ER\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010#\u001a\u0004\bW\u0010XR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006f"}, d2 = {"Lcom/yandex/payment/divkit/challenger/DKChallengerFragment;", "Landroidx/fragment/app/Fragment;", "La99;", "<init>", "()V", "Lz89;", "callbacks", "Lzy11;", "setCallback", "(Lz89;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "observeDivActions", "Landroid/content/Intent;", "intent", "", "tryOpenBankApp", "(Landroid/content/Intent;)Z", "Lcnk;", "divData", "observeDivData", "(Lcnk;)V", "Lz89;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Lgpa0;", "_binding", "Lgpa0;", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lqsf;", "viewModelFactory", "Lqsf;", "getViewModelFactory", "()Lqsf;", "setViewModelFactory", "(Lqsf;)V", "Lpsf;", "viewModel$delegate", "getViewModel", "()Lpsf;", "viewModel", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "Lhu31;", "viewReadyObservable", "Lhu31;", "getViewReadyObservable", "()Lhu31;", "setViewReadyObservable", "(Lhu31;)V", "getBinding", "()Lgpa0;", "binding", "Companion", "zrf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKChallengerFragment extends Fragment implements a99 {
    public static final zrf Companion = new zrf();
    private static final String EXTRA_CHALLENGE_INFO_DATA = "CHALLENGE_INFO_DATA";
    private static final String EXTRA_SBP_TOKEN_DATA = "SBP_TOKEN_DATA";
    private static final String OPEN_BANK_APP_ACTION = "bank_open";
    private static final String RESEND_SMS_ACTION = "resend_sms";
    private static final String SCREEN_STATE_VARIABLE = "challenger_screen_currentState";
    private gpa0 _binding;
    public nx actionFlowReceiver;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private z89 callbacks;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    public rwo eventReporter;
    public u2l parsingEnvironment;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public qsf viewModelFactory;
    public hu31 viewReadyObservable;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.payment.divkit.challenger.DKChallengerFragment$special$$inlined$viewModels$default$1] */
    public DKChallengerFragment() {
        final int i = 0;
        this.activityViewModel = a.a(new sls(this) { // from class: yrf
            public final /* synthetic */ DKChallengerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i2 = i;
                DKChallengerFragment dKChallengerFragment = this.b;
                switch (i2) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKChallengerFragment.activityViewModel_delegate$lambda$0(dKChallengerFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKChallengerFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKChallengerFragment.divContext_delegate$lambda$0(dKChallengerFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: yrf
            public final /* synthetic */ DKChallengerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i22 = i2;
                DKChallengerFragment dKChallengerFragment = this.b;
                switch (i22) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKChallengerFragment.activityViewModel_delegate$lambda$0(dKChallengerFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKChallengerFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKChallengerFragment.divContext_delegate$lambda$0(dKChallengerFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        };
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.challenger.DKChallengerFragment$special$$inlined$viewModels$default$1
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
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.challenger.DKChallengerFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(psf.class), new sls() { // from class: com.yandex.payment.divkit.challenger.DKChallengerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.payment.divkit.challenger.DKChallengerFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar2 = this.$extrasProducer;
                if (slsVar2 != null && (y8fVar = (y8f) slsVar2.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
        final int i3 = 2;
        this.divContext = a.a(new sls(this) { // from class: yrf
            public final /* synthetic */ DKChallengerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i22 = i3;
                DKChallengerFragment dKChallengerFragment = this.b;
                switch (i22) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKChallengerFragment.activityViewModel_delegate$lambda$0(dKChallengerFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKChallengerFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKChallengerFragment.divContext_delegate$lambda$0(dKChallengerFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc5 activityViewModel_delegate$lambda$0(DKChallengerFragment dKChallengerFragment) {
        z89 z89Var = dKChallengerFragment.callbacks;
        if (z89Var == null) {
            z89Var = null;
        }
        return ((zbq0) z89Var).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKChallengerFragment dKChallengerFragment) {
        return new Div2Context(dKChallengerFragment.requireActivity(), dKChallengerFragment.getDivConfiguration(), 0, dKChallengerFragment.getViewLifecycleOwner(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    private final gpa0 getBinding() {
        gpa0 gpa0Var = this._binding;
        if (gpa0Var != null) {
            return gpa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final psf getViewModel() {
        return (psf) this.viewModel.getValue();
    }

    private final void observeDivActions() {
        tje.N(eja1.s(this), null, null, new DKChallengerFragment$observeDivActions$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeDivData(cnk divData) {
        Div2View div2View = this.div2View;
        if (div2View == null || !jl40.l(div2View.getParent(), getBinding().b)) {
            Div2View div2View2 = new Div2View(getDivContext(), null, 0, 6, null);
            div2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            div2View2.setId(View.generateViewId());
            this.div2View = div2View2;
        }
        if (getBinding().b.getChildCount() == 0) {
            getBinding().b.addView(this.div2View);
        }
        Div2View div2View3 = this.div2View;
        if (div2View3 != null) {
            omk omkVar = divData.a;
            div2View3.setData(omkVar, new zmk(omkVar.b));
        }
        Div2View div2View4 = this.div2View;
        if (div2View4 != null) {
            div2View4.post(new j9f(11, divData, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(cnk cnkVar, DKChallengerFragment dKChallengerFragment) {
        for (Pair pair : cnkVar.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKChallengerFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$0(Ref$ObjectRef ref$ObjectRef, fsf fsfVar, DKChallengerFragment dKChallengerFragment, View view) {
        T t = 0;
        DKChallengerInputView dKChallengerInputView = view instanceof DKChallengerInputView ? (DKChallengerInputView) view : null;
        if (dKChallengerInputView != null) {
            dKChallengerInputView.setConfig(fsfVar, new DKChallengerFragment$onViewCreated$3$1$1(1, dKChallengerFragment.getViewModel(), psf.class, "verifyCode", "verifyCode(Ljava/lang/String;)V", 0));
            t = dKChallengerInputView;
        }
        ref$ObjectRef.element = t;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$1(Ref$ObjectRef ref$ObjectRef, SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus) {
        DKChallengerInputView dKChallengerInputView;
        if (!sbpChallengeResultInfo$SbpChallengeStatus.a() && (dKChallengerInputView = (DKChallengerInputView) ref$ObjectRef.element) != null) {
            dKChallengerInputView.showIncorrectAppearance();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$2(DKChallengerFragment dKChallengerFragment, Ref$ObjectRef ref$ObjectRef, osf osfVar) {
        if (osfVar instanceof msf) {
            z89 z89Var = dKChallengerFragment.callbacks;
            if (z89Var == null) {
                z89Var = null;
            }
            msf msfVar = (msf) osfVar;
            zbq0 zbq0Var = (zbq0) z89Var;
            BaseActivity.replaceFragment$paymentsdk_release$default(zbq0Var.a, wsf.a(new xsf(), new TextRes.IntRes(msfVar.a), new TextRes.IntRes(ryh0.paymentsdk_login_done), new TextRes.IntRes(msfVar.b), null, ((pwf) zbq0Var.b).a().getResultScreenClosing().getDelayToAutoHide(), new ResultScreenIdentifier.PspChallengeFailure(null)), false, 0, 6, null);
        } else if (osfVar instanceof nsf) {
            DKChallengerInputView dKChallengerInputView = (DKChallengerInputView) ref$ObjectRef.element;
            if (dKChallengerInputView != null) {
                dKChallengerInputView.showSuccess();
            }
            z89 z89Var2 = dKChallengerFragment.callbacks;
            if (z89Var2 == null) {
                z89Var2 = null;
            }
            zbq0 zbq0Var2 = (zbq0) z89Var2;
            BaseActivity baseActivity = zbq0Var2.a;
            xry0 xry0Var = yry0.a;
            baseActivity.applyProcessResultSuccess$paymentsdk_release(new c(zbq0Var2, new kyj0(Integer.valueOf(yry0.a.c)), null));
        } else if (osfVar instanceof lsf) {
            z89 z89Var3 = dKChallengerFragment.callbacks;
            if (z89Var3 == null) {
                z89Var3 = null;
            }
            PaymentKitError paymentKitError = ((lsf) osfVar).a;
            zbq0 zbq0Var3 = (zbq0) z89Var3;
            zbq0Var3.a.applyProcessResultError$paymentsdk_release(paymentKitError, new c(zbq0Var3, new hyj0(paymentKitError), null));
        } else {
            if (!(osfVar instanceof ksf)) {
                w511.b();
                return null;
            }
            z89 z89Var4 = dKChallengerFragment.callbacks;
            if (z89Var4 == null) {
                z89Var4 = null;
            }
            ((zbq0) z89Var4).z(new TextRes.IntRes(((ksf) osfVar).a), null);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(DKChallengerFragment dKChallengerFragment, jsf jsfVar) {
        Div2View div2View = dKChallengerFragment.div2View;
        if (div2View != null) {
            div2View.setVariable(SCREEN_STATE_VARIABLE, jsfVar.a);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryOpenBankApp(Intent intent) {
        try {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return true;
            }
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final nx getActionFlowReceiver() {
        nx nxVar = this.actionFlowReceiver;
        if (nxVar != null) {
            return nxVar;
        }
        return null;
    }

    public final ujk getDivConfiguration() {
        ujk ujkVar = this.divConfiguration;
        if (ujkVar != null) {
            return ujkVar;
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

    public final qsf getViewModelFactory() {
        qsf qsfVar = this.viewModelFactory;
        if (qsfVar != null) {
            return qsfVar;
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        z89 z89Var = this.callbacks;
        if (z89Var == null) {
            z89Var = null;
        }
        xxk xxkVar = (xxk) ((zbq0) z89Var).b(this, xxk.class);
        requireActivity();
        requireActivity().getApplicationContext();
        requireActivity().getApplication();
        z89 z89Var2 = this.callbacks;
        if (z89Var2 == null) {
            z89Var2 = null;
        }
        ((zbq0) z89Var2).getClass();
        g99 g99Var = new g99();
        z89 z89Var3 = this.callbacks;
        if (z89Var3 == null) {
            z89Var3 = null;
        }
        vv90 k = ((zbq0) z89Var3).k();
        k.getClass();
        new as31();
        new ncq0();
        dzf dzfVar = (dzf) xxkVar;
        rwo rwoVar = dzfVar.g;
        nx a = dzfVar.a();
        q5z.h(a);
        this.actionFlowReceiver = a;
        this.eventReporter = rwoVar;
        this.viewModelFactory = new qsf(new e(new m93(dzfVar.a.getApplicationContext()), dzfVar.e(), g99Var, new com.yandex.payment.divkit.common.a(new com.yandex.payment.divkit.repository.a(dzfVar.d(), rwoVar), rwoVar)), rwoVar, g99Var, k);
        ujk b = dzfVar.b();
        q5z.h(b);
        this.divConfiguration = b;
        u2l c = dzfVar.c();
        q5z.h(c);
        this.parsingEnvironment = c;
        hu31 hu31Var = (hu31) dzfVar.v.get();
        q5z.h(hu31Var);
        this.viewReadyObservable = hu31Var;
        View inflate = inflater.inflate(ulh0.paymentsdk_dk_challenger_fragment, container, false);
        if (inflate == null) {
            ny61.t("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this._binding = new gpa0(linearLayout, linearLayout);
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Object obj;
        super.onViewCreated(view, savedInstanceState);
        Parcelable parcelable = requireArguments().getParcelable("CHALLENGE_INFO_DATA");
        if (parcelable == null) {
            ny61.g("Required value was null.");
            return;
        }
        SbpChallengeInfo sbpChallengeInfo = (SbpChallengeInfo) parcelable;
        Parcelable parcelable2 = requireArguments().getParcelable("SBP_TOKEN_DATA");
        if (parcelable2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        PaymentMethod.SbpToken sbpToken = (PaymentMethod.SbpToken) parcelable2;
        int i = 1;
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        getDivContext().getDivVariableController().i(new u131("isLightTheme", h));
        psf viewModel = getViewModel();
        rwo rwoVar = viewModel.c;
        sv90 sv90Var = qv90.a;
        String id = sbpToken.getId();
        String verificationId = sbpChallengeInfo.getVerificationId();
        sv90Var.getClass();
        ((y22) rwoVar).a(sv90.m0(id, verificationId));
        viewModel.A = h;
        viewModel.C = sbpChallengeInfo;
        viewModel.D = sbpToken;
        tje.N(ds31.a(viewModel), null, null, new DKChallengerViewModel$loadAndShowDivJson$1(viewModel, sbpChallengeInfo, sbpToken, null), 3);
        if (sbpChallengeInfo.isSmsChallenge()) {
            viewModel.X(Long.valueOf(sbpChallengeInfo.getDenyResendUntil()));
        } else {
            CountDownTimer countDownTimer = viewModel.I;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            viewModel.I = null;
            viewModel.F.m(isf.b);
        }
        if (hsf.a[sbpChallengeInfo.getMethod().ordinal()] == 1) {
            obj = esf.c;
        } else {
            String format = sbpChallengeInfo.getFormat();
            if (format == null) {
                format = "";
            }
            obj = evu0.H(format, Extension.DOT_CHAR, 0, false, 6) == 1 ? dsf.c : csf.c;
        }
        tje.N(eja1.s(this), null, null, new DKChallengerFragment$onViewCreated$1(this, sbpToken, null), 3);
        tje.N(eja1.s(this), null, null, new DKChallengerFragment$onViewCreated$2(this, null), 3);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ((iu31) getViewReadyObservable()).a = new f89(15, ref$ObjectRef, obj, this);
        int i2 = 2;
        getViewModel().E.f(getViewLifecycleOwner(), new cof(i2, new h12(i, ref$ObjectRef)));
        getViewModel().y.f(getViewLifecycleOwner(), new cof(i2, new dke(8, this, ref$ObjectRef)));
        getViewModel().F.f(getViewLifecycleOwner(), new cof(i2, new dye(16, this)));
    }

    public final void setActionFlowReceiver(nx nxVar) {
        this.actionFlowReceiver = nxVar;
    }

    @Override // defpackage.a99
    public void setCallback(z89 callbacks) {
        this.callbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setViewModelFactory(qsf qsfVar) {
        this.viewModelFactory = qsfVar;
    }

    public final void setViewReadyObservable(hu31 hu31Var) {
        this.viewReadyObservable = hu31Var;
    }
}
