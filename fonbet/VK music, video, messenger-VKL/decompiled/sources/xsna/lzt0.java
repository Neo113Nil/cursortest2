package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libuilight.R$styleable;

/* compiled from: ViewPagerRatio.java */
/* loaded from: classes17.dex */
public class lzt0 extends ViewPager {
    public final float b;
    public final int c;

    public lzt0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.g);
        if (obtainStyledAttributes != null) {
            this.b = obtainStyledAttributes.getFloat(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.c = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.b;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int size = View.MeasureSpec.getSize(i);
            if (this.c != 0) {
                int min = (int) (Math.min(r2, (int) (size * f)) / f);
                int i3 = (size - min) / 2;
                setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
                i2 = View.MeasureSpec.makeMeasureSpec((int) (min * f), 1073741824);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }
}
