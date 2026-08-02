package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.masks.Mask;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.masks.MasksController;
import com.vkontakte.android.R;
import xsna.bi10;
import xsna.xg10;

/* compiled from: GrouppedMasksHolder.kt */
/* loaded from: classes3.dex */
public final class qou extends vmg0<bi10.b> implements View.OnClickListener {
    public final xg10.a q;
    public final VKImageView r;
    public final View s;
    public Mask t;

    public qou(ViewGroup viewGroup, xg10.a aVar, zzz zzzVar) {
        super(tf3.b(viewGroup, R.layout.layout_groupped_mask, viewGroup, false), zzzVar);
        this.q = aVar;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.iv_image);
        this.r = vKImageView;
        this.s = this.itemView.findViewById(R.id.view_selected_foreground);
        jjc.f(this, this.itemView);
        vKImageView.setHasOverlappingRendering(false);
    }

    @Override // xsna.vmg0, xsna.vif0
    public final void i6(Object obj) {
        bi10.b bVar = (bi10.b) obj;
        this.itemView.setContentDescription(g6(bVar.b ? R.string.mask_view_holder_content_description_selected_mask : R.string.mask_view_holder_content_description_not_selected_mask));
        Mask mask = bVar.a;
        this.t = mask;
        NotificationImage notificationImage = mask.l;
        ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_56DP;
        this.r.O0(NotificationImage.Db(notificationImage, imageScreenSize.h()), imageScreenSize);
        boolean z = bVar.b;
        View view = this.s;
        if (!z) {
            view.setVisibility(8);
        } else if (this.t.u) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (MasksController.f().g >= this.t.Cb()) {
            Mask mask = this.t;
            this.q.c(mask.h, mask);
        }
    }
}
