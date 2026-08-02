package com.ybsdk.core.utils.ext.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.NoAutoScrollForFocusedView;
import defpackage.bx60;
import defpackage.ff7;
import defpackage.h8;
import defpackage.hh31;
import defpackage.ip2;
import defpackage.ke31;
import defpackage.qq31;
import defpackage.rje;
import defpackage.sls;
import defpackage.tls;
import defpackage.w29;
import defpackage.x4c;
import defpackage.yln;
import defpackage.yq31;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.e;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void A(View view) {
        view.setVisibility(0);
    }

    public static final kotlinx.coroutines.flow.b B(EditText editText) {
        return e.g(new ViewExtensionsKt$textFlow$1(editText, null));
    }

    public static void a(LinearLayout linearLayout, sls slsVar) {
        if (linearLayout.getVisibility() == 0) {
            b(linearLayout, false, 300L, 8, 0L, new hh31(5, slsVar, linearLayout));
        } else {
            slsVar.invoke();
            c(linearLayout, true, 300L, 0, 0L, null, 28);
        }
    }

    public static final ViewPropertyAnimator b(final View view, final boolean z, long j, final int i, long j2, final sls slsVar) {
        if (view.getVisibility() != 0 && view.getVisibility() != i) {
            view.setVisibility(i);
            return null;
        }
        if ((z && view.getVisibility() == 0) || (!z && view.getVisibility() == i)) {
            return null;
        }
        if (z && view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
        }
        ViewPropertyAnimator startDelay = view.animate().setDuration(j).alpha(z ? 1.0f : 0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.ybsdk.core.utils.ext.view.ViewExtensionsKt$animateVisibility$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                view.setVisibility(z ? 0 : i);
                sls slsVar2 = slsVar;
                if (slsVar2 != null) {
                    slsVar2.invoke();
                }
            }
        }).setStartDelay(j2);
        startDelay.start();
        return startDelay;
    }

    public static /* synthetic */ ViewPropertyAnimator c(View view, boolean z, long j, int i, long j2, sls slsVar, int i2) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            i = 8;
        }
        return b(view, z, j3, i, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? null : slsVar);
    }

    public static final void d(final float f, final sls slsVar, final sls slsVar2, final View view, final boolean z) {
        new DetachingViewListener(view, new tls() { // from class: sq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final View view2 = view;
                boolean z2 = view2.getVisibility() == 0;
                final boolean z3 = z;
                zy11 zy11Var = zy11.a;
                if (z3 == z2 && view2.getAlpha() != 0.0f) {
                    return zy11Var;
                }
                if (z3 && view2.getVisibility() != 0) {
                    view2.setAlpha(0.0f);
                    view2.setVisibility(0);
                }
                float f2 = z3 ? 1.0f : 0.0f;
                float f3 = z3 ? 1.0f : f;
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                final sls slsVar3 = slsVar;
                final sls slsVar4 = slsVar2;
                view2.animate().setDuration(150L).alpha(f2).setListener(new AnimatorListenerAdapter() { // from class: com.ybsdk.core.utils.ext.view.ViewExtensionsKt$animateVisibilityWithScale$1$animationListener$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animation) {
                        ref$BooleanRef.element = true;
                        super.onAnimationCancel(animation);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        animation.removeListener(this);
                        if (ref$BooleanRef.element) {
                            return;
                        }
                        view2.setVisibility(z3 ? 0 : 8);
                        sls slsVar5 = slsVar4;
                        if (slsVar5 != null) {
                            slsVar5.invoke();
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animation) {
                        sls slsVar5 = sls.this;
                        if (slsVar5 != null) {
                            slsVar5.invoke();
                        }
                    }
                }).scaleX(f3).scaleY(f3).start();
                return zy11Var;
            }
        }, new w29(view, 12)).init();
    }

    public static final Rect e(LoadableInput loadableInput, NoAutoScrollForFocusedView noAutoScrollForFocusedView) {
        Rect rect = new Rect();
        loadableInput.getDrawingRect(rect);
        noAutoScrollForFocusedView.offsetDescendantRectToMyCoords(loadableInput, rect);
        return rect;
    }

    public static final boolean f(View view) {
        if (!(view instanceof AppBarLayout)) {
            return view.canScrollVertically(-1);
        }
        AppBarLayout appBarLayout = (AppBarLayout) view;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.a behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        AppBarLayout.Behavior behavior2 = behavior instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) behavior : null;
        Integer valueOf = behavior2 != null ? Integer.valueOf(behavior2.u()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams3 = appBarLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        Object parent = appBarLayout.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        return appBarLayout.getHeight() - ((appBarLayout.getBottom() - i) - (view2 != null ? view2.getPaddingTop() : 0)) != 0;
    }

    public static final int g(int i, View view) {
        return rje.a(view.getContext(), i);
    }

    public static final int h(int i, View view) {
        return rje.d(i, view.getContext());
    }

    public static final Rect i(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static final Point j(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final kotlinx.coroutines.flow.b k(View view) {
        return e.g(new ViewExtensionsKt$globalLayouts$1(view, null));
    }

    public static final void l(View view) {
        view.setVisibility(8);
    }

    public static final void m(View view) {
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(32768);
    }

    public static final void n(int i, View view) {
        m(view);
        androidx.core.view.b.p(view, new yq31(view, i));
    }

    public static final void o(View view, final ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener) {
        final int i = 0;
        final int i2 = 1;
        new DetachingViewListener(view, new tls() { // from class: rq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener2 = onGlobalFocusChangeListener;
                View view2 = (View) obj;
                switch (i3) {
                    case 0:
                        view2.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener2);
                        break;
                    default:
                        view2.getViewTreeObserver().removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener2);
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: rq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener2 = onGlobalFocusChangeListener;
                View view2 = (View) obj;
                switch (i3) {
                    case 0:
                        view2.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener2);
                        break;
                    default:
                        view2.getViewTreeObserver().removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener2);
                        break;
                }
                return zy11Var;
            }
        }).init();
    }

    public static final void p(View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        final int i = 0;
        final int i2 = 1;
        new DetachingViewListener(view, new tls() { // from class: pq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                View view2 = (View) obj;
                switch (i3) {
                    case 0:
                        view2.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener2);
                        break;
                    default:
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: pq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                View view2 = (View) obj;
                switch (i3) {
                    case 0:
                        view2.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener2);
                        break;
                    default:
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                        break;
                }
                return zy11Var;
            }
        }).init();
    }

    public static final void q(RecyclerView recyclerView, final ff7 ff7Var) {
        final int i = 0;
        final int i2 = 1;
        new DetachingViewListener(recyclerView, new tls() { // from class: uq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                ff7 ff7Var2 = ff7Var;
                RecyclerView recyclerView2 = (RecyclerView) obj;
                switch (i3) {
                    case 0:
                        recyclerView2.addOnItemTouchListener(ff7Var2);
                        break;
                    default:
                        recyclerView2.removeOnItemTouchListener(ff7Var2);
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: uq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                ff7 ff7Var2 = ff7Var;
                RecyclerView recyclerView2 = (RecyclerView) obj;
                switch (i3) {
                    case 0:
                        recyclerView2.addOnItemTouchListener(ff7Var2);
                        break;
                    default:
                        recyclerView2.removeOnItemTouchListener(ff7Var2);
                        break;
                }
                return zy11Var;
            }
        }).init();
    }

    public static final void r(RecyclerView recyclerView, final yln ylnVar) {
        final int i = 0;
        final int i2 = 1;
        new DetachingViewListener(recyclerView, new tls() { // from class: wq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                yln ylnVar2 = ylnVar;
                View view = (View) obj;
                switch (i3) {
                    case 0:
                        view.addOnLayoutChangeListener(ylnVar2);
                        break;
                    default:
                        view.removeOnLayoutChangeListener(ylnVar2);
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: wq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                yln ylnVar2 = ylnVar;
                View view = (View) obj;
                switch (i3) {
                    case 0:
                        view.addOnLayoutChangeListener(ylnVar2);
                        break;
                    default:
                        view.removeOnLayoutChangeListener(ylnVar2);
                        break;
                }
                return zy11Var;
            }
        }).init();
    }

    public static final void s(AppBarLayout appBarLayout, final ip2 ip2Var) {
        final int i = 0;
        final int i2 = 1;
        new DetachingViewListener(appBarLayout, new tls() { // from class: oq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                ip2 ip2Var2 = ip2Var;
                AppBarLayout appBarLayout2 = (AppBarLayout) obj;
                switch (i3) {
                    case 0:
                        appBarLayout2.addOnOffsetChangedListener(ip2Var2);
                        break;
                    default:
                        appBarLayout2.removeOnOffsetChangedListener(ip2Var2);
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: oq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                ip2 ip2Var2 = ip2Var;
                AppBarLayout appBarLayout2 = (AppBarLayout) obj;
                switch (i3) {
                    case 0:
                        appBarLayout2.addOnOffsetChangedListener(ip2Var2);
                        break;
                    default:
                        appBarLayout2.removeOnOffsetChangedListener(ip2Var2);
                        break;
                }
                return zy11Var;
            }
        }).init();
    }

    public static final void t(RecyclerView recyclerView, final RecyclerView.g gVar) {
        final int i = 0;
        final int i2 = 1;
        new DetachingViewListener(recyclerView, new tls() { // from class: vq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                RecyclerView.g gVar2 = gVar;
                RecyclerView recyclerView2 = (RecyclerView) obj;
                switch (i3) {
                    case 0:
                        recyclerView2.addOnScrollListener(gVar2);
                        break;
                    default:
                        recyclerView2.removeOnScrollListener(gVar2);
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: vq31
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                RecyclerView.g gVar2 = gVar;
                RecyclerView recyclerView2 = (RecyclerView) obj;
                switch (i3) {
                    case 0:
                        recyclerView2.addOnScrollListener(gVar2);
                        break;
                    default:
                        recyclerView2.removeOnScrollListener(gVar2);
                        break;
                }
                return zy11Var;
            }
        }).init();
    }

    public static final Fragment u(View view, boolean z) {
        try {
            Fragment G = FragmentManager.G(view);
            if (G != null) {
                return G;
            }
            throw new IllegalStateException("View " + view + " does not have a Fragment set");
        } catch (RuntimeException e) {
            if (z) {
                x4c.g("Cannot find Fragment for view", e, null, null, 12);
            }
            return null;
        }
    }

    public static final float v(TypedArray typedArray, int i, float f) {
        try {
            return typedArray.getDimension(i, f);
        } catch (Throwable th) {
            x4c.g("Type error for getDimension", th, null, null, 12);
            return f;
        }
    }

    public static final void w(View view, bx60 bx60Var) {
        new DetachingViewListener(view, new qq31(0, bx60Var), new ke31(16)).init();
    }

    public static final void x(int i, View view) {
        view.setBackgroundColor(rje.a(view.getContext(), i));
    }

    public static final void y(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            while (h8Var.hasNext()) {
                y((View) h8Var.next(), z);
            }
        }
    }

    public static void z(ImageView imageView, int i) {
        imageView.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }
}
