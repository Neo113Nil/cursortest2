package core.flex.ui.contentaware;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.jl40;
import defpackage.wee;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcore/flex/ui/contentaware/ContentAwareFrameLayout;", "Landroid/widget/FrameLayout;", "Lwee;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getOnlyChild", "()Landroid/view/View;", "child", "Lzy11;", "onViewRemoved", "(Landroid/view/View;)V", "customContentView", "Landroid/view/View;", "value", "getContentView", "setContentView", "contentView", "flex-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ContentAwareFrameLayout extends FrameLayout implements wee {
    private View customContentView;

    public /* synthetic */ ContentAwareFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final View getOnlyChild() {
        if (getChildCount() == 1) {
            return getChildAt(0);
        }
        return null;
    }

    @Override // defpackage.wee
    /* renamed from: getContentView */
    public View getSwipeRefreshContent() {
        View view = this.customContentView;
        return (view == null && (view = getOnlyChild()) == null) ? this : view;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        super.onViewRemoved(child);
        if (jl40.l(child, this.customContentView)) {
            this.customContentView = null;
        }
    }

    public void setContentView(View view) {
        View view2 = this.customContentView;
        if (view2 != null) {
            removeView(view2);
        }
        this.customContentView = view;
        addView(view, 0);
    }

    public ContentAwareFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ContentAwareFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ContentAwareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
