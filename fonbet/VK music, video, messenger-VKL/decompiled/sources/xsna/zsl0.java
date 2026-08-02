package xsna;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.superapp.api.dto.story.actions.WebActionSticker;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.gyw0;
import xsna.iyw0;
import xsna.jto0;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zsl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zsl0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        com.vk.libvideo.design.view.overlay.b a;
        switch (this.b) {
            case 0:
                ((ctl0) this.c).b.e(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, (StoriesContainer) this.d);
                break;
            case 1:
                WebActionSticker webActionSticker = (WebActionSticker) this.c;
                String str = (String) this.d;
                AnimatedStickerInfo animatedStickerInfo = (AnimatedStickerInfo) obj;
                int i = webActionSticker.b;
                if (i == 0) {
                    break;
                } else {
                    break;
                }
            case 2:
                ((zim0) this.c).a(((Boolean) obj).booleanValue(), (com.vk.movika.sdk.base.ui.l) this.d);
                break;
            case 3:
                ((izs) this.c).invoke(sum0.d.a((sum0.d) this.d, null, null, null, false, (String) obj, false, null, false, 0, null, false, false, 4079));
                break;
            case 4:
                ((i0b0) this.c).invoke(jto0.b.a((jto0.b) this.d, null, null, null, null, false, null, false, false, false, false, null, false, false, false, (tho0) obj, false, 49151));
                break;
            case 5:
                hcp0 hcp0Var = (hcp0) this.c;
                df30 df30Var = (df30) this.d;
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                Context context = hcp0Var.s;
                int a2 = e3m.a(hcp0Var.a ? R.dimen.video_topshelf_content_margin_bottom : R.dimen.video_topshelf_content_margin_bottom_without_dots, context);
                int a3 = e3m.a(hcp0Var.u.e ? R.dimen.video_topshelf_tablet_margins_horizontal : R.dimen.video_topshelf_content_margin_horizontal, context);
                int a4 = e3m.a(R.dimen.video_topshelf_content_margin_between, context);
                bVar.s = df30Var.getView().getId();
                bVar.l = 0;
                bVar.v = 0;
                bVar.setMargins(a4, 0, a3, a2);
                break;
            case 6:
                VideoItemSliderVh videoItemSliderVh = (VideoItemSliderVh) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                com.vk.libvideo.design.view.overlay.b bVar2 = (com.vk.libvideo.design.view.overlay.b) obj;
                boolean z = bVar2.c;
                boolean z2 = bVar2.d;
                if (z2 && !z) {
                    break;
                } else {
                    if (!z2 && videoItemSliderVh.v) {
                        VideoOverlayView videoOverlayView = videoItemSliderVh.N;
                        if (videoOverlayView == null) {
                            videoOverlayView = null;
                        }
                        if (videoOverlayView.getSizeMode() == VideoOverlayView.VideoRestrictionSize.MEDIUM) {
                            a = com.vk.libvideo.design.view.overlay.b.a(bVar2, 447);
                            break;
                        }
                    }
                    a = com.vk.libvideo.design.view.overlay.b.a(bVar2, 399);
                }
                break;
            case 7:
                xk80 xk80Var = (xk80) this.c;
                break;
            case 8:
                cyw0 cyw0Var = (cyw0) this.c;
                iyw0.a aVar = (iyw0.a) obj;
                boolean z3 = !aVar.b;
                cyw0Var.T(new gyw0.i(z3));
                cyw0.V(cyw0Var, Boolean.valueOf(z3), null, null, null, null, null, null, null, null, aVar, 510);
                break;
            default:
                pis0 pis0Var = (pis0) this.c;
                o7x0 o7x0Var = (o7x0) this.d;
                pis0Var.invoke();
                o7x0Var.f = null;
                break;
        }
        return s3q0.a;
    }
}
