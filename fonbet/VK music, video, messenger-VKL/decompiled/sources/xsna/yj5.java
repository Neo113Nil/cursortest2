package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.PackPreviewItem;
import com.vk.dto.stickers.StyleIcons;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.views.VKStickerImageView;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: AutoSuggestPackHolder.kt */
/* loaded from: classes5.dex */
public final class yj5 extends RecyclerView.e0 implements View.OnClickListener {
    public static final /* synthetic */ int o = 0;
    public final mj0 l;
    public PackPreviewItem m;
    public final VKStickerImageView n;

    public yj5(FrameLayout frameLayout, AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
        super(frameLayout);
        this.l = autoSuggestStickersPopupWindow;
        this.n = (VKStickerImageView) this.itemView.findViewById(R.id.pack_image_view);
        ((VKImageView) ((FrameLayout) this.itemView).getChildAt(0)).setAspectRatio(1.0f);
        frameLayout.setOnClickListener(this);
        frameLayout.setOnLongClickListener(new vj5());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        PackPreviewItem packPreviewItem = this.m;
        if (packPreviewItem != null) {
            int i = packPreviewItem.b;
            boolean zb = packPreviewItem.zb();
            mj0 mj0Var = this.l;
            if (!zb) {
                mj0Var.y(i, this.itemView.getContext());
                return;
            }
            Iterator<T> it = packPreviewItem.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((StyleIcons) obj).d) {
                        break;
                    }
                }
            }
            StyleIcons styleIcons = (StyleIcons) obj;
            if (styleIcons != null) {
                i = styleIcons.b;
            }
            mj0Var.a(i);
        }
    }
}
