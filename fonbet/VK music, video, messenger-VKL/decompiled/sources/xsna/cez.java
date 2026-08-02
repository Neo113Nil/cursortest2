package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: ListButtonAccHolder.kt */
/* loaded from: classes6.dex */
public class cez extends vif0<a> implements UsableRecyclerView.e {
    public final VkCellButton n;

    /* compiled from: ListButtonAccHolder.kt */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Data(text="), this.a, ')');
        }
    }

    public cez(ViewGroup viewGroup) {
        super(viewGroup, R.layout.item_vk_material_list_button_account, 0);
        this.n = (VkCellButton) this.itemView.findViewById(R.id.account_cell_button);
    }

    @Override // xsna.vif0
    public final void i6(a aVar) {
        this.n.setTitle(aVar.a);
    }
}
