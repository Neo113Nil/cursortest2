package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.AttachMarket;
import com.vk.ecomm.moderation.ui.ModerationItemBlockedView;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartMarketBlockedHolder.kt */
/* loaded from: classes2.dex */
public final class ur30 extends hr30<AttachMarket, vr30> {
    public View d;
    public TimeAndStatusView e;
    public ModerationItemBlockedView f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_market_blocked);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        ModerationItemBlockedView moderationItemBlockedView = this.f;
        if (moderationItemBlockedView == null) {
            moderationItemBlockedView = null;
        }
        moderationItemBlockedView.setIconBackgroundColor(bubbleColors.x);
        ModerationItemBlockedView moderationItemBlockedView2 = this.f;
        if (moderationItemBlockedView2 == null) {
            moderationItemBlockedView2 = null;
        }
        moderationItemBlockedView2.setTextColor(bubbleColors.i);
        TimeAndStatusView timeAndStatusView = this.e;
        (timeAndStatusView != null ? timeAndStatusView : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(vr30 vr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        jr30 jr30Var = vr30Var.b;
        TimeAndStatusView timeAndStatusView = this.e;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.g.c(layoutInflater, viewGroup);
        this.d = c;
        if (c == null) {
            c = null;
        }
        this.e = (TimeAndStatusView) c.findViewById(R.id.timeAndStatus);
        View view = this.d;
        if (view == null) {
            view = null;
        }
        this.f = (ModerationItemBlockedView) view.findViewById(R.id.blockedView);
        View view2 = this.d;
        if (view2 == null) {
            return null;
        }
        return view2;
    }
}
