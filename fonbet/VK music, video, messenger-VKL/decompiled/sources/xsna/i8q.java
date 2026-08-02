package xsna;

import android.view.View;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExpandableMenuAdapter.kt */
/* loaded from: classes6.dex */
public final class i8q extends ksl<kbn0> {
    public final u7n0 j;
    public final nl k;

    public i8q(u7n0 u7n0Var) {
        super(new com.vk.lists.a(h620.a));
        this.j = u7n0Var;
        this.k = new nl();
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        if (i == R.layout.vk_super_app_showcase_expandable_menu_expanded_element_holder) {
            return new a8n0(view, this.j, this.k);
        }
        if (i == R.layout.vk_super_app_showcase_expandable_menu_stub_element_holder) {
            return new d8n0(view);
        }
        throw new IllegalStateException("Unsupported viewType");
    }

    @Override // xsna.gf6, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        kbn0 kbn0Var = (kbn0) this.c.c(i);
        if (kbn0Var instanceof j8q) {
            return R.layout.vk_super_app_showcase_expandable_menu_expanded_element_holder;
        }
        if (kbn0Var instanceof m8q) {
            return R.layout.vk_super_app_showcase_expandable_menu_stub_element_holder;
        }
        throw new NoWhenBranchMatchedException();
    }
}
