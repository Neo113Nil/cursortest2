package xsna;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.log.L;

/* compiled from: ClipsTemplateEditorCropperItemRangeBorderAlphaTransformer.kt */
/* loaded from: classes16.dex */
public final class v6f implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void transformPage(View view, float f) {
        w6f w6fVar = view instanceof w6f ? (w6f) view : null;
        if (w6fVar != null) {
            if (-0.999f > f || f > 0.999f) {
                w6fVar.setVideoTimelinePaintBorderAlpha(0);
                return;
            }
            float f2 = 255;
            int g = swe0.g((int) (f2 - (Math.abs(f) * f2)), 0, 255);
            int i = 255 - g >= 3 ? g : 255;
            w6fVar.setVideoTimelinePaintBorderAlpha(i);
            L.e("ClipsTemplateEditorCropperItemRangeBorderAlphaTransformer", "adapterPos=" + w6fVar.getCropperIndex() + " position=" + f + " borderAlpha=" + i);
        }
    }
}
