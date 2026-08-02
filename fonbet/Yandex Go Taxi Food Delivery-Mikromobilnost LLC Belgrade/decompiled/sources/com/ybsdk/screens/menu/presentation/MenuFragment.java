package com.ybsdk.screens.menu.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.ao10;
import defpackage.ce4;
import defpackage.ck10;
import defpackage.eal;
import defpackage.f761;
import defpackage.h9g;
import defpackage.i3y;
import defpackage.j8g;
import defpackage.k751;
import defpackage.lfx;
import defpackage.n751;
import defpackage.ny61;
import defpackage.qa60;
import defpackage.qas0;
import defpackage.qk10;
import defpackage.rr51;
import defpackage.tw51;
import defpackage.ung0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zn10;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0010J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/ybsdk/screens/menu/presentation/MenuFragment;", "Lce4;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lf761;", "Lao10;", "Lcom/ybsdk/screens/menu/presentation/b;", "Ltw51;", "component", "Lcom/ybsdk/rconfig/b;", "remoteConfig", "Lqa60;", "nfcViewFeature", "<init>", "(Ltw51;Lcom/ybsdk/rconfig/b;Lqa60;)V", "Lzy11;", "initToolbarDivViews", "()V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/screens/menu/presentation/b;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lf761;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "onResume", "onDestroyView", "viewState", "render", "(Lao10;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onBackPressed", "Ltw51;", "Lcom/ybsdk/rconfig/b;", "Lqa60;", "Lck10;", "settingsComponent$delegate", "Li3y;", "getSettingsComponent", "()Lck10;", "settingsComponent", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "toolbarDivView", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MenuFragment extends BaseDivContextMvvmFragment<f761, ao10, b> implements ce4 {
    private final tw51 component;
    private final qa60 nfcViewFeature;
    private final com.ybsdk.rconfig.b remoteConfig;

    /* renamed from: settingsComponent$delegate, reason: from kotlin metadata */
    private final i3y settingsComponent;
    private YbDivView toolbarDivView;

    public MenuFragment(tw51 tw51Var, com.ybsdk.rconfig.b bVar, qa60 qa60Var) {
        super(null, null, null, null, b.class, 15, null);
        this.component = tw51Var;
        this.remoteConfig = bVar;
        this.nfcViewFeature = qa60Var;
        this.settingsComponent = kotlin.a.a(new qk10(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ b access$getViewModel(MenuFragment menuFragment) {
        return (b) menuFragment.getViewModel();
    }

    private final ck10 getSettingsComponent() {
        return (ck10) this.settingsComponent.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [uc5] */
    private final void initToolbarDivViews() {
        YbDivView ybDivView = new YbDivView(getDivContext(), null, 0, 6, null);
        ybDivView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        ybDivView.setActionHandler(new MenuFragment$initToolbarDivViews$divView$1$1(getViewModel()));
        this.toolbarDivView = ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$3(MenuFragment menuFragment) {
        ((b) menuFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ck10 settingsComponent_delegate$lambda$0(MenuFragment menuFragment) {
        return ((h9g) menuFragment.component).D();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof zn10) {
            Toast.makeText(requireContext(), d.a(requireContext(), ((zn10) sideEffect).a()), 0).show();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((j8g) getSettingsComponent()).a();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public f761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        f761 p = f761.p(inflater, container);
        initToolbarDivViews();
        YbDivView ybDivView = this.toolbarDivView;
        if (ybDivView != null) {
            p.f.setRightPartCustomView(ybDivView);
        }
        com.ybsdk.core.utils.ext.view.b.x(ung0.ybColor_background_secondary, p.o());
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        k751 k751Var = insets.a;
        ToolbarView toolbarView = ((f761) getBinding()).f;
        ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = k751Var.h(519).b;
        toolbarView.setLayoutParams(marginLayoutParams);
        ErrorView errorView = ((f761) getBinding()).c;
        errorView.setPadding(errorView.getPaddingLeft(), k751Var.h(519).b, errorView.getPaddingRight(), k751Var.h(2).d);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((b) getViewModel()).d0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.toolbarDivView = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((b) getViewModel()).e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((f761) getBinding()).b.setActionHandler(new MenuFragment$onViewCreated$1(getViewModel()));
        ((f761) getBinding()).c.setPrimaryButtonOnClickListener(new qk10(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ao10 viewState) {
        YbDivView ybDivView;
        ((f761) getBinding()).f.render(viewState.g());
        ((f761) getBinding()).c.render(viewState.d());
        ((f761) getBinding()).b.setVisibility(viewState.a() == null ? 8 : 0);
        rr51 a = viewState.a();
        if (a != null) {
            YbDivView.setData$default(((f761) getBinding()).b, a, viewState.b(), null, false, 12, null);
        }
        ((f761) getBinding()).e.setVisibility(viewState.c() == null ? 8 : 0);
        eal c = viewState.c();
        if (c != null) {
            ((f761) getBinding()).e.render(c);
        }
        com.ybsdk.core.utils.ext.view.b.c(((f761) getBinding()).d, viewState.e(), 0L, 0, 0L, null, 30);
        YbDivView ybDivView2 = this.toolbarDivView;
        if (ybDivView2 != null) {
            ybDivView2.setVisibility(viewState.h() != null ? 0 : 8);
        }
        rr51 h = viewState.h();
        if (h != null && (ybDivView = this.toolbarDivView) != null) {
            YbDivView.setData$default(ybDivView, h, null, null, false, 14, null);
        }
        setStatusBarColorModel(viewState.f());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
