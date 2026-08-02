package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import com.yandex.div.R$id;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.bd;
import com.yandex.div2.s3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.epx;
import xsna.jon;
import xsna.kxt0;
import xsna.m180;
import xsna.ypn;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes7.dex */
public final class DivTooltipControllerKt {

    /* compiled from: DivTooltipController.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            try {
                iArr[DivTooltip.Position.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTooltip.Position.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivTooltip.Position.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivTooltip.Position.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivTooltip.Position.TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivTooltip.Position.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Point calcPopupLocation(View view, View view2, DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        int i;
        int height;
        s3 s3Var;
        s3 s3Var2;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int i2 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        Expression<DivTooltip.Position> expression = divTooltip.j;
        jon jonVar = divTooltip.i;
        DivTooltip.Position evaluate = expression.evaluate(expressionResolver);
        int i3 = point.x;
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr2[evaluate.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                i = view2.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                i = (view2.getWidth() - view.getWidth()) / 2;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.x = i3 + i;
        int i4 = point.y;
        switch (iArr2[evaluate.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (view2.getHeight() - view.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = view2.getHeight();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.y = i4 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        point.x += (jonVar == null || (s3Var2 = jonVar.a) == null) ? 0 : BaseDivViewExtensionsKt.toPx(s3Var2, displayMetrics, expressionResolver);
        int i5 = point.y;
        if (jonVar != null && (s3Var = jonVar.b) != null) {
            i2 = BaseDivViewExtensionsKt.toPx(s3Var, displayMetrics, expressionResolver);
        }
        point.y = i5 + i2;
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<DivTooltip, View> findChildWithTooltip(String str, View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                if (epx.f(divTooltip.g, str)) {
                    return new Pair<>(divTooltip, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                Pair<DivTooltip, View> findChildWithTooltip = findChildWithTooltip(str, kxt0Var.next());
                if (findChildWithTooltip != null) {
                    return findChildWithTooltip;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowFrame(Div2View div2View) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isModal(DivTooltip divTooltip) {
        return divTooltip.h instanceof bd.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeBackPressedCallback(PopupWindow popupWindow, TooltipData tooltipData, AccessibilityStateProvider accessibilityStateProvider) {
        sendAccessibilityEventUnchecked(32, popupWindow.getContentView(), accessibilityStateProvider);
        m180 onBackPressedCallback = tooltipData.getOnBackPressedCallback();
        if (onBackPressedCallback == null) {
            return;
        }
        onBackPressedCallback.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendAccessibilityEventUnchecked(int i, View view, AccessibilityStateProvider accessibilityStateProvider) {
        if (view != null && accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? ypn.b(i) : AccessibilityEvent.obtain(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldDismissByOutsideTouch(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return divTooltip.d.evaluate(expressionResolver).booleanValue();
    }
}
