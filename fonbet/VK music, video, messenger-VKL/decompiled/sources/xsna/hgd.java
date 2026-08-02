package xsna;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.sidecontrols.renderer.model.Mode;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ily;

/* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
/* loaded from: classes16.dex */
public final class hgd implements ggd {
    public final View a;
    public final LottieAnimationView b;
    public final TextView c;
    public final ColorStateList d;
    public final bpn0 e;
    public final Object f;
    public ch2 g;
    public a h;
    public final View i;

    /* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
    public interface a {

        /* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
        /* renamed from: xsna.hgd$a$a, reason: collision with other inner class name */
        public interface InterfaceC2993a extends a {

            /* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
            /* renamed from: xsna.hgd$a$a$a, reason: collision with other inner class name */
            public static final class C2994a implements InterfaceC2993a {
                public final int a;
                public final int b;
                public final float c;

                public C2994a(int i, int i2, float f) {
                    this.a = i;
                    this.b = i2;
                    this.c = f;
                }

                @Override // xsna.hgd.a.InterfaceC2993a
                public final int a() {
                    return this.b;
                }

                @Override // xsna.hgd.a.InterfaceC2993a
                public final int b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2994a)) {
                        return false;
                    }
                    C2994a c2994a = (C2994a) obj;
                    return this.a == c2994a.a && this.b == c2994a.b && Float.compare(this.c, c2994a.c) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CheckAnimation(imageRes=");
                    sb.append(this.a);
                    sb.append(", animationRes=");
                    sb.append(this.b);
                    sb.append(", animationSpeed=");
                    return xq.c(')', this.c, sb);
                }
            }

            /* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
            /* renamed from: xsna.hgd$a$a$b */
            public static final class b implements InterfaceC2993a {
                public final int a;
                public final int b;
                public final float c;

                public b(int i, int i2, float f) {
                    this.a = i;
                    this.b = i2;
                    this.c = f;
                }

                @Override // xsna.hgd.a.InterfaceC2993a
                public final int a() {
                    return this.b;
                }

                @Override // xsna.hgd.a.InterfaceC2993a
                public final int b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a == bVar.a && this.b == bVar.b && Float.compare(this.c, bVar.c) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("UncheckAnimation(imageRes=");
                    sb.append(this.a);
                    sb.append(", animationRes=");
                    sb.append(this.b);
                    sb.append(", animationSpeed=");
                    return xq.c(')', this.c, sb);
                }
            }

            int a();

            int b();
        }

        /* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    /* compiled from: ClipsAnimatedIconButtonLottieImpl.kt */
    public final class b implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
        public boolean b;

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            hgd hgdVar = hgd.this;
            LottieAnimationView lottieAnimationView = hgdVar.b;
            TextView textView = hgdVar.c;
            if (textView != null) {
                textView.setTextColor(hgdVar.d);
            }
            if (this.b) {
                return;
            }
            boolean z = hgdVar.d(true) == lottieAnimationView.getProgress();
            if (textView != null) {
                textView.setSelected(z);
            }
            lottieAnimationView.setSelected(z);
            if (hgd.e(hgdVar.g).equals(hgdVar.h)) {
                return;
            }
            hgdVar.g();
            hgdVar.h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            this.b = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.b = false;
            hgd hgdVar = hgd.this;
            TextView textView = hgdVar.c;
            LottieAnimationView lottieAnimationView = hgdVar.b;
            ColorStateList colorStateList = hgdVar.d;
            int colorForState = colorStateList != null ? colorStateList.getColorForState(new int[]{R.attr.state_selected}, 0) : 0;
            int colorForState2 = colorStateList != null ? colorStateList.getColorForState(new int[]{-16842913}, 0) : 0;
            a aVar = hgdVar.h;
            boolean z = aVar instanceof a.InterfaceC2993a.C2994a;
            zj3 zj3Var = zj3.a;
            if (z) {
                a.InterfaceC2993a.C2994a c2994a = (a.InterfaceC2993a.C2994a) aVar;
                c2994a.getClass();
                colorForState2 = ((Integer) zj3Var.evaluate(swe0.f((c2994a.c > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? lottieAnimationView.getProgress() : 1.0f - lottieAnimationView.getProgress()) - 0.25f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f) / 0.5f, Integer.valueOf(colorForState2), Integer.valueOf(colorForState))).intValue();
            } else if (aVar instanceof a.InterfaceC2993a.b) {
                a.InterfaceC2993a.b bVar = (a.InterfaceC2993a.b) aVar;
                bVar.getClass();
                colorForState2 = ((Integer) zj3Var.evaluate(swe0.f((bVar.c > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? lottieAnimationView.getProgress() : 1.0f - lottieAnimationView.getProgress()) * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), Integer.valueOf(colorForState), Integer.valueOf(colorForState2))).intValue();
            } else if (!epx.f(aVar, a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (textView != null) {
                textView.setTextColor(colorForState2);
            }
            if (textView != null) {
                textView.invalidate();
            }
        }
    }

    public hgd(View view, LottieAnimationView lottieAnimationView, TextView textView) {
        this.a = view;
        this.b = lottieAnimationView;
        this.c = textView;
        this.d = textView != null ? textView.getTextColors() : null;
        this.e = new bpn0(new xm1(this, 21));
        this.f = msy.a(LazyThreadSafetyMode.NONE, new ka0(this, 21));
        this.g = new ch2(0);
        this.h = a.b.a;
        this.i = view;
    }

    public static a.InterfaceC2993a e(ch2 ch2Var) {
        boolean z = ch2Var.c;
        ok2 ok2Var = ch2Var.g;
        return z ? new a.InterfaceC2993a.b(ok2Var.a, ok2Var.c, ok2Var.e) : new a.InterfaceC2993a.C2994a(ok2Var.a, ok2Var.b, ok2Var.d);
    }

    @Override // xsna.ggd
    public final void a(izs<? super View, s3q0> izsVar) {
        jjc.g(this.a, new ut6(5, this, izsVar));
    }

    @Override // xsna.ggd
    public final void b(boolean z) {
        ch2 ch2Var = this.g;
        boolean z2 = ch2Var.a;
        ok2 ok2Var = ch2Var.g;
        Object bVar = z ? new a.InterfaceC2993a.b(ok2Var.a, ok2Var.c, ok2Var.e) : new a.InterfaceC2993a.C2994a(ok2Var.a, ok2Var.b, ok2Var.d);
        boolean equals = bVar.equals(this.h);
        LottieAnimationView lottieAnimationView = this.b;
        if (!equals && !f(z) && lottieAnimationView.getProgress() != d(z)) {
            lottieAnimationView.l0();
            lottieAnimationView.setSpeed(z ? this.g.g.d : this.g.g.e);
            lottieAnimationView.p0();
        } else if (bVar.equals(this.h) && f(!z)) {
            lottieAnimationView.l0();
            float f = -(!z ? this.g.g.d : this.g.g.e);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 1.0f;
            }
            lottieAnimationView.setProgress(f2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ggd
    public final void c(ch2 ch2Var) {
        if (epx.f(this.g, ch2Var) && e(ch2Var).equals(this.h)) {
            return;
        }
        this.g = ch2Var;
        String str = ch2Var.e.a;
        View view = this.a;
        view.setContentDescription(str);
        view.setBackground(this.g.e.b ? (Drawable) this.f.getValue() : null);
        g();
        h();
        ch2 ch2Var2 = this.g;
        boolean z = ch2Var2.b;
        TextView textView = this.c;
        LottieAnimationView lottieAnimationView = this.b;
        if (z && ch2Var2.a) {
            view.setVisibility(0);
            lottieAnimationView.setVisibility(0);
            if (textView != null) {
                textView.setVisibility(this.g.f.a ? 0 : 8);
                return;
            }
            return;
        }
        if (z) {
            view.setVisibility(4);
            lottieAnimationView.setVisibility(4);
            if (textView != null) {
                textView.setVisibility(this.g.f.a ? 4 : 8);
                return;
            }
            return;
        }
        view.setVisibility(8);
        lottieAnimationView.setVisibility(8);
        if (textView != null) {
            boolean z2 = this.g.f.a;
            textView.setVisibility(8);
        }
    }

    public final float d(boolean z) {
        a aVar = this.h;
        if (aVar instanceof a.InterfaceC2993a.C2994a) {
            if (z ^ (((a.InterfaceC2993a.C2994a) aVar).c > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        if (aVar instanceof a.InterfaceC2993a.b) {
            if (z ^ (((a.InterfaceC2993a.b) aVar).c > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                return 1.0f;
            }
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (epx.f(aVar, a.b.a)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean f(boolean z) {
        if (this.b.f.m()) {
            a aVar = this.h;
            if (!(aVar instanceof a.InterfaceC2993a.C2994a)) {
                if (aVar instanceof a.InterfaceC2993a.b) {
                    if (!z) {
                        z = true;
                    }
                } else if (!epx.f(aVar, a.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        vf0 vf0Var = new vf0(this, 21);
        a aVar = this.h;
        a.InterfaceC2993a interfaceC2993a = aVar instanceof a.InterfaceC2993a ? (a.InterfaceC2993a) aVar : null;
        a.InterfaceC2993a e = e(this.g);
        if (epx.f(interfaceC2993a, e)) {
            vf0Var.invoke();
            return;
        }
        LottieAnimationView lottieAnimationView = this.b;
        k800 k800Var = lottieAnimationView.f;
        HashSet hashSet = lottieAnimationView.m;
        if (k800Var.m()) {
            return;
        }
        lottieAnimationView.o0();
        hashSet.clear();
        lottieAnimationView.setImageResource(e.b());
        if (interfaceC2993a == null || interfaceC2993a.a() != e.a()) {
            lottieAnimationView.setAnimation(e.a());
            lottieAnimationView.l0();
        }
        igd igdVar = new igd(this, e, vf0Var);
        if (lottieAnimationView.getComposition() != null) {
            igdVar.a();
        }
        hashSet.add(igdVar);
    }

    @Override // xsna.ggd
    public final View getView() {
        return this.i;
    }

    public final void h() {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(this.g.f.b);
        }
        ily.a aVar = this.g.f.c;
        if (aVar != null) {
            float f = aVar.b;
            if (textView != null) {
                textView.setShadowLayer(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.a, textView.getContext().getColor(com.vkontakte.android.R.color.vk_black_alpha24));
            }
            if (textView != null) {
                f4m.x((int) f, textView);
            }
            if (textView != null) {
                f4m.w((int) f, textView);
            }
        }
        if (this.b.f.m() || textView == null) {
            return;
        }
        ch2 ch2Var = this.g;
        textView.setSelected(ch2Var.d == Mode.TOGGLE && ch2Var.c);
    }
}
