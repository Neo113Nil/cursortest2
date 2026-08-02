package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: EmojiHolder.kt */
/* loaded from: classes15.dex */
public final class ldp extends RecyclerView.e0 {
    public final VkImage l;

    public ldp(Context context, uei0 uei0Var) {
        super(new VkImage(context, null, 6, 0));
        VkImage vkImage = (VkImage) this.itemView;
        this.l = vkImage;
        int a = iah0.a(8);
        vkImage.setAspectRatio(1.0f);
        vkImage.setPadding(a, a, a, a);
        bwt0.h0(new com.vk.im.video.c(3, this, uei0Var), vkImage);
        vkImage.setContentDescription(context.getString(R.string.accessibility_emoji));
        vkImage.setForeground(xus.a(iah0.a(12), 0, dhr0.Y(R.attr.vk_ui_separator_primary_alpha, context), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
    }
}
