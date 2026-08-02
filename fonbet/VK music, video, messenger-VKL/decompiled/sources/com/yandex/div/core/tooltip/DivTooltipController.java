package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.yandex.div.R$id;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import xsna.air;
import xsna.g620;
import xsna.kxt0;
import xsna.m180;
import xsna.p180;
import xsna.r180;
import xsna.s3q0;
import xsna.yzs;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes7.dex */
public class DivTooltipController {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final yzs<View, Integer, Integer, SafePopupWindow> createPopup;
    private final DivPreloader divPreloader;
    private final DivTooltipViewBuilder divTooltipViewBuilder;
    private final DivVisibilityActionTracker divVisibilityActionTracker;
    private final ErrorCollectors errorCollectors;
    private final Handler mainThreadHandler;
    private final DivTooltipRestrictor tooltipRestrictor;
    private final Map<String, TooltipData> tooltips;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTooltipController(DivTooltipRestrictor divTooltipRestrictor, DivVisibilityActionTracker divVisibilityActionTracker, DivPreloader divPreloader, ErrorCollectors errorCollectors, DivTooltipViewBuilder divTooltipViewBuilder, AccessibilityStateProvider accessibilityStateProvider, yzs<? super View, ? super Integer, ? super Integer, ? extends SafePopupWindow> yzsVar) {
        this.tooltipRestrictor = divTooltipRestrictor;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.divPreloader = divPreloader;
        this.errorCollectors = errorCollectors;
        this.divTooltipViewBuilder = divTooltipViewBuilder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.createPopup = yzsVar;
        this.tooltips = new LinkedHashMap();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1, xsna.m180] */
    private DivTooltipController$createOnBackPressCallback$1 createOnBackPressCallback(final DivTooltip divTooltip, final Div2View div2View) {
        p180 onBackPressedDispatcher;
        if (!this.accessibilityStateProvider.isAccessibilityEnabled(div2View.getContext())) {
            return null;
        }
        ?? r0 = new m180() { // from class: com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // xsna.m180
            public void handleOnBackPressed() {
                DivTooltipController.this.hideTooltip(divTooltip.g, div2View);
            }
        };
        r180 e = g620.e(div2View);
        if (e != null && (onBackPressedDispatcher = e.getOnBackPressedDispatcher()) != 0) {
            onBackPressedDispatcher.b(r0);
            return r0;
        }
        DivActionTypedUtilsKt.logError(div2View, new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
        Assert.fail("Can't find onBackPressedDispatcher to set on back press listener on tooltip.");
        s3q0 s3q0Var = s3q0.a;
        return r0;
    }

    private String dismissTooltip(DivTooltip divTooltip) {
        TooltipData tooltipData = this.tooltips.get(divTooltip.g);
        if (tooltipData == null) {
            return null;
        }
        return dismissTooltip(tooltipData);
    }

    public static /* synthetic */ void showTooltip$default(DivTooltipController divTooltipController, String str, BindingContext bindingContext, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        divTooltipController.showTooltip(str, bindingContext, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVisibilityTracking(BindingContext bindingContext, com.yandex.div2.a aVar, View view) {
        stopVisibilityTracking(bindingContext, aVar);
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, aVar, null, null, 48, null);
    }

    private void stopVisibilityTracking(BindingContext bindingContext, com.yandex.div2.a aVar) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), null, aVar, null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryShowTooltip(final View view, final DivTooltip divTooltip, final BindingContext bindingContext, final boolean z) {
        boolean shouldDismissByOutsideTouch;
        boolean isModal;
        boolean isModal2;
        boolean isModal3;
        final Div2View divView = bindingContext.getDivView();
        if (this.tooltipRestrictor.canShowTooltip(divView, view, divTooltip, z)) {
            final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
            final com.yandex.div2.a aVar = divTooltip.e;
            String str = divTooltip.g;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int layoutParamsSize$default = DivUtilKt.toLayoutParamsSize$default(aVar.b().getWidth(), displayMetrics, expressionResolver, null, 4, null);
            int layoutParamsSize$default2 = DivUtilKt.toLayoutParamsSize$default(aVar.b().getHeight(), displayMetrics, expressionResolver, null, 4, null);
            final DivTooltipContainer buildTooltipView = this.divTooltipViewBuilder.buildTooltipView(bindingContext, aVar, layoutParamsSize$default, layoutParamsSize$default2);
            final View tooltipView = buildTooltipView.getTooltipView();
            if (tooltipView == null) {
                return;
            }
            final SafePopupWindow invoke = this.createPopup.invoke(buildTooltipView, Integer.valueOf(layoutParamsSize$default), Integer.valueOf(layoutParamsSize$default2));
            invoke.setTouchable(true);
            shouldDismissByOutsideTouch = DivTooltipControllerKt.shouldDismissByOutsideTouch(divTooltip, expressionResolver);
            invoke.setOutsideTouchable(shouldDismissByOutsideTouch);
            if (Build.VERSION.SDK_INT >= 29) {
                invoke.setFocusable(true);
                isModal3 = DivTooltipControllerKt.isModal(divTooltip);
                invoke.setTouchModal(isModal3);
            } else {
                isModal = DivTooltipControllerKt.isModal(divTooltip);
                invoke.setFocusable(isModal);
            }
            isModal2 = DivTooltipControllerKt.isModal(divTooltip);
            invoke.setTouchInterceptor(new PopupWindowTouchListener(invoke, tooltipView, isModal2, invoke.isOutsideTouchable(), divTooltip.k, bindingContext));
            DivTooltipAnimationKt.setupAnimation(invoke, divTooltip, expressionResolver);
            DivPreloader.Ticket ticket = null;
            final TooltipData tooltipData = new TooltipData(divTooltip.g, bindingContext, aVar, invoke, ticket, createOnBackPressCallback(divTooltip, divView), false, 64, null);
            invoke.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.div.core.tooltip.a
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    DivTooltipController.tryShowTooltip$lambda$15(DivTooltipController.this, divTooltip, bindingContext, buildTooltipView, divView, view, invoke, tooltipData);
                }
            });
            this.tooltips.put(str, tooltipData);
            DivPreloader.Ticket preload = this.divPreloader.preload(aVar, expressionResolver, new DivPreloader.Callback() { // from class: com.yandex.div.core.tooltip.b
                @Override // com.yandex.div.core.DivPreloader.Callback
                public final void finish(boolean z2) {
                    DivTooltipController.tryShowTooltip$lambda$18(TooltipData.this, view, this, divView, divTooltip, z, buildTooltipView, invoke, tooltipView, expressionResolver, bindingContext, aVar, z2);
                }
            });
            TooltipData tooltipData2 = this.tooltips.get(str);
            if (tooltipData2 == null) {
                return;
            }
            tooltipData2.setTicket(preload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$15(DivTooltipController divTooltipController, DivTooltip divTooltip, BindingContext bindingContext, DivTooltipContainer divTooltipContainer, Div2View div2View, View view, SafePopupWindow safePopupWindow, TooltipData tooltipData) {
        divTooltipController.tooltips.remove(divTooltip.g);
        divTooltipController.stopVisibilityTracking(bindingContext, divTooltip.e);
        com.yandex.div2.a aVar = divTooltipController.divVisibilityActionTracker.getDivWithWaitingDisappearActions().get(divTooltipContainer);
        if (aVar != null) {
            divTooltipController.divVisibilityActionTracker.trackDetachedView(bindingContext, divTooltipContainer, aVar);
        }
        divTooltipController.tooltipRestrictor.getTooltipShownCallback();
        DivTooltipControllerKt.removeBackPressedCallback(safePopupWindow, tooltipData, divTooltipController.accessibilityStateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$18(TooltipData tooltipData, final View view, final DivTooltipController divTooltipController, final Div2View div2View, final DivTooltip divTooltip, boolean z, final DivTooltipContainer divTooltipContainer, final SafePopupWindow safePopupWindow, final View view2, final ExpressionResolver expressionResolver, final BindingContext bindingContext, final com.yandex.div2.a aVar, boolean z2) {
        Rect windowFrame;
        if (z2 || tooltipData.getDismissed() || !view.isAttachedToWindow() || !divTooltipController.tooltipRestrictor.canShowTooltip(div2View, view, divTooltip, z)) {
            return;
        }
        if (!ViewsKt.isActuallyLaidOut(divTooltipContainer) || divTooltipContainer.isLayoutRequested()) {
            divTooltipContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Rect windowFrame2;
                    view3.removeOnLayoutChangeListener(this);
                    windowFrame2 = DivTooltipControllerKt.getWindowFrame(Div2View.this);
                    Point calcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, divTooltip, expressionResolver);
                    int min = Math.min(view2.getWidth(), windowFrame2.width());
                    int min2 = Math.min(view2.getHeight(), windowFrame2.height());
                    if (min < view2.getWidth()) {
                        divTooltipController.errorCollectors.getOrCreate(Div2View.this.getDataTag(), Div2View.this.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
                    }
                    if (min2 < view2.getHeight()) {
                        divTooltipController.errorCollectors.getOrCreate(Div2View.this.getDataTag(), Div2View.this.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
                    }
                    safePopupWindow.update(calcPopupLocation.x, calcPopupLocation.y, min, min2);
                    divTooltipController.startVisibilityTracking(bindingContext, aVar, divTooltipContainer);
                    divTooltipController.tooltipRestrictor.getTooltipShownCallback();
                }
            });
        } else {
            windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
            Point calcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, divTooltip, expressionResolver);
            int min = Math.min(view2.getWidth(), windowFrame.width());
            int min2 = Math.min(view2.getHeight(), windowFrame.height());
            if (min < view2.getWidth()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
            }
            if (min2 < view2.getHeight()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
            }
            safePopupWindow.update(calcPopupLocation.x, calcPopupLocation.y, min, min2);
            divTooltipController.startVisibilityTracking(bindingContext, aVar, divTooltipContainer);
            divTooltipController.tooltipRestrictor.getTooltipShownCallback();
        }
        safePopupWindow.showAtLocation(view, 0, 0, 0);
        DivTooltipControllerKt.sendAccessibilityEventUnchecked(32, view2, divTooltipController.accessibilityStateProvider);
        if (divTooltip.f.evaluate(expressionResolver).longValue() != 0) {
            divTooltipController.mainThreadHandler.postDelayed(new Runnable() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$postDelayed$default$1
                @Override // java.lang.Runnable
                public final void run() {
                    DivTooltipController.this.hideTooltip(divTooltip.g, div2View);
                }
            }, divTooltip.f.evaluate(expressionResolver).longValue());
        }
    }

    public void cancelTooltips(Div2View div2View) {
        cancelTooltips((View) div2View);
    }

    public View findViewWithTag(String str) {
        Set<Map.Entry<String, TooltipData>> entrySet = this.tooltips.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            View contentView = ((TooltipData) ((Map.Entry) it.next()).getValue()).getPopupWindow().getContentView();
            if (contentView != null) {
                arrayList.add(contentView);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View findViewWithTag = ((View) it2.next()).findViewWithTag(str);
            if (findViewWithTag != null) {
                return findViewWithTag;
            }
        }
        return null;
    }

    public void hideTooltip(String str, Div2View div2View) {
        SafePopupWindow popupWindow;
        TooltipData tooltipData = this.tooltips.get(str);
        if (tooltipData == null || (popupWindow = tooltipData.getPopupWindow()) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public void mapTooltip(View view, List<DivTooltip> list) {
        view.setTag(R$id.div_tooltips_tag, list);
    }

    public void showTooltip(String str, BindingContext bindingContext, boolean z) {
        Pair findChildWithTooltip;
        s3q0 s3q0Var;
        findChildWithTooltip = DivTooltipControllerKt.findChildWithTooltip(str, bindingContext.getDivView());
        if (findChildWithTooltip != null) {
            showTooltip(bindingContext, (DivTooltip) findChildWithTooltip.d(), (View) findChildWithTooltip.g(), z);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            DivActionTypedUtilsKt.logError(bindingContext.getDivView(), new IllegalStateException(air.b('\'', "Unable to find view for tooltip '", str)));
        }
    }

    private void cancelTooltips(View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String dismissTooltip = dismissTooltip((DivTooltip) it.next());
                if (dismissTooltip != null) {
                    arrayList.add(dismissTooltip);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.tooltips.remove((String) it2.next());
            }
        }
        if (view instanceof ViewGroup) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                cancelTooltips(kxt0Var.next());
            }
        }
    }

    private String dismissTooltip(TooltipData tooltipData) {
        tooltipData.setDismissed(true);
        DivPreloader.Ticket ticket = tooltipData.getTicket();
        if (ticket != null) {
            ticket.cancel();
        }
        if (tooltipData.getPopupWindow().isShowing()) {
            DivTooltipAnimationKt.clearAnimation(tooltipData.getPopupWindow());
            tooltipData.getPopupWindow().dismiss();
            return null;
        }
        stopVisibilityTracking(tooltipData.getBindingContext(), tooltipData.getDiv());
        return tooltipData.getId();
    }

    public DivTooltipController(DivTooltipRestrictor divTooltipRestrictor, DivVisibilityActionTracker divVisibilityActionTracker, DivPreloader divPreloader, DivTooltipViewBuilder divTooltipViewBuilder, AccessibilityStateProvider accessibilityStateProvider, ErrorCollectors errorCollectors) {
        this(divTooltipRestrictor, divVisibilityActionTracker, divPreloader, errorCollectors, divTooltipViewBuilder, accessibilityStateProvider, new yzs<View, Integer, Integer, SafePopupWindow>() { // from class: com.yandex.div.core.tooltip.DivTooltipController.1
            public final SafePopupWindow invoke(View view, int i, int i2) {
                return new DivTooltipWindow(view, i, i2, false, 8, null);
            }

            @Override // xsna.yzs
            public /* bridge */ /* synthetic */ SafePopupWindow invoke(View view, Integer num, Integer num2) {
                return invoke(view, num.intValue(), num2.intValue());
            }
        });
    }

    private void showTooltip(final BindingContext bindingContext, final DivTooltip divTooltip, View view, final boolean z) {
        final View view2;
        if (this.tooltips.containsKey(divTooltip.g)) {
            return;
        }
        if (ViewsKt.isActuallyLaidOut(view) && !view.isLayoutRequested()) {
            tryShowTooltip(view, divTooltip, bindingContext, z);
            view2 = view;
        } else {
            view2 = view;
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view3.removeOnLayoutChangeListener(this);
                    DivTooltipController.this.tryShowTooltip(view2, divTooltip, bindingContext, z);
                }
            });
        }
        if (ViewsKt.isActuallyLaidOut(view2) || view2.isLayoutRequested()) {
            return;
        }
        view2.requestLayout();
    }
}
