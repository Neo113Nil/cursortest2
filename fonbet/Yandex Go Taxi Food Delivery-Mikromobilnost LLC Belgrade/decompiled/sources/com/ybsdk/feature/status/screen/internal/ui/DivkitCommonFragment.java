package com.ybsdk.feature.status.screen.internal.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import defpackage.apn;
import defpackage.asl;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.eal;
import defpackage.g161;
import defpackage.i3y;
import defpackage.lfx;
import defpackage.lpn;
import defpackage.n751;
import defpackage.ny61;
import defpackage.osl;
import defpackage.pks0;
import defpackage.psl;
import defpackage.qas0;
import defpackage.qsl;
import defpackage.rb6;
import defpackage.rr51;
import defpackage.rsl;
import defpackage.sb6;
import defpackage.ssl;
import defpackage.stz0;
import defpackage.tb6;
import defpackage.tcc;
import defpackage.tsl;
import defpackage.u1w;
import defpackage.usl;
import defpackage.vsl;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yon;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zon;
import defpackage.zvi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010\u001cJ!\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u0010\u0018J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00105\u001a\u00020\u0004H\u0014¢\u0006\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/ui/DivkitCommonFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lg161;", "Lvsl;", "Lcom/ybsdk/feature/status/screen/internal/ui/a;", "Lce4;", "Lqsl;", "factoryOfViewModel", "Lsb6;", "bottomBarReporter", "Lzon;", "educationsFeature", "<init>", "(Lqsl;Lsb6;Lzon;)V", "Lssl;", "viewState", "Lzy11;", "renderEducationV2", "(Lssl;)V", "", BackendConfig.Restrictions.ENABLED, "setBackButtonState", "(Z)V", "renderSystemBars", "(Lvsl;)V", "initToolbarDivViews", "()V", "fitsSystemWindow", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onBackPressed", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg161;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "render", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "createViewModel", "()Lcom/ybsdk/feature/status/screen/internal/ui/a;", "Lqsl;", "Lsb6;", "Lzon;", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams;", "screenParams", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "toolbarDivView", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "Llpn;", "educationsV2View", "Llpn;", "feature-divkit-common-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DivkitCommonFragment extends BaseDivContextMvvmFragment<g161, vsl, a> implements ce4 {
    private final sb6 bottomBarReporter;
    private final zon educationsFeature;
    private lpn educationsV2View;
    private final qsl factoryOfViewModel;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private YbDivView toolbarDivView;

    public DivkitCommonFragment(qsl qslVar, sb6 sb6Var, zon zonVar) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = qslVar;
        this.bottomBarReporter = sb6Var;
        this.educationsFeature = zonVar;
        this.screenParams = dcs.c(this);
    }

    private final DivkitCommonScreenParams getScreenParams() {
        return (DivkitCommonScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$3$lambda$1(DivkitCommonFragment divkitCommonFragment) {
        ((a) divkitCommonFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$3$lambda$2(DivkitCommonFragment divkitCommonFragment) {
        ((a) divkitCommonFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [uc5] */
    private final void initToolbarDivViews() {
        YbDivView ybDivView = new YbDivView(getDivContext(), null, 0, 6, null);
        ybDivView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        ybDivView.setActionHandler(new DivkitCommonFragment$initToolbarDivViews$divView$1$1(getViewModel()));
        this.toolbarDivView = ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$0(DivkitCommonFragment divkitCommonFragment, tb6 tb6Var) {
        ((a) divkitCommonFragment.getViewModel()).d0(tb6Var);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderEducationV2(ssl viewState) {
        g161 g161Var = (g161) getBinding();
        yon c = viewState.c();
        if (c == null) {
            return;
        }
        lpn lpnVar = this.educationsV2View;
        if (lpnVar == null) {
            lpnVar = ((apn) this.educationsFeature).a().h(requireContext(), g161Var.o());
            this.educationsV2View = lpnVar;
            lpnVar.setOnDismissListener(new asl(this, 0));
        }
        lpnVar.render(c);
        ((a) getViewModel()).e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderEducationV2$lambda$15$lambda$14$lambda$13(DivkitCommonFragment divkitCommonFragment) {
        divkitCommonFragment.educationsV2View = null;
        return zy11.a;
    }

    private final void renderSystemBars(vsl viewState) {
        DivkitScreenConfig screenConfig = getScreenParams().getScreenConfig();
        ColorModel color = screenConfig.getStatusBar().getColor();
        ThemedParams<Boolean> iconsColor = screenConfig.getStatusBar().getIconsColor();
        boolean z = viewState instanceof ssl;
        if (!z) {
            iconsColor = null;
        }
        setStatusBarColorModel(new z1x0(color, iconsColor));
        setNavigationBarColorModel(new z1x0(screenConfig.getBottomBar().getColor(), z ? screenConfig.getBottomBar().getIconsColor() : null));
    }

    private final void setBackButtonState(boolean enabled) {
        setBackButtonEnabled(enabled);
        setBackButtonVisible(enabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof psl) {
            ((a) getViewModel()).j0(((psl) sideEffect).a());
        } else if (sideEffect instanceof osl) {
            Iterator it = ((osl) sideEffect).a().iterator();
            while (it.hasNext()) {
                ((g161) getBinding()).c.handleUri((Uri) it.next());
            }
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((rsl) this.factoryOfViewModel).a((DivkitCommonScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return getScreenParams().getScreenConfig().getFitsSystemWindow();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public g161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        g161 p = g161.p(inflater, container);
        ErrorView errorView = p.d;
        errorView.setPrimaryButtonOnClickListener(new asl(this, 1));
        errorView.setSecondaryButtonClickListener(new asl(this, 2));
        p.c.setActionHandler(new DivkitCommonFragment$getViewBinding$1$3(getViewModel()));
        initToolbarDivViews();
        YbDivView ybDivView = this.toolbarDivView;
        if (ybDivView != null) {
            p.f.setRightPartCustomView(ybDivView);
        }
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        g161 g161Var = (g161) getBinding();
        if (getIsNewInsetsHandlingEnabled() && fitsSystemWindow()) {
            return super.onApplyInsets(insets);
        }
        if (fitsSystemWindow()) {
            return insets;
        }
        u1w h = insets.a.h(519);
        int i = h.d;
        int i2 = h.b;
        ToolbarView toolbarView = g161Var.f;
        BottomBarNavigation bottomBarNavigation = g161Var.b;
        ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        toolbarView.setLayoutParams(marginLayoutParams);
        ErrorView errorView = g161Var.d;
        errorView.setPadding(errorView.getPaddingLeft(), i2, errorView.getPaddingRight(), errorView.getPaddingBottom() + (bottomBarNavigation.getVisibility() == 0 ? 0 : i));
        ViewGroup.LayoutParams layoutParams2 = bottomBarNavigation.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, i);
        bottomBarNavigation.setLayoutParams(marginLayoutParams2);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).c0();
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.toolbarDivView = null;
        this.educationsV2View = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((a) getViewModel()).f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((a) getViewModel()).i0(getViewLifecycleOwner().getLifecycle());
        ((g161) getBinding()).b.setOnTabClickListener(new zvi(16, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(vsl viewState) {
        YbDivView ybDivView;
        boolean z = viewState instanceof usl;
        ((g161) getBinding()).e.setVisibility(z ? 0 : 8);
        boolean z2 = viewState instanceof tsl;
        ((g161) getBinding()).d.setVisibility(z2 ? 0 : 8);
        ((g161) getBinding()).c.setVisibility(!z ? 0 : 8);
        ((g161) getBinding()).b.setVisibility(viewState.a() != null ? 0 : 8);
        rb6 a = viewState.a();
        if (a != null) {
            ((g161) getBinding()).b.render(a);
            List a2 = a.a();
            ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(((tb6) it.next()).a());
            }
            this.bottomBarReporter.c(arrayList.toString());
        }
        renderSystemBars(viewState);
        if (z) {
            DivSkeletonsView divSkeletonsView = ((g161) getBinding()).e;
            usl uslVar = (usl) viewState;
            String c = uslVar.c();
            divSkeletonsView.render(new eal(c != null ? new pks0(c) : null, false, null, 6));
            setBackButtonState(uslVar.b());
            return;
        }
        if (!(viewState instanceof ssl)) {
            if (!z2) {
                w511.b();
                return;
            }
            tsl tslVar = (tsl) viewState;
            setBackButtonState(tslVar.b());
            ((g161) getBinding()).d.render(tslVar.c());
            return;
        }
        ssl sslVar = (ssl) viewState;
        stz0 f = sslVar.f();
        if (f != null) {
            ((g161) getBinding()).f.render(f);
        }
        ((g161) getBinding()).f.setVisibility((!sslVar.d() || sslVar.f() == null) ? 8 : 0);
        setBackButtonState(sslVar.d());
        YbDivView.setData$default(((g161) getBinding()).c, sslVar.b(), null, null, false, 14, null);
        renderEducationV2(sslVar);
        YbDivView ybDivView2 = this.toolbarDivView;
        if (ybDivView2 != null) {
            ybDivView2.setVisibility(sslVar.e() != null ? 0 : 8);
        }
        rr51 e = sslVar.e();
        if (e == null || (ybDivView = this.toolbarDivView) == null) {
            return;
        }
        YbDivView.setData$default(ybDivView, e, null, null, false, 14, null);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
