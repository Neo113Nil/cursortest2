package xsna;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.components.button.VkButton;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.kq30;

/* compiled from: MsgPartFwdChannelMsgUnavailableHolder.kt */
/* loaded from: classes2.dex */
public final class mq30 extends hr30<AttachChannelMessage, kq30> {
    public AppCompatImageView d;
    public TextView e;
    public TextView f;
    public VkButton g;
    public pk30 h;
    public kq30 i;
    public final v5t j = new v5t(R.layout.vkim_msg_part_fwd_channel_msg_unavailable);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.i;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(i);
        kq30 kq30Var = this.i;
        if ((kq30Var != null ? kq30Var.b : null) instanceof kq30.a.C3197a) {
            AppCompatImageView appCompatImageView = this.d;
            (appCompatImageView != null ? appCompatImageView : null).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // xsna.hr30
    public final void p(kq30 kq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        kq30 kq30Var2 = kq30Var;
        this.h = pk30Var;
        this.i = kq30Var2;
        kq30.a aVar = kq30Var2.b;
        if (epx.f(aVar, kq30.a.b.a)) {
            AppCompatImageView appCompatImageView = this.d;
            if (appCompatImageView == null) {
                appCompatImageView = null;
            }
            appCompatImageView.setImageTintList(null);
            AppCompatImageView appCompatImageView2 = this.d;
            if (appCompatImageView2 == null) {
                appCompatImageView2 = null;
            }
            appCompatImageView2.setImageResource(R.drawable.vk_icon_avatar_placeholder_sad_persik_alt_150);
            TextView textView = this.e;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView2 = this.f;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(R.string.vkim_fwd_channel_message_deleted);
            TextView textView3 = this.f;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f;
            if (textView4 == null) {
                textView4 = null;
            }
            f4m.t(iah0.a(12), textView4);
            VkButton vkButton = this.g;
            (vkButton != null ? vkButton : null).setVisibility(8);
            return;
        }
        if (!(aVar instanceof kq30.a.C3197a)) {
            throw new NoWhenBranchMatchedException();
        }
        AppCompatImageView appCompatImageView3 = this.d;
        if (appCompatImageView3 == null) {
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageResource(R.drawable.vk_icon_donut_outline_56);
        TextView textView5 = this.e;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setVisibility(8);
        TextView textView6 = this.f;
        if (textView6 == null) {
            textView6 = null;
        }
        textView6.setText(R.string.vkim_fwd_channel_message_donut_restriction_text);
        TextView textView7 = this.f;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setVisibility(0);
        TextView textView8 = this.f;
        if (textView8 == null) {
            textView8 = null;
        }
        f4m.t(iah0.a(12), textView8);
        VkButton vkButton2 = this.g;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.setText(R.string.vkim_fwd_channel_message_donut_action);
        VkButton vkButton3 = this.g;
        (vkButton3 != null ? vkButton3 : null).setVisibility(0);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.j.c(layoutInflater, viewGroup);
        this.d = (AppCompatImageView) c.findViewById(R.id.channel_msg_fwd_unavailable_illustration);
        this.e = (TextView) c.findViewById(R.id.channel_msg_fwd_unavailable_title);
        this.f = (TextView) c.findViewById(R.id.channel_msg_fwd_unavailable_subtitle);
        VkButton vkButton = (VkButton) c.findViewById(R.id.channel_msg_fwd_unavailable_button);
        this.g = vkButton;
        bwt0.i0(vkButton, new qi00(this, 7));
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        this.h = null;
        this.i = null;
    }
}
