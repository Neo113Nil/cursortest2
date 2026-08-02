package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: ListButtonRedHolder.kt */
/* loaded from: classes7.dex */
public class dez extends vif0<a> implements UsableRecyclerView.e {
    public final VkCellButton n;

    /* compiled from: ListButtonRedHolder.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.log_out);
        }

        public final String toString() {
            return "Data(text=2131958416)";
        }
    }

    public dez(ViewGroup viewGroup) {
        super(viewGroup, R.layout.vk_material_list_button_red, 0);
        this.n = (VkCellButton) this.itemView.findViewById(R.id.logout);
    }

    @Override // xsna.vif0
    public final void i6(a aVar) {
        aVar.getClass();
        this.n.setTitle(R.string.log_out);
    }
}
