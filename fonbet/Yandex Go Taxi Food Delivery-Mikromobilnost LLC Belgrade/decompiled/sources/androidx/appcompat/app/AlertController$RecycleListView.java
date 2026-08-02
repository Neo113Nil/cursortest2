package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.n4i0;

/* loaded from: classes10.dex */
public class AlertController$RecycleListView extends ListView {
    private final int mPaddingBottomNoButtons;
    private final int mPaddingTopNoTitle;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4i0.RecycleListView);
        this.mPaddingBottomNoButtons = obtainStyledAttributes.getDimensionPixelOffset(n4i0.RecycleListView_paddingBottomNoButtons, -1);
        this.mPaddingTopNoTitle = obtainStyledAttributes.getDimensionPixelOffset(n4i0.RecycleListView_paddingTopNoTitle, -1);
    }

    public void setHasDecor(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.mPaddingTopNoTitle, getPaddingRight(), z2 ? getPaddingBottom() : this.mPaddingBottomNoButtons);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
