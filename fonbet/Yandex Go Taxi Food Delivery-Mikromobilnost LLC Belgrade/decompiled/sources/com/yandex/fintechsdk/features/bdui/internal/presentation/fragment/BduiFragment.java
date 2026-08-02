package com.yandex.fintechsdk.features.bdui.internal.presentation.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.features.bdui.api.exception.RestoreStateException;
import defpackage.a80;
import defpackage.ag9;
import defpackage.ah5;
import defpackage.azw;
import defpackage.b2w;
import defpackage.c2r0;
import defpackage.ch8;
import defpackage.dh5;
import defpackage.dn90;
import defpackage.es31;
import defpackage.fke;
import defpackage.fzy;
import defpackage.gdr;
import defpackage.gh91;
import defpackage.gtq0;
import defpackage.gzr;
import defpackage.hh5;
import defpackage.hk3;
import defpackage.hsb;
import defpackage.i3y;
import defpackage.iee;
import defpackage.ih5;
import defpackage.j24;
import defpackage.kg5;
import defpackage.kgx;
import defpackage.l95;
import defpackage.lee;
import defpackage.lh5;
import defpackage.m1o;
import defpackage.n751;
import defpackage.ns31;
import defpackage.ny61;
import defpackage.oh5;
import defpackage.omh0;
import defpackage.ovr0;
import defpackage.pao;
import defpackage.ph5;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qg5;
import defpackage.qh5;
import defpackage.qmf;
import defpackage.qoi0;
import defpackage.rbs;
import defpackage.rh5;
import defpackage.rs31;
import defpackage.ryw;
import defpackage.sg5;
import defpackage.slf;
import defpackage.sls;
import defpackage.tar;
import defpackage.tlf;
import defpackage.u1w;
import defpackage.ug5;
import defpackage.uwf;
import defpackage.uyi0;
import defpackage.vbi0;
import defpackage.vh5;
import defpackage.vii0;
import defpackage.vm41;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wg5;
import defpackage.xb8;
import defpackage.y8f;
import defpackage.ycs;
import defpackage.ype;
import defpackage.z22;
import defpackage.zfl0;
import defpackage.zy11;
import defpackage.zyw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import okhttp3.OkHttpClient;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u001aJ\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0005R\u001b\u00100\u001a\u00020+8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/fragment/BduiFragment;", "Lcom/yandex/fintechsdk/core/architecture/api/fragment/BaseFragment;", "Lzy11;", "Lrh5;", "<init>", "()V", "Landroid/view/ViewGroup;", "Ln751;", "insets", "updateInsets", "(Landroid/view/ViewGroup;Ln751;)V", "", "url", "launchChromeTab", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", ClidProvider.STATE, "", "isStartingFirstTime", "(Landroid/os/Bundle;)Z", "isStartingAfterActivityDeath", "", "resolveInitialDivkitVariables", "()Ljava/util/Map;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "v", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "sideEffect", "(Lrh5;)V", "outState", "onSaveInstanceState", "onDestroyView", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/fragment/c;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/fintechsdk/features/bdui/internal/presentation/fragment/c;", "viewModel", "Lqg5;", "componentStore$delegate", "getComponentStore", "()Lqg5;", "componentStore", "Ltar;", "binding$delegate", "Lvbi0;", "getBinding", "()Ltar;", "binding", "Companion", "ih5", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BduiFragment extends BaseFragment<zy11, rh5> {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private static final ih5 Companion;

    @Deprecated
    public static final String IS_CHANGING_CONFIGURATIONS_KEY = "is_changing_configurations";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final vbi0 binding;

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("binding", 0, "getBinding()Lcom/yandex/fintechsdk/features/bdui/databinding/FinsdkFragmentBduiBinding;", BduiFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
        Companion = new ih5();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectViewModel$2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectFeatureComponentStore$2] */
    public BduiFragment() {
        super(omh0.finsdk_fragment_bdui);
        a80 a80Var = new a80(4, new l95(12, this));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectViewModel$2
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(c.class), new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, a80Var, new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectViewModel$5
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
        BduiFragment$componentStore$2 bduiFragment$componentStore$2 = BduiFragment$componentStore$2.b;
        a aVar = new a(this);
        final ?? r1 = new sls(this) { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectFeatureComponentStore$2
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectFeatureComponentStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(qg5.class), new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectFeatureComponentStore$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, aVar, new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment$special$$inlined$injectFeatureComponentStore$5
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
        this.binding = gh91.d(this, BduiFragment$binding$2.b);
    }

    private final tar getBinding() {
        return (tar) this.binding.getValue(this, $$delegatedProperties[0]);
    }

    private final qg5 getComponentStore() {
        return (qg5) this.componentStore.getValue();
    }

    private final boolean isStartingAfterActivityDeath(Bundle state) {
        return (state == null || state.getBoolean(IS_CHANGING_CONFIGURATIONS_KEY)) ? false : true;
    }

    private final boolean isStartingFirstTime(Bundle state) {
        return state == null;
    }

    private final void launchChromeTab(String url) {
        tlf a = new slf().a();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        a.a(activity, Uri.parse(url));
    }

    private final Map<String, String> resolveInitialDivkitVariables() {
        Bundle bundle;
        Bundle arguments = getArguments();
        if (arguments == null || (bundle = arguments.getBundle("initial_divkit_variables")) == null) {
            return kotlin.collections.b.f();
        }
        Set<String> keySet = bundle.keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : keySet) {
            String string = bundle.getString(str);
            Pair pair = string == null ? null : new Pair(str, string);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.b.s(arrayList);
    }

    private final void updateInsets(ViewGroup viewGroup, n751 n751Var) {
        u1w g = n751Var.a.g(519);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(g.a, g.b, g.c, g.d);
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c viewModel_delegate$lambda$0(BduiFragment bduiFragment) {
        uwf uwfVar = bduiFragment.getComponentStore().b;
        uwfVar.getClass();
        c2r0 c2r0Var = new c2r0(42, 0);
        c2r0Var.a((kg5) uwfVar.c.get());
        c2r0Var.a((kg5) uwfVar.C.get());
        c2r0Var.a((kg5) uwfVar.E.get());
        c2r0Var.a((kg5) uwfVar.G.get());
        c2r0Var.a((kg5) uwfVar.H.get());
        c2r0Var.a((kg5) uwfVar.I.get());
        c2r0Var.a((kg5) uwfVar.J.get());
        c2r0Var.a((kg5) uwfVar.K.get());
        c2r0Var.a((kg5) uwfVar.L.get());
        c2r0Var.a((kg5) uwfVar.Q.get());
        c2r0Var.a((kg5) uwfVar.R.get());
        c2r0Var.a((kg5) uwfVar.S.get());
        c2r0Var.a((kg5) uwfVar.T.get());
        c2r0Var.a((kg5) uwfVar.U.get());
        c2r0Var.a((kg5) uwfVar.V.get());
        c2r0Var.a((kg5) uwfVar.W.get());
        c2r0Var.a((kg5) uwfVar.a0.get());
        c2r0Var.a((kg5) uwfVar.b0.get());
        c2r0Var.a((kg5) uwfVar.c0.get());
        c2r0Var.a((kg5) uwfVar.d0.get());
        c2r0Var.a((kg5) uwfVar.e0.get());
        c2r0Var.a((kg5) uwfVar.f0.get());
        c2r0Var.a((kg5) uwfVar.g0.get());
        c2r0Var.a((kg5) uwfVar.h0.get());
        c2r0Var.a((kg5) uwfVar.i0.get());
        c2r0Var.a((kg5) uwfVar.j0.get());
        c2r0Var.a((kg5) uwfVar.k0.get());
        c2r0Var.a((kg5) uwfVar.m0.get());
        c2r0Var.a((kg5) uwfVar.o0.get());
        c2r0Var.a((kg5) uwfVar.p0.get());
        c2r0Var.a((kg5) uwfVar.q0.get());
        c2r0Var.a((kg5) uwfVar.r0.get());
        c2r0Var.a((kg5) uwfVar.s0.get());
        c2r0Var.a((kg5) uwfVar.t0.get());
        c2r0Var.a((kg5) uwfVar.u0.get());
        c2r0Var.a((kg5) uwfVar.v0.get());
        c2r0Var.a((kg5) uwfVar.w0.get());
        c2r0Var.a((kg5) uwfVar.x0.get());
        c2r0Var.a((kg5) uwfVar.y0.get());
        c2r0Var.a((kg5) uwfVar.z0.get());
        c2r0Var.a((kg5) uwfVar.A0.get());
        c2r0Var.a((kg5) uwfVar.C0.get());
        Set c = c2r0Var.c();
        sg5 sg5Var = uwfVar.a;
        z22 analytics = sg5Var.getAnalytics();
        q5z.h(analytics);
        wg5 wg5Var = new wg5(sg5Var.v());
        ah5 r = sg5Var.r();
        ype E = sg5Var.E();
        ug5 f = sg5Var.f();
        lh5 v = sg5Var.v();
        dh5 p = sg5Var.p();
        vh5 x = sg5Var.x();
        hsb hsbVar = (hsb) uwfVar.x.get();
        iee ieeVar = (iee) uwfVar.M.get();
        lee leeVar = (lee) uwfVar.D0.get();
        fke fkeVar = (fke) uwfVar.y.get();
        LinkedHashMap A = gtq0.A(2);
        z22 analytics2 = sg5Var.getAnalytics();
        q5z.h(analytics2);
        hk3 a = sg5Var.a();
        q5z.h(a);
        DefaultEnvironment environment = sg5Var.getEnvironment();
        q5z.h(environment);
        FlexAdapter m = sg5Var.m();
        dn90 b = sg5Var.b();
        Region O = sg5Var.O();
        q5z.h(O);
        A.put("WebViewConfiguration", new vm41(analytics2, a, environment, m, b, O, new j24(17, sg5Var.w())));
        z22 analytics3 = sg5Var.getAnalytics();
        q5z.h(analytics3);
        xb8 J = sg5Var.J();
        q5z.h(J);
        A.put("CustomViewConfiguration", new ch8(analytics3, J));
        Map unmodifiableMap = A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A);
        qmf qmfVar = (qmf) uwfVar.E0.get();
        sg5Var.k();
        Map map = Collections.EMPTY_MAP;
        q5z.h(map);
        Map map2 = map;
        pao K = sg5Var.K();
        gdr F = sg5Var.F();
        FlexAdapter m2 = sg5Var.m();
        sg5Var.y();
        rbs rbsVar = (rbs) uwfVar.N.get();
        ycs ycsVar = (ycs) uwfVar.F0.get();
        b2w u = sg5Var.u();
        q5z.h(u);
        ryw M = sg5Var.M();
        zyw o = sg5Var.o();
        azw G = sg5Var.G();
        sg5Var.B();
        OkHttpClient.a c2 = sg5Var.c();
        uyi0 L = sg5Var.L();
        com.yandex.fintechsdk.core.navigation.impl.api.router.a router = sg5Var.getRouter();
        q5z.h(router);
        return new c(c, analytics, wg5Var, r, E, f, v, p, x, hsbVar, ieeVar, leeVar, fkeVar, unmodifiableMap, qmfVar, map2, K, F, m2, gzr.a, rbsVar, ycsVar, u, M, o, G, c2, L, router, (zfl0) uwfVar.G0.get(), sg5Var.i(), (ns31) uwfVar.O.get());
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public c getViewModel() {
        return (c) this.viewModel.getValue();
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment, defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        v.setLayoutParams(marginLayoutParams);
        updateInsets(getBinding().b, insets);
        androidx.core.view.b.d(getBinding().d, insets);
        return n751.b;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        c viewModel = getViewModel();
        Theme theme = viewModel.D.getTheme();
        FlexAdapter flexAdapter = viewModel.N;
        if (flexAdapter != null) {
            flexAdapter.updateTheme(theme);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Map<String, String> map;
        FlexAdapter flexAdapter;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) getViewModel().w).a(fzy.c);
        c viewModel = getViewModel();
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        FragmentManager childFragmentManager = getChildFragmentManager();
        viewModel.H.c(requireContext);
        viewModel.P.c(requireActivity);
        viewModel.Q.c(childFragmentManager);
        viewModel.Z.c(viewModel.W);
        if (isStartingFirstTime(savedInstanceState) || isStartingAfterActivityDeath(savedInstanceState)) {
            c viewModel2 = getViewModel();
            Context applicationContext = requireContext().getApplicationContext();
            Map<String, String> resolveInitialDivkitVariables = resolveInitialDivkitVariables();
            FlexAdapter flexAdapter2 = viewModel2.N;
            if (flexAdapter2 != null) {
                List J0 = kotlin.collections.a.J0(viewModel2.c);
                Map map2 = viewModel2.I;
                qmf qmfVar = viewModel2.J;
                Map map3 = viewModel2.K;
                wg5 wg5Var = viewModel2.x;
                b bVar = new b(viewModel2);
                ryw rywVar = viewModel2.R;
                zyw zywVar = viewModel2.S;
                azw azwVar = viewModel2.T;
                vh5 vh5Var = viewModel2.D;
                Integer a = vh5Var.a();
                uyi0 uyi0Var = viewModel2.V;
                gdr gdrVar = viewModel2.M;
                gzr gzrVar = viewModel2.O;
                map = resolveInitialDivkitVariables;
                ah5 ah5Var = viewModel2.y;
                dh5 dh5Var = viewModel2.C;
                ype ypeVar = viewModel2.z;
                OkHttpClient.a aVar = viewModel2.U;
                rbs rbsVar = viewModel2.P;
                lee leeVar = viewModel2.G;
                ycs ycsVar = viewModel2.Q;
                hh5 hh5Var = viewModel2.c0;
                zfl0 zfl0Var = viewModel2.Z;
                pao paoVar = null;
                if (viewModel2.R.a) {
                    pao paoVar2 = viewModel2.L;
                    if (paoVar2 == null) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) viewModel2.w).a(m1o.c);
                    } else {
                        paoVar = paoVar2;
                    }
                }
                flexAdapter = flexAdapter2;
                flexAdapter.init(new FlexDependencies(J0, map2, qmfVar, map3, a, wg5Var, paoVar, bVar, gdrVar, gzrVar, rywVar, zywVar, azwVar, null, uyi0Var, vh5Var, ah5Var, dh5Var, ypeVar, aVar, rbsVar, applicationContext, leeVar, ycsVar, hh5Var, zfl0Var));
            } else {
                map = resolveInitialDivkitVariables;
                flexAdapter = flexAdapter2;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (flexAdapter != null) {
                    flexAdapter.updateVariable(key, value);
                }
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewModel().X();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        FragmentActivity activity = getActivity();
        boolean z = false;
        if (activity != null && activity.isChangingConfigurations()) {
            z = true;
        }
        outState.putBoolean(IS_CHANGING_CONFIGURATIONS_KEY, z);
        FlexAdapter flexAdapter = getViewModel().N;
        if (flexAdapter != null) {
            flexAdapter.saveState(outState);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        FlexAdapter flexAdapter;
        super.onViewCreated(view, savedInstanceState);
        c viewModel = getViewModel();
        FrameLayout frameLayout = getBinding().b;
        FrameLayout frameLayout2 = getBinding().c;
        viewModel.F.c(frameLayout);
        viewModel.G.c(frameLayout2);
        ovr0 ovr0Var = ShimmersFragment.Companion;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        BduiFragment$onViewCreated$1 bduiFragment$onViewCreated$1 = new BduiFragment$onViewCreated$1(0, getViewModel(), c.class, "onBackPressed", "onBackPressed()V", 0);
        ovr0Var.getClass();
        parentFragmentManager.m0("shimmers_fragment_result_id", this, new ag9(bduiFragment$onViewCreated$1));
        boolean z = false;
        if (savedInstanceState == null) {
            ovr0.a(getBinding().d.getId(), getParentFragmentManager(), getComponentStore().b.a.d(), Boolean.valueOf(getComponentStore().b.a.x().getTheme() == Theme.NIGHT));
        }
        c viewModel2 = getViewModel();
        Theme theme = viewModel2.D.getTheme();
        FlexAdapter flexAdapter2 = viewModel2.N;
        if (flexAdapter2 != null) {
            flexAdapter2.updateTheme(theme);
        }
        if (isStartingFirstTime(savedInstanceState)) {
            c viewModel3 = getViewModel();
            FlexAdapter flexAdapter3 = viewModel3.N;
            if (flexAdapter3 != null) {
                flexAdapter3.loadScreen(viewModel3.A);
            }
        } else if (isStartingAfterActivityDeath(savedInstanceState)) {
            c viewModel4 = getViewModel();
            if (viewModel4.S.a && (flexAdapter = viewModel4.N) != null && flexAdapter.restoreState(savedInstanceState)) {
                z = true;
            }
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) viewModel4.w).a(new vii0(z));
            if (!z) {
                viewModel4.B.onError(new RestoreStateException());
            }
        }
        FlexAdapter flexAdapter4 = getViewModel().N;
        if (flexAdapter4 != null) {
            flexAdapter4.updateLifecycleObservers();
        }
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public void sideEffect(rh5 sideEffect) {
        if (sideEffect instanceof ph5) {
            launchChromeTab(((ph5) sideEffect).a);
            return;
        }
        if (sideEffect instanceof qh5) {
            getBinding().c.setVisibility(8);
            getBinding().d.setVisibility(0);
        } else if (!(sideEffect instanceof oh5)) {
            w511.b();
        } else {
            getBinding().c.setVisibility(0);
            getBinding().d.setVisibility(8);
        }
    }
}
