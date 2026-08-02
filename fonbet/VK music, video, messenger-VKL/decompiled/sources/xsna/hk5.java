package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;

/* compiled from: AutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public final class hk5 extends BottomSheetBehavior.d {
    public int a = cn70.b(16);
    public final /* synthetic */ AutoSuggestStickersPopupWindow b;

    public hk5(AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
        this.b = autoSuggestStickersPopupWindow;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.b;
        ojf0 ojf0Var = autoSuggestStickersPopupWindow.x;
        if (ojf0Var == null || !ojf0Var.d) {
            int y = (int) view.getY();
            if (y > cn70.b(16)) {
                y = cn70.b(16);
            }
            if (y != this.a) {
                this.a = y;
                bwt0.d(autoSuggestStickersPopupWindow.i, y, (r4 & 2) != 0, (r4 & 4) != 0);
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{lhg.a(i, "BottomSheetBehavior new state = ")});
    }
}
