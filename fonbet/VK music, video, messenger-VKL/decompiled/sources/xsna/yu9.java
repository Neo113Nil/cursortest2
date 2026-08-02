package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: classes13.dex */
public final class yu9 extends av9 {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu9(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.b = carouselLayoutManager;
    }

    @Override // xsna.av9
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.top;
        float f2 = rectF3.top;
        if (f < f2 && rectF2.bottom > f2) {
            float f3 = f2 - f;
            rectF.top += f3;
            rectF3.top += f3;
        }
        float f4 = rectF2.bottom;
        float f5 = rectF3.bottom;
        if (f4 <= f5 || rectF2.top >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
    }

    @Override // xsna.av9
    public final float b(RecyclerView.p pVar) {
        return ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // xsna.av9
    public final RectF c(float f, float f2, float f3, float f4) {
        return new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2, f - f3);
    }

    @Override // xsna.av9
    public final int d() {
        return this.b.getHeight();
    }

    @Override // xsna.av9
    public final int e() {
        return this.b.getHeight();
    }

    @Override // xsna.av9
    public final int f() {
        return this.b.getPaddingLeft();
    }

    @Override // xsna.av9
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    @Override // xsna.av9
    public final int h() {
        return 0;
    }

    @Override // xsna.av9
    public final int i() {
        return 0;
    }

    @Override // xsna.av9
    public final void j(int i, int i2, View view) {
        CarouselLayoutManager carouselLayoutManager = this.b;
        int paddingLeft = carouselLayoutManager.getPaddingLeft();
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        carouselLayoutManager.layoutDecoratedWithMargins(view, paddingLeft, i, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + paddingLeft, i2);
    }

    @Override // xsna.av9
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = floor;
            rectF.top = Math.min(rectF.top, floor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = ceil;
            rectF.bottom = Math.max(ceil, rectF.bottom);
        }
    }

    @Override // xsna.av9
    public final void l(View view, Rect rect, float f, float f2) {
        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
    }
}
