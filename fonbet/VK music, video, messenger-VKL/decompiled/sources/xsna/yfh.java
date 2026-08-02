package xsna;

import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.VideoFile;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import xsna.xfh;

/* compiled from: CommunityProfileContentClipsAdapter.kt */
/* loaded from: classes5.dex */
public final class yfh implements vut0 {
    public final VkImage b;
    public final /* synthetic */ xfh.a c;

    public yfh(xfh.a aVar) {
        this.c = aVar;
        VkImage vkImage = new VkImage(aVar.itemView.getContext(), null, 6, 0);
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vkImage.setImageResource(R.drawable.clip_placeholder);
        bwt0.i0(vkImage, new b7(7, aVar, vkImage));
        this.b = vkImage;
    }

    @Override // xsna.vut0
    public final void c(rzt0 rzt0Var) {
        xfh.a aVar = this.c;
        ClipRectanglePreview clipRectanglePreview = aVar.r;
        if (rzt0Var instanceof xfh.a.C4000a) {
            iso0 s = com.vk.toggle.d.s();
            String F5 = ((VideoFile) aVar.m).F5();
            CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
            coreFeatures.getClass();
            String b = s.b(F5, com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d);
            VkImage vkImage = this.b;
            if (b != null) {
                vkImage.setThumbHash(b);
            }
            vkImage.o0(((xfh.a.C4000a) rzt0Var).a, new Size(clipRectanglePreview.getWidth(), clipRectanglePreview.getHeight()));
        }
    }

    @Override // xsna.vut0
    public final View getView() {
        return this.b;
    }
}
