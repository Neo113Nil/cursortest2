package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final String[] h0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property i0;
    public static final Property j0;
    public static final Property k0;
    public static final Property l0;
    public static final Property m0;

    /* loaded from: classes10.dex */
    public static class SuppressLayoutListener extends TransitionListenerAdapter {
        public boolean a = false;
        public final ViewGroup b;

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.b.suppressLayout(false);
            this.a = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            if (!this.a) {
                this.b.suppressLayout(false);
            }
            transition.K(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            this.b.suppressLayout(false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            this.b.suppressLayout(true);
        }
    }

    /* loaded from: classes10.dex */
    public static class ViewBounds {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public ViewBounds(View view) {
            this.e = view;
        }

        public final void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.d = round;
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                int i2 = this.a;
                int i3 = this.b;
                int i4 = this.c;
                Property property = ViewUtils.a;
                this.e.setLeftTopRightBottom(i2, i3, i4, round);
                this.f = 0;
                this.g = 0;
            }
        }

        public final void b(PointF pointF) {
            this.a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.b = round;
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                int i2 = this.a;
                int i3 = this.c;
                int i4 = this.d;
                Property property = ViewUtils.a;
                this.e.setLeftTopRightBottom(i2, round, i3, i4);
                this.f = 0;
                this.g = 0;
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        i0 = new Property<ViewBounds, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.1
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.b(pointF);
            }
        };
        String str2 = "bottomRight";
        j0 = new Property<ViewBounds, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.a(pointF);
            }
        };
        k0 = new Property<View, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                int left = view.getLeft();
                int top = view.getTop();
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                Property property = ViewUtils.a;
                view.setLeftTopRightBottom(left, top, round, round2);
            }

            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }
        };
        l0 = new Property<View, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                int right = view.getRight();
                int bottom = view.getBottom();
                Property property = ViewUtils.a;
                view.setLeftTopRightBottom(round, round2, right, bottom);
            }

            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }
        };
        m0 = new Property<View, PointF>(cls, "position") { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                Property property = ViewUtils.a;
                view.setLeftTopRightBottom(round, round2, width, height);
            }

            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }
        };
        new RectEvaluator();
    }

    public static void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", transitionValues.b.getParent());
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return h0;
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        ChangeBounds changeBounds;
        ObjectAnimator a;
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        Property property = ViewUtils.a;
        view.setLeftTopRightBottom(i2, i4, i6, i8);
        if (i14 != 2) {
            changeBounds = this;
            a = (i2 == i3 && i4 == i5) ? ObjectAnimatorUtils.a(view, k0, changeBounds.Z.a(i6, i8, i7, i9)) : ObjectAnimatorUtils.a(view, l0, changeBounds.Z.a(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            changeBounds = this;
            a = ObjectAnimatorUtils.a(view, m0, changeBounds.Z.a(i2, i4, i3, i5));
        } else {
            changeBounds = this;
            ViewBounds viewBounds = new ViewBounds(view);
            ObjectAnimator a2 = ObjectAnimatorUtils.a(viewBounds, i0, changeBounds.Z.a(i2, i4, i3, i5));
            ObjectAnimator a3 = ObjectAnimatorUtils.a(viewBounds, j0, changeBounds.Z.a(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                private final ViewBounds mViewBounds;
                final /* synthetic */ ViewBounds val$viewBounds;

                {
                    this.val$viewBounds = viewBounds;
                    this.mViewBounds = viewBounds;
                }
            });
            a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.a(viewGroup4, true);
            changeBounds.y().a(new SuppressLayoutListener(viewGroup4));
        }
        return a;
    }

    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int mEndBottom;
        private final Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final View mView;

        public ClipListener(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.mView = view;
            this.mStartClip = rect;
            this.mStartClipIsNull = z;
            this.mEndClip = rect2;
            this.mEndClipIsNull = z2;
            this.mStartLeft = i;
            this.mStartTop = i2;
            this.mStartRight = i3;
            this.mStartBottom = i4;
            this.mEndLeft = i5;
            this.mEndTop = i6;
            this.mEndRight = i7;
            this.mEndBottom = i8;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.mIsCanceled) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.mStartClipIsNull) {
                    rect = this.mStartClip;
                }
            } else if (!this.mEndClipIsNull) {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
            View view = this.mView;
            if (z) {
                int i = this.mStartLeft;
                int i2 = this.mStartTop;
                int i3 = this.mStartRight;
                int i4 = this.mStartBottom;
                Property property = ViewUtils.a;
                view.setLeftTopRightBottom(i, i2, i3, i4);
                return;
            }
            int i5 = this.mEndLeft;
            int i6 = this.mEndTop;
            int i7 = this.mEndRight;
            int i8 = this.mEndBottom;
            Property property2 = ViewUtils.a;
            view.setLeftTopRightBottom(i5, i6, i7, i8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            int max = Math.max(this.mStartRight - this.mStartLeft, this.mEndRight - this.mEndLeft);
            int max2 = Math.max(this.mStartBottom - this.mStartTop, this.mEndBottom - this.mEndTop);
            int i = z ? this.mEndLeft : this.mStartLeft;
            int i2 = z ? this.mEndTop : this.mStartTop;
            Property property = ViewUtils.a;
            this.mView.setLeftTopRightBottom(i, i2, max + i, max2 + i2);
            this.mView.setClipBounds(z ? this.mEndClip : this.mStartClip);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.mIsCanceled = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.mView.setTag(R.id.transition_clip, this.mView.getClipBounds());
            this.mView.setClipBounds(this.mEndClipIsNull ? null : this.mEndClip);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            Rect rect = (Rect) this.mView.getTag(R.id.transition_clip);
            this.mView.setTag(R.id.transition_clip, null);
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }
    }
}
