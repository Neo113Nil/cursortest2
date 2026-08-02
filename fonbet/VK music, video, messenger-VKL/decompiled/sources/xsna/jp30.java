package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MsgPartCompactPlaylistHolder.kt */
/* loaded from: classes2.dex */
public final class jp30 extends hr30<AttachPlaylist, ts30> implements hux0 {
    public ts30 d;
    public v5t e;
    public TextView f;
    public TextView g;
    public ThumbsImageView h;
    public pk30 i;
    public TimeAndStatusView j;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            jp30 jp30Var = jp30.this;
            pk30 pk30Var = jp30Var.i;
            ts30 ts30Var = jp30Var.d;
            Msg msg = ts30Var != null ? ts30Var.D : null;
            Attach attach = ts30Var != null ? ts30Var.F : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, ts30Var != null ? ts30Var.E : null);
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
            jp30 jp30Var = jp30.this;
            pk30 pk30Var = jp30Var.i;
            ts30 ts30Var = jp30Var.d;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = ts30Var != null ? ts30Var.D : null;
            Attach attach = ts30Var != null ? ts30Var.F : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, ts30Var != null ? ts30Var.E : null);
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
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(bubbleColors.i);
        TimeAndStatusView timeAndStatusView = this.j;
        (timeAndStatusView != null ? timeAndStatusView : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(ts30 ts30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ts30 ts30Var2 = ts30Var;
        this.d = ts30Var2;
        this.i = pk30Var;
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(ts30Var2.m);
        ThumbsImageView thumbsImageView = this.h;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setThumbs(ts30Var2.d);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(ts30Var2.n);
        jr30 jr30Var = ts30Var2.b;
        TimeAndStatusView timeAndStatusView = this.j;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = new v5t(R.layout.vkim_msg_part_compact_playlist);
        v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        (view2 != null ? view2 : null).setOnLongClickListener(new b());
        this.e = v5tVar;
        this.f = (TextView) s().findViewById(R.id.title);
        this.g = (TextView) s().findViewById(R.id.description);
        this.h = (ThumbsImageView) s().findViewById(R.id.playlist_image);
        this.j = (TimeAndStatusView) s().findViewById(R.id.time_and_status);
        return s();
    }

    @Override // xsna.hr30
    public final void r() {
        this.i = null;
    }

    public final View s() {
        v5t v5tVar = this.e;
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
