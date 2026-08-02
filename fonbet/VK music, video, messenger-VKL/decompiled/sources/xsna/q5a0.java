package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PhotoBlurredRestrictedHolder.kt */
/* loaded from: classes4.dex */
public final class q5a0 extends ce6 implements blc0 {
    public final RestrictedBlurredPhotoView e;
    public x64 f;
    public final mwf0 g;

    public q5a0(PreviewAttachmentWrapper previewAttachmentWrapper) {
        super(previewAttachmentWrapper);
        this.e = (RestrictedBlurredPhotoView) previewAttachmentWrapper.findViewById(R.id.attach);
        this.g = new mwf0(previewAttachmentWrapper, new vg(this, 3));
        previewAttachmentWrapper.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.g.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.f = x64Var;
    }

    @Override // xsna.ce6
    public final void m(Attachment attachment) {
        if (attachment instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            this.e.h(photoAttachment.Ib(), photoAttachment.l.P);
        }
    }

    @Override // xsna.ce6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.f;
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
}
