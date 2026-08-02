package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.brg0;
import defpackage.m810;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetDragIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp", "", "dpVal", "", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomBottomSheetDragIndicatorView extends View {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final float INDICATOR_CORNER_RADIUS_DP = 2.0f;

    @Deprecated
    public static final float INDICATOR_HEIGHT_DP = 4.0f;

    @Deprecated
    public static final float INDICATOR_TOP_MARGIN_DP = 8.0f;

    @Deprecated
    public static final float INDICATOR_WIDTH_DP = 32.0f;

    @Deprecated
    public static final float INDICATOR_Z_INDEX = 9999.0f;

    public CustomBottomSheetDragIndicatorView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(32.0f), dp(4.0f));
        setZ(9999.0f);
        layoutParams.gravity = 49;
        layoutParams.setMargins(0, dp(8.0f), 0, 0);
        setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dp(2.0f));
        gradientDrawable.setColor(context.getColor(brg0.finsdk_bottom_sheet_drag_indicator));
        setBackground(gradientDrawable);
    }

    private final int dp(float dpVal) {
        return m810.b(TypedValue.applyDimension(1, dpVal, getResources().getDisplayMetrics()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetDragIndicatorView$Companion;", "", "<init>", "()V", "INDICATOR_WIDTH_DP", "", "INDICATOR_HEIGHT_DP", "INDICATOR_CORNER_RADIUS_DP", "INDICATOR_TOP_MARGIN_DP", "INDICATOR_Z_INDEX", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
