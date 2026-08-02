package xsna;

import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.MsgFooterBannerConfig;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vkontakte.android.R;

/* compiled from: VhSendGiftBanner.kt */
/* loaded from: classes2.dex */
public final class ivr0 extends osr0<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h> {
    public static final Object r = new Object();
    public final View m;
    public final Button n;
    public final VKEnhancedImageView o;
    public final ImageView p;
    public final int q;

    public ivr0(View view) {
        super(view);
        this.m = view;
        this.n = (Button) view.findViewById(R.id.gift_banner_button);
        this.o = (VKEnhancedImageView) view.findViewById(R.id.gift_banner_image);
        this.p = (ImageView) view.findViewById(R.id.close_button);
        this.q = cn70.b(120);
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        String str;
        ImageSize Cb;
        String str2;
        ImageSize Cb2;
        pk30 pk30Var2;
        Image Cb3;
        Image Ab;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h hVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h) obj;
        BannerButton bannerButton = hVar.d;
        t6g0 t6g0Var = t6g0.b;
        MsgFooterBannerConfig a = t6g0.d().O().a(hVar.c);
        Image zb = (!dhr0.M() || a.Ab() == null || ((Ab = a.Ab()) != null && Ab.b.isEmpty())) ? a.zb() : a.Ab();
        Image Bb = (!dhr0.M() || a.Cb() == null || ((Cb3 = a.Cb()) != null && Cb3.b.isEmpty())) ? a.Bb() : a.Cb();
        VKEnhancedImageView vKEnhancedImageView = this.o;
        if (zb == null && Bb == null) {
            f4m.j(vKEnhancedImageView);
        } else {
            vKEnhancedImageView.setVisibility(0);
            vKEnhancedImageView.setAutoPlayAnimations(true);
            String str3 = "";
            int i = this.q;
            if (Bb == null || (Cb2 = Bb.Cb(i, true, false)) == null || (str = Cb2.d.d) == null) {
                str = "";
            }
            Uri parse = Uri.parse(str);
            if (zb != null && (Cb = zb.Cb(i, true, false)) != null && (str2 = Cb.d.d) != null) {
                str3 = str2;
            }
            Uri parse2 = Uri.parse(str3);
            Size size = new Size(i, i);
            sa30.K(vKEnhancedImageView, parse);
            sa30.K(vKEnhancedImageView, parse2);
            vKEnhancedImageView.getBackend().p(parse, parse2, size);
        }
        bwt0.p0(this.n, bannerButton != null);
        if (bannerButton != null) {
            int i2 = bannerButton.c;
            BannerButton.a aVar = bannerButton.b;
            pk30Var2 = pk30Var;
            l16.b(this.n, i2, dhr0.M() ? bannerButton.e : bannerButton.f, bannerButton.d, bannerButton.a, aVar, pk30Var2);
        } else {
            pk30Var2 = pk30Var;
        }
        bwt0.i0(this.p, new n9(27, pk30Var2, hVar));
        owi.a(r, 500L, new hvr0(pk30Var2, 0));
    }

    @Override // xsna.osr0
    public final void W5() {
        owi.b(r);
    }
}
