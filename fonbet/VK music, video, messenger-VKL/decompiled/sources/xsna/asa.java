package xsna;

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
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.enp0;
import xsna.vlp0;
import xsna.vn10;

/* compiled from: ChangeImageTransform.java */
/* loaded from: classes12.dex */
public final class asa extends vlp0 {
    public static final String[] b = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final a c = new a();
    public static final b d = new b(Matrix.class, "animatedTransform");

    /* compiled from: ChangeImageTransform.java */
    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* compiled from: ChangeImageTransform.java */
    public class b extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            tmw.a(imageView, matrix);
        }
    }

    /* compiled from: ChangeImageTransform.java */
    public static /* synthetic */ class c {
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

    /* compiled from: ChangeImageTransform.java */
    public static class d extends AnimatorListenerAdapter implements vlp0.i {
        public final ImageView b;
        public final Matrix c;
        public final Matrix d;
        public boolean e = true;

        public d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.b = imageView;
            this.c = matrix;
            this.d = matrix2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            this.e = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.b;
            imageView.setTag(R.id.transition_image_transform, matrix);
            tmw.a(imageView, this.d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.b;
            Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                tmw.a(imageView, matrix);
                imageView.setTag(R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            this.e = false;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            if (this.e) {
                ImageView imageView = this.b;
                imageView.setTag(R.id.transition_image_transform, this.c);
                tmw.a(imageView, this.d);
            }
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            ImageView imageView = this.b;
            Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                tmw.a(imageView, matrix);
                imageView.setTag(R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.e = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.e = false;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
        }
    }

    public static void a(gnp0 gnp0Var, boolean z) {
        Matrix matrix;
        View view = gnp0Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap hashMap = gnp0Var.a;
            hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = c.a[imageView.getScaleType().ordinal()];
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

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        a(gnp0Var, false);
    }

    @Override // xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        a(gnp0Var, true);
    }

    @Override // xsna.vlp0
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        HashMap hashMap = gnp0Var.a;
        if (gnp0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = gnp0Var2.a;
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
        ImageView imageView = (ImageView) gnp0Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        b bVar = d;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            vn10.a aVar = vn10.a;
            return ObjectAnimator.ofObject(imageView, bVar, c, aVar, aVar);
        }
        if (matrix == null) {
            matrix = vn10.a;
        }
        if (matrix2 == null) {
            matrix2 = vn10.a;
        }
        bVar.getClass();
        tmw.a(imageView, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, bVar, new enp0.a(), matrix, matrix2);
        d dVar = new d(imageView, matrix, matrix2);
        ofObject.addListener(dVar);
        ofObject.addPauseListener(dVar);
        addListener(dVar);
        return ofObject;
    }

    @Override // xsna.vlp0
    public final String[] getTransitionProperties() {
        return b;
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        return true;
    }
}
