package com.ybsdk.widgets.tooltip.util;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/widgets/tooltip/util/TooltipPopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "contentView", "", "width", "height", "<init>", "(Landroid/view/View;II)V", "Lzy11;", "dismiss", "()V", "widgets-tooltip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TooltipPopupWindow extends PopupWindow {
    public TooltipPopupWindow(View view, int i, int i2) {
        super(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
