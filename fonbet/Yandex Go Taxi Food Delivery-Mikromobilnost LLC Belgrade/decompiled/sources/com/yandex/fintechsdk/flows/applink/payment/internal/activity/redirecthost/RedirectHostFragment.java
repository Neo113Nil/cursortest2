package com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.d;
import androidx.view.fragment.NavHostFragment;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.ApplinkPaymentParseResult$RedirectHost;
import com.yandex.pay.payment.YPayResult;
import defpackage.a80;
import defpackage.amp;
import defpackage.eja1;
import defpackage.es31;
import defpackage.f550;
import defpackage.fcl0;
import defpackage.fli0;
import defpackage.gli0;
import defpackage.hli0;
import defpackage.hoh0;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.i6g;
import defpackage.iik0;
import defpackage.ili0;
import defpackage.irw;
import defpackage.j550;
import defpackage.jl40;
import defpackage.k7o;
import defpackage.mkp;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.okp;
import defpackage.op41;
import defpackage.pqt0;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tje;
import defpackage.tvh0;
import defpackage.vng;
import defpackage.w13;
import defpackage.w8f;
import defpackage.xgh0;
import defpackage.y8f;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/redirecthost/RedirectHostFragment;", "Landroidx/fragment/app/Fragment;", "Lokp;", "<init>", "()V", "Lzy11;", "createGraph", "resetBackStackToStart", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/navigation/d;", "getNavController", "()Landroidx/navigation/d;", "attachNavigationController", "detachNavigationController", "listenForFinish", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/ApplinkPaymentParseResult$RedirectHost;", "args", "()Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/ApplinkPaymentParseResult$RedirectHost;", "Lmkp;", "T", "resolveDependencies", "()Lmkp;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Lgli0;", "componentStore$delegate", "Li3y;", "getComponentStore", "()Lgli0;", "componentStore", "Lfli0;", "getComponent", "()Lfli0;", "component", "Companion", "ili0", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RedirectHostFragment extends Fragment implements okp {
    private static final String ARG_PARSE_RESULT = "redirect_host_parse_result";
    public static final ili0 Companion = new ili0();

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment$special$$inlined$injectViewModel$2] */
    public RedirectHostFragment() {
        super(hoh0.finsdk_flow_fragment_container);
        a80 a80Var = new a80(26, new hli0(this, 0));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment$special$$inlined$injectViewModel$2
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
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(gli0.class), new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, a80Var, new sls() { // from class: com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment$special$$inlined$injectViewModel$5
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

    private final ApplinkPaymentParseResult$RedirectHost args() {
        ApplinkPaymentParseResult$RedirectHost applinkPaymentParseResult$RedirectHost = (ApplinkPaymentParseResult$RedirectHost) vng.u(requireArguments(), ApplinkPaymentParseResult$RedirectHost.class, ARG_PARSE_RESULT);
        if (applinkPaymentParseResult$RedirectHost != null) {
            return applinkPaymentParseResult$RedirectHost;
        }
        ny61.r("RedirectHost args not found in fragment arguments");
        return null;
    }

    private final void attachNavigationController() {
        com.yandex.fintechsdk.core.navigation.impl.api.router.a Q = ((i6g) getComponent()).Q();
        ht10 ht10Var = new ht10(getNavController(), new hli0(this, 1), false, 13);
        Q.getClass();
        o8k0 o8k0Var = new o8k0(14, Q, ht10Var);
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            o8k0Var.invoke();
        } else {
            Q.a.post(new fcl0(1, o8k0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 attachNavigationController$lambda$2(RedirectHostFragment redirectHostFragment) {
        w13 w13Var = (w13) ((i6g) redirectHostFragment.getComponent()).Z.get();
        YPayResult.Cancelled cancelled = YPayResult.Cancelled.INSTANCE;
        w13Var.c = null;
        w13Var.a.g(cancelled);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gli0 componentStore_delegate$lambda$0(RedirectHostFragment redirectHostFragment) {
        return new gli0(redirectHostFragment.requireContext().getApplicationContext(), ((irw) redirectHostFragment.requireActivity()).provideInternalDependencies(), redirectHostFragment.args());
    }

    private final void createGraph() {
        d navController = getNavController();
        f550 a = navController.i().a(tvh0.finsdk_applink_payment_graph);
        ((i6g) getComponent()).getClass();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new k7o());
        arrayList.add(new pqt0());
        arrayList.add(new op41());
        Iterator it = (arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList))).iterator();
        while (it.hasNext()) {
            a.f(((amp) it.next()).a(navController));
        }
        a.k("splash");
        navController.r(a, null);
    }

    private final void detachNavigationController() {
        com.yandex.fintechsdk.core.navigation.impl.api.router.a Q = ((i6g) getComponent()).Q();
        Q.getClass();
        o8k0 o8k0Var = new o8k0(14, Q, null);
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            o8k0Var.invoke();
        } else {
            Q.a.post(new fcl0(1, o8k0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fli0 getComponent() {
        return getComponentStore().b;
    }

    private final gli0 getComponentStore() {
        return (gli0) this.componentStore.getValue();
    }

    private final d getNavController() {
        return getNavHostFragment().getNavController();
    }

    private final NavHostFragment getNavHostFragment() {
        return (NavHostFragment) getChildFragmentManager().E(xgh0.finsdkFlowNavHostContainer);
    }

    private final void listenForFinish() {
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new RedirectHostFragment$listenForFinish$1(this, null), 3);
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.yandex.fintechsdk.core.navigation.impl.api.router.a Q = ((i6g) getComponent()).Q();
        Q.getClass();
        iik0 iik0Var = new iik0(14, Q);
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            iik0Var.invoke();
        } else {
            Q.a.post(new fcl0(1, iik0Var));
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
        listenForFinish();
        boolean z = false;
        if (savedInstanceState != null) {
            gli0 componentStore = getComponentStore();
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
    }

    @Override // defpackage.okp
    public <T extends mkp> T resolveDependencies() {
        return getComponent();
    }
}
