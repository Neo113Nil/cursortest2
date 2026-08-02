package xsna;

import android.content.Context;
import android.view.View;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.core.tips.Tooltip;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemProfileButtonView;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import xsna.pbt0;
import xsna.y5c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ckc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ckc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GooglePay googlePay;
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickablePost clickablePost = (ClickablePost) this.d;
                qkcVar.m(clickablePost);
                g2v.c().k().t(view.getContext(), clickablePost.h);
                break;
            case 1:
                ((xkt) this.c).l.invoke(Integer.valueOf(((ykt) this.d).b));
                break;
            case 2:
                aau aauVar = (aau) this.c;
                y5c.a aVar = (y5c.a) this.d;
                z9u z9uVar = aauVar.o;
                if (z9uVar != null && (googlePay = (GooglePay) z9uVar.b) != null) {
                    aVar.c(googlePay);
                    break;
                }
                break;
            case 3:
                b8b0 b8b0Var = (b8b0) this.c;
                z6b0 z6b0Var = (z6b0) this.d;
                Playlist playlist = (Playlist) b8b0Var.l;
                if (playlist != null) {
                    z6b0Var.e.Ig(view.getId(), playlist);
                    z6b0Var.h.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_TO_PLAYLIST, PlayerMode.AUDIO);
                    break;
                }
                break;
            case 4:
                ((ProfileGiftsFragment) this.c).No(((GiftItem) this.d).f);
                break;
            case 5:
                Tooltip tooltip = (Tooltip) this.c;
                h4p0 h4p0Var = (h4p0) this.d;
                View.OnClickListener onClickListener = tooltip.g;
                if (onClickListener == null) {
                    h4p0Var.invoke(3);
                    break;
                } else {
                    onClickListener.onClick(view);
                    break;
                }
            case 6:
                pbt0.a aVar2 = (pbt0.a) this.c;
                pbt0 pbt0Var = (pbt0) this.d;
                mbt0 mbt0Var = aVar2.n;
                if (mbt0Var != null) {
                    pbt0Var.e.invoke(mbt0Var);
                    break;
                }
                break;
            default:
                VkEcosystemProfileButtonView.a((VkEcosystemProfileButtonView) this.c, (Context) this.d);
                break;
        }
    }
}
