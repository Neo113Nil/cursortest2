package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vkontakte.android.R;
import xsna.rxd0;

/* compiled from: MsgPartFwdChannelMsgHeaderHolder.kt */
/* loaded from: classes2.dex */
public final class lq30 extends hr30<AttachChannelMessage, jq30> implements rxd0.a {
    public TextView d;
    public TextView e;
    public VKAvatarView f;
    public AppCompatImageView g;
    public AppCompatImageView h;
    public TextView i;
    public pk30 j;
    public jq30 k;
    public final v5t l = new v5t(R.layout.vkim_msg_part_fwd_channel_msg_header);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            lq30 lq30Var = lq30.this;
            pk30 pk30Var = lq30Var.j;
            jq30 jq30Var = lq30Var.k;
            Msg msg = jq30Var != null ? jq30Var.k : null;
            Attach attach = jq30Var != null ? jq30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, null);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.rxd0.a
    public final void b(ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
        qtd0 zb;
        jq30 jq30Var = this.k;
        if (f1e0Var == null || jq30Var == null) {
            return;
        }
        UserId userId = jq30Var.b;
        if (!f1e0Var.e.contains(Long.valueOf(userId.b)) || (zb = profilesSimpleInfo.zb(new Peer.Channel(userId.b))) == null) {
            return;
        }
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(zb.name());
        VKAvatarView vKAvatarView = this.f;
        if (vKAvatarView == null) {
            vKAvatarView = null;
        }
        ImageList C8 = zb.C8();
        VKAvatarView vKAvatarView2 = this.f;
        if (vKAvatarView2 == null) {
            vKAvatarView2 = null;
        }
        int i = vKAvatarView2.getLayoutParams().width;
        VKAvatarView vKAvatarView3 = this.f;
        vKAvatarView.load(ImageList.Eb(i, (vKAvatarView3 != null ? vKAvatarView3 : null).getLayoutParams().height, C8.b));
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        int i2 = bubbleColors.i;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i2);
        TextView textView2 = this.e;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(bubbleColors.g);
        AppCompatImageView appCompatImageView = this.g;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        bwt0.o0(appCompatImageView, i);
        AppCompatImageView appCompatImageView2 = this.h;
        if (appCompatImageView2 == null) {
            appCompatImageView2 = null;
        }
        bwt0.o0(appCompatImageView2, i);
        TextView textView3 = this.i;
        (textView3 != null ? textView3 : null).setTextColor(i2);
    }

    @Override // xsna.hr30
    public final void p(jq30 jq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        jq30 jq30Var2 = jq30Var;
        this.j = pk30Var;
        this.k = jq30Var2;
        VKAvatarView vKAvatarView = this.f;
        VKAvatarView vKAvatarView2 = vKAvatarView == null ? null : vKAvatarView;
        ImageList imageList = jq30Var2.e;
        if (vKAvatarView == null) {
            vKAvatarView = null;
        }
        int i = vKAvatarView.getLayoutParams().width;
        VKAvatarView vKAvatarView3 = this.f;
        if (vKAvatarView3 == null) {
            vKAvatarView3 = null;
        }
        vKAvatarView2.load(ImageList.Eb(i, vKAvatarView3.getLayoutParams().height, imageList.b));
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(jq30Var2.d);
        AppCompatImageView appCompatImageView = this.g;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setVisibility(jq30Var2.f ? 0 : 8);
        TextView textView2 = this.i;
        (textView2 != null ? textView2 : null).setVisibility(jq30Var2.g ? 0 : 8);
        rxd0 rxd0Var = jq30Var2.i;
        if (rxd0Var != null) {
            rxd0Var.c(this);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.l.c(layoutInflater, viewGroup);
        this.d = (TextView) c.findViewById(R.id.fwd_channel_msg_from_channel_label);
        this.e = (TextView) c.findViewById(R.id.fwd_channel_message_channel_name);
        VKAvatarView vKAvatarView = (VKAvatarView) c.findViewById(R.id.fwd_channel_msg_avatar);
        this.f = vKAvatarView;
        VKAvatarView.c1(vKAvatarView, AvatarBorderType.SQUARE, null, 6);
        this.g = (AppCompatImageView) c.findViewById(R.id.fwd_channel_message_verified_icon);
        this.h = (AppCompatImageView) c.findViewById(R.id.fwd_channel_message_forward_icon);
        TextView textView = (TextView) c.findViewById(R.id.donut_text);
        this.i = textView;
        his0.v(textView, R.drawable.vk_icon_donut_color_12, 0);
        jjc.g(c, new a());
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        rxd0 rxd0Var;
        jq30 jq30Var = this.k;
        if (jq30Var != null && (rxd0Var = jq30Var.i) != null) {
            rxd0Var.b(this);
        }
        this.j = null;
        this.k = null;
    }
}
