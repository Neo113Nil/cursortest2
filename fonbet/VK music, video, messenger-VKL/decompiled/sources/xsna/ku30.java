package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.span.SpanPressableTextView;
import com.vkontakte.android.R;

/* compiled from: MsgPartVmojiCharactHolder.kt */
/* loaded from: classes2.dex */
public final class ku30 extends hr30<AttachLink, lu30> {
    public static final /* synthetic */ int n = 0;
    public Context d;
    public FrescoImageView e;
    public TextView f;
    public SpanPressableTextView g;
    public Button h;
    public TimeAndStatusView i;
    public int j;
    public pk30 k;
    public lu30 l;
    public final v5t m = new v5t(R.layout.vkim_msg_part_vmoji_character_link);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            ku30 ku30Var = ku30.this;
            pk30 pk30Var = ku30Var.k;
            lu30 lu30Var = ku30Var.l;
            Msg msg = lu30Var != null ? lu30Var.j : null;
            Attach attach = lu30Var != null ? lu30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, lu30Var != null ? lu30Var.k : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            ku30 ku30Var = ku30.this;
            pk30 pk30Var = ku30Var.k;
            lu30 lu30Var = ku30Var.l;
            Msg msg = lu30Var != null ? lu30Var.j : null;
            Attach attach = lu30Var != null ? lu30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, lu30Var != null ? lu30Var.k : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ku30 ku30Var = ku30.this;
            pk30 pk30Var = ku30Var.k;
            lu30 lu30Var = ku30Var.l;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = lu30Var != null ? lu30Var.j : null;
            Attach attach = lu30Var != null ? lu30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, lu30Var != null ? lu30Var.k : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class d implements View.OnLongClickListener {
        public d() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ku30 ku30Var = ku30.this;
            pk30 pk30Var = ku30Var.k;
            lu30 lu30Var = ku30Var.l;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = lu30Var != null ? lu30Var.j : null;
            Attach attach = lu30Var != null ? lu30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, lu30Var != null ? lu30Var.k : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        SpanPressableTextView spanPressableTextView = this.g;
        if (spanPressableTextView == null) {
            spanPressableTextView = null;
        }
        spanPressableTextView.setTextColor(bubbleColors.i);
        TimeAndStatusView timeAndStatusView = this.i;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
        Button button = this.h;
        if (button == null) {
            button = null;
        }
        button.setTextColor(i);
        Button button2 = this.h;
        Drawable background = (button2 != null ? button2 : null).getBackground();
        if (background != null) {
            background.setTint(i);
        }
    }

    @Override // xsna.hr30
    public final void p(lu30 lu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        lu30 lu30Var2 = lu30Var;
        String str = lu30Var2.f;
        this.k = pk30Var;
        this.l = lu30Var2;
        FrescoImageView frescoImageView = this.e;
        if (frescoImageView == null) {
            frescoImageView = null;
        }
        frescoImageView.setIgnoreTrafficSaverPredicate(new i21(19));
        FrescoImageView frescoImageView2 = this.e;
        if (frescoImageView2 == null) {
            frescoImageView2 = null;
        }
        frescoImageView2.setRemoteImage(lu30Var2.d);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(lu30Var2.e);
        SpanPressableTextView spanPressableTextView = this.g;
        if (spanPressableTextView == null) {
            spanPressableTextView = null;
        }
        bwt0.p0(spanPressableTextView, str.length() > 0);
        SpanPressableTextView spanPressableTextView2 = this.g;
        if (spanPressableTextView2 == null) {
            spanPressableTextView2 = null;
        }
        spanPressableTextView2.setText(str);
        SpanPressableTextView spanPressableTextView3 = this.g;
        if (spanPressableTextView3 == null) {
            spanPressableTextView3 = null;
        }
        spanPressableTextView3.setOnSpanClickListener(ub80Var);
        Integer num = lu30Var2.g;
        if (num != null) {
            int intValue = num.intValue();
            wng0 wng0Var = new wng0();
            wng0.e(this.j, wng0Var);
            wng0Var.b(intValue);
            FrescoImageView frescoImageView3 = this.e;
            if (frescoImageView3 == null) {
                frescoImageView3 = null;
            }
            frescoImageView3.setBgFillDrawable(wng0Var);
        }
        jr30 jr30Var = lu30Var2.b;
        TimeAndStatusView timeAndStatusView = this.i;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        View c2 = this.m.c(layoutInflater, viewGroup);
        this.e = (FrescoImageView) c2.findViewById(R.id.image);
        this.f = (TextView) c2.findViewById(R.id.title);
        this.g = (SpanPressableTextView) c2.findViewById(R.id.caption);
        this.h = (Button) c2.findViewById(R.id.button);
        this.i = (TimeAndStatusView) c2.findViewById(R.id.timeAndStatus);
        int d2 = e3m.d(R.attr.im_msg_part_corner_radius_big, layoutInflater.getContext());
        this.j = d2;
        FrescoImageView frescoImageView = this.e;
        if (frescoImageView == null) {
            frescoImageView = null;
        }
        frescoImageView.setCornerRadius(d2);
        FrescoImageView frescoImageView2 = this.e;
        if (frescoImageView2 == null) {
            frescoImageView2 = null;
        }
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        frescoImageView2.setPlaceholder(new ek30(context, this.j));
        FrescoImageView frescoImageView3 = this.e;
        if (frescoImageView3 == null) {
            frescoImageView3 = null;
        }
        jjc.g(frescoImageView3, new a());
        FrescoImageView frescoImageView4 = this.e;
        if (frescoImageView4 == null) {
            frescoImageView4 = null;
        }
        frescoImageView4.setOnLongClickListener(new c());
        Button button = this.h;
        if (button == null) {
            button = null;
        }
        jjc.g(button, new b());
        Button button2 = this.h;
        (button2 != null ? button2 : null).setOnLongClickListener(new d());
        return c2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.k = null;
        this.l = null;
    }
}
