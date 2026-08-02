package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.music.Thumb;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MsgPartCompactArtistHolder.kt */
/* loaded from: classes2.dex */
public final class dp30 extends hr30<AttachArtist, xn30> implements hux0 {
    public xn30 d;
    public pk30 e;
    public v5t f;
    public TextView g;
    public TextView h;
    public ThumbsImageView i;
    public TimeAndStatusView j;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            dp30 dp30Var = dp30.this;
            pk30 pk30Var = dp30Var.e;
            xn30 xn30Var = dp30Var.d;
            Msg msg = xn30Var != null ? xn30Var.v : null;
            Attach attach = xn30Var != null ? xn30Var.x : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, xn30Var != null ? xn30Var.w : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            dp30 dp30Var = dp30.this;
            pk30 pk30Var = dp30Var.e;
            xn30 xn30Var = dp30Var.d;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = xn30Var != null ? xn30Var.v : null;
            Attach attach = xn30Var != null ? xn30Var.x : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, xn30Var != null ? xn30Var.w : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hux0
    public final TimeAndStatusView getTimeAndStatusView() {
        TimeAndStatusView timeAndStatusView = this.j;
        if (timeAndStatusView != null) {
            return timeAndStatusView;
        }
        return null;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        TextView textView2 = this.h;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(bubbleColors.i);
        TimeAndStatusView timeAndStatusView = this.j;
        (timeAndStatusView != null ? timeAndStatusView : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(xn30 xn30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        xn30 xn30Var2 = xn30Var;
        this.d = xn30Var2;
        this.e = pk30Var;
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setText(xn30Var2.c);
        ThumbsImageView thumbsImageView = this.i;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setThumb(new Thumb(xn30Var2.h.Kb()));
        TextView textView2 = this.h;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(xn30Var2.e);
        jr30 jr30Var = xn30Var2.b;
        TimeAndStatusView timeAndStatusView = this.j;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = new v5t(R.layout.vkim_msg_part_compact_artist);
        v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        (view2 != null ? view2 : null).setOnLongClickListener(new b());
        this.f = v5tVar;
        this.g = (TextView) s().findViewById(R.id.title);
        this.h = (TextView) s().findViewById(R.id.description);
        this.i = (ThumbsImageView) s().findViewById(R.id.artist_image);
        this.j = (TimeAndStatusView) s().findViewById(R.id.time_and_status);
        return s();
    }

    public final View s() {
        v5t v5tVar = this.f;
        if (v5tVar == null) {
            v5tVar = null;
        }
        View view = (View) v5tVar.c;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // xsna.hux0
    public final void X3() {
    }
}
