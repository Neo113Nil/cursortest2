package xsna;

import android.content.Context;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.Image;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import xsna.o1b0;
import xsna.xaz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zlm0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ zlm0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sht0 sht0Var;
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                break;
            case 3:
                nox0 nox0Var = (nox0) obj;
                break;
            case 4:
                float f = hmn0.a;
                break;
            case 5:
                qgi0.r((tgi0) obj, "ad_banner_action_button");
                break;
            case 6:
                break;
            case 7:
                String str = (String) obj;
                if (str == null) {
                    break;
                } else {
                    break;
                }
            case 8:
                yg5 yg5Var = (yg5) obj;
                if (yg5Var.M0() && !yg5Var.R0().h()) {
                    VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
                    if (videoAutoPlay != null && (sht0Var = videoAutoPlay.l0) != null) {
                        o1b0 c = qu5.c();
                        o1b0.a aVar = o1b0.a;
                        c.f(sht0Var, true);
                    }
                }
                break;
            case 9:
                Image image = (Image) obj;
                qcy<Object>[] qcyVarArr2 = VideoFileAdapter.l;
                if (image != null) {
                    break;
                }
                break;
            case 10:
                ((Integer) obj).intValue();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                xaz xazVar = (xaz) obj;
                if ((xazVar instanceof xaz.d) && epx.f(((xaz.d) xazVar).b, "ShareLinkFromMainMenu")) {
                    r1 = true;
                }
                break;
            case 15:
                String str2 = (String) obj;
                com.vk.voip.ui.c.p.getClass();
                Context context = e43.a;
                fvr.l(context != null ? context : null, str2);
                ysg0.b.a(new hrw0(str2));
                break;
            default:
                BeautyFilterIntensity beautyFilterIntensity = (BeautyFilterIntensity) obj;
                com.vk.voip.ui.c.r.p(beautyFilterIntensity);
                com.vk.voip.ui.c.C = b39.a(com.vk.voip.ui.c.C, null, beautyFilterIntensity, 1);
                break;
        }
        return s3q0.a;
    }
}
