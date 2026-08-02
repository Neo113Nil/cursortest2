package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;

/* compiled from: PackViewHolder.kt */
/* loaded from: classes6.dex */
public final class b790 extends RecyclerView.e0 {
    public static final /* synthetic */ int o = 0;
    public final ImageView l;
    public final VKStickerPackView m;
    public final TextView n;

    public b790(View view) {
        super(view);
        this.l = (ImageView) view.findViewById(R.id.pack_image_border);
        VKStickerPackView vKStickerPackView = (VKStickerPackView) view.findViewById(R.id.pack_image);
        this.m = vKStickerPackView;
        this.n = (TextView) view.findViewById(R.id.pack_name);
        vKStickerPackView.setPlaceHolder(uko.f(R.drawable.vk_icon_deprecated_ic_smile_outline_48, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, view.getContext()));
    }

    public final void V5(boolean z) {
        if (z) {
            d3m.c(this.l, (r15 & 1) != 0 ? 300L : 600L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this.l, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }
}
