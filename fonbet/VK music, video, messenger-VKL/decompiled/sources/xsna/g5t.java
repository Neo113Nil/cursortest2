package xsna;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: GalleryQrBordersViewImpl.kt */
/* loaded from: classes5.dex */
public final class g5t extends gne0 {
    public List<? extends Point> n;
    public int o;

    @Override // xsna.gne0, xsna.fne0
    public List<Point> getCorners() {
        return this.n;
    }

    @Override // xsna.gne0, xsna.fne0
    public int getSelectedBarcodeIndex() {
        return this.o;
    }

    @Override // xsna.gne0, android.view.View
    public final void onDraw(Canvas canvas) {
        float height = getLeftBottomCorner().getHeight();
        int size = getCorners().size();
        for (int i = 0; i < size; i++) {
            int i2 = i / 4;
            Point point = getCorners().get(i);
            getCornerMatrix().reset();
            getCornerMatrix().preRotate(i * 90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height);
            getCornerMatrix().postTranslate(point.x, point.y - getLeftBottomCorner().getHeight());
            canvas.drawBitmap(i2 == getSelectedBarcodeIndex() ? getLeftBottomCornerSelected() : getLeftBottomCorner(), getCornerMatrix(), getPaint());
        }
    }

    @Override // xsna.gne0, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // xsna.gne0, xsna.fne0
    public void setCorners(List<? extends Point> list) {
        this.n = list;
    }

    @Override // xsna.gne0, xsna.fne0
    public void setSelectedBarcodeIndex(int i) {
        this.o = i;
    }
}
