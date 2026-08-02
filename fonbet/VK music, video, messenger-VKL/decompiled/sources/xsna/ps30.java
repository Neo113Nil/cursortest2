package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.ProgressView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.BlurredFrameLayout;
import com.vk.im.ui.views.RestrictionVKEnhancedImageView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.g34;

/* compiled from: MsgPartPhotoHolder.kt */
/* loaded from: classes2.dex */
public final class ps30 extends hr30<AttachImage, rs30> implements g34.a {
    public static final Object u;
    public static final Object v;
    public Context d;
    public View e;
    public RestrictionVKEnhancedImageView f;
    public r3e0 g;
    public TimeAndStatusView h;
    public BlurredFrameLayout i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public pk30 o;
    public rs30 p;
    public g34 q;
    public final v5t r;
    public final boolean s;
    public final Object t;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            ps30 ps30Var = ps30.this;
            pk30 pk30Var = ps30Var.o;
            rs30 rs30Var = ps30Var.p;
            Msg msg = rs30Var != null ? rs30Var.w : null;
            Attach attach = rs30Var != null ? rs30Var.y : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, rs30Var != null ? rs30Var.x : null);
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
            ps30 ps30Var = ps30.this;
            pk30 pk30Var = ps30Var.o;
            rs30 rs30Var = ps30Var.p;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = rs30Var != null ? rs30Var.w : null;
            Attach attach = rs30Var != null ? rs30Var.y : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, rs30Var != null ? rs30Var.x : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    static {
        pd4 pd4Var = new pd4(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        u = msy.a(lazyThreadSafetyMode, pd4Var);
        v = msy.a(lazyThreadSafetyMode, new ml7(16));
    }

    public ps30() {
        os30 os30Var = new os30(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, os30Var);
        this.k = msy.a(lazyThreadSafetyMode, new r010(this, 7));
        this.l = msy.a(lazyThreadSafetyMode, new flu(this, 18));
        this.m = msy.a(lazyThreadSafetyMode, new t210(this, 6));
        this.n = msy.a(lazyThreadSafetyMode, new daz(4));
        this.r = new v5t(R.layout.vkim_msg_part_photo);
        ImFeatures imFeatures = ImFeatures.BLUR_POST;
        imFeatures.getClass();
        this.s = com.vk.toggle.b.A.a(imFeatures);
        this.t = msy.a(lazyThreadSafetyMode, new d1(25));
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.g;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.g;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.g;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    @Override // xsna.hr30
    public final View n(int i) {
        rs30 rs30Var = this.p;
        Attach attach = rs30Var != null ? rs30Var.y : null;
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView = this.f;
        if (restrictionVKEnhancedImageView == null) {
            restrictionVKEnhancedImageView = null;
        }
        if (attach == null || attach.xb() != i) {
            restrictionVKEnhancedImageView = null;
        }
        if (restrictionVKEnhancedImageView != null) {
            return restrictionVKEnhancedImageView;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(rs30 rs30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        boolean z;
        rs30 rs30Var2 = rs30Var;
        PhotoRestriction photoRestriction = rs30Var2.m;
        ImageList imageList = rs30Var2.j;
        this.o = pk30Var;
        this.p = rs30Var2;
        g34 g34Var = rs30Var2.h;
        this.q = g34Var;
        if (g34Var != null) {
            g34Var.a(rs30Var2.i, this);
        }
        if (rs30Var2.f) {
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView = this.f;
            if (restrictionVKEnhancedImageView == null) {
                restrictionVKEnhancedImageView = null;
            }
            restrictionVKEnhancedImageView.setMaximumWidth(Integer.MAX_VALUE);
        } else {
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView2 = this.f;
            if (restrictionVKEnhancedImageView2 == null) {
                restrictionVKEnhancedImageView2 = null;
            }
            restrictionVKEnhancedImageView2.setMaximumWidth(((Number) this.l.getValue()).intValue());
        }
        if (rs30Var2.e) {
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView3 = this.f;
            if (restrictionVKEnhancedImageView3 == null) {
                restrictionVKEnhancedImageView3 = null;
            }
            restrictionVKEnhancedImageView3.setMaximumHeight(Integer.MAX_VALUE);
        } else {
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView4 = this.f;
            if (restrictionVKEnhancedImageView4 == null) {
                restrictionVKEnhancedImageView4 = null;
            }
            restrictionVKEnhancedImageView4.setMaximumHeight(((Number) this.m.getValue()).intValue());
        }
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView5 = this.f;
        if (restrictionVKEnhancedImageView5 == null) {
            restrictionVKEnhancedImageView5 = null;
        }
        restrictionVKEnhancedImageView5.setLocalImage(rs30Var2.k);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView6 = this.f;
        if (restrictionVKEnhancedImageView6 == null) {
            restrictionVKEnhancedImageView6 = null;
        }
        restrictionVKEnhancedImageView6.setRemoteImage(imageList);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView7 = this.f;
        if (restrictionVKEnhancedImageView7 == null) {
            restrictionVKEnhancedImageView7 = null;
        }
        long j = rs30Var2.n;
        UserId userId = rs30Var2.o;
        ahn.e();
        ddg0 ddg0Var = ddg0.a;
        if (photoRestriction == null || ((z = photoRestriction.d) && (!z || ddg0.d(j, userId)))) {
            restrictionVKEnhancedImageView7.setRestrictions(null);
        } else {
            restrictionVKEnhancedImageView7.setRestrictions(photoRestriction);
        }
        Attach attach = rs30Var2.y;
        if (this.s && (attach instanceof AttachImage)) {
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView8 = this.f;
            if (restrictionVKEnhancedImageView8 == null) {
                restrictionVKEnhancedImageView8 = null;
            }
            restrictionVKEnhancedImageView8.setDonation(rs30Var2.v);
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView9 = this.f;
            if (restrictionVKEnhancedImageView9 == null) {
                restrictionVKEnhancedImageView9 = null;
            }
            restrictionVKEnhancedImageView9.setSpoiler(hpt0.q((AttachImage) attach));
        }
        if (photoRestriction == null || !(!photoRestriction.d)) {
            s(imageList);
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView10 = this.f;
            if (restrictionVKEnhancedImageView10 == null) {
                restrictionVKEnhancedImageView10 = null;
            }
            restrictionVKEnhancedImageView10.getLayoutParams().width = -2;
        } else {
            s(null);
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView11 = this.f;
            if (restrictionVKEnhancedImageView11 == null) {
                restrictionVKEnhancedImageView11 = null;
            }
            restrictionVKEnhancedImageView11.getLayoutParams().width = -1;
        }
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        f14 e = rs30Var2.e(context);
        int i = e.a;
        int i2 = e.b;
        BlurredFrameLayout blurredFrameLayout = this.i;
        if (blurredFrameLayout == null) {
            blurredFrameLayout = null;
        }
        blurredFrameLayout.a(i, i2);
        BlurredFrameLayout blurredFrameLayout2 = this.i;
        if (blurredFrameLayout2 == null) {
            blurredFrameLayout2 = null;
        }
        if (!blurredFrameLayout2.isLaidOut() || blurredFrameLayout2.isLayoutRequested()) {
            blurredFrameLayout2.addOnLayoutChangeListener(new qs30(this, i, i2));
        } else {
            BlurredFrameLayout blurredFrameLayout3 = this.i;
            if (blurredFrameLayout3 == null) {
                blurredFrameLayout3 = null;
            }
            int width = blurredFrameLayout3.getWidth();
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView12 = this.f;
            if (restrictionVKEnhancedImageView12 == null) {
                restrictionVKEnhancedImageView12 = null;
            }
            if (width == restrictionVKEnhancedImageView12.getWidth()) {
                BlurredFrameLayout blurredFrameLayout4 = this.i;
                if (blurredFrameLayout4 == null) {
                    blurredFrameLayout4 = null;
                }
                int height = blurredFrameLayout4.getHeight();
                RestrictionVKEnhancedImageView restrictionVKEnhancedImageView13 = this.f;
                if (restrictionVKEnhancedImageView13 == null) {
                    restrictionVKEnhancedImageView13 = null;
                }
                if (height == restrictionVKEnhancedImageView13.getHeight()) {
                    RestrictionVKEnhancedImageView restrictionVKEnhancedImageView14 = this.f;
                    if (restrictionVKEnhancedImageView14 == null) {
                        restrictionVKEnhancedImageView14 = null;
                    }
                    restrictionVKEnhancedImageView14.Y0(i, i, i2, i2);
                }
            }
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView15 = this.f;
            if (restrictionVKEnhancedImageView15 == null) {
                restrictionVKEnhancedImageView15 = null;
            }
            restrictionVKEnhancedImageView15.Y0(0, 0, 0, 0);
        }
        ColorFilter colorFilter = rs30Var2.P() ? (ColorFilter) this.k.getValue() : null;
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView16 = this.f;
        if (restrictionVKEnhancedImageView16 == null) {
            restrictionVKEnhancedImageView16 = null;
        }
        restrictionVKEnhancedImageView16.setColorFilter(colorFilter);
        BlurredFrameLayout blurredFrameLayout5 = this.i;
        if (blurredFrameLayout5 == null) {
            blurredFrameLayout5 = null;
        }
        blurredFrameLayout5.setFilter(colorFilter);
        Attach attach2 = rs30Var2.y;
        if (attach2 != null) {
            r3e0 r3e0Var = this.g;
            if (r3e0Var == null) {
                r3e0Var = null;
            }
            r3e0Var.a(attach2);
        }
        jr30 jr30Var = rs30Var2.g;
        TimeAndStatusView timeAndStatusView = this.h;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        v5t v5tVar = this.r;
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
        this.f = (RestrictionVKEnhancedImageView) c2.findViewById(R.id.image);
        this.h = (TimeAndStatusView) c2.findViewById(R.id.timeAndStatus);
        this.g = new r3e0((ProgressView) c2.findViewById(R.id.upload), null, new u01(this, 7));
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView = this.f;
        if (restrictionVKEnhancedImageView == null) {
            restrictionVKEnhancedImageView = null;
        }
        restrictionVKEnhancedImageView.setPlaceholder((ek30) this.j.getValue());
        BlurredFrameLayout blurredFrameLayout = (BlurredFrameLayout) c2.findViewById(R.id.container);
        this.i = blurredFrameLayout;
        ?? r0 = this.n;
        blurredFrameLayout.setMinimumWidth(((Number) r0.getValue()).intValue());
        BlurredFrameLayout blurredFrameLayout2 = this.i;
        if (blurredFrameLayout2 == null) {
            blurredFrameLayout2 = null;
        }
        blurredFrameLayout2.setMinimumHeight(((Number) r0.getValue()).intValue());
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView2 = this.f;
        if (restrictionVKEnhancedImageView2 == null) {
            restrictionVKEnhancedImageView2 = null;
        }
        restrictionVKEnhancedImageView2.setMinimumWidth(0);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView3 = this.f;
        if (restrictionVKEnhancedImageView3 == null) {
            restrictionVKEnhancedImageView3 = null;
        }
        restrictionVKEnhancedImageView3.setMinimumHeight(0);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView4 = this.f;
        if (restrictionVKEnhancedImageView4 == null) {
            restrictionVKEnhancedImageView4 = null;
        }
        restrictionVKEnhancedImageView4.setMaximumWidth(Integer.MAX_VALUE);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView5 = this.f;
        if (restrictionVKEnhancedImageView5 == null) {
            restrictionVKEnhancedImageView5 = null;
        }
        restrictionVKEnhancedImageView5.setMaximumHeight(Integer.MAX_VALUE);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView6 = this.f;
        if (restrictionVKEnhancedImageView6 == null) {
            restrictionVKEnhancedImageView6 = null;
        }
        restrictionVKEnhancedImageView6.setScaleType(ScaleType.FIT_CENTER);
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView7 = this.f;
        if (restrictionVKEnhancedImageView7 == null) {
            restrictionVKEnhancedImageView7 = null;
        }
        restrictionVKEnhancedImageView7.getLayoutParams().width = -2;
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView8 = this.f;
        (restrictionVKEnhancedImageView8 != null ? restrictionVKEnhancedImageView8 : null).setOnLoadCallback((c) this.t.getValue());
        this.e = c2;
        return c2;
    }

    @Override // xsna.hr30
    public final void r() {
        rs30 rs30Var = this.p;
        if (rs30Var != null) {
            int i = rs30Var.i;
            g34 g34Var = this.q;
            if (g34Var != null) {
                g34Var.a(i, null);
            }
        }
        this.q = null;
        r3e0 r3e0Var = this.g;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        this.o = null;
        this.p = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void s(ImageList imageList) {
        Image Bb = imageList != null ? imageList.Bb(32, 32) : null;
        jwx jwxVar = (Bb == null || (Bb.b <= 400 && Bb.c <= 400)) ? (jwx) u.getValue() : (jwx) v.getValue();
        BlurredFrameLayout blurredFrameLayout = this.i;
        if (blurredFrameLayout == null) {
            blurredFrameLayout = null;
        }
        blurredFrameLayout.setBlurPostprocessor(jwxVar);
        BlurredFrameLayout blurredFrameLayout2 = this.i;
        if (blurredFrameLayout2 == null) {
            blurredFrameLayout2 = null;
        }
        String str = Bb != null ? Bb.d : null;
        if (epx.f(blurredFrameLayout2.g, str)) {
            return;
        }
        blurredFrameLayout2.g = str;
        blurredFrameLayout2.h = true;
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        File i1;
        rs30 rs30Var = this.p;
        String str2 = null;
        Attach attach = rs30Var != null ? rs30Var.y : null;
        Attach attach2 = rs30Var != null ? rs30Var.y : null;
        ftx0 ftx0Var = attach2 instanceof ftx0 ? (ftx0) attach2 : null;
        if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
            str2 = i1.getPath();
        }
        return (attach == null || str2 == null || !str2.equals(str)) ? EmptyList.b : Collections.singletonList(Integer.valueOf(attach.xb()));
    }

    /* compiled from: MsgPartPhotoHolder.kt */
    public static final class c implements b780 {
        public final f2n0<String> b;

        public c() {
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
