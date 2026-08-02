package xsna;

import android.content.Context;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.stickers.views.VKStickerImageView;
import com.vkontakte.android.R;

/* compiled from: KeyboardUgcStickerHolder.kt */
/* loaded from: classes6.dex */
public final class khy extends qf6 {
    public static final /* synthetic */ int n = 0;
    public final y4l0 l;
    public final VKStickerImageView m;

    /* compiled from: KeyboardUgcStickerHolder.kt */
    public static final class a extends VKStickerImageView {
        @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
        public final boolean hasOverlappingRendering() {
            return false;
        }
    }

    public khy(Context context, y4l0 y4l0Var) {
        super(new a(context, null, 6, 0));
        this.l = y4l0Var;
        VKStickerImageView vKStickerImageView = (VKStickerImageView) this.itemView;
        this.m = vKStickerImageView;
        int a2 = iah0.a(8);
        vKStickerImageView.setPadding(a2, a2, a2, a2);
        vKStickerImageView.setAspectRatio(1.0f);
        vKStickerImageView.setOnLongClickListener(new jhy());
        vKStickerImageView.setContentDescription(context.getString(R.string.accessibility_sticker));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        String str;
        lhy lhyVar = (lhy) hfzVar;
        UGCStickerModel uGCStickerModel = lhyVar.d;
        Long valueOf = Long.valueOf(uGCStickerModel.c);
        VKStickerImageView vKStickerImageView = this.m;
        vKStickerImageView.setTag(R.id.id, valueOf);
        ImageList imageList = uGCStickerModel.e;
        if (imageList == null || (str = imageList.Hb(h9l0.i)) == null) {
            str = "";
        }
        vKStickerImageView.load(str);
        bwt0.i0(vKStickerImageView, new he3(27, this, lhyVar));
    }
}
