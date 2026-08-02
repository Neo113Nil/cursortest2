package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.pr31;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;
import ru.yandex.taxi.tooltips.viewgrouptooltip.ViewGroupTooltipContainer$BubblePositionHolder$attachListener$1;

/* loaded from: classes6.dex */
public final class pr31 {
    public final View a;
    public final BubbleComponent b;
    public final g7h c;
    public final SummaryTooltipAlignment d;
    public final ViewGroup e;
    public final View f;
    public final int[] g = {0, 0};
    public final ViewGroupTooltipContainer$BubblePositionHolder$attachListener$1 h = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.tooltips.viewgrouptooltip.ViewGroupTooltipContainer$BubblePositionHolder$attachListener$1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            pr31.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
        }
    };
    public final ons0 i = new ons0(11, this);
    public final p6 j = new p6(4, this);
    public final int k;
    public final boolean l;

    /* JADX WARN: Type inference failed for: r2v6, types: [ru.yandex.taxi.tooltips.viewgrouptooltip.ViewGroupTooltipContainer$BubblePositionHolder$attachListener$1] */
    public pr31(View view, BubbleComponent bubbleComponent, g7h g7hVar, SummaryTooltipAlignment summaryTooltipAlignment) {
        this.a = view;
        this.b = bubbleComponent;
        this.c = g7hVar;
        this.d = summaryTooltipAlignment;
        this.e = (ViewGroup) bubbleComponent.getParent();
        this.f = view.getRootView();
        this.k = tje.r(mrg0.bubble_component_corner_radius, view.getContext());
        this.l = xw31.n(view.getContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r15 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r15 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        float f;
        View view = this.a;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int width = view.getRotationY() == 180.0f ? view.getWidth() : 0;
        int i2 = iArr[1];
        this.e.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        BubbleComponent bubbleComponent = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bubbleComponent.getLayoutParams();
        g7h g7hVar = this.c;
        float f2 = g7hVar.c / 2.0f;
        int width2 = bubbleComponent.getWidth() + layoutParams.rightMargin + layoutParams.leftMargin;
        float width3 = ((view.getWidth() / 2.0f) + ((i - width) - i3)) - layoutParams.leftMargin;
        int i5 = this.k;
        float f3 = width3 - (i5 + f2);
        float width4 = i5 + f2 + (width3 - bubbleComponent.getWidth());
        int i6 = or31.a[this.d.ordinal()];
        boolean z = this.l;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    w511.b();
                    return;
                }
                f = (f3 + width4) / 2.0f;
            }
        }
        float width5 = (width2 + f) - (r6.getWidth() + i3);
        float f4 = i3 - f;
        if (f4 > 0.0f) {
            f = Math.min(f + f4, f3);
        } else if (width5 > 0.0f) {
            f = Math.max(f - width5, width4);
        }
        g7hVar.p(z ? DefaultBubbleDecorator$Position.OFFSET_END : DefaultBubbleDecorator$Position.OFFSET_START, (width3 - f) - f2);
        bubbleComponent.setTranslationX(f);
        bubbleComponent.setTranslationY((i2 - i4) - bubbleComponent.getHeight());
    }
}
