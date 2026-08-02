package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.cch0;
import defpackage.cma1;
import defpackage.noh0;
import defpackage.ny61;
import defpackage.px6;
import defpackage.tk01;
import defpackage.v961;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/view/TransferMainSkeletonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltk01;", ClidProvider.STATE, "Lzy11;", "render", "(Ltk01;)V", "Lv961;", "binding", "Lv961;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferMainSkeletonView extends ConstraintLayout {
    private final v961 binding;

    public TransferMainSkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(noh0.ybsdk_transfer_main_loading_design_v2, (ViewGroup) this, false);
        addView(inflate);
        int i2 = cch0.circleButton1;
        View O = cma1.O(i2, inflate);
        if (O != null) {
            i2 = cch0.circleButton2;
            View O2 = cma1.O(i2, inflate);
            if (O2 != null) {
                i2 = cch0.circleButton3;
                View O3 = cma1.O(i2, inflate);
                if (O3 != null) {
                    i2 = cch0.circleButton4;
                    View O4 = cma1.O(i2, inflate);
                    if (O4 != null) {
                        px6 px6Var = new px6((LinearLayout) O4, 9);
                        i2 = cch0.confirmButton;
                        if (((SkeletonView) cma1.O(i2, inflate)) != null) {
                            i2 = cch0.keyboard;
                            if (((NumberKeyboardView) cma1.O(i2, inflate)) != null) {
                                i2 = cch0.toolbar;
                                if (((SkeletonView) cma1.O(i2, inflate)) != null) {
                                    i2 = cch0.transferMainLoadingAmountCurrency;
                                    if (((TextView) cma1.O(i2, inflate)) != null) {
                                        i2 = cch0.transferMainLoadingAmountInput;
                                        if (((MoneyInputEditView) cma1.O(i2, inflate)) != null) {
                                            i2 = cch0.transferMainLoadingButtons;
                                            LinearLayout linearLayout = (LinearLayout) cma1.O(i2, inflate);
                                            if (linearLayout != null) {
                                                i2 = cch0.transferMainLoadingPill;
                                                FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                                                if (frameLayout != null) {
                                                    i2 = cch0.transferMainLoadingSuggest1;
                                                    SkeletonView skeletonView = (SkeletonView) cma1.O(i2, inflate);
                                                    if (skeletonView != null) {
                                                        i2 = cch0.transferMainLoadingSuggest2;
                                                        SkeletonView skeletonView2 = (SkeletonView) cma1.O(i2, inflate);
                                                        if (skeletonView2 != null) {
                                                            i2 = cch0.transferMainLoadingSuggest3;
                                                            SkeletonView skeletonView3 = (SkeletonView) cma1.O(i2, inflate);
                                                            if (skeletonView3 != null) {
                                                                i2 = cch0.transferMainLoadingSuggests;
                                                                if (((LinearLayout) cma1.O(i2, inflate)) != null) {
                                                                    this.binding = new v961((ShimmerFrameLayout) inflate, px6Var, linearLayout, frameLayout, skeletonView, skeletonView2, skeletonView3);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(tk01 state) {
        TransferMainSkeletonView$State$SuggestsCount transferMainSkeletonView$State$SuggestsCount = state.a;
        LinearLayout linearLayout = this.binding.c;
        TransferMainSkeletonView$State$CircleButtonsCount transferMainSkeletonView$State$CircleButtonsCount = state.b;
        TransferMainSkeletonView$State$CircleButtonsCount transferMainSkeletonView$State$CircleButtonsCount2 = TransferMainSkeletonView$State$CircleButtonsCount.ZERO;
        linearLayout.setVisibility(transferMainSkeletonView$State$CircleButtonsCount != transferMainSkeletonView$State$CircleButtonsCount2 ? 0 : 8);
        this.binding.d.setVisibility(transferMainSkeletonView$State$CircleButtonsCount == transferMainSkeletonView$State$CircleButtonsCount2 ? 0 : 8);
        this.binding.b.b.setVisibility(transferMainSkeletonView$State$CircleButtonsCount == TransferMainSkeletonView$State$CircleButtonsCount.FOUR ? 0 : 8);
        this.binding.e.setVisibility(transferMainSkeletonView$State$SuggestsCount != TransferMainSkeletonView$State$SuggestsCount.ZERO ? 0 : 8);
        SkeletonView skeletonView = this.binding.f;
        TransferMainSkeletonView$State$SuggestsCount transferMainSkeletonView$State$SuggestsCount2 = TransferMainSkeletonView$State$SuggestsCount.THREE;
        skeletonView.setVisibility(transferMainSkeletonView$State$SuggestsCount == transferMainSkeletonView$State$SuggestsCount2 ? 0 : 8);
        this.binding.g.setVisibility(transferMainSkeletonView$State$SuggestsCount == transferMainSkeletonView$State$SuggestsCount2 ? 0 : 8);
    }

    public TransferMainSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TransferMainSkeletonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TransferMainSkeletonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
