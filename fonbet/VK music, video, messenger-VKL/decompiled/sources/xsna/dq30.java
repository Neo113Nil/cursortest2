package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* compiled from: MsgPartExternalMarketHolder.kt */
/* loaded from: classes2.dex */
public final class dq30 extends hr30<AttachLink, eq30> {
    public static final int p = cn70.b(80);
    public static final SpannableStringBuilder q = new SpannableStringBuilder().append((CharSequence) rik0.b(4.0f)).append((CharSequence) "·").append((CharSequence) rik0.b(4.0f));
    public final DecimalFormat d;
    public TimeAndStatusView e;
    public ViewGroup f;
    public VKImageView g;
    public AppCompatTextView h;
    public AppCompatTextView i;
    public AppCompatTextView j;
    public VKImageView k;
    public AppCompatTextView l;
    public pk30 m;
    public eq30 n;
    public final v5t o;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            dq30 dq30Var = dq30.this;
            pk30 pk30Var = dq30Var.m;
            eq30 eq30Var = dq30Var.n;
            Msg msg = eq30Var != null ? eq30Var.n : null;
            Attach attach = eq30Var != null ? eq30Var.m : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, eq30Var != null ? eq30Var.o : null);
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
            dq30 dq30Var = dq30.this;
            pk30 pk30Var = dq30Var.m;
            eq30 eq30Var = dq30Var.n;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = eq30Var != null ? eq30Var.n : null;
            Attach attach = eq30Var != null ? eq30Var.m : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, eq30Var != null ? eq30Var.o : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public dq30() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        s3q0 s3q0Var = s3q0.a;
        this.d = new DecimalFormat("#.0", decimalFormatSymbols);
        this.o = new v5t(R.layout.vkim_msg_part_avito);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.i;
        AppCompatTextView appCompatTextView = this.h;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setTextColor(bubbleColors.d);
        AppCompatTextView appCompatTextView2 = this.j;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        appCompatTextView2.setTextColor(i);
        AppCompatTextView appCompatTextView3 = this.j;
        if (appCompatTextView3 == null) {
            appCompatTextView3 = null;
        }
        hno0.a(appCompatTextView3, ColorStateList.valueOf(i));
        AppCompatTextView appCompatTextView4 = this.i;
        if (appCompatTextView4 == null) {
            appCompatTextView4 = null;
        }
        appCompatTextView4.setTextColor(i);
        AppCompatTextView appCompatTextView5 = this.l;
        if (appCompatTextView5 == null) {
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(i);
        TimeAndStatusView timeAndStatusView = this.e;
        (timeAndStatusView != null ? timeAndStatusView : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(eq30 eq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        eq30 eq30Var2 = eq30Var;
        String str = eq30Var2.f;
        this.m = pk30Var;
        this.n = eq30Var2;
        jr30 jr30Var = eq30Var2.b;
        TimeAndStatusView timeAndStatusView = this.e;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        Image Cb = eq30Var2.g.Cb(p, false);
        vKImageView.load(Cb != null ? Cb.d : null);
        AppCompatTextView appCompatTextView = this.h;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        ucp ucpVar = ucp.a;
        appCompatTextView.setText(ucp.i(eq30Var2.e));
        AppCompatTextView appCompatTextView2 = this.i;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        appCompatTextView2.setText(eq30Var2.h);
        AppCompatTextView appCompatTextView3 = this.j;
        if (appCompatTextView3 == null) {
            appCompatTextView3 = null;
        }
        float f = eq30Var2.i;
        int i = eq30Var2.j;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (Math.abs(f) <= Float.MAX_VALUE && f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            spannableStringBuilder.append((CharSequence) this.d.format(Float.valueOf(f))).append((CharSequence) q);
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            viewGroup = null;
        }
        Context context = viewGroup.getContext();
        if (i > 0) {
            spannableStringBuilder.append((CharSequence) context.getResources().getQuantityString(R.plurals.vkim_msg_link_review_multiple, i, Integer.valueOf(i)));
        } else {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.vkim_msg_link_review_no));
        }
        appCompatTextView3.setText(spannableStringBuilder);
        AppCompatTextView appCompatTextView4 = this.l;
        if (appCompatTextView4 == null) {
            appCompatTextView4 = null;
        }
        appCompatTextView4.setText(eq30Var2.d);
        if (str == null) {
            VKImageView vKImageView2 = this.k;
            f4m.j(vKImageView2 != null ? vKImageView2 : null);
            return;
        }
        VKImageView vKImageView3 = this.k;
        if (vKImageView3 == null) {
            vKImageView3 = null;
        }
        vKImageView3.setVisibility(0);
        VKImageView vKImageView4 = this.k;
        (vKImageView4 != null ? vKImageView4 : null).load(str);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.o;
        this.f = (ViewGroup) v5tVar.c(layoutInflater, viewGroup);
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
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.e = (TimeAndStatusView) viewGroup2.findViewById(R.id.timeAndStatus);
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.g = (VKImageView) viewGroup3.findViewById(R.id.iconView);
        ViewGroup viewGroup4 = this.f;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.h = (AppCompatTextView) viewGroup4.findViewById(R.id.title);
        ViewGroup viewGroup5 = this.f;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.j = (AppCompatTextView) viewGroup5.findViewById(R.id.sellerRating);
        ViewGroup viewGroup6 = this.f;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.i = (AppCompatTextView) viewGroup6.findViewById(R.id.sellerName);
        ViewGroup viewGroup7 = this.f;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.l = (AppCompatTextView) viewGroup7.findViewById(R.id.sellerPlatform);
        ViewGroup viewGroup8 = this.f;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.k = (VKImageView) viewGroup8.findViewById(R.id.sellerPlatformFavicon);
        ViewGroup viewGroup9 = this.f;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        Drawable a2 = m33.a(R.drawable.ic_external_market_favicon_16_background, viewGroup9.getContext());
        VKImageView vKImageView = this.k;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setOnLoadCallback(new c(a2));
        ViewGroup viewGroup10 = this.f;
        if (viewGroup10 == null) {
            return null;
        }
        return viewGroup10;
    }

    @Override // xsna.hr30
    public final void r() {
        this.m = null;
        this.n = null;
    }

    /* compiled from: MsgPartExternalMarketHolder.kt */
    public static final class c implements b780 {
        public final /* synthetic */ Drawable c;

        public c(Drawable drawable) {
            this.c = drawable;
        }

        @Override // xsna.b780
        public final void g(String str) {
            VKImageView vKImageView = dq30.this.k;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.setBackgroundImage(null);
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            VKImageView vKImageView = dq30.this.k;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.setBackgroundImage(this.c);
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
