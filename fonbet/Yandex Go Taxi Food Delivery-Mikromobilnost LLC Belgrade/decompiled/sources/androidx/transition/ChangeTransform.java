package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class ChangeTransform extends Transition {
    public static final String[] k0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final Property l0 = new Property<PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.1
        @Override // android.util.Property
        public void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            System.arraycopy(fArr, 0, pathAnimatorMatrix.c, 0, fArr.length);
            pathAnimatorMatrix.a();
        }

        @Override // android.util.Property
        public float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }
    };
    public static final Property m0 = new Property<PathAnimatorMatrix, PointF>(PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        @Override // android.util.Property
        public void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            pathAnimatorMatrix.getClass();
            pathAnimatorMatrix.d = pointF.x;
            pathAnimatorMatrix.e = pointF.y;
            pathAnimatorMatrix.a();
        }

        @Override // android.util.Property
        public PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }
    };
    public static final boolean n0 = true;
    public final boolean h0 = true;
    public final boolean i0 = true;
    public final Matrix j0 = new Matrix();

    public static class GhostListener extends TransitionListenerAdapter {
        public View a;
        public GhostViewPort b;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.K(this);
            View view = this.a;
            GhostViewPort.removeGhost(view);
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            this.b.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            this.b.setVisibility(0);
        }
    }

    public static class Listener extends AnimatorListenerAdapter {
        private final Matrix mEndMatrix;
        private final boolean mHandleParentChange;
        private boolean mIsCanceled;
        private final PathAnimatorMatrix mPathAnimatorMatrix;
        private final Matrix mTempMatrix = new Matrix();
        private final Transforms mTransforms;
        private final boolean mUseOverlay;
        private final View mView;

        public Listener(View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix, Matrix matrix, boolean z, boolean z2) {
            this.mHandleParentChange = z;
            this.mUseOverlay = z2;
            this.mView = view;
            this.mTransforms = transforms;
            this.mPathAnimatorMatrix = pathAnimatorMatrix;
            this.mEndMatrix = matrix;
        }

        private void setCurrentMatrix(Matrix matrix) {
            this.mTempMatrix.set(matrix);
            this.mView.setTag(R.id.transition_transform, this.mTempMatrix);
            Transforms transforms = this.mTransforms;
            View view = this.mView;
            float f = transforms.a;
            float f2 = transforms.b;
            float f3 = transforms.c;
            float f4 = transforms.d;
            float f5 = transforms.e;
            float f6 = transforms.f;
            float f7 = transforms.g;
            float f8 = transforms.h;
            String[] strArr = ChangeTransform.k0;
            view.setTranslationX(f);
            view.setTranslationY(f2);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.q(view, f3);
            view.setScaleX(f4);
            view.setScaleY(f5);
            view.setRotationX(f6);
            view.setRotationY(f7);
            view.setRotation(f8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mIsCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.mIsCanceled) {
                if (this.mHandleParentChange && this.mUseOverlay) {
                    setCurrentMatrix(this.mEndMatrix);
                } else {
                    this.mView.setTag(R.id.transition_transform, null);
                    this.mView.setTag(R.id.parent_matrix, null);
                }
            }
            View view = this.mView;
            Property property = ViewUtils.a;
            view.setAnimationMatrix(null);
            Transforms transforms = this.mTransforms;
            View view2 = this.mView;
            float f = transforms.a;
            float f2 = transforms.b;
            float f3 = transforms.c;
            float f4 = transforms.d;
            float f5 = transforms.e;
            float f6 = transforms.f;
            float f7 = transforms.g;
            float f8 = transforms.h;
            String[] strArr = ChangeTransform.k0;
            view2.setTranslationX(f);
            view2.setTranslationY(f2);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.q(view2, f3);
            view2.setScaleX(f4);
            view2.setScaleY(f5);
            view2.setRotationX(f6);
            view2.setRotationY(f7);
            view2.setRotation(f8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            setCurrentMatrix(this.mPathAnimatorMatrix.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            View view = this.mView;
            String[] strArr = ChangeTransform.k0;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.q(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
        }
    }

    public static class PathAnimatorMatrix {
        public final Matrix a = new Matrix();
        public final View b;
        public final float[] c;
        public float d;
        public float e;

        public PathAnimatorMatrix(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            a();
        }

        public final void a() {
            float f = this.d;
            float[] fArr = this.c;
            fArr[2] = f;
            fArr[5] = this.e;
            Matrix matrix = this.a;
            matrix.setValues(fArr);
            Property property = ViewUtils.a;
            this.b.setAnimationMatrix(matrix);
        }
    }

    public static class Transforms {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public Transforms(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            this.c = ViewCompat$Api21Impl.h(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            return transforms.a == this.a && transforms.b == this.b && transforms.c == this.c && transforms.d == this.d && transforms.e == this.e && transforms.f == this.f && transforms.g == this.g && transforms.h == this.h;
        }

        public final int hashCode() {
            float f = this.a;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return floatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return k0;
    }

    public final void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        if (view.getVisibility() == 8) {
            return;
        }
        hashMap.put("android:changeTransform:parent", view.getParent());
        hashMap.put("android:changeTransform:transforms", new Transforms(view));
        Matrix matrix = view.getMatrix();
        hashMap.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.i0) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            Property property = ViewUtils.a;
            viewGroup.transformMatrixToGlobal(matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            hashMap.put("android:changeTransform:parentMatrix", matrix2);
            hashMap.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            hashMap.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues);
        if (n0) {
            return;
        }
        ((ViewGroup) transitionValues.b.getParent()).startViewTransition(transitionValues.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        boolean z2;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Matrix matrix4;
        ObjectAnimator ofPropertyValuesHolder;
        float f;
        float f2;
        boolean z3;
        ChangeTransform changeTransform = this;
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.a;
        if (!hashMap.containsKey("android:changeTransform:parent") || !hashMap2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeTransform:parent");
        if (changeTransform.i0) {
            z = true;
            if (changeTransform.F(viewGroup2)) {
            }
            z2 = z;
            matrix = (Matrix) hashMap.get("android:changeTransform:intermediateMatrix");
            if (matrix != null) {
                hashMap.put("android:changeTransform:matrix", matrix);
            }
            matrix2 = (Matrix) hashMap.get("android:changeTransform:intermediateParentMatrix");
            if (matrix2 != null) {
                hashMap.put("android:changeTransform:parentMatrix", matrix2);
            }
            if (z2) {
                Matrix matrix5 = (Matrix) hashMap2.get("android:changeTransform:parentMatrix");
                transitionValues2.b.setTag(R.id.parent_matrix, matrix5);
                Matrix matrix6 = changeTransform.j0;
                matrix6.reset();
                matrix5.invert(matrix6);
                Matrix matrix7 = (Matrix) hashMap.get("android:changeTransform:matrix");
                if (matrix7 == null) {
                    matrix7 = new Matrix();
                    hashMap.put("android:changeTransform:matrix", matrix7);
                }
                matrix7.postConcat((Matrix) hashMap.get("android:changeTransform:parentMatrix"));
                matrix7.postConcat(matrix6);
            }
            matrix3 = (Matrix) hashMap.get("android:changeTransform:matrix");
            matrix4 = (Matrix) hashMap2.get("android:changeTransform:matrix");
            if (matrix3 == null) {
                matrix3 = MatrixUtils.a;
            }
            if (matrix4 == null) {
                matrix4 = MatrixUtils.a;
            }
            if (matrix3.equals(matrix4)) {
                Transforms transforms = (Transforms) hashMap2.get("android:changeTransform:transforms");
                View view = transitionValues2.b;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                ViewCompat$Api21Impl.q(view, 0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setRotationX(0.0f);
                view.setRotationY(0.0f);
                view.setRotation(0.0f);
                float[] fArr = new float[9];
                matrix3.getValues(fArr);
                float[] fArr2 = new float[9];
                matrix4.getValues(fArr2);
                PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
                Matrix matrix8 = matrix4;
                ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(l0, new FloatArrayEvaluator(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(m0, (TypeConverter) null, changeTransform.Z.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
                f = 1.0f;
                f2 = 0.0f;
                Listener listener = new Listener(view, transforms, pathAnimatorMatrix, matrix8, z2, changeTransform.h0);
                ofPropertyValuesHolder.addListener(listener);
                ofPropertyValuesHolder.addPauseListener(listener);
            } else {
                f = 1.0f;
                f2 = 0.0f;
                ofPropertyValuesHolder = null;
            }
            z3 = n0;
            if (!z2 && ofPropertyValuesHolder != null && changeTransform.h0) {
                View view2 = transitionValues2.b;
                Matrix matrix9 = new Matrix((Matrix) hashMap2.get("android:changeTransform:parentMatrix"));
                Property property = ViewUtils.a;
                viewGroup.transformMatrixToLocal(matrix9);
                GhostViewPort addGhost = GhostViewPort.addGhost(view2, viewGroup, matrix9);
                if (addGhost != null) {
                    addGhost.reserveEndViewTransition((ViewGroup) hashMap.get("android:changeTransform:parent"), transitionValues.b);
                    Transition transition = changeTransform;
                    while (true) {
                        TransitionSet transitionSet = transition.I;
                        if (transitionSet == null) {
                            break;
                        }
                        transition = transitionSet;
                    }
                    GhostListener ghostListener = new GhostListener();
                    ghostListener.a = view2;
                    ghostListener.b = addGhost;
                    transition.a(ghostListener);
                    if (z3) {
                        View view3 = transitionValues.b;
                        if (view3 != transitionValues2.b) {
                            view3.setTransitionAlpha(f2);
                        }
                        view2.setTransitionAlpha(f);
                        return ofPropertyValuesHolder;
                    }
                }
            } else if (!z3) {
                viewGroup2.endViewTransition(transitionValues.b);
            }
            return ofPropertyValuesHolder;
        }
        z = false;
        z2 = z;
        matrix = (Matrix) hashMap.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
        }
        matrix2 = (Matrix) hashMap.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
        }
        if (z2) {
        }
        matrix3 = (Matrix) hashMap.get("android:changeTransform:matrix");
        matrix4 = (Matrix) hashMap2.get("android:changeTransform:matrix");
        if (matrix3 == null) {
        }
        if (matrix4 == null) {
        }
        if (matrix3.equals(matrix4)) {
        }
        z3 = n0;
        if (!z2) {
        }
        if (!z3) {
        }
        return ofPropertyValuesHolder;
    }
}
