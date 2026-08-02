package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.stickers.popup.PopupStickerView;
import xsna.bbl0;

/* compiled from: StickerDetailsLongtapView.kt */
/* loaded from: classes6.dex */
public final class m3l0 implements bbl0.b {
    public final /* synthetic */ q3l0 a;
    public final /* synthetic */ Context b;

    public m3l0(q3l0 q3l0Var, Context context) {
        this.a = q3l0Var;
        this.b = context;
    }

    @Override // xsna.bbl0.b
    public final void a(bbl0.c cVar) {
        q3l0 q3l0Var = this.a;
        n1l0 n1l0Var = q3l0Var.m;
        if (n1l0Var == null || !(n1l0Var instanceof StickerItem)) {
            return;
        }
        StickerItem stickerItem = (StickerItem) n1l0Var;
        if (stickerItem.z9()) {
            q3l0Var.o = cVar;
            PopupStickerAnimation popupStickerAnimation = stickerItem.k;
            if (popupStickerAnimation != null) {
                PopupStickerView popupStickerView = new PopupStickerView(this.b, null, 0, 14, 0);
                q3l0Var.n = popupStickerView;
                popupStickerView.setLoadingCallback(new l3l0(q3l0Var));
                q3l0Var.f.addView(q3l0Var.n, new FrameLayout.LayoutParams(-1, -1));
                PopupStickerView popupStickerView2 = q3l0Var.n;
                if (popupStickerView2 != null) {
                    PopupStickerView.d(popupStickerView2, popupStickerAnimation, true, null, 12);
                }
            }
        }
    }
}
