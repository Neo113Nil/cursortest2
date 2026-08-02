package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.TransfersDashboardErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.akb1;
import defpackage.b64;
import defpackage.cch0;
import defpackage.cma1;
import defpackage.eal;
import defpackage.jl40;
import defpackage.l7n;
import defpackage.lls0;
import defpackage.lv01;
import defpackage.ma61;
import defpackage.n961;
import defpackage.no01;
import defpackage.noh0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pv01;
import defpackage.qv01;
import defpackage.rje;
import defpackage.rv01;
import defpackage.sls;
import defpackage.sv01;
import defpackage.tls;
import defpackage.tv01;
import defpackage.ung0;
import defpackage.uv01;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.x5h0;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u00026#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001e\u001a\u00020\u000e2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00105\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00000\u0000018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardSlideableView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", ClidProvider.STATE, "Lzy11;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lkotlin/Function0;", "listener", "setOnRetryClickListener", "(Lsls;)V", "Lno01;", "shutterSizes", "setShutterSizes", "(Lno01;)V", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setDivkitActionHandler", "(Ltls;)V", BackendConfig.Restrictions.ENABLED, "setDivKitSkeletonsEnabled", "(Z)V", "Luv01;", "render", "(Luv01;)V", "boundary", "setErrorViewBoundary", "(Ljava/lang/Integer;)V", "onRetryClickListener", "Lsls;", "divKitSkeletonsEnabled", "Z", "Lno01;", "Lma61;", "binding", "Lma61;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "kotlin.jvm.PlatformType", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "ExpandedSavedState", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransfersDashboardSlideableView extends FrameLayout {
    private final ma61 binding;
    private boolean divKitSkeletonsEnabled;
    private sls onRetryClickListener;
    private no01 shutterSizes;

    public TransfersDashboardSlideableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(noh0.ybsdk_transfers_dashboard_slideable_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = cch0.divkitShimmerView;
        DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i3, inflate);
        if (divSkeletonsView != null) {
            i3 = cch0.transfersDashboardDivView;
            YbDivView ybDivView = (YbDivView) cma1.O(i3, inflate);
            if (ybDivView != null) {
                i3 = cch0.transfersDashboardErrorView;
                TransfersDashboardErrorView transfersDashboardErrorView = (TransfersDashboardErrorView) cma1.O(i3, inflate);
                if (transfersDashboardErrorView != null && (O = cma1.O((i3 = cch0.transfersDashboardSkeleton), inflate)) != null) {
                    int i4 = cch0.headlingPart;
                    if (((SkeletonView) cma1.O(i4, O)) != null) {
                        i4 = cch0.headlingPart2;
                        if (((SkeletonView) cma1.O(i4, O)) != null && (O2 = cma1.O((i4 = cch0.promoRow1), O)) != null) {
                            l7n.p(O2);
                            i4 = cch0.promoRow2;
                            View O3 = cma1.O(i4, O);
                            if (O3 != null) {
                                l7n.p(O3);
                                i4 = cch0.transferCard1;
                                if (((SkeletonView) cma1.O(i4, O)) != null) {
                                    i4 = cch0.transferCard2;
                                    if (((SkeletonView) cma1.O(i4, O)) != null) {
                                        i4 = cch0.transferCard3;
                                        if (((SkeletonView) cma1.O(i4, O)) != null) {
                                            n961 n961Var = new n961((ShimmerFrameLayout) O, 3);
                                            int i5 = cch0.transfersDashboardSkeletonWithWidget;
                                            View O4 = cma1.O(i5, inflate);
                                            if (O4 != null) {
                                                int i6 = cch0.skeletonHeadlingPart;
                                                if (((SkeletonView) cma1.O(i6, O4)) != null) {
                                                    i6 = cch0.skeletonTransferCard1;
                                                    if (((SkeletonView) cma1.O(i6, O4)) != null) {
                                                        i6 = cch0.skeletonTransferCard2;
                                                        if (((SkeletonView) cma1.O(i6, O4)) != null) {
                                                            i6 = cch0.skeletonTransferCard3;
                                                            if (((SkeletonView) cma1.O(i6, O4)) != null) {
                                                                i6 = cch0.skeletonWidgetPart;
                                                                if (((SkeletonView) cma1.O(i6, O4)) != null) {
                                                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                                                    ma61 ma61Var = new ma61(frameLayout, divSkeletonsView, ybDivView, transfersDashboardErrorView, n961Var, new n961((ShimmerFrameLayout) O4, 4));
                                                                    frameLayout.setClipToOutline(false);
                                                                    float f = lv01.a;
                                                                    float[] fArr = {f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
                                                                    CoreShapeDrawable.Companion.getClass();
                                                                    CoreShapeDrawable coreShapeDrawable = new CoreShapeDrawable(fArr, new RoundRectShape(fArr, null, null));
                                                                    coreShapeDrawable.getPaint().setColor(rje.a(frameLayout.getContext(), ung0.ybColor_background_primary));
                                                                    coreShapeDrawable.getPaint().setShadowLayer(lv01.b, 0.0f, 0.0f, rje.a(frameLayout.getContext(), ung0.ybColor_other_shadow));
                                                                    LayerDrawable layerDrawable = new LayerDrawable(new CoreShapeDrawable[]{coreShapeDrawable});
                                                                    layerDrawable.setLayerInset(0, 0, 16, 0, 0);
                                                                    frameLayout.setBackground(layerDrawable);
                                                                    transfersDashboardErrorView.setHyperLinkOnClickListener(new pv01(i2, this));
                                                                    this.binding = ma61Var;
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                ny61.t("Missing required view with ID: ".concat(O4.getResources().getResourceName(i6)));
                                                throw null;
                                            }
                                            i3 = i5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i4)));
                    throw null;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 binding$lambda$2$lambda$1(TransfersDashboardSlideableView transfersDashboardSlideableView) {
        sls slsVar = transfersDashboardSlideableView.onRetryClickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    private final BottomSheetBehavior<TransfersDashboardSlideableView> getBottomSheetBehavior() {
        return BottomSheetBehavior.D(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        ExpandedSavedState expandedSavedState = state instanceof ExpandedSavedState ? (ExpandedSavedState) state : null;
        if (expandedSavedState == null) {
            return;
        }
        getBottomSheetBehavior().V(expandedSavedState.getPeekHeight(), false);
        getBottomSheetBehavior().P(expandedSavedState.getExpandedOffset());
        super.onRestoreInstanceState(expandedSavedState.getParentSavedState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new ExpandedSavedState(getBottomSheetBehavior().G(), getBottomSheetBehavior().F(), super.onSaveInstanceState());
    }

    public final void render(uv01 state) {
        this.binding.e.b.setVisibility((!this.divKitSkeletonsEnabled && (state instanceof sv01) && ((sv01) state).a == TransfersDashboardSlideableView$State$Loading$SkeletonType.DEFAULT) ? 0 : 8);
        this.binding.f.b.setVisibility((!this.divKitSkeletonsEnabled && (state instanceof sv01) && ((sv01) state).a == TransfersDashboardSlideableView$State$Loading$SkeletonType.WITH_WIDGET) ? 0 : 8);
        boolean z = this.divKitSkeletonsEnabled && (state instanceof sv01);
        this.binding.b.setVisibility(z ? 0 : 8);
        if (z) {
            this.binding.b.render(new eal(lls0.b, false, null, 6));
        }
        boolean z2 = state instanceof qv01;
        this.binding.d.setVisibility(z2 ? 0 : 8);
        boolean z3 = state instanceof tv01;
        this.binding.c.setVisibility(z3 ? 0 : 8);
        this.binding.a.setVisibility(state instanceof rv01 ? 8 : 0);
        if (z2) {
            this.binding.d.render(((qv01) state).a);
            return;
        }
        if (z3) {
            YbDivView.setData$default(this.binding.c, ((tv01) state).a, null, null, false, 14, null);
        } else {
            if ((state instanceof sv01) || state.equals(rv01.a)) {
                return;
            }
            w511.b();
        }
    }

    public final void setDivKitSkeletonsEnabled(boolean enabled) {
        this.divKitSkeletonsEnabled = enabled;
    }

    public final void setDivkitActionHandler(tls handler) {
        this.binding.c.setActionHandler(handler);
    }

    public final void setErrorViewBoundary(Integer boundary) {
        no01 no01Var = this.shutterSizes;
        float f = no01Var != null ? no01Var.c : 0.5f;
        float height = getHeight() * f;
        float height2 = getHeight();
        if (boundary == null) {
            return;
        }
        float c = 1.0f - ((y6i0.c(boundary.intValue(), height, height2) - height) / (height2 - height));
        Context context = getContext();
        int i = x5h0.ybsdk_transfers_dashboard_error_view_vertical_bias;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        this.binding.d.setTranslationY(-((1.0f - f) * getHeight() * (1.0f - typedValue.getFloat()) * c));
        this.binding.d.setAlpha(((float) boundary.intValue()) <= ((float) b.h(vvg0.ybsdk_qr_reader_minimal_bottom_offset, this)) + ((float) akb1.e(getContext(), "navigation_bar_height")) ? 0.0f : 1.0f);
    }

    public final void setOnRetryClickListener(sls listener) {
        this.onRetryClickListener = listener;
    }

    public final void setShutterSizes(no01 shutterSizes) {
        this.shutterSizes = shutterSizes;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0083\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardSlideableView$ExpandedSavedState;", "Landroid/os/Parcelable;", "", "peekHeight", "expandedOffset", "parentSavedState", "<init>", "(IILandroid/os/Parcelable;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "()Landroid/os/Parcelable;", "copy", "(IILandroid/os/Parcelable;)Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardSlideableView$ExpandedSavedState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getPeekHeight", "getExpandedOffset", "Landroid/os/Parcelable;", "getParentSavedState", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExpandedSavedState implements Parcelable {
        public static final Parcelable.Creator<ExpandedSavedState> CREATOR = new Creator();
        private final int expandedOffset;
        private final Parcelable parentSavedState;
        private final int peekHeight;

        public ExpandedSavedState(int i, int i2, Parcelable parcelable) {
            this.peekHeight = i;
            this.expandedOffset = i2;
            this.parentSavedState = parcelable;
        }

        public static /* synthetic */ ExpandedSavedState copy$default(ExpandedSavedState expandedSavedState, int i, int i2, Parcelable parcelable, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = expandedSavedState.peekHeight;
            }
            if ((i3 & 2) != 0) {
                i2 = expandedSavedState.expandedOffset;
            }
            if ((i3 & 4) != 0) {
                parcelable = expandedSavedState.parentSavedState;
            }
            return expandedSavedState.copy(i, i2, parcelable);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPeekHeight() {
            return this.peekHeight;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExpandedOffset() {
            return this.expandedOffset;
        }

        /* renamed from: component3, reason: from getter */
        public final Parcelable getParentSavedState() {
            return this.parentSavedState;
        }

        public final ExpandedSavedState copy(int peekHeight, int expandedOffset, Parcelable parentSavedState) {
            return new ExpandedSavedState(peekHeight, expandedOffset, parentSavedState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandedSavedState)) {
                return false;
            }
            ExpandedSavedState expandedSavedState = (ExpandedSavedState) other;
            return this.peekHeight == expandedSavedState.peekHeight && this.expandedOffset == expandedSavedState.expandedOffset && jl40.l(this.parentSavedState, expandedSavedState.parentSavedState);
        }

        public final int getExpandedOffset() {
            return this.expandedOffset;
        }

        public final Parcelable getParentSavedState() {
            return this.parentSavedState;
        }

        public final int getPeekHeight() {
            return this.peekHeight;
        }

        public int hashCode() {
            int b = oyr.b(this.expandedOffset, Integer.hashCode(this.peekHeight) * 31, 31);
            Parcelable parcelable = this.parentSavedState;
            return b + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            int i = this.peekHeight;
            int i2 = this.expandedOffset;
            Parcelable parcelable = this.parentSavedState;
            StringBuilder s = b64.s(i, i2, "ExpandedSavedState(peekHeight=", ", expandedOffset=", ", parentSavedState=");
            s.append(parcelable);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.peekHeight);
            dest.writeInt(this.expandedOffset);
            dest.writeParcelable(this.parentSavedState, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExpandedSavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExpandedSavedState createFromParcel(Parcel parcel) {
                return new ExpandedSavedState(parcel.readInt(), parcel.readInt(), parcel.readParcelable(ExpandedSavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExpandedSavedState[] newArray(int i) {
                return new ExpandedSavedState[i];
            }
        }
    }

    public TransfersDashboardSlideableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TransfersDashboardSlideableView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TransfersDashboardSlideableView(Context context) {
        this(context, null, 0, 6, null);
    }
}
