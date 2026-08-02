package com.yandex.div.core.tooltip;

import android.view.View;
import com.yandex.div.core.util.SafePopupWindow;
import xsna.zcl;

/* compiled from: DivTooltipWindow.kt */
/* loaded from: classes7.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public /* synthetic */ DivTooltipWindow(View view, int i, int i2, boolean z, int i3, zcl zclVar) {
        this(view, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public DivTooltipWindow(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
    }
}
