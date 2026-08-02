package com.yandex.payment.divkit.license;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.payment.divkit.license.DKLicenseFragment;
import com.yandex.payment.divkit.usecases.h;
import defpackage.abe;
import defpackage.btf;
import defpackage.c950;
import defpackage.cdy;
import defpackage.cnk;
import defpackage.ddy;
import defpackage.dle;
import defpackage.ds31;
import defpackage.dye;
import defpackage.dzf;
import defpackage.edy;
import defpackage.eja1;
import defpackage.es31;
import defpackage.f950;
import defpackage.i3y;
import defpackage.i891;
import defpackage.j9f;
import defpackage.jl40;
import defpackage.lpa0;
import defpackage.m93;
import defpackage.ncq0;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.ong0;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.sls;
import defpackage.tc5;
import defpackage.tje;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.w8f;
import defpackage.xc5;
import defpackage.xcy;
import defpackage.xxk;
import defpackage.y8f;
import defpackage.zcy;
import defpackage.zmk;
import defpackage.zsf;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001VB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010=R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010(\u001a\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/yandex/payment/divkit/license/DKLicenseFragment;", "Landroidx/fragment/app/Fragment;", "Lzcy;", "<init>", "()V", "Lcnk;", "divData", "Lzy11;", "observeDivData", "(Lcnk;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lxcy;", "callbacks", "setCallback", "(Lxcy;)V", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "", "isLightTheme", "Z", "Llpa0;", "_binding", "Llpa0;", "Lxcy;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lbtf;", "viewModelFactory", "Lbtf;", "getViewModelFactory", "()Lbtf;", "setViewModelFactory", "(Lbtf;)V", "Ledy;", "viewModel$delegate", "getViewModel", "()Ledy;", "viewModel", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "getBinding", "()Llpa0;", "binding", "Companion", "zsf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKLicenseFragment extends Fragment implements zcy {
    private static final String ARG_ACQUIRER = "ARG_ACQUIRER";
    private static final String ARG_IS_SBP = "ARG_TYPE";
    private static final String ARG_LICENSE_URL = "ARG_LICENSE_URL";
    private static final String ARG_MERCHANT_INFO = "ARG_MERCHANT_INFO";
    public static final zsf Companion = new zsf();
    private static final String HOST_CLOSE_LEGAL = "close_legal";
    private lpa0 _binding;
    public nx actionFlowReceiver;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private xcy callbacks;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    private boolean isLightTheme = true;
    public u2l parsingEnvironment;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public btf viewModelFactory;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.payment.divkit.license.DKLicenseFragment$special$$inlined$viewModels$default$1] */
    public DKLicenseFragment() {
        final int i = 1;
        final int i2 = 0;
        this.activityViewModel = a.a(new sls(this) { // from class: ysf
            public final /* synthetic */ DKLicenseFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i3 = i2;
                DKLicenseFragment dKLicenseFragment = this.b;
                switch (i3) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKLicenseFragment.activityViewModel_delegate$lambda$0(dKLicenseFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKLicenseFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKLicenseFragment.divContext_delegate$lambda$0(dKLicenseFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
        sls slsVar = new sls(this) { // from class: ysf
            public final /* synthetic */ DKLicenseFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i3 = i;
                DKLicenseFragment dKLicenseFragment = this.b;
                switch (i3) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKLicenseFragment.activityViewModel_delegate$lambda$0(dKLicenseFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKLicenseFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKLicenseFragment.divContext_delegate$lambda$0(dKLicenseFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        };
        final ?? r0 = new sls(this) { // from class: com.yandex.payment.divkit.license.DKLicenseFragment$special$$inlined$viewModels$default$1
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
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.license.DKLicenseFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(edy.class), new sls() { // from class: com.yandex.payment.divkit.license.DKLicenseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.payment.divkit.license.DKLicenseFragment$special$$inlined$viewModels$default$4
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
        this.divContext = a.a(new sls(this) { // from class: ysf
            public final /* synthetic */ DKLicenseFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                hs31 viewModelFactory;
                Div2Context divContext_delegate$lambda$0;
                int i32 = i3;
                DKLicenseFragment dKLicenseFragment = this.b;
                switch (i32) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKLicenseFragment.activityViewModel_delegate$lambda$0(dKLicenseFragment);
                        return activityViewModel_delegate$lambda$0;
                    case 1:
                        viewModelFactory = dKLicenseFragment.getViewModelFactory();
                        return viewModelFactory;
                    default:
                        divContext_delegate$lambda$0 = DKLicenseFragment.divContext_delegate$lambda$0(dKLicenseFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc5 activityViewModel_delegate$lambda$0(DKLicenseFragment dKLicenseFragment) {
        xcy xcyVar = dKLicenseFragment.callbacks;
        if (xcyVar == null) {
            xcyVar = null;
        }
        return xcyVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKLicenseFragment dKLicenseFragment) {
        return new Div2Context(dKLicenseFragment.requireActivity(), dKLicenseFragment.getDivConfiguration(), 0, dKLicenseFragment.getViewLifecycleOwner(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    private final lpa0 getBinding() {
        lpa0 lpa0Var = this._binding;
        if (lpa0Var != null) {
            return lpa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final edy getViewModel() {
        return (edy) this.viewModel.getValue();
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
            div2View4.post(new j9f(14, divData, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(cnk cnkVar, DKLicenseFragment dKLicenseFragment) {
        for (Pair pair : cnkVar.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKLicenseFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(DKLicenseFragment dKLicenseFragment, f950 f950Var) {
        if (jl40.l(f950Var, c950.e)) {
            tje.N(eja1.s(dKLicenseFragment), null, null, new DKLicenseFragment$onViewCreated$2$1(dKLicenseFragment, null), 3);
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

    public final btf getViewModelFactory() {
        btf btfVar = this.viewModelFactory;
        if (btfVar != null) {
            return btfVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isLightTheme = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        xcy xcyVar = this.callbacks;
        if (xcyVar == null) {
            xcyVar = null;
        }
        xxk xxkVar = (xxk) xcyVar.b(this, xxk.class);
        requireActivity();
        requireActivity().getApplicationContext();
        requireActivity().getApplication();
        xcy xcyVar2 = this.callbacks;
        if (xcyVar2 == null) {
            xcyVar2 = null;
        }
        ddy E = xcyVar2.E();
        new cdy();
        new ncq0();
        dzf dzfVar = (dzf) xxkVar;
        nx a = dzfVar.a();
        q5z.h(a);
        this.actionFlowReceiver = a;
        m93 m93Var = new m93(dzfVar.a.getApplicationContext());
        abe e = dzfVar.e();
        DivKitApi d = dzfVar.d();
        rwo rwoVar = dzfVar.g;
        this.viewModelFactory = new btf(new h(m93Var, e, new com.yandex.payment.divkit.common.a(new com.yandex.payment.divkit.repository.a(d, rwoVar), rwoVar), E), rwoVar);
        ujk b = dzfVar.b();
        q5z.h(b);
        this.divConfiguration = b;
        u2l c = dzfVar.c();
        q5z.h(c);
        this.parsingEnvironment = c;
        View inflate = inflater.inflate(ulh0.paymentsdk_dk_license_fragment, container, false);
        if (inflate == null) {
            ny61.t("rootView");
            return null;
        }
        ScrollView scrollView = (ScrollView) inflate;
        this._binding = new lpa0(scrollView, scrollView);
        return scrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edy viewModel = getViewModel();
        boolean z = this.isLightTheme;
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new LicenseViewModel$loadAndShowDivJson$1(viewModel, null), 3);
        viewModel.x = z;
        xcy xcyVar = this.callbacks;
        if (xcyVar == null) {
            xcyVar = null;
        }
        xcyVar.p(false);
        xcy xcyVar2 = this.callbacks;
        if (xcyVar2 == null) {
            xcyVar2 = null;
        }
        xcyVar2.t();
        tje.N(eja1.s(this), null, null, new DKLicenseFragment$onViewCreated$1(this, null), 3);
        ((xc5) getActivityViewModel()).c.f(getViewLifecycleOwner(), new dle(2, new dye(18, this)));
    }

    public final void setActionFlowReceiver(nx nxVar) {
        this.actionFlowReceiver = nxVar;
    }

    @Override // defpackage.zcy
    public void setCallback(xcy callbacks) {
        this.callbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setViewModelFactory(btf btfVar) {
        this.viewModelFactory = btfVar;
    }
}
