package com.yandex.alicekit.core.utils;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/alicekit/core/utils/SafePopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "contentView", "", "width", "height", "<init>", "(Landroid/view/View;II)V", "Lzy11;", "setContentView", "(Landroid/view/View;)V", "core-utils_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(View view, int i, int i2) {
        super(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View contentView) {
        if (contentView != null) {
            contentView.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(contentView);
    }
}
