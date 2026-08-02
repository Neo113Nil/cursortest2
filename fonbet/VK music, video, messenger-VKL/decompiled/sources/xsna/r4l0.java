package xsna;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.stickers.views.VKStickerCachedImageView;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: StickerWordsHolder.kt */
/* loaded from: classes6.dex */
public final class r4l0 extends vfz<u4l0> {
    public final TextView l;
    public final TextView m;
    public final FrameLayout n;

    /* compiled from: StickerWordsHolder.kt */
    public static final class a {
        public final ProgressBar a;
        public final VKStickerCachedImageView b;
        public final VKAnimationView c;

        public a(ProgressBar progressBar, VKStickerCachedImageView vKStickerCachedImageView, VKAnimationView vKAnimationView) {
            this.a = progressBar;
            this.b = vKStickerCachedImageView;
            this.c = vKAnimationView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "StickersPagerItemViewHolder(progress=" + this.a + ", image=" + this.b + ", animationView=" + this.c + ')';
        }
    }

    public r4l0(ViewGroup viewGroup) {
        super(R.layout.sticker_suggest_list_sticker_info_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.title);
        this.m = (TextView) this.itemView.findViewById(R.id.author);
        this.n = (FrameLayout) this.itemView.findViewById(R.id.sticker_container);
    }

    @Override // xsna.vfz
    public final void W5(u4l0 u4l0Var) {
        StickerStockItemWithStickerId stickerStockItemWithStickerId = u4l0Var.c;
        StickerStockItem stickerStockItem = stickerStockItemWithStickerId.b;
        this.l.setText(this.itemView.getContext().getString(R.string.sticker_details_overlay_sticker_title, stickerStockItem.d));
        this.m.setText(stickerStockItem.e);
        FrameLayout frameLayout = this.n;
        frameLayout.removeAllViews();
        VKStickerCachedImageView vKStickerCachedImageView = new VKStickerCachedImageView(this.itemView.getContext());
        vKStickerCachedImageView.getHierarchy().o(f5h0.i.a);
        ProgressBar progressBar = new ProgressBar(this.itemView.getContext());
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(this.itemView.getContext().getColor(R.color.vk_white)));
        progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
        VKAnimationView vKAnimationView = new VKAnimationView(this.itemView.getContext(), null);
        frameLayout.addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(vKStickerCachedImageView, new FrameLayout.LayoutParams(cn70.b(84), cn70.b(84), 17));
        frameLayout.addView(vKAnimationView, new FrameLayout.LayoutParams(cn70.b(84), cn70.b(84), 17));
        a aVar = new a(progressBar, vKStickerCachedImageView, vKAnimationView);
        frameLayout.setTag(aVar);
        StickerItem stickerItem = (StickerItem) stickerStockItemWithStickerId.d.getValue();
        if (stickerItem.g.V0()) {
            String a2 = stickerItem.a(dhr0.a.c(this.itemView.getContext()));
            int i = stickerItem.b;
            progressBar.setVisibility(0);
            vKStickerCachedImageView.setVisibility(8);
            vKAnimationView.setVisibility(8);
            vKAnimationView.setOnLoadAnimationCallback(new s4l0(aVar));
            vKAnimationView.v0(i, a2, true);
            return;
        }
        t6g0 t6g0Var = t6g0.b;
        String z0 = t6g0.d().z0(stickerItem, h9l0.b, dhr0.a.c(this.itemView.getContext()));
        progressBar.setVisibility(0);
        vKStickerCachedImageView.setVisibility(8);
        vKAnimationView.setVisibility(8);
        vKStickerCachedImageView.setVisibility(0);
        vKStickerCachedImageView.setOnLoadCallback(new t4l0(aVar));
        vKStickerCachedImageView.o0(z0, null);
    }
}
