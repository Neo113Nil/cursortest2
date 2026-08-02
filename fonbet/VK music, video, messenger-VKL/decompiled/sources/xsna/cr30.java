package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.g34;

/* compiled from: MsgPartGraffitiHolder.kt */
/* loaded from: classes2.dex */
public final class cr30 extends hr30<AttachGraffiti, dr30> implements g34.a {
    public static final /* synthetic */ int n = 0;
    public Context d;
    public r3e0 e;
    public TimeAndStatusView f;
    public VKEnhancedImageView g;
    public final Object h;
    public final Object i;
    public pk30 j;
    public dr30 k;
    public g34 l;
    public final v5t m;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            cr30 cr30Var = cr30.this;
            pk30 pk30Var = cr30Var.j;
            dr30 dr30Var = cr30Var.k;
            Msg msg = dr30Var != null ? dr30Var.m : null;
            Attach attach = dr30Var != null ? dr30Var.o : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, dr30Var != null ? dr30Var.n : null);
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
            cr30 cr30Var = cr30.this;
            pk30 pk30Var = cr30Var.j;
            dr30 dr30Var = cr30Var.k;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = dr30Var != null ? dr30Var.m : null;
            Attach attach = dr30Var != null ? dr30Var.o : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, dr30Var != null ? dr30Var.n : null);
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
            cr30 cr30Var = cr30.this;
            pk30 pk30Var = cr30Var.j;
            dr30 dr30Var = cr30Var.k;
            Msg msg = dr30Var != null ? dr30Var.m : null;
            Attach attach = dr30Var != null ? dr30Var.o : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, dr30Var != null ? dr30Var.n : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class d implements View.OnLongClickListener {
        public d() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            cr30 cr30Var = cr30.this;
            pk30 pk30Var = cr30Var.j;
            dr30 dr30Var = cr30Var.k;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = dr30Var != null ? dr30Var.m : null;
            Attach attach = dr30Var != null ? dr30Var.o : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, dr30Var != null ? dr30Var.n : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public cr30() {
        gzv gzvVar = new gzv(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, gzvVar);
        this.i = msy.a(lazyThreadSafetyMode, new x4u(this, 12));
        this.m = new v5t(R.layout.vkim_msg_part_graffiti);
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.e;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.e;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.e;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(dr30 dr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        dr30 dr30Var2 = dr30Var;
        this.j = pk30Var;
        this.k = dr30Var2;
        g34 g34Var = dr30Var2.e;
        this.l = g34Var;
        if (g34Var != null) {
            g34Var.a(dr30Var2.h, this);
        }
        VKEnhancedImageView vKEnhancedImageView = this.g;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setIgnoreTrafficSaverPredicate(new y84(12));
        VKEnhancedImageView vKEnhancedImageView2 = this.g;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setLocalImage(dr30Var2.f);
        VKEnhancedImageView vKEnhancedImageView3 = this.g;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        vKEnhancedImageView3.setRemoteImage(dr30Var2.g);
        VKEnhancedImageView vKEnhancedImageView4 = this.g;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        int m0 = dr30Var2.m0(context);
        Context context2 = this.d;
        if (context2 == null) {
            context2 = null;
        }
        int m02 = dr30Var2.m0(context2);
        Context context3 = this.d;
        if (context3 == null) {
            context3 = null;
        }
        int g = dr30Var2.g(context3);
        Context context4 = this.d;
        if (context4 == null) {
            context4 = null;
        }
        vKEnhancedImageView4.Y0(m0, m02, g, dr30Var2.g(context4));
        ek30 ek30Var = (ek30) this.h.getValue();
        Context context5 = this.d;
        if (context5 == null) {
            context5 = null;
        }
        int m03 = dr30Var2.m0(context5);
        Context context6 = this.d;
        if (context6 == null) {
            context6 = null;
        }
        int m04 = dr30Var2.m0(context6);
        Context context7 = this.d;
        if (context7 == null) {
            context7 = null;
        }
        int g2 = dr30Var2.g(context7);
        Context context8 = this.d;
        if (context8 == null) {
            context8 = null;
        }
        ek30Var.c(m03, m04, g2, dr30Var2.g(context8));
        ColorFilter colorFilter = dr30Var2.P() ? (ColorFilter) this.i.getValue() : null;
        VKEnhancedImageView vKEnhancedImageView5 = this.g;
        if (vKEnhancedImageView5 == null) {
            vKEnhancedImageView5 = null;
        }
        vKEnhancedImageView5.setColorFilter(colorFilter);
        Attach attach = dr30Var2.o;
        if (attach != null) {
            r3e0 r3e0Var = this.e;
            if (r3e0Var == null) {
                r3e0Var = null;
            }
            r3e0Var.a(attach);
        }
        jr30 jr30Var = dr30Var2.c;
        TimeAndStatusView timeAndStatusView = this.f;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        v5t v5tVar = this.m;
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
        this.g = (VKEnhancedImageView) c2.findViewById(R.id.image);
        this.f = (TimeAndStatusView) c2.findViewById(R.id.timeAndStatus);
        c2.setClickable(false);
        this.e = new r3e0((ProgressView) c2.findViewById(R.id.upload), null, new com.vk.im.video.d(this, 8));
        VKEnhancedImageView vKEnhancedImageView = this.g;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setPlaceholder((ek30) this.h.getValue());
        VKEnhancedImageView vKEnhancedImageView2 = this.g;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        jjc.g(vKEnhancedImageView2, new c());
        VKEnhancedImageView vKEnhancedImageView3 = this.g;
        (vKEnhancedImageView3 != null ? vKEnhancedImageView3 : null).setOnLongClickListener(new d());
        return c2;
    }

    @Override // xsna.hr30
    public final void r() {
        dr30 dr30Var = this.k;
        if (dr30Var != null) {
            int i = dr30Var.h;
            g34 g34Var = this.l;
            if (g34Var != null) {
                g34Var.a(i, null);
            }
        }
        this.l = null;
        r3e0 r3e0Var = this.e;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        this.j = null;
        this.k = null;
    }
}
