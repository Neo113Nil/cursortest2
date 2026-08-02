package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.a;
import defpackage.d5b0;
import defpackage.i9h0;
import defpackage.jvg0;
import defpackage.nyc0;
import defpackage.yln;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a {
    public boolean A;
    public boolean B;
    public final PlayerControlView a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final nyc0 s;
    public final nyc0 t;
    public final nyc0 u = new nyc0(this, 4);
    public final nyc0 v = new nyc0(this, 5);
    public final nyc0 w = new nyc0(this, 6);
    public final yln x = new yln(12, this);
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    public a(final PlayerControlView playerControlView) {
        this.a = playerControlView;
        final int i = 0;
        this.s = new nyc0(this, i);
        final int i2 = 3;
        this.t = new nyc0(this, i2);
        final int i3 = 1;
        this.b = playerControlView.findViewById(i9h0.exo_controls_background);
        this.c = (ViewGroup) playerControlView.findViewById(i9h0.exo_center_controls);
        this.e = (ViewGroup) playerControlView.findViewById(i9h0.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(i9h0.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) playerControlView.findViewById(i9h0.exo_time);
        View findViewById = playerControlView.findViewById(i9h0.exo_progress);
        this.j = findViewById;
        this.f = (ViewGroup) playerControlView.findViewById(i9h0.exo_basic_controls);
        this.g = (ViewGroup) playerControlView.findViewById(i9h0.exo_extra_controls);
        this.h = (ViewGroup) playerControlView.findViewById(i9h0.exo_extra_controls_scroll_view);
        View findViewById2 = playerControlView.findViewById(i9h0.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = playerControlView.findViewById(i9h0.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            int i4 = 7;
            findViewById2.setOnClickListener(new d5b0(i4, this));
            findViewById3.setOnClickListener(new d5b0(i4, this));
        }
        final int i5 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oyc0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i2;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = aVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = aVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = aVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = aVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = aVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = aVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view = a.this.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup2 = a.this.c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = a.this.e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a aVar = a.this;
                View view = aVar.j;
                if (!(view instanceof DefaultTimeBar) || aVar.A) {
                    return;
                }
                ((DefaultTimeBar) view).hideScrubber(250L);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oyc0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = aVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = aVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = aVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = aVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = aVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = aVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                View view = a.this.b;
                if (view != null) {
                    view.setVisibility(0);
                }
                ViewGroup viewGroup2 = a.this.c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                a aVar = a.this;
                ViewGroup viewGroup3 = aVar.e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(aVar.A ? 0 : 4);
                }
                a aVar2 = a.this;
                View view2 = aVar2.j;
                if (!(view2 instanceof DefaultTimeBar) || aVar2.A) {
                    return;
                }
                ((DefaultTimeBar) view2).showScrubber(250L);
            }
        });
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(jvg0.exo_styled_bottom_bar_height) - resources.getDimension(jvg0.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(jvg0.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.q(1);
                a aVar = a.this;
                if (aVar.B) {
                    playerControlView.post(aVar.s);
                    a.this.B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.q(3);
            }
        });
        animatorSet.play(ofFloat).with(h(0.0f, dimension, findViewById)).with(h(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.q(2);
                a aVar = a.this;
                if (aVar.B) {
                    playerControlView.post(aVar.s);
                    a.this.B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.q(3);
            }
        });
        animatorSet2.play(h(dimension, dimension2, findViewById)).with(h(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.q(2);
                a aVar = a.this;
                if (aVar.B) {
                    playerControlView.post(aVar.s);
                    a.this.B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.q(3);
            }
        });
        animatorSet3.play(ofFloat).with(h(0.0f, dimension2, findViewById)).with(h(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.q(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.q(4);
            }
        });
        animatorSet4.play(ofFloat2).with(h(dimension, 0.0f, findViewById)).with(h(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.q(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.q(4);
            }
        });
        animatorSet5.play(ofFloat2).with(h(dimension2, 0.0f, findViewById)).with(h(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oyc0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i3;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = aVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = aVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = aVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = aVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = aVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = aVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = a.this.f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ViewGroup viewGroup2 = a.this.h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                    a.this.h.setTranslationX(r3.getWidth());
                    ViewGroup viewGroup3 = a.this.h;
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                }
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oyc0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = aVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = aVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = aVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = aVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = aVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = aVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = a.this.h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ViewGroup viewGroup2 = a.this.f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            }
        });
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator h(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean r(View view) {
        int id = view.getId();
        return id == i9h0.exo_bottom_bar || id == i9h0.exo_prev || id == i9h0.exo_next || id == i9h0.exo_rew || id == i9h0.exo_rew_with_amount || id == i9h0.exo_ffwd || id == i9h0.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.y.contains(view);
    }

    public final void d() {
        int i = this.z;
        if (i == 3 || i == 2) {
            return;
        }
        m();
        if (!this.C) {
            q(2);
        } else if (this.z == 1) {
            this.m.start();
        } else {
            this.n.start();
        }
    }

    public final void e() {
        int i = this.z;
        if (i == 3 || i == 2) {
            return;
        }
        m();
        q(2);
    }

    public final boolean f() {
        return this.C;
    }

    public final boolean g() {
        return this.z == 0 && this.a.isVisible();
    }

    public final void i() {
        this.a.addOnLayoutChangeListener(this.x);
    }

    public final void j() {
        this.a.removeOnLayoutChangeListener(this.x);
    }

    public final void k(int i, int i2, int i3, int i4) {
        View view = this.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void l(long j, Runnable runnable) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void m() {
        nyc0 nyc0Var = this.w;
        PlayerControlView playerControlView = this.a;
        playerControlView.removeCallbacks(nyc0Var);
        playerControlView.removeCallbacks(this.t);
        playerControlView.removeCallbacks(this.v);
        playerControlView.removeCallbacks(this.u);
    }

    public final void n() {
        if (this.z == 3) {
            return;
        }
        m();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                l(showTimeoutMs, this.w);
            } else if (this.z == 1) {
                l(2000L, this.u);
            } else {
                l(showTimeoutMs, this.v);
            }
        }
    }

    public final void o(boolean z) {
        this.C = z;
    }

    public final void p(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && r(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void q(int i) {
        int i2 = this.z;
        this.z = i;
        PlayerControlView playerControlView = this.a;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            playerControlView.notifyOnVisibilityChange();
        }
    }

    public final void s() {
        PlayerControlView playerControlView = this.a;
        if (!playerControlView.isVisible()) {
            playerControlView.setVisibility(0);
            playerControlView.updateAll();
            playerControlView.requestPlayPauseFocus();
        }
        t();
    }

    public final void t() {
        if (!this.C) {
            q(0);
            n();
            return;
        }
        int i = this.z;
        if (i == 1) {
            this.o.start();
        } else if (i == 2) {
            this.p.start();
        } else if (i == 3) {
            this.B = true;
        } else if (i == 4) {
            return;
        }
        n();
    }
}
