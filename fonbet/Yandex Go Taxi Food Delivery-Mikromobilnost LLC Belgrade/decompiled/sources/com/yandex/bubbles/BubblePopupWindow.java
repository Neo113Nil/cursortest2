package com.yandex.bubbles;

import android.view.View;
import com.yandex.alicekit.core.utils.SafePopupWindow;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/bubbles/BubblePopupWindow;", "Lcom/yandex/alicekit/core/utils/SafePopupWindow;", "Landroid/view/View;", "contentView", "", "width", "height", "<init>", "(Landroid/view/View;II)V", "Lzy11;", "dismiss", "()V", "forceDismiss", "bubbles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BubblePopupWindow extends SafePopupWindow {
    public BubblePopupWindow(View view, int i, int i2) {
        super(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        forceDismiss();
    }

    public final void forceDismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
