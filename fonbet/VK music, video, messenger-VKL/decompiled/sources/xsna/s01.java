package xsna;

import android.view.View;
import com.vk.auth.passport.VkPassportView;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionVh;
import com.vk.catalog2.common.ui.mvp.holder.group.delegate.SimpleGroupItemDelegate;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.hints.HintId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.k2a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class s01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [P extends xsna.z55<?>] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VkTooltip.b bVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((w01) obj).b.a(AdsItemViewEvent.j.b);
                break;
            case 1:
                ?? r11 = ((wa6) obj).o;
                ((p0c) (r11 != 0 ? r11 : null)).S();
                break;
            case 2:
                ((w6d) obj).e.a(h5d.b);
                break;
            case 3:
                vmq vmqVar = (vmq) obj;
                if (!jjc.b()) {
                    vmqVar.X6(NewsfeedExternalAction.Navigation.o.a);
                    break;
                }
                break;
            case 4:
                ((GroupsCollectionVh) obj).a(view);
                break;
            case 5:
                int i2 = LoaderFragment.k0;
                ((LoaderFragment) obj).so();
                break;
            case 6:
                int i3 = ModalReactionsFragment.G0;
                ((ModalReactionsFragment) obj).s();
                break;
            case 7:
                h2a0 h2a0Var = (h2a0) obj;
                int i4 = h2a0.j1;
                ((d2a0) h2a0Var.i1.getValue()).a(h2a0Var.Yn());
                h2a0Var.h1 = true;
                String string = h2a0Var.requireArguments().getString("arg_token");
                if (string == null) {
                    string = "";
                }
                h2a0Var.Zn(new k2a0.b(string));
                h2a0Var.dismiss();
                break;
            case 8:
                wda0 wda0Var = (wda0) obj;
                pk30 pk30Var = wda0Var.g;
                if (pk30Var != null) {
                    Msg msg = wda0Var.i;
                    if (msg == null) {
                        msg = null;
                    }
                    NestedMsg nestedMsg = wda0Var.h;
                    AttachImage attachImage = wda0Var.j;
                    pk30Var.R(attachImage != null ? attachImage : null, msg, nestedMsg);
                    break;
                }
                break;
            case 9:
                cqb0.r((cqb0) obj);
                break;
            case 10:
                ((cqc0) obj).X0(PostingVisibilityMode.BEST_FRIENDS);
                break;
            case 11:
                SimpleGroupItemDelegate simpleGroupItemDelegate = (SimpleGroupItemDelegate) obj;
                simpleGroupItemDelegate.h(simpleGroupItemDelegate.h.getContext(), simpleGroupItemDelegate.p, null, null, null);
                break;
            case 12:
                int i5 = VideoNewProfileToolbarV2.m;
                ((yei0) obj).invoke();
                break;
            case 13:
                ((VkPassportView) obj).z.d(true, true);
                break;
            case 14:
                VkTooltip vkTooltip = (VkTooltip) obj;
                View.OnClickListener onClickListener = vkTooltip.w;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (vkTooltip.z && (bVar = vkTooltip.x) != null) {
                    bVar.b(VkTooltip.DismissReason.TOOLTIP_CLICK);
                    break;
                }
                break;
            case 15:
                pla.e().b().b(HintId.VMOJI_KEYBOARD_AVATAR_SUGGESTION.getId());
                ((i70) obj).invoke();
                break;
            case 16:
                qyw0 qyw0Var = (qyw0) obj;
                qyw0Var.c.invoke(ScheduledVideoMuteOption.Enabled);
                dw20 dw20Var = qyw0Var.i;
                if (dw20Var != null) {
                    dw20Var.tn();
                    break;
                }
                break;
            default:
                ((vf1) obj).invoke();
                break;
        }
    }
}
