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
public final class zu9 extends av9 {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu9(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.b = carouselLayoutManager;
    }

    @Override // xsna.av9
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.left;
        float f2 = rectF3.left;
        if (f < f2 && rectF2.right > f2) {
            float f3 = f2 - f;
            rectF.left += f3;
            rectF2.left += f3;
        }
        float f4 = rectF2.right;
        float f5 = rectF3.right;
        if (f4 <= f5 || rectF2.left >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.right = Math.max(rectF.right - f6, rectF.left);
        rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
    }

    @Override // xsna.av9
    public final float b(RecyclerView.p pVar) {
        return ((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
    }

    @Override // xsna.av9
    public final RectF c(float f, float f2, float f3, float f4) {
        return new RectF(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - f4, f);
    }

    @Override // xsna.av9
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // xsna.av9
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.A()) {
            return 0;
        }
        return carouselLayoutManager.getWidth();
    }

    @Override // xsna.av9
    public final int f() {
        return 0;
    }

    @Override // xsna.av9
    public final int g() {
        return this.b.getWidth();
    }

    @Override // xsna.av9
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.A()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // xsna.av9
    public final int i() {
        return this.b.getPaddingTop();
    }

    @Override // xsna.av9
    public final void j(int i, int i2, View view) {
        CarouselLayoutManager carouselLayoutManager = this.b;
        int paddingTop = carouselLayoutManager.getPaddingTop();
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        carouselLayoutManager.layoutDecoratedWithMargins(view, i, paddingTop, i2, carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + paddingTop);
    }

    @Override // xsna.av9
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float floor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = floor;
            rectF.left = Math.min(rectF.left, floor);
        }
        if (rectF2.left >= rectF3.right) {
            float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = ceil;
            rectF.right = Math.max(ceil, rectF.right);
        }
    }

    @Override // xsna.av9
    public final void l(View view, Rect rect, float f, float f2) {
        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
    }
}
