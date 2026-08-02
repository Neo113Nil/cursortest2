package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vkontakte.android.R;

/* compiled from: PhotoRestrictedHolder.kt */
/* loaded from: classes4.dex */
public final class bba0 extends ce6 implements blc0 {
    public x64 e;
    public final mwf0 f;

    public bba0(PreviewAttachmentWrapper previewAttachmentWrapper) {
        super(previewAttachmentWrapper);
        RestrictedPhotoView restrictedPhotoView = (RestrictedPhotoView) previewAttachmentWrapper.findViewById(R.id.attach);
        this.f = new mwf0(previewAttachmentWrapper, new mn9(this, 6));
        restrictedPhotoView.c(R.drawable.vk_icon_do_not_disturb_outline_56, e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary, restrictedPhotoView.getContext()), RestrictedPhotoView.u);
        restrictedPhotoView.setBackgroundColor(e3m.f(R.attr.vk_ui_image_placeholder, restrictedPhotoView.getContext()));
        int b = cn70.b(8);
        restrictedPhotoView.setPadding(b, b, b, b);
        previewAttachmentWrapper.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.f.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.e = x64Var;
    }

    @Override // xsna.ce6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.e;
        if (x64Var != null) {
            x64Var.a(this.c);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }

    @Override // xsna.ce6
    public final void m(Attachment attachment) {
    }
}
