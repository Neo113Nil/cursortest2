package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.k9d0;

/* compiled from: ActionCamToggle.kt */
/* loaded from: classes7.dex */
public final class ty extends vu<k9d0.c> {
    public final int e;
    public final Integer f;

    public ty(int i, Integer num, gzs<s3q0> gzsVar) {
        super(null, gzsVar);
        this.e = i;
        this.f = num;
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        k9d0.c cVar = (k9d0.c) obj;
        ImageView imageView = (ImageView) view;
        bwt0.p0(imageView, true);
        boolean z = cVar.b;
        imageView.setActivated(!z);
        imageView.setElevation(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.e);
        imageView.setContentDescription(imageView.getContext().getString(z ? R.string.voip_accessibility_camera_off : R.string.voip_accessibility_camera_on));
        rdi.B(imageView, cVar.a);
    }

    @Override // xsna.wu
    public final int j() {
        Integer num = this.f;
        return num != null ? num.intValue() : super.j();
    }

    @Override // xsna.wu
    public final int k() {
        return R.drawable.ic_voip_primary_button_cam;
    }

    @Override // xsna.wu
    public final int m() {
        return R.color.voip_primary_button_icon_color_only_white_off_state;
    }

    @Override // xsna.wu
    public final PorterDuff.Mode n() {
        return PorterDuff.Mode.SRC_ATOP;
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: p */
    public final void h(ImageView imageView) {
        super.h(imageView);
        imageView.setId(R.id.btn_primary_turn_on_cam);
    }
}
