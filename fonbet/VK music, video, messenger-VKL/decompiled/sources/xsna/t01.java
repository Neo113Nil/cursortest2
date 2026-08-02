package xsna;

import android.view.View;
import com.vk.articles.ArticleFragment;
import com.vk.channels.impl.comments.ChannelCommentsFragment;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.money.pin.PinFragment;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.sharing.core.view.l;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import xsna.ptw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((w01) obj).b.a(AdsItemViewEvent.f.b);
                break;
            case 1:
                ArticleFragment articleFragment = (ArticleFragment) obj;
                int i2 = ArticleFragment.E0;
                com.vk.articles.a aVar = articleFragment.m0;
                if (aVar != null) {
                    aVar.clearFocus();
                }
                articleFragment.finish();
                break;
            case 2:
                int i3 = ChannelCommentsFragment.U;
                ((ChannelCommentsFragment) obj).finish();
                break;
            case 3:
                ((bmc) obj).b.a(ClipItemViewEvent.OwnerClicked.CONTAINER);
                break;
            case 4:
                int i4 = ExploreFragment.h0;
                ((ExploreFragment) obj).no(FragmentWithGlobalSearch$TargetAction.HeaderSearchIconClick);
                break;
            case 5:
                kl70 kl70Var = ((gl70) obj).c;
                if (kl70Var.c.getExpanded()) {
                    kl70Var.b.q();
                    break;
                }
                break;
            case 6:
                ((com.vk.photogallery.c) obj).c();
                break;
            case 7:
                int i5 = PinFragment.b0;
                h3p0.b((PinFragment) obj);
                break;
            case 8:
                cqb0.p((cqb0) obj);
                break;
            case 9:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) obj;
                if (!fVar.o1()) {
                    l.a aVar2 = fVar.D;
                    if (aVar2 != null) {
                        aVar2.i2();
                        break;
                    }
                } else {
                    fVar.W1();
                    break;
                }
                break;
            case 10:
                izs izsVar = (izs) obj;
                if (!bwt0.B().a()) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 11:
                VkTooltip.b bVar = ((VkTooltip) obj).x;
                if (bVar != null) {
                    bVar.b(VkTooltip.DismissReason.CLOSE_BUTTON_CLICK);
                    break;
                }
                break;
            case 12:
                ((cuw0) obj).c.invoke(ptw0.b.b);
                break;
            case 13:
                qyw0 qyw0Var = (qyw0) obj;
                qyw0Var.c.invoke(ScheduledVideoMuteOption.DisabledPermanent);
                dw20 dw20Var = qyw0Var.i;
                if (dw20Var != null) {
                    dw20Var.tn();
                    break;
                }
                break;
            default:
                pla.e().b().c = null;
                ((tsk0) obj).invoke();
                break;
        }
    }
}
