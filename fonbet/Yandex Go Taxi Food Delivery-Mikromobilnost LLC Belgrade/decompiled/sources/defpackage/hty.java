package defpackage;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* loaded from: classes10.dex */
public abstract class hty {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
