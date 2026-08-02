package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import defpackage.cvw;
import defpackage.eng0;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.mxp0;
import defpackage.nwt0;
import defpackage.nxp0;
import defpackage.pgk0;
import defpackage.qgn0;
import defpackage.v5a1;
import defpackage.y4n;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class g {
    public static final LinearInterpolator z = mj2.a;
    public final SearchView a;
    public final View b;
    public final View c;
    public final ClippableRoundedCornerLayout d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final TextView j;
    public final EditText k;
    public final ImageButton l;
    public final View m;
    public final TouchObserverFrameLayout n;
    public com.google.android.material.animation.a o;
    public AnimatorSet p;
    public final com.google.android.material.motion.c q;
    public AnimatorSet r;
    public SearchBar s;
    public final Context t;
    public final nxp0 u;
    public final TimeInterpolator v;
    public final TimeInterpolator w;
    public final int x;
    public final int y;

    public g(Context context, SearchView searchView, boolean z2) {
        this.t = context;
        this.a = searchView;
        this.b = searchView.scrim;
        this.c = searchView.backgroundView;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.d = clippableRoundedCornerLayout;
        this.e = searchView.headerContainer;
        this.f = searchView.toolbarContainer;
        this.g = searchView.toolbar;
        this.h = searchView.dummyToolbar;
        this.i = searchView.searchPrefix;
        this.j = searchView.dummyTextView;
        this.k = searchView.editText;
        this.l = searchView.clearButton;
        this.m = searchView.divider;
        this.n = searchView.contentContainer;
        this.q = new com.google.android.material.motion.c(clippableRoundedCornerLayout);
        int i = eng0.motionEasingStandardAccelerateInterpolator;
        LinearInterpolator linearInterpolator = z;
        this.v = kp50.P(context, i, linearInterpolator);
        this.w = kp50.P(context, eng0.motionEasingStandardDecelerateInterpolator, linearInterpolator);
        this.x = kp50.O(context, eng0.motionDurationShort1, 100);
        this.y = kp50.O(context, eng0.motionDurationShort2, 100);
        this.u = z2 ? new qgn0(11, this) : new pgk0(17, this);
    }

    public static void a(g gVar, float f) {
        ActionMenuView b;
        gVar.l.setAlpha(f);
        gVar.m.setAlpha(f);
        gVar.n.setAlpha(f);
        if (!gVar.a.isMenuItemsAnimated() || (b = v5a1.b(gVar.g)) == null) {
            return;
        }
        b.setAlpha(f);
    }

    public static int b(g gVar, View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != gVar.a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public static int c(g gVar, View view, View view2) {
        if (view != null) {
            return gVar.k(view) - gVar.k(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = gVar.s.getPaddingStart();
        int k = gVar.k(gVar.s);
        return com.google.android.material.internal.e.i(gVar.s) ? (((gVar.s.getWidth() + k) + marginStart) - paddingStart) - gVar.a.getRight() : (k - marginStart) + paddingStart;
    }

    public static void d(g gVar, float f) {
        gVar.c.getBackground().mutate().setAlpha((int) (f * 255.0f));
    }

    public static boolean e(g gVar) {
        Menu menu;
        if (gVar.s.getMenuResId() != -1 && gVar.a.isMenuItemsAnimated() && (menu = gVar.s.getMenu()) != null) {
            for (int i = 0; i < menu.size(); i++) {
                if (menu.getItem(i).isVisible()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void f(g gVar, Toolbar toolbar) {
        ActionMenuView b = v5a1.b(toolbar);
        if (b != null) {
            for (int i = 0; i < b.getChildCount(); i++) {
                View childAt = b.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public static ValueAnimator g(g gVar, boolean z2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z2 ? 50L : 42L);
        ofFloat.setStartDelay(z2 ? 250L : 0L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z2, mj2.a));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(gVar.l));
        return ofFloat;
    }

    public final void h(AnimatorSet animatorSet) {
        ImageButton d = v5a1.d(this.g);
        if (d == null) {
            return;
        }
        Drawable k0 = cvw.k0(d.getDrawable());
        if (!this.a.isAnimatedNavigationIcon()) {
            if (k0 instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable) k0).setProgress(1.0f);
            }
            if (k0 instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable) k0).setProgress(1.0f);
                return;
            }
            return;
        }
        int i = 1;
        int i2 = 0;
        int i3 = 2;
        if (k0 instanceof DrawerArrowDrawable) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new mxp0(i2, (DrawerArrowDrawable) k0));
            animatorSet.playTogether(ofFloat);
        }
        if (k0 instanceof FadeThroughDrawable) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new mxp0(i, (FadeThroughDrawable) k0));
            animatorSet.playTogether(ofFloat2);
        }
        SearchBar searchBar = this.s;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new mxp0(i3, d));
        animatorSet.playTogether(ofFloat3);
    }

    public final void i() {
        com.google.android.material.animation.a aVar = this.o;
        if (aVar != null) {
            ArrayList arrayList = aVar.b;
            ArrayList arrayList2 = aVar.a;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList2.clear();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).end();
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList.clear();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                y4n y4nVar = (y4n) it2.next();
                if (y4nVar instanceof nwt0) {
                    nwt0 nwt0Var = (nwt0) y4nVar;
                    if (nwt0Var.u.b > 0.0d) {
                        nwt0Var.j();
                    } else {
                        nwt0Var.c();
                    }
                } else {
                    y4nVar.c();
                }
            }
            aVar.c.clear();
            aVar.d = 0;
            aVar.e = false;
            this.o = null;
        }
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.p = null;
        }
    }

    public final AnimatorSet j(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(clippableRoundedCornerLayout));
        animatorSet.playTogether(ofFloat);
        h(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z2, mj2.b));
        animatorSet.setDuration(z2 ? 350L : 300L);
        return animatorSet;
    }

    public final int k(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet l() {
        i();
        SearchBar searchBar = this.s;
        EditText editText = this.k;
        SearchView searchView = this.a;
        if (searchBar == null) {
            if (searchView.isAdjustNothingSoftInputMode()) {
                editText.clearFocus();
            }
            final AnimatorSet j = j(false);
            j.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper$4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    g.this.d.setVisibility(8);
                    if (!g.this.a.isAdjustNothingSoftInputMode()) {
                        g.this.k.clearFocus();
                    }
                    g.this.a.setTransitionState(SearchView.TransitionState.HIDDEN);
                    g gVar = g.this;
                    if (gVar.p == j) {
                        gVar.p = null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    g.this.a.setTransitionState(SearchView.TransitionState.HIDING);
                }
            });
            j.start();
            this.p = j;
            return j;
        }
        if (searchView.isAdjustNothingSoftInputMode()) {
            editText.clearFocus();
        }
        com.google.android.material.animation.a aVar = new com.google.android.material.animation.a();
        nxp0 nxp0Var = this.u;
        AnimatorSet d = nxp0Var.d(false);
        if (this.r == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            h(animatorSet);
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(false, mj2.b));
            d.playTogether(animatorSet);
        }
        aVar.a.add(d);
        Iterator it = nxp0Var.e(false).iterator();
        while (it.hasNext()) {
            aVar.b.add((nwt0) it.next());
        }
        aVar.c.add(new f(this, aVar));
        aVar.a();
        this.o = aVar;
        return d;
    }
}
