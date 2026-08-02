package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.GifItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.qhv0;

/* compiled from: StoryGifHolder.kt */
/* loaded from: classes15.dex */
public final class f4m0 extends RecyclerView.e0 {
    public GifItem l;
    public final VKImageView m;

    public f4m0(ViewGroup viewGroup, final uei0 uei0Var, final sfp0 sfp0Var) {
        super(tf3.b(viewGroup, R.layout.story_gif_holder, viewGroup, false));
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.iv_gif);
        this.m = vKImageView;
        vKImageView.setVkScaleType(qhv0.e.a);
        vKImageView.setAspectRatio(1.0f);
        int a = iah0.a(8);
        bwt0.e0(this.itemView, a, a, a, a);
        int a2 = iah0.a(4);
        vKImageView.setPadding(a2, a2, a2, a2);
        vKImageView.setForeground(xus.a(iah0.a(12), 0, dhr0.Y(R.attr.vk_ui_separator_primary_alpha, viewGroup.getContext()), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        bwt0.h0(new View.OnClickListener() { // from class: xsna.e4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4m0 f4m0Var = f4m0.this;
                GifItem gifItem = f4m0Var.l;
                if (gifItem != null) {
                    uei0Var.m(gifItem);
                    f4m0Var.getAdapterPosition();
                    sfp0Var.a(gifItem);
                }
            }
        }, this.itemView);
    }
}
