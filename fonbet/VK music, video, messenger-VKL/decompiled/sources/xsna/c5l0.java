package xsna;

import android.content.Context;
import android.widget.PopupWindow;
import com.vk.core.ui.tracking.UiTrackingScreen;
import java.util.Collections;
import xsna.scl0;

/* compiled from: StickerLongtapWindow.kt */
/* loaded from: classes6.dex */
public final class c5l0 implements n0q0 {
    public final q3l0 b;
    public final u390 c;

    public c5l0(Context context, jod jodVar) {
        q3l0 q3l0Var = new q3l0(context);
        this.b = q3l0Var;
        q3l0Var.setStickerChecker(jodVar);
        u390 u390Var = new u390(q3l0Var.getView(), this);
        this.c = u390Var;
        u390Var.d = new PopupWindow.OnDismissListener() { // from class: xsna.b5l0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                q3l0 q3l0Var2 = c5l0.this.b;
                q3l0Var2.g.b(false);
                bbl0 bbl0Var = q3l0Var2.e;
                bbl0Var.f = Collections.EMPTY_LIST;
                bbl0Var.notifyDataSetChanged();
                q3l0Var2.o = null;
                q3l0Var2.f.removeView(q3l0Var2.n);
                q3l0Var2.n = null;
                scl0.a.a(new scl0.a());
            }
        };
    }

    public final void a(boolean z) {
        if (z) {
            hod hodVar = new hod(this, 14);
            q3l0 q3l0Var = this.b;
            q3l0Var.g.b(false);
            d3m.e(q3l0Var.c, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            d3m.e(q3l0Var.b, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : hodVar, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
