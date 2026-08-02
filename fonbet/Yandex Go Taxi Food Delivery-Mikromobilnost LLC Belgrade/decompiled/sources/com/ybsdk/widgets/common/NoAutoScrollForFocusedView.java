package com.ybsdk.widgets.common;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import defpackage.db60;
import defpackage.eb60;
import defpackage.kp50;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/widgets/common/NoAutoScrollForFocusedView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "removeCallbacks", "()V", "Landroid/graphics/Rect;", "rect", "computeScrollDeltaToGetChildRectOnScreen", "(Landroid/graphics/Rect;)I", "relativeTopY", "relativeBottomY", "scrollYTop", "verticalScrollToFocusedView", "(III)V", "onDetachedFromWindow", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "scrollRunnable", "Ljava/lang/Runnable;", "Companion", "db60", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoAutoScrollForFocusedView extends NestedScrollView {

    @Deprecated
    public static final long DEFAULT_SCROLL_DELAY_MS = 300;

    @Deprecated
    public static final int DEFAULT_X_SCROLL_COORDINATE = 0;
    private final Handler handler;
    private Runnable scrollRunnable;
    private static final db60 Companion = new db60();
    private static int DEFAULT_Y_SCROLL_MARGIN_PX = kp50.r(15);

    public NoAutoScrollForFocusedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void removeCallbacks() {
        Runnable runnable = this.scrollRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.scrollRunnable = null;
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks();
        super.onDetachedFromWindow();
    }

    public final void verticalScrollToFocusedView(int relativeTopY, int relativeBottomY, int scrollYTop) {
        removeCallbacks();
        Handler handler = this.handler;
        eb60 eb60Var = new eb60(this, scrollYTop, relativeTopY, relativeBottomY);
        handler.postDelayed(eb60Var, 300L);
        this.scrollRunnable = eb60Var;
    }

    public NoAutoScrollForFocusedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ NoAutoScrollForFocusedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public NoAutoScrollForFocusedView(Context context) {
        this(context, null, 0, 6, null);
    }
}
