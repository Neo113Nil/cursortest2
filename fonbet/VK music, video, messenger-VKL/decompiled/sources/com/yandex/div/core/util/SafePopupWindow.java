package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: SafePopupWindow.kt */
/* loaded from: classes7.dex */
public class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
