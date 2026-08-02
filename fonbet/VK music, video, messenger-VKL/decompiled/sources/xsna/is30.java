package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.utils.a;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.ug30;

/* compiled from: MsgPartMsgTranscriptionRateHolder.kt */
/* loaded from: classes2.dex */
public final class is30 extends hr30<AttachWithTranscription, js30> {
    public TextView d;
    public TextView e;
    public View f;
    public TextView g;
    public View h;
    public TextView i;
    public Context j;
    public pk30 k;
    public js30 l;
    public final v5t m = new v5t(R.layout.vkim_msg_part_audio_transcript_rate);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int color;
        int i = bubbleColors.g;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.i);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(i);
        TextView textView3 = this.i;
        if (textView3 == null) {
            textView3 = null;
        }
        ((Drawable) rl3.L(textView3.getCompoundDrawablesRelative())).setTint(i);
        if (n8g.f(i) < 0.5d) {
            Context context = this.j;
            if (context == null) {
                context = null;
            }
            color = context.getColor(R.color.vk_gray_A40);
        } else {
            Context context2 = this.j;
            if (context2 == null) {
                context2 = null;
            }
            color = context2.getColor(R.color.vk_white_alpha12);
        }
        ColorStateList valueOf = ColorStateList.valueOf(color);
        TextView textView4 = this.e;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setBackgroundTintList(valueOf);
        TextView textView5 = this.g;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setBackgroundTintList(valueOf);
        View view = this.h;
        (view != null ? view : null).setBackgroundTintList(valueOf);
    }

    @Override // xsna.hr30
    public final void p(js30 js30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        js30 js30Var2 = js30Var;
        this.k = pk30Var;
        this.l = js30Var2;
        if (!js30Var2.j) {
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            Context context = this.j;
            if (context == null) {
                context = null;
            }
            textView.setText(context.getText(R.string.vkim_audiomsg_transcript_rate_title));
            View view = this.f;
            if (view == null) {
                view = null;
            }
            bwt0.p0(view, true);
            View view2 = this.h;
            bwt0.p0(view2 != null ? view2 : null, false);
            return;
        }
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        Context context2 = this.j;
        if (context2 == null) {
            context2 = null;
        }
        textView2.setText(context2.getText(R.string.vkim_audiomsg_transcript_rate_sent));
        Msg msg = js30Var2.m;
        List singletonList = msg != null ? Collections.singletonList(msg) : null;
        if (singletonList == null) {
            singletonList = EmptyList.b;
        }
        if (js30Var2.l && js30Var2.k) {
            List<Peer.Type> list = com.vk.im.engine.utils.a.b;
            if (com.vk.im.engine.utils.a.g(new a.C1128a(ug30.l.a, new Dialog(), singletonList, js30Var2.i, js30Var2.d, js30Var2.e, js30Var2.f, js30Var2.g.b, js30Var2.h))) {
                View view3 = this.f;
                d3m.e(view3 == null ? null : view3, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                View view4 = this.h;
                d3m.c(view4 == null ? null : view4, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        View view5 = this.f;
        if (view5 == null) {
            view5 = null;
        }
        bwt0.p0(view5, false);
        View view6 = this.h;
        bwt0.p0(view6 != null ? view6 : null, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.m.c(layoutInflater, viewGroup);
        this.j = layoutInflater.getContext();
        this.d = (TextView) c.findViewById(R.id.rate_title);
        this.f = c.findViewById(R.id.rate_group);
        TextView textView = (TextView) c.findViewById(R.id.rate_like);
        ucp ucpVar = ucp.a;
        textView.setText(ucp.i("👍"));
        bwt0.i0(textView, new d410(this, 6));
        this.e = textView;
        TextView textView2 = (TextView) c.findViewById(R.id.rate_dislike);
        textView2.setText(ucp.i("👎"));
        bwt0.i0(textView2, new w620(this, 2));
        this.g = textView2;
        this.h = c.findViewById(R.id.edit_transcript_btn);
        Context context = c.getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_pen_outline_24, context);
        View view = this.h;
        if (view == null) {
            view = null;
        }
        TextView textView3 = (TextView) view.findViewById(R.id.edit_transcript_text);
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
        this.i = textView3;
        View view2 = this.h;
        bwt0.i0(view2 != null ? view2 : null, new bgy(this, 10));
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        View view = this.f;
        if (view == null) {
            view = null;
        }
        view.clearAnimation();
        View view2 = this.h;
        if (view2 == null) {
            view2 = null;
        }
        view2.clearAnimation();
        this.k = null;
        this.l = null;
    }
}
