package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PhotoThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final class mda0 extends sso0<PhotoAttachment> {
    public final kdg0 E;
    public final Drawable F;

    public mda0(ViewGroup viewGroup, kdg0 kdg0Var) {
        super(R.layout.attach_comment_photo, viewGroup);
        this.E = kdg0Var;
        this.F = o6(R.drawable.scrim_bottom_16percent);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        Photo photo = ((PhotoAttachment) attachment).l;
        boolean Ib = photo.Ib();
        VKImageView vKImageView = this.D;
        kdg0 kdg0Var = this.E;
        if (Ib) {
            kdg0Var.c(vKImageView, photo);
            return;
        }
        String str = photo.Fb(gbg0.a(this.itemView.getResources(), 120.0f), false).d.d;
        vKImageView.setOverlayImage(this.F);
        kdg0Var.f(vKImageView);
        vKImageView.load(str);
    }
}
