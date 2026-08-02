package xsna;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vkontakte.android.R;

/* compiled from: VhCustomBanner.kt */
/* loaded from: classes2.dex */
public final class vqr0 extends osr0<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e> {
    public static final /* synthetic */ int r = 0;
    public final View m;
    public final Button n;
    public final TextView o;
    public final TextView p;
    public final VKEnhancedImageView q;

    public vqr0(View view) {
        super(view);
        this.m = view;
        this.n = (Button) view.findViewById(R.id.custom_banner_button);
        this.o = (TextView) view.findViewById(R.id.custom_banner_title);
        this.p = (TextView) view.findViewById(R.id.custom_banner_description);
        this.q = (VKEnhancedImageView) view.findViewById(R.id.custom_banner_icon);
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e eVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e) obj;
        BannerButton bannerButton = eVar.f;
        this.o.setText(eVar.c);
        this.p.setText(eVar.e);
        String str = eVar.d;
        if (drm0.N(str)) {
            str = null;
        }
        VKEnhancedImageView vKEnhancedImageView = this.q;
        if (str != null) {
            bwt0.m0(cn70.b(PsExtractor.AUDIO_STREAM), cn70.b(120), vKEnhancedImageView);
            vKEnhancedImageView.setRemoteImage(str);
        } else {
            vKEnhancedImageView.clear();
        }
        bwt0.p0(this.n, bannerButton != null);
        if (bannerButton != null) {
            int i = bannerButton.c;
            BannerButton.a aVar = bannerButton.b;
            String str2 = bannerButton.a;
            l16.b(this.n, i, dhr0.M() ? bannerButton.e : bannerButton.f, bannerButton.d, str2, aVar, pk30Var);
        }
    }
}
