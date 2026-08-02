package xsna;

import android.app.Activity;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: ExtModal.kt */
/* loaded from: classes6.dex */
public final class cbq {
    public static final void a(dw20.b bVar) {
        Activity h = e3m.h(bVar.c);
        if (h == null || !h.getTheme().resolveAttribute(R.attr.vk_ui_text_accent, dbq.a, true)) {
            tgn0 tgn0Var = e370.x;
            if (tgn0Var == null) {
                tgn0Var = null;
            }
            gfx0 gfx0Var = e370.b;
            bVar.u0(tgn0Var.c(gfx0Var != null ? gfx0Var : null));
        }
    }
}
