package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.holders.ads.AdSearchBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import one.video.controls20.SimpleControlsView;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zh0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zu50 zu50Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AdSearchBannerVh adSearchBannerVh = (AdSearchBannerVh) obj;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null && (zu50Var = adSearchBannerVh.n) != null) {
                    zu50Var.e(b);
                    break;
                }
                break;
            case 1:
                sq7 sq7Var = (sq7) obj;
                if (!sq7Var.G) {
                    sq7Var.U6(sq7Var.itemView);
                    break;
                }
                break;
            case 2:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).e;
                if (efmVar != null) {
                    efmVar.onClose();
                    break;
                }
                break;
            case 3:
                ((com.vk.newsfeed.common.recycler.holders.c) obj).n.invoke(LeadFormHolder.ButtonAction.NEXT_PAGE);
                break;
            case 4:
                p950 p950Var = (p950) obj;
                VKActivity vKActivity = p950Var.i;
                if (!p950Var.m) {
                    p950Var.m = true;
                    p950Var.k.getClass();
                    q55.a(p950Var);
                    CharSequence text = vKActivity.getText(R.string.music_verify_phone_text);
                    p950Var.j.getClass();
                    com.vk.auth.validation.b.c(r55.d, vKActivity, p950Var.l, text);
                    break;
                } else {
                    p950Var.d();
                    break;
                }
            case 5:
                ((com.vk.sharing.core.view.f) obj).B1();
                break;
            case 6:
                int i2 = SimpleControlsView.S;
                ((SimpleControlsView) obj).getClass();
                break;
            case 7:
                gzs<s3q0> gzsVar = ((VideoCatalogHeaderBrandedVh) obj).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 8:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj;
                int i3 = VideoRelatedVideosFragment.n0;
                b.d dVar = b.d.b;
                videoRelatedVideosFragment.getClass();
                xn50.a.c(videoRelatedVideosFragment, dVar);
                break;
            case 9:
                ((ejt0) obj).f.invoke();
                break;
            case 10:
                ((VkContextMenu) obj).b();
                break;
            case 11:
                VkMiniInfoCell.b bVar = VkMiniInfoCell.o;
                ((VkMiniInfoCell.f) obj).c.invoke();
                break;
            case 12:
                eav0 eav0Var = (eav0) obj;
                eav0Var.b.onDismiss();
                dw20 dw20Var = eav0Var.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
            default:
                fzy0 fzy0Var = (fzy0) obj;
                fzy0Var.g.g(fzy0Var.P);
                break;
        }
    }

    public /* synthetic */ zh0(SimpleControlsView simpleControlsView, Context context) {
        this.b = 6;
        this.c = simpleControlsView;
    }
}
