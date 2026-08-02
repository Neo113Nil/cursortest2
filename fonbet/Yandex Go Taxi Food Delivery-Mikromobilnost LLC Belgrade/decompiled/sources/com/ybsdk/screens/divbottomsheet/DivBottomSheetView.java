package com.ybsdk.screens.divbottomsheet;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.result.ResultType;
import com.ybsdk.core.mvp.widgets.MviFrameLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.akf;
import defpackage.amh;
import defpackage.bkf;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.e061;
import defpackage.eal;
import defpackage.i3y;
import defpackage.jah0;
import defpackage.lrp0;
import defpackage.lzz0;
import defpackage.mhk;
import defpackage.n751;
import defpackage.nhk;
import defpackage.ny61;
import defpackage.o6;
import defpackage.ohk;
import defpackage.phk;
import defpackage.qmh0;
import defpackage.qx21;
import defpackage.rm;
import defpackage.sls;
import defpackage.upl;
import defpackage.v0h;
import defpackage.v4b1;
import defpackage.v8e;
import defpackage.w0h;
import defpackage.w511;
import defpackage.wqj;
import defpackage.wz51;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.xx60;
import defpackage.y0h;
import defpackage.z2z;
import defpackage.zvi;
import defpackage.zy11;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetView;", "Lcom/ybsdk/core/mvp/widgets/MviFrameLayout;", "Lphk;", "", "Landroid/content/Context;", "context", "Lcom/ybsdk/screens/divbottomsheet/c;", "viewModel", "<init>", "(Landroid/content/Context;Lcom/ybsdk/screens/divbottomsheet/c;)V", "Lohk;", ResultType.RESULT_TYPE_LOADING, "(Lohk;)Ljava/lang/Object;", "viewState", "Lzy11;", "setAccessibilityFocus", "(Lphk;)V", "setInsetsListeners", "()V", "onAttachedToWindow", "onDetachedFromWindow", "render", "Lcom/ybsdk/screens/divbottomsheet/c;", "Le061;", "binding", "Le061;", "Lupl;", "divViewVisibilityLogHelper", "Lupl;", "Lbkf;", "customInsetsHandlingBehaviourProvider$delegate", "Li3y;", "getCustomInsetsHandlingBehaviourProvider", "()Lbkf;", "customInsetsHandlingBehaviourProvider", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DivBottomSheetView extends MviFrameLayout<phk, Object> {
    private final e061 binding;

    /* renamed from: customInsetsHandlingBehaviourProvider$delegate, reason: from kotlin metadata */
    private final i3y customInsetsHandlingBehaviourProvider;
    private final upl divViewVisibilityLogHelper;
    private final c viewModel;

    public DivBottomSheetView(Context context, c cVar) {
        super(context, null, 0, 0, cVar, 14, null);
        View O;
        this.viewModel = cVar;
        View inflate = qx21.a(this, false).inflate(qmh0.ybsdk_bottom_sheet, (ViewGroup) this, false);
        addView(inflate);
        int i = jah0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = jah0.divkitShimmerView;
            DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
            if (divSkeletonsView != null && (O = cma1.O((i = jah0.error), inflate)) != null) {
                rm o = rm.o(O);
                i = jah0.shimmer;
                View O2 = cma1.O(i, inflate);
                if (O2 != null) {
                    this.binding = new e061((FrameLayout) inflate, ybDivView, divSkeletonsView, o, new wz51((ShimmerFrameLayout) O2, 3));
                    this.divViewVisibilityLogHelper = new upl(ybDivView);
                    this.customInsetsHandlingBehaviourProvider = kotlin.a.b(LazyThreadSafetyMode.NONE, new amh(27, this));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final bkf customInsetsHandlingBehaviourProvider_delegate$lambda$1(DivBottomSheetView divBottomSheetView) {
        Fragment u = com.ybsdk.core.utils.ext.view.b.u(divBottomSheetView, true);
        if (u != null) {
            ?? r1 = u;
            while (true) {
                if (r1 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof bkf)) {
                        activity = null;
                    }
                    bkf bkfVar = (bkf) activity;
                    r1 = bkfVar == null ? 0 : bkfVar;
                } else {
                    if (r1 instanceof bkf) {
                        break;
                    }
                    r1 = r1.getParentFragment();
                }
            }
            bkf bkfVar2 = (bkf) r1;
            if (bkfVar2 != null) {
                return bkfVar2;
            }
        }
        x4c.g("Can`t find Fragment or Activity with CustomInsetsHandlingFlagProvider", null, null, Collections.singletonList(lrp0.m), 6);
        return akf.a;
    }

    private final bkf getCustomInsetsHandlingBehaviourProvider() {
        return (bkf) this.customInsetsHandlingBehaviourProvider.getValue();
    }

    private final Object loading(ohk ohkVar) {
        e061 e061Var = this.binding;
        eal ealVar = ohkVar.a;
        if (ealVar == null) {
            e061Var.e.b.setVisibility(0);
            return e061Var;
        }
        e061Var.c.render(ealVar);
        e061Var.c.setVisibility(0);
        e061Var.e.b.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$2(DivBottomSheetView divBottomSheetView, Uri uri) {
        c cVar = divBottomSheetView.viewModel;
        z2z c = cVar.B.c(uri.toString());
        y0h y0hVar = c.a;
        if (y0hVar instanceof v0h) {
            v0h v0hVar = (v0h) y0hVar;
            if (!v0hVar.a.isEmpty() || v0hVar.c == DeeplinkHandleResult$DeeplinkType.ACTION) {
                ((sls) cVar.z.b).invoke();
                return true;
            }
        } else if (!y0hVar.equals(w0h.a) && !y0hVar.equals(x0h.a)) {
            w511.b();
            return false;
        }
        return c.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$8$lambda$3(DivBottomSheetView divBottomSheetView, View view) {
        divBottomSheetView.viewModel.X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccessibilityFocus(phk viewState) {
        View view;
        if (isAttachedToWindow()) {
            if (viewState instanceof mhk) {
                view = this.binding.b;
            } else if (viewState instanceof nhk) {
                view = (ConstraintLayout) this.binding.d.b;
            } else {
                if (!(viewState instanceof ohk)) {
                    w511.b();
                    return;
                }
                view = this.binding.e.b;
            }
            int importantForAccessibility = view.getImportantForAccessibility();
            view.setImportantForAccessibility(1);
            com.ybsdk.core.utils.ext.view.b.n(importantForAccessibility, view);
        }
    }

    private final void setInsetsListeners() {
        if (getCustomInsetsHandlingBehaviourProvider().isNewBottomSheetInsetsHandlingEnabled()) {
            if (getCustomInsetsHandlingBehaviourProvider().getDrawSdkUnderSafeArea() || !getCustomInsetsHandlingBehaviourProvider().isShownAsSlidableView()) {
                com.ybsdk.core.utils.ext.view.b.w(this, new v8e(18, this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setInsetsListeners$lambda$12(DivBottomSheetView divBottomSheetView, View view, n751 n751Var) {
        int i = n751Var.a.h(519).d;
        ShimmerFrameLayout shimmerFrameLayout = divBottomSheetView.binding.e.b;
        shimmerFrameLayout.setPadding(shimmerFrameLayout.getPaddingLeft(), shimmerFrameLayout.getPaddingTop(), shimmerFrameLayout.getPaddingRight(), i);
        ConstraintLayout constraintLayout = (ConstraintLayout) divBottomSheetView.binding.d.b;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), i);
        return n751Var;
    }

    @Override // com.ybsdk.core.mvp.widgets.CoroutinesFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.b.setActionHandler(new zvi(12, this));
        upl uplVar = this.divViewVisibilityLogHelper;
        o6 o6Var = uplVar.c;
        if (o6Var != null) {
            com.ybsdk.core.utils.ext.view.b.p(uplVar.a, o6Var);
        }
        setInsetsListeners();
    }

    @Override // com.ybsdk.core.mvp.widgets.MviFrameLayout, com.ybsdk.core.mvp.widgets.CoroutinesFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.divViewVisibilityLogHelper.a.tryLogVisibility();
    }

    @Override // com.ybsdk.core.mvp.widgets.MviFrameLayout
    public void render(phk viewState) {
        CharSequence a;
        CharSequence a2;
        e061 e061Var = this.binding;
        if (viewState instanceof ohk) {
            loading((ohk) viewState);
        } else {
            e061Var.e.b.setVisibility(8);
            e061Var.c.setVisibility(8);
        }
        boolean z = viewState instanceof mhk;
        if (z) {
            YbDivView.setData$default(e061Var.b, ((mhk) viewState).a, null, null, false, 14, null);
        }
        rm rmVar = e061Var.d;
        TraceIdErrorView traceIdErrorView = (TraceIdErrorView) rmVar.g;
        ((YbButtonView) rmVar.d).setOnClickListener(new cmi(6, this));
        boolean z2 = viewState instanceof nhk;
        ((ConstraintLayout) rmVar.b).setVisibility(z2 ? 0 : 8);
        e061Var.b.setVisibility(z ? 0 : 8);
        nhk nhkVar = z2 ? (nhk) viewState : null;
        if (nhkVar != null) {
            lzz0 lzz0Var = nhkVar.d;
            v4b1.k(nhkVar.c, (ImageView) rmVar.c, null, null, 6);
            Text text = nhkVar.a;
            if (text != null && (a2 = com.ybsdk.core.utils.text.d.a(getContext(), text)) != null) {
                ((TextView) rmVar.e).setText(a2);
            }
            Text text2 = nhkVar.b;
            if (text2 != null && (a = com.ybsdk.core.utils.text.d.a(getContext(), text2)) != null) {
                ((TextView) rmVar.f).setText(a);
            }
            traceIdErrorView.setVisibility(lzz0Var != null ? 0 : 8);
            if (lzz0Var != null) {
                traceIdErrorView.render(lzz0Var);
            }
        }
        post(new wqj(3, this, viewState));
    }
}
