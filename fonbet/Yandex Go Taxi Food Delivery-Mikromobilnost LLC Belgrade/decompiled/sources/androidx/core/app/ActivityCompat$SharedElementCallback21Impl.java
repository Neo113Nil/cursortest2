package androidx.core.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
class ActivityCompat$SharedElementCallback21Impl extends SharedElementCallback {
    private final e1 mCallback;

    public ActivityCompat$SharedElementCallback21Impl(e1 e1Var) {
        this.mCallback = e1Var;
    }

    @Override // android.app.SharedElementCallback
    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Parcelable parcelable;
        int round;
        Bitmap bitmap;
        e1 e1Var = this.mCallback;
        e1Var.getClass();
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    parcelable = null;
                    bitmap = null;
                } else {
                    float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                    if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                        parcelable = null;
                    } else {
                        int i = (int) (intrinsicWidth * min);
                        int i2 = (int) (intrinsicHeight * min);
                        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Rect bounds = drawable.getBounds();
                        int i3 = bounds.left;
                        int i4 = bounds.top;
                        int i5 = bounds.right;
                        int i6 = bounds.bottom;
                        parcelable = null;
                        drawable.setBounds(0, 0, i, i2);
                        drawable.draw(canvas);
                        drawable.setBounds(i3, i4, i5, i6);
                        bitmap = createBitmap;
                    }
                }
                if (bitmap != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                    }
                    return bundle;
                }
                round = Math.round(rectF.width());
                int round2 = Math.round(rectF.height());
                if (round > 0 || round2 <= 0) {
                    return parcelable;
                }
                float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                int i7 = (int) (round * min2);
                int i8 = (int) (round2 * min2);
                if (e1Var.a == null) {
                    e1Var.a = new Matrix();
                }
                e1Var.a.set(matrix);
                e1Var.a.postTranslate(-rectF.left, -rectF.top);
                e1Var.a.postScale(min2, min2);
                Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.concat(e1Var.a);
                view.draw(canvas2);
                return createBitmap2;
            }
        }
        parcelable = null;
        round = Math.round(rectF.width());
        int round22 = Math.round(rectF.height());
        if (round > 0) {
        }
        return parcelable;
    }

    @Override // android.app.SharedElementCallback
    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        this.mCallback.getClass();
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
        if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
        }
        return imageView2;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        this.mCallback.getClass();
    }

    @Override // android.app.SharedElementCallback
    public void onRejectSharedElements(List<View> list) {
        this.mCallback.getClass();
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        this.mCallback.getClass();
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        this.mCallback.getClass();
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.mCallback.getClass();
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}
