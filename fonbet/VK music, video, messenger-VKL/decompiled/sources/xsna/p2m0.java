package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.views.VKStickerCachedImageView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;

/* compiled from: StoryFastActionAdapter.kt */
/* loaded from: classes6.dex */
public final class p2m0 extends androidx.recyclerview.widget.x<x1l0, a8l0> {
    public final tcm0 c;

    /* compiled from: StoryFastActionAdapter.kt */
    public interface a {
        void b(x1l0 x1l0Var);
    }

    public p2m0(tcm0 tcm0Var) {
        super(new gqj0());
        this.c = tcm0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        getCurrentList().get(i).getClass();
        return R.layout.pds_item_story_message_keyboard_sticker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ImStickerView imStickerView;
        a8l0 a8l0Var = (a8l0) e0Var;
        x1l0 x1l0Var = getCurrentList().get(i);
        FrameLayout frameLayout = a8l0Var.n;
        f4m.m(17, frameLayout);
        StickerItem stickerItem = x1l0Var.a;
        Context context = a8l0Var.itemView.getContext();
        View view = a8l0Var.itemView;
        view.setContentDescription(view.getContext().getString(R.string.story_message_accessibility_sticker));
        iut0.q(view, new z7l0(view));
        a8l0Var.itemView.setOnClickListener(new y7l0(0, a8l0Var, x1l0Var));
        if (stickerItem.g.V0()) {
            ImStickerView imStickerView2 = new ImStickerView(context, null, 6);
            ImStickerView.b(imStickerView2, stickerItem, null, 6);
            imStickerView = imStickerView2;
        } else {
            VKStickerCachedImageView vKStickerCachedImageView = new VKStickerCachedImageView(context);
            t6g0 t6g0Var = t6g0.b;
            String z0 = t6g0.d().z0(stickerItem, a8l0Var.m, true);
            vKStickerCachedImageView.setOnLoadCallback(new cgr0(vKStickerCachedImageView, stickerItem.b));
            vKStickerCachedImageView.T0(z0);
            imStickerView = vKStickerCachedImageView;
        }
        if (!x1l0Var.c) {
            imStickerView.setAlpha(0.6f);
        }
        frameLayout.addView(imStickerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a8l0(tf3.b(viewGroup, i, viewGroup, false), this.c);
    }
}
