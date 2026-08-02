package xsna;

import android.content.Context;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.views.VKStickerImageView;
import com.vkontakte.android.R;

/* compiled from: KeyboardStickerHolder.kt */
/* loaded from: classes6.dex */
public final class fhy extends qf6 {
    public static final /* synthetic */ int n = 0;
    public final y4l0 l;
    public final VKStickerImageView m;

    /* compiled from: KeyboardStickerHolder.kt */
    public static final class a extends VKStickerImageView {
        @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
        public final boolean hasOverlappingRendering() {
            return false;
        }
    }

    public fhy(Context context, y4l0 y4l0Var) {
        super(new a(context, null, 6, 0));
        this.l = y4l0Var;
        VKStickerImageView vKStickerImageView = (VKStickerImageView) this.itemView;
        this.m = vKStickerImageView;
        int a2 = iah0.a(8);
        vKStickerImageView.setPadding(a2, a2, a2, a2);
        vKStickerImageView.setAspectRatio(1.0f);
        vKStickerImageView.setOnLongClickListener(new ehy());
        vKStickerImageView.setContentDescription(context.getString(R.string.accessibility_sticker));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        ghy ghyVar = (ghy) hfzVar;
        StickerItem stickerItem = ghyVar.d;
        boolean z = stickerItem.h;
        VKStickerImageView vKStickerImageView = this.m;
        if (z) {
            vKStickerImageView.setAlpha(1.0f);
        } else {
            vKStickerImageView.setAlpha(0.3f);
        }
        vKStickerImageView.setTag(R.id.id, Integer.valueOf(stickerItem.b));
        t6g0 t6g0Var = t6g0.b;
        vKStickerImageView.load(t6g0.d().z0(stickerItem, h9l0.i, dhr0.a.c(this.itemView.getContext())));
        bwt0.i0(vKStickerImageView, new fo6(15, this, ghyVar));
    }
}
