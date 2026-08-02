package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.video.AdaptiveTimeAndStatusLayout;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.hr30;

/* compiled from: MsgPartExternalVideoHolder.kt */
/* loaded from: classes2.dex */
public final class fq30 extends hr30<AttachVideo, gq30> {
    public static final int v = cn70.b(8);
    public static final int w = cn70.b(12);
    public TextView d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public FrameLayout i;
    public VKImageView j;
    public VKEnhancedImageView k;
    public AdaptiveTimeAndStatusLayout l;
    public pk30 m;
    public gq30 n;
    public v5t o;
    public coo p;
    public ek30 q;
    public fk30 r;
    public final Object s;
    public final Object t;
    public final Object u;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            fq30 fq30Var = fq30.this;
            pk30 pk30Var = fq30Var.m;
            gq30 gq30Var = fq30Var.n;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = gq30Var != null ? gq30Var.u : null;
            Attach attach = gq30Var != null ? gq30Var.w : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, gq30Var != null ? gq30Var.v : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public fq30() {
        lk lkVar = new lk(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, lkVar);
        this.t = msy.a(lazyThreadSafetyMode, new fgm(this, 29));
        this.u = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.m(21));
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(bubbleColors.i);
        AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout = this.l;
        (adaptiveTimeAndStatusLayout != null ? adaptiveTimeAndStatusLayout : null).getTimeAndStatusView().setTimeTextColor(bubbleColors.h);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(gq30 gq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        fk30 fk30Var;
        gq30 gq30Var2 = gq30Var;
        VideoRestriction videoRestriction = gq30Var2.r;
        this.n = gq30Var2;
        this.m = pk30Var;
        jr30 jr30Var = gq30Var2.s;
        AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout = this.l;
        if (adaptiveTimeAndStatusLayout == null) {
            adaptiveTimeAndStatusLayout = null;
        }
        hr30.a.a(adaptiveTimeAndStatusLayout.getTimeAndStatusView(), jr30Var, false);
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(gq30Var2.o);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(gq30Var2.n);
        TextView textView3 = this.f;
        if (textView3 == null) {
            textView3 = null;
        }
        coo cooVar = this.p;
        if (cooVar == null) {
            cooVar = null;
        }
        textView3.setText(cooVar.a(gq30Var2.m));
        abi0 abi0Var = gq30Var2.t;
        boolean d = abi0Var != null ? abi0Var.d(Integer.valueOf(gq30Var2.l)) : false;
        VKEnhancedImageView vKEnhancedImageView = this.k;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        if (!d || (fk30Var = this.r) == null) {
            fk30Var = null;
        }
        vKEnhancedImageView.setColorFilter(fk30Var);
        ImageList imageList = gq30Var2.q;
        if (videoRestriction == null) {
            s(false);
            VKEnhancedImageView vKEnhancedImageView2 = this.k;
            if (vKEnhancedImageView2 == null) {
                vKEnhancedImageView2 = null;
            }
            vKEnhancedImageView2.clear();
            ek30 ek30Var = this.q;
            if (ek30Var == null) {
                ek30Var = null;
            }
            vKEnhancedImageView2.setPlaceholder(ek30Var);
            ek30 ek30Var2 = this.q;
            if (ek30Var2 == null) {
                ek30Var2 = null;
            }
            vKEnhancedImageView2.setEmptyPlaceholder(ek30Var2);
            vKEnhancedImageView2.setRemoteImage(imageList);
            FrameLayout frameLayout = this.i;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setBackground(null);
        } else {
            s(true);
            FrameLayout frameLayout2 = this.i;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            frameLayout2.setBackground((wng0) this.s.getValue());
            TextView textView4 = this.h;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setText(videoRestriction.b);
            VKImageView vKImageView = this.j;
            if (vKImageView == null) {
                vKImageView = null;
            }
            ImageSize Cb = videoRestriction.h.Cb(((Number) this.t.getValue()).intValue(), false, true);
            vKImageView.load(Cb != null ? Cb.d.d : null);
        }
        int b2 = gq30Var2.c != 0 ? cn70.b(0) : gq30Var2.j ? w : v;
        TextView textView5 = this.d;
        if (textView5 == null) {
            textView5 = null;
        }
        ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = b2;
        marginLayoutParams.rightMargin = b2;
        textView5.setLayoutParams(marginLayoutParams);
        u().setMinWidth((gq30Var2.d && gq30Var2.p) ? e3m.a(R.dimen.vkim_video_attach_small_min_width, t()) : e3m.a(R.dimen.vkim_video_attach_large_min_width, t()));
        f14 e = gq30Var2.e(t());
        int i = e.a;
        int i2 = e.b;
        boolean z = videoRestriction != null;
        VKEnhancedImageView vKEnhancedImageView3 = this.k;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        vKEnhancedImageView3.Y0(i, i, i2, i2);
        ek30 ek30Var3 = this.q;
        if (ek30Var3 == null) {
            ek30Var3 = null;
        }
        ek30Var3.c(i, i, i2, i2);
        if (z) {
            FrameLayout frameLayout3 = this.i;
            ((wng0) (frameLayout3 != null ? frameLayout3 : null).getBackground()).c(i, i, i2, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = new v5t(R.layout.vkim_msg_part_external_video);
        v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        view.setOnLongClickListener(new a());
        this.o = v5tVar;
        this.d = (TextView) u().findViewById(R.id.title);
        this.g = (TextView) u().findViewById(R.id.platform);
        this.f = (TextView) u().findViewById(R.id.timecode);
        this.e = (ImageView) u().findViewById(R.id.play_button);
        this.i = (FrameLayout) u().findViewById(R.id.preview_wrapper);
        this.j = (VKImageView) u().findViewById(R.id.restriction_icon);
        this.l = (AdaptiveTimeAndStatusLayout) u().findViewById(R.id.platform_wrapper);
        this.h = (TextView) u().findViewById(R.id.restriction_title);
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) u().findViewById(R.id.preview);
        bwt0.i0(vKEnhancedImageView, new ekh(this, 20));
        vKEnhancedImageView.setOnLoadCallback((b) this.u.getValue());
        this.k = vKEnhancedImageView;
        this.p = new coo(t());
        this.q = new ek30(t(), 0);
        this.r = new fk30(t());
        return u();
    }

    @Override // xsna.hr30
    public final void r() {
        this.m = null;
        this.n = null;
    }

    public final void s(boolean z) {
        VKEnhancedImageView vKEnhancedImageView = this.k;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        boolean z2 = !z;
        awt0.v(vKEnhancedImageView, z2);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        awt0.v(textView, z2);
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, z2);
        TextView textView2 = this.h;
        if (textView2 == null) {
            textView2 = null;
        }
        awt0.v(textView2, z);
        VKImageView vKImageView = this.j;
        awt0.v(vKImageView != null ? vKImageView : null, z);
    }

    public final Context t() {
        return u().getContext();
    }

    public final ConstraintLayout u() {
        v5t v5tVar = this.o;
        if (v5tVar == null) {
            v5tVar = null;
        }
        View view = (View) v5tVar.c;
        return (ConstraintLayout) (view != null ? view : null);
    }

    /* compiled from: MsgPartExternalVideoHolder.kt */
    public static final class b implements b780 {
        public final f2n0<String> b;

        public b() {
            zdw zdwVar = i7o0.b;
            this.b = (zdwVar == null ? null : zdwVar).d.t().l();
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.a(str, th);
        }

        @Override // xsna.b780
        public final void g(String str) {
            this.b.onStarted(str);
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            this.b.b(str);
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }
    }
}
