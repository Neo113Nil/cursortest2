package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;

/* compiled from: KeyboardStickerAnimatedHolder.kt */
/* loaded from: classes6.dex */
public final class bhy extends qf6 {
    public static final /* synthetic */ int n = 0;
    public final y4l0 l;
    public final ImStickerView m;

    public bhy(Context context, y4l0 y4l0Var) {
        super(new ImStickerView(context, null, 6));
        this.l = y4l0Var;
        ImStickerView imStickerView = (ImStickerView) this.itemView;
        this.m = imStickerView;
        int a = iah0.a(8);
        imStickerView.setPadding(a, a, a, a);
        imStickerView.setFadeDuration(100);
        imStickerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        imStickerView.setOnLongClickListener(new ahy());
        imStickerView.setContentDescription(context.getString(R.string.accessibility_sticker));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        chy chyVar = (chy) hfzVar;
        StickerItem stickerItem = chyVar.d;
        boolean z = stickerItem.h;
        ImStickerView imStickerView = this.m;
        if (z) {
            imStickerView.setAlpha(1.0f);
        } else {
            imStickerView.setAlpha(0.3f);
        }
        imStickerView.setTag(R.id.id, Integer.valueOf(stickerItem.b));
        ImStickerView.b(imStickerView, chyVar.d, null, 4);
        bwt0.i0(imStickerView, new z5a(16, this, chyVar));
    }
}
