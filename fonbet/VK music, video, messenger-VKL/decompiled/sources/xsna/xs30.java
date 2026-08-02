package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;

/* compiled from: MsgPartPodcastEpisodeRestrictedHolder.kt */
/* loaded from: classes2.dex */
public final class xs30 extends hr30<AttachPodcastEpisode, ys30> {
    public MsgPartIconTwoRowView d;
    public final v5t e = new v5t(R.layout.vkim_msg_part_podcast_restricted);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        hr30.j(msgPartIconTwoRowView, bubbleColors);
    }

    @Override // xsna.hr30
    public final void p(ys30 ys30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        jr30 jr30Var = ys30Var.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        hr30.m(jr30Var, msgPartIconTwoRowView);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = (MsgPartIconTwoRowView) this.e.c(layoutInflater, viewGroup);
        this.d = msgPartIconTwoRowView;
        if (msgPartIconTwoRowView == null) {
            return null;
        }
        return msgPartIconTwoRowView;
    }
}
