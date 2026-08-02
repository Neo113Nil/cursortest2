package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import defpackage.ny61;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] i0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int h0 = 3;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes10.dex */
    public @interface Mode {
    }

    /* loaded from: classes10.dex */
    public static class VisibilityInfo {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public static void X(TransitionValues transitionValues) {
        int visibility = transitionValues.b.getVisibility();
        HashMap hashMap = transitionValues.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", transitionValues.b.getParent());
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VisibilityInfo Y(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.a = false;
        visibilityInfo.b = false;
        if (transitionValues != null) {
            HashMap hashMap = transitionValues.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                visibilityInfo.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                visibilityInfo.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (transitionValues2 != null) {
                    HashMap hashMap2 = transitionValues2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        visibilityInfo.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        visibilityInfo.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (transitionValues == null && transitionValues2 != null) {
                            int i = visibilityInfo.c;
                            int i2 = visibilityInfo.d;
                            if (i != i2 || visibilityInfo.e != visibilityInfo.f) {
                                if (i != i2) {
                                    if (i == 0) {
                                        visibilityInfo.b = false;
                                        visibilityInfo.a = true;
                                        return visibilityInfo;
                                    }
                                    if (i2 == 0) {
                                        visibilityInfo.b = true;
                                        visibilityInfo.a = true;
                                        return visibilityInfo;
                                    }
                                } else {
                                    if (visibilityInfo.f == null) {
                                        visibilityInfo.b = false;
                                        visibilityInfo.a = true;
                                        return visibilityInfo;
                                    }
                                    if (visibilityInfo.e == null) {
                                        visibilityInfo.b = true;
                                        visibilityInfo.a = true;
                                        return visibilityInfo;
                                    }
                                }
                            }
                        } else {
                            if (transitionValues != null && visibilityInfo.d == 0) {
                                visibilityInfo.b = true;
                                visibilityInfo.a = true;
                                return visibilityInfo;
                            }
                            if (transitionValues2 == null && visibilityInfo.c == 0) {
                                visibilityInfo.b = false;
                                visibilityInfo.a = true;
                            }
                        }
                        return visibilityInfo;
                    }
                }
                visibilityInfo.d = -1;
                visibilityInfo.f = null;
                if (transitionValues == null) {
                }
                if (transitionValues != null) {
                }
                if (transitionValues2 == null) {
                    visibilityInfo.b = false;
                    visibilityInfo.a = true;
                }
                return visibilityInfo;
            }
        }
        visibilityInfo.c = -1;
        visibilityInfo.e = null;
        if (transitionValues2 != null) {
        }
        visibilityInfo.d = -1;
        visibilityInfo.f = null;
        if (transitionValues == null) {
        }
        if (transitionValues != null) {
        }
        if (transitionValues2 == null) {
        }
        return visibilityInfo;
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return i0;
    }

    @Override // androidx.transition.Transition
    public final boolean E(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.a.containsKey("android:visibility:visibility") != transitionValues.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo Y = Y(transitionValues, transitionValues2);
        if (Y.a) {
            return Y.c == 0 || Y.d == 0;
        }
        return false;
    }

    public Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator a0(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        if ((this.h0 & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.b.getParent();
            if (Y(x(view, false), B(view, false)).a) {
                return null;
            }
        }
        return Z(viewGroup, transitionValues2.b, transitionValues, transitionValues2);
    }

    public Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator c0(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.h0 & 2) == 2 && transitionValues != null) {
            View view3 = transitionValues.b;
            View view4 = transitionValues2 != null ? transitionValues2.b : null;
            View view5 = (View) view3.getTag(R.id.save_overlay_view);
            if (view5 != null) {
                view2 = null;
                z2 = true;
            } else if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view = null;
                    z = false;
                    if (z) {
                        if (view3.getParent() == null) {
                            view2 = view;
                            z2 = false;
                            view5 = view3;
                        } else if (view3.getParent() instanceof View) {
                            View view6 = (View) view3.getParent();
                            if (Y(B(view6, true), x(view6, true)).a) {
                                int id = view6.getId();
                                if (view6.getParent() == null && id != -1) {
                                    viewGroup.getClass();
                                }
                            } else {
                                view4 = TransitionUtils.a(viewGroup, view3, view6);
                            }
                        }
                    }
                    View view7 = view;
                    view5 = view4;
                    view2 = view7;
                    z2 = false;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                View view72 = view;
                view5 = view4;
                view2 = view72;
                z2 = false;
            } else {
                if (i2 == 4 || view3 == view4) {
                    view = view4;
                    z = false;
                    view4 = null;
                    if (z) {
                    }
                    View view722 = view;
                    view5 = view4;
                    view2 = view722;
                    z2 = false;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                View view7222 = view;
                view5 = view4;
                view2 = view7222;
                z2 = false;
            }
            if (view5 != null) {
                if (!z2) {
                    int[] iArr = (int[]) transitionValues.a.get("android:visibility:screenLocation");
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view5.offsetLeftAndRight((i3 - iArr2[0]) - view5.getLeft());
                    view5.offsetTopAndBottom((i4 - iArr2[1]) - view5.getTop());
                    androidx.core.view.b.b(view5, viewGroup);
                }
                Animator b0 = b0(viewGroup, view5, transitionValues, transitionValues2);
                if (!z2) {
                    if (b0 == null) {
                        viewGroup.getOverlay().remove(view5);
                        return b0;
                    }
                    view3.setTag(R.id.save_overlay_view, view5);
                    OverlayListener overlayListener = new OverlayListener(viewGroup, view5, view3);
                    b0.addListener(overlayListener);
                    b0.addPauseListener(overlayListener);
                    y().a(overlayListener);
                }
                return b0;
            }
            if (view2 != null) {
                int visibility = view2.getVisibility();
                Property property = ViewUtils.a;
                view2.setTransitionVisibility(0);
                Animator b02 = b0(viewGroup, view2, transitionValues, transitionValues2);
                if (b02 == null) {
                    view2.setTransitionVisibility(visibility);
                    return b02;
                }
                DisappearListener disappearListener = new DisappearListener(view2, i2, true);
                b02.addListener(disappearListener);
                y().a(disappearListener);
                return b02;
            }
        }
        return null;
    }

    public final void d0(int i) {
        if ((i & (-4)) == 0) {
            this.h0 = i;
        } else {
            ny61.g("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // androidx.transition.Transition
    public void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void i(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo Y = Y(transitionValues, transitionValues2);
        if (!Y.a) {
            return null;
        }
        if (Y.e == null && Y.f == null) {
            return null;
        }
        boolean z = Y.b;
        int i = Y.c;
        int i2 = Y.d;
        return z ? a0(viewGroup, transitionValues, i, transitionValues2, i2) : c0(viewGroup, transitionValues, i, transitionValues2, i2);
    }

    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        boolean mCanceled = false;
        private final int mFinalVisibility;
        private boolean mLayoutSuppressed;
        private final ViewGroup mParent;
        private final boolean mSuppressLayout;
        private final View mView;

        public DisappearListener(View view, int i, boolean z) {
            this.mView = view;
            this.mFinalVisibility = i;
            this.mParent = (ViewGroup) view.getParent();
            this.mSuppressLayout = z;
            suppressLayout(true);
        }

        private void hideViewWhenNotCanceled() {
            if (!this.mCanceled) {
                View view = this.mView;
                int i = this.mFinalVisibility;
                Property property = ViewUtils.a;
                view.setTransitionVisibility(i);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            suppressLayout(false);
        }

        private void suppressLayout(boolean z) {
            ViewGroup viewGroup;
            if (!this.mSuppressLayout || this.mLayoutSuppressed == z || (viewGroup = this.mParent) == null) {
                return;
            }
            this.mLayoutSuppressed = z;
            ViewGroupUtils.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            hideViewWhenNotCanceled();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.mView;
                Property property = ViewUtils.a;
                view.setTransitionVisibility(0);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.K(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            suppressLayout(false);
            if (this.mCanceled) {
                return;
            }
            View view = this.mView;
            int i = this.mFinalVisibility;
            Property property = ViewUtils.a;
            view.setTransitionVisibility(i);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            suppressLayout(true);
            if (this.mCanceled) {
                return;
            }
            View view = this.mView;
            Property property = ViewUtils.a;
            view.setTransitionVisibility(0);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hideViewWhenNotCanceled();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mHasOverlay = true;
        private final ViewGroup mOverlayHost;
        private final View mOverlayView;
        private final View mStartView;

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.mOverlayHost = viewGroup;
            this.mOverlayView = view;
            this.mStartView = view2;
        }

        private void removeFromOverlay() {
            this.mStartView.setTag(R.id.save_overlay_view, null);
            this.mOverlayHost.getOverlay().remove(this.mOverlayView);
            this.mHasOverlay = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            removeFromOverlay();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.mOverlayHost.getOverlay().remove(this.mOverlayView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.mOverlayView.getParent() != null) {
                Visibility.this.cancel();
            } else {
                androidx.core.view.b.b(this.mOverlayView, this.mOverlayHost);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                this.mStartView.setTag(R.id.save_overlay_view, this.mOverlayView);
                androidx.core.view.b.b(this.mOverlayView, this.mOverlayHost);
                this.mHasOverlay = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            if (this.mHasOverlay) {
                removeFromOverlay();
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.K(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            removeFromOverlay();
        }
    }
}
