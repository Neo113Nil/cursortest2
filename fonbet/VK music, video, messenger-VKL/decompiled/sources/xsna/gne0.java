package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: QrBordersViewImpl.kt */
/* loaded from: classes5.dex */
public class gne0 extends fne0 {
    public Bitmap c;
    public Bitmap d;
    public final Paint e;
    public final Matrix f;
    public int g;
    public float h;
    public float i;
    public final int j;
    public boolean k;
    public List<? extends Point> l;
    public boolean m;

    public gne0(Context context) {
        super(context, null, 0);
        this.e = new Paint();
        this.f = new Matrix();
        this.g = -1;
        this.j = iah0.a(48.0f);
        this.l = EmptyList.b;
        this.m = true;
        Drawable a = m33.a(R.drawable.qr_dynamic_corner, getContext());
        int intrinsicWidth = a.getIntrinsicWidth();
        int intrinsicHeight = a.getIntrinsicHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(this.c);
        a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        a.draw(canvas);
        Drawable a2 = m33.a(R.drawable.qr_dynamic_corner_selected, getContext());
        this.d = Bitmap.createBitmap(a.getIntrinsicWidth(), a.getIntrinsicHeight(), config);
        Canvas canvas2 = new Canvas(this.d);
        a2.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        a2.draw(canvas2);
    }

    public final int a(MotionEvent motionEvent) {
        float abs = Math.abs(motionEvent.getX() - this.h);
        float f = this.j;
        if (abs <= f && Math.abs(motionEvent.getY() - this.i) <= f) {
            int i = 0;
            int b = tyx.b(0, getCorners().size() - 1, 4);
            if (b >= 0) {
                while (!new Rect(getCorners().get(i).x, getCorners().get(i + 1).y, getCorners().get(i + 2).x, getCorners().get(i + 3).y).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    if (i != b) {
                        i += 4;
                    }
                }
                int i2 = i / 4;
                setSelectedBarcodeIndex(i2);
                invalidate();
                return i2;
            }
        }
        return -1;
    }

    public final Matrix getCornerMatrix() {
        return this.f;
    }

    @Override // xsna.fne0
    public List<Point> getCorners() {
        return this.l;
    }

    public final boolean getGoogleVisionMode() {
        return this.m;
    }

    public final Bitmap getLeftBottomCorner() {
        return this.c;
    }

    public final Bitmap getLeftBottomCornerSelected() {
        return this.d;
    }

    public final Paint getPaint() {
        return this.e;
    }

    public final boolean getQrSelected() {
        return this.k;
    }

    @Override // xsna.fne0
    public int getSelectedBarcodeIndex() {
        return this.g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = this.m;
        Paint paint = this.e;
        Matrix matrix = this.f;
        if (z) {
            float height = this.c.getHeight();
            int size = getCorners().size();
            for (int i = 0; i < size; i++) {
                int i2 = i / 4;
                Point point = getCorners().get(i);
                matrix.reset();
                matrix.preRotate(i * 90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height);
                matrix.postTranslate(point.x, point.y - this.c.getHeight());
                canvas.drawBitmap(i2 == getSelectedBarcodeIndex() ? this.d : this.c, matrix, paint);
            }
            return;
        }
        if (getCorners().size() < 4) {
            return;
        }
        float height2 = this.c.getHeight();
        Point point2 = getCorners().get(1);
        for (int i3 = 0; i3 < 4; i3++) {
            matrix.reset();
            matrix.preRotate(i3 * 90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height2);
            matrix.postTranslate(Math.min(Math.max(getCorners().get(i3).x - point2.x, 0), getMeasuredWidth()), Math.min(Math.max((getCorners().get(i3).y - point2.y) - this.c.getHeight(), -this.c.getHeight()), getMeasuredHeight()));
            canvas.drawBitmap(this.k ? this.d : this.c, matrix, paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.m) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (getCorners().size() < 4) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(getCorners().get(3).x - getCorners().get(0).x, getCorners().get(0).y - getCorners().get(1).y);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        izs<Integer, s3q0> onQrClicked;
        if (!this.m) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = motionEvent.getX();
            this.i = motionEvent.getY();
            return a(motionEvent) >= 0;
        }
        if (action != 1) {
            return false;
        }
        int a = a(motionEvent);
        if (a >= 0 && (onQrClicked = getOnQrClicked()) != null) {
            onQrClicked.invoke(Integer.valueOf(a));
        }
        setSelectedBarcodeIndex(-1);
        invalidate();
        return false;
    }

    @Override // xsna.fne0
    public void setCorners(List<? extends Point> list) {
        if (this.m) {
            this.l = list;
            setX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            setY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (list.size() == 4) {
            this.l = list;
            Point point = list.get(1);
            setX(point.x);
            setY(point.y);
        }
    }

    public final void setGoogleVisionMode(boolean z) {
        if (this.m != z) {
            this.m = z;
            requestLayout();
        }
    }

    public final void setLeftBottomCorner(Bitmap bitmap) {
        this.c = bitmap;
    }

    public final void setLeftBottomCornerSelected(Bitmap bitmap) {
        this.d = bitmap;
    }

    public final void setQrSelected(boolean z) {
        this.k = z;
    }

    @Override // xsna.fne0
    public void setSelectedBarcodeIndex(int i) {
        this.g = i;
    }
}
