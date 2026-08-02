package com.yandex.payment.divkit.exitscreen;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.payment.divkit.exitscreen.DKExitFragment;
import com.yandex.payment.divkit.usecases.g;
import defpackage.abe;
import defpackage.as31;
import defpackage.c950;
import defpackage.cnk;
import defpackage.dle;
import defpackage.ds31;
import defpackage.dye;
import defpackage.dzf;
import defpackage.eja1;
import defpackage.es31;
import defpackage.f950;
import defpackage.i3y;
import defpackage.i891;
import defpackage.j9f;
import defpackage.jl40;
import defpackage.jpa0;
import defpackage.m93;
import defpackage.ncq0;
import defpackage.nmo;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.omo;
import defpackage.ong0;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.sls;
import defpackage.tc5;
import defpackage.tje;
import defpackage.tsf;
import defpackage.u131;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.usf;
import defpackage.w8f;
import defpackage.wmo;
import defpackage.xc5;
import defpackage.xmo;
import defpackage.xxk;
import defpackage.y8f;
import defpackage.zmk;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0002Z[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010#\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/yandex/payment/divkit/exitscreen/DKExitFragment;", "Landroidx/fragment/app/Fragment;", "Lomo;", "<init>", "()V", "Lcnk;", "divData", "Lzy11;", "observeDivData", "(Lcnk;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lnmo;", "callbacks", "setCallback", "(Lnmo;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "isLightTheme", "Z", DKExitFragment.IS_PAYMENT_CONTEXT, "Lnmo;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Ljpa0;", "_binding", "Ljpa0;", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lusf;", "viewModelFactory", "Lusf;", "getViewModelFactory", "()Lusf;", "setViewModelFactory", "(Lusf;)V", "Lxmo;", "viewModel$delegate", "getViewModel", "()Lxmo;", "viewModel", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "getBinding", "()Ljpa0;", "binding", "Companion", "FixupOnLayoutChangeListener", "tsf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKExitFragment extends Fragment implements omo {
    public static final tsf Companion = new tsf();
    private static final String IS_PAYMENT_CONTEXT = "isPaymentContext";
    private jpa0 _binding;
    public nx actionFlowReceiver;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private nmo callbacks;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    private boolean isLightTheme = true;
    private boolean isPaymentContext;
    private View.OnLayoutChangeListener layoutChangeListener;
    public u2l parsingEnvironment;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public usf viewModelFactory;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/payment/divkit/exitscreen/DKExitFragment$FixupOnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/ViewGroup;", "target", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Landroid/view/ViewGroup;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FixupOnLayoutChangeListener implements View.OnLayoutChangeListener {
        private final ViewGroup target;

        public FixupOnLayoutChangeListener(ViewGroup viewGroup) {
            this.target = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            TransitionManager.endTransitions(this.target);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.payment.divkit.exitscreen.DKExitFragment$special$$inlined$viewModels$default$1] */
    public DKExitFragment() {
        final int i = 1;
        final int i2 = 0;
        this.activityViewModel = a.a(new sls(this) { // from class: ssf
            public final /* synthetic */ DKExitFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i3 = i2;
                DKExitFragment dKExitFragment = this.b;
                switch (i3) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKExitFragment.activityViewModel_delegate$lambda$0(dKExitFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKExitFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKExitFragment.divContext_delegate$lambda$0(dKExitFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
        sls slsVar = new sls(this) { // from class: ssf
            public final /* synthetic */ DKExitFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i3 = i;
                DKExitFragment dKExitFragment = this.b;
                switch (i3) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKExitFragment.activityViewModel_delegate$lambda$0(dKExitFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKExitFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKExitFragment.divContext_delegate$lambda$0(dKExitFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        };
        final ?? r0 = new sls(this) { // from class: com.yandex.payment.divkit.exitscreen.DKExitFragment$special$$inlined$viewModels$default$1
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
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.exitscreen.DKExitFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(xmo.class), new sls() { // from class: com.yandex.payment.divkit.exitscreen.DKExitFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.payment.divkit.exitscreen.DKExitFragment$special$$inlined$viewModels$default$4
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
        this.divContext = a.a(new sls(this) { // from class: ssf
            public final /* synthetic */ DKExitFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i32 = i3;
                DKExitFragment dKExitFragment = this.b;
                switch (i32) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKExitFragment.activityViewModel_delegate$lambda$0(dKExitFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKExitFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKExitFragment.divContext_delegate$lambda$0(dKExitFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc5 activityViewModel_delegate$lambda$0(DKExitFragment dKExitFragment) {
        nmo nmoVar = dKExitFragment.callbacks;
        if (nmoVar == null) {
            nmoVar = null;
        }
        return nmoVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKExitFragment dKExitFragment) {
        return new Div2Context(dKExitFragment.requireActivity(), dKExitFragment.getDivConfiguration(), 0, dKExitFragment.getViewLifecycleOwner(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    private final jpa0 getBinding() {
        jpa0 jpa0Var = this._binding;
        if (jpa0Var != null) {
            return jpa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xmo getViewModel() {
        return (xmo) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeDivData(cnk divData) {
        Div2View div2View = this.div2View;
        if (div2View == null || !jl40.l(div2View.getParent(), getBinding().b)) {
            Div2View div2View2 = new Div2View(getDivContext(), null, 0, 6, null);
            div2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
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
            div2View4.post(new j9f(13, divData, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(cnk cnkVar, DKExitFragment dKExitFragment) {
        for (Pair pair : cnkVar.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKExitFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(DKExitFragment dKExitFragment, f950 f950Var) {
        if (jl40.l(f950Var, c950.d)) {
            tje.N(eja1.s(dKExitFragment), null, null, new DKExitFragment$onViewCreated$2$1(dKExitFragment, null), 3);
        }
        return zy11.a;
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

    public final u2l getParsingEnvironment() {
        u2l u2lVar = this.parsingEnvironment;
        if (u2lVar != null) {
            return u2lVar;
        }
        return null;
    }

    public final usf getViewModelFactory() {
        usf usfVar = this.viewModelFactory;
        if (usfVar != null) {
            return usfVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isLightTheme = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        this.isPaymentContext = requireArguments().getBoolean(IS_PAYMENT_CONTEXT, false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        nmo nmoVar = this.callbacks;
        if (nmoVar == null) {
            nmoVar = null;
        }
        xxk xxkVar = (xxk) nmoVar.b(this, xxk.class);
        requireActivity();
        requireActivity().getApplicationContext();
        requireActivity().getApplication();
        nmo nmoVar2 = this.callbacks;
        if (nmoVar2 == null) {
            nmoVar2 = null;
        }
        wmo w = nmoVar2.w();
        new as31();
        new ncq0();
        dzf dzfVar = (dzf) xxkVar;
        nx a = dzfVar.a();
        q5z.h(a);
        this.actionFlowReceiver = a;
        m93 m93Var = new m93(dzfVar.a.getApplicationContext());
        abe e = dzfVar.e();
        DivKitApi d = dzfVar.d();
        rwo rwoVar = dzfVar.g;
        this.viewModelFactory = new usf(new g(m93Var, e, w, new com.yandex.payment.divkit.common.a(new com.yandex.payment.divkit.repository.a(d, rwoVar), rwoVar)), rwoVar);
        ujk b = dzfVar.b();
        q5z.h(b);
        this.divConfiguration = b;
        u2l c = dzfVar.c();
        q5z.h(c);
        this.parsingEnvironment = c;
        View inflate = inflater.inflate(ulh0.paymentsdk_dk_exit_fragment, container, false);
        if (inflate == null) {
            ny61.t("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this._binding = new jpa0(linearLayout, linearLayout);
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int i = 1;
        getDivContext().getDivVariableController().i(new u131("isLightTheme", this.isLightTheme));
        xmo viewModel = getViewModel();
        viewModel.x = this.isPaymentContext;
        tje.N(ds31.a(viewModel), null, null, new ExitScreenViewModel$loadAndShowDivJson$1(viewModel, null), 3);
        this.layoutChangeListener = new FixupOnLayoutChangeListener(getBinding().a);
        LinearLayout linearLayout = getBinding().a;
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
        if (onLayoutChangeListener == null) {
            onLayoutChangeListener = null;
        }
        linearLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        tje.N(eja1.s(this), null, null, new DKExitFragment$onViewCreated$1(this, null), 3);
        ((xc5) getActivityViewModel()).c.f(getViewLifecycleOwner(), new dle(i, new dye(17, this)));
    }

    public final void setActionFlowReceiver(nx nxVar) {
        this.actionFlowReceiver = nxVar;
    }

    @Override // defpackage.omo
    public void setCallback(nmo callbacks) {
        this.callbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setViewModelFactory(usf usfVar) {
        this.viewModelFactory = usfVar;
    }
}
