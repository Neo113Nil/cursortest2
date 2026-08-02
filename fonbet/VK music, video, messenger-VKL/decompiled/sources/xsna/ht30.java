package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.views.ReplyView;
import com.vk.im.ui.views.StencilLayout;
import com.vkontakte.android.R;
import xsna.rxd0;

/* compiled from: MsgPartReplyHolder.kt */
/* loaded from: classes2.dex */
public final class ht30 extends hr30<Attach, it30> implements rxd0.a {
    public ReplyView d;
    public pk30 e;
    public it30 f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_reply);
    public PhotoRestriction h;
    public StencilLayout.a i;

    @Override // xsna.rxd0.a
    public final void b(ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
        s(profilesSimpleInfo);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        it30 it30Var;
        oh30 oh30Var;
        int i = bubbleColors.k;
        int i2 = bubbleColors.p;
        it30 it30Var2 = this.f;
        Msg msg = it30Var2 != null ? it30Var2.c : null;
        boolean z = false;
        if (it30Var2 != null && it30Var2.s) {
            z = true;
        }
        int i3 = z ? R.style.VkIm_ReplyView_Subtitle_Text : R.style.VkIm_ReplyView_Subtitle_Media;
        ReplyView replyView = this.d;
        if (replyView == null) {
            replyView = null;
        }
        replyView.setSubtitleTextAppearance(i3);
        if (msg == null || msg.i || msg.w == null || (it30Var = this.f) == null || (oh30Var = it30Var.b) == null || !oh30Var.e) {
            ReplyView replyView2 = this.d;
            if (replyView2 == null) {
                replyView2 = null;
            }
            replyView2.setTitleTextColor(i);
            ReplyView replyView3 = this.d;
            if (replyView3 == null) {
                replyView3 = null;
            }
            replyView3.setLineColor(i);
            int i4 = z ? bubbleColors.g : bubbleColors.i;
            ReplyView replyView4 = this.d;
            (replyView4 != null ? replyView4 : null).setSubtitleTextColor(i4);
            return;
        }
        ReplyView replyView5 = this.d;
        if (replyView5 == null) {
            replyView5 = null;
        }
        replyView5.setTitleTextColor(i2);
        ReplyView replyView6 = this.d;
        if (replyView6 == null) {
            replyView6 = null;
        }
        replyView6.setLineColor(i2);
        int i5 = z ? R.attr.vk_legacy_text_primary : R.attr.vk_legacy_text_secondary;
        ReplyView replyView7 = this.d;
        (replyView7 == null ? null : replyView7).setSubtitleTextColor(e3m.f(i5, (replyView7 != null ? replyView7 : null).getContext()));
    }

    @Override // xsna.hr30
    public final void p(it30 it30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ProfilesSimpleInfo profilesSimpleInfo;
        StencilLayout.a aVar;
        ReplyView replyView;
        it30 it30Var2 = it30Var;
        this.e = pk30Var;
        this.f = it30Var2;
        rxd0 rxd0Var = it30Var2.n;
        if (rxd0Var != null) {
            rxd0Var.c(this);
        }
        if (rxd0Var == null || (profilesSimpleInfo = rxd0Var.a()) == null) {
            profilesSimpleInfo = new ProfilesSimpleInfo();
        }
        NestedMsg nestedMsg = it30Var2.e;
        if (nestedMsg == null) {
            return;
        }
        ReplyView replyView2 = this.d;
        if (replyView2 == null) {
            replyView2 = null;
        }
        this.h = po40.i(nestedMsg, replyView2.getContext());
        if (it30Var2.f != null) {
            aVar = new StencilLayout.a(it30Var2.g, it30Var2.h, dhr0.M() ? it30Var2.i : it30Var2.j, it30Var2.e(), StencilLayout.BorderWidth.Replay);
        } else {
            aVar = null;
        }
        this.i = aVar;
        s(profilesSimpleInfo);
        Msg msg = it30Var2.c;
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser != null) {
            if (!msgFromUser.k8() && msgFromUser.H.size() == 1 && (msgFromUser.gc() || msgFromUser.ic() || msgFromUser.fc())) {
                ReplyView replyView3 = this.d;
                replyView = replyView3 != null ? replyView3 : null;
                int b = cn70.b(6);
                ViewGroup.LayoutParams layoutParams = replyView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                f4m.v(b, replyView);
                replyView.setLayoutParams(layoutParams);
                return;
            }
            ReplyView replyView4 = this.d;
            replyView = replyView4 != null ? replyView4 : null;
            int b2 = cn70.b(0);
            ViewGroup.LayoutParams layoutParams2 = replyView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            f4m.v(b2, replyView);
            replyView.setLayoutParams(layoutParams2);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ReplyView replyView = (ReplyView) this.g.c(layoutInflater, viewGroup);
        this.d = replyView;
        if (replyView == null) {
            replyView = null;
        }
        bwt0.i0(replyView, new xgv(this, 14));
        ReplyView replyView2 = this.d;
        if (replyView2 == null) {
            return null;
        }
        return replyView2;
    }

    @Override // xsna.hr30
    public final void r() {
        rxd0 rxd0Var;
        it30 it30Var = this.f;
        if (it30Var != null && (rxd0Var = it30Var.n) != null) {
            rxd0Var.b(this);
        }
        this.f = null;
        this.e = null;
    }

    public final void s(ProfilesSimpleInfo profilesSimpleInfo) {
        it30 it30Var = this.f;
        NestedMsg nestedMsg = it30Var != null ? it30Var.e : null;
        if (nestedMsg != null) {
            ReplyView replyView = this.d;
            (replyView == null ? null : replyView).d(nestedMsg, this.h, profilesSimpleInfo, it30Var != null ? it30Var.f : null, this.i, nestedMsg.o);
        } else {
            ReplyView replyView2 = this.d;
            ReplyView replyView3 = replyView2 != null ? replyView2 : null;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            replyView3.c(Peer.Unknown.e, profilesSimpleInfo);
        }
    }
}
