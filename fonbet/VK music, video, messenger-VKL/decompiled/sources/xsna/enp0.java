package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TransitionUtils.java */
/* loaded from: classes12.dex */
public final class enp0 {

    /* compiled from: TransitionUtils.java */
    public static class a implements TypeEvaluator<Matrix> {
        public final float[] a = new float[9];
        public final float[] b = new float[9];
        public final Matrix c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.a;
            matrix.getValues(fArr);
            float[] fArr2 = this.b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = u11.b(f2, f3, f, f3);
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ImageView a(ViewGroup viewGroup, View view, View view2) {
        int i;
        ViewGroup viewGroup2;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        c2u0 c2u0Var = y1u0.a;
        c2u0Var.t(view, matrix);
        c2u0Var.u(viewGroup, matrix);
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean isAttachedToWindow = view.isAttachedToWindow();
        boolean z = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmap = null;
        if (!isAttachedToWindow) {
            if (z) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view);
                iut0.a(view, viewGroup);
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        i = 0;
        viewGroup2 = null;
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
            int round7 = Math.round(round5 * min);
            int round8 = Math.round(round6 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            Picture picture = new Picture();
            Canvas beginRecording = picture.beginRecording(round7, round8);
            beginRecording.concat(matrix);
            view.draw(beginRecording);
            picture.endRecording();
            bitmap = Bitmap.createBitmap(picture);
        }
        if (!isAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        if (bitmap != null) {
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    public static Animator b(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator, objectAnimator2);
        return animatorSet;
    }
}
