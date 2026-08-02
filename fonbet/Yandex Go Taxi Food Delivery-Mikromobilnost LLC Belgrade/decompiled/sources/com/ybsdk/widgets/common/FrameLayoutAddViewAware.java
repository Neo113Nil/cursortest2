package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.pg6;
import defpackage.qg6;
import defpackage.tes;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/widgets/common/FrameLayoutAddViewAware;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "Lzy11;", "onViewAdded", "(Landroid/view/View;)V", "onViewRemoved", "Ltes;", "listener", "Ltes;", "getListener", "()Ltes;", "setListener", "(Ltes;)V", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FrameLayoutAddViewAware extends FrameLayout {
    private tes listener;

    public /* synthetic */ FrameLayoutAddViewAware(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final tes getListener() {
        return this.listener;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        tes tesVar = this.listener;
        if (tesVar != null) {
            Iterator it = ((qg6) tesVar).a.iterator();
            while (it.hasNext()) {
                ((pg6) it.next()).onBottomSheetShown();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        super.onViewRemoved(child);
        tes tesVar = this.listener;
        if (tesVar != null) {
            Iterator it = ((qg6) tesVar).a.iterator();
            while (it.hasNext()) {
                ((pg6) it.next()).onBottomSheetClosed();
            }
        }
    }

    public final void setListener(tes tesVar) {
        this.listener = tesVar;
    }

    public FrameLayoutAddViewAware(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FrameLayoutAddViewAware(Context context) {
        this(context, null, 0, 6, null);
    }

    public FrameLayoutAddViewAware(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
