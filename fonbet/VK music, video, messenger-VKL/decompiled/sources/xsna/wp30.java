package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vkontakte.android.R;

/* compiled from: MsgPartDonutLinkHolder.kt */
/* loaded from: classes2.dex */
public final class wp30 extends hr30<AttachDonutLink, xp30> {
    public yp30 d;
    public Context e;
    public final StringBuilder f = new StringBuilder();
    public final int g = 102;
    public xp30 h;
    public pk30 i;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            wp30 wp30Var = wp30.this;
            pk30 pk30Var = wp30Var.i;
            xp30 xp30Var = wp30Var.h;
            Msg msg = xp30Var != null ? xp30Var.n : null;
            Attach attach = xp30Var != null ? xp30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, xp30Var != null ? xp30Var.o : null);
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
            wp30 wp30Var = wp30.this;
            pk30 pk30Var = wp30Var.i;
            xp30 xp30Var = wp30Var.h;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = xp30Var != null ? xp30Var.n : null;
            Attach attach = xp30Var != null ? xp30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, xp30Var != null ? xp30Var.o : null);
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
        yp30 yp30Var = this.d;
        if (yp30Var == null) {
            yp30Var = null;
        }
        yp30Var.setTitleTextColor(bubbleColors.d);
        yp30 yp30Var2 = this.d;
        if (yp30Var2 == null) {
            yp30Var2 = null;
        }
        yp30Var2.setButtonTextColor(bubbleColors.c);
        int l = n8g.l(bubbleColors.g, this.g);
        yp30 yp30Var3 = this.d;
        if (yp30Var3 == null) {
            yp30Var3 = null;
        }
        yp30Var3.setSubtitleTextColor(l);
        yp30 yp30Var4 = this.d;
        if (yp30Var4 == null) {
            yp30Var4 = null;
        }
        yp30Var4.setDetailsTextColor(l);
        yp30 yp30Var5 = this.d;
        (yp30Var5 != null ? yp30Var5 : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(xp30 xp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        xp30 xp30Var2 = xp30Var;
        this.i = pk30Var;
        this.h = xp30Var2;
        yp30 yp30Var = this.d;
        if (yp30Var == null) {
            yp30Var = null;
        }
        yp30Var.setImage(xp30Var2.d);
        yp30 yp30Var2 = this.d;
        if (yp30Var2 == null) {
            yp30Var2 = null;
        }
        yp30Var2.setTitleText(xp30Var2.e);
        yp30 yp30Var3 = this.d;
        if (yp30Var3 == null) {
            yp30Var3 = null;
        }
        yp30Var3.setVerified(xp30Var2.g);
        yp30 yp30Var4 = this.d;
        if (yp30Var4 == null) {
            yp30Var4 = null;
        }
        yp30Var4.setSubtitleText(xp30Var2.f);
        int i = xp30Var2.j;
        int i2 = xp30Var2.k;
        StringBuilder sb = this.f;
        sb.setLength(0);
        if (i > 0) {
            Context context = this.e;
            if (context == null) {
                context = null;
            }
            sb.append(context.getResources().getQuantityString(R.plurals.vkim_donut_snippet_donors, i, uqm0.f(i)));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            Context context2 = this.e;
            if (context2 == null) {
                context2 = null;
            }
            sb.append(context2.getResources().getQuantityString(R.plurals.vkim_donut_snippet_friends, i2, uqm0.f(i2)));
        }
        yp30 yp30Var5 = this.d;
        if (yp30Var5 == null) {
            yp30Var5 = null;
        }
        yp30Var5.setDetailsText(sb);
        yp30 yp30Var6 = this.d;
        if (yp30Var6 == null) {
            yp30Var6 = null;
        }
        yp30Var6.setPhotos(xp30Var2.i);
        yp30 yp30Var7 = this.d;
        if (yp30Var7 == null) {
            yp30Var7 = null;
        }
        yp30Var7.setButtonText(xp30Var2.h);
        jr30 jr30Var = xp30Var2.b;
        yp30 yp30Var8 = this.d;
        hr30.m(jr30Var, yp30Var8 != null ? yp30Var8 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = viewGroup.getContext();
        Context context = this.e;
        if (context == null) {
            context = null;
        }
        yp30 yp30Var = new yp30(context);
        this.d = yp30Var;
        yp30Var.setPaddingRelative(cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(1));
        yp30 yp30Var2 = this.d;
        if (yp30Var2 == null) {
            yp30Var2 = null;
        }
        yp30Var2.setBackgroundResource(R.drawable.highlight_radius_16);
        yp30 yp30Var3 = this.d;
        if (yp30Var3 == null) {
            yp30Var3 = null;
        }
        yp30Var3.setIconImageResource(R.drawable.vk_icon_donut_color_16);
        yp30 yp30Var4 = this.d;
        if (yp30Var4 == null) {
            yp30Var4 = null;
        }
        yp30Var4.setPhotosGap(1.0f);
        yp30 yp30Var5 = this.d;
        if (yp30Var5 == null) {
            yp30Var5 = null;
        }
        yp30Var5.setPhotosOverlapOffset(0.6875f);
        yp30 yp30Var6 = this.d;
        if (yp30Var6 == null) {
            yp30Var6 = null;
        }
        yp30Var6.setButtonForegroundResource(R.drawable.highlight_radius_8);
        yp30 yp30Var7 = this.d;
        if (yp30Var7 == null) {
            yp30Var7 = null;
        }
        jjc.g(yp30Var7, new a());
        yp30 yp30Var8 = this.d;
        if (yp30Var8 == null) {
            yp30Var8 = null;
        }
        yp30Var8.setOnLongClickListener(new b());
        yp30 yp30Var9 = this.d;
        if (yp30Var9 == null) {
            yp30Var9 = null;
        }
        yp30Var9.setButtonClickListener(new jsk(this, 4));
        yp30 yp30Var10 = this.d;
        if (yp30Var10 == null) {
            return null;
        }
        return yp30Var10;
    }

    @Override // xsna.hr30
    public final void r() {
        this.i = null;
        this.h = null;
    }
}
