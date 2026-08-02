package xsna;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewAuthors;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.superapp.browser.ui.VkImagesPreviewActivity;
import one.video.controls.views.PlayerControlsView;
import xsna.i1s0;
import xsna.l1o;
import xsna.msf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AboutVideoItem.q.b bVar = (AboutVideoItem.q.b) obj;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    bVar.c.e(bwt0.u(b));
                    break;
                }
                break;
            case 1:
                ((l1o.b) obj).l.invoke();
                break;
            case 2:
                ((wmr) obj).c.invoke();
                break;
            case 3:
                ((s0s) obj).l.e();
                break;
            case 4:
                ((fnw) obj).e.f(null);
                break;
            case 5:
                hv20<?> hv20Var = ((fv20) obj).r1;
                (hv20Var != null ? hv20Var : null).L0();
                break;
            case 6:
                ((e290) obj).c.invoke();
                break;
            case 7:
                PlayerControlsView.b bVar2 = PlayerControlsView.O;
                gzs<s3q0> skipForwardListener = ((PlayerControlsView) obj).getSkipForwardListener();
                if (skipForwardListener != null) {
                    skipForwardListener.invoke();
                    break;
                }
                break;
            case 8:
                f1c0 f1c0Var = (f1c0) obj;
                g1c0 g1c0Var = (g1c0) f1c0Var.C;
                if (g1c0Var != null) {
                    f1c0Var.d7(g1c0Var, MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_HEADER);
                    break;
                }
                break;
            case 9:
                ((rsf0) obj).d.invoke(msf0.h.b);
                break;
            case 10:
                StickersRouletteFragment stickersRouletteFragment = (StickersRouletteFragment) obj;
                int i2 = StickersRouletteFragment.o0;
                zal0.D(g2v.d().a(), stickersRouletteFragment.requireContext(), 10101, null, null, epx.f(stickersRouletteFragment.j0, "gift_random_sticker") ? "gift_random_pack" : "stickers_store", 44);
                break;
            case 11:
                String str = ((nxm0) obj).n;
                if (str != null) {
                    xwk.d().e().a(view.getContext(), str);
                    break;
                }
                break;
            case 12:
                ((gyn0) obj).b.a();
                break;
            case 13:
                Toast.makeText(((b5p0) obj).itemView.getContext(), "Click!", 0).show();
                break;
            case 14:
                i1s0 i1s0Var = (i1s0) obj;
                if (!(view instanceof VkCheckbox)) {
                    Object tag = view.getTag();
                    i1s0.c cVar = tag instanceof i1s0.c ? (i1s0.c) tag : null;
                    if (cVar != null && cVar.r) {
                        cVar.q.performClick();
                        break;
                    }
                } else {
                    VkCheckbox vkCheckbox = (VkCheckbox) view;
                    int i3 = ((i1s0.b) i1s0Var.h.c.c(((Integer) vkCheckbox.getTag()).intValue())).a;
                    Integer num = i1s0Var.n;
                    if (num != null && i3 == num.intValue()) {
                        i1s0Var.n = null;
                    }
                    ((i1s0.b) i1s0Var.h.c.c(((Integer) vkCheckbox.getTag()).intValue())).e = vkCheckbox.isChecked();
                    break;
                }
                break;
            case 15:
                int i4 = VkCellRight.z;
                gzs<s3q0> gzsVar = ((VkCell.Right.a.f) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                int i5 = VkImagesPreviewActivity.g;
                ((VkImagesPreviewActivity) obj).onBackPressed();
                break;
        }
    }
}
