package xsna;

import android.content.Context;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.g34;

/* compiled from: MsgPartDocPreviewHolder.kt */
/* loaded from: classes2.dex */
public final class op30 extends hr30<AttachDoc, pp30> implements g34.a {
    public Context d;
    public ViewGroup e;
    public VKEnhancedImageView f;
    public View g;
    public TextView h;
    public ProgressView i;
    public TimeAndStatusView j;
    public r3e0 k;
    public pk30 l;
    public pp30 m;
    public g34 n;
    public int o;
    public final StringBuilder p = new StringBuilder();
    public final v5t q;
    public ek30 r;

    /* compiled from: MsgPartDocPreviewHolder.kt */
    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), op30.this.o);
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            op30 op30Var = op30.this;
            pk30 pk30Var = op30Var.l;
            pp30 pp30Var = op30Var.m;
            Msg msg = pp30Var != null ? pp30Var.s : null;
            Attach attach = pp30Var != null ? pp30Var.u : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, pp30Var != null ? pp30Var.t : null);
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
            op30 op30Var = op30.this;
            pk30 pk30Var = op30Var.l;
            pp30 pp30Var = op30Var.m;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = pp30Var != null ? pp30Var.s : null;
            Attach attach = pp30Var != null ? pp30Var.u : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, pp30Var != null ? pp30Var.t : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public op30() {
        new a();
        this.q = new v5t(R.layout.vkim_msg_part_doc_preview_image);
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.k;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.k;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.k;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    @Override // xsna.hr30
    public final View n(int i) {
        VKEnhancedImageView vKEnhancedImageView;
        pp30 pp30Var = this.m;
        if (pp30Var == null || i != pp30Var.l || (vKEnhancedImageView = this.f) == null) {
            return null;
        }
        return vKEnhancedImageView;
    }

    @Override // xsna.hr30
    public final void p(pp30 pp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        String str;
        pp30 pp30Var2 = pp30Var;
        boolean z = pp30Var2.k;
        this.m = pp30Var2;
        this.l = pk30Var;
        g34 g34Var = pp30Var2.h;
        this.n = g34Var;
        if (g34Var != null) {
            g34Var.a(pp30Var2.l, this);
        }
        if (pp30Var2.e) {
            VKEnhancedImageView vKEnhancedImageView = this.f;
            if (vKEnhancedImageView == null) {
                vKEnhancedImageView = null;
            }
            vKEnhancedImageView.setMaximumWidth(Integer.MAX_VALUE);
        } else {
            VKEnhancedImageView vKEnhancedImageView2 = this.f;
            VKEnhancedImageView vKEnhancedImageView3 = vKEnhancedImageView2 == null ? null : vKEnhancedImageView2;
            if (vKEnhancedImageView2 == null) {
                vKEnhancedImageView2 = null;
            }
            vKEnhancedImageView3.setMaximumWidth(e3m.a(R.dimen.msg_bubble_max_width, vKEnhancedImageView2.getContext()));
        }
        VKEnhancedImageView vKEnhancedImageView4 = this.f;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        ImageList imageList = pp30Var2.j;
        vKEnhancedImageView4.setScaleType(z ? ScaleType.CENTER_CROP_UPSCALE : ScaleType.CENTER_CROP);
        VKEnhancedImageView vKEnhancedImageView5 = this.f;
        if (vKEnhancedImageView5 == null) {
            vKEnhancedImageView5 = null;
        }
        vKEnhancedImageView5.setLocalImage(pp30Var2.i);
        if (z) {
            VKEnhancedImageView vKEnhancedImageView6 = this.f;
            if (vKEnhancedImageView6 == null) {
                vKEnhancedImageView6 = null;
            }
            vKEnhancedImageView6.setRemoteImage(imageList.Ab());
        } else {
            VKEnhancedImageView vKEnhancedImageView7 = this.f;
            if (vKEnhancedImageView7 == null) {
                vKEnhancedImageView7 = null;
            }
            vKEnhancedImageView7.setRemoteImage(imageList);
        }
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        int m0 = pp30Var2.m0(context);
        Context context2 = this.d;
        if (context2 == null) {
            context2 = null;
        }
        int g = pp30Var2.g(context2);
        Context context3 = this.d;
        if (context3 == null) {
            context3 = null;
        }
        this.o = Math.max(pp30Var2.m0(context3), pp30Var2.g(context3));
        VKEnhancedImageView vKEnhancedImageView8 = this.f;
        if (vKEnhancedImageView8 == null) {
            vKEnhancedImageView8 = null;
        }
        vKEnhancedImageView8.Y0(m0, m0, g, g);
        ek30 ek30Var = this.r;
        if (ek30Var != null) {
            ek30Var.c(m0, m0, g, g);
        }
        StringBuilder sb = this.p;
        sb.setLength(0);
        pp30 pp30Var3 = this.m;
        sb.append((pp30Var3 == null || (str = pp30Var3.m) == null) ? null : str.toUpperCase(Locale.ROOT));
        sb.append(" · ");
        lar larVar = lar.a;
        pp30 pp30Var4 = this.m;
        long j = pp30Var4 != null ? pp30Var4.n : 0L;
        larVar.getClass();
        lar.b(j, sb);
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(sb);
        boolean P = pp30Var2.P();
        View view = this.g;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, P);
        Attach attach = pp30Var2.u;
        if (attach != null) {
            r3e0 r3e0Var = this.k;
            if (r3e0Var == null) {
                r3e0Var = null;
            }
            r3e0Var.a(attach);
        }
        jr30 jr30Var = pp30Var2.g;
        TimeAndStatusView timeAndStatusView = this.j;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        v5t v5tVar = this.q;
        this.e = (ViewGroup) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new b());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new c());
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.g = viewGroup2.findViewById(R.id.selection_mask);
        ViewGroup viewGroup3 = this.e;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.f = (VKEnhancedImageView) viewGroup3.findViewById(R.id.image);
        ViewGroup viewGroup4 = this.e;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.h = (TextView) viewGroup4.findViewById(R.id.label_default);
        ViewGroup viewGroup5 = this.e;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.i = (ProgressView) viewGroup5.findViewById(R.id.upload);
        ViewGroup viewGroup6 = this.e;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.j = (TimeAndStatusView) viewGroup6.findViewById(R.id.timeAndStatus);
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        ek30 ek30Var = new ek30(context, 0);
        this.r = ek30Var;
        VKEnhancedImageView vKEnhancedImageView = this.f;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setPlaceholder(ek30Var);
        ProgressView progressView = this.i;
        if (progressView == null) {
            progressView = null;
        }
        this.k = new r3e0(progressView, null, new c98(this, 6));
        ViewGroup viewGroup7 = this.e;
        if (viewGroup7 == null) {
            return null;
        }
        return viewGroup7;
    }

    @Override // xsna.hr30
    public final void r() {
        pp30 pp30Var = this.m;
        if (pp30Var != null) {
            int i = pp30Var.l;
            g34 g34Var = this.n;
            if (g34Var != null) {
                g34Var.a(i, null);
            }
        }
        this.n = null;
        this.m = null;
        this.l = null;
        r3e0 r3e0Var = this.k;
        (r3e0Var != null ? r3e0Var : null).e();
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        File i1;
        pp30 pp30Var = this.m;
        String str2 = null;
        Attach attach = pp30Var != null ? pp30Var.u : null;
        Attach attach2 = pp30Var != null ? pp30Var.u : null;
        ftx0 ftx0Var = attach2 instanceof ftx0 ? (ftx0) attach2 : null;
        if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
            str2 = i1.getPath();
        }
        return (attach == null || str2 == null || !str2.equals(str)) ? EmptyList.b : Collections.singletonList(Integer.valueOf(attach.xb()));
    }
}
