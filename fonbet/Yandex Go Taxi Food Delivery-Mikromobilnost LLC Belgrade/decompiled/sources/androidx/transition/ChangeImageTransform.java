package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] h0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator i0 = new TypeEvaluator<Matrix>() { // from class: androidx.transition.ChangeImageTransform.1
        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    };
    public static final Property j0 = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.2
        @Override // android.util.Property
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public void set(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    };

    /* renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void X(TransitionValues transitionValues, boolean z) {
        Matrix matrix;
        View view = transitionValues.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap hashMap = transitionValues.a;
            hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = AnonymousClass3.a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float max = Math.max(width / f, height / f2);
                        int round = Math.round((width - (f * max)) / 2.0f);
                        int round2 = Math.round((height - (f2 * max)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(max, max);
                        matrix.postTranslate(round, round2);
                    }
                    matrix2 = matrix;
                }
            }
            hashMap.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return h0;
    }

    @Override // androidx.transition.Transition
    public final boolean D() {
        return true;
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.a;
        Rect rect = (Rect) hashMap.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) hashMap.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) hashMap2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Property property = j0;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            Matrix matrix3 = MatrixUtils.a;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, i0, matrix3, matrix3);
        }
        if (matrix == null) {
            matrix = MatrixUtils.a;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.a;
        }
        property.set(imageView, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, new TransitionUtils.MatrixEvaluator(), matrix, matrix2);
        Listener listener = new Listener(imageView, matrix, matrix2);
        ofObject.addListener(listener);
        ofObject.addPauseListener(listener);
        a(listener);
        return ofObject;
    }

    /* loaded from: classes.dex */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final Matrix mEndMatrix;
        private final ImageView mImageView;
        private boolean mIsBeforeAnimator = true;
        private final Matrix mStartMatrix;

        public Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.mImageView = imageView;
            this.mStartMatrix = matrix;
            this.mEndMatrix = matrix2;
        }

        private void restoreMatrix() {
            Matrix matrix = (Matrix) this.mImageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(this.mImageView, matrix);
                this.mImageView.setTag(R.id.transition_image_transform, null);
            }
        }

        private void saveMatrix(Matrix matrix) {
            this.mImageView.setTag(R.id.transition_image_transform, matrix);
            ImageViewUtils.a(this.mImageView, this.mEndMatrix);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.mIsBeforeAnimator = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            saveMatrix((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            restoreMatrix();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            this.mIsBeforeAnimator = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            if (this.mIsBeforeAnimator) {
                saveMatrix(this.mStartMatrix);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            restoreMatrix();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            this.mIsBeforeAnimator = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.mIsBeforeAnimator = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
