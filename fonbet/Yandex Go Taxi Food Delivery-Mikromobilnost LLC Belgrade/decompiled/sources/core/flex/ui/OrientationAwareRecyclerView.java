package core.flex.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hq80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcore/flex/ui/OrientationAwareRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lastX", "", "lastY", "scrolling", "", "onInterceptTouchEvent", "e", "Landroid/view/MotionEvent;", "flex-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OrientationAwareRecyclerView extends RecyclerView {
    private float lastX;
    private float lastY;
    private boolean scrolling;

    public /* synthetic */ OrientationAwareRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        RecyclerView.e layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return super.onInterceptTouchEvent(e);
        }
        Integer valueOf = e != null ? Integer.valueOf(e.getActionMasked()) : null;
        boolean z = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.lastX = e.getX();
            this.lastY = e.getY();
            if (this.scrolling) {
                stopScroll();
                return true;
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            z = Math.abs(e.getY() - this.lastY) > Math.abs(e.getX() - this.lastX) ? layoutManager.J() : layoutManager.I();
        }
        if (z) {
            return super.onInterceptTouchEvent(e);
        }
        return false;
    }

    public OrientationAwareRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrientationAwareRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public OrientationAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnScrollListener(new hq80(this));
    }
}
