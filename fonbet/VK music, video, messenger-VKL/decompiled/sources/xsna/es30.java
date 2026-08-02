package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.TintTextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniAppButton;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartMiniAppHolder.kt */
/* loaded from: classes2.dex */
public final class es30 extends hr30<AttachMiniApp, fs30> {
    public static final int m = iah0.a(80);
    public static final int n = iah0.a(10);
    public static final int o;
    public static final int p;
    public FrescoImageView d;
    public TextView e;
    public TextView f;
    public TintTextView g;
    public TimeAndStatusView h;
    public View i;
    public final v5t j = new v5t(R.layout.vkim_msg_part_mini_app);
    public pk30 k;
    public fs30 l;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            es30 es30Var = es30.this;
            pk30 pk30Var = es30Var.k;
            fs30 fs30Var = es30Var.l;
            Msg msg = fs30Var != null ? fs30Var.l : null;
            Attach attach = fs30Var != null ? fs30Var.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, fs30Var != null ? fs30Var.m : null);
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
            es30 es30Var = es30.this;
            pk30 pk30Var = es30Var.k;
            fs30 fs30Var = es30Var.l;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = fs30Var != null ? fs30Var.l : null;
            Attach attach = fs30Var != null ? fs30Var.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, fs30Var != null ? fs30Var.m : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements izs<View, s3q0> {
        public c() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            es30 es30Var = es30.this;
            pk30 pk30Var = es30Var.k;
            fs30 fs30Var = es30Var.l;
            Msg msg = fs30Var != null ? fs30Var.l : null;
            Attach attach = fs30Var != null ? fs30Var.n : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, fs30Var != null ? fs30Var.m : null);
            }
            return s3q0.a;
        }
    }

    static {
        float f = 2;
        o = iah0.a(f);
        p = iah0.a(f);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(bubbleColors.f);
        fs30 fs30Var = this.l;
        if (fs30Var == null || !fs30Var.i) {
            TimeAndStatusView timeAndStatusView = this.h;
            if (timeAndStatusView == null) {
                timeAndStatusView = null;
            }
            timeAndStatusView.setTimeTextColor(bubbleColors.h);
        } else {
            TimeAndStatusView timeAndStatusView2 = this.h;
            if (timeAndStatusView2 == null) {
                timeAndStatusView2 = null;
            }
            timeAndStatusView2.setTimeTextColor(bubbleColors.m);
        }
        TintTextView tintTextView = this.g;
        TintTextView tintTextView2 = tintTextView != null ? tintTextView : null;
        tintTextView2.setTextColor(i);
        tintTextView2.setDrawableTint(i);
        tintTextView2.setBackgroundTint(i);
    }

    @Override // xsna.hr30
    public final void p(fs30 fs30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        fs30 fs30Var2 = fs30Var;
        String str = fs30Var2.f;
        this.k = pk30Var;
        this.l = fs30Var2;
        Image Gb = fs30Var2.h.Gb(m);
        if (Gb != null) {
            FrescoImageView frescoImageView = this.d;
            if (frescoImageView == null) {
                frescoImageView = null;
            }
            frescoImageView.setRemoteImage(Gb);
        } else {
            FrescoImageView frescoImageView2 = this.d;
            if (frescoImageView2 == null) {
                frescoImageView2 = null;
            }
            frescoImageView2.n(null, null);
        }
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(fs30Var2.d);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(fs30Var2.e);
        TintTextView tintTextView = this.g;
        if (tintTextView == null) {
            tintTextView = null;
        }
        tintTextView.setText(str);
        TintTextView tintTextView2 = this.g;
        if (tintTextView2 == null) {
            tintTextView2 = null;
        }
        bwt0.p0(tintTextView2, !drm0.N(str));
        TintTextView tintTextView3 = this.g;
        if (tintTextView3 == null) {
            tintTextView3 = null;
        }
        his0.v(tintTextView3, fs30Var2.g == AttachMiniAppButton.State.GAME ? R.drawable.vk_icon_game_16 : R.drawable.vk_icon_services_16, 0);
        jr30 jr30Var = fs30Var2.b;
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
        View view = this.i;
        bwt0.T(view != null ? view : null, new cww(this, 14));
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.j;
        View c2 = v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new b());
        this.d = (FrescoImageView) c2.findViewById(R.id.mini_app_image);
        this.e = (TextView) c2.findViewById(R.id.mini_app_title);
        this.f = (TextView) c2.findViewById(R.id.mini_app_description);
        this.g = (TintTextView) c2.findViewById(R.id.mini_app_btn);
        this.h = (TimeAndStatusView) c2.findViewById(R.id.timeAndStatus);
        this.i = c2.findViewById(R.id.mini_app_container);
        TintTextView tintTextView = this.g;
        if (tintTextView == null) {
            tintTextView = null;
        }
        jjc.g(tintTextView, new c());
        FrescoImageView frescoImageView = this.d;
        if (frescoImageView == null) {
            frescoImageView = null;
        }
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        FrescoImageView frescoImageView2 = this.d;
        (frescoImageView2 != null ? frescoImageView2 : null).setCornerRadius(n);
        return c2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.k = null;
        this.l = null;
    }
}
