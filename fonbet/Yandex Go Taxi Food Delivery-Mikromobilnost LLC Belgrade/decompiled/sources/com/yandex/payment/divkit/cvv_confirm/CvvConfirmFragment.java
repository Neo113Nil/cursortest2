package com.yandex.payment.divkit.cvv_confirm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.usecases.f;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.bof;
import defpackage.ci8;
import defpackage.cma1;
import defpackage.cof;
import defpackage.dke;
import defpackage.dof;
import defpackage.ds31;
import defpackage.dy40;
import defpackage.dzf;
import defpackage.e4p;
import defpackage.eof;
import defpackage.es31;
import defpackage.f4p;
import defpackage.fof;
import defpackage.g4p;
import defpackage.gof;
import defpackage.gtq0;
import defpackage.h4p;
import defpackage.hof;
import defpackage.i3y;
import defpackage.i4p;
import defpackage.i891;
import defpackage.j9f;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.l9h0;
import defpackage.m93;
import defpackage.ncq0;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.ong0;
import defpackage.oy90;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.qwl;
import defpackage.raq0;
import defpackage.rof;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.saq0;
import defpackage.sls;
import defpackage.smk;
import defpackage.sof;
import defpackage.sv90;
import defpackage.t27;
import defpackage.tje;
import defpackage.tls;
import defpackage.tnf;
import defpackage.u131;
import defpackage.u27;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.unf;
import defpackage.v27;
import defpackage.vv90;
import defpackage.w511;
import defpackage.w8f;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y8f;
import defpackage.yoa0;
import defpackage.z27;
import defpackage.zbq0;
import defpackage.zmk;
import defpackage.zry0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J!\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00105\u001a\u0004\bW\u0010XR*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013j\u0004\u0018\u0001`Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/yandex/payment/divkit/cvv_confirm/CvvConfirmFragment;", "Landroidx/fragment/app/Fragment;", "Lsaq0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lkotlin/Function1;", "", "callback", "setCompletionCallback", "(Ltls;)V", "Lraq0;", "callbacks", "setCallback", "(Lraq0;)V", "", "titleRes", "subtitleRes", "showSnackbarError", "(ILjava/lang/Integer;)V", "Lyoa0;", "_binding", "Lyoa0;", "Lraq0;", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "Li3y;", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lrof;", "viewModelFactory", "Lrof;", "getViewModelFactory", "()Lrof;", "setViewModelFactory", "(Lrof;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Ltnf;", "cvvViewReadyObservable", "Ltnf;", "getCvvViewReadyObservable", "()Ltnf;", "setCvvViewReadyObservable", "(Ltnf;)V", "Lcom/yandex/payment/divkit/cvv_confirm/b;", "cvvViewModel$delegate", "getCvvViewModel", "()Lcom/yandex/payment/divkit/cvv_confirm/b;", "cvvViewModel", "Lcom/yandex/payment/divkit/cvv_confirm/CvvCompletion;", "Ltls;", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "getBinding", "()Lyoa0;", "binding", "Companion", "com/yandex/payment/divkit/cvv_confirm/a", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvvConfirmFragment extends Fragment implements saq0 {
    public static final a Companion = new a();
    private yoa0 _binding;
    public nx actionFlowReceiver;
    private tls callback;
    private raq0 callbacks;

    /* renamed from: cvvViewModel$delegate, reason: from kotlin metadata */
    private final i3y cvvViewModel;
    public tnf cvvViewReadyObservable;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    public rwo eventReporter;
    public u2l parsingEnvironment;
    public rof viewModelFactory;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment$special$$inlined$viewModels$default$1] */
    public CvvConfirmFragment() {
        final int i = 0;
        this.divContext = kotlin.a.a(new sls(this) { // from class: znf
            public final /* synthetic */ CvvConfirmFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Div2Context divContext_delegate$lambda$0;
                hs31 viewModelFactory;
                int i2 = i;
                CvvConfirmFragment cvvConfirmFragment = this.b;
                switch (i2) {
                    case 0:
                        divContext_delegate$lambda$0 = CvvConfirmFragment.divContext_delegate$lambda$0(cvvConfirmFragment);
                        return divContext_delegate$lambda$0;
                    default:
                        viewModelFactory = cvvConfirmFragment.getViewModelFactory();
                        return viewModelFactory;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: znf
            public final /* synthetic */ CvvConfirmFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Div2Context divContext_delegate$lambda$0;
                hs31 viewModelFactory;
                int i22 = i2;
                CvvConfirmFragment cvvConfirmFragment = this.b;
                switch (i22) {
                    case 0:
                        divContext_delegate$lambda$0 = CvvConfirmFragment.divContext_delegate$lambda$0(cvvConfirmFragment);
                        return divContext_delegate$lambda$0;
                    default:
                        viewModelFactory = cvvConfirmFragment.getViewModelFactory();
                        return viewModelFactory;
                }
            }
        };
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.cvvViewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(CvvConfirmFragment cvvConfirmFragment) {
        return new Div2Context(cvvConfirmFragment.requireActivity(), cvvConfirmFragment.getDivConfiguration(), 0, cvvConfirmFragment.getViewLifecycleOwner(), 4, null);
    }

    private final yoa0 getBinding() {
        yoa0 yoa0Var = this._binding;
        if (yoa0Var != null) {
            return yoa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final b getCvvViewModel() {
        return (b) this.cvvViewModel.getValue();
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(CvvConfirmFragment cvvConfirmFragment, z27 z27Var) {
        if (z27Var instanceof u27) {
            Div2View div2View = cvvConfirmFragment.div2View;
            if (div2View != null) {
                div2View.setVariable("cvv_confirm_fragment_currentState", BackendConfig.Restrictions.ENABLED);
            }
            View findFocus = cvvConfirmFragment.getBinding().a.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
        } else if (z27Var instanceof t27) {
            Div2View div2View2 = cvvConfirmFragment.div2View;
            if (div2View2 != null) {
                div2View2.setVariable("cvv_confirm_fragment_currentState", BackendConfig.Restrictions.DISABLED);
            }
        } else if (!jl40.l(z27Var, v27.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$2(Ref$ObjectRef ref$ObjectRef, CvvConfirmFragment cvvConfirmFragment, qwl qwlVar) {
        ref$ObjectRef.element = qwlVar;
        qwlVar.focusInput();
        qwlVar.setCardPaymentSystem(CardPaymentSystem.MasterCard);
        qwlVar.setOnReadyListener(new dke(6, cvvConfirmFragment, qwlVar));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2$0(CvvConfirmFragment cvvConfirmFragment, qwl qwlVar, boolean z) {
        b cvvViewModel = cvvConfirmFragment.getCvvViewModel();
        cvvViewModel.I = qwlVar;
        dy40 dy40Var = cvvViewModel.A;
        if (z) {
            dy40Var.l(new u27(false));
            qv90.a.getClass();
            sv90.G().c();
        } else {
            dy40Var.l(new t27(null));
            qv90.a.getClass();
            sv90.F().c();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(CvvConfirmFragment cvvConfirmFragment, View view) {
        cvvConfirmFragment.getCvvViewModel().z.m(dof.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(CvvConfirmFragment cvvConfirmFragment, i4p i4pVar) {
        if (jl40.l(i4pVar, e4p.a)) {
            raq0 raq0Var = cvvConfirmFragment.callbacks;
            ((zbq0) (raq0Var != null ? raq0Var : null)).f();
        } else if (i4pVar instanceof g4p) {
            raq0 raq0Var2 = cvvConfirmFragment.callbacks;
            g4p g4pVar = (g4p) i4pVar;
            ((zbq0) (raq0Var2 != null ? raq0Var2 : null)).d(g4pVar.a, g4pVar.b);
        } else if (!jl40.l(i4pVar, f4p.a) && !(i4pVar instanceof h4p)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5(CvvConfirmFragment cvvConfirmFragment, Ref$ObjectRef ref$ObjectRef, hof hofVar) {
        if (jl40.l(hofVar, dof.b)) {
            cvvConfirmFragment.getBinding().d.setVisibility(0);
        } else {
            int i = 8;
            if (hofVar instanceof fof) {
                cvvConfirmFragment.getBinding().d.setVisibility(8);
                smk smkVar = ((fof) hofVar).a;
                cvvConfirmFragment.getParsingEnvironment().e(smkVar.a);
                kvo kvoVar = omk.i;
                omk n = gtq0.n(cvvConfirmFragment.getParsingEnvironment(), smkVar.b);
                Div2View div2View = new Div2View(cvvConfirmFragment.getDivContext(), null, 0, 6, null);
                div2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                div2View.setData(n, new zmk(div2View.getLogId()));
                div2View.setId(View.generateViewId());
                cvvConfirmFragment.div2View = div2View;
                cvvConfirmFragment.getBinding().b.addView(cvvConfirmFragment.div2View);
                Div2View div2View2 = cvvConfirmFragment.div2View;
                if (div2View2 != null) {
                    div2View2.post(new j9f(7, smkVar, cvvConfirmFragment));
                }
            } else if (jl40.l(hofVar, dof.a)) {
                cvvConfirmFragment.requireActivity().onBackPressed();
            } else if (hofVar instanceof eof) {
                qwl qwlVar = (qwl) ref$ObjectRef.element;
                if (qwlVar != null) {
                    qwlVar.showLoading(false);
                }
                qwl qwlVar2 = (qwl) ref$ObjectRef.element;
                if (qwlVar2 != null) {
                    qwlVar2.showError();
                }
                Div2View div2View3 = cvvConfirmFragment.div2View;
                if (div2View3 != null) {
                    div2View3.setVariable("cvv_confirm_fragment_currentState", BackendConfig.Restrictions.ENABLED);
                }
                eof eofVar = (eof) hofVar;
                cvvConfirmFragment.showSnackbarError(eofVar.a, eofVar.b);
            } else if (jl40.l(hofVar, dof.c)) {
                qwl qwlVar3 = (qwl) ref$ObjectRef.element;
                if (qwlVar3 != null) {
                    qwlVar3.showLoading(true);
                }
                Div2View div2View4 = cvvConfirmFragment.div2View;
                if (div2View4 != null) {
                    div2View4.setVariable("cvv_confirm_fragment_currentState", ResultType.RESULT_TYPE_LOADING);
                }
            } else {
                if (!(hofVar instanceof gof)) {
                    w511.b();
                    return null;
                }
                qwl qwlVar4 = (qwl) ref$ObjectRef.element;
                if (qwlVar4 != null) {
                    qwlVar4.showSuccess();
                }
                cvvConfirmFragment.getBinding().a.postDelayed(new j9f(i, cvvConfirmFragment, (gof) hofVar), 500L);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$0$2(smk smkVar, CvvConfirmFragment cvvConfirmFragment) {
        for (Pair pair : smkVar.c) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = cvvConfirmFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$1(CvvConfirmFragment cvvConfirmFragment, hof hofVar) {
        raq0 raq0Var = cvvConfirmFragment.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        ((zbq0) raq0Var).r(((gof) hofVar).a);
    }

    private final void showSnackbarError(int titleRes, Integer subtitleRes) {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        BaseActivity baseActivity = ((zbq0) raq0Var).a;
        if (baseActivity instanceof PaymentActivity) {
            ((PaymentActivity) baseActivity).showSnackBar(titleRes, subtitleRes);
        } else if (baseActivity instanceof PreselectActivity) {
            ((PreselectActivity) baseActivity).showSnackBar(titleRes, subtitleRes);
        }
    }

    public final nx getActionFlowReceiver() {
        nx nxVar = this.actionFlowReceiver;
        if (nxVar != null) {
            return nxVar;
        }
        return null;
    }

    public final tnf getCvvViewReadyObservable() {
        tnf tnfVar = this.cvvViewReadyObservable;
        if (tnfVar != null) {
            return tnfVar;
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

    public final rof getViewModelFactory() {
        rof rofVar = this.viewModelFactory;
        if (rofVar != null) {
            return rofVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        xxk xxkVar = (xxk) ((zbq0) raq0Var).b(this, xxk.class);
        raq0 raq0Var2 = this.callbacks;
        if (raq0Var2 == null) {
            raq0Var2 = null;
        }
        oy90 H = ((zbq0) raq0Var2).H();
        raq0 raq0Var3 = this.callbacks;
        if (raq0Var3 == null) {
            raq0Var3 = null;
        }
        vv90 k = ((zbq0) raq0Var3).k();
        H.getClass();
        k.getClass();
        new sof();
        new ncq0();
        dzf dzfVar = (dzf) xxkVar;
        rwo rwoVar = dzfVar.g;
        nx a = dzfVar.a();
        q5z.h(a);
        this.actionFlowReceiver = a;
        ujk b = dzfVar.b();
        q5z.h(b);
        this.divConfiguration = b;
        this.eventReporter = rwoVar;
        f fVar = new f(new com.yandex.payment.divkit.repository.a(dzfVar.d(), rwoVar), new m93(dzfVar.a.getApplicationContext()), dzfVar.e());
        nx a2 = dzfVar.a();
        q5z.h(a2);
        this.viewModelFactory = new rof(fVar, H, k, a2, dzfVar.e());
        u2l c = dzfVar.c();
        q5z.h(c);
        this.parsingEnvironment = c;
        tnf tnfVar = (tnf) dzfVar.u.get();
        q5z.h(tnfVar);
        this.cvvViewReadyObservable = tnfVar;
        View inflate = inflater.inflate(ulh0.paymentsdk_cvv_confirm_fragment_layout, container, false);
        int i = l9h0.content_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = l9h0.paymentsdk_close_cvv_screen;
            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout2 != null) {
                i = l9h0.paymentsdk_progress_bar;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this._binding = new yoa0(constraintLayout, frameLayout, frameLayout2, linearLayout);
                    return constraintLayout;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCvvViewModel().I = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CvvScreenArguments cvvScreenArguments = (CvvScreenArguments) requireArguments().getParcelable("paymentsdk_cvv_args_key");
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.CVV;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.w0(psdkScreen));
        b cvvViewModel = getCvvViewModel();
        if (cvvScreenArguments == null) {
            ny61.r("Required value was null.");
            return;
        }
        raq0 raq0Var = this.callbacks;
        if (raq0Var == null) {
            raq0Var = null;
        }
        zry0 J = ((zbq0) raq0Var).J();
        cvvViewModel.F = cvvScreenArguments;
        cvvViewModel.G = J;
        tje.N(ds31.a(cvvViewModel), null, null, new CvvConfirmViewModel$loadDivJson$1(cvvViewModel, null), 3);
        tje.N(ds31.a(cvvViewModel), null, null, new CvvConfirmViewModel$init$1(cvvViewModel, null), 3);
        final int i = 1;
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        tls tlsVar = this.callback;
        if (tlsVar != null) {
            getCvvViewModel().H = tlsVar;
        }
        final int i2 = 0;
        getDivContext().getDivVariableController().i(new u131("isLightTheme", h));
        raq0 raq0Var2 = this.callbacks;
        ((zbq0) (raq0Var2 != null ? raq0Var2 : null)).n(false);
        getCvvViewModel().C.f(getViewLifecycleOwner(), new cof(i2, new tls(this) { // from class: aof
            public final /* synthetic */ CvvConfirmFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$4;
                int i3 = i2;
                CvvConfirmFragment cvvConfirmFragment = this.b;
                switch (i3) {
                    case 0:
                        onViewCreated$lambda$1 = CvvConfirmFragment.onViewCreated$lambda$1(cvvConfirmFragment, (z27) obj);
                        return onViewCreated$lambda$1;
                    default:
                        onViewCreated$lambda$4 = CvvConfirmFragment.onViewCreated$lambda$4(cvvConfirmFragment, (i4p) obj);
                        return onViewCreated$lambda$4;
                }
            }
        }));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ((unf) getCvvViewReadyObservable()).a = new bof(ref$ObjectRef, this);
        getBinding().c.setOnClickListener(new ci8(20, this));
        getCvvViewModel().E.f(getViewLifecycleOwner(), new cof(i2, new tls(this) { // from class: aof
            public final /* synthetic */ CvvConfirmFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$4;
                int i3 = i;
                CvvConfirmFragment cvvConfirmFragment = this.b;
                switch (i3) {
                    case 0:
                        onViewCreated$lambda$1 = CvvConfirmFragment.onViewCreated$lambda$1(cvvConfirmFragment, (z27) obj);
                        return onViewCreated$lambda$1;
                    default:
                        onViewCreated$lambda$4 = CvvConfirmFragment.onViewCreated$lambda$4(cvvConfirmFragment, (i4p) obj);
                        return onViewCreated$lambda$4;
                }
            }
        }));
        getCvvViewModel().B.f(getViewLifecycleOwner(), new cof(i2, new bof(this, ref$ObjectRef)));
    }

    public final void setActionFlowReceiver(nx nxVar) {
        this.actionFlowReceiver = nxVar;
    }

    @Override // defpackage.saq0
    public void setCallback(raq0 callbacks) {
        this.callbacks = callbacks;
    }

    public final void setCompletionCallback(tls callback) {
        this.callback = callback;
    }

    public final void setCvvViewReadyObservable(tnf tnfVar) {
        this.cvvViewReadyObservable = tnfVar;
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

    public final void setViewModelFactory(rof rofVar) {
        this.viewModelFactory = rofVar;
    }
}
