package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.g8e;

/* loaded from: classes10.dex */
class TransitionUtils {

    public static class Api28Impl {
    }

    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {
        final float[] mTempStartValues = new float[9];
        final float[] mTempEndValues = new float[9];
        final Matrix mTempMatrix = new Matrix();

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.mTempStartValues);
            matrix2.getValues(this.mTempEndValues);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mTempEndValues;
                float f2 = fArr[i];
                float f3 = this.mTempStartValues[i];
                fArr[i] = g8e.b(f2, f3, f, f3);
            }
            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ImageView a(ViewGroup viewGroup, View view, View view2) {
        int i;
        ViewGroup viewGroup2;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        Property property = ViewUtils.a;
        view.transformMatrixToGlobal(matrix);
        viewGroup.transformMatrixToLocal(matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean isAttachedToWindow = view.isAttachedToWindow();
        boolean isAttachedToWindow2 = viewGroup.isAttachedToWindow();
        Bitmap bitmap = null;
        if (!isAttachedToWindow) {
            if (isAttachedToWindow2) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view);
                androidx.core.view.b.b(view, viewGroup);
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
}
