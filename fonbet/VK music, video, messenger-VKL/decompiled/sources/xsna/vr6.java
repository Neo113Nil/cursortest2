package xsna;

import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentInduceClickView;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.ecomm.design.view.feed.FeedProductPinView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.money.MoneyTransfersFragment;
import com.vk.voip.ui.hint.VoipHintView;
import com.vkontakte.android.R;
import one.video.controls20.SimpleControlsView;
import xsna.c9z0;
import xsna.nlz;
import xsna.ryy;
import xsna.yey0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vr6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vr6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View findContainingItemView;
        int position;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((gv20) obj).c.invoke();
                break;
            case 1:
                ((ComponentInduceClickView) obj).a(view);
                break;
            case 2:
                gzs<s3q0> gzsVar = ((FeedProductPinView) obj).s;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 3:
                com.vk.newsfeed.common.recycler.holders.f fVar = (com.vk.newsfeed.common.recycler.holders.f) obj;
                fvr.l(fVar.itemView.getContext(), ((ryy.d) fVar.m).g);
                cvk.u(R.string.lead_ads_promo_copied, false);
                break;
            case 4:
                ((cmz) obj).b.invoke(nlz.a.b);
                break;
            case 5:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) obj;
                if (moneyTransfersFragment.N0.b == 0) {
                    moneyTransfersFragment.U0 = true;
                    moneyTransfersFragment.Mo(1007);
                    break;
                } else {
                    moneyTransfersFragment.Lo();
                    break;
                }
            case 6:
                txs txsVar = ((SimpleControlsView) obj).A;
                if (txsVar != null) {
                    txsVar.b();
                    break;
                }
                break;
            case 7:
                ((com.vk.movika.sdk.base.ui.l) obj).invoke();
                break;
            case 8:
                ((fym0) obj).n.invoke();
                break;
            case 9:
                bpn0 bpn0Var = VideoOverlayView.I;
                ((VideoOverlayView.c.C1234c) obj).b.invoke();
                break;
            case 10:
                ((VkMiniInfoCell.f) obj).c.invoke();
                break;
            case 11:
                int i2 = VoipHintView.g;
                gzs<s3q0> gzsVar2 = ((VoipHintView.a) obj).d;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            default:
                yey0.a aVar = ((i9y0) obj).e;
                if (aVar != null) {
                    yey0 yey0Var = yey0.this;
                    yey0.b bVar = yey0Var.b;
                    if (!yey0Var.e && yey0Var.isClickable() && (findContainingItemView = bVar.findContainingItemView(view)) != null && yey0Var.f != null && (position = bVar.getPosition(findContainingItemView)) >= 0) {
                        ((c9z0.a) yey0Var.f).d(findContainingItemView, position, 1);
                        break;
                    }
                }
                break;
        }
    }
}
