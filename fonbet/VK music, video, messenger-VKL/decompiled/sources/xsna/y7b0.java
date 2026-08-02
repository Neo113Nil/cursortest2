package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: PlaylistCatalogItemTouchHelperCallback.kt */
/* loaded from: classes16.dex */
public final class y7b0 extends y7a {
    @Override // xsna.y7a, androidx.recyclerview.widget.r.d
    public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        super.b(recyclerView, e0Var);
        e0Var.itemView.setBackground(null);
    }

    @Override // xsna.y7a, androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        View view;
        super.o(e0Var, i);
        if (i != 2 || e0Var == null || (view = e0Var.itemView) == null) {
            return;
        }
        view.setBackground(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_secondary)));
    }
}
