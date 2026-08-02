package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;

/* compiled from: PacksAdapter.kt */
/* loaded from: classes6.dex */
public final class h890 extends zoj0<StickerStockItem, RecyclerView.e0> {
    public final xa9 e;
    public String f = "";

    /* compiled from: PacksAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final VKStickerPackView l;
        public final TextView m;
        public final TextView n;

        public a(ViewGroup viewGroup) {
            super(bwt0.I(R.layout.pack_pager_item, viewGroup, false));
            this.l = (VKStickerPackView) this.itemView.findViewById(R.id.pack_image);
            this.m = (TextView) this.itemView.findViewById(R.id.pack_title);
            this.n = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        }

        public final void V5(StickerStockItem stickerStockItem) {
            bwt0.i0(this.itemView, new l22(23, h890.this, stickerStockItem));
            dgr0.a(this.l, stickerStockItem);
            this.m.setText(stickerStockItem.d);
            this.n.setText(stickerStockItem.e);
        }
    }

    /* compiled from: PacksAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public final TextView l;

        public b(ViewGroup viewGroup) {
            super(bwt0.I(R.layout.probability_view, viewGroup, false));
            this.l = (TextView) this.itemView.findViewById(R.id.probability_note_tv);
        }
    }

    public h890(xa9 xa9Var) {
        this.e = xa9Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.length() > 0 ? super.getItemCount() + 1 : super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (i != 0 || this.f.length() <= 0 || drm0.N(this.f)) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (!(e0Var instanceof a)) {
            if (e0Var instanceof b) {
                b bVar = (b) e0Var;
                bVar.l.setText(h890.this.f);
                return;
            }
            return;
        }
        int length = this.f.length();
        uuk uukVar = this.c;
        if (length <= 0 || drm0.N(this.f)) {
            ((a) e0Var).V5((StickerStockItem) uukVar.c(i));
        } else {
            ((a) e0Var).V5((StickerStockItem) uukVar.c(i - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? new b(viewGroup) : new a(viewGroup);
    }
}
