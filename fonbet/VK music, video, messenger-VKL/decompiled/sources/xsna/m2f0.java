package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ReactionViewHolder.kt */
/* loaded from: classes7.dex */
public final class m2f0 extends vfz<d1f0> {
    public final lbe l;
    public final ImageScreenSize m;
    public final VKImageView n;

    public m2f0(ViewGroup viewGroup, lbe lbeVar) {
        super(R.layout.voip_call_view_card_reactions, viewGroup);
        this.l = lbeVar;
        this.m = ImageScreenSize.SIZE_28DP;
        this.n = (VKImageView) this.itemView.findViewById(R.id.voip_call_view_reactions_btn);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(d1f0 d1f0Var) {
        d1f0 d1f0Var2 = d1f0Var;
        b69 b69Var = d1f0Var2.b;
        ImageList imageList = b69Var.b;
        ImageScreenSize imageScreenSize = this.m;
        Image Gb = imageList.Gb(imageScreenSize.h());
        this.itemView.setContentDescription(b69Var.c);
        VKImageView vKImageView = this.n;
        if (Gb == null) {
            vKImageView.setImageDrawable(null);
            this.itemView.setOnClickListener(null);
        } else {
            vKImageView.O0(Gb.d, imageScreenSize);
            bwt0.i0(this.itemView, new ij8(26, this, d1f0Var2));
        }
    }
}
