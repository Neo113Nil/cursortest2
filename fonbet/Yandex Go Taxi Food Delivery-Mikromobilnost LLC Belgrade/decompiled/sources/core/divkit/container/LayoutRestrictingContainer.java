package core.divkit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.d2y;
import defpackage.jxi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcore/divkit/container/LayoutRestrictingContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lzy11;", "addView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "requestLayout", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "value", "isLayoutRestricted", "Z", "()Z", "setLayoutRestricted", "(Z)V", "Ld2y;", "onLayoutListener", "Ld2y;", "getOnLayoutListener", "()Ld2y;", "setOnLayoutListener", "(Ld2y;)V", "divkit-wrap_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LayoutRestrictingContainer extends FrameLayout {
    private boolean isLayoutRestricted;
    private d2y onLayoutListener;

    public /* synthetic */ LayoutRestrictingContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        super.addView(child, params);
    }

    public final d2y getOnLayoutListener() {
        return null;
    }

    /* renamed from: isLayoutRestricted, reason: from getter */
    public final boolean getIsLayoutRestricted() {
        return this.isLayoutRestricted;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.isLayoutRestricted) {
            return;
        }
        super.onLayout(changed, l, t, r, b);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isLayoutRestricted) {
            setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.resolveSize(getSuggestedMinimumHeight(), heightMeasureSpec));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.isLayoutRestricted) {
            return;
        }
        super.requestLayout();
    }

    public final void setLayoutRestricted(boolean z) {
        if (this.isLayoutRestricted != z) {
            this.isLayoutRestricted = z;
            if (z) {
                return;
            }
            super.requestLayout();
        }
    }

    public final void setOnLayoutListener(d2y d2yVar) {
    }

    public LayoutRestrictingContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LayoutRestrictingContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public LayoutRestrictingContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
