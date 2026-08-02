package xsna;

import android.view.ViewGroup;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;

/* compiled from: TagsHolder.kt */
/* loaded from: classes4.dex */
public final class z1o0 extends qi6<FaveEntry> {
    @Override // xsna.qi6
    public final void E6(FaveEntry faveEntry) {
        iuu0 iuu0Var = (iuu0) this.itemView;
        FaveItem faveItem = faveEntry.i;
        iuu0Var.setTags(faveItem.e);
        if (faveItem.e.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
            }
            this.itemView.setMinimumHeight(0);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            this.itemView.setMinimumHeight(iah0.a(48));
        }
        this.itemView.invalidate();
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.j
    public final boolean isEnabled() {
        return false;
    }
}
