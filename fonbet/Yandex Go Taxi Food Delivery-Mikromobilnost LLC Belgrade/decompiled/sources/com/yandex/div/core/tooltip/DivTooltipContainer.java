package com.yandex.div.core.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.FrameContainerLayout;
import defpackage.ax01;
import defpackage.cx01;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0012¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0016J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J1\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00110+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u001c8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001c8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00108¨\u0006>"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lax01;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", RemoteBioParameters.X, RemoteBioParameters.Y, "width", "height", "Lzy11;", "setChildPosition", "(Landroid/view/View;IIII)Lzy11;", "view", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "Landroid/graphics/Canvas;", "canvas", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "substrate", "bringToTop", "tooltip", "setViews", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "setTooltipPosition", "(IIII)Lzy11;", "setBringToTopPosition", "Landroid/view/MotionEvent;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function1;", "dismissAction", "Ltls;", "getDismissAction", "()Ltls;", "setDismissAction", "(Ltls;)V", "hasSubstrateView", "Z", "hasBringToTopView", "isTransient", "()Z", "getSubstrateView", "()Landroid/view/View;", "substrateView", "getBringToTopView", "bringToTopView", "getTooltipView", "tooltipView", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class DivTooltipContainer extends FrameContainerLayout implements ax01 {
    private final /* synthetic */ cx01 $$delegate_0;
    private tls dismissAction;
    private boolean hasBringToTopView;
    private boolean hasSubstrateView;

    public DivTooltipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new cx01();
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        setImportantForAccessibility(2);
        this.dismissAction = DivTooltipContainer$dismissAction$1.w;
    }

    private zy11 setChildPosition(View child, int x, int y, int width, int height) {
        if (child != null) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            if (layoutParams != null) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin = x;
                ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin = y;
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = width;
                ((ViewGroup.MarginLayoutParams) divLayoutParams).height = height;
                child.setLayoutParams(divLayoutParams);
                return zy11.a;
            }
            ny61.t("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            com.yandex.div.core.view2.divs.a.r(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public View getBringToTopView() {
        if (this.hasBringToTopView && this.hasSubstrateView && getChildCount() > 1) {
            return getChildAt(1);
        }
        return null;
    }

    public tls getDismissAction() {
        return this.dismissAction;
    }

    public View getSubstrateView() {
        if (!this.hasSubstrateView || getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    @Override // defpackage.ax01
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        boolean onTouchEvent = super.onTouchEvent(ev);
        if (!onTouchEvent && ev.getAction() == 0) {
            getDismissAction().invoke(ev);
        }
        return onTouchEvent;
    }

    public zy11 setBringToTopPosition(int x, int y, int width, int height) {
        return setChildPosition(getBringToTopView(), x, y, width, height);
    }

    public void setDismissAction(tls tlsVar) {
        this.dismissAction = tlsVar;
    }

    public zy11 setTooltipPosition(int x, int y, int width, int height) {
        return setChildPosition(getTooltipView(), x, y, width, height);
    }

    public void setViews(View substrate, View bringToTop, View tooltip) {
        removeAllViews();
        this.hasSubstrateView = false;
        this.hasBringToTopView = false;
        if (substrate != null) {
            this.hasSubstrateView = true;
            addView(substrate);
        }
        if (this.hasSubstrateView && bringToTop != null) {
            this.hasBringToTopView = true;
            addView(bringToTop);
        }
        addView(tooltip);
    }

    @Override // defpackage.ax01
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivTooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivTooltipContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivTooltipContainer(Context context) {
        this(context, null, 0, 6, null);
    }
}
