package xsna;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.Collections;

/* compiled from: StickerSimpleLongtapWindow.kt */
/* loaded from: classes6.dex */
public final class y6l0 {
    public final w6l0 a;
    public final u390 b;

    public y6l0(Context context, boolean z) {
        w6l0 w6l0Var = new w6l0(context, z);
        this.a = w6l0Var;
        u390 u390Var = new u390(w6l0Var.getView(), null);
        this.b = u390Var;
        u390Var.d = new PopupWindow.OnDismissListener() { // from class: xsna.x6l0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                bbl0 bbl0Var = y6l0.this.a.c;
                bbl0Var.f = Collections.EMPTY_LIST;
                bbl0Var.notifyDataSetChanged();
            }
        };
    }
}
