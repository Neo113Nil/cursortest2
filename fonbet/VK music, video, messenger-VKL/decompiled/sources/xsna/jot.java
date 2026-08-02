package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: GestureFeedbackItemViewHolder.kt */
/* loaded from: classes7.dex */
public final class jot extends vfz<d1f0> {
    public final ImageScreenSize l;
    public final VKImageView m;

    public jot(ViewGroup viewGroup) {
        super(R.layout.voip_call_view_item_gesture_feedback, viewGroup);
        this.l = ImageScreenSize.SIZE_16DP;
        this.m = (VKImageView) this.itemView.findViewById(R.id.voip_call_view_gesture_feedback);
    }

    @Override // xsna.vfz
    public final void W5(d1f0 d1f0Var) {
        ImageList imageList = d1f0Var.b.b;
        ImageScreenSize imageScreenSize = this.l;
        Image Gb = imageList.Gb(imageScreenSize.h());
        VKImageView vKImageView = this.m;
        if (Gb != null) {
            vKImageView.O0(Gb.d, imageScreenSize);
        } else {
            vKImageView.setImageDrawable(null);
            this.itemView.setOnClickListener(null);
        }
    }
}
