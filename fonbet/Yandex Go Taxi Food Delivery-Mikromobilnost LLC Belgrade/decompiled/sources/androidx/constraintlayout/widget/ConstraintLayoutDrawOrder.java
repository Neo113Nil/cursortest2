package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayoutDrawOrder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/constraintlayout/widget/ConstraintLayoutDrawOrder$a;", "childDrawingOrderCallback", "Lzy11;", "setChildDrawingOrderCallback", "(Landroidx/constraintlayout/widget/ConstraintLayoutDrawOrder$a;)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "childCount", CoreConstants.PushMessage.SERVICE_TYPE, "getChildDrawingOrder", "(II)I", "childDrawOrderCallback", "Landroidx/constraintlayout/widget/ConstraintLayoutDrawOrder$a;", "a", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ConstraintLayoutDrawOrder extends ConstraintLayout {
    public static final int $stable = 8;
    private a childDrawOrderCallback;

    public static abstract class a {
        public abstract int a();
    }

    public /* synthetic */ ConstraintLayoutDrawOrder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.childDrawOrderCallback == null) {
            super.dispatchDraw(canvas);
            return;
        }
        setChildrenDrawingOrderEnabled(true);
        super.dispatchDraw(canvas);
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int i) {
        a aVar = this.childDrawOrderCallback;
        return aVar != null ? aVar.a() : super.getChildDrawingOrder(childCount, i);
    }

    public final void setChildDrawingOrderCallback(a childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.childDrawOrderCallback) {
            return;
        }
        this.childDrawOrderCallback = childDrawingOrderCallback;
        invalidate();
    }

    public ConstraintLayoutDrawOrder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ConstraintLayoutDrawOrder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConstraintLayoutDrawOrder(Context context) {
        this(context, null, 0, 6, null);
    }
}
