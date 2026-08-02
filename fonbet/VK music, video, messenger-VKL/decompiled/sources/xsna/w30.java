package xsna;

import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.k9d0;

/* compiled from: ActionLoudspeaker.kt */
/* loaded from: classes7.dex */
public final class w30 extends vu<k9d0.f> {
    public final int e;
    public final Integer f;

    public w30(int i, Integer num, gzs<s3q0> gzsVar) {
        super(null, gzsVar);
        this.e = i;
        this.f = num;
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        k9d0.f fVar = (k9d0.f) obj;
        ImageView imageView = (ImageView) view;
        bwt0.p0(imageView, fVar.b);
        boolean z = fVar.a;
        imageView.setActivated(z);
        imageView.setElevation(z ? this.e : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView.setContentDescription(imageView.getContext().getString(z ? R.string.voip_accessibility_loudspeaker_off : R.string.voip_accessibility_loudspeaker_on));
    }

    @Override // xsna.wu
    public final int j() {
        Integer num = this.f;
        return num != null ? num.intValue() : super.j();
    }

    @Override // xsna.wu
    public final int k() {
        return R.drawable.vk_icon_volume_28_legacy;
    }
}
