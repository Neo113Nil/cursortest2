package xsna;

import android.view.ViewGroup;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerRender;
import com.vk.stickers.views.VKStickerImageView;
import com.vkontakte.android.R;

/* compiled from: StickerHolder.kt */
/* loaded from: classes6.dex */
public final class p4l0 extends vfz<y1l0> {
    public static final int n = iah0.a(80);
    public final ViewGroup l;
    public final VKStickerImageView m;

    public p4l0(g3l0 g3l0Var, ViewGroup viewGroup) {
        super(new VKStickerImageView(viewGroup.getContext(), null, 6, 0));
        this.l = viewGroup;
        VKStickerImageView vKStickerImageView = (VKStickerImageView) this.itemView;
        this.m = vKStickerImageView;
        viewGroup.getContext();
        int a = iah0.a(8);
        vKStickerImageView.setPadding(a, a, a, a);
        vKStickerImageView.setAspectRatio(1.0f);
        vKStickerImageView.setClickable(true);
        vKStickerImageView.getHierarchy().d.setVisible(true, true);
        vKStickerImageView.getHierarchy().q(0);
        vKStickerImageView.setContentDescription(vKStickerImageView.getContext().getString(R.string.stickers_accessibility_sticker));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(y1l0 y1l0Var) {
        StickerItem stickerItem = y1l0Var.c;
        StickerRender stickerRender = stickerItem.i;
        int i = n;
        VKStickerImageView vKStickerImageView = this.m;
        if (stickerRender != null && stickerRender.f) {
            vKStickerImageView.W0(stickerRender, i);
            return;
        }
        t6g0 t6g0Var = t6g0.b;
        vKStickerImageView.load(t6g0.d().z0(stickerItem, i, dhr0.a.c(this.l.getContext())));
        vKStickerImageView.setTag(R.id.id, Integer.valueOf(stickerItem.b));
    }
}
