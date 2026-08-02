package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vkontakte.android.R;
import xsna.dek0;
import xsna.qi6;

/* compiled from: DigestSpotlightHolder.kt */
/* loaded from: classes4.dex */
public final class sym extends iym {
    public final tym Y;
    public final VkImage Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sym(ViewGroup viewGroup) {
        super(viewGroup, r0);
        tym tymVar = new tym(viewGroup.getContext());
        this.Y = tymVar;
        VkImage coverView = tymVar.getCoverView();
        this.Z = coverView;
        getContext();
        dek0.b(coverView, null, new dek0.a(cn70.a() * 8.0f, true), 2);
        coverView.setPlaceholderImage(R.drawable.placeholder_radius_8);
        coverView.setCornerRadius(cn70.a() * 8.0f);
        coverView.y0(cn70.a() * 0.5f, viewGroup.getContext().getColor(R.color.vk_black_alpha8));
        coverView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // xsna.iym, xsna.uym, xsna.jym
    public final void R6(DigestItem digestItem) {
        super.R6(digestItem);
        String c7 = uym.c7(qi6.a.a(this.itemView.getContext()), digestItem.d());
        tym tymVar = this.Y;
        VkImage vkImage = this.Z;
        if (c7 == null || c7.length() == 0) {
            bwt0.p0(vkImage, false);
            tymVar.setSeparatorVisibility(true);
        } else {
            bwt0.p0(vkImage, true);
            vkImage.o0(c7, null);
            tymVar.setSeparatorVisibility(false);
        }
    }

    @Override // xsna.uym
    public final boolean U6(Attachment attachment) {
        return false;
    }

    @Override // xsna.uym
    public final void f7(DigestItem digestItem) {
    }

    @Override // xsna.iym, xsna.uym
    public final void i7(boolean z) {
    }
}
