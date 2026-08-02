package xsna;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.comments.CommentsOrder;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: CommentsOrderMenuItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class xfg extends zoj0<CommentsOrder.Item, RecyclerView.e0> {
    public WeakReference<yfg> e;
    public a f;

    /* compiled from: CommentsOrderMenuItemsAdapter.kt */
    public interface a {
        void a(CommentsOrder.Item item);
    }

    /* compiled from: CommentsOrderMenuItemsAdapter.kt */
    public static final class b extends vif0<CommentsOrder.Item> {
        public final TextView n;

        public b(ViewGroup viewGroup) {
            super(viewGroup, R.layout.holder_popup_menu_item, 0);
            TextView textView = (TextView) this.itemView;
            this.n = textView;
            int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
            dhr0.a.getClass();
            zgr0 zgr0Var = dhr0.f;
            textView.setTextColor(new ColorStateList(iArr, new int[]{zgr0Var.a(R.attr.vk_ui_text_accent, viewGroup.getContext()), zgr0Var.a(R.attr.vk_ui_text_primary, viewGroup.getContext())}));
        }

        @Override // xsna.vif0
        public final void i6(CommentsOrder.Item item) {
            this.n.setText(item.c);
        }
    }

    public xfg() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        CommentsOrder.Item item = (CommentsOrder.Item) this.c.c(i);
        if (item == null) {
            return;
        }
        WeakReference<yfg> weakReference = this.e;
        yfg yfgVar = weakReference != null ? weakReference.get() : null;
        if (yfgVar != null && (e0Var instanceof b)) {
            b bVar = (b) e0Var;
            bVar.V5(item);
            bVar.n.setSelected(epx.f(item.b, yfgVar.c));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        b bVar = new b(viewGroup);
        bwt0.i0(bVar.itemView, new g6(6, bVar, this));
        return bVar;
    }
}
