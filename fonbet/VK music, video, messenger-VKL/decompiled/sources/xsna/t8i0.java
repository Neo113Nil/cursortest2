package xsna;

import android.view.View;
import com.vkontakte.android.R;
import xsna.s8i0;
import xsna.s8i0.b;

/* compiled from: SelectHighlightsDialogController.kt */
/* loaded from: classes6.dex */
public final class t8i0 extends gf6<zif0> {
    public final /* synthetic */ s8i0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8i0(s8i0 s8i0Var) {
        super((com.vk.lists.a) null, 3);
        this.e = s8i0Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        s8i0.a.a.getClass();
        s8i0 s8i0Var = this.e;
        if (i == R.layout.item_create_highlight_redesign) {
            return s8i0Var.new b(view, s8i0Var.e, s8i0Var.i, s8i0Var.j);
        }
        if (i == R.layout.pds_item_select_highlight) {
            return new s8i0.d(view, s8i0Var.h, new ajd0(s8i0Var, 4));
        }
        if (i == R.layout.pds_item_select_highlight_list) {
            return new s8i0.f(s8i0Var, view);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType = "));
    }
}
