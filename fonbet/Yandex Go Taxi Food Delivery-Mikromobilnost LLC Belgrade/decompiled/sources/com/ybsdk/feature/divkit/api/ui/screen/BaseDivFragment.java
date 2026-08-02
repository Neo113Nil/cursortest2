package com.ybsdk.feature.divkit.api.ui.screen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.a05;
import defpackage.b661;
import defpackage.c5z;
import defpackage.f02;
import defpackage.k751;
import defpackage.lfx;
import defpackage.mw2;
import defpackage.n751;
import defpackage.p05;
import defpackage.q05;
import defpackage.r05;
import defpackage.s05;
import defpackage.t05;
import defpackage.u1w;
import defpackage.w511;
import defpackage.x651;
import defpackage.y651;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u0005B-\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivFragment;", "La05;", "S", "Lp05;", "VM", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lb661;", "Lt05;", "Ljava/lang/Class;", "viewModelClass", "", "backVisible", "Lcom/ybsdk/core/utils/ColorModel;", "statusBarColor", "<init>", "(Ljava/lang/Class;Ljava/lang/Boolean;Lcom/ybsdk/core/utils/ColorModel;)V", "fitsSystemWindow", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb661;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Lzy11;", "onDestroyView", "()V", "viewState", "render", "(Lt05;)V", "parent", "attachToParent", "Landroid/view/View;", "createShimmerView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroid/view/View;", "progressView", "Landroid/view/View;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseDivFragment<S extends a05, VM extends p05> extends BaseDivContextMvvmFragment<b661, t05, VM> {
    private View progressView;

    public BaseDivFragment(Class<VM> cls, Boolean bool, ColorModel colorModel) {
        super(bool, 48, colorModel, null, cls, 8, null);
    }

    public static /* synthetic */ View createShimmerView$default(BaseDivFragment baseDivFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: createShimmerView");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return baseDivFragment.createShimmerView(layoutInflater, viewGroup, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$2$lambda$0(BaseDivFragment baseDivFragment) {
        ((p05) baseDivFragment.getViewModel()).b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$6(BaseDivFragment baseDivFragment, t05 t05Var) {
        q05 q05Var = (q05) t05Var;
        YbDivView.setData$default(((b661) baseDivFragment.getBinding()).c, q05Var.a(), null, null, false, 14, null);
        List<c5z> b = q05Var.b();
        if (b.isEmpty()) {
            b = null;
        }
        if (b != null) {
            ((b661) baseDivFragment.getBinding()).c.updateLocalVariables(b);
        }
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    public View createShimmerView(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        return null;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public b661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        b661 p = b661.p(inflater, container);
        ErrorView errorView = p.d;
        errorView.setPrimaryButtonOnClickListener(new BaseDivFragment$getViewBinding$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new BaseDivFragment$getViewBinding$1$2(getViewModel()));
        p.c.setActionHandler(new BaseDivFragment$getViewBinding$1$3(getViewModel()));
        p.f.setOnCloseButtonClickListener(new f02(20, this));
        View createShimmerView$default = createShimmerView$default(this, inflater, p.o(), false, 4, null);
        FullscreenStatusView fullscreenStatusView = p.e;
        if (createShimmerView$default != null) {
            fullscreenStatusView.setVisibility(8);
            p.o().addView(createShimmerView$default);
        } else {
            createShimmerView$default = fullscreenStatusView;
        }
        this.progressView = createShimmerView$default;
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        FrameLayout o = ((b661) getBinding()).o();
        k751 k751Var = insets.a;
        u1w h = k751Var.h(519);
        u1w g = k751Var.g(8);
        int i = h.b;
        int i2 = h.d;
        o.setPadding(o.getPaddingLeft(), i, o.getPaddingRight(), i2);
        x651 x651Var = new x651(insets);
        u1w c = u1w.c(h.a, 0, h.c, 0);
        y651 y651Var = x651Var.a;
        y651Var.c(519, c);
        u1w g2 = k751Var.g(519);
        y651Var.b(519, u1w.c(g2.a, 0, g2.c, 0));
        int i3 = g.a;
        int i4 = g.b;
        int i5 = g.c;
        int i6 = g.d - i2;
        y651Var.b(8, u1w.c(i3, i4, i5, i6 >= 0 ? i6 : 0));
        return y651Var.h();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.progressView = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(t05 viewState) {
        View view = this.progressView;
        if (view != null) {
            view.setVisibility(viewState instanceof s05 ? 0 : 8);
        }
        boolean z = viewState instanceof s05;
        if (z) {
            s05 s05Var = (s05) viewState;
            if (s05Var.a() != null) {
                View view2 = this.progressView;
                ShimmerFrameLayout shimmerFrameLayout = view2 instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view2 : null;
                if (shimmerFrameLayout != null) {
                    shimmerFrameLayout.render(s05Var.a());
                }
            }
        }
        boolean z2 = viewState instanceof q05;
        ((b661) getBinding()).b.setVisibility(z2 ? 0 : 8);
        boolean z3 = viewState instanceof r05;
        if (z3) {
            ((b661) getBinding()).d.render(((r05) viewState).a());
        } else if (z2) {
            ((b661) getBinding()).f.setVisibility(0);
            ((b661) getBinding()).f.render(((q05) viewState).c());
            safePost(new mw2(16, this, viewState));
        } else if (!z) {
            w511.b();
            return;
        }
        ((b661) getBinding()).d.setVisibility(z3 ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    public /* synthetic */ BaseDivFragment(Class cls, Boolean bool, ColorModel colorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : colorModel);
    }
}
