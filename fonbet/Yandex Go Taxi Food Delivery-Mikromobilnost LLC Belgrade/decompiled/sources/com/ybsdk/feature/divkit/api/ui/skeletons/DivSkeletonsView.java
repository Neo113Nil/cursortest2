package com.ybsdk.feature.divkit.api.ui.skeletons;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.aal;
import defpackage.bal;
import defpackage.cal;
import defpackage.cma1;
import defpackage.czf;
import defpackage.dal;
import defpackage.eal;
import defpackage.fnh0;
import defpackage.g5;
import defpackage.gmh;
import defpackage.h791;
import defpackage.h9g;
import defpackage.i5m;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.lwg0;
import defpackage.mpk;
import defpackage.nkp;
import defpackage.ny61;
import defpackage.oti;
import defpackage.pgi;
import defpackage.q5z;
import defpackage.qx21;
import defpackage.r861;
import defpackage.tje;
import defpackage.v0h;
import defpackage.w511;
import defpackage.wzk;
import defpackage.x6k;
import defpackage.x9l;
import defpackage.xah0;
import defpackage.xls0;
import defpackage.xx60;
import defpackage.y9l;
import defpackage.z9l;
import defpackage.zp31;
import defpackage.zvi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n*\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\fJ\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/ybsdk/feature/divkit/api/ui/skeletons/DivSkeletonsView;", "Lcom/ybsdk/widgets/common/shimmer/ShimmerFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyToolbarMargin", "()V", "Leal;", "viewState", "showShimmerOrFallback", "(Leal;)V", "Lcal;", "fallback", "showFallback", "(Lcal;)V", "showCircularProgressIndicator", "Landroid/view/View;", "updateSizeByViewState", "(Landroid/view/View;Leal;)V", "onAttachedToWindow", "render", "Lxls0;", "skeletonStorage", "Lxls0;", "getSkeletonStorage", "()Lxls0;", "setSkeletonStorage", "(Lxls0;)V", "Lx6k;", "defaultDivActionHandler", "Lx6k;", "getDefaultDivActionHandler", "()Lx6k;", "setDefaultDivActionHandler", "(Lx6k;)V", "Lr861;", "binding", "Lr861;", "Companion", "dal", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivSkeletonsView extends ShimmerFrameLayout {
    public static final dal Companion = new dal();
    private final r861 binding;
    public x6k defaultDivActionHandler;
    public xls0 skeletonStorage;

    public DivSkeletonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qx21.a(this, true).inflate(fnh0.ybsdk_skeletons_div_view, this);
        int i2 = xah0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
        if (ybDivView != null) {
            i2 = xah0.progressBar;
            OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i2, this);
            if (operationProgressView != null) {
                this.binding = new r861(this, ybDivView, operationProgressView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyToolbarMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, b.h(lwg0.ybsdk_toolbar_height, this), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$1(DivSkeletonsView divSkeletonsView, Uri uri) {
        return h791.d(((g5) divSkeletonsView.getDefaultDivActionHandler()).a, uri, 14) instanceof v0h;
    }

    private final void showCircularProgressIndicator() {
        stopShimmer();
        this.binding.b.setVisibility(8);
        this.binding.c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFallback(cal fallback) {
        if (fallback instanceof aal) {
            showCircularProgressIndicator();
        } else {
            if (fallback instanceof bal) {
                return;
            }
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShimmerOrFallback(eal viewState) {
        if (viewState.a == null) {
            showFallback(viewState.c);
        } else {
            tje.N(zp31.a(this), null, null, new DivSkeletonsView$showShimmerOrFallback$1(this, viewState, null), 3);
        }
    }

    private final void updateSizeByViewState(View view, eal ealVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        cal calVar = ealVar.c;
        if (calVar instanceof aal) {
            z9l z9lVar = ((aal) calVar).a;
            if (z9lVar instanceof x9l) {
                layoutParams.height = ((x9l) z9lVar).a;
                layoutParams.width = ((x9l) z9lVar).a;
            } else if (!jl40.l(z9lVar, y9l.a)) {
                w511.b();
                return;
            } else {
                layoutParams.height = -2;
                layoutParams.width = -2;
            }
        } else if (!calVar.equals(bal.a)) {
            w511.b();
            return;
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
        view.setLayoutParams(layoutParams);
    }

    public final x6k getDefaultDivActionHandler() {
        x6k x6kVar = this.defaultDivActionHandler;
        if (x6kVar != null) {
            return x6kVar;
        }
        return null;
    }

    public final xls0 getSkeletonStorage() {
        xls0 xls0Var = this.skeletonStorage;
        if (xls0Var != null) {
            return xls0Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        mpk divFeatureDependencies;
        super.onAttachedToWindow();
        int i = 1;
        Fragment u = b.u(this, true);
        if (u != null) {
            ?? r2 = u;
            while (true) {
                if (r2 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof nkp)) {
                        activity = null;
                    }
                    nkp nkpVar = (nkp) activity;
                    r2 = nkpVar == null ? 0 : nkpVar;
                } else if (r2 instanceof nkp) {
                    break;
                } else {
                    r2 = r2.getParentFragment();
                }
            }
            nkp nkpVar2 = (nkp) r2;
            if (nkpVar2 != null && (divFeatureDependencies = nkpVar2.getDivFeatureDependencies()) != null) {
                wzk wzkVar = new wzk();
                i5m.b(new oti(wzkVar, i5m.b(new pgi(wzkVar, new czf(divFeatureDependencies, 3), new czf(divFeatureDependencies, 2), i5m.b(new gmh(wzkVar, new czf(divFeatureDependencies, 0))))), new czf(divFeatureDependencies, i), 9));
                h9g h9gVar = (h9g) divFeatureDependencies;
                xls0 xls0Var = (xls0) h9gVar.F0.get();
                q5z.h(xls0Var);
                this.skeletonStorage = xls0Var;
                this.defaultDivActionHandler = new g5((j3h) h9gVar.E.get());
            }
        }
        this.binding.b.setActionHandler(new zvi(14, this));
    }

    public final void render(final eal viewState) {
        this.binding.c.setVisibility(8);
        this.binding.b.setVisibility(8);
        updateSizeByViewState(this.binding.c, viewState);
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView$render$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    eal ealVar = viewState;
                    this.showShimmerOrFallback(ealVar);
                    if (ealVar.b) {
                        this.applyToolbarMargin();
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
            return;
        }
        showShimmerOrFallback(viewState);
        if (viewState.b) {
            applyToolbarMargin();
        }
    }

    public final void setDefaultDivActionHandler(x6k x6kVar) {
        this.defaultDivActionHandler = x6kVar;
    }

    public final void setSkeletonStorage(xls0 xls0Var) {
        this.skeletonStorage = xls0Var;
    }

    public DivSkeletonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivSkeletonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivSkeletonsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
