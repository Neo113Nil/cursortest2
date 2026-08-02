package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.common.Attachment;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vkontakte.android.R;

/* compiled from: PhotoRestrictedHolder.kt */
/* loaded from: classes4.dex */
public final class cba0 extends de6<aba0> implements blc0 {
    public x64 k;
    public final nwf0 l;

    public cba0(FrameLayout frameLayout) {
        super(frameLayout, 10);
        RestrictedPhotoView restrictedPhotoView = (RestrictedPhotoView) frameLayout.findViewById(R.id.attach);
        this.l = new nwf0(frameLayout, new nn9(this, 6));
        restrictedPhotoView.c(R.drawable.vk_icon_do_not_disturb_outline_56, e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary, restrictedPhotoView.getContext()), RestrictedPhotoView.u);
        restrictedPhotoView.setBackgroundColor(e3m.f(R.attr.vk_ui_image_placeholder, restrictedPhotoView.getContext()));
        int b = cn70.b(8);
        restrictedPhotoView.setPadding(b, b, b, b);
        frameLayout.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.l.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.k = x64Var;
    }

    @Override // xsna.de6
    public final /* bridge */ /* synthetic */ void c(aba0 aba0Var) {
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.k;
        if (x64Var != null) {
            x64Var.a(this.d);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.de6
    public final void b(Attachment attachment) {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
