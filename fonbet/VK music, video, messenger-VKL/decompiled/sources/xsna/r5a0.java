package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.common.Attachment;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PhotoBlurredRestrictedHolder.kt */
/* loaded from: classes4.dex */
public final class r5a0 extends de6<p5a0> implements blc0 {
    public final RestrictedBlurredPhotoView k;
    public x64 l;
    public final nwf0 m;

    public r5a0(FrameLayout frameLayout) {
        super(frameLayout, 11);
        this.k = (RestrictedBlurredPhotoView) frameLayout.findViewById(R.id.attach);
        this.m = new nwf0(frameLayout, new wg(this, 2));
        frameLayout.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.m.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.l = x64Var;
    }

    @Override // xsna.de6
    public final void b(Attachment attachment) {
        if (attachment instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            this.k.h(photoAttachment.Ib(), photoAttachment.l.P);
        }
    }

    @Override // xsna.de6
    public final void c(p5a0 p5a0Var) {
        p5a0 p5a0Var2 = p5a0Var;
        this.k.h(p5a0Var2.g, p5a0Var2.f.P);
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.l;
        if (x64Var != null) {
            x64Var.a(this.d);
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
