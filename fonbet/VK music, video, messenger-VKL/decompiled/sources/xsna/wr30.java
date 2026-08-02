package xsna;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MsgPartMarketLargeHolder.kt */
/* loaded from: classes2.dex */
public final class wr30 extends hr30<AttachMarket, xr30> implements f530 {
    public static final int q = cn70.b(80);
    public TimeAndStatusView d;
    public ViewGroup e;
    public VKImageView f;
    public AppCompatTextView g;
    public AppCompatTextView h;
    public AppCompatTextView i;
    public AppCompatTextView j;
    public String k;
    public p530 l;
    public xr30 m;
    public pk30 n;
    public final v5t o = new v5t(R.layout.vkim_msg_part_market_large);
    public final Object p = new Object();

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            wr30 wr30Var = wr30.this;
            pk30 pk30Var = wr30Var.n;
            xr30 xr30Var = wr30Var.m;
            Msg msg = xr30Var != null ? xr30Var.n : null;
            Attach attach = xr30Var != null ? xr30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, xr30Var != null ? xr30Var.o : null);
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
            wr30 wr30Var = wr30.this;
            pk30 pk30Var = wr30Var.n;
            xr30 xr30Var = wr30Var.m;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = xr30Var != null ? xr30Var.n : null;
            Attach attach = xr30Var != null ? xr30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, xr30Var != null ? xr30Var.o : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        p530 p530Var = this.l;
        if (p530Var == null) {
            return null;
        }
        return p530Var;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        AppCompatTextView appCompatTextView = this.g;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setTextColor(bubbleColors.d);
        AppCompatTextView appCompatTextView2 = this.h;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        appCompatTextView2.setTextColor(bubbleColors.g);
        AppCompatTextView appCompatTextView3 = this.i;
        if (appCompatTextView3 == null) {
            appCompatTextView3 = null;
        }
        appCompatTextView3.setTextColor(bubbleColors.i);
        AppCompatTextView appCompatTextView4 = this.j;
        if (appCompatTextView4 == null) {
            appCompatTextView4 = null;
        }
        appCompatTextView4.setTextColor(i);
        Drawable background = appCompatTextView4.getBackground();
        if (background != null) {
            sjo.a(background, i, e3m.d(R.attr.im_msg_part_button_outline_stroke_width, appCompatTextView4.getContext()));
        }
        TimeAndStatusView timeAndStatusView = this.d;
        (timeAndStatusView != null ? timeAndStatusView : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        CharSequence charSequence;
        ImageList imageList;
        Image Gb;
        xr30 xr30Var = this.m;
        String str = xr30Var != null ? xr30Var.g : null;
        VKImageView vKImageView = this.f;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.load((xr30Var == null || (imageList = xr30Var.f) == null || (Gb = imageList.Gb(q)) == null) ? null : Gb.d);
        if (str == null || drm0.N(str)) {
            charSequence = this.k;
            if (charSequence == null) {
                charSequence = null;
            }
        } else {
            ucp ucpVar = ucp.a;
            charSequence = ucp.i(str);
        }
        AppCompatTextView appCompatTextView = this.g;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setText(charSequence);
        AppCompatTextView appCompatTextView2 = this.h;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        xr30 xr30Var2 = this.m;
        String str2 = xr30Var2 != null ? xr30Var2.h : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            appCompatTextView2.setText(str2);
        } else {
            appCompatTextView2.setText((CharSequence) null);
        }
        AppCompatTextView appCompatTextView3 = this.i;
        if (appCompatTextView3 == null) {
            appCompatTextView3 = null;
        }
        xr30 xr30Var3 = this.m;
        String str3 = xr30Var3 != null ? xr30Var3.i : null;
        String str4 = str3 != null ? str3 : "";
        if (str4.length() > 0) {
            appCompatTextView3.setText(str4);
        } else {
            appCompatTextView3.setText((CharSequence) null);
        }
        AppCompatTextView appCompatTextView4 = this.g;
        if (appCompatTextView4 == null) {
            appCompatTextView4 = null;
        }
        xr30 xr30Var4 = this.m;
        Integer num2 = xr30Var4 != null ? xr30Var4.j : null;
        Integer num3 = xr30Var4 != null ? xr30Var4.k : null;
        appCompatTextView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (num3 == null || num2 == null) ? null : dhr0.t.b(num2.intValue(), num3.intValue()), (Drawable) null);
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            viewGroup = null;
        }
        jjc.g(viewGroup, new a());
        ViewGroup viewGroup2 = this.e;
        (viewGroup2 != null ? viewGroup2 : null).setOnLongClickListener(new b());
    }

    @Override // xsna.hr30
    public final void p(xr30 xr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        xr30 xr30Var2 = xr30Var;
        this.m = xr30Var2;
        this.n = pk30Var;
        w530 w530Var = xr30Var2.c;
        Object obj = this.p;
        if (w530Var != null) {
            w530Var.e(obj);
        }
        if (w530Var != null) {
            w530Var.c(obj, new kly(this));
        }
        xr30 xr30Var3 = this.m;
        if (xr30Var3 != null) {
            w530 w530Var2 = xr30Var3.c;
            if (w530Var2 != null) {
                w530Var2.d(xr30Var3.e, this, new leq(17));
            } else {
                o1(null);
            }
        }
        Attach attach = xr30Var2.p;
        AttachMarket attachMarket = attach instanceof AttachMarket ? (AttachMarket) attach : null;
        if (attachMarket != null) {
            l24.a(attachMarket);
        }
        jr30 jr30Var = xr30Var2.b;
        TimeAndStatusView timeAndStatusView = this.d;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Resources resources = viewGroup.getContext().getResources();
        ViewGroup viewGroup2 = (ViewGroup) this.o.c(layoutInflater, viewGroup);
        this.e = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.d = (TimeAndStatusView) viewGroup2.findViewById(R.id.timeAndStatus);
        ViewGroup viewGroup3 = this.e;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.f = (VKImageView) viewGroup3.findViewById(R.id.iconView);
        ViewGroup viewGroup4 = this.e;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.g = (AppCompatTextView) viewGroup4.findViewById(R.id.title);
        ViewGroup viewGroup5 = this.e;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.h = (AppCompatTextView) viewGroup5.findViewById(R.id.price);
        ViewGroup viewGroup6 = this.e;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewGroup6.findViewById(R.id.old_price);
        this.i = appCompatTextView;
        appCompatTextView.setPaintFlags(17);
        ViewGroup viewGroup7 = this.e;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.j = (AppCompatTextView) viewGroup7.findViewById(R.id.button);
        this.k = resources.getString(R.string.vkim_msg_list_market_desc);
        ViewGroup viewGroup8 = this.e;
        ViewGroup viewGroup9 = viewGroup8 == null ? null : viewGroup8;
        VKImageView vKImageView = this.f;
        if (vKImageView == null) {
            vKImageView = null;
        }
        AppCompatTextView appCompatTextView2 = this.g;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        AppCompatTextView appCompatTextView3 = this.h;
        if (appCompatTextView3 == null) {
            appCompatTextView3 = null;
        }
        AppCompatTextView appCompatTextView4 = this.i;
        if (appCompatTextView4 == null) {
            appCompatTextView4 = null;
        }
        this.l = new p530(viewGroup9, vKImageView, appCompatTextView2, appCompatTextView3, appCompatTextView4, 32);
        if (viewGroup8 == null) {
            return null;
        }
        return viewGroup8;
    }

    @Override // xsna.hr30
    public final void r() {
        w530 w530Var;
        xr30 xr30Var = this.m;
        if (xr30Var != null && (w530Var = xr30Var.c) != null) {
            w530Var.e(this.p);
        }
        this.n = null;
        this.m = null;
    }
}
