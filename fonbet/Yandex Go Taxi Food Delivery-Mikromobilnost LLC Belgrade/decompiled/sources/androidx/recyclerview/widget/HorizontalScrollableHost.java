package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/recyclerview/widget/HorizontalScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "delta", "", "canChildScroll", "(F)Z", "Landroid/view/MotionEvent;", "e", "Lzy11;", "handleInterceptTouchEvent", "(Landroid/view/MotionEvent;)V", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "touchSlop", CA20Status.STATUS_USER_I, "initialX", "F", "initialY", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class HorizontalScrollableHost extends FrameLayout {
    public static final int $stable = 8;
    private float initialX;
    private float initialY;
    private int touchSlop;

    public HorizontalScrollableHost(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final boolean canChildScroll(float delta) {
        int i = -((int) Math.signum(delta));
        View child = getChild();
        if (child != null) {
            return child.canScrollHorizontally(i);
        }
        return false;
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final void handleInterceptTouchEvent(MotionEvent e) {
        if (canChildScroll(-1.0f) || canChildScroll(1.0f)) {
            if (e.getAction() == 0) {
                this.initialX = e.getX();
                this.initialY = e.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (e.getAction() == 2) {
                float x = e.getX() - this.initialX;
                float y = e.getY() - this.initialY;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                int i = this.touchSlop;
                if (abs > i || abs2 > i) {
                    if (abs2 > abs) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else if (canChildScroll(x)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        handleInterceptTouchEvent(e);
        return super.onInterceptTouchEvent(e);
    }

    public HorizontalScrollableHost(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HorizontalScrollableHost(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HorizontalScrollableHost(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
