package com.yandex.go.taxi.order.util.accordion;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import defpackage.aj;
import defpackage.bj;
import defpackage.bts0;
import defpackage.cj;
import defpackage.grs0;
import defpackage.hss0;
import defpackage.jg;
import defpackage.kyh0;
import defpackage.mg;
import defpackage.nqs0;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.tls;
import defpackage.tss0;
import defpackage.uss0;
import defpackage.w511;
import defpackage.wss0;
import defpackage.xss0;
import defpackage.xw31;
import defpackage.yi;
import defpackage.yss0;
import defpackage.zi;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001QB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\u0019\u0010/\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010\u0019J\u0019\u00100\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u000fH\u0002¢\u0006\u0004\b1\u0010\u001fJ\u000f\u00102\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u0010\u001fJ\u0017\u00103\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010&J'\u00109\u001a\u0002082\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0002¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u000fH\u0002¢\u0006\u0004\b<\u0010\u001fJ\u0013\u0010>\u001a\u00020\u0016*\u00020=H\u0002¢\u0006\u0004\b>\u0010?R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0018\u0010L\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lcom/yandex/go/taxi/order/util/accordion/AccordionComponent;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILbts0;)V", "Lxss0;", "uiState", "Lzy11;", "renderHeader", "(Lxss0;)V", "Landroid/view/View;", "view", "setContainerContent", "(Landroid/view/View;)V", "", "isCollapsed", "setAccordionState", "(Z)V", "Lkotlin/Function1;", "listener", "setOnDetachListener", "(Ltls;)V", "onDetachedFromWindow", "()V", "Ltss0;", "trail", "setAccordionStateByTrail", "(Ltss0;)V", "oldHeight", "updateContentAnimated", "(I)V", "Lnqs0;", "action", "Lwss0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onHeaderClickListener", "(Lnqs0;Lwss0;)V", "animate", "applyContainerState", "expand", "collapse", "expandAnimated", "collapseAnimated", "updateContainerAnimated", "from", "to", "Ljava/lang/Runnable;", "onFinished", "Landroid/animation/ValueAnimator;", "getHeightAnimator", "(IILjava/lang/Runnable;)Landroid/animation/ValueAnimator;", "updateMeasure", "initAccessibilityDelegate", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Trail$AccordionChevron$ChevronState;", "isAccordionCollapsed", "(Lcom/yandex/go/slot/api/ui/SlotItemUiState$Trail$AccordionChevron$ChevronState;)Z", "Z", "Lyss0;", "header", "Lyss0;", "Landroid/widget/FrameLayout;", "headerContainer", "Landroid/widget/FrameLayout;", "container", "", "a11yCollapsedString", "Ljava/lang/String;", "a11yExpandedString", "heightContainerAnimator", "Landroid/animation/ValueAnimator;", "onDetachListener", "Ltls;", "Companion", "aj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccordionComponent extends GoFrameLayout {
    public static final int $stable = 8;
    public static final aj Companion = new aj();
    public static final long UPDATE_CONTAINER_ANIMATION_DURATION_MS = 300;
    private final String a11yCollapsedString;
    private final String a11yExpandedString;
    private final FrameLayout container;
    private final yss0 header;
    private final FrameLayout headerContainer;
    private ValueAnimator heightContainerAnimator;
    private boolean isCollapsed;
    private tls onDetachListener;

    public AccordionComponent(Context context, AttributeSet attributeSet, int i, int i2, bts0 bts0Var) {
        super(context, attributeSet, i, i2);
        c.q(this, zkh0.component_accordion, true);
        this.isCollapsed = true;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, null, 0, ((grs0) bts0Var).a, 6, null);
        header$lambda$0(slotItemViewComponent);
        this.header = slotItemViewComponent;
        int i3 = p8h0.header_container;
        WeakHashMap weakHashMap = b.a;
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, i3));
        this.headerContainer = frameLayout;
        this.container = (FrameLayout) ((View) rp31.d(this, p8h0.container));
        this.a11yCollapsedString = getContext().getString(kyh0.accordion_accessibility_collapsed);
        this.a11yExpandedString = getContext().getString(kyh0.accordion_accessibility_expanded);
        initAccessibilityDelegate();
        frameLayout.addView(slotItemViewComponent.asView());
    }

    private final void applyContainerState(boolean animate) {
        if (this.isCollapsed) {
            collapse(animate);
        } else {
            expand(animate);
        }
    }

    public static /* synthetic */ void applyContainerState$default(AccordionComponent accordionComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        accordionComponent.applyContainerState(z);
    }

    private final void collapse(boolean animate) {
        if (animate) {
            collapseAnimated();
        } else {
            this.container.setVisibility(8);
        }
        announceForAccessibility(this.a11yCollapsedString);
    }

    public static /* synthetic */ void collapse$default(AccordionComponent accordionComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        accordionComponent.collapse(z);
    }

    private final void collapseAnimated() {
        ValueAnimator valueAnimator = this.heightContainerAnimator;
        int i = 1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator heightAnimator = getHeightAnimator(getMeasuredHeight(), getMeasuredHeight() - this.container.getHeight(), new jg(i, this));
            this.heightContainerAnimator = heightAnimator;
            if (heightAnimator != null) {
                heightAnimator.setDuration(500L);
                heightAnimator.setInterpolator(new OvershootInterpolator(0.5f));
                heightAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseAnimated$lambda$0(AccordionComponent accordionComponent) {
        accordionComponent.container.setVisibility(8);
    }

    private final void expand(boolean animate) {
        if (animate) {
            expandAnimated();
        } else {
            this.container.setVisibility(0);
        }
        announceForAccessibility(this.a11yExpandedString);
    }

    public static /* synthetic */ void expand$default(AccordionComponent accordionComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        accordionComponent.expand(z);
    }

    private final void expandAnimated() {
        ValueAnimator valueAnimator = this.heightContainerAnimator;
        int i = 1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.container.setVisibility(0);
            updateMeasure();
            ValueAnimator heightAnimator = getHeightAnimator(getMeasuredHeight() - this.container.getMeasuredHeight(), getMeasuredHeight(), new zi(i));
            this.heightContainerAnimator = heightAnimator;
            if (heightAnimator != null) {
                heightAnimator.setDuration(800L);
                heightAnimator.setInterpolator(new OvershootInterpolator(1.0f));
                heightAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandAnimated$lambda$0() {
    }

    private final ValueAnimator getHeightAnimator(int from, int to, Runnable onFinished) {
        ValueAnimator ofInt = ValueAnimator.ofInt(from, to);
        ofInt.addUpdateListener(new yi(0, this));
        ofInt.addListener(new AnimUtils$AnimationEndListener(onFinished));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHeightAnimator$lambda$0(AccordionComponent accordionComponent, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Rect rect = xw31.a;
        c.C(intValue, accordionComponent);
    }

    private static final zy11 header$lambda$0(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return zy11.a;
    }

    private final void initAccessibilityDelegate() {
        b.p(this, new mg(2, this));
    }

    private final boolean isAccordionCollapsed(SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState) {
        int i = bj.a[slotItemUiState$Trail$AccordionChevron$ChevronState.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        w511.b();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHeaderClickListener(nqs0 action, wss0 event) {
        if (event instanceof uss0) {
            this.isCollapsed = isAccordionCollapsed(((uss0) event).a);
            applyContainerState(true);
        }
    }

    private final void setAccordionStateByTrail(tss0 trail) {
        this.isCollapsed = trail instanceof hss0 ? isAccordionCollapsed(((hss0) trail).b) : true;
        applyContainerState(false);
    }

    private final void updateContainerAnimated(int oldHeight) {
        ValueAnimator heightAnimator = getHeightAnimator(oldHeight, getMeasuredHeight(), new zi(0));
        heightAnimator.setDuration(300L);
        heightAnimator.setInterpolator(new LinearInterpolator());
        heightAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainerAnimated$lambda$0() {
    }

    private final void updateContentAnimated(int oldHeight) {
        updateMeasure();
        if (this.isCollapsed || oldHeight == getMeasuredHeight()) {
            return;
        }
        updateContainerAnimated(oldHeight);
    }

    private final void updateMeasure() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tls tlsVar = this.onDetachListener;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(this.isCollapsed));
        }
    }

    public final void renderHeader(xss0 uiState) {
        this.header.renderLead(uiState.a);
        this.header.renderBody(uiState.b);
        yss0 yss0Var = this.header;
        tss0 tss0Var = uiState.c;
        yss0Var.renderTrail(tss0Var, new cj(this));
        setAccordionStateByTrail(tss0Var);
    }

    public final void setAccordionState(boolean isCollapsed) {
        this.isCollapsed = isCollapsed;
        applyContainerState(false);
    }

    public final void setContainerContent(View view) {
        int measuredHeight = getMeasuredHeight();
        boolean z = this.container.getChildCount() == 0;
        this.container.removeAllViews();
        this.container.addView(view, new FrameLayout.LayoutParams(-1, -2));
        if (z) {
            return;
        }
        updateContentAnimated(measuredHeight);
    }

    public final void setOnDetachListener(tls listener) {
        this.onDetachListener = listener;
    }

    public AccordionComponent(Context context, AttributeSet attributeSet, int i, bts0 bts0Var) {
        this(context, attributeSet, i, 0, bts0Var, 8, null);
    }

    public AccordionComponent(Context context, AttributeSet attributeSet, bts0 bts0Var) {
        this(context, attributeSet, 0, 0, bts0Var, 12, null);
    }

    public AccordionComponent(Context context, bts0 bts0Var) {
        this(context, null, 0, 0, bts0Var, 14, null);
    }

    public /* synthetic */ AccordionComponent(Context context, AttributeSet attributeSet, int i, int i2, bts0 bts0Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, bts0Var);
    }
}
