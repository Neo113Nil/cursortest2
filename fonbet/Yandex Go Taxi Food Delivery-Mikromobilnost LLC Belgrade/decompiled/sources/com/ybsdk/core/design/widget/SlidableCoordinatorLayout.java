package com.ybsdk.core.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.gas0;
import defpackage.i3y;
import defpackage.uns0;
import defpackage.vvg0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/design/widget/SlidableCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Luns0;", "slideMotionHelper", "Luns0;", "getSlideMotionHelper", "()Luns0;", "setSlideMotionHelper", "(Luns0;)V", "", "slideableHeight$delegate", "Li3y;", "getSlideableHeight", "()F", "slideableHeight", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SlidableCoordinatorLayout extends CoordinatorLayout {
    private uns0 slideMotionHelper;

    /* renamed from: slideableHeight$delegate, reason: from kotlin metadata */
    private final i3y slideableHeight;

    public SlidableCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.slideableHeight = a.b(LazyThreadSafetyMode.NONE, new gas0(4, this));
    }

    private final float getSlideableHeight() {
        return ((Number) this.slideableHeight.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float slideableHeight_delegate$lambda$0(SlidableCoordinatorLayout slidableCoordinatorLayout) {
        return slidableCoordinatorLayout.getResources().getDimension(vvg0.ybsdk_root_card_draggable_area) + slidableCoordinatorLayout.getResources().getDimension(vvg0.ybsdk_root_card_inset_height);
    }

    public final uns0 getSlideMotionHelper() {
        return this.slideMotionHelper;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float slideableHeight = getSlideableHeight();
        float y = ev.getY();
        boolean z = 0.0f <= y && y <= slideableHeight;
        uns0 uns0Var = this.slideMotionHelper;
        if (uns0Var != null) {
            z = uns0Var.canSlideFrom(ev.getX(), ev.getY());
        }
        if (z) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    public final void setSlideMotionHelper(uns0 uns0Var) {
        this.slideMotionHelper = uns0Var;
    }

    public /* synthetic */ SlidableCoordinatorLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlidableCoordinatorLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
