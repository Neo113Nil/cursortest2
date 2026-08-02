package xsna;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class mf01 {
    public final Rect a = new Rect();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final com.google.android.gms.cast.framework.internal.featurehighlight.c f;

    public mf01(com.google.android.gms.cast.framework.internal.featurehighlight.c cVar) {
        this.f = cVar;
        Resources resources = cVar.getResources();
        this.b = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.c = resources.getDimensionPixelOffset(R.dimen.cast_libraries_material_featurehighlight_inner_margin);
        this.d = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_max_width);
        this.e = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_horizontal_offset);
    }

    public final int a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = i4 - i;
        int i6 = i2 - i4;
        int i7 = i4 - (i3 / 2);
        int i8 = this.e;
        int i9 = i5 <= i6 ? i7 + i8 : i7 - i8;
        int i10 = marginLayoutParams.leftMargin;
        if (i9 - i10 < i) {
            return i + i10;
        }
        int i11 = marginLayoutParams.rightMargin;
        return (i9 + i3) + i11 > i2 ? (i2 - i3) - i11 : i9;
    }

    public final void b(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.d), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }
}
