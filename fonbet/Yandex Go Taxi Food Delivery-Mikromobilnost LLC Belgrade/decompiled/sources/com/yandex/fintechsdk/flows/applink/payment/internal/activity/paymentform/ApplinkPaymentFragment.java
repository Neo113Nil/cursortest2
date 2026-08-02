package com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.d;
import androidx.view.fragment.NavHostFragment;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.data.listeners.b;
import com.yandex.pay.payment.YPayResult;
import defpackage.a23;
import defpackage.a80;
import defpackage.abe;
import defpackage.aj31;
import defpackage.amp;
import defpackage.ar10;
import defpackage.brb1;
import defpackage.d180;
import defpackage.eja1;
import defpackage.es31;
import defpackage.f550;
import defpackage.fcl0;
import defpackage.fp51;
import defpackage.gh5;
import defpackage.hk3;
import defpackage.hoh0;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.ilr;
import defpackage.irw;
import defpackage.j23;
import defpackage.j550;
import defpackage.jl40;
import defpackage.k23;
import defpackage.k7o;
import defpackage.lwf;
import defpackage.mkp;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.okp;
import defpackage.pqt0;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.s4s;
import defpackage.sls;
import defpackage.tje;
import defpackage.tvh0;
import defpackage.w13;
import defpackage.w8f;
import defpackage.xgh0;
import defpackage.xr41;
import defpackage.y8f;
import defpackage.z13;
import defpackage.z22;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/paymentform/ApplinkPaymentFragment;", "Landroidx/fragment/app/Fragment;", "Lokp;", "<init>", "()V", "Lzy11;", "createGraph", "resetBackStackToStart", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/navigation/d;", "getNavController", "()Landroidx/navigation/d;", "attachNavigationController", "detachNavigationController", "listenForResult", "initYbSdk", "initPlusSdk", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/IntentArgs;", "args", "()Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/IntentArgs;", "Lmkp;", "T", "resolveDependencies", "()Lmkp;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "La23;", "componentStore$delegate", "Li3y;", "getComponentStore", "()La23;", "componentStore", "Lz13;", "component$delegate", "getComponent", "()Lz13;", "component", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/paymentform/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/paymentform/a;", "viewModel", "Companion", "k23", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApplinkPaymentFragment extends Fragment implements okp {
    private static final String ARG_INTENT_ARGS = "intent_args";
    public static final k23 Companion = new k23();

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final i3y component;

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$7] */
    public ApplinkPaymentFragment() {
        super(hoh0.finsdk_flow_fragment_container);
        int i = 1;
        a80 a80Var = new a80(i, new j23(this, 0));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$2
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(a23.class), new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, a80Var, new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$5
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
        this.component = kotlin.a.a(new j23(this, i));
        int i2 = 2;
        a80 a80Var2 = new a80(i2, new j23(this, i2));
        final ?? r02 = new sls(this) { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$7
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r02.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$9
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, a80Var2, new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment$special$$inlined$injectViewModel$10
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

    private final IntentArgs args() {
        IntentArgs intentArgs = (IntentArgs) requireArguments().getParcelable(ARG_INTENT_ARGS);
        if (intentArgs != null) {
            return intentArgs;
        }
        ny61.r("IntentArgs not found in fragment arguments");
        return null;
    }

    private final void attachNavigationController() {
        com.yandex.fintechsdk.core.navigation.impl.api.router.a router = ((lwf) getComponent()).getRouter();
        ht10 ht10Var = new ht10(getNavController(), new j23(this, 3), false, 13);
        router.getClass();
        o8k0 o8k0Var = new o8k0(14, router, ht10Var);
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            o8k0Var.invoke();
        } else {
            router.a.post(new fcl0(1, o8k0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 attachNavigationController$lambda$4(ApplinkPaymentFragment applinkPaymentFragment) {
        w13 w13Var = (w13) ((lwf) applinkPaymentFragment.getComponent()).R.get();
        YPayResult.Cancelled cancelled = YPayResult.Cancelled.INSTANCE;
        w13Var.c = null;
        w13Var.a.g(cancelled);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a23 componentStore_delegate$lambda$0(ApplinkPaymentFragment applinkPaymentFragment) {
        return new a23(applinkPaymentFragment.requireContext().getApplicationContext(), applinkPaymentFragment.args(), ((irw) applinkPaymentFragment.requireActivity()).provideInternalDependencies());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z13 component_delegate$lambda$1(ApplinkPaymentFragment applinkPaymentFragment) {
        return applinkPaymentFragment.getComponentStore().b;
    }

    private final void createGraph() {
        d navController = getNavController();
        f550 a = navController.i().a(tvh0.finsdk_applink_payment_graph);
        ((lwf) getComponent()).getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new gh5());
        arrayList.add(new k7o());
        arrayList.add(new pqt0());
        arrayList.add(new xr41());
        Iterator it = (arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList))).iterator();
        while (it.hasNext()) {
            a.f(((amp) it.next()).a(navController));
        }
        getViewModel().getClass();
        a.k("splash");
        navController.r(a, null);
    }

    private final void detachNavigationController() {
        com.yandex.fintechsdk.core.navigation.impl.api.router.a router = ((lwf) getComponent()).getRouter();
        router.getClass();
        o8k0 o8k0Var = new o8k0(14, router, null);
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            o8k0Var.invoke();
        } else {
            router.a.post(new fcl0(1, o8k0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z13 getComponent() {
        return (z13) this.component.getValue();
    }

    private final a23 getComponentStore() {
        return (a23) this.componentStore.getValue();
    }

    private final d getNavController() {
        return getNavHostFragment().getNavController();
    }

    private final NavHostFragment getNavHostFragment() {
        return (NavHostFragment) getChildFragmentManager().E(xgh0.finsdkFlowNavHostContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    private final void initPlusSdk() {
        getViewModel().getClass();
    }

    private final void initYbSdk() {
        a viewModel = getViewModel();
        FragmentActivity requireActivity = requireActivity();
        boolean c = brb1.c(requireActivity());
        fp51 fp51Var = viewModel.D;
        if (fp51Var != null) {
            c cVar = (c) fp51Var;
            boolean z = false;
            cVar.a = kotlin.a.a(new ilr(cVar, viewModel.C, requireActivity, c, z, Locale.getDefault(), viewModel.B.d()));
        }
    }

    private final void listenForResult() {
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new ApplinkPaymentFragment$listenForResult$1(this, null), 3);
    }

    private final void resetBackStackToStart() {
        d navController = getNavController();
        String str = navController.g().H;
        if (str == null) {
            return;
        }
        j550 j550Var = new j550();
        j550Var.c = navController.g().A;
        j550Var.d = null;
        j550Var.e = true;
        j550Var.f = false;
        d.l(navController, str, j550Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a viewModel_delegate$lambda$2(ApplinkPaymentFragment applinkPaymentFragment) {
        lwf lwfVar = (lwf) applinkPaymentFragment.getComponent();
        z22 z22Var = (z22) lwfVar.Q.get();
        b bVar = new b((hk3) lwfVar.I.get(), (com.yandex.fintechsdk.data.personalization.impl.internal.a) lwfVar.r0.get(), (ar10) lwfVar.J.get());
        s4s s4sVar = (s4s) lwfVar.S.get();
        IntentArgs intentArgs = lwfVar.F;
        ar10 ar10Var = (ar10) lwfVar.J.get();
        com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar = (com.yandex.fintechsdk.data.payment.impl.internal.order.a) lwfVar.p0.get();
        com.yandex.fintechsdk.data.personalization.impl.internal.a aVar2 = (com.yandex.fintechsdk.data.personalization.impl.internal.a) lwfVar.r0.get();
        if (lwfVar.k0.get() != null) {
            ny61.u();
            return null;
        }
        boolean z = false;
        return new a(z22Var, bVar, s4sVar, intentArgs, ar10Var, aVar, aVar2, new abe(lwfVar.a, z, z), new aj31(16, (hk3) lwfVar.I.get()), (fp51) lwfVar.l0.get());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        FlexAdapter m;
        com.yandex.fintechsdk.core.navigation.impl.api.router.a router = ((lwf) getComponent()).getRouter();
        router.getClass();
        iik0 iik0Var = new iik0(14, router);
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            iik0Var.invoke();
        } else {
            router.a.post(new fcl0(1, iik0Var));
        }
        FragmentActivity activity = getActivity();
        if ((activity == null || !activity.isChangingConfigurations()) && (m = ((lwf) getComponent()).m()) != null) {
            m.clear();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        detachNavigationController();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        attachNavigationController();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        boolean z = false;
        if (savedInstanceState != null) {
            a23 componentStore = getComponentStore();
            boolean z2 = componentStore.c;
            componentStore.c = false;
            if (z2) {
                z = true;
            }
        }
        createGraph();
        if (z) {
            resetBackStackToStart();
        }
        a viewModel = getViewModel();
        ar10 ar10Var = viewModel.y;
        String value = viewModel.x.getConfig().getMerchantData().getId().getValue();
        r0 r0Var = ar10Var.a.a;
        r0Var.getClass();
        r0Var.m(null, value);
        a viewModel2 = getViewModel();
        String str = requireActivity().getApplicationInfo().packageName;
        com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar = viewModel2.z;
        IntentArgs intentArgs = viewModel2.x;
        if (!intentArgs.isStartedFromQr()) {
            d180 d180Var = aVar.a;
            synchronized (d180Var) {
                d180Var.b = null;
            }
        } else if (intentArgs.isStartedFromInternalScanner()) {
            d180 d180Var2 = aVar.a;
            synchronized (d180Var2) {
                d180Var2.b = str;
            }
        } else {
            d180 d180Var3 = aVar.a;
            synchronized (d180Var3) {
                d180Var3.b = "external";
            }
        }
        initYbSdk();
        initPlusSdk();
        listenForResult();
    }

    @Override // defpackage.okp
    public <T extends mkp> T resolveDependencies() {
        return getComponent();
    }
}
