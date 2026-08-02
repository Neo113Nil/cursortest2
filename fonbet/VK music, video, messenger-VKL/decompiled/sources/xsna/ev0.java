package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;

/* compiled from: AdsCardsCarouselAdapter.kt */
/* loaded from: classes4.dex */
public final class ev0 extends RecyclerView.Adapter<iv0> {
    public final ArrayList c = new ArrayList();
    public int d;
    public wf0 e;
    public boolean f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(iv0 iv0Var, int i) {
        iv0 iv0Var2 = iv0Var;
        ShitAttachment.Card card = (ShitAttachment.Card) this.c.get(i);
        iv0Var2.v = this.e;
        iv0Var2.V5(card);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final iv0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        FrameLayout lv0Var;
        int i2 = iv0.w;
        boolean z = this.f;
        int i3 = this.d;
        if (z) {
            Context context = viewGroup.getContext();
            lv0Var = new kv0(context, null, 0);
            View.inflate(context, R.layout.news_ad_card_item_special, lv0Var);
            VkImage vkImage = (VkImage) lv0Var.findViewById(R.id.content_photo);
            VkButton vkButton = (VkButton) lv0Var.findViewById(R.id.button);
            if (vkImage != null) {
                vkImage.setPlaceholderImage(R.drawable.card_image_placeholder);
                vkImage.z0(iah0.b(12.0f), iah0.b(12.0f), iah0.b(2.0f), iah0.b(2.0f));
                vkImage.y0(iah0.b(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
            }
            if (vkButton != null) {
                vkButton.setBackgroundTint(R.attr.vk_ui_background_contrast_themed);
                vkButton.setTextTint(R.attr.vk_ui_text_primary);
            }
        } else {
            lv0Var = new lv0(viewGroup.getContext(), i3);
        }
        return new iv0(lv0Var, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(iv0 iv0Var) {
        iv0 iv0Var2 = iv0Var;
        iv0Var2.itemView.getViewTreeObserver().addOnPreDrawListener(iv0Var2.u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(iv0 iv0Var) {
        iv0 iv0Var2 = iv0Var;
        iv0Var2.itemView.getViewTreeObserver().removeOnPreDrawListener(iv0Var2.u);
    }
}
